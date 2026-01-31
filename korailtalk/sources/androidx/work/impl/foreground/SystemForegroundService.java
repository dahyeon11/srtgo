package androidx.work.impl.foreground;

import H0.l;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ServiceC1027p;
import androidx.work.impl.foreground.a;

/* loaded from: classes.dex */
public class SystemForegroundService extends ServiceC1027p implements a.b {

    /* renamed from: f */
    private static final String f11200f = l.tagWithPrefix("SystemFgService");

    /* renamed from: g */
    private static SystemForegroundService f11201g = null;

    /* renamed from: b */
    private Handler f11202b;

    /* renamed from: c */
    private boolean f11203c;

    /* renamed from: d */
    androidx.work.impl.foreground.a f11204d;

    /* renamed from: e */
    NotificationManager f11205e;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11206a;

        /* renamed from: b */
        final /* synthetic */ Notification f11207b;

        /* renamed from: c */
        final /* synthetic */ int f11208c;

        a(int i8, Notification notification, int i9) {
            this.f11206a = i8;
            this.f11207b = notification;
            this.f11208c = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f11206a, this.f11207b, this.f11208c);
            } else {
                SystemForegroundService.this.startForeground(this.f11206a, this.f11207b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11210a;

        /* renamed from: b */
        final /* synthetic */ Notification f11211b;

        b(int i8, Notification notification) {
            this.f11210a = i8;
            this.f11211b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11205e.notify(this.f11210a, this.f11211b);
        }
    }

    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11213a;

        c(int i8) {
            this.f11213a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f11205e.cancel(this.f11213a);
        }
    }

    private void a() {
        this.f11202b = new Handler(Looper.getMainLooper());
        this.f11205e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f11204d = aVar;
        aVar.g(this);
    }

    public static SystemForegroundService getInstance() {
        return f11201g;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void cancelNotification(int i8) {
        this.f11202b.post(new c(i8));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void notify(int i8, Notification notification) {
        this.f11202b.post(new b(i8, notification));
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public void onCreate() {
        super.onCreate();
        f11201g = this;
        a();
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f11204d.e();
    }

    @Override // androidx.lifecycle.ServiceC1027p, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f11203c) {
            l.get().info(f11200f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f11204d.e();
            a();
            this.f11203c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f11204d.f(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void startForeground(int i8, int i9, Notification notification) {
        this.f11202b.post(new a(i8, notification, i9));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f11203c = true;
        l.get().debug(f11200f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f11201g = null;
        stopSelf();
    }
}
