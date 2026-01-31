package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import c.InterfaceC1086a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;

    /* renamed from: d, reason: collision with root package name */
    private static String f8887d;

    /* renamed from: g, reason: collision with root package name */
    private static j f8890g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8891a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f8892b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8886c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set f8888e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f8889f = new Object();

    static class a {
        static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    static class b {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class c {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    static class d {
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    static class e {
        static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    static class f {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    private static class h implements k {

        /* renamed from: a, reason: collision with root package name */
        final String f8896a;

        /* renamed from: b, reason: collision with root package name */
        final int f8897b;

        /* renamed from: c, reason: collision with root package name */
        final String f8898c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f8899d;

        h(String str, int i8, String str2, Notification notification) {
            this.f8896a = str;
            this.f8897b = i8;
            this.f8898c = str2;
            this.f8899d = notification;
        }

        @Override // androidx.core.app.w.k
        public void send(InterfaceC1086a interfaceC1086a) {
            interfaceC1086a.notify(this.f8896a, this.f8897b, this.f8898c, this.f8899d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f8896a + ", id:" + this.f8897b + ", tag:" + this.f8898c + "]";
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f8900a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f8901b;

        i(ComponentName componentName, IBinder iBinder) {
            this.f8900a = componentName;
            this.f8901b = iBinder;
        }
    }

    private static class j implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8902a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f8903b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f8904c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f8905d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private Set f8906e = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f8907a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC1086a f8909c;

            /* renamed from: b, reason: collision with root package name */
            boolean f8908b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque f8910d = new ArrayDeque();

            /* renamed from: e, reason: collision with root package name */
            int f8911e = 0;

            a(ComponentName componentName) {
                this.f8907a = componentName;
            }
        }

        j(Context context) {
            this.f8902a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f8903b = handlerThread;
            handlerThread.start();
            this.f8904c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f8908b) {
                return true;
            }
            boolean zBindService = this.f8902a.bindService(new Intent(w.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f8907a), this, 33);
            aVar.f8908b = zBindService;
            if (zBindService) {
                aVar.f8911e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f8907a);
                this.f8902a.unbindService(this);
            }
            return aVar.f8908b;
        }

        private void b(a aVar) {
            if (aVar.f8908b) {
                this.f8902a.unbindService(this);
                aVar.f8908b = false;
            }
            aVar.f8909c = null;
        }

        private void c(k kVar) {
            i();
            for (a aVar : this.f8905d.values()) {
                aVar.f8910d.add(kVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f8905d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f8905d.get(componentName);
            if (aVar != null) {
                aVar.f8909c = InterfaceC1086a.AbstractBinderC0190a.asInterface(iBinder);
                aVar.f8911e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f8905d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f8907a);
                sb.append(", ");
                sb.append(aVar.f8910d.size());
                sb.append(" queued tasks");
            }
            if (aVar.f8910d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f8909c == null) {
                h(aVar);
                return;
            }
            while (true) {
                k kVar = (k) aVar.f8910d.peek();
                if (kVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending task ");
                        sb2.append(kVar);
                    }
                    kVar.send(aVar.f8909c);
                    aVar.f8910d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Remote service has died: ");
                        sb3.append(aVar.f8907a);
                    }
                } catch (RemoteException e8) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f8907a, e8);
                }
            }
            if (aVar.f8910d.isEmpty()) {
                return;
            }
            h(aVar);
        }

        private void h(a aVar) {
            if (this.f8904c.hasMessages(3, aVar.f8907a)) {
                return;
            }
            int i8 = aVar.f8911e;
            int i9 = i8 + 1;
            aVar.f8911e = i9;
            if (i9 <= 6) {
                int i10 = (1 << i8) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling retry for ");
                    sb.append(i10);
                    sb.append(" ms");
                }
                this.f8904c.sendMessageDelayed(this.f8904c.obtainMessage(3, aVar.f8907a), i10);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f8910d.size() + " tasks to " + aVar.f8907a + " after " + aVar.f8911e + " retries");
            aVar.f8910d.clear();
        }

        private void i() {
            Set<String> enabledListenerPackages = w.getEnabledListenerPackages(this.f8902a);
            if (enabledListenerPackages.equals(this.f8906e)) {
                return;
            }
            this.f8906e = enabledListenerPackages;
            List<ResolveInfo> listQueryIntentServices = this.f8902a.getPackageManager().queryIntentServices(new Intent().setAction(w.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f8905d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding listener record for ");
                        sb.append(componentName2);
                    }
                    this.f8905d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f8905d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Removing listener record for ");
                        sb2.append(entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 0) {
                c((k) message.obj);
                return true;
            }
            if (i8 == 1) {
                i iVar = (i) message.obj;
                e(iVar.f8900a, iVar.f8901b);
                return true;
            }
            if (i8 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i8 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f8904c.obtainMessage(1, new i(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f8904c.obtainMessage(2, componentName).sendToTarget();
        }

        public void queueTask(k kVar) {
            this.f8904c.obtainMessage(0, kVar).sendToTarget();
        }
    }

    private interface k {
        void send(InterfaceC1086a interfaceC1086a);
    }

    private w(Context context) {
        this.f8891a = context;
        this.f8892b = (NotificationManager) context.getSystemService("notification");
    }

    private void a(k kVar) {
        synchronized (f8889f) {
            try {
                if (f8890g == null) {
                    f8890g = new j(this.f8891a.getApplicationContext());
                }
                f8890g.queueTask(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean b(Notification notification) {
        Bundle extras = r.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public static w from(Context context) {
        return new w(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f8886c) {
            if (string != null) {
                try {
                    if (!string.equals(f8887d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f8888e = hashSet;
                        f8887d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f8888e;
        }
        return set;
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.f8892b);
    }

    public boolean canUseFullScreenIntent() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 29) {
            return true;
        }
        return i8 < 34 ? this.f8891a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : f.a(this.f8892b);
    }

    public void cancel(int i8) {
        cancel(null, i8);
    }

    public void cancelAll() {
        this.f8892b.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(this.f8892b, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.b(this.f8892b, notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.c(this.f8892b, list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<p> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        c.c(this.f8892b, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.d(this.f8892b, list);
        }
    }

    public void createNotificationChannelsCompat(List<n> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        c.d(this.f8892b, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.e(this.f8892b, str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.f(this.f8892b, str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = c.k(this.f8892b).iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelA = o.a(it.next());
                if (!collection.contains(c.g(notificationChannelA)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(notificationChannelA)))) {
                    c.e(this.f8892b, c.g(notificationChannelA));
                }
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.f8892b);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.f8892b);
    }

    public int getImportance() {
        return b.b(this.f8892b);
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.i(this.f8892b, str);
        }
        return null;
    }

    public n getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new n(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            return d.a(this.f8892b, str);
        }
        if (i8 >= 26) {
            Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = v.a(it.next());
                if (c.h(notificationChannelGroupA).equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public p getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new p(notificationChannelGroup2);
            }
            return null;
        }
        if (i8 < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        }
        return new p(notificationChannelGroup, getNotificationChannels());
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Build.VERSION.SDK_INT >= 26 ? c.j(this.f8892b) : Collections.emptyList();
    }

    public List<p> getNotificationChannelGroupsCompat() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                List<NotificationChannel> listEmptyList = i8 >= 28 ? Collections.emptyList() : getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupA = v.a(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new p(notificationChannelGroupA));
                    } else {
                        arrayList.add(new p(notificationChannelGroupA, listEmptyList));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26 ? c.k(this.f8892b) : Collections.emptyList();
    }

    public List<n> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n(o.a(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i8, Notification notification) {
        notify(null, i8, notification);
    }

    public void cancel(String str, int i8) {
        this.f8892b.cancel(str, i8);
    }

    public void notify(String str, int i8, Notification notification) {
        if (!b(notification)) {
            this.f8892b.notify(str, i8, notification);
        } else {
            a(new h(this.f8891a.getPackageName(), i8, str, notification));
            this.f8892b.cancel(str, i8);
        }
    }

    public void createNotificationChannel(n nVar) {
        createNotificationChannel(nVar.a());
    }

    public void createNotificationChannelGroup(p pVar) {
        createNotificationChannelGroup(pVar.b());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.a(this.f8892b, str, str2);
        }
        return getNotificationChannel(str);
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        final String f8893a;

        /* renamed from: b, reason: collision with root package name */
        final int f8894b;

        /* renamed from: c, reason: collision with root package name */
        Notification f8895c;

        public g(String str, int i8, Notification notification) {
            this.f8893a = str;
            this.f8894b = i8;
            this.f8895c = notification;
        }

        public g(int i8, Notification notification) {
            this(null, i8, notification);
        }
    }

    public n getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new n(notificationChannel);
    }

    public void notify(List<g> list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            g gVar = list.get(i8);
            notify(gVar.f8893a, gVar.f8894b, gVar.f8895c);
        }
    }
}
