package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class VF0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16822a;
    public C4853xG0 zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;

    public VF0(C4853xG0 c4853xG0) {
        this.zza = c4853xG0;
    }

    public final void zza(int i8) {
        this.f16822a = 1 == ((this.f16822a ? 1 : 0) | i8);
        this.zzb += i8;
    }

    public final void zzb(int i8) {
        this.f16822a = true;
        this.zze = true;
        this.zzf = i8;
    }

    public final void zzc(C4853xG0 c4853xG0) {
        this.f16822a |= this.zza != c4853xG0;
        this.zza = c4853xG0;
    }

    public final void zzd(int i8) {
        if (this.zzc && this.zzd != 5) {
            F10.zzd(i8 == 5);
            return;
        }
        this.f16822a = true;
        this.zzc = true;
        this.zzd = i8;
    }
}
