package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class E6 {

    /* renamed from: a, reason: collision with root package name */
    private final K1 f12758a;

    /* renamed from: b, reason: collision with root package name */
    private long f12759b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12760c;

    /* renamed from: d, reason: collision with root package name */
    private int f12761d;

    /* renamed from: e, reason: collision with root package name */
    private long f12762e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12763f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12764g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12765h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12766i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12767j;

    /* renamed from: k, reason: collision with root package name */
    private long f12768k;

    /* renamed from: l, reason: collision with root package name */
    private long f12769l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12770m;

    public E6(K1 k12) {
        this.f12758a = k12;
    }

    private final void a(int i8) {
        long j8 = this.f12769l;
        if (j8 == -9223372036854775807L) {
            return;
        }
        boolean z8 = this.f12770m;
        long j9 = this.f12759b - this.f12768k;
        this.f12758a.zzs(j8, z8 ? 1 : 0, (int) j9, i8, null);
    }

    public final void zza(long j8, int i8, boolean z8) {
        if (this.f12767j && this.f12764g) {
            this.f12770m = this.f12760c;
            this.f12767j = false;
        } else if (this.f12765h || this.f12764g) {
            if (z8 && this.f12766i) {
                a(i8 + ((int) (j8 - this.f12759b)));
            }
            this.f12768k = this.f12759b;
            this.f12769l = this.f12762e;
            this.f12770m = this.f12760c;
            this.f12766i = true;
        }
    }

    public final void zzb(byte[] bArr, int i8, int i9) {
        if (this.f12763f) {
            int i10 = this.f12761d;
            int i11 = (i8 + 2) - i10;
            if (i11 >= i9) {
                this.f12761d = i10 + (i9 - i8);
            } else {
                this.f12764g = (bArr[i11] & 128) != 0;
                this.f12763f = false;
            }
        }
    }

    public final void zzc() {
        this.f12763f = false;
        this.f12764g = false;
        this.f12765h = false;
        this.f12766i = false;
        this.f12767j = false;
    }

    public final void zzd(long j8, int i8, int i9, long j9, boolean z8) {
        this.f12764g = false;
        this.f12765h = false;
        this.f12762e = j9;
        this.f12761d = 0;
        this.f12759b = j8;
        if (i9 >= 32 && i9 != 40) {
            if (this.f12766i && !this.f12767j) {
                if (z8) {
                    a(i8);
                }
                this.f12766i = false;
            }
            if (i9 <= 35 || i9 == 39) {
                this.f12765h = !this.f12767j;
                this.f12767j = true;
            }
        }
        boolean z9 = i9 >= 16 && i9 <= 21;
        this.f12760c = z9;
        this.f12763f = z9 || i9 <= 9;
    }
}
