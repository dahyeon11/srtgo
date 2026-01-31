package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.nz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3793nz0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f21376a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f21377b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f21378c = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final AbstractC4816wy0 zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = AbstractC4816wy0.a(bArr, 0, 0, false);
    }

    static int a(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zza(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f21377b);
    }
}
