package com.google.android.gms.internal.ads;

import H1.C0534f1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.p80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3926p80 implements CF, BG, InterfaceC3016h90, J1.w, NG, RF, DJ {

    /* renamed from: a, reason: collision with root package name */
    private final C1213Cb0 f21674a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f21675b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f21676c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f21677d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f21678e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f21679f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f21680g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private C3926p80 f21681h = null;

    public C3926p80(C1213Cb0 c1213Cb0) {
        this.f21674a = c1213Cb0;
    }

    public static C3926p80 zzi(C3926p80 c3926p80) {
        C3926p80 c3926p802 = new C3926p80(c3926p80.f21674a);
        c3926p802.f21681h = c3926p80;
        return c3926p802;
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(final C0534f1 c0534f1) {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdB(c0534f1);
        } else {
            X80.zza(this.f21675b, new W80() { // from class: com.google.android.gms.internal.ads.k80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC1871Sd) obj).zzc(c0534f1);
                }
            });
            X80.zza(this.f21675b, new W80() { // from class: com.google.android.gms.internal.ads.l80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC1871Sd) obj).zzb(c0534f1.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdG();
        } else {
            X80.zza(this.f21677d, new W80() { // from class: com.google.android.gms.internal.ads.g80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC2035Wd) obj).zzb();
                }
            });
        }
    }

    @Override // J1.w
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
    }

    @Override // J1.w
    public final void zzdk() {
    }

    @Override // J1.w
    public final void zzdq() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdq();
        } else {
            X80.zza(this.f21679f, new W80() { // from class: com.google.android.gms.internal.ads.d80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((J1.w) obj).zzdq();
                }
            });
        }
    }

    @Override // J1.w
    public final void zzdr() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdr();
            return;
        }
        X80.zza(this.f21679f, new W80() { // from class: com.google.android.gms.internal.ads.o80
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((J1.w) obj).zzdr();
            }
        });
        X80.zza(this.f21677d, new W80() { // from class: com.google.android.gms.internal.ads.b80
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC2035Wd) obj).zzf();
            }
        });
        X80.zza(this.f21677d, new W80() { // from class: com.google.android.gms.internal.ads.c80
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC2035Wd) obj).zze();
            }
        });
    }

    @Override // J1.w
    public final void zzdt() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdt();
        } else {
            X80.zza(this.f21679f, new W80() { // from class: com.google.android.gms.internal.ads.n80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((J1.w) obj).zzdt();
                }
            });
        }
    }

    @Override // J1.w
    public final void zzdu(final int i8) {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzdu(i8);
        } else {
            X80.zza(this.f21679f, new W80() { // from class: com.google.android.gms.internal.ads.j80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((J1.w) obj).zzdu(i8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.BG
    public final void zzg() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzg();
        } else {
            X80.zza(this.f21678e, new W80() { // from class: com.google.android.gms.internal.ads.m80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((BG) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void zzh(final H1.f2 f2Var) {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzh(f2Var);
        } else {
            X80.zza(this.f21680g, new W80() { // from class: com.google.android.gms.internal.ads.a80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((H1.L0) obj).zze(f2Var);
                }
            });
        }
    }

    public final void zzj() {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzj();
            return;
        }
        this.f21674a.zza();
        X80.zza(this.f21676c, new W80() { // from class: com.google.android.gms.internal.ads.h80
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                android.support.v4.media.session.f.a(obj);
                throw null;
            }
        });
        X80.zza(this.f21677d, new W80() { // from class: com.google.android.gms.internal.ads.i80
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC2035Wd) obj).zzc();
            }
        });
    }

    public final void zzk(final InterfaceC1748Pd interfaceC1748Pd) {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzk(interfaceC1748Pd);
        } else {
            X80.zza(this.f21675b, new W80() { // from class: com.google.android.gms.internal.ads.f80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC1871Sd) obj).zzd(interfaceC1748Pd);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3016h90
    public final void zzl(InterfaceC3016h90 interfaceC3016h90) {
        this.f21681h = (C3926p80) interfaceC3016h90;
    }

    public final void zzm(J1.w wVar) {
        this.f21679f.set(wVar);
    }

    public final void zzn(H1.L0 l02) {
        this.f21680g.set(l02);
    }

    public final void zzo(InterfaceC1871Sd interfaceC1871Sd) {
        this.f21675b.set(interfaceC1871Sd);
    }

    public final void zzp(InterfaceC2035Wd interfaceC2035Wd) {
        this.f21677d.set(interfaceC2035Wd);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(final C0534f1 c0534f1) {
        C3926p80 c3926p80 = this.f21681h;
        if (c3926p80 != null) {
            c3926p80.zzq(c0534f1);
        } else {
            X80.zza(this.f21677d, new W80() { // from class: com.google.android.gms.internal.ads.e80
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC2035Wd) obj).zzd(c0534f1);
                }
            });
        }
    }
}
