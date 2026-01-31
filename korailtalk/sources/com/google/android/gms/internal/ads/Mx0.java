package com.google.android.gms.internal.ads;

import e3.AbstractC5358c;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Mx0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14755a;

    private Mx0(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        this.f14755a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i9);
    }

    public static Mx0 zzb(byte[] bArr) {
        if (bArr != null) {
            return new Mx0(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Mx0) {
            return Arrays.equals(((Mx0) obj).f14755a, this.f14755a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14755a);
    }

    public final String toString() {
        byte[] bArr = this.f14755a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b9 : bArr) {
            sb.append("0123456789abcdef".charAt((b9 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b9 & AbstractC5358c.SI));
        }
        return "Bytes(" + sb.toString() + ")";
    }

    public final int zza() {
        return this.f14755a.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.f14755a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
