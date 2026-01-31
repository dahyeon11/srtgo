package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4604v6 {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f23170b = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f23171a;
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];

    public C4604v6(int i8) {
    }

    public final void zza(byte[] bArr, int i8, int i9) {
        if (this.f23171a) {
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
        this.f23171a = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzc(int i8, int i9) {
        if (this.f23171a) {
            int i10 = this.zza - i9;
            this.zza = i10;
            if (this.zzb != 0 || i8 != 181) {
                this.f23171a = false;
                return true;
            }
            this.zzb = i10;
        } else if (i8 == 179) {
            this.f23171a = true;
        }
        zza(f23170b, 0, 3);
        return false;
    }
}
