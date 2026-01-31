package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4832x6 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f23642c = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f23643a;

    /* renamed from: b, reason: collision with root package name */
    private int f23644b;
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];

    public C4832x6(int i8) {
    }

    public final void zza(byte[] bArr, int i8, int i9) {
        if (this.f23643a) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i11 = this.zza + i10;
            if (length < i11) {
                this.zzc = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.zzc, this.zza, i10);
            this.zza += i10;
        }
    }

    public final void zzb() {
        this.f23643a = false;
        this.zza = 0;
        this.f23644b = 0;
    }

    public final boolean zzc(int i8, int i9) {
        int i10 = this.f23644b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i8 == 179 || i8 == 181) {
                            this.zza -= i9;
                            this.f23643a = false;
                            return true;
                        }
                    } else if ((i8 & 240) != 32) {
                        AbstractC2834fc0.zzf("H263Reader", "Unexpected start code value");
                        zzb();
                    } else {
                        this.zzb = this.zza;
                        this.f23644b = 4;
                    }
                } else if (i8 > 31) {
                    AbstractC2834fc0.zzf("H263Reader", "Unexpected start code value");
                    zzb();
                } else {
                    this.f23644b = 3;
                }
            } else if (i8 != 181) {
                AbstractC2834fc0.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else {
                this.f23644b = 2;
            }
        } else if (i8 == 176) {
            this.f23644b = 1;
            this.f23643a = true;
        }
        zza(f23642c, 0, 3);
        return false;
    }
}
