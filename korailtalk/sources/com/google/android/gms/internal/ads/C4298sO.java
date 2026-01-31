package com.google.android.gms.internal.ads;

import J1.InterfaceC0619b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4298sO {

    /* renamed from: a, reason: collision with root package name */
    private final C4850xF f22630a;

    /* renamed from: b, reason: collision with root package name */
    private final C3144iG f22631b;

    /* renamed from: c, reason: collision with root package name */
    private final C4738wG f22632c;

    /* renamed from: d, reason: collision with root package name */
    private final IG f22633d;

    /* renamed from: e, reason: collision with root package name */
    private final ZH f22634e;

    /* renamed from: f, reason: collision with root package name */
    private final C4654va0 f22635f;

    /* renamed from: g, reason: collision with root package name */
    private final C4996ya0 f22636g;

    /* renamed from: h, reason: collision with root package name */
    private final IA f22637h;

    public C4298sO(C4850xF c4850xF, C3144iG c3144iG, C4738wG c4738wG, IG ig, ZH zh, C4654va0 c4654va0, C4996ya0 c4996ya0, IA ia) {
        this.f22630a = c4850xF;
        this.f22631b = c3144iG;
        this.f22632c = c4738wG;
        this.f22633d = ig;
        this.f22634e = zh;
        this.f22635f = c4654va0;
        this.f22636g = c4996ya0;
        this.f22637h = ia;
    }

    public final void zza(C4754wO c4754wO) {
        final C3144iG c3144iG = this.f22631b;
        C3273jO c3273jO = c4754wO.f23497a;
        Objects.requireNonNull(c3144iG);
        c3273jO.a(this.f22630a, this.f22632c, this.f22633d, this.f22634e, new InterfaceC0619b() { // from class: com.google.android.gms.internal.ads.rO
            @Override // J1.InterfaceC0619b
            public final void zzg() {
                c3144iG.zzb();
            }
        });
        c4754wO.zzh(this.f22635f, this.f22636g, this.f22637h);
    }
}
