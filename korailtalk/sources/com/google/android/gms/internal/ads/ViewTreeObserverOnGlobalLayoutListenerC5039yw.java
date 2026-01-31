package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0648l0;
import K1.AbstractC0667v0;
import K1.C0654o0;
import K1.C0663t0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;
import com.kakao.sdk.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC5039yw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC2065Wv {
    public static final /* synthetic */ int zza = 0;

    /* renamed from: A, reason: collision with root package name */
    private BinderC1206Bw f24022A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f24023B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f24024C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC1799Qi f24025D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC1717Oi f24026E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC1503Jd f24027F;

    /* renamed from: G, reason: collision with root package name */
    private int f24028G;

    /* renamed from: H, reason: collision with root package name */
    private int f24029H;

    /* renamed from: I, reason: collision with root package name */
    private C1388Gh f24030I;

    /* renamed from: J, reason: collision with root package name */
    private final C1388Gh f24031J;

    /* renamed from: K, reason: collision with root package name */
    private C1388Gh f24032K;

    /* renamed from: L, reason: collision with root package name */
    private final C1429Hh f24033L;

    /* renamed from: M, reason: collision with root package name */
    private int f24034M;

    /* renamed from: N, reason: collision with root package name */
    private J1.u f24035N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f24036O;

    /* renamed from: P, reason: collision with root package name */
    private final C0663t0 f24037P;

    /* renamed from: Q, reason: collision with root package name */
    private int f24038Q;

    /* renamed from: R, reason: collision with root package name */
    private int f24039R;

    /* renamed from: S, reason: collision with root package name */
    private int f24040S;

    /* renamed from: T, reason: collision with root package name */
    private int f24041T;

    /* renamed from: U, reason: collision with root package name */
    private Map f24042U;

    /* renamed from: V, reason: collision with root package name */
    private final WindowManager f24043V;

    /* renamed from: W, reason: collision with root package name */
    private final C4775we f24044W;

    /* renamed from: a, reason: collision with root package name */
    private final C1902Sw f24045a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f24046a0;

    /* renamed from: b, reason: collision with root package name */
    private final C2487cb f24047b;

    /* renamed from: c, reason: collision with root package name */
    private final C1989Va0 f24048c;

    /* renamed from: d, reason: collision with root package name */
    private final C2084Xh f24049d;

    /* renamed from: e, reason: collision with root package name */
    private final L1.a f24050e;

    /* renamed from: f, reason: collision with root package name */
    private G1.m f24051f;

    /* renamed from: g, reason: collision with root package name */
    private final G1.a f24052g;

    /* renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f24053h;

    /* renamed from: i, reason: collision with root package name */
    private final float f24054i;

    /* renamed from: j, reason: collision with root package name */
    private C4654va0 f24055j;

    /* renamed from: k, reason: collision with root package name */
    private C4996ya0 f24056k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24057l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f24058m;

    /* renamed from: n, reason: collision with root package name */
    private C2988gw f24059n;

    /* renamed from: o, reason: collision with root package name */
    private J1.u f24060o;

    /* renamed from: p, reason: collision with root package name */
    private C2597dX f24061p;

    /* renamed from: q, reason: collision with root package name */
    private C2368bX f24062q;

    /* renamed from: r, reason: collision with root package name */
    private C1943Tw f24063r;

    /* renamed from: s, reason: collision with root package name */
    private final String f24064s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f24065t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f24066u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24067v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f24068w;

    /* renamed from: x, reason: collision with root package name */
    private Boolean f24069x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f24070y;

    /* renamed from: z, reason: collision with root package name */
    private final String f24071z;

    protected ViewTreeObserverOnGlobalLayoutListenerC5039yw(C1902Sw c1902Sw, C1943Tw c1943Tw, String str, boolean z8, boolean z9, C2487cb c2487cb, C2084Xh c2084Xh, L1.a aVar, C1511Jh c1511Jh, G1.m mVar, G1.a aVar2, C4775we c4775we, C4654va0 c4654va0, C4996ya0 c4996ya0, C1989Va0 c1989Va0) {
        C4996ya0 c4996ya02;
        super(c1902Sw);
        this.f24057l = false;
        this.f24058m = false;
        this.f24070y = true;
        this.f24071z = "";
        this.f24038Q = -1;
        this.f24039R = -1;
        this.f24040S = -1;
        this.f24041T = -1;
        this.f24045a = c1902Sw;
        this.f24063r = c1943Tw;
        this.f24064s = str;
        this.f24067v = z8;
        this.f24047b = c2487cb;
        this.f24048c = c1989Va0;
        this.f24049d = c2084Xh;
        this.f24050e = aVar;
        this.f24051f = mVar;
        this.f24052g = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f24043V = windowManager;
        G1.u.zzp();
        DisplayMetrics displayMetricsZzt = K1.K0.zzt(windowManager);
        this.f24053h = displayMetricsZzt;
        this.f24054i = displayMetricsZzt.density;
        this.f24044W = c4775we;
        this.f24055j = c4654va0;
        this.f24056k = c4996ya0;
        this.f24037P = new C0663t0(c1902Sw.zza(), this, this, null);
        this.f24046a0 = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e8) {
            L1.n.zzh("Unable to enable Javascript.", e8);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlF)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(G1.u.zzp().zzc(c1902Sw, aVar.afmaVersion));
        G1.u.zzp();
        final Context context = getContext();
        AbstractC0648l0.zza(context, new Callable() { // from class: K1.B0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC1634Mh0 handlerC1634Mh0 = K0.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaL)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        l();
        addJavascriptInterface(new C1370Fw(this, new C1329Ew(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        t();
        C1429Hh c1429Hh = new C1429Hh(new C1511Jh(true, "make_wv", this.f24064s));
        this.f24033L = c1429Hh;
        c1429Hh.zza().zzc(null);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() && (c4996ya02 = this.f24056k) != null && c4996ya02.zzb != null) {
            c1429Hh.zza().zzd("gqi", this.f24056k.zzb);
        }
        c1429Hh.zza();
        C1388Gh c1388GhZzf = C1511Jh.zzf();
        this.f24031J = c1388GhZzf;
        c1429Hh.zzb("native:view_create", c1388GhZzf);
        this.f24032K = null;
        this.f24030I = null;
        C0654o0.zza().zzb(c1902Sw);
        G1.u.zzo().zzt();
    }

    private final synchronized void l() {
        C4654va0 c4654va0 = this.f24055j;
        if (c4654va0 != null && c4654va0.zzan) {
            L1.n.zze("Disabling hardware acceleration on an overlay.");
            n();
            return;
        }
        if (!this.f24067v && !this.f24063r.zzi()) {
            L1.n.zze("Enabling hardware acceleration on an AdView.");
            p();
            return;
        }
        L1.n.zze("Enabling hardware acceleration on an overlay.");
        p();
    }

    private final synchronized void m() {
        if (this.f24036O) {
            return;
        }
        this.f24036O = true;
        G1.u.zzo().zzr();
    }

    private final synchronized void n() {
        try {
            if (!this.f24068w) {
                setLayerType(1, null);
            }
            this.f24068w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void o(boolean z8) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z8 ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void p() {
        try {
            if (this.f24068w) {
                setLayerType(0, null);
            }
            this.f24068w = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void q(String str) {
        try {
            final String str2 = "about:blank";
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzll)).booleanValue()) {
                K1.K0.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.sw
                    public final /* synthetic */ String zzb = "about:blank";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.i(this.zzb);
                    }
                });
            } else {
                super.loadUrl("about:blank");
            }
        } catch (Throwable th) {
            G1.u.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            L1.n.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void r() {
        AbstractC1142Ah.zza(this.f24033L.zza(), this.f24031J, "aeh2");
    }

    private final synchronized void s() {
        try {
            Map map = this.f24042U;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC2986gv) it.next()).release();
                }
            }
            this.f24042U = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void t() {
        C1429Hh c1429Hh = this.f24033L;
        if (c1429Hh == null) {
            return;
        }
        C1511Jh c1511JhZza = c1429Hh.zza();
        C5009yh c5009yhZzg = G1.u.zzo().zzg();
        if (c5009yhZzg != null) {
            c5009yhZzg.zzf(c1511JhZza);
        }
    }

    private final synchronized void u() {
        Boolean boolZzl = G1.u.zzo().zzl();
        this.f24069x = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                k(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                k(Boolean.FALSE);
            }
        }
    }

    final synchronized Boolean b() {
        return this.f24069x;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void destroy() {
        try {
            t();
            this.f24037P.zza();
            J1.u uVar = this.f24060o;
            if (uVar != null) {
                uVar.zzb();
                this.f24060o.zzm();
                this.f24060o = null;
            }
            this.f24061p = null;
            this.f24062q = null;
            this.f24059n.zzh();
            this.f24027F = null;
            this.f24051f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f24066u) {
                return;
            }
            G1.u.zzy().zzd(this);
            s();
            this.f24066u = true;
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkN)).booleanValue()) {
                AbstractC0667v0.zza("Destroying the WebView immediately...");
                zzX();
            } else {
                AbstractC0667v0.zza("Initiating WebView self destruct sequence in 3...");
                AbstractC0667v0.zza("Loading blank page in WebView, 2...");
                q("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final synchronized void e(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            L1.n.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkO)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC4805wt.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.rw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.g(str, valueCallback);
                }
            });
        }
    }

    protected final void f(String str) {
        if (!o2.n.isAtLeastKitKat()) {
            j("javascript:".concat(str));
            return;
        }
        if (b() == null) {
            u();
        }
        if (b().booleanValue()) {
            e(str, null);
        } else {
            j("javascript:".concat(str));
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f24066u) {
                        this.f24059n.zzh();
                        G1.u.zzy().zzd(this);
                        s();
                        m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    final /* synthetic */ void g(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void h(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void i(String str) {
        super.loadUrl("about:blank");
    }

    protected final synchronized void j(String str) {
        if (zzaE()) {
            L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void k(Boolean bool) {
        synchronized (this) {
            this.f24069x = bool;
        }
        G1.u.zzo().zzy(bool);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaE()) {
            L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaE()) {
            L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzll)).booleanValue()) {
                K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.h(str);
                    }
                });
            } else {
                super.loadUrl(str);
            }
        } catch (Throwable th) {
            G1.u.zzo().zzw(th, "AdWebViewImpl.loadUrl");
            L1.n.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, H1.InterfaceC0517a
    public final void onAdClicked() {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzaE()) {
                this.f24037P.zzc();
            }
            if (this.f24046a0) {
                onResume();
                this.f24046a0 = false;
            }
            boolean z8 = this.f24023B;
            C2988gw c2988gw = this.f24059n;
            if (c2988gw != null && c2988gw.zzQ()) {
                if (!this.f24024C) {
                    this.f24059n.zza();
                    this.f24059n.zzb();
                    this.f24024C = true;
                }
                zzaZ();
                z8 = true;
            }
            o(z8);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        C2988gw c2988gw;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    this.f24037P.zzd();
                }
                super.onDetachedFromWindow();
                if (this.f24024C && (c2988gw = this.f24059n) != null && c2988gw.zzQ() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f24059n.zza();
                    this.f24059n.zzb();
                    this.f24024C = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkZ)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            G1.u.zzp();
            K1.K0.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e8) {
            L1.n.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            G1.u.zzo().zzw(e8, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zZzaZ = zzaZ();
        J1.u uVarZzL = zzL();
        if (uVarZzL == null || !zZzaZ) {
            return;
        }
        uVarZzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC5039yw.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmz)).booleanValue() && G0.i.isFeatureSupported(G0.i.MUTE_AUDIO)) {
                L1.n.zze("Muting webview");
                G0.h.setAudioMuted(this, true);
            }
        } catch (Exception e8) {
            L1.n.zzh("Could not pause webview.", e8);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmC)).booleanValue()) {
                G1.u.zzo().zzw(e8, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmz)).booleanValue() && G0.i.isFeatureSupported(G0.i.MUTE_AUDIO)) {
                L1.n.zze("Unmuting webview");
                G0.h.setAudioMuted(this, false);
            }
        } catch (Exception e8) {
            L1.n.zzh("Could not resume webview.", e8);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmC)).booleanValue()) {
                G1.u.zzo().zzw(e8, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24059n.zzQ() || this.f24059n.zzO()) {
            C2487cb c2487cb = this.f24047b;
            if (c2487cb != null) {
                c2487cb.zzd(motionEvent);
            }
            C2084Xh c2084Xh = this.f24049d;
            if (c2084Xh != null) {
                c2084Xh.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC1799Qi interfaceC1799Qi = this.f24025D;
                    if (interfaceC1799Qi != null) {
                        interfaceC1799Qi.zzd(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C2988gw) {
            this.f24059n = (C2988gw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e8) {
            L1.n.zzh("Could not stop loading webview.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized void zzA(int i8) {
        this.f24034M = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzB(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized void zzC(BinderC1206Bw binderC1206Bw) {
        if (this.f24022A != null) {
            L1.n.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f24022A = binderC1206Bw;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1655Mv
    public final C4654va0 zzD() {
        return this.f24055j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final Context zzE() {
        return this.f24045a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu, com.google.android.gms.internal.ads.InterfaceC1738Ow
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final WebViewClient zzH() {
        return this.f24059n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1656Mw
    public final C2487cb zzI() {
        return this.f24047b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized InterfaceC1503Jd zzJ() {
        return this.f24027F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized InterfaceC1799Qi zzK() {
        return this.f24025D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized J1.u zzL() {
        return this.f24060o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized J1.u zzM() {
        return this.f24035N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final /* synthetic */ InterfaceC1861Rw zzN() {
        return this.f24059n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu, com.google.android.gms.internal.ads.InterfaceC1615Lw
    public final synchronized C1943Tw zzO() {
        return this.f24063r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized C2368bX zzP() {
        return this.f24062q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized C2597dX zzQ() {
        return this.f24061p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1247Cw
    public final C4996ya0 zzR() {
        return this.f24056k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final C1989Va0 zzS() {
        return this.f24048c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final com.google.common.util.concurrent.C zzT() {
        C2084Xh c2084Xh = this.f24049d;
        return c2084Xh == null ? AbstractC1483In0.zzh(null) : c2084Xh.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized String zzU() {
        return this.f24064s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzW(C4654va0 c4654va0, C4996ya0 c4996ya0) {
        this.f24055j = c4654va0;
        this.f24056k = c4996ya0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzX() {
        AbstractC0667v0.zza("Destroying WebView!");
        m();
        K1.K0.zza.post(new RunnableC4925xw(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzY() {
        r();
        HashMap map = new HashMap(1);
        map.put("version", this.f24050e.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzZ(int i8) {
        if (i8 == 0) {
            C1429Hh c1429Hh = this.f24033L;
            AbstractC1142Ah.zza(c1429Hh.zza(), this.f24031J, "aebb2");
        }
        r();
        this.f24033L.zza();
        this.f24033L.zza().zzd("close_type", String.valueOf(i8));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i8));
        map.put("version", this.f24050e.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzaA(String str, o2.o oVar) {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.zzN(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized boolean zzaB() {
        return this.f24065t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized boolean zzaC() {
        return this.f24028G > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final boolean zzaD(final boolean z8, final int i8) {
        destroy();
        this.f24044W.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.tw
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                int i9 = ViewTreeObserverOnGlobalLayoutListenerC5039yw.zza;
                C3526lg c3526lgZzc = C3640mg.zzc();
                boolean zZzf = c3526lgZzc.zzf();
                boolean z9 = z8;
                if (zZzf != z9) {
                    c3526lgZzc.zzd(z9);
                }
                c3526lgZzc.zze(i8);
                c1713Og.zzab((C3640mg) c3526lgZzc.zzbr());
            }
        });
        this.f24044W.zzb(EnumC5003ye.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized boolean zzaE() {
        return this.f24066u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized boolean zzaF() {
        return this.f24067v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized boolean zzaH() {
        return this.f24070y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1534Jw
    public final void zzaJ(J1.j jVar, boolean z8, boolean z9) {
        this.f24059n.zzu(jVar, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1534Jw
    public final void zzaK(String str, String str2, int i8) {
        this.f24059n.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1534Jw
    public final void zzaL(boolean z8, int i8, boolean z9) {
        this.f24059n.zzw(z8, i8, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1534Jw
    public final void zzaM(boolean z8, int i8, String str, String str2, boolean z9) {
        this.f24059n.zzy(z8, i8, str, str2, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1534Jw
    public final void zzaN(boolean z8, int i8, String str, boolean z9, boolean z10) {
        this.f24059n.zzz(z8, i8, str, z9, z10);
    }

    public final C2988gw zzaO() {
        return this.f24059n;
    }

    public final boolean zzaZ() throws JSONException {
        int i8;
        int iZzw;
        if (this.f24059n.zzP() || this.f24059n.zzQ()) {
            C0591z.zzb();
            DisplayMetrics displayMetrics = this.f24053h;
            int iZzw2 = L1.g.zzw(displayMetrics, displayMetrics.widthPixels);
            C0591z.zzb();
            DisplayMetrics displayMetrics2 = this.f24053h;
            int iZzw3 = L1.g.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityZza = this.f24045a.zza();
            if (activityZza == null || activityZza.getWindow() == null) {
                i8 = iZzw2;
                iZzw = iZzw3;
            } else {
                G1.u.zzp();
                int[] iArrZzQ = K1.K0.zzQ(activityZza);
                C0591z.zzb();
                int iZzw4 = L1.g.zzw(this.f24053h, iArrZzQ[0]);
                C0591z.zzb();
                iZzw = L1.g.zzw(this.f24053h, iArrZzQ[1]);
                i8 = iZzw4;
            }
            int i9 = this.f24039R;
            if (i9 != iZzw2 || this.f24038Q != iZzw3 || this.f24040S != i8 || this.f24041T != iZzw) {
                boolean z8 = (i9 == iZzw2 && this.f24038Q == iZzw3) ? false : true;
                this.f24039R = iZzw2;
                this.f24038Q = iZzw3;
                this.f24040S = i8;
                this.f24041T = iZzw;
                new C4797wp(this, "").zzj(iZzw2, iZzw3, i8, iZzw, this.f24053h.density, this.f24043V.getDefaultDisplay().getRotation());
                return z8;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzaa() {
        if (this.f24030I == null) {
            C1429Hh c1429Hh = this.f24033L;
            AbstractC1142Ah.zza(c1429Hh.zza(), this.f24031J, "aes2");
            this.f24033L.zza();
            C1388Gh c1388GhZzf = C1511Jh.zzf();
            this.f24030I = c1388GhZzf;
            this.f24033L.zzb("native:view_show", c1388GhZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f24050e.afmaVersion);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzac(boolean z8) {
        this.f24059n.zzi(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzad() {
        this.f24037P.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        try {
            if (zzaE()) {
                L1.n.zzj("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) H1.C.zzc().zza(AbstractC4439th.zzO);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put(Constants.SDK, "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e8) {
                L1.n.zzk("Unable to build MRAID_ENV", e8);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, AbstractC1575Kw.zzb(str2, str4), "text/html", "UTF-8", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzaf() {
        if (this.f24032K == null) {
            this.f24033L.zza();
            C1388Gh c1388GhZzf = C1511Jh.zzf();
            this.f24032K = c1388GhZzf;
            this.f24033L.zzb("native:view_load", c1388GhZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzag(String str, InterfaceC2278al interfaceC2278al) {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.zzA(str, interfaceC2278al);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzah() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzai(J1.u uVar) {
        this.f24060o = uVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzaj(C1943Tw c1943Tw) {
        this.f24063r = c1943Tw;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzak(InterfaceC1503Jd interfaceC1503Jd) {
        this.f24027F = interfaceC1503Jd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzal(boolean z8) {
        this.f24070y = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzan(Context context) {
        this.f24045a.setBaseContext(context);
        this.f24037P.zze(this.f24045a.zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzao(boolean z8) {
        J1.u uVar = this.f24060o;
        if (uVar != null) {
            uVar.zzy(this.f24059n.zzP(), z8);
        } else {
            this.f24065t = z8;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzap(InterfaceC1717Oi interfaceC1717Oi) {
        this.f24026E = interfaceC1717Oi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzaq(boolean z8) {
        try {
            boolean z9 = this.f24067v;
            this.f24067v = z8;
            l();
            if (z8 != z9) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzP)).booleanValue()) {
                    if (!this.f24063r.zzi()) {
                    }
                }
                new C4797wp(this, "").zzl(true != z8 ? com.kakao.sdk.link.Constants.VALIDATION_DEFAULT : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzar(InterfaceC1799Qi interfaceC1799Qi) {
        this.f24025D = interfaceC1799Qi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzas(C2368bX c2368bX) {
        this.f24062q = c2368bX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzat(C2597dX c2597dX) {
        this.f24061p = c2597dX;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzau(int i8) {
        J1.u uVar = this.f24060o;
        if (uVar != null) {
            uVar.zzA(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzav(boolean z8) {
        this.f24046a0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzaw(J1.u uVar) {
        this.f24035N = uVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzax(boolean z8) {
        J1.u uVar;
        int i8 = this.f24028G + (true != z8 ? -1 : 1);
        this.f24028G = i8;
        if (i8 > 0 || (uVar = this.f24060o) == null) {
            return;
        }
        uVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final synchronized void zzay(boolean z8) {
        if (z8) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        J1.u uVar = this.f24060o;
        if (uVar != null) {
            uVar.zzB(z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv
    public final void zzaz(String str, InterfaceC2278al interfaceC2278al) {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.zzM(str, interfaceC2278al);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zzb(String str, String str2) {
        f(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zzd(String str, Map map) {
        try {
            zze(str, C0591z.zzb().zzj(map));
        } catch (JSONException unused) {
            L1.n.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
        C2988gw c2988gw = this.f24059n;
        if (c2988gw != null) {
            c2988gw.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, G1.m
    public final synchronized void zzdg() {
        G1.m mVar = this.f24051f;
        if (mVar != null) {
            mVar.zzdg();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, G1.m
    public final synchronized void zzdh() {
        G1.m mVar = this.f24051f;
        if (mVar != null) {
            mVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized String zzdi() {
        return this.f24071z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        boolean z8;
        synchronized (this) {
            z8 = c1951Uc.zzj;
            this.f24023B = z8;
        }
        o(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        L1.n.zze("Dispatching AFMA event: ".concat(sb.toString()));
        f(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized int zzf() {
        return this.f24034M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1411Gw, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final Activity zzi() {
        return this.f24045a.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final G1.a zzj() {
        return this.f24052g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final C1388Gh zzk() {
        return this.f24031J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final C1429Hh zzm() {
        return this.f24033L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC1697Nw, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final L1.a zzn() {
        return this.f24050e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final C3326ju zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized AbstractC2986gv zzp(String str) {
        Map map = this.f24042U;
        if (map == null) {
            return null;
        }
        return (AbstractC2986gv) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized BinderC1206Bw zzq() {
        return this.f24022A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized String zzr() {
        C4996ya0 c4996ya0 = this.f24056k;
        if (c4996ya0 == null) {
            return null;
        }
        return c4996ya0.zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized void zzt(String str, AbstractC2986gv abstractC2986gv) {
        try {
            if (this.f24042U == null) {
                this.f24042U = new HashMap();
            }
            this.f24042U.put(str, abstractC2986gv);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzu() {
        J1.u uVarZzL = zzL();
        if (uVarZzL != null) {
            uVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzv(boolean z8, long j8) {
        HashMap map = new HashMap(2);
        map.put("success", true != z8 ? "0" : "1");
        map.put("duration", Long.toString(j8));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final synchronized void zzw() {
        InterfaceC1717Oi interfaceC1717Oi = this.f24026E;
        if (interfaceC1717Oi != null) {
            final WN wn = (WN) interfaceC1717Oi;
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.UN
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        wn.zzd();
                    } catch (RemoteException e8) {
                        L1.n.zzl("#007 Could not call remote method.", e8);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzx(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzy(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2065Wv, com.google.android.gms.internal.ads.InterfaceC4579uu
    public final void zzz(boolean z8) {
        this.f24059n.zzD(false);
    }
}
