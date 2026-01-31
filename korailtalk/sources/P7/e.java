package P7;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface e extends w, ReadableByteChannel {
    @Deprecated
    c buffer();

    @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    boolean exhausted();

    c getBuffer();

    long indexOf(byte b9);

    long indexOf(byte b9, long j8);

    long indexOf(byte b9, long j8, long j9);

    long indexOf(f fVar);

    long indexOf(f fVar, long j8);

    long indexOfElement(f fVar);

    long indexOfElement(f fVar, long j8);

    InputStream inputStream();

    e peek();

    boolean rangeEquals(long j8, f fVar);

    boolean rangeEquals(long j8, f fVar, int i8, int i9);

    int read(byte[] bArr);

    int read(byte[] bArr, int i8, int i9);

    @Override // P7.w
    /* synthetic */ long read(c cVar, long j8);

    long readAll(v vVar);

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j8);

    f readByteString();

    f readByteString(long j8);

    long readDecimalLong();

    void readFully(c cVar, long j8);

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLong();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readString(long j8, Charset charset);

    String readString(Charset charset);

    String readUtf8();

    String readUtf8(long j8);

    int readUtf8CodePoint();

    String readUtf8Line();

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j8);

    boolean request(long j8);

    void require(long j8);

    int select(o oVar);

    void skip(long j8);

    @Override // P7.w
    /* synthetic */ x timeout();
}
