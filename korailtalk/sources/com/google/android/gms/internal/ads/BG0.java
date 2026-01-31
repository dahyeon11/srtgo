package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class BG0 extends BM0 {

    /* renamed from: e, reason: collision with root package name */
    private final C4055qG f12260e;

    BG0(CG0 cg0, RG rg) {
        super(rg);
        this.f12260e = new C4055qG();
    }

    @Override // com.google.android.gms.internal.ads.BM0, com.google.android.gms.internal.ads.RG
    public final C3711nF zzd(int i8, C3711nF c3711nF, boolean z8) {
        C3711nF c3711nFZzd = this.f12272d.zzd(i8, c3711nF, z8);
        if (this.f12272d.zze(c3711nFZzd.zzd, this.f12260e, 0L).zzb()) {
            c3711nFZzd.zzl(c3711nF.zzb, c3711nF.zzc, c3711nF.zzd, c3711nF.zze, 0L, OF.zza, true);
        } else {
            c3711nFZzd.zzg = true;
        }
        return c3711nFZzd;
    }
}
