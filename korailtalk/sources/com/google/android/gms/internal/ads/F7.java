package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class F7 {
    static Pair a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairC = c(randomAccessFile, 0);
        return pairC != null ? pairC : c(randomAccessFile, 65535);
    }

    private static long b(ByteBuffer byteBuffer, int i8) {
        return byteBuffer.getInt(i8) & 4294967295L;
    }

    private static Pair c(RandomAccessFile randomAccessFile, int i8) throws IOException {
        int i9;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i8, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        d(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i9 = -1;
        } else {
            int i10 = iCapacity - 22;
            int iMin = Math.min(i10, 65535);
            for (int i11 = 0; i11 < iMin; i11++) {
                i9 = i10 - i11;
                if (byteBufferAllocate.getInt(i9) == 101010256 && ((char) byteBufferAllocate.getShort(i9 + 20)) == i11) {
                    break;
                }
            }
            i9 = -1;
        }
        if (i9 == -1) {
            return null;
        }
        byteBufferAllocate.position(i9);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i9));
    }

    private static void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long zza(ByteBuffer byteBuffer) {
        d(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        d(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static void zzd(ByteBuffer byteBuffer, long j8) {
        d(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j8 >= 0 && j8 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j8);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j8);
    }
}
