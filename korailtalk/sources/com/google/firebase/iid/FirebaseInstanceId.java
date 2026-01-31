package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.InterfaceC0599c;
import I2.InterfaceC0602f;
import I2.InterfaceC0607k;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.iid.v;
import com.google.firebase.iid.x;
import i2.AbstractC5683p;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import u3.InterfaceC6416a;

@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {

    /* renamed from: i */
    private static x f25620i;

    /* renamed from: k */
    static ScheduledExecutorService f25622k;

    /* renamed from: a */
    final Executor f25623a;

    /* renamed from: b */
    private final l3.c f25624b;

    /* renamed from: c */
    private final r f25625c;

    /* renamed from: d */
    private final o f25626d;

    /* renamed from: e */
    private final v f25627e;

    /* renamed from: f */
    private final com.google.firebase.installations.h f25628f;

    /* renamed from: g */
    private boolean f25629g;

    /* renamed from: h */
    private static final long f25619h = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static final Pattern f25621j = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(l3.c cVar, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar) {
        this(cVar, new r(cVar.getApplicationContext()), h.b(), h.b(), interfaceC6416a, interfaceC6416a2, hVar);
    }

    private Object a(AbstractC0608l abstractC0608l) throws IOException {
        try {
            return AbstractC0611o.await(abstractC0608l, H0.y.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException(o.ERROR_SERVICE_NOT_AVAILABLE);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    u();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e8);
        }
    }

    private static Object b(AbstractC0608l abstractC0608l) throws InterruptedException {
        AbstractC5683p.checkNotNull(abstractC0608l, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC0608l.addOnCompleteListener(j.f25648a, new InterfaceC0602f(countDownLatch) { // from class: com.google.firebase.iid.k

            /* renamed from: a, reason: collision with root package name */
            private final CountDownLatch f25649a;

            {
                this.f25649a = countDownLatch;
            }

            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l2) {
                this.f25649a.countDown();
            }
        });
        countDownLatch.await(H0.y.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        return i(abstractC0608l);
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        try {
            ScheduledExecutorService scheduledExecutorService = f25622k;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            f25622k = null;
            f25620i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void d(l3.c cVar) {
        AbstractC5683p.checkNotEmpty(cVar.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        AbstractC5683p.checkNotEmpty(cVar.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        AbstractC5683p.checkNotEmpty(cVar.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        AbstractC5683p.checkArgument(o(cVar.getOptions().getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5683p.checkArgument(n(cVar.getOptions().getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(l3.c.getInstance());
    }

    private AbstractC0608l h(final String str, String str2) {
        final String strT = t(str2);
        return AbstractC0611o.forResult(null).continueWithTask(this.f25623a, new InterfaceC0599c(this, str, strT) { // from class: com.google.firebase.iid.i

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f25645a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25646b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25647c;

            {
                this.f25645a = this;
                this.f25646b = str;
                this.f25647c = strT;
            }

            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l) {
                return this.f25645a.s(this.f25646b, this.f25647c, abstractC0608l);
            }
        });
    }

    private static Object i(AbstractC0608l abstractC0608l) {
        if (abstractC0608l.isSuccessful()) {
            return abstractC0608l.getResult();
        }
        if (abstractC0608l.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC0608l.isComplete()) {
            throw new IllegalStateException(abstractC0608l.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    private String j() {
        return l3.c.DEFAULT_APP_NAME.equals(this.f25624b.getName()) ? "" : this.f25624b.getPersistenceKey();
    }

    static boolean m() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    static boolean n(String str) {
        return f25621j.matcher(str).matches();
    }

    static boolean o(String str) {
        return str.contains(":");
    }

    private static String t(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private void x() {
        if (z(k())) {
            w();
        }
    }

    String c() {
        return getToken(r.getDefaultSenderId(this.f25624b), "*");
    }

    @Deprecated
    public void deleteInstanceId() throws IOException {
        d(this.f25624b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        a(this.f25628f.delete());
        u();
    }

    @Deprecated
    public void deleteToken(String str, String str2) throws IOException {
        d(this.f25624b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String strT = t(str2);
        a(this.f25626d.deleteToken(g(), str, strT));
        f25620i.deleteToken(j(), str, strT);
    }

    void e(Runnable runnable, long j8) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f25622k == null) {
                    f25622k = new ScheduledThreadPoolExecutor(1, new p2.b("FirebaseInstanceId"));
                }
                f25622k.schedule(runnable, j8, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    l3.c f() {
        return this.f25624b;
    }

    String g() {
        try {
            f25620i.setCreationTime(this.f25624b.getPersistenceKey());
            return (String) b(this.f25628f.getId());
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public long getCreationTime() {
        return f25620i.getCreationTime(this.f25624b.getPersistenceKey());
    }

    @Deprecated
    public String getId() {
        d(this.f25624b);
        x();
        return g();
    }

    @Deprecated
    public AbstractC0608l getInstanceId() {
        d(this.f25624b);
        return h(r.getDefaultSenderId(this.f25624b), "*");
    }

    @Deprecated
    public String getToken() {
        d(this.f25624b);
        x.a aVarK = k();
        if (z(aVarK)) {
            w();
        }
        return x.a.b(aVarK);
    }

    @VisibleForTesting
    public boolean isFcmAutoInitEnabled() {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.f25625c.isGmscorePresent();
    }

    x.a k() {
        return l(r.getDefaultSenderId(this.f25624b), "*");
    }

    x.a l(String str, String str2) {
        return f25620i.getToken(j(), str, str2);
    }

    final /* synthetic */ AbstractC0608l q(String str, String str2, String str3, String str4) {
        f25620i.saveToken(j(), str, str2, str4, this.f25625c.getAppVersionCode());
        return AbstractC0611o.forResult(new q(str3, str4));
    }

    final /* synthetic */ AbstractC0608l r(final String str, final String str2, final String str3) {
        return this.f25626d.getToken(str, str2, str3).onSuccessTask(this.f25623a, new InterfaceC0607k(this, str2, str3, str) { // from class: com.google.firebase.iid.m

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f25654a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25655b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25656c;

            /* renamed from: d, reason: collision with root package name */
            private final String f25657d;

            {
                this.f25654a = this;
                this.f25655b = str2;
                this.f25656c = str3;
                this.f25657d = str;
            }

            @Override // I2.InterfaceC0607k
            public final AbstractC0608l then(Object obj) {
                return this.f25654a.q(this.f25655b, this.f25656c, this.f25657d, (String) obj);
            }
        });
    }

    final /* synthetic */ AbstractC0608l s(final String str, final String str2, AbstractC0608l abstractC0608l) {
        final String strG = g();
        x.a aVarL = l(str, str2);
        return !z(aVarL) ? AbstractC0611o.forResult(new q(strG, aVarL.f25687a)) : this.f25627e.a(str, str2, new v.a(this, strG, str, str2) { // from class: com.google.firebase.iid.l

            /* renamed from: a, reason: collision with root package name */
            private final FirebaseInstanceId f25650a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25651b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25652c;

            /* renamed from: d, reason: collision with root package name */
            private final String f25653d;

            {
                this.f25650a = this;
                this.f25651b = strG;
                this.f25652c = str;
                this.f25653d = str2;
            }

            @Override // com.google.firebase.iid.v.a
            public final AbstractC0608l start() {
                return this.f25650a.r(this.f25651b, this.f25652c, this.f25653d);
            }
        });
    }

    @VisibleForTesting
    public void setFcmAutoInitEnabled(boolean z8) {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    synchronized void u() {
        f25620i.deleteAll();
    }

    synchronized void v(boolean z8) {
        this.f25629g = z8;
    }

    synchronized void w() {
        if (!this.f25629g) {
            y(0L);
        }
    }

    synchronized void y(long j8) {
        e(new y(this, Math.min(Math.max(30L, j8 << 1), f25619h)), j8);
        this.f25629g = true;
    }

    boolean z(x.a aVar) {
        return aVar == null || aVar.c(this.f25625c.getAppVersionCode());
    }

    @Keep
    public static FirebaseInstanceId getInstance(l3.c cVar) {
        d(cVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) cVar.get(FirebaseInstanceId.class);
        AbstractC5683p.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    FirebaseInstanceId(l3.c cVar, r rVar, Executor executor, Executor executor2, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar) {
        this.f25629g = false;
        if (r.getDefaultSenderId(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f25620i == null) {
                        f25620i = new x(cVar.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f25624b = cVar;
            this.f25625c = rVar;
            this.f25626d = new o(cVar, rVar, interfaceC6416a, interfaceC6416a2, hVar);
            this.f25623a = executor2;
            this.f25627e = new v(executor);
            this.f25628f = hVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    @Deprecated
    public String getToken(String str, String str2) throws IOException {
        d(this.f25624b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((p) a(h(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }
}
