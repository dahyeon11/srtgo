package A2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f58a = new g();

    private static byte[] a(Queue queue, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = i8;
        while (i9 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i9, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i8 - i9, iMin);
            i9 -= iMin;
        }
        return bArr;
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        e.zza(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iZza = 8192;
        int i8 = 0;
        while (i8 < 2147483639) {
            int iMin = Math.min(iZza, 2147483639 - i8);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = inputStream.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    return a(arrayDeque, i8);
                }
                i9 += i10;
                i8 += i10;
            }
            iZza = l.zza(iZza, 2);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zza(InputStream inputStream, long j8) {
        return new j(inputStream, 1048577L);
    }
}
