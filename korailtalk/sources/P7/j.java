package P7;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class j implements w {

    /* renamed from: b, reason: collision with root package name */
    private final e f3787b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f3788c;

    /* renamed from: d, reason: collision with root package name */
    private final k f3789d;

    /* renamed from: a, reason: collision with root package name */
    private int f3786a = 0;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f3790e = new CRC32();

    public j(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f3788c = inflater;
        e eVarBuffer = n.buffer(wVar);
        this.f3787b = eVarBuffer;
        this.f3789d = new k(eVarBuffer, inflater);
    }

    private void a(String str, int i8, int i9) throws IOException {
        if (i9 != i8) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    private void b() throws IOException {
        this.f3787b.require(10L);
        byte b9 = this.f3787b.buffer().getByte(3L);
        boolean z8 = ((b9 >> 1) & 1) == 1;
        if (z8) {
            d(this.f3787b.buffer(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f3787b.readShort());
        this.f3787b.skip(8L);
        if (((b9 >> 2) & 1) == 1) {
            this.f3787b.require(2L);
            if (z8) {
                d(this.f3787b.buffer(), 0L, 2L);
            }
            long shortLe = this.f3787b.buffer().readShortLe();
            this.f3787b.require(shortLe);
            if (z8) {
                d(this.f3787b.buffer(), 0L, shortLe);
            }
            this.f3787b.skip(shortLe);
        }
        if (((b9 >> 3) & 1) == 1) {
            long jIndexOf = this.f3787b.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new EOFException();
            }
            if (z8) {
                d(this.f3787b.buffer(), 0L, jIndexOf + 1);
            }
            this.f3787b.skip(jIndexOf + 1);
        }
        if (((b9 >> 4) & 1) == 1) {
            long jIndexOf2 = this.f3787b.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new EOFException();
            }
            if (z8) {
                d(this.f3787b.buffer(), 0L, jIndexOf2 + 1);
            }
            this.f3787b.skip(jIndexOf2 + 1);
        }
        if (z8) {
            a("FHCRC", this.f3787b.readShortLe(), (short) this.f3790e.getValue());
            this.f3790e.reset();
        }
    }

    private void c() throws IOException {
        a("CRC", this.f3787b.readIntLe(), (int) this.f3790e.getValue());
        a("ISIZE", this.f3787b.readIntLe(), (int) this.f3788c.getBytesWritten());
    }

    private void d(c cVar, long j8, long j9) {
        s sVar = cVar.f3774a;
        while (true) {
            int i8 = sVar.f3815c;
            int i9 = sVar.f3814b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            sVar = sVar.f3818f;
        }
        while (j9 > 0) {
            int iMin = (int) Math.min(sVar.f3815c - r6, j9);
            this.f3790e.update(sVar.f3813a, (int) (sVar.f3814b + j8), iMin);
            j9 -= iMin;
            sVar = sVar.f3818f;
            j8 = 0;
        }
    }

    @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3789d.close();
    }

    @Override // P7.w
    public long read(c cVar, long j8) throws DataFormatException, IOException {
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
        if (j8 == 0) {
            return 0L;
        }
        if (this.f3786a == 0) {
            b();
            this.f3786a = 1;
        }
        if (this.f3786a == 1) {
            long j9 = cVar.f3775b;
            long j10 = this.f3789d.read(cVar, j8);
            if (j10 != -1) {
                d(cVar, j9, j10);
                return j10;
            }
            this.f3786a = 2;
        }
        if (this.f3786a == 2) {
            c();
            this.f3786a = 3;
            if (!this.f3787b.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // P7.w
    public x timeout() {
        return this.f3787b.timeout();
    }
}
