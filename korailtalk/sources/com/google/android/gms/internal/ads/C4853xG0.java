package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4853xG0 {

    /* renamed from: a, reason: collision with root package name */
    private static final NM0 f23679a = new NM0(new Object(), -1);
    public final RG zza;
    public final NM0 zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final WE0 zzf;
    public final boolean zzg;
    public final SN0 zzh;
    public final WO0 zzi;
    public final List zzj;
    public final NM0 zzk;
    public final boolean zzl;
    public final int zzm;
    public final C2149Yx zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public C4853xG0(RG rg, NM0 nm0, long j8, long j9, int i8, WE0 we0, boolean z8, SN0 sn0, WO0 wo0, List list, NM0 nm02, boolean z9, int i9, C2149Yx c2149Yx, long j10, long j11, long j12, long j13, boolean z10) {
        this.zza = rg;
        this.zzb = nm0;
        this.zzc = j8;
        this.zzd = j9;
        this.zze = i8;
        this.zzf = we0;
        this.zzg = z8;
        this.zzh = sn0;
        this.zzi = wo0;
        this.zzj = list;
        this.zzk = nm02;
        this.zzl = z9;
        this.zzm = i9;
        this.zzn = c2149Yx;
        this.zzp = j10;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
    }

    public static C4853xG0 zzg(WO0 wo0) {
        RG rg = RG.zza;
        NM0 nm0 = f23679a;
        return new C4853xG0(rg, nm0, -9223372036854775807L, 0L, 1, null, false, SN0.zza, wo0, AbstractC2394bl0.zzm(), nm0, false, 0, C2149Yx.zza, 0L, 0L, 0L, 0L, false);
    }

    public static NM0 zzh() {
        return f23679a;
    }

    public final C4853xG0 zza(NM0 nm0) {
        return new C4853xG0(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, nm0, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final C4853xG0 zzb(NM0 nm0, long j8, long j9, long j10, long j11, SN0 sn0, WO0 wo0, List list) {
        NM0 nm02 = this.zzk;
        boolean z8 = this.zzl;
        int i8 = this.zzm;
        C2149Yx c2149Yx = this.zzn;
        long j12 = this.zzp;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new C4853xG0(this.zza, nm0, j9, j10, this.zze, this.zzf, this.zzg, sn0, wo0, list, nm02, z8, i8, c2149Yx, j12, j11, j8, jElapsedRealtime, false);
    }

    public final C4853xG0 zzc(boolean z8, int i8) {
        return new C4853xG0(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z8, i8, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final C4853xG0 zzd(WE0 we0) {
        return new C4853xG0(this.zza, this.zzb, this.zzc, this.zzd, this.zze, we0, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final C4853xG0 zze(int i8) {
        return new C4853xG0(this.zza, this.zzb, this.zzc, this.zzd, i8, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final C4853xG0 zzf(RG rg) {
        return new C4853xG0(rg, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
