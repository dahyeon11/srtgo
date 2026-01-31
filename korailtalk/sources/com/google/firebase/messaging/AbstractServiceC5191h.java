package com.google.firebase.messaging;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.C0609m;
import I2.InterfaceC0602f;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.B;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.messaging.h */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC5191h extends Service {
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = AbstractC5192i.c();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.h$a */
    class a implements B.a {
        a() {
        }

        @Override // com.google.firebase.iid.B.a
        public AbstractC0608l handle(Intent intent) {
            return AbstractServiceC5191h.this.b(intent);
        }
    }

    private void a(Intent intent) {
        if (intent != null) {
            com.google.firebase.iid.z.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i8 = this.runningTasks - 1;
                this.runningTasks = i8;
                if (i8 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC0608l b(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return AbstractC0611o.forResult(null);
        }
        final C0609m c0609m = new C0609m();
        this.executor.execute(new Runnable(this, intent, c0609m) { // from class: com.google.firebase.messaging.e

            /* renamed from: a, reason: collision with root package name */
            private final AbstractServiceC5191h f25793a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f25794b;

            /* renamed from: c, reason: collision with root package name */
            private final C0609m f25795c;

            {
                this.f25793a = this;
                this.f25794b = intent;
                this.f25795c = c0609m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f25793a.lambda$processIntent$0$EnhancedIntentService(this.f25794b, this.f25795c);
            }
        });
        return c0609m.getTask();
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, AbstractC0608l abstractC0608l) {
        a(intent);
    }

    final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, C0609m c0609m) {
        try {
            handleIntent(intent);
        } finally {
            c0609m.setResult(null);
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.binder == null) {
                this.binder = new com.google.firebase.iid.B(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i8, int i9) {
        synchronized (this.lock) {
            this.lastStartId = i9;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        AbstractC0608l abstractC0608lB = b(startCommandIntent);
        if (abstractC0608lB.isComplete()) {
            a(intent);
            return 2;
        }
        abstractC0608lB.addOnCompleteListener(ExecutorC5189f.f25796a, new InterfaceC0602f(this, intent) { // from class: com.google.firebase.messaging.g

            /* renamed from: a, reason: collision with root package name */
            private final AbstractServiceC5191h f25797a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f25798b;

            {
                this.f25797a = this;
                this.f25798b = intent;
            }

            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l) {
                this.f25797a.lambda$onStartCommand$1$EnhancedIntentService(this.f25798b, abstractC0608l);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i8) {
        return stopSelfResult(i8);
    }
}
