package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4946y6 {

    /* renamed from: a, reason: collision with root package name */
    private final K1 f23839a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23840b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23841c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23842d;

    /* renamed from: e, reason: collision with root package name */
    private int f23843e;

    /* renamed from: f, reason: collision with root package name */
    private int f23844f;

    /* renamed from: g, reason: collision with root package name */
    private long f23845g;

    /* renamed from: h, reason: collision with root package name */
    private long f23846h;

    public C4946y6(K1 k12) {
        this.f23839a = k12;
    }

    public final void zza(byte[] bArr, int i8, int i9) {
        if (this.f23841c) {
            int i10 = this.f23844f;
            int i11 = (i8 + 1) - i10;
            if (i11 >= i9) {
                this.f23844f = i10 + (i9 - i8);
            } else {
                this.f23842d = ((bArr[i11] & 192) >> 6) == 0;
                this.f23841c = false;
            }
        }
    }

    public final void zzb(long j8, int i8, boolean z8) {
        F10.zzf(this.f23846h != -9223372036854775807L);
        if (this.f23843e == 182 && z8 && this.f23840b) {
            this.f23839a.zzs(this.f23846h, this.f23842d ? 1 : 0, (int) (j8 - this.f23845g), i8, null);
        }
        if (this.f23843e != 179) {
            this.f23845g = j8;
        }
    }

    public final void zzc(int i8, long j8) {
        boolean z8;
        this.f23843e = i8;
        this.f23842d = false;
        if (i8 == 182) {
            z8 = true;
        } else if (i8 == 179) {
            i8 = 179;
            z8 = true;
        } else {
            z8 = false;
        }
        this.f23840b = z8;
        this.f23841c = i8 == 182;
        this.f23844f = 0;
        this.f23846h = j8;
    }

    public final void zzd() {
        this.f23840b = false;
        this.f23841c = false;
        this.f23842d = false;
        this.f23843e = -1;
    }
}
