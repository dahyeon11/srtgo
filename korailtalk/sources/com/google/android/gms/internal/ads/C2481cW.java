package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.cW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2481cW implements InterfaceC2378bd0 {

    /* renamed from: a, reason: collision with root package name */
    private final PV f18312a;

    /* renamed from: b, reason: collision with root package name */
    private final TV f18313b;

    C2481cW(PV pv, TV tv) {
        this.f18312a = pv;
        this.f18313b = tv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzd(EnumC1952Uc0 enumC1952Uc0, String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue() && EnumC1952Uc0.RENDERER == enumC1952Uc0 && this.f18312a.zzc() != 0) {
            this.f18312a.zzf(G1.u.zzB().elapsedRealtime() - this.f18312a.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdC(EnumC1952Uc0 enumC1952Uc0, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdD(EnumC1952Uc0 enumC1952Uc0, String str, Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue() && EnumC1952Uc0.RENDERER == enumC1952Uc0 && this.f18312a.zzc() != 0) {
            this.f18312a.zzf(G1.u.zzB().elapsedRealtime() - this.f18312a.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2378bd0
    public final void zzdE(EnumC1952Uc0 enumC1952Uc0, String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue()) {
            if (EnumC1952Uc0.RENDERER == enumC1952Uc0) {
                this.f18312a.zzg(G1.u.zzB().elapsedRealtime());
                return;
            }
            if (EnumC1952Uc0.PRELOADED_LOADER == enumC1952Uc0 || EnumC1952Uc0.SERVER_TRANSACTION == enumC1952Uc0) {
                this.f18312a.zzh(G1.u.zzB().elapsedRealtime());
                final TV tv = this.f18313b;
                final long jZzd = this.f18312a.zzd();
                tv.f17572b.zza(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.SV
                    @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (tv.a()) {
                            return null;
                        }
                        long j8 = jZzd;
                        C2037We c2037WeZzn = C1996Ve.zzn();
                        c2037WeZzn.zzP(j8);
                        byte[] bArrZzaV = ((C1996Ve) c2037WeZzn.zzbr()).zzaV();
                        AbstractC2367bW.zzf(sQLiteDatabase, false, false);
                        AbstractC2367bW.zzc(sQLiteDatabase, j8, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }
}
