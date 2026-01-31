package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4809wv implements Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ky0 f23558a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23559b;

    /* renamed from: c, reason: collision with root package name */
    private final Ky0 f23560c;

    /* renamed from: d, reason: collision with root package name */
    private long f23561d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f23562e;

    C4809wv(Ky0 ky0, int i8, Ky0 ky02) {
        this.f23558a = ky0;
        this.f23559b = i8;
        this.f23560c = ky02;
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        int i10;
        long j8 = this.f23561d;
        long j9 = this.f23559b;
        if (j8 < j9) {
            int iZza = this.f23558a.zza(bArr, i8, (int) Math.min(i9, j9 - j8));
            long j10 = this.f23561d + iZza;
            this.f23561d = j10;
            i10 = iZza;
            j8 = j10;
        } else {
            i10 = 0;
        }
        if (j8 < this.f23559b) {
            return i10;
        }
        int iZza2 = this.f23560c.zza(bArr, i8 + i10, i9 - i10);
        int i11 = i10 + iZza2;
        this.f23561d += iZza2;
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) {
        NB0 nb02;
        this.f23562e = nb0.zza;
        long j8 = nb0.zze;
        long j9 = this.f23559b;
        NB0 nb03 = null;
        if (j8 >= j9) {
            nb02 = null;
        } else {
            long j10 = nb0.zzf;
            long jMin = j9 - j8;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            nb02 = new NB0(nb0.zza, j8, jMin, null);
        }
        long j11 = nb0.zzf;
        if (j11 == -1 || nb0.zze + j11 > this.f23559b) {
            long jMax = Math.max(this.f23559b, nb0.zze);
            long j12 = nb0.zzf;
            nb03 = new NB0(nb0.zza, jMax, j12 != -1 ? Math.min(j12, (nb0.zze + j12) - this.f23559b) : -1L, null);
        }
        long jZzb = nb02 != null ? this.f23558a.zzb(nb02) : 0L;
        long jZzb2 = nb03 != null ? this.f23560c.zzb(nb03) : 0L;
        this.f23561d = nb0.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f23562e;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f23558a.zzd();
        this.f23560c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        return AbstractC2737el0.zzd();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
    }
}
