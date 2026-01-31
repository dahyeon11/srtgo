package com.google.firebase.messaging;

import I2.AbstractC0608l;
import I2.C0609m;
import I2.InterfaceC0604h;
import I2.InterfaceC0607k;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FirebaseMessaging;
import i2.AbstractC5683p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l3.C5889a;
import r3.C6173a;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";

    /* renamed from: g */
    static m1.g f25753g;

    /* renamed from: a */
    private final Context f25754a;

    /* renamed from: b */
    private final l3.c f25755b;

    /* renamed from: c */
    private final FirebaseInstanceId f25756c;

    /* renamed from: d */
    private final a f25757d;

    /* renamed from: e */
    private final Executor f25758e;

    /* renamed from: f */
    private final AbstractC0608l f25759f;

    class a {

        /* renamed from: a */
        private final r3.d f25760a;

        /* renamed from: b */
        private boolean f25761b;

        /* renamed from: c */
        private r3.b f25762c;

        /* renamed from: d */
        private Boolean f25763d;

        a(r3.d dVar) {
            this.f25760a = dVar;
        }

        private Boolean f() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.f25755b.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void a() {
            try {
                if (this.f25761b) {
                    return;
                }
                Boolean boolF = f();
                this.f25763d = boolF;
                if (boolF == null) {
                    r3.b bVar = new r3.b(this) { // from class: com.google.firebase.messaging.p

                        /* renamed from: a, reason: collision with root package name */
                        private final FirebaseMessaging.a f25808a;

                        {
                            this.f25808a = this;
                        }

                        @Override // r3.b
                        public final void handle(C6173a c6173a) {
                            this.f25808a.d(c6173a);
                        }
                    };
                    this.f25762c = bVar;
                    this.f25760a.subscribe(C5889a.class, bVar);
                }
                this.f25761b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean b() {
            a();
            Boolean bool = this.f25763d;
            if (bool != null) {
                return bool.booleanValue();
            }
            return FirebaseMessaging.this.f25755b.isDataCollectionDefaultEnabled();
        }

        final /* synthetic */ void c() {
            FirebaseMessaging.this.f25756c.getToken();
        }

        final /* synthetic */ void d(C6173a c6173a) {
            if (b()) {
                FirebaseMessaging.this.f25758e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.r

                    /* renamed from: a, reason: collision with root package name */
                    private final FirebaseMessaging.a f25810a;

                    {
                        this.f25810a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25810a.c();
                    }
                });
            }
        }

        final /* synthetic */ void e() {
            FirebaseMessaging.this.f25756c.getToken();
        }

        synchronized void g(boolean z8) {
            try {
                a();
                r3.b bVar = this.f25762c;
                if (bVar != null) {
                    this.f25760a.unsubscribe(C5889a.class, bVar);
                    this.f25762c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f25755b.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z8);
                editorEdit.apply();
                if (z8) {
                    FirebaseMessaging.this.f25758e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.q

                        /* renamed from: a, reason: collision with root package name */
                        private final FirebaseMessaging.a f25809a;

                        {
                            this.f25809a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25809a.e();
                        }
                    });
                }
                this.f25763d = Boolean.valueOf(z8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    FirebaseMessaging(l3.c cVar, final FirebaseInstanceId firebaseInstanceId, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar, m1.g gVar, r3.d dVar) {
        try {
            int i8 = FirebaseInstanceIdReceiver.f25630b;
            f25753g = gVar;
            this.f25755b = cVar;
            this.f25756c = firebaseInstanceId;
            this.f25757d = new a(dVar);
            Context applicationContext = cVar.getApplicationContext();
            this.f25754a = applicationContext;
            ScheduledExecutorService scheduledExecutorServiceB = AbstractC5192i.b();
            this.f25758e = scheduledExecutorServiceB;
            scheduledExecutorServiceB.execute(new Runnable(this, firebaseInstanceId) { // from class: com.google.firebase.messaging.j

                /* renamed from: a, reason: collision with root package name */
                private final FirebaseMessaging f25800a;

                /* renamed from: b, reason: collision with root package name */
                private final FirebaseInstanceId f25801b;

                {
                    this.f25800a = this;
                    this.f25801b = firebaseInstanceId;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f25800a.f(this.f25801b);
                }
            });
            AbstractC0608l abstractC0608lF = H.f(cVar, firebaseInstanceId, new com.google.firebase.iid.r(applicationContext), interfaceC6416a, interfaceC6416a2, hVar, applicationContext, AbstractC5192i.e());
            this.f25759f = abstractC0608lF;
            abstractC0608lF.addOnSuccessListener(AbstractC5192i.f(), new InterfaceC0604h(this) { // from class: com.google.firebase.messaging.k

                /* renamed from: a, reason: collision with root package name */
                private final FirebaseMessaging f25802a;

                {
                    this.f25802a = this;
                }

                @Override // I2.InterfaceC0604h
                public final void onSuccess(Object obj) {
                    this.f25802a.g((H) obj);
                }
            });
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("FirebaseMessaging and FirebaseInstanceId versions not compatible. Update to latest version of firebase-messaging.");
        }
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(l3.c.getInstance());
    }

    public static m1.g getTransportFactory() {
        return f25753g;
    }

    final /* synthetic */ void d(C0609m c0609m) {
        try {
            this.f25756c.deleteToken(com.google.firebase.iid.r.getDefaultSenderId(this.f25755b), INSTANCE_ID_SCOPE);
            c0609m.setResult(null);
        } catch (Exception e8) {
            c0609m.setException(e8);
        }
    }

    public AbstractC0608l deleteToken() {
        final C0609m c0609m = new C0609m();
        AbstractC5192i.d().execute(new Runnable(this, c0609m) { // from class: com.google.firebase.messaging.m

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseMessaging f25804a;

            /* renamed from: b, reason: collision with root package name */
            private final C0609m f25805b;

            {
                this.f25804a = this;
                this.f25805b = c0609m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f25804a.d(this.f25805b);
            }
        });
        return c0609m.getTask();
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return x.a();
    }

    final /* synthetic */ void f(FirebaseInstanceId firebaseInstanceId) {
        if (this.f25757d.b()) {
            firebaseInstanceId.getToken();
        }
    }

    final /* synthetic */ void g(H h8) {
        if (isAutoInitEnabled()) {
            h8.q();
        }
    }

    public AbstractC0608l getToken() {
        return this.f25756c.getInstanceId().continueWith(l.f25803a);
    }

    public boolean isAutoInitEnabled() {
        return this.f25757d.b();
    }

    public void send(z zVar) {
        if (TextUtils.isEmpty(zVar.getTo())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f25754a, 0, intent2, 0));
        intent.setPackage("com.google.android.gms");
        zVar.c(intent);
        this.f25754a.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z8) {
        this.f25757d.g(z8);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z8) {
        x.v(z8);
    }

    public AbstractC0608l subscribeToTopic(final String str) {
        return this.f25759f.onSuccessTask(new InterfaceC0607k(str) { // from class: com.google.firebase.messaging.n

            /* renamed from: a, reason: collision with root package name */
            private final String f25806a;

            {
                this.f25806a = str;
            }

            @Override // I2.InterfaceC0607k
            public final AbstractC0608l then(Object obj) {
                return ((H) obj).r(this.f25806a);
            }
        });
    }

    public AbstractC0608l unsubscribeFromTopic(final String str) {
        return this.f25759f.onSuccessTask(new InterfaceC0607k(str) { // from class: com.google.firebase.messaging.o

            /* renamed from: a, reason: collision with root package name */
            private final String f25807a;

            {
                this.f25807a = str;
            }

            @Override // I2.InterfaceC0607k
            public final AbstractC0608l then(Object obj) {
                return ((H) obj).u(this.f25807a);
            }
        });
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(l3.c cVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) cVar.get(FirebaseMessaging.class);
        AbstractC5683p.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }
}
