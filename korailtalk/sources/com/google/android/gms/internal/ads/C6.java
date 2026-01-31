package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class C6 {

    /* renamed from: a, reason: collision with root package name */
    private final K1 f12475a;

    /* renamed from: d, reason: collision with root package name */
    private final C2297au0 f12478d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f12479e;

    /* renamed from: f, reason: collision with root package name */
    private int f12480f;

    /* renamed from: g, reason: collision with root package name */
    private long f12481g;

    /* renamed from: h, reason: collision with root package name */
    private long f12482h;

    /* renamed from: i, reason: collision with root package name */
    private final B6 f12483i;

    /* renamed from: j, reason: collision with root package name */
    private final B6 f12484j;

    /* renamed from: l, reason: collision with root package name */
    private long f12486l;

    /* renamed from: m, reason: collision with root package name */
    private long f12487m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12488n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12489o;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f12476b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f12477c = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    private boolean f12485k = false;

    public C6(K1 k12, boolean z8, boolean z9) {
        this.f12475a = k12;
        A6 a62 = null;
        this.f12483i = new B6(a62);
        this.f12484j = new B6(a62);
        byte[] bArr = new byte[128];
        this.f12479e = bArr;
        this.f12478d = new C2297au0(bArr, 0, 0);
    }

    public final void zza(C4918xs0 c4918xs0) {
        this.f12477c.append(c4918xs0.zza, c4918xs0);
    }

    public final void zzb(Ys0 ys0) {
        this.f12476b.append(ys0.zzd, ys0);
    }

    public final void zzc() {
        this.f12485k = false;
    }

    public final void zzd(long j8, int i8, long j9, boolean z8) {
        this.f12480f = i8;
        this.f12482h = j9;
        this.f12481g = j8;
        this.f12489o = z8;
    }

    public final boolean zze(long j8, int i8, boolean z8) {
        boolean z9 = false;
        if (this.f12480f == 9) {
            if (z8 && this.f12485k) {
                long j9 = this.f12481g;
                int i9 = i8 + ((int) (j8 - j9));
                long j10 = this.f12487m;
                if (j10 != -9223372036854775807L) {
                    this.f12475a.zzs(j10, this.f12488n ? 1 : 0, (int) (j9 - this.f12486l), i9, null);
                }
            }
            this.f12486l = this.f12481g;
            this.f12487m = this.f12482h;
            this.f12488n = false;
            this.f12485k = true;
        }
        boolean z10 = this.f12489o;
        boolean z11 = this.f12488n;
        int i10 = this.f12480f;
        if (i10 == 5 || (z10 && i10 == 1)) {
            z9 = true;
        }
        boolean z12 = z11 | z9;
        this.f12488n = z12;
        return z12;
    }
}
