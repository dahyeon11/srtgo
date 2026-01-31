package A6;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.firebase.iid.w;
import com.kakao.sdk.link.Constants;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: l, reason: collision with root package name */
    private static g f94l;

    /* renamed from: a, reason: collision with root package name */
    private String f95a = "";

    /* renamed from: b, reason: collision with root package name */
    private h f96b = null;

    /* renamed from: c, reason: collision with root package name */
    private e f97c = null;

    /* renamed from: d, reason: collision with root package name */
    private e f98d = null;

    /* renamed from: e, reason: collision with root package name */
    private Handler f99e = null;

    /* renamed from: f, reason: collision with root package name */
    private Handler f100f = null;

    /* renamed from: g, reason: collision with root package name */
    private A6.d f101g = new A6.d();

    /* renamed from: h, reason: collision with root package name */
    private Thread f102h = null;

    /* renamed from: i, reason: collision with root package name */
    private Thread f103i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f104j = false;

    /* renamed from: k, reason: collision with root package name */
    private A6.e f105k = new A6.e();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f106a;

        a(g gVar) {
            this.f106a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (!f.LOAD()) {
                g.this.f102h = null;
                this.f106a.l(d.ErrorLoadProperty, A6.a.ErrorSockData);
                return;
            }
            try {
                g.this.f101g.Complete();
            } catch (Exception unused) {
            }
            A6.a aVarB = this.f106a.b(A6.c.GET_TID_CHK_ENTER);
            if (aVarB != A6.a.Success) {
                g.this.f102h = null;
                this.f106a.l(d.ErrorSystem, aVarB);
                return;
            }
            g.this.f105k.clear();
            g.this.f104j = false;
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            while (true) {
                try {
                    if (this.f106a.getResponse().getCode() != A6.a.Continue && this.f106a.getResponse().getCode() != A6.a.ContinueDebug) {
                        d dVar = d.toEnum(this.f106a.getResponse().getCode().value());
                        if (dVar == d.ErrorSystem) {
                            dVar = d.ErrorService;
                        }
                        g gVar = this.f106a;
                        gVar.l(dVar, gVar.getResponse().getCode());
                    }
                    g.this.f105k.Update(this.f106a.getResponse());
                    g gVar2 = this.f106a;
                    gVar2.l(d.Continue, gVar2.getResponse().getCode());
                    int ttl = this.f106a.getResponse().getTTL(this.f106a.getProperty().getMaxTTL(), 1);
                    Log.e("~~~~~~~~~~~~ttl~~~~~~:", "[" + ttl + "]");
                    Thread.sleep((long) (ttl * 1000));
                    int i8 = 0;
                    while (i8 * 2 <= ttl) {
                        Thread.sleep(500L);
                        Log.e("~~~~~~~~~~scount~~~~~~:", "[" + i8 + "]");
                        i8++;
                        if (g.this.f104j) {
                            this.f106a.l(d.UserStop, A6.a.Stopping);
                            g.this.f102h = null;
                            return;
                        } else if (i8 % 2 == 0) {
                            g gVar3 = this.f106a;
                            gVar3.l(d.ContinueInterval, gVar3.getResponse().getCode());
                        }
                    }
                    A6.a aVarB2 = this.f106a.b(A6.c.CHK_ENTER);
                    if (aVarB2 != A6.a.Success) {
                        g.this.f102h = null;
                        this.f106a.l(d.ErrorSystem, aVarB2);
                        return;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                    if (g.this.f96b.getNotupdateWaitcountBypassLimit() > 0 && g.this.f96b.getNotupdateWaitcountChecktime() > 0 && jCurrentTimeMillis2 - jCurrentTimeMillis >= g.this.f96b.getNotupdateWaitcountChecktime() && this.f106a.getResponse().getWaitCount() <= g.this.f96b.getNotupdateWaitcountBypassLimit()) {
                        g.this.f102h = null;
                        this.f106a.l(d.ErrorBypass, A6.a.ErrorService);
                        return;
                    }
                    jCurrentTimeMillis = jCurrentTimeMillis2;
                } catch (Exception unused2) {
                    this.f106a.l(d.ErrorSystem, A6.a.ErrorExecution);
                }
            }
            g.this.f102h = null;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f108a;

        b(g gVar) {
            this.f108a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f108a.b(A6.c.ALIVE_NOTICE) == A6.a.Success) {
                try {
                    Thread.sleep(this.f108a.getResponse().getTTL(this.f108a.getProperty().getMaxTTL(), 1) * 1000);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    g.this.f103i = null;
                    throw th;
                }
            }
            g.this.f103i = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.f101g.Complete();
            } catch (Exception unused) {
            }
        }
    }

    public interface e {
        void netfunnelMessage(g gVar, d dVar);
    }

    public g() {
        clear();
    }

    public static g ALIVE() {
        g globalInstance = getGlobalInstance();
        globalInstance.AliveNotice();
        return globalInstance;
    }

    public static g BEGIN(String str, String str2, e eVar, e eVar2) {
        Log.e("==NF: ", "Netfunnel.BEGIN() start");
        g globalInstance = getGlobalInstance();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        globalInstance.setListener(eVar, true);
        globalInstance.setListener(eVar2, false);
        globalInstance.setHandler(null, true);
        globalInstance.setHandler(null, false);
        Log.e("==NF: ", "Netfunnel.BEGIN().Begin() call");
        globalInstance.Begin();
        Log.e("==NF: ", "Netfunnel.BEGIN().Begin() call end");
        Log.e("==NF: ", "Netfunnel.BEGIN() end");
        return globalInstance;
    }

    public static g BEGIN1(String str, String str2, e eVar) {
        Log.e("==NF: ", "Netfunnel.BEGIN() start");
        g globalInstance = getGlobalInstance();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        globalInstance.setListener(eVar, true);
        globalInstance.setHandler(null, true);
        globalInstance.setHandler(null, false);
        Log.e("==NF: ", "Netfunnel.BEGIN().Begin() call");
        globalInstance.Begin();
        Log.e("==NF: ", "Netfunnel.BEGIN().Begin() call end");
        Log.e("==NF: ", "Netfunnel.BEGIN() end");
        return globalInstance;
    }

    public static void END() {
        getGlobalInstance().End();
    }

    public static g GET() {
        return getGlobalInstance();
    }

    public static g INIT(String str, String str2) {
        g globalInstance = getGlobalInstance();
        globalInstance.End();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        return globalInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public A6.a b(A6.c cVar) throws InterruptedException {
        int i8 = 0;
        do {
            try {
                if (cVar == A6.c.CHK_ENTER) {
                    this.f101g.CheckedEnter();
                } else if (cVar == A6.c.ALIVE_NOTICE) {
                    this.f101g.AliveNotice();
                } else if (cVar == A6.c.SET_COMPLETE) {
                    this.f101g.Complete();
                } else {
                    if (cVar != A6.c.GET_TID_CHK_ENTER) {
                        return A6.a.ErrorNotSupport;
                    }
                    this.f101g.GetTidCacekedEnter();
                }
                return A6.a.Success;
            } catch (A6.b | Exception unused) {
                try {
                    Thread.sleep(1000L);
                    i8++;
                } catch (Exception unused2) {
                }
            }
        } while (i8 <= this.f96b.getRetry());
        return A6.a.ErrorExecution;
    }

    public static g getGlobalInstance() {
        if (f94l == null) {
            g gVar = new g();
            f94l = gVar;
            gVar.setName(Constants.VALIDATION_DEFAULT);
        }
        return f94l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(d dVar, A6.a aVar) {
        if (dVar != d.ErrorLoadProperty && dVar.isError() && this.f96b.isErrorBypass()) {
            dVar = d.ErrorBypass;
        }
        dVar.setErrorCcode(aVar);
        this.f105k.acountNotice();
        n(dVar);
        m(dVar);
    }

    private void m(d dVar) {
        Handler handler = this.f99e;
        if (handler != null) {
            try {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = dVar.value();
                messageObtainMessage.obj = this;
                this.f99e.sendMessage(messageObtainMessage);
            } catch (Exception unused) {
            }
        }
        Handler handler2 = this.f100f;
        if (handler2 != null) {
            try {
                Message messageObtainMessage2 = handler2.obtainMessage();
                messageObtainMessage2.what = dVar.value();
                messageObtainMessage2.obj = this;
                this.f100f.sendMessage(messageObtainMessage2);
            } catch (Exception unused2) {
            }
        }
    }

    private void n(d dVar) {
        e eVar = this.f97c;
        if (eVar != null) {
            try {
                eVar.netfunnelMessage(this, dVar);
            } catch (Exception unused) {
            }
        }
        e eVar2 = this.f98d;
        if (eVar2 != null) {
            try {
                eVar2.netfunnelMessage(this, dVar);
            } catch (Exception unused2) {
            }
        }
    }

    public void AliveNotice() {
        A6.d dVar;
        i response;
        h hVar = this.f96b;
        if (hVar == null || hVar.isBypass() || (dVar = this.f101g) == null || (response = dVar.getResponse()) == null || response.getKey().length() < 1) {
            return;
        }
        try {
            Thread thread = new Thread(new b(this));
            this.f103i = thread;
            thread.start();
        } catch (Exception unused) {
        }
    }

    public void Begin() {
        Log.e("==NF: ", "Netfunnel.Begin() function start");
        a(true, true);
        h hVar = this.f96b;
        if (hVar == null) {
            l(d.ErrorSystem, A6.a.ErrorNoinit);
            return;
        }
        if (hVar.isBypass()) {
            l(d.NotUsed, A6.a.Success);
            return;
        }
        Thread thread = new Thread(new a(this));
        this.f102h = thread;
        thread.start();
        Log.e("==NF: ", "Netfunnel.Begin() function end");
    }

    public void End() {
        A6.d dVar;
        i response;
        a(false, true);
        h hVar = this.f96b;
        if (hVar == null || hVar.isBypass() || (dVar = this.f101g) == null || (response = dVar.getResponse()) == null || response.getKey().length() < 1) {
            return;
        }
        try {
            new Thread(new c()).start();
        } catch (Exception unused) {
        }
    }

    public void StopContinue() {
        this.f104j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void a(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L16
            java.lang.Thread r1 = r2.f102h     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L11
            if (r1 == 0) goto L16
            r1.interrupt()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L11
            goto L16
        Lb:
            r4 = move-exception
            if (r3 == 0) goto L10
            r2.f102h = r0
        L10:
            throw r4
        L11:
            if (r3 == 0) goto L19
        L13:
            r2.f102h = r0
            goto L19
        L16:
            if (r3 == 0) goto L19
            goto L13
        L19:
            if (r4 == 0) goto L2e
            java.lang.Thread r3 = r2.f103i     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L29
            if (r3 == 0) goto L2e
            r3.interrupt()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L29
            goto L2e
        L23:
            r3 = move-exception
            if (r4 == 0) goto L28
            r2.f103i = r0
        L28:
            throw r3
        L29:
            if (r4 == 0) goto L31
        L2b:
            r2.f103i = r0
            goto L31
        L2e:
            if (r4 == 0) goto L31
            goto L2b
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.g.a(boolean, boolean):void");
    }

    public void clear() {
        setProperty(null);
        setListener(null, true);
        setListener(null, false);
        setHandler(null, true);
        setHandler(null, false);
        this.f95a = "";
    }

    public A6.e getContinueData() {
        return this.f105k;
    }

    public Handler getHandler(boolean z8) {
        return z8 ? this.f99e : this.f100f;
    }

    public e getListener(boolean z8) {
        return z8 ? this.f97c : this.f98d;
    }

    public String getName() {
        return this.f95a;
    }

    public h getProperty() {
        return this.f96b;
    }

    public i getResponse() {
        return this.f101g.getResponse();
    }

    public void setHandler(Handler handler, boolean z8) {
        if (z8) {
            this.f99e = handler;
        } else {
            this.f100f = handler;
        }
    }

    public void setListener(e eVar, boolean z8) {
        if (z8) {
            this.f97c = eVar;
        } else {
            this.f98d = eVar;
        }
    }

    public void setName(String str) {
        this.f95a = str;
    }

    public void setProperty(h hVar) {
        if (hVar != null) {
            this.f96b = hVar.m1clone();
        } else {
            this.f96b = h.getDefaultInstance().m1clone();
        }
        this.f101g.setProperty(this.f96b);
        this.f105k.setProperty(this.f96b);
    }

    public enum d {
        Success(200),
        Continue(201),
        UserStop(203),
        NotUsed(204),
        ContinueInterval(211),
        Bypass(300),
        Block(Map.MapException.StatusCode.AUTH_IS_VAILD_FAILED_VALUE),
        IpBlock(Map.MapException.StatusCode.AUTH_INVALID_AUTH_TOKEN_VALUE),
        ExpressNumber(Map.MapException.StatusCode.AUTH_FAILED_VALUE),
        ErrorService(w.ERROR_UNKNOWN),
        ErrorBypass(980),
        ErrorLoadProperty(981),
        ErrorSystem(999);


        /* renamed from: a, reason: collision with root package name */
        private int f112a;

        /* renamed from: b, reason: collision with root package name */
        private A6.a f113b = A6.a.None;

        d(int i8) {
            this.f112a = i8;
        }

        public static d toEnum(int i8) {
            d[] dVarArrValues = values();
            for (int i9 = 0; i9 < dVarArrValues.length; i9++) {
                if (dVarArrValues[i9].value() == i8) {
                    return dVarArrValues[i9];
                }
            }
            return ErrorSystem;
        }

        public A6.a getErrorCcode() {
            return this.f113b;
        }

        public boolean isBlocking() {
            return this.f112a == Block.value() || this.f112a == IpBlock.value();
        }

        public boolean isContinue() {
            return this.f112a == Continue.value() || this.f112a == ContinueInterval.value();
        }

        public boolean isError() {
            return this.f112a == ErrorService.value() || this.f112a == ErrorLoadProperty.value() || this.f112a == ErrorSystem.value();
        }

        public boolean isStop() {
            return this.f112a == UserStop.value();
        }

        public boolean isSuccess() {
            return this.f112a == Success.value() || this.f112a == NotUsed.value() || this.f112a == Bypass.value() || this.f112a == ErrorBypass.value() || this.f112a == ExpressNumber.value();
        }

        public void setErrorCcode(A6.a aVar) {
            this.f113b = aVar;
        }

        public int value() {
            return this.f112a;
        }

        public static d toEnum(String str) {
            try {
                return toEnum(Integer.parseInt(str));
            } catch (Exception unused) {
                return ErrorSystem;
            }
        }
    }

    public static g BEGIN(String str, String str2, e eVar, Handler handler) {
        g globalInstance = getGlobalInstance();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        globalInstance.setListener(eVar, true);
        globalInstance.setListener(null, false);
        globalInstance.setHandler(null, true);
        globalInstance.setHandler(handler, false);
        globalInstance.Begin();
        return globalInstance;
    }

    public g(h hVar) {
        clear();
        setProperty(hVar);
    }

    public static g BEGIN(String str, String str2, Handler handler, e eVar) {
        g globalInstance = getGlobalInstance();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        globalInstance.setListener(null, true);
        globalInstance.setListener(eVar, false);
        globalInstance.setHandler(handler, true);
        globalInstance.setHandler(null, false);
        globalInstance.Begin();
        return globalInstance;
    }

    public static g BEGIN(String str, String str2, Handler handler, Handler handler2) {
        g globalInstance = getGlobalInstance();
        globalInstance.getProperty().setServiceID(str);
        globalInstance.getProperty().setActionID(str2);
        globalInstance.setListener(null, true);
        globalInstance.setListener(null, false);
        globalInstance.setHandler(handler, true);
        globalInstance.setHandler(handler2, false);
        globalInstance.Begin();
        return globalInstance;
    }
}
