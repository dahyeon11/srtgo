package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import J1.InterfaceC0619b;
import K1.AbstractC0667v0;
import a4.AbstractC0834a;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.AbstractC0985p0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.kakao.sdk.common.Constants;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.gw */
/* loaded from: classes2.dex */
public class C2988gw extends WebViewClient implements InterfaceC1861Rw {
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: A */
    private int f19448A;

    /* renamed from: B */
    private boolean f19449B;

    /* renamed from: D */
    private final GW f19451D;

    /* renamed from: E */
    private View.OnAttachStateChangeListener f19452E;

    /* renamed from: a */
    private final InterfaceC2065Wv f19453a;

    /* renamed from: b */
    private final C4775we f19454b;

    /* renamed from: e */
    private InterfaceC0517a f19457e;

    /* renamed from: f */
    private J1.w f19458f;

    /* renamed from: g */
    private InterfaceC1779Pw f19459g;

    /* renamed from: h */
    private InterfaceC1820Qw f19460h;

    /* renamed from: i */
    private InterfaceC3990pk f19461i;

    /* renamed from: j */
    private InterfaceC4217rk f19462j;

    /* renamed from: k */
    private DJ f19463k;

    /* renamed from: l */
    private boolean f19464l;

    /* renamed from: m */
    private boolean f19465m;

    /* renamed from: q */
    private boolean f19469q;

    /* renamed from: r */
    private boolean f19470r;

    /* renamed from: s */
    private boolean f19471s;

    /* renamed from: t */
    private InterfaceC0619b f19472t;

    /* renamed from: u */
    private C4683vp f19473u;

    /* renamed from: v */
    private G1.b f19474v;

    /* renamed from: x */
    protected InterfaceC4233rs f19476x;

    /* renamed from: y */
    private boolean f19477y;

    /* renamed from: z */
    private boolean f19478z;

    /* renamed from: c */
    private final HashMap f19455c = new HashMap();

    /* renamed from: d */
    private final Object f19456d = new Object();

    /* renamed from: n */
    private int f19466n = 0;

    /* renamed from: o */
    private String f19467o = "";

    /* renamed from: p */
    private String f19468p = "";

    /* renamed from: w */
    private C4114qp f19475w = null;

    /* renamed from: C */
    private final HashSet f19450C = new HashSet(Arrays.asList(((String) H1.C.zzc().zza(AbstractC4439th.zzfM)).split(",")));

    public C2988gw(InterfaceC2065Wv interfaceC2065Wv, C4775we c4775we, boolean z8, C4683vp c4683vp, C4114qp c4114qp, GW gw) {
        this.f19454b = c4775we;
        this.f19453a = interfaceC2065Wv;
        this.f19469q = z8;
        this.f19473u = c4683vp;
        this.f19451D = gw;
    }

    private static WebResourceResponse a() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaK)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00f2, code lost:
    
        G1.u.zzp();
        G1.u.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0100, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0104, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0106, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0108, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0113, code lost:
    
        G1.u.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x011e, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0120, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0122, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0127, code lost:
    
        if (r14.length != 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x012a, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x012c, code lost:
    
        if (r0 >= r14.length) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013a, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x013c, code lost:
    
        r1 = r14[r0].trim().split(com.j256.ormlite.stmt.query.SimpleComparison.EQUAL_TO_OPERATION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0149, code lost:
    
        if (r1.length <= 1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x014b, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0152, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0155, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016e, code lost:
    
        if (r14.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0170, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x017a, code lost:
    
        if (r0.getKey() == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0180, code lost:
    
        if (r0.getValue() == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x018c, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x018e, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a4, code lost:
    
        r5 = G1.u.zzq().zzb(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse b(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2988gw.b(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void c(Map map, List list, String str) {
        if (AbstractC0667v0.zzc()) {
            AbstractC0667v0.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                AbstractC0667v0.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2278al) it.next()).zza(this.f19453a, map);
        }
    }

    private final void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f19452E;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f19453a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void e(final View view, final InterfaceC4233rs interfaceC4233rs, final int i8) {
        if (!interfaceC4233rs.zzi() || i8 <= 0) {
            return;
        }
        interfaceC4233rs.zzg(view);
        if (interfaceC4233rs.zzi()) {
            K1.K0.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.Xv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.m(view, interfaceC4233rs, i8);
                }
            }, 100L);
        }
    }

    private static final boolean f(InterfaceC2065Wv interfaceC2065Wv) {
        if (interfaceC2065Wv.zzD() != null) {
            return interfaceC2065Wv.zzD().zzaj;
        }
        return false;
    }

    private static final boolean g(boolean z8, InterfaceC2065Wv interfaceC2065Wv) {
        return (!z8 || interfaceC2065Wv.zzO().zzi() || interfaceC2065Wv.zzU().equals("interstitial_mb")) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025e A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #7 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:100:0x000a, B:102:0x0017, B:107:0x0026, B:109:0x0038, B:111:0x003f, B:113:0x004b, B:115:0x0068, B:117:0x0081, B:119:0x0098, B:120:0x009b, B:122:0x009e, B:125:0x00b8, B:127:0x00d0, B:129:0x00e9, B:152:0x0190, B:143:0x0172, B:171:0x025e, B:159:0x01e6, B:160:0x020f, B:158:0x01bf, B:142:0x014b, B:128:0x00dd, B:161:0x0210, B:163:0x021a, B:165:0x0220, B:167:0x0252, B:173:0x026d, B:175:0x0273, B:177:0x0281), top: B:192:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0273 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #7 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:100:0x000a, B:102:0x0017, B:107:0x0026, B:109:0x0038, B:111:0x003f, B:113:0x004b, B:115:0x0068, B:117:0x0081, B:119:0x0098, B:120:0x009b, B:122:0x009e, B:125:0x00b8, B:127:0x00d0, B:129:0x00e9, B:152:0x0190, B:143:0x0172, B:171:0x025e, B:159:0x01e6, B:160:0x020f, B:158:0x01bf, B:142:0x014b, B:128:0x00dd, B:161:0x0210, B:163:0x021a, B:165:0x0220, B:167:0x0252, B:173:0x026d, B:175:0x0273, B:177:0x0281), top: B:192:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0286 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.webkit.WebResourceResponse h(java.lang.String r19, java.util.Map r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2988gw.h(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    final /* synthetic */ void k() throws JSONException {
        this.f19453a.zzad();
        J1.u uVarZzL = this.f19453a.zzL();
        if (uVarZzL != null) {
            uVarZzL.zzz();
        }
    }

    final /* synthetic */ void l(boolean z8, long j8) {
        this.f19453a.zzv(z8, j8);
    }

    final /* synthetic */ void m(View view, InterfaceC4233rs interfaceC4233rs, int i8) {
        e(view, interfaceC4233rs, i8 - 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw, H1.InterfaceC0517a
    public final void onAdClicked() {
        InterfaceC0517a interfaceC0517a = this.f19457e;
        if (interfaceC0517a != null) {
            interfaceC0517a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC0667v0.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f19456d) {
            try {
                if (this.f19453a.zzaE()) {
                    AbstractC0667v0.zza("Blank page loaded, 1...");
                    this.f19453a.zzX();
                    return;
                }
                this.f19477y = true;
                InterfaceC1820Qw interfaceC1820Qw = this.f19460h;
                if (interfaceC1820Qw != null) {
                    interfaceC1820Qw.zza();
                    this.f19460h = null;
                }
                zzg();
                if (this.f19453a.zzL() != null) {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlR)).booleanValue()) {
                        this.f19453a.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i8, String str, String str2) {
        this.f19465m = true;
        this.f19466n = i8;
        this.f19467o = str;
        this.f19468p = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f19453a.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case AbstractC0834a.MAX_ROWS_IN_BARCODE /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC0667v0.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.f19464l && webView == this.f19453a.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                    InterfaceC0517a interfaceC0517a = this.f19457e;
                    if (interfaceC0517a != null) {
                        interfaceC0517a.onAdClicked();
                        InterfaceC4233rs interfaceC4233rs = this.f19476x;
                        if (interfaceC4233rs != null) {
                            interfaceC4233rs.zzh(str);
                        }
                        this.f19457e = null;
                    }
                    DJ dj = this.f19463k;
                    if (dj != null) {
                        dj.zzdG();
                        this.f19463k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f19453a.zzG().willNotDraw()) {
                L1.n.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    C2487cb c2487cbZzI = this.f19453a.zzI();
                    C1989Va0 c1989Va0ZzS = this.f19453a.zzS();
                    if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlW)).booleanValue() || c1989Va0ZzS == null) {
                        if (c2487cbZzI != null && c2487cbZzI.zzf(uriZza)) {
                            Context context = this.f19453a.getContext();
                            InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
                            uriZza = c2487cbZzI.zza(uriZza, context, (View) interfaceC2065Wv, interfaceC2065Wv.zzi());
                        }
                    } else if (c2487cbZzI != null && c2487cbZzI.zzf(uriZza)) {
                        Context context2 = this.f19453a.getContext();
                        InterfaceC2065Wv interfaceC2065Wv2 = this.f19453a;
                        uriZza = c1989Va0ZzS.zza(uriZza, context2, (View) interfaceC2065Wv2, interfaceC2065Wv2.zzi());
                    }
                } catch (C2602db unused) {
                    L1.n.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                G1.b bVar = this.f19474v;
                if (bVar == null || bVar.zzc()) {
                    zzu(new J1.j("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true, false);
                } else {
                    this.f19474v.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, InterfaceC2278al interfaceC2278al) {
        synchronized (this.f19456d) {
            try {
                List copyOnWriteArrayList = (List) this.f19455c.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f19455c.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC2278al);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzB(InterfaceC1779Pw interfaceC1779Pw) {
        this.f19459g = interfaceC1779Pw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzC(int i8, int i9) {
        C4114qp c4114qp = this.f19475w;
        if (c4114qp != null) {
            c4114qp.zze(i8, i9);
        }
    }

    public final void zzD(boolean z8) {
        this.f19464l = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzE(boolean z8) {
        synchronized (this.f19456d) {
            this.f19471s = z8;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzF() {
        synchronized (this.f19456d) {
            this.f19464l = false;
            this.f19469q = true;
            AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Yv
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.k();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzG(boolean z8) {
        synchronized (this.f19456d) {
            this.f19470r = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzH(InterfaceC1820Qw interfaceC1820Qw) {
        this.f19460h = interfaceC1820Qw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzI(IA ia, C4535uW c4535uW, C3865oe0 c3865oe0) {
        zzL("/click");
        if (c4535uW == null || c3865oe0 == null) {
            zzA("/click", new C4901xk(this.f19463k, ia));
        } else {
            zzA("/click", new C2153Za0(this.f19463k, ia, c3865oe0, c4535uW));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzJ(IA ia) {
        zzL("/click");
        zzA("/click", new C4901xk(this.f19463k, ia));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzK(IA ia, C4535uW c4535uW, LQ lq) {
        zzL("/open");
        zzA("/open", new C3764nl(this.f19474v, this.f19475w, c4535uW, lq, ia));
    }

    public final void zzL(String str) {
        synchronized (this.f19456d) {
            try {
                List list = (List) this.f19455c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzM(String str, InterfaceC2278al interfaceC2278al) {
        synchronized (this.f19456d) {
            try {
                List list = (List) this.f19455c.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC2278al);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzN(String str, o2.o oVar) {
        synchronized (this.f19456d) {
            try {
                List<InterfaceC2278al> list = (List) this.f19455c.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC2278al interfaceC2278al : list) {
                    if (oVar.apply(interfaceC2278al)) {
                        arrayList.add(interfaceC2278al);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzO() {
        boolean z8;
        synchronized (this.f19456d) {
            z8 = this.f19471s;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final boolean zzP() {
        boolean z8;
        synchronized (this.f19456d) {
            z8 = this.f19469q;
        }
        return z8;
    }

    public final boolean zzQ() {
        boolean z8;
        synchronized (this.f19456d) {
            z8 = this.f19470r;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzR(InterfaceC0517a interfaceC0517a, InterfaceC3990pk interfaceC3990pk, J1.w wVar, InterfaceC4217rk interfaceC4217rk, InterfaceC0619b interfaceC0619b, boolean z8, C2622dl c2622dl, G1.b bVar, InterfaceC4911xp interfaceC4911xp, InterfaceC4233rs interfaceC4233rs, final C4535uW c4535uW, final C3865oe0 c3865oe0, LQ lq, C4675vl c4675vl, DJ dj, C4561ul c4561ul, C3878ol c3878ol, C2393bl c2393bl, IA ia) {
        G1.b bVar2 = bVar == null ? new G1.b(this.f19453a.getContext(), interfaceC4233rs, null) : bVar;
        this.f19475w = new C4114qp(this.f19453a, interfaceC4911xp);
        this.f19476x = interfaceC4233rs;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaS)).booleanValue()) {
            zzA("/adMetadata", new C3876ok(interfaceC3990pk));
        }
        if (interfaceC4217rk != null) {
            zzA("/appEvent", new C4104qk(interfaceC4217rk));
        }
        zzA("/backButton", AbstractC2172Zk.zzj);
        zzA("/refresh", AbstractC2172Zk.zzk);
        zzA("/canOpenApp", AbstractC2172Zk.zzb);
        zzA("/canOpenURLs", AbstractC2172Zk.zza);
        zzA("/canOpenIntents", AbstractC2172Zk.zzc);
        zzA("/close", AbstractC2172Zk.zzd);
        zzA("/customClose", AbstractC2172Zk.zze);
        zzA("/instrument", AbstractC2172Zk.zzn);
        zzA("/delayPageLoaded", AbstractC2172Zk.zzp);
        zzA("/delayPageClosed", AbstractC2172Zk.zzq);
        zzA("/getLocationInfo", AbstractC2172Zk.zzr);
        zzA("/log", AbstractC2172Zk.zzg);
        zzA("/mraid", new C3081hl(bVar2, this.f19475w, interfaceC4911xp));
        C4683vp c4683vp = this.f19473u;
        if (c4683vp != null) {
            zzA("/mraidLoaded", c4683vp);
        }
        G1.b bVar3 = bVar2;
        zzA("/open", new C3764nl(bVar2, this.f19475w, c4535uW, lq, ia));
        zzA("/precache", new C3101hv());
        zzA("/touch", AbstractC2172Zk.zzi);
        zzA("/video", AbstractC2172Zk.zzl);
        zzA("/videoMeta", AbstractC2172Zk.zzm);
        if (c4535uW == null || c3865oe0 == null) {
            zzA("/click", new C4901xk(dj, ia));
            zzA("/httpTrack", AbstractC2172Zk.zzf);
        } else {
            zzA("/click", new C2153Za0(dj, ia, c3865oe0, c4535uW));
            zzA("/httpTrack", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.ab0
                @Override // com.google.android.gms.internal.ads.InterfaceC2278al
                public final void zza(Object obj, Map map) {
                    InterfaceC1655Mv interfaceC1655Mv = (InterfaceC1655Mv) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        L1.n.zzj("URL missing from httpTrack GMSG.");
                    } else if (interfaceC1655Mv.zzD().zzaj) {
                        c4535uW.zzd(new C4877xW(G1.u.zzB().currentTimeMillis(), ((InterfaceC1247Cw) interfaceC1655Mv).zzR().zzb, str, 2));
                    } else {
                        c3865oe0.zzc(str, null);
                    }
                }
            });
        }
        if (G1.u.zzn().zzp(this.f19453a.getContext())) {
            Map map = new HashMap();
            if (this.f19453a.zzD() != null) {
                map = this.f19453a.zzD().zzax;
            }
            zzA("/logScionEvent", new C2966gl(this.f19453a.getContext(), map));
        }
        if (c2622dl != null) {
            zzA("/setInterstitialProperties", new C2507cl(c2622dl));
        }
        if (c4675vl != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue()) {
                zzA("/inspectorNetworkExtras", c4675vl);
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjn)).booleanValue() && c4561ul != null) {
            zzA("/shareSheet", c4561ul);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue() && c3878ol != null) {
            zzA("/inspectorOutOfContextTest", c3878ol);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjw)).booleanValue() && c2393bl != null) {
            zzA("/inspectorStorage", c2393bl);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlz)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", AbstractC2172Zk.zzu);
            zzA("/presentPlayStoreOverlay", AbstractC2172Zk.zzv);
            zzA("/expandPlayStoreOverlay", AbstractC2172Zk.zzw);
            zzA("/collapsePlayStoreOverlay", AbstractC2172Zk.zzx);
            zzA("/closePlayStoreOverlay", AbstractC2172Zk.zzy);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdi)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", AbstractC2172Zk.zzA);
            zzA("/resetPAID", AbstractC2172Zk.zzz);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlQ)).booleanValue()) {
            InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
            if (interfaceC2065Wv.zzD() != null && interfaceC2065Wv.zzD().zzas) {
                zzA("/writeToLocalStorage", AbstractC2172Zk.zzB);
                zzA("/clearLocalStorageKeys", AbstractC2172Zk.zzC);
            }
        }
        this.f19457e = interfaceC0517a;
        this.f19458f = wVar;
        this.f19461i = interfaceC3990pk;
        this.f19462j = interfaceC4217rk;
        this.f19472t = interfaceC0619b;
        this.f19474v = bVar3;
        this.f19463k = dj;
        this.f19464l = z8;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.f19456d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.f19456d) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final G1.b zzd() {
        return this.f19474v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw, com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        DJ dj = this.f19463k;
        if (dj != null) {
            dj.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw, com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
        DJ dj = this.f19463k;
        if (dj != null) {
            dj.zzdf();
        }
    }

    public final void zzg() {
        if (this.f19459g != null && ((this.f19477y && this.f19448A <= 0) || this.f19478z || this.f19465m)) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue() && this.f19453a.zzm() != null) {
                AbstractC1142Ah.zza(this.f19453a.zzm().zza(), this.f19453a.zzk(), "awfllc");
            }
            InterfaceC1779Pw interfaceC1779Pw = this.f19459g;
            boolean z8 = false;
            if (!this.f19478z && !this.f19465m) {
                z8 = true;
            }
            interfaceC1779Pw.zza(z8, this.f19466n, this.f19467o, this.f19468p);
            this.f19459g = null;
        }
        this.f19453a.zzaf();
    }

    public final void zzh() {
        InterfaceC4233rs interfaceC4233rs = this.f19476x;
        if (interfaceC4233rs != null) {
            interfaceC4233rs.zze();
            this.f19476x = null;
        }
        d();
        synchronized (this.f19456d) {
            try {
                this.f19455c.clear();
                this.f19457e = null;
                this.f19458f = null;
                this.f19459g = null;
                this.f19460h = null;
                this.f19461i = null;
                this.f19462j = null;
                this.f19464l = false;
                this.f19469q = false;
                this.f19470r = false;
                this.f19472t = null;
                this.f19474v = null;
                this.f19473u = null;
                C4114qp c4114qp = this.f19475w;
                if (c4114qp != null) {
                    c4114qp.zza(true);
                    this.f19475w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(boolean z8) {
        this.f19449B = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzj(Uri uri) {
        AbstractC0667v0.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.f19455c;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            AbstractC0667v0.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgV)).booleanValue() || G1.u.zzo().zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Zv
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i8 = C2988gw.zzb;
                    G1.u.zzo().zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfL)).booleanValue() && this.f19450C.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzfN)).intValue()) {
                AbstractC0667v0.zza("Parsing gmsg query params on BG thread: ".concat(path));
                AbstractC1483In0.zzr(G1.u.zzp().zzb(uri), new C2529cw(this, list, path, uri), AbstractC4805wt.zze);
                return;
            }
        }
        G1.u.zzp();
        c(K1.K0.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzk() {
        C4775we c4775we = this.f19454b;
        if (c4775we != null) {
            c4775we.zzb(EnumC5003ye.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.f19478z = true;
        this.f19466n = EnumC5003ye.DELAY_PAGE_LOAD_CANCELLED_AD.zza();
        this.f19467o = "Page loaded delay cancel.";
        zzg();
        this.f19453a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzl() {
        synchronized (this.f19456d) {
        }
        this.f19448A++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzm() {
        this.f19448A--;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzq(int i8, int i9, boolean z8) {
        C4683vp c4683vp = this.f19473u;
        if (c4683vp != null) {
            c4683vp.zzb(i8, i9);
        }
        C4114qp c4114qp = this.f19475w;
        if (c4114qp != null) {
            c4114qp.zzd(i8, i9, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1861Rw
    public final void zzr() {
        InterfaceC4233rs interfaceC4233rs = this.f19476x;
        if (interfaceC4233rs != null) {
            WebView webViewZzG = this.f19453a.zzG();
            if (AbstractC0985p0.isAttachedToWindow(webViewZzG)) {
                e(webViewZzG, interfaceC4233rs, 10);
                return;
            }
            d();
            ViewOnAttachStateChangeListenerC2415bw viewOnAttachStateChangeListenerC2415bw = new ViewOnAttachStateChangeListenerC2415bw(this, interfaceC4233rs);
            this.f19452E = viewOnAttachStateChangeListenerC2415bw;
            ((View) this.f19453a).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2415bw);
        }
    }

    public final void zzu(J1.j jVar, boolean z8, boolean z9) {
        InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
        boolean zZzaF = interfaceC2065Wv.zzaF();
        boolean z10 = g(zZzaF, interfaceC2065Wv) || z9;
        boolean z11 = z10 || !z8;
        InterfaceC0517a interfaceC0517a = z10 ? null : this.f19457e;
        J1.w wVar = zZzaF ? null : this.f19458f;
        InterfaceC0619b interfaceC0619b = this.f19472t;
        InterfaceC2065Wv interfaceC2065Wv2 = this.f19453a;
        zzx(new AdOverlayInfoParcel(jVar, interfaceC0517a, wVar, interfaceC0619b, interfaceC2065Wv2.zzn(), interfaceC2065Wv2, z11 ? null : this.f19463k));
    }

    public final void zzv(String str, String str2, int i8) {
        GW gw = this.f19451D;
        InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
        zzx(new AdOverlayInfoParcel(interfaceC2065Wv, interfaceC2065Wv.zzn(), str, str2, 14, gw));
    }

    public final void zzw(boolean z8, int i8, boolean z9) {
        InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
        boolean zG = g(interfaceC2065Wv.zzaF(), interfaceC2065Wv);
        boolean z10 = true;
        if (!zG && z9) {
            z10 = false;
        }
        InterfaceC0517a interfaceC0517a = zG ? null : this.f19457e;
        J1.w wVar = this.f19458f;
        InterfaceC0619b interfaceC0619b = this.f19472t;
        InterfaceC2065Wv interfaceC2065Wv2 = this.f19453a;
        zzx(new AdOverlayInfoParcel(interfaceC0517a, wVar, interfaceC0619b, interfaceC2065Wv2, z8, i8, interfaceC2065Wv2.zzn(), z10 ? null : this.f19463k, f(this.f19453a) ? this.f19451D : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        J1.j jVar;
        C4114qp c4114qp = this.f19475w;
        boolean zZzf = c4114qp != null ? c4114qp.zzf() : false;
        G1.u.zzi();
        J1.v.zza(this.f19453a.getContext(), adOverlayInfoParcel, !zZzf);
        InterfaceC4233rs interfaceC4233rs = this.f19476x;
        if (interfaceC4233rs != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (jVar = adOverlayInfoParcel.zza) != null) {
                str = jVar.zzb;
            }
            interfaceC4233rs.zzh(str);
        }
    }

    public final void zzy(boolean z8, int i8, String str, String str2, boolean z9) {
        InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
        boolean zZzaF = interfaceC2065Wv.zzaF();
        boolean zG = g(zZzaF, interfaceC2065Wv);
        boolean z10 = true;
        if (!zG && z9) {
            z10 = false;
        }
        InterfaceC0517a interfaceC0517a = zG ? null : this.f19457e;
        C2643dw c2643dw = zZzaF ? null : new C2643dw(this.f19453a, this.f19458f);
        InterfaceC3990pk interfaceC3990pk = this.f19461i;
        InterfaceC4217rk interfaceC4217rk = this.f19462j;
        InterfaceC0619b interfaceC0619b = this.f19472t;
        InterfaceC2065Wv interfaceC2065Wv2 = this.f19453a;
        zzx(new AdOverlayInfoParcel(interfaceC0517a, c2643dw, interfaceC3990pk, interfaceC4217rk, interfaceC0619b, interfaceC2065Wv2, z8, i8, str, str2, interfaceC2065Wv2.zzn(), z10 ? null : this.f19463k, f(this.f19453a) ? this.f19451D : null));
    }

    public final void zzz(boolean z8, int i8, String str, boolean z9, boolean z10) {
        InterfaceC2065Wv interfaceC2065Wv = this.f19453a;
        boolean zZzaF = interfaceC2065Wv.zzaF();
        boolean zG = g(zZzaF, interfaceC2065Wv);
        boolean z11 = true;
        if (!zG && z9) {
            z11 = false;
        }
        InterfaceC0517a interfaceC0517a = zG ? null : this.f19457e;
        C2643dw c2643dw = zZzaF ? null : new C2643dw(this.f19453a, this.f19458f);
        InterfaceC3990pk interfaceC3990pk = this.f19461i;
        InterfaceC4217rk interfaceC4217rk = this.f19462j;
        InterfaceC0619b interfaceC0619b = this.f19472t;
        InterfaceC2065Wv interfaceC2065Wv2 = this.f19453a;
        zzx(new AdOverlayInfoParcel(interfaceC0517a, c2643dw, interfaceC3990pk, interfaceC4217rk, interfaceC0619b, interfaceC2065Wv2, z8, i8, str, interfaceC2065Wv2.zzn(), z11 ? null : this.f19463k, f(this.f19453a) ? this.f19451D : null, z10));
    }
}
