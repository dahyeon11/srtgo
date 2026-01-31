package com.google.android.gms.common.api.internal;

import I2.AbstractC0608l;
import I2.C0609m;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1106d;
import f2.C5392b;
import f2.C5397g;
import g2.AbstractC5543e;
import g2.C5539a;
import g2.InterfaceC5545g;
import h2.C5585b;
import h2.InterfaceC5595l;
import i2.AbstractC5675h;
import i2.AbstractC5683p;
import i2.AbstractC5688u;
import i2.C5652K;
import i2.C5680m;
import i2.C5684q;
import i2.C5685r;
import i2.C5687t;
import i2.InterfaceC5689v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public class C1105c implements Handler.Callback {

    /* renamed from: t */
    private static C1105c f11995t;

    /* renamed from: e */
    private C5687t f12000e;

    /* renamed from: f */
    private InterfaceC5689v f12001f;

    /* renamed from: g */
    private final Context f12002g;

    /* renamed from: h */
    private final C5397g f12003h;

    /* renamed from: i */
    private final C5652K f12004i;

    /* renamed from: p */
    private final Handler f12011p;

    /* renamed from: q */
    private volatile boolean f12012q;
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: r */
    private static final Status f11993r = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: s */
    private static final Object f11994s = new Object();

    /* renamed from: a */
    private long f11996a = 5000;

    /* renamed from: b */
    private long f11997b = 120000;

    /* renamed from: c */
    private long f11998c = H0.y.MIN_BACKOFF_MILLIS;

    /* renamed from: d */
    private boolean f11999d = false;

    /* renamed from: j */
    private final AtomicInteger f12005j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f12006k = new AtomicInteger(0);

    /* renamed from: l */
    private final Map f12007l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m */
    private C1116n f12008m = null;

    /* renamed from: n */
    private final Set f12009n = new O.b();

    /* renamed from: o */
    private final Set f12010o = new O.b();

    private C1105c(Context context, Looper looper, C5397g c5397g) {
        this.f12012q = true;
        this.f12002g = context;
        x2.j jVar = new x2.j(looper, this);
        this.f12011p = jVar;
        this.f12003h = c5397g;
        this.f12004i = new C5652K(c5397g);
        if (o2.j.isAuto(context)) {
            this.f12012q = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static Status e(C5585b c5585b, C5392b c5392b) {
        String strZab = c5585b.zab();
        String strValueOf = String.valueOf(c5392b);
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strZab);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(c5392b, sb.toString());
    }

    private final U f(AbstractC5543e abstractC5543e) {
        C5585b apiKey = abstractC5543e.getApiKey();
        U u8 = (U) this.f12007l.get(apiKey);
        if (u8 == null) {
            u8 = new U(this, abstractC5543e);
            this.f12007l.put(apiKey, u8);
        }
        if (u8.zaz()) {
            this.f12010o.add(apiKey);
        }
        u8.zao();
        return u8;
    }

    private final InterfaceC5689v g() {
        if (this.f12001f == null) {
            this.f12001f = AbstractC5688u.getClient(this.f12002g);
        }
        return this.f12001f;
    }

    private final void h() {
        C5687t c5687t = this.f12000e;
        if (c5687t != null) {
            if (c5687t.zaa() > 0 || c()) {
                g().log(c5687t);
            }
            this.f12000e = null;
        }
    }

    private final void i(C0609m c0609m, int i8, AbstractC5543e abstractC5543e) {
        C1102a0 c1102a0A;
        if (i8 == 0 || (c1102a0A = C1102a0.a(this, i8, abstractC5543e.getApiKey())) == null) {
            return;
        }
        AbstractC0608l task = c0609m.getTask();
        final Handler handler = this.f12011p;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: h2.t
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c1102a0A);
    }

    public static void reportSignOut() {
        synchronized (f11994s) {
            try {
                C1105c c1105c = f11995t;
                if (c1105c != null) {
                    c1105c.f12006k.incrementAndGet();
                    Handler handler = c1105c.f12011p;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1105c zal() {
        C1105c c1105c;
        synchronized (f11994s) {
            AbstractC5683p.checkNotNull(f11995t, "Must guarantee manager is non-null before using getInstance");
            c1105c = f11995t;
        }
        return c1105c;
    }

    public static C1105c zam(Context context) {
        C1105c c1105c;
        synchronized (f11994s) {
            try {
                if (f11995t == null) {
                    f11995t = new C1105c(context.getApplicationContext(), AbstractC5675h.getOrStartHandlerThread().getLooper(), C5397g.getInstance());
                }
                c1105c = f11995t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1105c;
    }

    final void a(C1116n c1116n) {
        synchronized (f11994s) {
            try {
                if (this.f12008m == c1116n) {
                    this.f12008m = null;
                    this.f12009n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean c() {
        if (this.f11999d) {
            return false;
        }
        C5685r config = C5684q.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.f12004i.zaa(this.f12002g, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    final boolean d(C5392b c5392b, int i8) {
        return this.f12003h.zah(this.f12002g, c5392b, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        long j8 = H0.q.MIN_PERIODIC_FLEX_MILLIS;
        U u8 = null;
        switch (i8) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j8 = H0.y.MIN_BACKOFF_MILLIS;
                }
                this.f11998c = j8;
                this.f12011p.removeMessages(12);
                for (C5585b c5585b : this.f12007l.keySet()) {
                    Handler handler = this.f12011p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c5585b), this.f11998c);
                }
                return true;
            case 2:
                h2.Q q8 = (h2.Q) message.obj;
                Iterator<C5585b> it = q8.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C5585b next = it.next();
                        U u9 = (U) this.f12007l.get(next);
                        if (u9 == null) {
                            q8.zac(next, new C5392b(13), null);
                        } else if (u9.x()) {
                            q8.zac(next, C5392b.RESULT_SUCCESS, u9.zaf().getEndpointPackageName());
                        } else {
                            C5392b c5392bZad = u9.zad();
                            if (c5392bZad != null) {
                                q8.zac(next, c5392bZad, null);
                            } else {
                                u9.zat(q8);
                                u9.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (U u10 : this.f12007l.values()) {
                    u10.zan();
                    u10.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                h2.D d9 = (h2.D) message.obj;
                U uF = (U) this.f12007l.get(d9.zac.getApiKey());
                if (uF == null) {
                    uF = f(d9.zac);
                }
                if (!uF.zaz() || this.f12006k.get() == d9.zab) {
                    uF.zap(d9.zaa);
                } else {
                    d9.zaa.zad(zaa);
                    uF.zav();
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C5392b c5392b = (C5392b) message.obj;
                Iterator it2 = this.f12007l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        U u11 = (U) it2.next();
                        if (u11.zab() == i9) {
                            u8 = u11;
                        }
                    }
                }
                if (u8 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i9);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (c5392b.getErrorCode() == 13) {
                    String errorString = this.f12003h.getErrorString(c5392b.getErrorCode());
                    String errorMessage = c5392b.getErrorMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(errorString);
                    sb2.append(": ");
                    sb2.append(errorMessage);
                    u8.c(new Status(17, sb2.toString()));
                } else {
                    u8.c(e(u8.f11955c, c5392b));
                }
                return true;
            case 6:
                if (this.f12002g.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1101a.initialize((Application) this.f12002g.getApplicationContext());
                    ComponentCallbacks2C1101a.getInstance().addListener(new O(this));
                    if (!ComponentCallbacks2C1101a.getInstance().readCurrentStateIfPossible(true)) {
                        this.f11998c = H0.q.MIN_PERIODIC_FLEX_MILLIS;
                    }
                }
                return true;
            case 7:
                f((AbstractC5543e) message.obj);
                return true;
            case 9:
                if (this.f12007l.containsKey(message.obj)) {
                    ((U) this.f12007l.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it3 = this.f12010o.iterator();
                while (it3.hasNext()) {
                    U u12 = (U) this.f12007l.remove((C5585b) it3.next());
                    if (u12 != null) {
                        u12.zav();
                    }
                }
                this.f12010o.clear();
                return true;
            case 11:
                if (this.f12007l.containsKey(message.obj)) {
                    ((U) this.f12007l.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.f12007l.containsKey(message.obj)) {
                    ((U) this.f12007l.get(message.obj)).zaA();
                }
                return true;
            case 14:
                C1117o c1117o = (C1117o) message.obj;
                C5585b c5585bZaa = c1117o.zaa();
                if (this.f12007l.containsKey(c5585bZaa)) {
                    c1117o.zab().setResult(Boolean.valueOf(((U) this.f12007l.get(c5585bZaa)).m(false)));
                } else {
                    c1117o.zab().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                V v8 = (V) message.obj;
                if (this.f12007l.containsKey(v8.f11966a)) {
                    U.t((U) this.f12007l.get(v8.f11966a), v8);
                }
                return true;
            case 16:
                V v9 = (V) message.obj;
                if (this.f12007l.containsKey(v9.f11966a)) {
                    U.u((U) this.f12007l.get(v9.f11966a), v9);
                }
                return true;
            case 17:
                h();
                return true;
            case 18:
                C1104b0 c1104b0 = (C1104b0) message.obj;
                if (c1104b0.f11991c == 0) {
                    g().log(new C5687t(c1104b0.f11990b, Arrays.asList(c1104b0.f11989a)));
                } else {
                    C5687t c5687t = this.f12000e;
                    if (c5687t != null) {
                        List<C5680m> listZab = c5687t.zab();
                        if (c5687t.zaa() != c1104b0.f11990b || (listZab != null && listZab.size() >= c1104b0.f11992d)) {
                            this.f12011p.removeMessages(17);
                            h();
                        } else {
                            this.f12000e.zac(c1104b0.f11989a);
                        }
                    }
                    if (this.f12000e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c1104b0.f11989a);
                        this.f12000e = new C5687t(c1104b0.f11990b, arrayList);
                        Handler handler2 = this.f12011p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1104b0.f11991c);
                    }
                }
                return true;
            case 19:
                this.f11999d = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i8);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    final U s(C5585b c5585b) {
        return (U) this.f12007l.get(c5585b);
    }

    final void y(C5680m c5680m, int i8, long j8, int i9) {
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(18, new C1104b0(c5680m, i8, j8, i9)));
    }

    public final void zaA() {
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(AbstractC5543e abstractC5543e) {
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(7, abstractC5543e));
    }

    public final void zaC(C1116n c1116n) {
        synchronized (f11994s) {
            try {
                if (this.f12008m != c1116n) {
                    this.f12008m = c1116n;
                    this.f12009n.clear();
                }
                this.f12009n.addAll(c1116n.i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zaa() {
        return this.f12005j.getAndIncrement();
    }

    public final AbstractC0608l zao(Iterable<? extends InterfaceC5545g> iterable) {
        h2.Q q8 = new h2.Q(iterable);
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(2, q8));
        return q8.zaa();
    }

    public final AbstractC0608l zap(AbstractC5543e abstractC5543e) {
        C1117o c1117o = new C1117o(abstractC5543e.getApiKey());
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(14, c1117o));
        return c1117o.zab().getTask();
    }

    public final <O extends C5539a.d> AbstractC0608l zaq(AbstractC5543e abstractC5543e, AbstractC1108f abstractC1108f, AbstractC1111i abstractC1111i, Runnable runnable) {
        C0609m c0609m = new C0609m();
        i(c0609m, abstractC1108f.zaa(), abstractC5543e);
        n0 n0Var = new n0(new h2.E(abstractC1108f, abstractC1111i, runnable), c0609m);
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(8, new h2.D(n0Var, this.f12006k.get(), abstractC5543e)));
        return c0609m.getTask();
    }

    public final <O extends C5539a.d> AbstractC0608l zar(AbstractC5543e abstractC5543e, C1106d.a aVar, int i8) {
        C0609m c0609m = new C0609m();
        i(c0609m, i8, abstractC5543e);
        p0 p0Var = new p0(aVar, c0609m);
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(13, new h2.D(p0Var, this.f12006k.get(), abstractC5543e)));
        return c0609m.getTask();
    }

    public final <O extends C5539a.d> void zaw(AbstractC5543e abstractC5543e, int i8, AbstractC1103b abstractC1103b) {
        m0 m0Var = new m0(i8, abstractC1103b);
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(4, new h2.D(m0Var, this.f12006k.get(), abstractC5543e)));
    }

    public final <O extends C5539a.d, ResultT> void zax(AbstractC5543e abstractC5543e, int i8, AbstractC1110h abstractC1110h, C0609m c0609m, InterfaceC5595l interfaceC5595l) {
        i(c0609m, abstractC1110h.zaa(), abstractC5543e);
        o0 o0Var = new o0(i8, abstractC1110h, c0609m, interfaceC5595l);
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(4, new h2.D(o0Var, this.f12006k.get(), abstractC5543e)));
    }

    public final void zaz(C5392b c5392b, int i8) {
        if (d(c5392b, i8)) {
            return;
        }
        Handler handler = this.f12011p;
        handler.sendMessage(handler.obtainMessage(5, i8, 0, c5392b));
    }
}
