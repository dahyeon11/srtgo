package i2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import f2.C5392b;
import f2.C5394d;
import f2.C5398h;
import g2.AbstractC5542d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public abstract class AbstractC5670c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* renamed from: A */
    private boolean f31730A;

    /* renamed from: B */
    private volatile m0 f31731B;

    /* renamed from: C */
    protected AtomicInteger f31732C;

    /* renamed from: a */
    private int f31733a;

    /* renamed from: b */
    private long f31734b;

    /* renamed from: c */
    private long f31735c;

    /* renamed from: d */
    private int f31736d;

    /* renamed from: e */
    private long f31737e;

    /* renamed from: f */
    private volatile String f31738f;

    /* renamed from: g */
    x0 f31739g;

    /* renamed from: h */
    private final Context f31740h;

    /* renamed from: i */
    private final Looper f31741i;

    /* renamed from: j */
    private final AbstractC5675h f31742j;

    /* renamed from: k */
    private final C5398h f31743k;

    /* renamed from: l */
    final Handler f31744l;

    /* renamed from: m */
    private final Object f31745m;

    /* renamed from: n */
    private final Object f31746n;

    /* renamed from: o */
    private InterfaceC5679l f31747o;

    /* renamed from: p */
    protected InterfaceC0311c f31748p;

    /* renamed from: q */
    private IInterface f31749q;

    /* renamed from: r */
    private final ArrayList f31750r;

    /* renamed from: s */
    private j0 f31751s;

    /* renamed from: t */
    private int f31752t;

    /* renamed from: u */
    private final a f31753u;

    /* renamed from: v */
    private final b f31754v;

    /* renamed from: w */
    private final int f31755w;

    /* renamed from: x */
    private final String f31756x;

    /* renamed from: y */
    private volatile String f31757y;

    /* renamed from: z */
    private C5392b f31758z;

    /* renamed from: D */
    private static final C5394d[] f31729D = new C5394d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: i2.c$a */
    public interface a {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i8);
    }

    /* renamed from: i2.c$b */
    public interface b {
        void onConnectionFailed(C5392b c5392b);
    }

    /* renamed from: i2.c$c */
    public interface InterfaceC0311c {
        void onReportServiceBinding(C5392b c5392b);
    }

    /* renamed from: i2.c$d */
    protected class d implements InterfaceC0311c {
        public d() {
        }

        @Override // i2.AbstractC5670c.InterfaceC0311c
        public final void onReportServiceBinding(C5392b c5392b) {
            if (c5392b.isSuccess()) {
                AbstractC5670c abstractC5670c = AbstractC5670c.this;
                abstractC5670c.getRemoteService(null, abstractC5670c.g());
            } else if (AbstractC5670c.this.f31754v != null) {
                AbstractC5670c.this.f31754v.onConnectionFailed(c5392b);
            }
        }
    }

    /* renamed from: i2.c$e */
    public interface e {
        void onSignOutComplete();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC5670c(Context context, Looper looper, int i8, a aVar, b bVar, String str) {
        AbstractC5675h abstractC5675h = AbstractC5675h.getInstance(context);
        C5398h c5398h = C5398h.getInstance();
        AbstractC5683p.checkNotNull(aVar);
        AbstractC5683p.checkNotNull(bVar);
        this(context, looper, abstractC5675h, c5398h, i8, aVar, bVar, str);
    }

    static /* bridge */ /* synthetic */ boolean C(AbstractC5670c abstractC5670c, int i8, int i9, IInterface iInterface) {
        synchronized (abstractC5670c.f31745m) {
            try {
                if (abstractC5670c.f31752t != i8) {
                    return false;
                }
                abstractC5670c.E(i9, iInterface);
                return true;
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean D(AbstractC5670c abstractC5670c) throws ClassNotFoundException {
        if (abstractC5670c.f31730A || TextUtils.isEmpty(abstractC5670c.h()) || TextUtils.isEmpty(abstractC5670c.f())) {
            return false;
        }
        try {
            Class.forName(abstractC5670c.h());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void E(int i8, IInterface iInterface) {
        x0 x0Var;
        AbstractC5683p.checkArgument((i8 == 4) == (iInterface != null));
        synchronized (this.f31745m) {
            try {
                this.f31752t = i8;
                this.f31749q = iInterface;
                if (i8 == 1) {
                    j0 j0Var = this.f31751s;
                    if (j0Var != null) {
                        AbstractC5675h abstractC5675h = this.f31742j;
                        String strB = this.f31739g.b();
                        AbstractC5683p.checkNotNull(strB);
                        abstractC5675h.zzb(strB, this.f31739g.a(), 4225, j0Var, t(), this.f31739g.c());
                        this.f31751s = null;
                    }
                } else if (i8 == 2 || i8 == 3) {
                    j0 j0Var2 = this.f31751s;
                    if (j0Var2 != null && (x0Var = this.f31739g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + x0Var.b() + " on " + x0Var.a());
                        AbstractC5675h abstractC5675h2 = this.f31742j;
                        String strB2 = this.f31739g.b();
                        AbstractC5683p.checkNotNull(strB2);
                        abstractC5675h2.zzb(strB2, this.f31739g.a(), 4225, j0Var2, t(), this.f31739g.c());
                        this.f31732C.incrementAndGet();
                    }
                    j0 j0Var3 = new j0(this, this.f31732C.get());
                    this.f31751s = j0Var3;
                    x0 x0Var2 = (this.f31752t != 3 || f() == null) ? new x0(i(), getStartServiceAction(), false, 4225, j()) : new x0(getContext().getPackageName(), f(), true, 4225, false);
                    this.f31739g = x0Var2;
                    if (x0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f31739g.b())));
                    }
                    AbstractC5675h abstractC5675h3 = this.f31742j;
                    String strB3 = this.f31739g.b();
                    AbstractC5683p.checkNotNull(strB3);
                    if (!abstractC5675h3.b(new q0(strB3, this.f31739g.a(), 4225, this.f31739g.c()), j0Var3, t(), d())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f31739g.b() + " on " + this.f31739g.a());
                        A(16, null, this.f31732C.get());
                    }
                } else if (i8 == 4) {
                    AbstractC5683p.checkNotNull(iInterface);
                    k(iInterface);
                }
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ void y(AbstractC5670c abstractC5670c, m0 m0Var) {
        abstractC5670c.f31731B = m0Var;
        if (abstractC5670c.usesClientTelemetry()) {
            C5672e c5672e = m0Var.f31833d;
            C5684q.getInstance().zza(c5672e == null ? null : c5672e.zza());
        }
    }

    static /* bridge */ /* synthetic */ void z(AbstractC5670c abstractC5670c, int i8) {
        int i9;
        int i10;
        synchronized (abstractC5670c.f31745m) {
            i9 = abstractC5670c.f31752t;
        }
        if (i9 == 3) {
            abstractC5670c.f31730A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = abstractC5670c.f31744l;
        handler.sendMessage(handler.obtainMessage(i10, abstractC5670c.f31732C.get(), 16));
    }

    protected final void A(int i8, Bundle bundle, int i9) {
        this.f31744l.sendMessage(this.f31744l.obtainMessage(7, i9, -1, new l0(this, i8, null)));
    }

    protected final void a() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface b(IBinder iBinder);

    protected boolean c() {
        return false;
    }

    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.f31743k.isGooglePlayServicesAvailable(this.f31740h, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new d());
        } else {
            E(1, null);
            o(new d(), iIsGooglePlayServicesAvailable, null);
        }
    }

    public void connect(InterfaceC0311c interfaceC0311c) {
        AbstractC5683p.checkNotNull(interfaceC0311c, "Connection progress callbacks cannot be null.");
        this.f31748p = interfaceC0311c;
        E(2, null);
    }

    protected Executor d() {
        return null;
    }

    public void disconnect() {
        this.f31732C.incrementAndGet();
        synchronized (this.f31750r) {
            try {
                int size = this.f31750r.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h0) this.f31750r.get(i8)).zzf();
                }
                this.f31750r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f31746n) {
            this.f31747o = null;
        }
        E(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i8;
        IInterface iInterface;
        InterfaceC5679l interfaceC5679l;
        synchronized (this.f31745m) {
            i8 = this.f31752t;
            iInterface = this.f31749q;
        }
        synchronized (this.f31746n) {
            interfaceC5679l = this.f31747o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i8 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i8 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i8 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i8 == 4) {
            printWriter.print("CONNECTED");
        } else if (i8 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) h()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC5679l == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC5679l.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f31735c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j8 = this.f31735c;
            printWriterAppend.println(j8 + Q7.X.SPACE + simpleDateFormat.format(new Date(j8)));
        }
        if (this.f31734b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i9 = this.f31733a;
            if (i9 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i9 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i9 != 3) {
                printWriter.append((CharSequence) String.valueOf(i9));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j9 = this.f31734b;
            printWriterAppend2.println(j9 + Q7.X.SPACE + simpleDateFormat.format(new Date(j9)));
        }
        if (this.f31737e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC5542d.getStatusCodeString(this.f31736d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j10 = this.f31737e;
            printWriterAppend3.println(j10 + Q7.X.SPACE + simpleDateFormat.format(new Date(j10)));
        }
    }

    protected Bundle e() {
        return new Bundle();
    }

    protected String f() {
        return null;
    }

    protected Set g() {
        return Collections.emptySet();
    }

    public Account getAccount() {
        return null;
    }

    public C5394d[] getApiFeatures() {
        return f31729D;
    }

    public final C5394d[] getAvailableFeatures() {
        m0 m0Var = this.f31731B;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f31831b;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.f31740h;
    }

    public String getEndpointPackageName() {
        x0 x0Var;
        if (!isConnected() || (x0Var = this.f31739g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return x0Var.a();
    }

    public int getGCoreServiceId() {
        return this.f31755w;
    }

    public String getLastDisconnectMessage() {
        return this.f31738f;
    }

    public final Looper getLooper() {
        return this.f31741i;
    }

    public int getMinApkVersion() {
        return C5398h.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public void getRemoteService(InterfaceC5677j interfaceC5677j, Set<Scope> set) {
        Bundle bundleE = e();
        String str = this.f31757y;
        int i8 = C5398h.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = C5673f.f31785o;
        Bundle bundle = new Bundle();
        int i9 = this.f31755w;
        C5394d[] c5394dArr = C5673f.f31786p;
        C5673f c5673f = new C5673f(6, i9, i8, null, null, scopeArr, bundle, null, c5394dArr, c5394dArr, true, 0, false, str);
        c5673f.f31790d = this.f31740h.getPackageName();
        c5673f.f31793g = bundleE;
        if (set != null) {
            c5673f.f31792f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            c5673f.f31794h = account;
            if (interfaceC5677j != null) {
                c5673f.f31791e = interfaceC5677j.asBinder();
            }
        } else if (requiresAccount()) {
            c5673f.f31794h = getAccount();
        }
        c5673f.f31795i = f31729D;
        c5673f.f31796j = getApiFeatures();
        if (usesClientTelemetry()) {
            c5673f.f31799m = true;
        }
        try {
            synchronized (this.f31746n) {
                try {
                    InterfaceC5679l interfaceC5679l = this.f31747o;
                    if (interfaceC5679l != null) {
                        interfaceC5679l.getService(new i0(this, this.f31732C.get()), c5673f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            triggerConnectionSuspended(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            n(8, null, null, this.f31732C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            n(8, null, null, this.f31732C.get());
        }
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.f31745m) {
            try {
                if (this.f31752t == 5) {
                    throw new DeadObjectException();
                }
                a();
                iInterface = this.f31749q;
                AbstractC5683p.checkNotNull(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.f31746n) {
            try {
                InterfaceC5679l interfaceC5679l = this.f31747o;
                if (interfaceC5679l == null) {
                    return null;
                }
                return interfaceC5679l.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    public C5672e getTelemetryConfiguration() {
        m0 m0Var = this.f31731B;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f31833d;
    }

    protected abstract String h();

    public boolean hasConnectionInfo() {
        return this.f31731B != null;
    }

    protected String i() {
        return "com.google.android.gms";
    }

    public boolean isConnected() {
        boolean z8;
        synchronized (this.f31745m) {
            z8 = this.f31752t == 4;
        }
        return z8;
    }

    public boolean isConnecting() {
        boolean z8;
        synchronized (this.f31745m) {
            int i8 = this.f31752t;
            z8 = true;
            if (i8 != 2 && i8 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    protected boolean j() {
        return getMinApkVersion() >= 211700000;
    }

    protected void k(IInterface iInterface) {
        this.f31735c = System.currentTimeMillis();
    }

    protected void l(C5392b c5392b) {
        this.f31736d = c5392b.getErrorCode();
        this.f31737e = System.currentTimeMillis();
    }

    protected void m(int i8) {
        this.f31733a = i8;
        this.f31734b = System.currentTimeMillis();
    }

    protected void n(int i8, IBinder iBinder, Bundle bundle, int i9) {
        this.f31744l.sendMessage(this.f31744l.obtainMessage(1, i9, -1, new k0(this, i8, iBinder, bundle)));
    }

    protected void o(InterfaceC0311c interfaceC0311c, int i8, PendingIntent pendingIntent) {
        AbstractC5683p.checkNotNull(interfaceC0311c, "Connection progress callbacks cannot be null.");
        this.f31748p = interfaceC0311c;
        this.f31744l.sendMessage(this.f31744l.obtainMessage(3, this.f31732C.get(), i8, pendingIntent));
    }

    public void onUserSignOut(e eVar) {
        eVar.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.f31757y = str;
    }

    protected final String t() {
        String str = this.f31756x;
        return str == null ? this.f31740h.getClass().getName() : str;
    }

    public void triggerConnectionSuspended(int i8) {
        this.f31744l.sendMessage(this.f31744l.obtainMessage(6, this.f31732C.get(), i8));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected AbstractC5670c(Context context, Looper looper, AbstractC5675h abstractC5675h, C5398h c5398h, int i8, a aVar, b bVar, String str) {
        this.f31738f = null;
        this.f31745m = new Object();
        this.f31746n = new Object();
        this.f31750r = new ArrayList();
        this.f31752t = 1;
        this.f31758z = null;
        this.f31730A = false;
        this.f31731B = null;
        this.f31732C = new AtomicInteger(0);
        AbstractC5683p.checkNotNull(context, "Context must not be null");
        this.f31740h = context;
        AbstractC5683p.checkNotNull(looper, "Looper must not be null");
        this.f31741i = looper;
        AbstractC5683p.checkNotNull(abstractC5675h, "Supervisor must not be null");
        this.f31742j = abstractC5675h;
        AbstractC5683p.checkNotNull(c5398h, "API availability must not be null");
        this.f31743k = c5398h;
        this.f31744l = new g0(this, looper);
        this.f31755w = i8;
        this.f31753u = aVar;
        this.f31754v = bVar;
        this.f31756x = str;
    }

    public void disconnect(String str) {
        this.f31738f = str;
        disconnect();
    }
}
