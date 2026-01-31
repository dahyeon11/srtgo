package com.google.firebase.installations;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.C0609m;
import android.text.TextUtils;
import com.google.firebase.installations.i;
import i2.AbstractC5683p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import s3.InterfaceC6215c;
import w3.AbstractC6465d;
import w3.AbstractC6466e;
import w3.C6464c;

/* loaded from: classes2.dex */
public class g implements h {

    /* renamed from: l, reason: collision with root package name */
    private static final Object f25712l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadFactory f25713m = new a();

    /* renamed from: a, reason: collision with root package name */
    private final l3.c f25714a;

    /* renamed from: b, reason: collision with root package name */
    private final C6464c f25715b;

    /* renamed from: c, reason: collision with root package name */
    private final v3.c f25716c;

    /* renamed from: d, reason: collision with root package name */
    private final p f25717d;

    /* renamed from: e, reason: collision with root package name */
    private final v3.b f25718e;

    /* renamed from: f, reason: collision with root package name */
    private final n f25719f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f25720g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f25721h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f25722i;

    /* renamed from: j, reason: collision with root package name */
    private String f25723j;

    /* renamed from: k, reason: collision with root package name */
    private final List f25724k;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f25725a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f25725a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25726a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25727b;

        static {
            int[] iArr = new int[AbstractC6466e.b.values().length];
            f25727b = iArr;
            try {
                iArr[AbstractC6466e.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25727b[AbstractC6466e.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25727b[AbstractC6466e.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC6465d.b.values().length];
            f25726a = iArr2;
            try {
                iArr2[AbstractC6465d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25726a[AbstractC6465d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    g(l3.c cVar, y3.h hVar, InterfaceC6215c interfaceC6215c) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25713m), cVar, new C6464c(cVar.getApplicationContext(), hVar, interfaceC6215c), new v3.c(cVar), new p(), new v3.b(cVar), new n());
    }

    private AbstractC0608l b() {
        C0609m c0609m = new C0609m();
        d(new k(this.f25717d, c0609m));
        return c0609m.getTask();
    }

    private AbstractC0608l c() {
        C0609m c0609m = new C0609m();
        d(new l(c0609m));
        return c0609m.getTask();
    }

    private void d(o oVar) {
        synchronized (this.f25720g) {
            this.f25724k.add(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void e() throws i {
        x(null);
        v3.d dVarL = l();
        if (dVarL.isRegistered()) {
            this.f25715b.deleteFirebaseInstallation(i(), dVarL.getFirebaseInstallationId(), n(), dVarL.getRefreshToken());
        }
        o(dVarL.withNoGeneratedFid());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z8) {
        v3.d dVarU;
        v3.d dVarL = l();
        try {
            if (dVarL.isErrored() || dVarL.isUnregistered()) {
                dVarU = u(dVarL);
            } else {
                if (!z8 && !this.f25717d.isAuthTokenExpired(dVarL)) {
                    return;
                }
                dVarU = h(dVarL);
            }
            o(dVarU);
            if (dVarU.isRegistered()) {
                x(dVarU.getFirebaseInstallationId());
            }
            if (dVarU.isErrored()) {
                v(dVarU, new i(i.a.BAD_CONFIG));
            } else if (dVarU.isNotGenerated()) {
                v(dVarU, new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                w(dVarU);
            }
        } catch (i e8) {
            v(dVarL, e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean z8) {
        v3.d dVarM = m();
        if (z8) {
            dVarM = dVarM.withClearedAuthToken();
        }
        w(dVarM);
        this.f25722i.execute(f.lambdaFactory$(this, z8));
    }

    public static g getInstance() {
        return getInstance(l3.c.getInstance());
    }

    private v3.d h(v3.d dVar) throws i {
        AbstractC6466e abstractC6466eGenerateAuthToken = this.f25715b.generateAuthToken(i(), dVar.getFirebaseInstallationId(), n(), dVar.getRefreshToken());
        int i8 = b.f25727b[abstractC6466eGenerateAuthToken.getResponseCode().ordinal()];
        if (i8 == 1) {
            return dVar.withAuthToken(abstractC6466eGenerateAuthToken.getToken(), abstractC6466eGenerateAuthToken.getTokenExpirationTimestamp(), this.f25717d.currentTimeInSecs());
        }
        if (i8 == 2) {
            return dVar.withFisError("BAD CONFIG");
        }
        if (i8 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        x(null);
        return dVar.withNoGeneratedFid();
    }

    private synchronized String k() {
        return this.f25723j;
    }

    /* JADX WARN: Finally extract failed */
    private v3.d l() {
        v3.d persistedInstallationEntryValue;
        synchronized (f25712l) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f25714a.getApplicationContext(), "generatefid.lock");
                try {
                    persistedInstallationEntryValue = this.f25716c.readPersistedInstallationEntryValue();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private v3.d m() {
        v3.d persistedInstallationEntryValue;
        synchronized (f25712l) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f25714a.getApplicationContext(), "generatefid.lock");
                try {
                    persistedInstallationEntryValue = this.f25716c.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        persistedInstallationEntryValue = this.f25716c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(t(persistedInstallationEntryValue)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private void o(v3.d dVar) {
        synchronized (f25712l) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f25714a.getApplicationContext(), "generatefid.lock");
                try {
                    this.f25716c.insertOrUpdatePersistedInstallationEntry(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void s() {
        AbstractC5683p.checkNotEmpty(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5683p.checkNotEmpty(n(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5683p.checkNotEmpty(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5683p.checkArgument(p.b(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5683p.checkArgument(p.a(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String t(v3.d dVar) {
        if ((!this.f25714a.getName().equals("CHIME_ANDROID_SDK") && !this.f25714a.isDefaultApp()) || !dVar.shouldAttemptMigration()) {
            return this.f25719f.createRandomFid();
        }
        String iid = this.f25718e.readIid();
        return TextUtils.isEmpty(iid) ? this.f25719f.createRandomFid() : iid;
    }

    private v3.d u(v3.d dVar) throws i {
        AbstractC6465d abstractC6465dCreateFirebaseInstallation = this.f25715b.createFirebaseInstallation(i(), dVar.getFirebaseInstallationId(), n(), j(), (dVar.getFirebaseInstallationId() == null || dVar.getFirebaseInstallationId().length() != 11) ? null : this.f25718e.readToken());
        int i8 = b.f25726a[abstractC6465dCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i8 == 1) {
            return dVar.withRegisteredFid(abstractC6465dCreateFirebaseInstallation.getFid(), abstractC6465dCreateFirebaseInstallation.getRefreshToken(), this.f25717d.currentTimeInSecs(), abstractC6465dCreateFirebaseInstallation.getAuthToken().getToken(), abstractC6465dCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i8 == 2) {
            return dVar.withFisError("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    private void v(v3.d dVar, Exception exc) {
        synchronized (this.f25720g) {
            try {
                Iterator it = this.f25724k.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).onException(dVar, exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void w(v3.d dVar) {
        synchronized (this.f25720g) {
            try {
                Iterator it = this.f25724k.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).onStateReached(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void x(String str) {
        this.f25723j = str;
    }

    @Override // com.google.firebase.installations.h
    public AbstractC0608l delete() {
        return AbstractC0611o.call(this.f25721h, e.lambdaFactory$(this));
    }

    @Override // com.google.firebase.installations.h
    public AbstractC0608l getId() {
        s();
        String strK = k();
        if (strK != null) {
            return AbstractC0611o.forResult(strK);
        }
        AbstractC0608l abstractC0608lC = c();
        this.f25721h.execute(c.lambdaFactory$(this));
        return abstractC0608lC;
    }

    @Override // com.google.firebase.installations.h
    public AbstractC0608l getToken(boolean z8) {
        s();
        AbstractC0608l abstractC0608lB = b();
        this.f25721h.execute(d.lambdaFactory$(this, z8));
        return abstractC0608lB;
    }

    String i() {
        return this.f25714a.getOptions().getApiKey();
    }

    String j() {
        return this.f25714a.getOptions().getApplicationId();
    }

    String n() {
        return this.f25714a.getOptions().getProjectId();
    }

    public static g getInstance(l3.c cVar) {
        AbstractC5683p.checkArgument(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) cVar.get(h.class);
    }

    g(ExecutorService executorService, l3.c cVar, C6464c c6464c, v3.c cVar2, p pVar, v3.b bVar, n nVar) {
        this.f25720g = new Object();
        this.f25724k = new ArrayList();
        this.f25714a = cVar;
        this.f25715b = c6464c;
        this.f25716c = cVar2;
        this.f25717d = pVar;
        this.f25718e = bVar;
        this.f25719f = nVar;
        this.f25721h = executorService;
        this.f25722i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f25713m);
    }
}
