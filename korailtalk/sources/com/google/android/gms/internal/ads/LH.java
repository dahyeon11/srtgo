package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;

/* loaded from: classes2.dex */
public final class LH implements z1.e, U1.a, InterfaceC5078zF, InterfaceC0517a, NG, VF, BG, J1.w, RF, DJ {

    /* renamed from: a */
    private final JH f14275a = new JH(this, null);

    /* renamed from: b */
    private C3000h10 f14276b;

    /* renamed from: c */
    private C3456l10 f14277c;

    /* renamed from: d */
    private C3926p80 f14278d;

    /* renamed from: e */
    private X90 f14279e;

    private static void e(Object obj, KH kh) {
        if (obj != null) {
            kh.zza(obj);
        }
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.aH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).onAdClicked();
            }
        });
        e(this.f14277c, new KH() { // from class: com.google.android.gms.internal.ads.bH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3456l10) obj).onAdClicked();
            }
        });
    }

    @Override // U1.a
    public final void onAdMetadataChanged() {
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.gH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // z1.e
    public final void onAppEvent(final String str, final String str2) {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.mH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.GH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zza();
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.HH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.zH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzb();
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.AH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.hH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzc();
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.iH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.wH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzdG();
            }
        });
        e(this.f14277c, new KH() { // from class: com.google.android.gms.internal.ads.BH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3456l10) obj).zzdG();
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.CH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzdG();
            }
        });
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.DH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzdG();
            }
        });
    }

    @Override // J1.w
    public final void zzdH() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.uH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.nH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzdf();
            }
        });
    }

    @Override // J1.w
    public final void zzdk() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.fH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
            }
        });
    }

    @Override // J1.w
    public final void zzdq() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.tH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzdq();
            }
        });
    }

    @Override // J1.w
    public final void zzdr() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.oH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(final InterfaceC4118qr interfaceC4118qr, final String str, final String str2) {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.jH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.lH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzds(interfaceC4118qr, str, str2);
            }
        });
    }

    @Override // J1.w
    public final void zzdt() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.vH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzdt();
            }
        });
    }

    @Override // J1.w
    public final void zzdu(final int i8) {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.xH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzdu(i8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.ZG
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.kH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.cH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.dH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.BG
    public final void zzg() {
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.yH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void zzh(final H1.f2 f2Var) {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.pH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzh(f2Var);
            }
        });
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.qH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzh(f2Var);
            }
        });
        e(this.f14278d, new KH() { // from class: com.google.android.gms.internal.ads.rH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3926p80) obj).zzh(f2Var);
            }
        });
    }

    public final JH zzi() {
        return this.f14275a;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(final C0534f1 c0534f1) {
        e(this.f14279e, new KH() { // from class: com.google.android.gms.internal.ads.EH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((X90) obj).zzq(c0534f1);
            }
        });
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.FH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzq(c0534f1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        e(this.f14276b, new KH() { // from class: com.google.android.gms.internal.ads.eH
            @Override // com.google.android.gms.internal.ads.KH
            public final void zza(Object obj) {
                ((C3000h10) obj).zzr();
            }
        });
    }
}
