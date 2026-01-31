package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class X90 implements U1.a, InterfaceC3941pG, CF, InterfaceC5078zF, RF, NG, InterfaceC3016h90, DJ {

    /* renamed from: a, reason: collision with root package name */
    private final C1213Cb0 f17137a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f17138b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f17139c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f17140d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f17141e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f17142f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f17143g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f17144h = new AtomicReference();

    public X90(C1213Cb0 c1213Cb0) {
        this.f17137a = c1213Cb0;
    }

    @Override // U1.a
    public final void onAdMetadataChanged() {
        X80.zza(this.f17138b, new W80() { // from class: com.google.android.gms.internal.ads.L90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((U1.a) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
        this.f17137a.zza();
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.T90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zzg();
            }
        });
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.U90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.V90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.F90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zzj();
            }
        });
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.G90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzj();
            }
        });
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.H90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(final C0534f1 c0534f1) {
        final int i8 = c0534f1.zza;
        X80.zza(this.f17139c, new W80() { // from class: com.google.android.gms.internal.ads.Q90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1856Rr) obj).zzf(c0534f1);
            }
        });
        X80.zza(this.f17139c, new W80() { // from class: com.google.android.gms.internal.ads.R90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1856Rr) obj).zze(i8);
            }
        });
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.S90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzg(i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.M90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(final InterfaceC4118qr interfaceC4118qr, final String str, final String str2) {
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.W90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                InterfaceC4118qr interfaceC4118qr2 = interfaceC4118qr;
                ((InterfaceC1692Nr) obj).zzk(new BinderC2407bs(interfaceC4118qr2.zzc(), interfaceC4118qr2.zzb()));
            }
        });
        X80.zza(this.f17142f, new W80() { // from class: com.google.android.gms.internal.ads.C90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                InterfaceC4118qr interfaceC4118qr2 = interfaceC4118qr;
                ((C1897Sr) obj).zze(new BinderC2407bs(interfaceC4118qr2.zzc(), interfaceC4118qr2.zzb()), str, str2);
            }
        });
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.D90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zze(interfaceC4118qr);
            }
        });
        X80.zza(this.f17143g, new W80() { // from class: com.google.android.gms.internal.ads.E90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((C4231rr) obj).zze(interfaceC4118qr, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.P90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.B90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzl();
            }
        });
    }

    public final void zzg(U1.a aVar) {
        this.f17138b.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void zzh(final H1.f2 f2Var) {
        X80.zza(this.f17144h, new W80() { // from class: com.google.android.gms.internal.ads.I90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.L0) obj).zze(f2Var);
            }
        });
    }

    public final void zzi(H1.L0 l02) {
        this.f17144h.set(l02);
    }

    public final void zzj(InterfaceC1692Nr interfaceC1692Nr) {
        this.f17140d.set(interfaceC1692Nr);
    }

    public final void zzk(InterfaceC1856Rr interfaceC1856Rr) {
        this.f17139c.set(interfaceC1856Rr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3016h90
    public final void zzl(InterfaceC3016h90 interfaceC3016h90) {
        throw null;
    }

    @Deprecated
    public final void zzm(InterfaceC4801wr interfaceC4801wr) {
        this.f17141e.set(interfaceC4801wr);
    }

    @Deprecated
    public final void zzn(C4231rr c4231rr) {
        this.f17143g.set(c4231rr);
    }

    public final void zzo(C1897Sr c1897Sr) {
        this.f17142f.set(c1897Sr);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(final C0534f1 c0534f1) {
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.N90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zzi(c0534f1);
            }
        });
        X80.zza(this.f17140d, new W80() { // from class: com.google.android.gms.internal.ads.O90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1692Nr) obj).zzh(c0534f1.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        X80.zza(this.f17139c, new W80() { // from class: com.google.android.gms.internal.ads.J90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC1856Rr) obj).zzg();
            }
        });
        X80.zza(this.f17141e, new W80() { // from class: com.google.android.gms.internal.ads.K90
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC4801wr) obj).zzi();
            }
        });
    }
}
