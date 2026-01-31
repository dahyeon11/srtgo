package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3286ja {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20275a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f20276b;

    /* renamed from: c, reason: collision with root package name */
    private int f20277c;

    public C3286ja(byte[] bArr) {
        for (int i8 = 0; i8 < 256; i8++) {
            this.f20275a[i8] = (byte) i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f20275a;
            byte b9 = bArr2[i10];
            i9 = (i9 + b9 + bArr[i10 % bArr.length]) & 255;
            bArr2[i10] = bArr2[i9];
            bArr2[i9] = b9;
        }
        this.f20276b = 0;
        this.f20277c = 0;
    }

    public final void zza(byte[] bArr) {
        int i8 = this.f20276b;
        int i9 = this.f20277c;
        for (int i10 = 0; i10 < 256; i10++) {
            byte[] bArr2 = this.f20275a;
            i8 = (i8 + 1) & 255;
            byte b9 = bArr2[i8];
            i9 = (i9 + b9) & 255;
            bArr2[i8] = bArr2[i9];
            bArr2[i9] = b9;
            bArr[i10] = (byte) (bArr2[(bArr2[i8] + b9) & 255] ^ bArr[i10]);
        }
        this.f20276b = i8;
        this.f20277c = i9;
    }
}
