package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.android.gms.internal.ads.nm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3767nm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f21346a = new C3539lm0();

    private static byte[] a(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i8) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
        int i9 = i8 - length;
        while (i9 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i9, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i8 - i9, iMin);
            i9 -= iMin;
        }
        return bArrCopyOf;
    }

    public static InputStream zza(InputStream inputStream, long j8) {
        return new C3653mm0(inputStream, j8);
    }

    public static byte[] zzb(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i8 = 0;
        while (i8 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i8);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < iMin2) {
                int i10 = inputStream.read(bArr, i9, iMin2 - i9);
                if (i10 == -1) {
                    return a(arrayDeque, i8);
                }
                i9 += i10;
                i8 += i10;
            }
            iMin = AbstractC1235Cm0.zze(iMin * (iMin < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
