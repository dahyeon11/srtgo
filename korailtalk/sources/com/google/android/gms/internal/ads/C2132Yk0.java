package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2132Yk0 {

    /* renamed from: a, reason: collision with root package name */
    private long f17412a;

    /* renamed from: b, reason: collision with root package name */
    private long f17413b;

    /* renamed from: c, reason: collision with root package name */
    private long f17414c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f17415d = new ThreadLocal();

    public C2132Yk0(long j8) {
        zzi(0L);
    }

    public static long zzg(long j8) {
        return (j8 * 1000000) / 90000;
    }

    public static long zzh(long j8) {
        return (j8 * 90000) / 1000000;
    }

    public final synchronized long zza(long j8) {
        try {
            if (!zzj()) {
                long jLongValue = this.f17412a;
                if (jLongValue == 9223372036854775806L) {
                    Long l8 = (Long) this.f17415d.get();
                    if (l8 == null) {
                        throw null;
                    }
                    jLongValue = l8.longValue();
                }
                this.f17413b = jLongValue - j8;
                notifyAll();
            }
            this.f17414c = j8;
        } catch (Throwable th) {
            throw th;
        }
        return j8 + this.f17413b;
    }

    public final synchronized long zzb(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j9 = this.f17414c;
            if (j9 != -9223372036854775807L) {
                long jZzh = zzh(j9);
                long j10 = (4294967296L + jZzh) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j8;
                j8 += j10 * 8589934592L;
                if (Math.abs(j11 - jZzh) < Math.abs(j8 - jZzh)) {
                    j8 = j11;
                }
            }
            return zza(zzg(j8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzc(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j9 = this.f17414c;
            if (j9 != -9223372036854775807L) {
                long jZzh = zzh(j9);
                long j10 = jZzh / 8589934592L;
                long j11 = (j10 * 8589934592L) + j8;
                j8 += (j10 + 1) * 8589934592L;
                if (j11 >= jZzh) {
                    j8 = j11;
                }
            }
            return zza(zzg(j8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzd() {
        long j8 = this.f17412a;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long zze() {
        long j8;
        try {
            j8 = this.f17414c;
        } catch (Throwable th) {
            throw th;
        }
        return j8 != -9223372036854775807L ? j8 + this.f17413b : zzd();
    }

    public final synchronized long zzf() {
        return this.f17413b;
    }

    public final synchronized void zzi(long j8) {
        this.f17412a = j8;
        this.f17413b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f17414c = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.f17413b != -9223372036854775807L;
    }
}
