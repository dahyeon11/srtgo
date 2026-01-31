package P7;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface d extends v, WritableByteChannel {
    c buffer();

    @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    d emit();

    d emitCompleteSegments();

    @Override // P7.v, java.io.Flushable
    void flush();

    OutputStream outputStream();

    @Override // P7.v
    /* synthetic */ x timeout();

    d write(f fVar);

    d write(w wVar, long j8);

    d write(byte[] bArr);

    d write(byte[] bArr, int i8, int i9);

    @Override // P7.v
    /* synthetic */ void write(c cVar, long j8);

    long writeAll(w wVar);

    d writeByte(int i8);

    d writeDecimalLong(long j8);

    d writeHexadecimalUnsignedLong(long j8);

    d writeInt(int i8);

    d writeIntLe(int i8);

    d writeLong(long j8);

    d writeLongLe(long j8);

    d writeShort(int i8);

    d writeShortLe(int i8);

    d writeString(String str, int i8, int i9, Charset charset);

    d writeString(String str, Charset charset);

    d writeUtf8(String str);

    d writeUtf8(String str, int i8, int i9);

    d writeUtf8CodePoint(int i8);
}
