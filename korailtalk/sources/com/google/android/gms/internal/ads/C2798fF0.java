package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.fF0 */
/* loaded from: classes2.dex */
public final class C2798fF0 {

    /* renamed from: a */
    final Context f19143a;

    /* renamed from: b */
    InterfaceC3002h20 f19144b;

    /* renamed from: c */
    InterfaceC1843Rj0 f19145c;

    /* renamed from: d */
    InterfaceC1843Rj0 f19146d;

    /* renamed from: e */
    InterfaceC1843Rj0 f19147e;

    /* renamed from: f */
    InterfaceC1843Rj0 f19148f;

    /* renamed from: g */
    InterfaceC1843Rj0 f19149g;

    /* renamed from: h */
    InterfaceC3875oj0 f19150h;

    /* renamed from: i */
    Looper f19151i;

    /* renamed from: j */
    C3940pF0 f19152j;

    /* renamed from: k */
    int f19153k;

    /* renamed from: l */
    boolean f19154l;

    /* renamed from: m */
    IG0 f19155m;

    /* renamed from: n */
    long f19156n;

    /* renamed from: o */
    long f19157o;

    /* renamed from: p */
    boolean f19158p;

    /* renamed from: q */
    boolean f19159q;

    /* renamed from: r */
    String f19160r;

    /* renamed from: s */
    PE0 f19161s;

    public C2798fF0(final Context context, C1369Fv c1369Fv) {
        YE0 ye0 = new YE0(c1369Fv);
        ZE0 ze0 = new ZE0(context);
        InterfaceC1843Rj0 interfaceC1843Rj0 = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.aF0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return new NO0(context);
            }
        };
        InterfaceC1843Rj0 interfaceC1843Rj02 = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.bF0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return new SE0();
            }
        };
        C2454cF0 c2454cF0 = new C2454cF0(context);
        InterfaceC3875oj0 interfaceC3875oj0 = new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.dF0
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return new UH0((InterfaceC3002h20) obj);
            }
        };
        context.getClass();
        this.f19143a = context;
        this.f19145c = ye0;
        this.f19146d = ze0;
        this.f19147e = interfaceC1843Rj0;
        this.f19148f = interfaceC1843Rj02;
        this.f19149g = c2454cF0;
        this.f19150h = interfaceC3875oj0;
        this.f19151i = AbstractC2281am0.zzy();
        this.f19152j = C3940pF0.zza;
        this.f19153k = 1;
        this.f19154l = true;
        this.f19155m = IG0.zze;
        this.f19161s = new PE0(0.97f, 1.03f, 1000L, 1.0E-7f, AbstractC2281am0.zzr(20L), AbstractC2281am0.zzr(500L), 0.999f, null);
        this.f19144b = InterfaceC3002h20.zza;
        this.f19156n = 500L;
        this.f19157o = 2000L;
        this.f19158p = true;
        this.f19160r = "";
    }

    static /* synthetic */ MM0 a(Context context) {
        return new AM0(context, new V0());
    }
}
