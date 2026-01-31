package g2;

import I2.AbstractC0608l;
import I2.C0609m;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC1103b;
import com.google.android.gms.common.api.internal.AbstractC1108f;
import com.google.android.gms.common.api.internal.AbstractC1110h;
import com.google.android.gms.common.api.internal.AbstractC1111i;
import com.google.android.gms.common.api.internal.C1105c;
import com.google.android.gms.common.api.internal.C1106d;
import com.google.android.gms.common.api.internal.C1107e;
import com.google.android.gms.common.api.internal.C1109g;
import com.google.android.gms.common.api.internal.C1116n;
import com.google.android.gms.common.api.internal.U;
import g2.AbstractC5544f;
import g2.C5539a;
import h2.C5584a;
import h2.C5585b;
import h2.C5604v;
import h2.InterfaceC5595l;
import h2.M;
import h2.ServiceConnectionC5590g;
import i2.AbstractC5670c;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import i2.C5671d;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

/* renamed from: g2.e */
/* loaded from: classes.dex */
public abstract class AbstractC5543e implements InterfaceC5545g {

    /* renamed from: a */
    private final Context f31282a;

    /* renamed from: b */
    private final String f31283b;

    /* renamed from: c */
    private final C5539a f31284c;

    /* renamed from: d */
    private final C5539a.d f31285d;

    /* renamed from: e */
    private final C5585b f31286e;

    /* renamed from: f */
    private final Looper f31287f;

    /* renamed from: g */
    private final int f31288g;

    /* renamed from: h */
    private final AbstractC5544f f31289h;

    /* renamed from: i */
    private final InterfaceC5595l f31290i;

    /* renamed from: j */
    protected final C1105c f31291j;

    /* renamed from: g2.e$a */
    public static class a {
        public static final a DEFAULT_SETTINGS = new C0303a().build();
        public final InterfaceC5595l zaa;
        public final Looper zab;

        /* renamed from: g2.e$a$a */
        public static class C0303a {

            /* renamed from: a */
            private InterfaceC5595l f31292a;

            /* renamed from: b */
            private Looper f31293b;

            public a build() {
                if (this.f31292a == null) {
                    this.f31292a = new C5584a();
                }
                if (this.f31293b == null) {
                    this.f31293b = Looper.getMainLooper();
                }
                return new a(this.f31292a, this.f31293b);
            }

            public C0303a setLooper(Looper looper) {
                AbstractC5683p.checkNotNull(looper, "Looper must not be null.");
                this.f31293b = looper;
                return this;
            }

            public C0303a setMapper(InterfaceC5595l interfaceC5595l) {
                AbstractC5683p.checkNotNull(interfaceC5595l, "StatusExceptionMapper must not be null.");
                this.f31292a = interfaceC5595l;
                return this;
            }
        }

        private a(InterfaceC5595l interfaceC5595l, Account account, Looper looper) {
            this.zaa = interfaceC5595l;
            this.zab = looper;
        }

        /* synthetic */ a(InterfaceC5595l interfaceC5595l, Account account, Looper looper, v vVar) {
            this(interfaceC5595l, null, looper);
        }
    }

    public AbstractC5543e(Activity activity, C5539a c5539a, C5539a.d dVar, a aVar) {
        this(activity, activity, c5539a, dVar, aVar);
    }

    private final AbstractC1103b c(int i8, AbstractC1103b abstractC1103b) {
        abstractC1103b.zak();
        this.f31291j.zaw(this, i8, abstractC1103b);
        return abstractC1103b;
    }

    private final AbstractC0608l d(int i8, AbstractC1110h abstractC1110h) {
        C0609m c0609m = new C0609m();
        this.f31291j.zax(this, i8, abstractC1110h, c0609m, this.f31290i);
        return c0609m.getTask();
    }

    protected C5671d.a a() {
        C5671d.a aVar = new C5671d.a();
        aVar.zab(null);
        aVar.zaa(Collections.emptySet());
        aVar.zac(this.f31282a.getClass().getName());
        aVar.setRealClientPackageName(this.f31282a.getPackageName());
        return aVar;
    }

    public AbstractC5544f asGoogleApiClient() {
        return this.f31289h;
    }

    protected String b() {
        return this.f31283b;
    }

    public <A extends C5539a.b, T extends AbstractC1103b> T doBestEffortWrite(T t8) {
        c(2, t8);
        return t8;
    }

    public <A extends C5539a.b, T extends AbstractC1103b> T doRead(T t8) {
        c(0, t8);
        return t8;
    }

    @Deprecated
    public <A extends C5539a.b, T extends AbstractC1108f, U extends AbstractC1111i> AbstractC0608l doRegisterEventListener(T t8, U u8) {
        AbstractC5683p.checkNotNull(t8);
        AbstractC5683p.checkNotNull(u8);
        AbstractC5683p.checkNotNull(t8.getListenerKey(), "Listener has already been released.");
        AbstractC5683p.checkNotNull(u8.getListenerKey(), "Listener has already been released.");
        AbstractC5683p.checkArgument(AbstractC5681n.equal(t8.getListenerKey(), u8.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f31291j.zaq(this, t8, u8, new Runnable() { // from class: g2.u
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public AbstractC0608l doUnregisterEventListener(C1106d.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends C5539a.b, T extends AbstractC1103b> T doWrite(T t8) {
        c(1, t8);
        return t8;
    }

    @Override // g2.InterfaceC5545g
    public final C5585b getApiKey() {
        return this.f31286e;
    }

    public C5539a.d getApiOptions() {
        return this.f31285d;
    }

    public Context getApplicationContext() {
        return this.f31282a;
    }

    public Looper getLooper() {
        return this.f31287f;
    }

    public <L> C1106d registerListener(L l8, String str) {
        return C1107e.createListenerHolder(l8, this.f31287f, str);
    }

    public final int zaa() {
        return this.f31288g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5539a.f zab(Looper looper, U u8) {
        C5539a.f fVarBuildClient = ((C5539a.AbstractC0301a) AbstractC5683p.checkNotNull(this.f31284c.zaa())).buildClient(this.f31282a, looper, a().build(), (Object) this.f31285d, (AbstractC5544f.b) u8, (AbstractC5544f.c) u8);
        String strB = b();
        if (strB != null && (fVarBuildClient instanceof AbstractC5670c)) {
            ((AbstractC5670c) fVarBuildClient).setAttributionTag(strB);
        }
        if (strB != null && (fVarBuildClient instanceof ServiceConnectionC5590g)) {
            ((ServiceConnectionC5590g) fVarBuildClient).zac(strB);
        }
        return fVarBuildClient;
    }

    public final M zac(Context context, Handler handler) {
        return new M(context, handler, a().build());
    }

    @Deprecated
    public AbstractC5543e(Activity activity, C5539a c5539a, C5539a.d dVar, InterfaceC5595l interfaceC5595l) {
        a.C0303a c0303a = new a.C0303a();
        c0303a.setMapper(interfaceC5595l);
        c0303a.setLooper(activity.getMainLooper());
        this(activity, c5539a, dVar, c0303a.build());
    }

    public <TResult, A extends C5539a.b> AbstractC0608l doBestEffortWrite(AbstractC1110h abstractC1110h) {
        return d(2, abstractC1110h);
    }

    public <TResult, A extends C5539a.b> AbstractC0608l doRead(AbstractC1110h abstractC1110h) {
        return d(0, abstractC1110h);
    }

    public AbstractC0608l doUnregisterEventListener(C1106d.a aVar, int i8) {
        AbstractC5683p.checkNotNull(aVar, "Listener key cannot be null.");
        return this.f31291j.zar(this, aVar, i8);
    }

    public <TResult, A extends C5539a.b> AbstractC0608l doWrite(AbstractC1110h abstractC1110h) {
        return d(1, abstractC1110h);
    }

    private AbstractC5543e(Context context, Activity activity, C5539a c5539a, C5539a.d dVar, a aVar) {
        AbstractC5683p.checkNotNull(context, "Null context is not permitted.");
        AbstractC5683p.checkNotNull(c5539a, "Api must not be null.");
        AbstractC5683p.checkNotNull(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f31282a = context.getApplicationContext();
        String str = null;
        if (o2.n.isAtLeastR()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f31283b = str;
        this.f31284c = c5539a;
        this.f31285d = dVar;
        this.f31287f = aVar.zab;
        C5585b c5585bZaa = C5585b.zaa(c5539a, dVar, str);
        this.f31286e = c5585bZaa;
        this.f31289h = new C5604v(this);
        C1105c c1105cZam = C1105c.zam(this.f31282a);
        this.f31291j = c1105cZam;
        this.f31288g = c1105cZam.zaa();
        this.f31290i = aVar.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C1116n.zad(activity, c1105cZam, c5585bZaa);
        }
        c1105cZam.zaB(this);
    }

    public <A extends C5539a.b> AbstractC0608l doRegisterEventListener(C1109g c1109g) {
        AbstractC5683p.checkNotNull(c1109g);
        AbstractC5683p.checkNotNull(c1109g.register.getListenerKey(), "Listener has already been released.");
        AbstractC5683p.checkNotNull(c1109g.zaa.getListenerKey(), "Listener has already been released.");
        return this.f31291j.zaq(this, c1109g.register, c1109g.zaa, c1109g.zab);
    }

    @Deprecated
    public AbstractC5543e(Context context, C5539a c5539a, C5539a.d dVar, Looper looper, InterfaceC5595l interfaceC5595l) {
        a.C0303a c0303a = new a.C0303a();
        c0303a.setLooper(looper);
        c0303a.setMapper(interfaceC5595l);
        this(context, c5539a, dVar, c0303a.build());
    }

    public AbstractC5543e(Context context, C5539a c5539a, C5539a.d dVar, a aVar) {
        this(context, (Activity) null, c5539a, dVar, aVar);
    }

    @Deprecated
    public AbstractC5543e(Context context, C5539a c5539a, C5539a.d dVar, InterfaceC5595l interfaceC5595l) {
        a.C0303a c0303a = new a.C0303a();
        c0303a.setMapper(interfaceC5595l);
        this(context, c5539a, dVar, c0303a.build());
    }
}
