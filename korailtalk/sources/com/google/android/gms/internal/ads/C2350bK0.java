package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.bK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2350bK0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2235aK0 f18109a;

    /* renamed from: b, reason: collision with root package name */
    private int f18110b;

    /* renamed from: c, reason: collision with root package name */
    private long f18111c;

    /* renamed from: d, reason: collision with root package name */
    private long f18112d;

    /* renamed from: e, reason: collision with root package name */
    private long f18113e;

    /* renamed from: f, reason: collision with root package name */
    private long f18114f;

    public C2350bK0(AudioTrack audioTrack) {
        this.f18109a = new C2235aK0(audioTrack);
        a(0);
    }

    private final void a(int i8) {
        this.f18110b = i8;
        long j8 = H0.y.MIN_BACKOFF_MILLIS;
        if (i8 == 0) {
            this.f18113e = 0L;
            this.f18114f = -1L;
            this.f18111c = System.nanoTime() / 1000;
        } else {
            if (i8 == 1) {
                this.f18112d = H0.y.MIN_BACKOFF_MILLIS;
                return;
            }
            j8 = (i8 == 2 || i8 == 3) ? 10000000L : 500000L;
        }
        this.f18112d = j8;
    }

    public final long zza() {
        return this.f18109a.zza();
    }

    public final long zzb() {
        return this.f18109a.zzb();
    }

    public final void zzc() {
        if (this.f18110b == 4) {
            a(0);
        }
    }

    public final void zzd() {
        a(4);
    }

    public final void zze() {
        a(0);
    }

    public final boolean zzf() {
        return this.f18110b == 2;
    }

    public final boolean zzg(long j8) {
        if (j8 - this.f18113e < this.f18112d) {
            return false;
        }
        this.f18113e = j8;
        boolean zZzc = this.f18109a.zzc();
        int i8 = this.f18110b;
        if (i8 == 0) {
            if (!zZzc) {
                if (j8 - this.f18111c <= 500000) {
                    return false;
                }
                a(3);
                return false;
            }
            if (this.f18109a.zzb() < this.f18111c) {
                return false;
            }
            this.f18114f = this.f18109a.zza();
            a(1);
            return true;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return zZzc;
                }
                if (!zZzc) {
                    return false;
                }
                a(0);
                return true;
            }
            if (!zZzc) {
                a(0);
                return false;
            }
        } else {
            if (!zZzc) {
                a(0);
                return false;
            }
            if (this.f18109a.zza() > this.f18114f) {
                a(2);
                return true;
            }
        }
        return true;
    }
}
