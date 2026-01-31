package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class J6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f13581a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13582b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13583c;
    public byte[] zza;
    public int zzb;

    public J6(int i8, int i9) {
        this.f13581a = i8;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i8, int i9) {
        if (this.f13582b) {
            int i10 = i9 - i8;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i11 = this.zzb + i10;
            if (length < i11) {
                this.zza = Arrays.copyOf(bArr2, i11 + i11);
            }
            System.arraycopy(bArr, i8, this.zza, this.zzb, i10);
            this.zzb += i10;
        }
    }

    public final void zzb() {
        this.f13582b = false;
        this.f13583c = false;
    }

    public final void zzc(int i8) {
        F10.zzf(!this.f13582b);
        boolean z8 = i8 == this.f13581a;
        this.f13582b = z8;
        if (z8) {
            this.zzb = 3;
            this.f13583c = false;
        }
    }

    public final boolean zzd(int i8) {
        if (!this.f13582b) {
            return false;
        }
        this.zzb -= i8;
        this.f13582b = false;
        this.f13583c = true;
        return true;
    }

    public final boolean zze() {
        return this.f13583c;
    }
}
