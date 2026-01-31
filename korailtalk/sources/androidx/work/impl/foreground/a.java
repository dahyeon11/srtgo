package androidx.work.impl.foreground;

import H0.g;
import H0.l;
import I0.i;
import L0.c;
import L0.d;
import P0.r;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class a implements c, I0.b {

    /* renamed from: k, reason: collision with root package name */
    static final String f11215k = l.tagWithPrefix("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private Context f11216a;

    /* renamed from: b, reason: collision with root package name */
    private i f11217b;

    /* renamed from: c, reason: collision with root package name */
    private final R0.a f11218c;

    /* renamed from: d, reason: collision with root package name */
    final Object f11219d = new Object();

    /* renamed from: e, reason: collision with root package name */
    String f11220e;

    /* renamed from: f, reason: collision with root package name */
    final Map f11221f;

    /* renamed from: g, reason: collision with root package name */
    final Map f11222g;

    /* renamed from: h, reason: collision with root package name */
    final Set f11223h;

    /* renamed from: i, reason: collision with root package name */
    final d f11224i;

    /* renamed from: j, reason: collision with root package name */
    private b f11225j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0180a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f11226a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11227b;

        RunnableC0180a(WorkDatabase workDatabase, String str) {
            this.f11226a = workDatabase;
            this.f11227b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            r workSpec = this.f11226a.workSpecDao().getWorkSpec(this.f11227b);
            if (workSpec == null || !workSpec.hasConstraints()) {
                return;
            }
            synchronized (a.this.f11219d) {
                a.this.f11222g.put(this.f11227b, workSpec);
                a.this.f11223h.add(workSpec);
                a aVar = a.this;
                aVar.f11224i.replace(aVar.f11223h);
            }
        }
    }

    interface b {
        void cancelNotification(int i8);

        void notify(int i8, Notification notification);

        void startForeground(int i8, int i9, Notification notification);

        void stop();
    }

    a(Context context) {
        this.f11216a = context;
        i iVar = i.getInstance(context);
        this.f11217b = iVar;
        R0.a workTaskExecutor = iVar.getWorkTaskExecutor();
        this.f11218c = workTaskExecutor;
        this.f11220e = null;
        this.f11221f = new LinkedHashMap();
        this.f11223h = new HashSet();
        this.f11222g = new HashMap();
        this.f11224i = new d(this.f11216a, workTaskExecutor, this);
        this.f11217b.getProcessor().addExecutionListener(this);
    }

    private void a(Intent intent) {
        l.get().info(f11215k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f11217b.cancelWorkById(UUID.fromString(stringExtra));
    }

    private void b(Intent intent) {
        int foregroundServiceType = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.get().debug(f11215k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f11225j == null) {
            return;
        }
        this.f11221f.put(stringExtra, new g(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f11220e)) {
            this.f11220e = stringExtra;
            this.f11225j.startForeground(intExtra, intExtra2, notification);
            return;
        }
        this.f11225j.notify(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f11221f.entrySet().iterator();
        while (it.hasNext()) {
            foregroundServiceType |= ((g) ((Map.Entry) it.next()).getValue()).getForegroundServiceType();
        }
        g gVar = (g) this.f11221f.get(this.f11220e);
        if (gVar != null) {
            this.f11225j.startForeground(gVar.getNotificationId(), foregroundServiceType, gVar.getNotification());
        }
    }

    private void c(Intent intent) {
        l.get().info(f11215k, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f11218c.executeOnBackgroundThread(new RunnableC0180a(this.f11217b.getWorkDatabase(), stringExtra));
    }

    public static Intent createCancelWorkIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse(String.format("workspec://%s", str)));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent createNotifyIntent(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", gVar.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent createStartForegroundIntent(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", gVar.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent createStopForegroundIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    void d(Intent intent) {
        l.get().info(f11215k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f11225j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void e() {
        this.f11225j = null;
        synchronized (this.f11219d) {
            this.f11224i.reset();
        }
        this.f11217b.getProcessor().removeExecutionListener(this);
    }

    void f(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            c(intent);
            b(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            b(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            a(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            d(intent);
        }
    }

    void g(b bVar) {
        if (this.f11225j != null) {
            l.get().error(f11215k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f11225j = bVar;
        }
    }

    @Override // L0.c
    public void onAllConstraintsMet(List<String> list) {
    }

    @Override // L0.c
    public void onAllConstraintsNotMet(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            l.get().debug(f11215k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f11217b.stopForegroundWork(str);
        }
    }

    @Override // I0.b
    public void onExecuted(String str, boolean z8) {
        Map.Entry entry;
        synchronized (this.f11219d) {
            try {
                r rVar = (r) this.f11222g.remove(str);
                if (rVar != null ? this.f11223h.remove(rVar) : false) {
                    this.f11224i.replace(this.f11223h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f11221f.remove(str);
        if (str.equals(this.f11220e) && this.f11221f.size() > 0) {
            Iterator it = this.f11221f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f11220e = (String) entry.getKey();
            if (this.f11225j != null) {
                g gVar2 = (g) entry.getValue();
                this.f11225j.startForeground(gVar2.getNotificationId(), gVar2.getForegroundServiceType(), gVar2.getNotification());
                this.f11225j.cancelNotification(gVar2.getNotificationId());
            }
        }
        b bVar = this.f11225j;
        if (gVar == null || bVar == null) {
            return;
        }
        l.get().debug(f11215k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVar.getNotificationId()), str, Integer.valueOf(gVar.getForegroundServiceType())), new Throwable[0]);
        bVar.cancelNotification(gVar.getNotificationId());
    }
}
