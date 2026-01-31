package o2;

import android.os.ParcelFileDescriptor;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i2.AbstractC5683p;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class l {
    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC5683p.checkNotNull(inputStream);
        AbstractC5683p.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i8);
        }
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z8, int i8) throws IOException {
        byte[] bArr = new byte[i8];
        long j8 = 0;
        while (true) {
            try {
                int i9 = inputStream.read(bArr, 0, i8);
                if (i9 == -1) {
                    break;
                }
                j8 += i9;
                outputStream.write(bArr, 0, i9);
            } catch (Throwable th) {
                if (z8) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z8) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j8;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream, boolean z8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z8, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
