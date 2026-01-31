package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PV {

    /* renamed from: a, reason: collision with root package name */
    private long f15333a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f15334b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f15335c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f15336d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f15337e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f15338f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f15339g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f15340h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f15341i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f15342j = new Object();

    public final int zza() {
        int i8;
        synchronized (this.f15339g) {
            i8 = this.f15334b;
        }
        return i8;
    }

    public final synchronized long zzb() {
        long j8;
        synchronized (this.f15342j) {
            j8 = this.f15337e;
        }
        return j8;
    }

    public final synchronized long zzc() {
        long j8;
        synchronized (this.f15341i) {
            j8 = this.f15336d;
        }
        return j8;
    }

    public final synchronized long zzd() {
        long j8;
        synchronized (this.f15338f) {
            j8 = this.f15333a;
        }
        return j8;
    }

    public final long zze() {
        long j8;
        synchronized (this.f15340h) {
            j8 = this.f15335c;
        }
        return j8;
    }

    public final synchronized void zzf(long j8) {
        synchronized (this.f15342j) {
            this.f15337e = j8;
        }
    }

    public final synchronized void zzg(long j8) {
        synchronized (this.f15341i) {
            this.f15336d = j8;
        }
    }

    public final synchronized void zzh(long j8) {
        synchronized (this.f15338f) {
            this.f15333a = j8;
        }
    }

    public final void zzi(int i8) {
        synchronized (this.f15339g) {
            this.f15334b = i8;
        }
    }

    public final void zzj(long j8) {
        synchronized (this.f15340h) {
            this.f15335c = j8;
        }
    }
}
