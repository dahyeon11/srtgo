package d7;

import S6.AbstractC0774p;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5331b {

    /* renamed from: d7.b$a */
    public static final class a extends AbstractC0774p {

        /* renamed from: a, reason: collision with root package name */
        private int f30094a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30095b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30096c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f30097d;

        a(BufferedInputStream bufferedInputStream) {
            this.f30097d = bufferedInputStream;
        }

        private final void a() throws IOException {
            if (this.f30095b || this.f30096c) {
                return;
            }
            int i8 = this.f30097d.read();
            this.f30094a = i8;
            this.f30095b = true;
            this.f30096c = i8 == -1;
        }

        public final boolean getFinished() {
            return this.f30096c;
        }

        public final int getNextByte() {
            return this.f30094a;
        }

        public final boolean getNextPrepared() {
            return this.f30095b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            a();
            return !this.f30096c;
        }

        @Override // S6.AbstractC0774p
        public byte nextByte() throws IOException {
            a();
            if (this.f30096c) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b9 = (byte) this.f30094a;
            this.f30095b = false;
            return b9;
        }

        public final void setFinished(boolean z8) {
            this.f30096c = z8;
        }

        public final void setNextByte(int i8) {
            this.f30094a = i8;
        }

        public final void setNextPrepared(boolean z8) {
            this.f30095b = z8;
        }
    }

    public static final long copyTo(InputStream inputStream, OutputStream out, int i8) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i8];
        int i9 = inputStream.read(bArr);
        long j8 = 0;
        while (i9 >= 0) {
            out.write(bArr, 0, i9);
            j8 += i9;
            i9 = inputStream.read(bArr);
        }
        return j8;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return copyTo(inputStream, outputStream, i8);
    }

    public static final AbstractC0774p iterator(BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    public static final byte[] readBytes(InputStream inputStream, int i8) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i8, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8192;
        }
        return readBytes(inputStream, i8);
    }

    public static final byte[] readBytes(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
