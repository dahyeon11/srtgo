package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14134a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f14135b;

    /* renamed from: c, reason: collision with root package name */
    private int f14136c;

    /* renamed from: d, reason: collision with root package name */
    private long f14137d;

    /* renamed from: e, reason: collision with root package name */
    private int f14138e;

    /* renamed from: f, reason: collision with root package name */
    private int f14139f;

    /* renamed from: g, reason: collision with root package name */
    private int f14140g;

    public final void zza(K1 k12, I1 i12) {
        if (this.f14136c > 0) {
            k12.zzs(this.f14137d, this.f14138e, this.f14139f, this.f14140g, i12);
            this.f14136c = 0;
        }
    }

    public final void zzb() {
        this.f14135b = false;
        this.f14136c = 0;
    }

    public final void zzc(K1 k12, long j8, int i8, int i9, int i10, I1 i12) {
        F10.zzg(this.f14140g <= i9 + i10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f14135b) {
            int i11 = this.f14136c;
            int i13 = i11 + 1;
            this.f14136c = i13;
            if (i11 == 0) {
                this.f14137d = j8;
                this.f14138e = i8;
                this.f14139f = 0;
            }
            this.f14139f += i9;
            this.f14140g = i10;
            if (i13 >= 16) {
                zza(k12, i12);
            }
        }
    }

    public final void zzd(InterfaceC2540d1 interfaceC2540d1) {
        if (this.f14135b) {
            return;
        }
        interfaceC2540d1.zzh(this.f14134a, 0, 10);
        interfaceC2540d1.zzj();
        byte[] bArr = this.f14134a;
        int i8 = A0.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f14135b = true;
        }
    }
}
