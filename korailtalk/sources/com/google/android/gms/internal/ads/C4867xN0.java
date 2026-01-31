package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: com.google.android.gms.internal.ads.xN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4867xN0 implements YO0 {
    public long zza;
    public long zzb;
    public XO0 zzc;
    public C4867xN0 zzd;

    public C4867xN0(long j8, int i8) {
        zze(j8, 65536);
    }

    public final int zza(long j8) {
        long j9 = j8 - this.zza;
        int i8 = this.zzc.zzb;
        return (int) j9;
    }

    public final C4867xN0 zzb() {
        this.zzc = null;
        C4867xN0 c4867xN0 = this.zzd;
        this.zzd = null;
        return c4867xN0;
    }

    @Override // com.google.android.gms.internal.ads.YO0
    public final XO0 zzc() {
        XO0 xo0 = this.zzc;
        xo0.getClass();
        return xo0;
    }

    @Override // com.google.android.gms.internal.ads.YO0
    public final YO0 zzd() {
        C4867xN0 c4867xN0 = this.zzd;
        if (c4867xN0 == null || c4867xN0.zzc == null) {
            return null;
        }
        return c4867xN0;
    }

    public final void zze(long j8, int i8) {
        F10.zzf(this.zzc == null);
        this.zza = j8;
        this.zzb = j8 + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
