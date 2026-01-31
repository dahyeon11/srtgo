package B2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: j */
    private static volatile n0 f309j;

    /* renamed from: a */
    private final String f310a;

    /* renamed from: b */
    protected final o2.f f311b;

    /* renamed from: c */
    protected final ExecutorService f312c;

    /* renamed from: d */
    private final D2.a f313d;

    /* renamed from: e */
    private final List f314e;

    /* renamed from: f */
    private int f315f;

    /* renamed from: g */
    private boolean f316g;

    /* renamed from: h */
    private final String f317h;

    /* renamed from: i */
    private volatile InterfaceC0452k f318i;

    protected n0(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !g(str2, str3)) {
            this.f310a = "FA";
        } else {
            this.f310a = str;
        }
        this.f311b = o2.i.getInstance();
        AbstractC0448g.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Q(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f312c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f313d = new D2.a(this);
        this.f314e = new ArrayList();
        try {
            if (E2.d.zzc(context, "google_app_id", E2.a.zza(context)) != null && !c()) {
                this.f317h = null;
                this.f316g = true;
                Log.w(this.f310a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (g(str2, str3)) {
            this.f317h = str2;
        } else {
            this.f317h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f310a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        }
        f(new F(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f310a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new m0(this));
        }
    }

    protected static final boolean c() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void d(Exception exc, boolean z8, boolean z9) {
        this.f316g |= z8;
        if (z8) {
            Log.w(this.f310a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z9) {
            zzA(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f310a, "Error with data collection. Data lost.", exc);
    }

    private final void e(String str, String str2, Bundle bundle, boolean z8, boolean z9, Long l8) {
        f(new a0(this, l8, str, str2, bundle, z8, z9));
    }

    public final void f(c0 c0Var) {
        this.f312c.execute(c0Var);
    }

    public static final boolean g(String str, String str2) {
        return (str2 == null || str == null || c()) ? false : true;
    }

    public static n0 zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC5683p.checkNotNull(context);
        if (f309j == null) {
            synchronized (n0.class) {
                try {
                    if (f309j == null) {
                        f309j = new n0(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f309j;
    }

    protected final InterfaceC0452k i(Context context, boolean z8) {
        try {
            return AbstractBinderC0451j.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            d(e8, true, false);
            return null;
        }
    }

    public final void zzA(int i8, String str, Object obj, Object obj2, Object obj3) {
        f(new O(this, false, 5, str, obj, null, null));
    }

    public final void zzB(E2.c cVar) {
        AbstractC5683p.checkNotNull(cVar);
        synchronized (this.f314e) {
            for (int i8 = 0; i8 < this.f314e.size(); i8++) {
                try {
                    if (cVar.equals(((Pair) this.f314e.get(i8)).first)) {
                        Log.w(this.f310a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e0 e0Var = new e0(cVar);
            this.f314e.add(new Pair(cVar, e0Var));
            if (this.f318i != null) {
                try {
                    this.f318i.registerOnMeasurementEventListener(e0Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f310a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            f(new Y(this, e0Var));
        }
    }

    public final void zzC() {
        f(new D(this));
    }

    public final void zzD(Bundle bundle) {
        f(new C0462v(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        f(new B(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        f(new C(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        f(new C0466z(this, activity, str, str2));
    }

    public final void zzH(boolean z8) {
        f(new V(this, z8));
    }

    public final void zzI(Bundle bundle) {
        f(new W(this, bundle));
    }

    public final void zzJ(E2.b bVar) {
        d0 d0Var = new d0(bVar);
        if (this.f318i != null) {
            try {
                this.f318i.setEventInterceptor(d0Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f310a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        f(new X(this, d0Var));
    }

    public final void zzK(Boolean bool) {
        f(new A(this, bool));
    }

    public final void zzL(long j8) {
        f(new E(this, j8));
    }

    public final void zzM(String str) {
        f(new C0465y(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z8) {
        f(new b0(this, str, str2, obj, z8));
    }

    public final void zzO(E2.c cVar) {
        Pair pair;
        AbstractC5683p.checkNotNull(cVar);
        synchronized (this.f314e) {
            int i8 = 0;
            while (true) {
                try {
                    if (i8 >= this.f314e.size()) {
                        pair = null;
                        break;
                    } else {
                        if (cVar.equals(((Pair) this.f314e.get(i8)).first)) {
                            pair = (Pair) this.f314e.get(i8);
                            break;
                        }
                        i8++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w(this.f310a, "OnEventListener had not been registered.");
                return;
            }
            this.f314e.remove(pair);
            e0 e0Var = (e0) pair.second;
            if (this.f318i != null) {
                try {
                    this.f318i.unregisterOnMeasurementEventListener(e0Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f310a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            f(new Z(this, e0Var));
        }
    }

    public final int zza(String str) {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new S(this, str, binderC0449h));
        Integer num = (Integer) BinderC0449h.zze(binderC0449h.zzb(H0.y.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new K(this, binderC0449h));
        Long l8 = (Long) BinderC0449h.zze(binderC0449h.zzb(500L), Long.class);
        if (l8 != null) {
            return l8.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f311b.currentTimeMillis()).nextLong();
        int i8 = this.f315f + 1;
        this.f315f = i8;
        return jNextLong + i8;
    }

    public final Bundle zzc(Bundle bundle, boolean z8) {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new P(this, bundle, binderC0449h));
        if (z8) {
            return binderC0449h.zzb(5000L);
        }
        return null;
    }

    public final D2.a zzd() {
        return this.f313d;
    }

    public final Object zzh(int i8) {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new U(this, binderC0449h, i8));
        return BinderC0449h.zze(binderC0449h.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.f317h;
    }

    public final String zzk() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new T(this, binderC0449h));
        return binderC0449h.zzc(120000L);
    }

    public final String zzl() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new J(this, binderC0449h));
        return binderC0449h.zzc(50L);
    }

    public final String zzm() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new M(this, binderC0449h));
        return binderC0449h.zzc(500L);
    }

    public final String zzn() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new L(this, binderC0449h));
        return binderC0449h.zzc(500L);
    }

    public final String zzo() {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new I(this, binderC0449h));
        return binderC0449h.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new C0464x(this, str, str2, binderC0449h));
        List list = (List) BinderC0449h.zze(binderC0449h.zzb(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzq(String str, String str2, boolean z8) {
        BinderC0449h binderC0449h = new BinderC0449h();
        f(new N(this, str, str2, z8, binderC0449h));
        Bundle bundleZzb = binderC0449h.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZzb.size());
        for (String str3 : bundleZzb.keySet()) {
            Object obj = bundleZzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzu(String str) {
        f(new G(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        f(new C0463w(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        f(new H(this, str));
    }

    public final void zzx(String str, Bundle bundle) {
        e(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        e(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j8) {
        e(str, str2, bundle, true, false, Long.valueOf(j8));
    }
}
