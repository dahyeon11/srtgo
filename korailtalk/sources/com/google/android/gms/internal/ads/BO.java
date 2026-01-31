package com.google.android.gms.internal.ads;

import J1.InterfaceC0619b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class BO {

    /* renamed from: a, reason: collision with root package name */
    private final C4850xF f12273a;

    /* renamed from: b, reason: collision with root package name */
    private final C3144iG f12274b;

    /* renamed from: c, reason: collision with root package name */
    private final C4738wG f12275c;

    /* renamed from: d, reason: collision with root package name */
    private final IG f12276d;

    /* renamed from: e, reason: collision with root package name */
    private final ZH f12277e;

    /* renamed from: f, reason: collision with root package name */
    private final BJ f12278f;

    /* renamed from: g, reason: collision with root package name */
    private final LQ f12279g;

    /* renamed from: h, reason: collision with root package name */
    private final C3865oe0 f12280h;

    /* renamed from: i, reason: collision with root package name */
    private final C4535uW f12281i;

    /* renamed from: j, reason: collision with root package name */
    private final IA f12282j;

    BO(C4850xF c4850xF, C3144iG c3144iG, C4738wG c4738wG, IG ig, ZH zh, BJ bj, LQ lq, C3865oe0 c3865oe0, C4535uW c4535uW, IA ia) {
        this.f12273a = c4850xF;
        this.f12274b = c3144iG;
        this.f12275c = c4738wG;
        this.f12276d = ig;
        this.f12277e = zh;
        this.f12278f = bj;
        this.f12279g = lq;
        this.f12280h = c3865oe0;
        this.f12281i = c4535uW;
        this.f12282j = ia;
    }

    public final void zza(CO co, InterfaceC2065Wv interfaceC2065Wv) {
        C5096zO c5096zO = co.f12521a;
        final C3144iG c3144iG = this.f12274b;
        Objects.requireNonNull(c3144iG);
        c5096zO.b(this.f12273a, this.f12275c, this.f12276d, this.f12277e, new InterfaceC0619b() { // from class: com.google.android.gms.internal.ads.AO
            @Override // J1.InterfaceC0619b
            public final void zzg() {
                c3144iG.zzb();
            }
        }, this.f12278f);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkg)).booleanValue() || interfaceC2065Wv == null || interfaceC2065Wv.zzN() == null) {
            return;
        }
        InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
        interfaceC1861RwZzN.zzI(this.f12282j, this.f12281i, this.f12280h);
        interfaceC1861RwZzN.zzK(this.f12282j, this.f12281i, this.f12279g);
    }
}
