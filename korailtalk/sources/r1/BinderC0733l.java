package R1;

import H1.Y1;
import K1.AbstractC0630c0;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractBinderC1898Ss;
import com.google.android.gms.internal.ads.AbstractC1483In0;
import com.google.android.gms.internal.ads.AbstractC1802Qj0;
import com.google.android.gms.internal.ads.AbstractC2302ax;
import com.google.android.gms.internal.ads.AbstractC3302ji;
import com.google.android.gms.internal.ads.AbstractC3414kh;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4669vi;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.AbstractC5136zn0;
import com.google.android.gms.internal.ads.C1989Va0;
import com.google.android.gms.internal.ads.C2002Vh;
import com.google.android.gms.internal.ads.C2103Xs;
import com.google.android.gms.internal.ads.C2487cb;
import com.google.android.gms.internal.ads.C2602db;
import com.google.android.gms.internal.ads.C3546lq;
import com.google.android.gms.internal.ads.C3865oe0;
import com.google.android.gms.internal.ads.C4200rb0;
import com.google.android.gms.internal.ads.C4754wO;
import com.google.android.gms.internal.ads.InterfaceC3091hq;
import com.google.android.gms.internal.ads.InterfaceC3769nn0;
import com.google.android.gms.internal.ads.InterfaceC3875oj0;
import com.google.android.gms.internal.ads.InterfaceC3997pn0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import com.google.android.gms.internal.ads.QQ;
import com.google.android.gms.internal.ads.RunnableC4660vd0;
import com.google.android.gms.internal.ads.RunnableC5002yd0;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import r2.InterfaceC6172a;
import y1.EnumC6522c;

/* renamed from: R1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0733l extends AbstractBinderC1898Ss {

    /* renamed from: F, reason: collision with root package name */
    protected static final List f4362F = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: G, reason: collision with root package name */
    protected static final List f4363G = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: H, reason: collision with root package name */
    protected static final List f4364H = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: I, reason: collision with root package name */
    protected static final List f4365I = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;

    /* renamed from: D, reason: collision with root package name */
    private final C2002Vh f4369D;

    /* renamed from: E, reason: collision with root package name */
    private final K f4370E;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2302ax f4371a;

    /* renamed from: b, reason: collision with root package name */
    private Context f4372b;

    /* renamed from: c, reason: collision with root package name */
    private final C2487cb f4373c;

    /* renamed from: d, reason: collision with root package name */
    private final C1989Va0 f4374d;

    /* renamed from: e, reason: collision with root package name */
    private final C4200rb0 f4375e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f4376f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f4377g;

    /* renamed from: h, reason: collision with root package name */
    private C3546lq f4378h;

    /* renamed from: k, reason: collision with root package name */
    private final QQ f4381k;

    /* renamed from: l, reason: collision with root package name */
    private final C3865oe0 f4382l;

    /* renamed from: t, reason: collision with root package name */
    private final L1.a f4390t;

    /* renamed from: u, reason: collision with root package name */
    private String f4391u;

    /* renamed from: w, reason: collision with root package name */
    private final List f4393w;

    /* renamed from: x, reason: collision with root package name */
    private final List f4394x;

    /* renamed from: y, reason: collision with root package name */
    private final List f4395y;

    /* renamed from: z, reason: collision with root package name */
    private final List f4396z;

    /* renamed from: i, reason: collision with root package name */
    private Point f4379i = new Point();

    /* renamed from: j, reason: collision with root package name */
    private Point f4380j = new Point();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicInteger f4389s = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private final AtomicBoolean f4366A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f4367B = new AtomicBoolean(false);

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f4368C = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4383m = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhu)).booleanValue();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f4384n = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzht)).booleanValue();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f4385o = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhw)).booleanValue();

    /* renamed from: p, reason: collision with root package name */
    private final boolean f4386p = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhy)).booleanValue();

    /* renamed from: q, reason: collision with root package name */
    private final String f4387q = (String) H1.C.zzc().zza(AbstractC4439th.zzhx);

    /* renamed from: r, reason: collision with root package name */
    private final String f4388r = (String) H1.C.zzc().zza(AbstractC4439th.zzhz);

    /* renamed from: v, reason: collision with root package name */
    private final String f4392v = (String) H1.C.zzc().zza(AbstractC4439th.zzhA);

    public BinderC0733l(AbstractC2302ax abstractC2302ax, Context context, C2487cb c2487cb, C4200rb0 c4200rb0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, QQ qq, C3865oe0 c3865oe0, L1.a aVar, C2002Vh c2002Vh, C1989Va0 c1989Va0, K k8) {
        List listA;
        this.f4371a = abstractC2302ax;
        this.f4372b = context;
        this.f4373c = c2487cb;
        this.f4374d = c1989Va0;
        this.f4375e = c4200rb0;
        this.f4376f = interfaceExecutorServiceC1974Un0;
        this.f4377g = scheduledExecutorService;
        this.f4381k = qq;
        this.f4382l = c3865oe0;
        this.f4390t = aVar;
        this.f4369D = c2002Vh;
        this.f4370E = k8;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhB)).booleanValue()) {
            this.f4393w = A((String) H1.C.zzc().zza(AbstractC4439th.zzhC));
            this.f4394x = A((String) H1.C.zzc().zza(AbstractC4439th.zzhD));
            this.f4395y = A((String) H1.C.zzc().zza(AbstractC4439th.zzhE));
            listA = A((String) H1.C.zzc().zza(AbstractC4439th.zzhF));
        } else {
            this.f4393w = f4362F;
            this.f4394x = f4363G;
            this.f4395y = f4364H;
            listA = f4365I;
        }
        this.f4396z = listA;
    }

    private static final List A(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!AbstractC1802Qj0.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ RunnableC4660vd0 H(com.google.common.util.concurrent.C c9, C2103Xs c2103Xs) {
        if (!RunnableC5002yd0.zza() || !((Boolean) AbstractC3302ji.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            RunnableC4660vd0 runnableC4660vd0Zza = ((Y) AbstractC1483In0.zzp(c9)).zza();
            runnableC4660vd0Zza.zze(new ArrayList(Collections.singletonList(c2103Xs.zzb)));
            Y1 y12 = c2103Xs.zzd;
            runnableC4660vd0Zza.zzb(y12 == null ? "" : y12.zzp);
            runnableC4660vd0Zza.zzg(c2103Xs.zzd.zzm);
            return runnableC4660vd0Zza;
        } catch (ExecutionException e8) {
            G1.u.zzo().zzw(e8, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void i(BinderC0733l binderC0733l, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (binderC0733l.p((Uri) it.next())) {
                binderC0733l.f4389s.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri r(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? z(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final R1.Y s(android.content.Context r8, java.lang.String r9, java.lang.String r10, H1.d2 r11, H1.Y1 r12, android.os.Bundle r13) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Pa0 r0 = new com.google.android.gms.internal.ads.Pa0
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L19
            com.google.android.gms.internal.ads.Ba0 r2 = r0.zzp()
            r2.zza(r5)
            goto L26
        L19:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.Ba0 r2 = r0.zzp()
            r2.zza(r4)
        L26:
            com.google.android.gms.internal.ads.ax r2 = r7.f4371a
            R1.X r2 = r2.zzp()
            com.google.android.gms.internal.ads.gF r6 = new com.google.android.gms.internal.ads.gF
            r6.<init>()
            r6.zze(r8)
            if (r9 != 0) goto L38
            java.lang.String r9 = "adUnitId"
        L38:
            r0.zzt(r9)
            if (r12 != 0) goto L46
            H1.Z1 r9 = new H1.Z1
            r9.<init>()
            H1.Y1 r12 = r9.zza()
        L46:
            r0.zzH(r12)
            r9 = 1
            if (r11 != 0) goto Laa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L79;
                case -428325382: goto L6f;
                case 543046670: goto L67;
                case 1854800829: goto L5f;
                case 1951953708: goto L55;
                default: goto L54;
            }
        L54:
            goto L83
        L55:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 0
            goto L84
        L5f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L83
            r11 = r5
            goto L84
        L67:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L83
            r11 = r9
            goto L84
        L6f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r12
            goto L84
        L79:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r4
            goto L84
        L83:
            r11 = -1
        L84:
            if (r11 == 0) goto La3
            if (r11 == r9) goto L9e
            if (r11 == r5) goto L9e
            if (r11 == r4) goto L99
            if (r11 == r12) goto L94
            H1.d2 r11 = new H1.d2
            r11.<init>()
            goto Laa
        L94:
            H1.d2 r11 = H1.d2.zzb()
            goto Laa
        L99:
            H1.d2 r11 = H1.d2.zzc()
            goto Laa
        L9e:
            H1.d2 r11 = H1.d2.zzd()
            goto Laa
        La3:
            H1.d2 r11 = new H1.d2
            y1.i r12 = y1.C6528i.BANNER
            r11.<init>(r8, r12)
        Laa:
            r0.zzs(r11)
            r0.zzz(r9)
            r0.zzA(r13)
            com.google.android.gms.internal.ads.Ra0 r8 = r0.zzJ()
            r6.zzi(r8)
            com.google.android.gms.internal.ads.iF r8 = r6.zzj()
            r2.zza(r8)
            R1.o r8 = new R1.o
            r8.<init>()
            r8.zza(r10)
            R1.q r9 = new R1.q
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.uI r8 = new com.google.android.gms.internal.ads.uI
            r8.<init>()
            R1.Y r8 = r2.zzc()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.BinderC0733l.s(android.content.Context, java.lang.String, java.lang.String, H1.d2, H1.Y1, android.os.Bundle):R1.Y");
    }

    private final com.google.common.util.concurrent.C t(final String str) {
        final C4754wO[] c4754wOArr = new C4754wO[1];
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(this.f4375e.zza(), new InterfaceC3997pn0() { // from class: R1.b0
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.K(c4754wOArr, str, (C4754wO) obj);
            }
        }, this.f4376f);
        cZzn.addListener(new Runnable() { // from class: R1.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.k(c4754wOArr);
            }
        }, this.f4376f);
        return AbstractC1483In0.zze(AbstractC1483In0.zzm((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC5136zn0.zzu(cZzn), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzhL)).intValue(), TimeUnit.MILLISECONDS, this.f4377g), new InterfaceC3875oj0() { // from class: R1.d
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                int i8 = BinderC0733l.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f4376f), Exception.class, new InterfaceC3875oj0() { // from class: R1.e
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                int i8 = BinderC0733l.zze;
                L1.n.zzh("", (Exception) obj);
                return null;
            }
        }, this.f4376f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            this.f4370E.zzb();
        } else {
            AbstractC1483In0.zzr(((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlb)).booleanValue() ? AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: R1.Z
                @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
                public final com.google.common.util.concurrent.C zza() {
                    return this.zza.J();
                }
            }, AbstractC4805wt.zza) : s(this.f4372b, null, EnumC6522c.BANNER.name(), null, null, new Bundle()).zzb(), new C0732k(this), this.f4371a.zzB());
        }
    }

    private final void v() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjB)).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjE)).booleanValue()) {
                return;
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjI)).booleanValue() && this.f4366A.getAndSet(true)) {
                return;
            }
            u();
        }
    }

    private final void w(List list, final InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq, boolean z8) {
        com.google.common.util.concurrent.C cZzb;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhK)).booleanValue()) {
            L1.n.zzj("The updating URL feature is not enabled.");
            try {
                interfaceC3091hq.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                L1.n.zzh("", e8);
                return;
            }
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (p((Uri) it.next())) {
                i8++;
            }
        }
        if (i8 > 1) {
            L1.n.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (p(uri)) {
                cZzb = this.f4376f.zzb(new Callable() { // from class: R1.d0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.D(uri, interfaceC6172a);
                    }
                });
                if (zzY()) {
                    cZzb = AbstractC1483In0.zzn(cZzb, new InterfaceC3997pn0() { // from class: R1.e0
                        @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                        public final com.google.common.util.concurrent.C zza(Object obj) {
                            BinderC0733l binderC0733l = this.zza;
                            return AbstractC1483In0.zzm(binderC0733l.t("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new InterfaceC3875oj0() { // from class: R1.f0
                                @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                                public final Object apply(Object obj2) {
                                    return BinderC0733l.r(uri, (String) obj2);
                                }
                            }, binderC0733l.f4376f);
                        }
                    }, this.f4376f);
                } else {
                    L1.n.zzi("Asset view map is empty.");
                }
            } else {
                L1.n.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                cZzb = AbstractC1483In0.zzh(uri);
            }
            arrayList.add(cZzb);
        }
        AbstractC1483In0.zzr(AbstractC1483In0.zzd(arrayList), new C0731j(this, interfaceC3091hq, z8), this.f4371a.zzB());
    }

    private final void x(final List list, final InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq, boolean z8) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhK)).booleanValue()) {
            try {
                interfaceC3091hq.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                L1.n.zzh("", e8);
                return;
            }
        }
        com.google.common.util.concurrent.C cZzb = this.f4376f.zzb(new Callable() { // from class: R1.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.d(list, interfaceC6172a);
            }
        });
        if (zzY()) {
            cZzb = AbstractC1483In0.zzn(cZzb, new InterfaceC3997pn0() { // from class: R1.g
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final com.google.common.util.concurrent.C zza(Object obj) {
                    return this.zza.L((ArrayList) obj);
                }
            }, this.f4376f);
        } else {
            L1.n.zzi("Asset view map is empty.");
        }
        AbstractC1483In0.zzr(cZzb, new C0730i(this, interfaceC3091hq, z8), this.f4371a.zzB());
    }

    private static boolean y(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri z(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i8 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i8) + str + SimpleComparison.EQUAL_TO_OPERATION + str2 + "&" + string.substring(i8));
    }

    private final boolean zzY() {
        Map map;
        C3546lq c3546lq = this.f4378h;
        return (c3546lq == null || (map = c3546lq.zzb) == null || map.isEmpty()) ? false : true;
    }

    final /* synthetic */ Uri D(Uri uri, InterfaceC6172a interfaceC6172a) throws Exception {
        C1989Va0 c1989Va0;
        try {
            uri = (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlW)).booleanValue() || (c1989Va0 = this.f4374d) == null) ? this.f4373c.zza(uri, this.f4372b, (View) r2.b.unwrap(interfaceC6172a), null) : c1989Va0.zza(uri, this.f4372b, (View) r2.b.unwrap(interfaceC6172a), null);
        } catch (C2602db e8) {
            L1.n.zzk("", e8);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ Y G(C2103Xs c2103Xs, Bundle bundle) {
        return s(this.f4372b, c2103Xs.zza, c2103Xs.zzb, c2103Xs.zzc, c2103Xs.zzd, bundle);
    }

    final /* synthetic */ com.google.common.util.concurrent.C J() {
        return s(this.f4372b, null, EnumC6522c.BANNER.name(), null, null, new Bundle()).zzb();
    }

    final /* synthetic */ com.google.common.util.concurrent.C K(C4754wO[] c4754wOArr, String str, C4754wO c4754wO) throws JSONException {
        c4754wOArr[0] = c4754wO;
        Context context = this.f4372b;
        C3546lq c3546lq = this.f4378h;
        Map map = c3546lq.zzb;
        JSONObject jSONObjectZzd = AbstractC0630c0.zzd(context, map, map, c3546lq.zza, null);
        JSONObject jSONObjectZzg = AbstractC0630c0.zzg(this.f4372b, this.f4378h.zza);
        JSONObject jSONObjectZzf = AbstractC0630c0.zzf(this.f4378h.zza);
        JSONObject jSONObjectZze = AbstractC0630c0.zze(this.f4372b, this.f4378h.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", AbstractC0630c0.zzc(null, this.f4372b, this.f4380j, this.f4379i));
        }
        return c4754wO.zzg(str, jSONObject);
    }

    final /* synthetic */ com.google.common.util.concurrent.C L(final ArrayList arrayList) {
        return AbstractC1483In0.zzm(t("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new InterfaceC3875oj0() { // from class: R1.a0
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.c(arrayList, (String) obj);
            }
        }, this.f4376f);
    }

    final /* synthetic */ ArrayList c(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!q(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(z(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList d(List list, InterfaceC6172a interfaceC6172a) throws Exception {
        String strZzh = this.f4373c.zzc() != null ? this.f4373c.zzc().zzh(this.f4372b, (View) r2.b.unwrap(interfaceC6172a), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (q(uri)) {
                arrayList.add(z(uri, "ms", strZzh));
            } else {
                L1.n.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void k(C4754wO[] c4754wOArr) {
        C4754wO c4754wO = c4754wOArr[0];
        if (c4754wO != null) {
            this.f4375e.zzb(AbstractC1483In0.zzh(c4754wO));
        }
    }

    final boolean p(Uri uri) {
        return y(uri, this.f4393w, this.f4394x);
    }

    final boolean q(Uri uri) {
        return y(uri, this.f4395y, this.f4396z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final InterfaceC6172a zze(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, String str, InterfaceC6172a interfaceC6172a3) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjL)).booleanValue()) {
            return r2.b.wrap(null);
        }
        this.f4369D.zzg((Context) r2.b.unwrap(interfaceC6172a), (androidx.browser.customtabs.c) r2.b.unwrap(interfaceC6172a2), str, (androidx.browser.customtabs.b) r2.b.unwrap(interfaceC6172a3));
        if (((Boolean) AbstractC4669vi.zza.zze()).booleanValue()) {
            this.f4370E.zzb();
        }
        return r2.b.wrap(this.f4369D.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(r2.InterfaceC6172a r10, final com.google.android.gms.internal.ads.C2103Xs r11, com.google.android.gms.internal.ads.InterfaceC1816Qs r12) {
        /*
            r9 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzcd
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.tQ r0 = com.google.android.gms.internal.ads.EnumC4415tQ.PUBLIC_API_CALL
            java.lang.String r0 = r0.zza()
            H1.Y1 r1 = r11.zzd
            long r1 = r1.zzz
            r6.putLong(r0, r1)
            com.google.android.gms.internal.ads.tQ r0 = com.google.android.gms.internal.ads.EnumC4415tQ.DYNAMITE_ENTER
            java.lang.String r0 = r0.zza()
            o2.f r1 = G1.u.zzB()
            long r1 = r1.currentTimeMillis()
            r6.putLong(r0, r1)
        L35:
            java.lang.Object r0 = r2.b.unwrap(r10)
            android.content.Context r0 = (android.content.Context) r0
            r9.f4372b = r0
            com.google.android.gms.internal.ads.Cd0 r1 = com.google.android.gms.internal.ads.EnumC1217Cd0.CUI_NAME_SCAR_SIGNALS
            com.google.android.gms.internal.ads.kd0 r7 = com.google.android.gms.internal.ads.AbstractC3293jd0.zza(r0, r1)
            r7.zzj()
            java.lang.String r0 = r11.zzb
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.kh r1 = com.google.android.gms.internal.ads.AbstractC4439th.zzhJ
            com.google.android.gms.internal.ads.rh r2 = H1.C.zzc()
            java.lang.Object r2 = r2.zza(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L7b
            com.google.android.gms.internal.ads.rh r0 = H1.C.zzc()
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L7b:
            H1.Y1 r1 = r11.zzd
            java.lang.String r1 = R1.W.zzc(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown format is no longer supported."
            r0.<init>(r1)
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzg(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            com.google.common.util.concurrent.C r1 = com.google.android.gms.internal.ads.AbstractC1483In0.zzg(r2)
            r2 = r0
            r6 = r1
            goto Ldf
        L9e:
            com.google.android.gms.internal.ads.kh r0 = com.google.android.gms.internal.ads.AbstractC4439th.zzlb
            com.google.android.gms.internal.ads.rh r1 = H1.C.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc7
            com.google.android.gms.internal.ads.Un0 r0 = com.google.android.gms.internal.ads.AbstractC4805wt.zza
            R1.g0 r1 = new R1.g0
            r1.<init>()
            com.google.common.util.concurrent.C r1 = r0.zzb(r1)
            R1.c r2 = new R1.c
            r2.<init>()
            com.google.common.util.concurrent.C r0 = com.google.android.gms.internal.ads.AbstractC1483In0.zzn(r1, r2, r0)
        Lc4:
            r6 = r0
            r2 = r1
            goto Ldf
        Lc7:
            android.content.Context r1 = r9.f4372b
            java.lang.String r2 = r11.zza
            java.lang.String r3 = r11.zzb
            H1.d2 r4 = r11.zzc
            H1.Y1 r5 = r11.zzd
            r0 = r9
            R1.Y r0 = r0.s(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.C r1 = com.google.android.gms.internal.ads.AbstractC1483In0.zzh(r0)
            com.google.common.util.concurrent.C r0 = r0.zzb()
            goto Lc4
        Ldf:
            R1.h r8 = new R1.h
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.ax r0 = r9.f4371a
            java.util.concurrent.Executor r0 = r0.zzB()
            com.google.android.gms.internal.ads.AbstractC1483In0.zzr(r6, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.BinderC0733l.zzf(r2.a, com.google.android.gms.internal.ads.Xs, com.google.android.gms.internal.ads.Qs):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzg(C3546lq c3546lq) {
        this.f4378h = c3546lq;
        this.f4375e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzh(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        w(list, interfaceC6172a, interfaceC3091hq, true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzi(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        x(list, interfaceC6172a, interfaceC3091hq, true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzj(InterfaceC6172a interfaceC6172a) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjA)).booleanValue()) {
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zzhI;
            if (!((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                v();
            }
            WebView webView = (WebView) r2.b.unwrap(interfaceC6172a);
            if (webView == null) {
                L1.n.zzg("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new C0722a(webView, this.f4373c, this.f4381k, this.f4382l, this.f4374d, this.f4370E), "gmaSdk");
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjK)).booleanValue()) {
                G1.u.zzo().zzs();
            }
            if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                v();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzk(InterfaceC6172a interfaceC6172a) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhK)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) r2.b.unwrap(interfaceC6172a);
            C3546lq c3546lq = this.f4378h;
            this.f4379i = AbstractC0630c0.zza(motionEvent, c3546lq == null ? null : c3546lq.zza);
            if (motionEvent.getAction() == 0) {
                this.f4380j = this.f4379i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f4379i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f4373c.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzl(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        w(list, interfaceC6172a, interfaceC3091hq, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1898Ss, com.google.android.gms.internal.ads.InterfaceC1939Ts
    public final void zzm(List list, InterfaceC6172a interfaceC6172a, InterfaceC3091hq interfaceC3091hq) {
        x(list, interfaceC6172a, interfaceC3091hq, false);
    }
}
