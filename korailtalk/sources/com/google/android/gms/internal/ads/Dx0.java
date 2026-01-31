package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class Dx0 {
    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 + i8;
            int iDigit = Character.digit(str.charAt(i9), 16);
            int iDigit2 = Character.digit(str.charAt(i9 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i8] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
