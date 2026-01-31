package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.C0609m;
import I2.InterfaceC0602f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.E;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class E implements ServiceConnection {

    /* renamed from: a */
    private final Context f25611a;

    /* renamed from: b */
    private final Intent f25612b;

    /* renamed from: c */
    private final ScheduledExecutorService f25613c;

    /* renamed from: d */
    private final Queue f25614d;

    /* renamed from: e */
    private B f25615e;

    /* renamed from: f */
    private boolean f25616f;

    static class a {

        /* renamed from: a */
        final Intent f25617a;

        /* renamed from: b */
        private final C0609m f25618b = new C0609m();

        a(Intent intent) {
            this.f25617a = intent;
        }

        void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.firebase.iid.C

                /* renamed from: a, reason: collision with root package name */
                private final E.a f25609a;

                {
                    this.f25609a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f25609a.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().addOnCompleteListener(scheduledExecutorService, new InterfaceC0602f(scheduledFutureSchedule) { // from class: com.google.firebase.iid.D

                /* renamed from: a, reason: collision with root package name */
                private final ScheduledFuture f25610a;

                {
                    this.f25610a = scheduledFutureSchedule;
                }

                @Override // I2.InterfaceC0602f
                public final void onComplete(AbstractC0608l abstractC0608l) {
                    this.f25610a.cancel(false);
                }
            });
        }

        public void b() {
            this.f25618b.trySetResult(null);
        }

        AbstractC0608l c() {
            return this.f25618b.getTask();
        }

        final /* synthetic */ void d() {
            String action = this.f25617a.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
            sb.append("Service took too long to process intent: ");
            sb.append(action);
            sb.append(" App may get closed.");
            Log.w("FirebaseInstanceId", sb.toString());
            b();
        }
    }

    public E(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new p2.b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f25614d.isEmpty()) {
            ((a) this.f25614d.poll()).b();
        }
    }

    private synchronized void b() {
        try {
            Log.isLoggable("FirebaseInstanceId", 3);
            while (!this.f25614d.isEmpty()) {
                Log.isLoggable("FirebaseInstanceId", 3);
                B b9 = this.f25615e;
                if (b9 == null || !b9.isBinderAlive()) {
                    c();
                    return;
                } else {
                    Log.isLoggable("FirebaseInstanceId", 3);
                    this.f25615e.b((a) this.f25614d.poll());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            boolean z8 = !this.f25616f;
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(z8);
        }
        if (this.f25616f) {
            return;
        }
        this.f25616f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", e8);
        }
        if (n2.b.getInstance().bindService(this.f25611a, this.f25612b, this, 65)) {
            return;
        }
        Log.e("FirebaseInstanceId", "binding to the service failed");
        this.f25616f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(strValueOf);
            }
            this.f25616f = false;
            if (iBinder instanceof B) {
                this.f25615e = (B) iBinder;
                b();
                return;
            }
            String strValueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(strValueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
        }
        b();
    }

    public synchronized AbstractC0608l sendIntent(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseInstanceId", 3);
        aVar = new a(intent);
        aVar.a(this.f25613c);
        this.f25614d.add(aVar);
        b();
        return aVar.c();
    }

    E(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f25614d = new ArrayDeque();
        this.f25616f = false;
        Context applicationContext = context.getApplicationContext();
        this.f25611a = applicationContext;
        this.f25612b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f25613c = scheduledExecutorService;
    }
}
