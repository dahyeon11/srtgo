package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import J1.InterfaceC0619b;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3162iP {

    /* renamed from: a, reason: collision with root package name */
    private final C4850xF f19916a;

    /* renamed from: b, reason: collision with root package name */
    private final BJ f19917b;

    /* renamed from: c, reason: collision with root package name */
    private final C3144iG f19918c;

    /* renamed from: d, reason: collision with root package name */
    private final C4738wG f19919d;

    /* renamed from: e, reason: collision with root package name */
    private final IG f19920e;

    /* renamed from: f, reason: collision with root package name */
    private final ZH f19921f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f19922g;

    /* renamed from: h, reason: collision with root package name */
    private final C4858xJ f19923h;

    /* renamed from: i, reason: collision with root package name */
    private final C2904gB f19924i;

    /* renamed from: j, reason: collision with root package name */
    private final G1.b f19925j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC4233rs f19926k;

    /* renamed from: l, reason: collision with root package name */
    private final C2487cb f19927l;

    /* renamed from: m, reason: collision with root package name */
    private final PH f19928m;

    /* renamed from: n, reason: collision with root package name */
    private final C4535uW f19929n;

    /* renamed from: o, reason: collision with root package name */
    private final C3865oe0 f19930o;

    /* renamed from: p, reason: collision with root package name */
    private final LQ f19931p;

    /* renamed from: q, reason: collision with root package name */
    private final IA f19932q;

    /* renamed from: r, reason: collision with root package name */
    private final C3845oP f19933r;

    public C3162iP(C4850xF c4850xF, C3144iG c3144iG, C4738wG c4738wG, IG ig, ZH zh, Executor executor, C4858xJ c4858xJ, C2904gB c2904gB, G1.b bVar, InterfaceC4233rs interfaceC4233rs, C2487cb c2487cb, PH ph, C4535uW c4535uW, C3865oe0 c3865oe0, LQ lq, BJ bj, IA ia, C3845oP c3845oP) {
        this.f19916a = c4850xF;
        this.f19918c = c3144iG;
        this.f19919d = c4738wG;
        this.f19920e = ig;
        this.f19921f = zh;
        this.f19922g = executor;
        this.f19923h = c4858xJ;
        this.f19924i = c2904gB;
        this.f19925j = bVar;
        this.f19926k = interfaceC4233rs;
        this.f19927l = c2487cb;
        this.f19928m = ph;
        this.f19929n = c4535uW;
        this.f19930o = c3865oe0;
        this.f19931p = lq;
        this.f19917b = bj;
        this.f19932q = ia;
        this.f19933r = c3845oP;
    }

    public static final com.google.common.util.concurrent.C zzj(InterfaceC2065Wv interfaceC2065Wv, String str, String str2) {
        final C1203Bt c1203Bt = new C1203Bt();
        interfaceC2065Wv.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.YO
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str3, String str4) {
                C1203Bt c1203Bt2 = c1203Bt;
                if (z8) {
                    c1203Bt2.zzc(null);
                    return;
                }
                c1203Bt2.zzd(new Exception("Ad Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC2065Wv.zzae(str, str2, null);
        return c1203Bt;
    }

    final /* synthetic */ void c() {
        this.f19916a.onAdClicked();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f19921f.zzb(str, str2);
    }

    final /* synthetic */ void e() {
        this.f19918c.zzb();
    }

    final /* synthetic */ void f(View view) {
        this.f19925j.zza();
    }

    final /* synthetic */ void g(InterfaceC2065Wv interfaceC2065Wv, InterfaceC2065Wv interfaceC2065Wv2, Map map) {
        this.f19924i.zzh(interfaceC2065Wv);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f19933r.zzb(motionEvent);
        }
        this.f19925j.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final InterfaceC2065Wv interfaceC2065Wv, boolean z8, C2622dl c2622dl) {
        InterfaceC2070Xa interfaceC2070XaZzc;
        interfaceC2065Wv.zzN().zzR(new InterfaceC0517a() { // from class: com.google.android.gms.internal.ads.ZO
            @Override // H1.InterfaceC0517a
            public final void onAdClicked() {
                this.zza.c();
            }
        }, this.f19919d, this.f19920e, new InterfaceC4217rk() { // from class: com.google.android.gms.internal.ads.aP
            @Override // com.google.android.gms.internal.ads.InterfaceC4217rk
            public final void zzb(String str, String str2) {
                this.zza.d(str, str2);
            }
        }, new InterfaceC0619b() { // from class: com.google.android.gms.internal.ads.bP
            @Override // J1.InterfaceC0619b
            public final void zzg() {
                this.zza.e();
            }
        }, z8, c2622dl, this.f19925j, new C3047hP(this), this.f19926k, this.f19929n, this.f19930o, this.f19931p, null, this.f19917b, null, null, null, this.f19932q);
        interfaceC2065Wv.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.cP
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.h(view, motionEvent);
                return false;
            }
        });
        interfaceC2065Wv.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.dP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.f(view);
            }
        });
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcD)).booleanValue() && (interfaceC2070XaZzc = this.f19927l.zzc()) != null) {
            interfaceC2070XaZzc.zzo((View) interfaceC2065Wv);
        }
        this.f19923h.zzo(interfaceC2065Wv, this.f19922g);
        this.f19923h.zzo(new InterfaceC1992Vc() { // from class: com.google.android.gms.internal.ads.eP
            @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
            public final void zzdp(C1951Uc c1951Uc) {
                InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
                Rect rect = c1951Uc.zzd;
                interfaceC1861RwZzN.zzq(rect.left, rect.top, false);
            }
        }, this.f19922g);
        this.f19923h.zza((View) interfaceC2065Wv);
        interfaceC2065Wv.zzag("/trackActiveViewUnit", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.gP
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.g(interfaceC2065Wv, (InterfaceC2065Wv) obj, map);
            }
        });
        this.f19924i.zzi(interfaceC2065Wv);
    }
}
