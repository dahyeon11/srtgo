package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f13381a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13382b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13383c;

    /* renamed from: d, reason: collision with root package name */
    private long f13384d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f13385e;

    /* renamed from: f, reason: collision with root package name */
    private long f13386f;

    /* renamed from: g, reason: collision with root package name */
    private long f13387g;

    /* renamed from: h, reason: collision with root package name */
    private long f13388h;

    protected I0(long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f13381a = j8;
        this.f13382b = j9;
        this.f13385e = j11;
        this.f13386f = j12;
        this.f13387g = j13;
        this.f13383c = j14;
        this.f13388h = f(j9, 0L, j11, j12, j13, j14);
    }

    protected static long f(long j8, long j9, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || 1 + j9 >= j10) {
            return j11;
        }
        long j14 = (long) ((j8 - j9) * ((j12 - j11) / (j10 - j9)));
        return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
    }

    static /* bridge */ /* synthetic */ void g(I0 i02, long j8, long j9) {
        i02.f13385e = j8;
        i02.f13387g = j9;
        i02.i();
    }

    static /* bridge */ /* synthetic */ void h(I0 i02, long j8, long j9) {
        i02.f13384d = j8;
        i02.f13386f = j9;
        i02.i();
    }

    private final void i() {
        this.f13388h = f(this.f13382b, this.f13384d, this.f13385e, this.f13386f, this.f13387g, this.f13383c);
    }
}
