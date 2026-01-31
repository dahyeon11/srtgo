package P7;

import android.support.v4.media.session.PlaybackStateCompat;
import com.kakao.sdk.auth.Constants;
import e3.AbstractC5358c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f3773c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    s f3774a;

    /* renamed from: b */
    long f3775b;

    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            c.this.writeByte((int) ((byte) i8));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            c.this.write(bArr, i8, i9);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f3775b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f3775b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            return c.this.read(bArr, i8, i9);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: P7.c$c */
    public static final class C0065c implements Closeable {

        /* renamed from: a */
        private s f3778a;
        public c buffer;
        public byte[] data;
        public boolean readWrite;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            this.f3778a = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i8) {
            if (i8 <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i8);
            }
            if (i8 > 8192) {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i8);
            }
            c cVar = this.buffer;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j8 = cVar.f3775b;
            s sVarG = cVar.g(i8);
            int i9 = 8192 - sVarG.f3815c;
            sVarG.f3815c = 8192;
            long j9 = i9;
            this.buffer.f3775b = j8 + j9;
            this.f3778a = sVarG;
            this.offset = j8;
            this.data = sVarG.f3813a;
            this.start = 8192 - i9;
            this.end = 8192;
            return j9;
        }

        public final int next() {
            long j8 = this.offset;
            if (j8 != this.buffer.f3775b) {
                return j8 == -1 ? seek(0L) : seek(j8 + (this.end - this.start));
            }
            throw new IllegalStateException();
        }

        public final long resizeBuffer(long j8) {
            c cVar = this.buffer;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j9 = cVar.f3775b;
            if (j8 <= j9) {
                if (j8 < 0) {
                    throw new IllegalArgumentException("newSize < 0: " + j8);
                }
                long j10 = j9 - j8;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    c cVar2 = this.buffer;
                    s sVar = cVar2.f3774a.f3819g;
                    int i8 = sVar.f3815c;
                    long j11 = i8 - sVar.f3814b;
                    if (j11 > j10) {
                        sVar.f3815c = (int) (i8 - j10);
                        break;
                    }
                    cVar2.f3774a = sVar.pop();
                    t.a(sVar);
                    j10 -= j11;
                }
                this.f3778a = null;
                this.offset = j8;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j8 > j9) {
                long j12 = j8 - j9;
                boolean z8 = true;
                while (j12 > 0) {
                    s sVarG = this.buffer.g(1);
                    int iMin = (int) Math.min(j12, 8192 - sVarG.f3815c);
                    int i9 = sVarG.f3815c + iMin;
                    sVarG.f3815c = i9;
                    j12 -= iMin;
                    if (z8) {
                        this.f3778a = sVarG;
                        this.offset = j9;
                        this.data = sVarG.f3813a;
                        this.start = i9 - iMin;
                        this.end = i9;
                        z8 = false;
                    }
                }
            }
            this.buffer.f3775b = j8;
            return j9;
        }

        public final int seek(long j8) {
            if (j8 >= -1) {
                c cVar = this.buffer;
                long j9 = cVar.f3775b;
                if (j8 <= j9) {
                    if (j8 == -1 || j8 == j9) {
                        this.f3778a = null;
                        this.offset = j8;
                        this.data = null;
                        this.start = -1;
                        this.end = -1;
                        return -1;
                    }
                    s sVar = cVar.f3774a;
                    s sVarPush = this.f3778a;
                    long j10 = 0;
                    if (sVarPush != null) {
                        long j11 = this.offset - (this.start - sVarPush.f3814b);
                        if (j11 > j8) {
                            j9 = j11;
                            sVarPush = sVar;
                            sVar = sVarPush;
                        } else {
                            j10 = j11;
                        }
                    } else {
                        sVarPush = sVar;
                    }
                    if (j9 - j8 > j8 - j10) {
                        while (true) {
                            int i8 = sVarPush.f3815c;
                            int i9 = sVarPush.f3814b;
                            if (j8 < (i8 - i9) + j10) {
                                break;
                            }
                            j10 += i8 - i9;
                            sVarPush = sVarPush.f3818f;
                        }
                    } else {
                        while (j9 > j8) {
                            sVar = sVar.f3819g;
                            j9 -= sVar.f3815c - sVar.f3814b;
                        }
                        sVarPush = sVar;
                        j10 = j9;
                    }
                    if (this.readWrite && sVarPush.f3816d) {
                        s sVarB = sVarPush.b();
                        c cVar2 = this.buffer;
                        if (cVar2.f3774a == sVarPush) {
                            cVar2.f3774a = sVarB;
                        }
                        sVarPush = sVarPush.push(sVarB);
                        sVarPush.f3819g.pop();
                    }
                    this.f3778a = sVarPush;
                    this.offset = j8;
                    this.data = sVarPush.f3813a;
                    int i10 = sVarPush.f3814b + ((int) (j8 - j10));
                    this.start = i10;
                    int i11 = sVarPush.f3815c;
                    this.end = i11;
                    return i11 - i10;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j8), Long.valueOf(this.buffer.f3775b)));
        }
    }

    private f a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            s sVar = this.f3774a;
            if (sVar != null) {
                byte[] bArr = sVar.f3813a;
                int i8 = sVar.f3814b;
                messageDigest.update(bArr, i8, sVar.f3815c - i8);
                s sVar2 = this.f3774a;
                while (true) {
                    sVar2 = sVar2.f3818f;
                    if (sVar2 == this.f3774a) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f3813a;
                    int i9 = sVar2.f3814b;
                    messageDigest.update(bArr2, i9, sVar2.f3815c - i9);
                }
            }
            return f.of(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private f b(String str, f fVar) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.toByteArray(), str));
            s sVar = this.f3774a;
            if (sVar != null) {
                byte[] bArr = sVar.f3813a;
                int i8 = sVar.f3814b;
                mac.update(bArr, i8, sVar.f3815c - i8);
                s sVar2 = this.f3774a;
                while (true) {
                    sVar2 = sVar2.f3818f;
                    if (sVar2 == this.f3774a) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f3813a;
                    int i9 = sVar2.f3814b;
                    mac.update(bArr2, i9, sVar2.f3815c - i9);
                }
            }
            return f.of(mac.doFinal());
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private boolean c(s sVar, int i8, f fVar, int i9, int i10) {
        int i11 = sVar.f3815c;
        byte[] bArr = sVar.f3813a;
        while (i9 < i10) {
            if (i8 == i11) {
                sVar = sVar.f3818f;
                byte[] bArr2 = sVar.f3813a;
                bArr = bArr2;
                i8 = sVar.f3814b;
                i11 = sVar.f3815c;
            }
            if (bArr[i8] != fVar.getByte(i9)) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    private void d(InputStream inputStream, long j8, boolean z8) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j8 <= 0 && !z8) {
                return;
            }
            s sVarG = g(1);
            int i8 = inputStream.read(sVarG.f3813a, sVarG.f3815c, (int) Math.min(j8, 8192 - sVarG.f3815c));
            if (i8 == -1) {
                if (sVarG.f3814b == sVarG.f3815c) {
                    this.f3774a = sVarG.pop();
                    t.a(sVarG);
                }
                if (!z8) {
                    throw new EOFException();
                }
                return;
            }
            sVarG.f3815c += i8;
            long j9 = i8;
            this.f3775b += j9;
            j8 -= j9;
        }
    }

    public final void clear() {
        try {
            skip(this.f3775b);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public final long completeSegmentByteCount() {
        long j8 = this.f3775b;
        if (j8 == 0) {
            return 0L;
        }
        s sVar = this.f3774a.f3819g;
        return (sVar.f3815c >= 8192 || !sVar.f3817e) ? j8 : j8 - (r3 - sVar.f3814b);
    }

    public final c copyTo(OutputStream outputStream) {
        return copyTo(outputStream, 0L, this.f3775b);
    }

    String e(long j8) throws EOFException {
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (getByte(j9) == 13) {
                String utf8 = readUtf8(j9);
                skip(2L);
                return utf8;
            }
        }
        String utf82 = readUtf8(j8);
        skip(1L);
        return utf82;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j8 = this.f3775b;
        if (j8 != cVar.f3775b) {
            return false;
        }
        long j9 = 0;
        if (j8 == 0) {
            return true;
        }
        s sVar = this.f3774a;
        s sVar2 = cVar.f3774a;
        int i8 = sVar.f3814b;
        int i9 = sVar2.f3814b;
        while (j9 < this.f3775b) {
            long jMin = Math.min(sVar.f3815c - i8, sVar2.f3815c - i9);
            int i10 = 0;
            while (i10 < jMin) {
                int i11 = i8 + 1;
                int i12 = i9 + 1;
                if (sVar.f3813a[i8] != sVar2.f3813a[i9]) {
                    return false;
                }
                i10++;
                i8 = i11;
                i9 = i12;
            }
            if (i8 == sVar.f3815c) {
                sVar = sVar.f3818f;
                i8 = sVar.f3814b;
            }
            if (i9 == sVar2.f3815c) {
                sVar2 = sVar2.f3818f;
                i9 = sVar2.f3814b;
            }
            j9 += jMin;
        }
        return true;
    }

    @Override // P7.e
    public boolean exhausted() {
        return this.f3775b == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (r19 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0058, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int f(P7.o r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.c.f(P7.o, boolean):int");
    }

    s g(int i8) {
        if (i8 < 1 || i8 > 8192) {
            throw new IllegalArgumentException();
        }
        s sVar = this.f3774a;
        if (sVar != null) {
            s sVar2 = sVar.f3819g;
            return (sVar2.f3815c + i8 > 8192 || !sVar2.f3817e) ? sVar2.push(t.b()) : sVar2;
        }
        s sVarB = t.b();
        this.f3774a = sVarB;
        sVarB.f3819g = sVarB;
        sVarB.f3818f = sVarB;
        return sVarB;
    }

    public final byte getByte(long j8) {
        int i8;
        y.checkOffsetAndCount(this.f3775b, j8, 1L);
        long j9 = this.f3775b;
        if (j9 - j8 <= j8) {
            long j10 = j8 - j9;
            s sVar = this.f3774a;
            do {
                sVar = sVar.f3819g;
                int i9 = sVar.f3815c;
                i8 = sVar.f3814b;
                j10 += i9 - i8;
            } while (j10 < 0);
            return sVar.f3813a[i8 + ((int) j10)];
        }
        s sVar2 = this.f3774a;
        while (true) {
            int i10 = sVar2.f3815c;
            int i11 = sVar2.f3814b;
            long j11 = i10 - i11;
            if (j8 < j11) {
                return sVar2.f3813a[i11 + ((int) j8)];
            }
            j8 -= j11;
            sVar2 = sVar2.f3818f;
        }
    }

    public int hashCode() {
        s sVar = this.f3774a;
        if (sVar == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = sVar.f3815c;
            for (int i10 = sVar.f3814b; i10 < i9; i10++) {
                i8 = (i8 * 31) + sVar.f3813a[i10];
            }
            sVar = sVar.f3818f;
        } while (sVar != this.f3774a);
        return i8;
    }

    public final f hmacSha1(f fVar) {
        return b("HmacSHA1", fVar);
    }

    public final f hmacSha256(f fVar) {
        return b("HmacSHA256", fVar);
    }

    public final f hmacSha512(f fVar) {
        return b("HmacSHA512", fVar);
    }

    @Override // P7.e
    public long indexOf(byte b9) {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // P7.e
    public long indexOfElement(f fVar) {
        return indexOfElement(fVar, 0L);
    }

    @Override // P7.e
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final f md5() {
        return a("MD5");
    }

    @Override // P7.d
    public OutputStream outputStream() {
        return new a();
    }

    @Override // P7.e
    public e peek() {
        return n.buffer(new p(this));
    }

    @Override // P7.e
    public boolean rangeEquals(long j8, f fVar) {
        return rangeEquals(j8, fVar, 0, fVar.size());
    }

    @Override // P7.e
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // P7.e
    public long readAll(v vVar) {
        long j8 = this.f3775b;
        if (j8 > 0) {
            vVar.write(this, j8);
        }
        return j8;
    }

    public final C0065c readAndWriteUnsafe() {
        return readAndWriteUnsafe(new C0065c());
    }

    @Override // P7.e
    public byte readByte() {
        long j8 = this.f3775b;
        if (j8 == 0) {
            throw new IllegalStateException("size == 0");
        }
        s sVar = this.f3774a;
        int i8 = sVar.f3814b;
        int i9 = sVar.f3815c;
        int i10 = i8 + 1;
        byte b9 = sVar.f3813a[i8];
        this.f3775b = j8 - 1;
        if (i10 == i9) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        } else {
            sVar.f3814b = i10;
        }
        return b9;
    }

    @Override // P7.e
    public byte[] readByteArray() {
        try {
            return readByteArray(this.f3775b);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // P7.e
    public f readByteString() {
        return new f(readByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ac A[EDGE_INSN: B:105:0x00ac->B:95:0x00ac BREAK  A[LOOP:0: B:62:0x000f->B:107:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    @Override // P7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r15 = this;
            long r0 = r15.f3775b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb7
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            P7.s r7 = r15.f3774a
            byte[] r8 = r7.f3813a
            int r9 = r7.f3814b
            int r10 = r7.f3815c
        L17:
            if (r9 >= r10) goto L98
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L69
            r12 = 57
            if (r11 > r12) goto L69
            int r12 = 48 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L3c
            if (r13 != 0) goto L36
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L36
            goto L3c
        L36:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L74
        L3c:
            P7.c r0 = new P7.c
            r0.<init>()
            P7.c r0 = r0.writeDecimalLong(r3)
            P7.c r0 = r0.writeByte(r11)
            if (r1 != 0) goto L4e
            r0.readByte()
        L4e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L69:
            r12 = 45
            r13 = 1
            if (r11 != r12) goto L79
            if (r0 != 0) goto L79
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L74:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L17
        L79:
            if (r0 == 0) goto L7d
            r2 = r13
            goto L98
        L7d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            if (r9 != r10) goto La4
            P7.s r8 = r7.pop()
            r15.f3774a = r8
            P7.t.a(r7)
            goto La6
        La4:
            r7.f3814b = r9
        La6:
            if (r2 != 0) goto Lac
            P7.s r7 = r15.f3774a
            if (r7 != 0) goto Lf
        Lac:
            long r5 = r15.f3775b
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.f3775b = r5
            if (r1 == 0) goto Lb5
            goto Lb6
        Lb5:
            long r3 = -r3
        Lb6:
            return r3
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.c.readDecimalLong():long");
    }

    public final c readFrom(InputStream inputStream) throws IOException {
        d(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // P7.e
    public void readFully(c cVar, long j8) throws EOFException {
        long j9 = this.f3775b;
        if (j9 >= j8) {
            cVar.write(this, j8);
        } else {
            cVar.write(this, j9);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a2 A[EDGE_INSN: B:92:0x00a2->B:86:0x00a2 BREAK  A[LOOP:0: B:54:0x000b->B:94:?], SYNTHETIC] */
    @Override // P7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r14 = this;
            long r0 = r14.f3775b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            P7.s r6 = r14.f3774a
            byte[] r7 = r6.f3813a
            int r8 = r6.f3814b
            int r9 = r6.f3815c
        L13:
            if (r8 >= r9) goto L8e
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            P7.c r0 = new P7.c
            r0.<init>()
            P7.c r0 = r0.writeHexadecimalUnsignedLong(r4)
            P7.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8e
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8e:
            if (r8 != r9) goto L9a
            P7.s r7 = r6.pop()
            r14.f3774a = r7
            P7.t.a(r6)
            goto L9c
        L9a:
            r6.f3814b = r8
        L9c:
            if (r1 != 0) goto La2
            P7.s r6 = r14.f3774a
            if (r6 != 0) goto Lb
        La2:
            long r1 = r14.f3775b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f3775b = r1
            return r4
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.c.readHexadecimalUnsignedLong():long");
    }

    @Override // P7.e
    public int readInt() {
        long j8 = this.f3775b;
        if (j8 < 4) {
            throw new IllegalStateException("size < 4: " + this.f3775b);
        }
        s sVar = this.f3774a;
        int i8 = sVar.f3814b;
        int i9 = sVar.f3815c;
        if (i9 - i8 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = sVar.f3813a;
        int i10 = i8 + 3;
        int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
        int i12 = i8 + 4;
        int i13 = (bArr[i10] & 255) | i11;
        this.f3775b = j8 - 4;
        if (i12 == i9) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        } else {
            sVar.f3814b = i12;
        }
        return i13;
    }

    @Override // P7.e
    public int readIntLe() {
        return y.reverseBytesInt(readInt());
    }

    @Override // P7.e
    public long readLong() {
        long j8 = this.f3775b;
        if (j8 < 8) {
            throw new IllegalStateException("size < 8: " + this.f3775b);
        }
        s sVar = this.f3774a;
        int i8 = sVar.f3814b;
        int i9 = sVar.f3815c;
        if (i9 - i8 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = sVar.f3813a;
        int i10 = i8 + 7;
        long j9 = ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8] & 255) << 56) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
        int i11 = i8 + 8;
        long j10 = j9 | (bArr[i10] & 255);
        this.f3775b = j8 - 8;
        if (i11 == i9) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        } else {
            sVar.f3814b = i11;
        }
        return j10;
    }

    @Override // P7.e
    public long readLongLe() {
        return y.reverseBytesLong(readLong());
    }

    @Override // P7.e
    public short readShort() {
        long j8 = this.f3775b;
        if (j8 < 2) {
            throw new IllegalStateException("size < 2: " + this.f3775b);
        }
        s sVar = this.f3774a;
        int i8 = sVar.f3814b;
        int i9 = sVar.f3815c;
        if (i9 - i8 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = sVar.f3813a;
        int i10 = i8 + 1;
        int i11 = (bArr[i8] & 255) << 8;
        int i12 = i8 + 2;
        int i13 = (bArr[i10] & 255) | i11;
        this.f3775b = j8 - 2;
        if (i12 == i9) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        } else {
            sVar.f3814b = i12;
        }
        return (short) i13;
    }

    @Override // P7.e
    public short readShortLe() {
        return y.reverseBytesShort(readShort());
    }

    @Override // P7.e
    public String readString(Charset charset) {
        try {
            return readString(this.f3775b, charset);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public final C0065c readUnsafe() {
        return readUnsafe(new C0065c());
    }

    @Override // P7.e
    public String readUtf8() {
        try {
            return readString(this.f3775b, y.UTF_8);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // P7.e
    public int readUtf8CodePoint() throws EOFException {
        int i8;
        int i9;
        int i10;
        if (this.f3775b == 0) {
            throw new EOFException();
        }
        byte b9 = getByte(0L);
        if ((b9 & 128) == 0) {
            i8 = b9 & 127;
            i10 = 0;
            i9 = 1;
        } else if ((b9 & 224) == 192) {
            i8 = b9 & AbstractC5358c.US;
            i9 = 2;
            i10 = 128;
        } else if ((b9 & 240) == 224) {
            i8 = b9 & AbstractC5358c.SI;
            i9 = 3;
            i10 = 2048;
        } else {
            if ((b9 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i8 = b9 & 7;
            i9 = 4;
            i10 = 65536;
        }
        long j8 = i9;
        if (this.f3775b < j8) {
            throw new EOFException("size < " + i9 + ": " + this.f3775b + " (to read code point prefixed 0x" + Integer.toHexString(b9) + ")");
        }
        for (int i11 = 1; i11 < i9; i11++) {
            long j9 = i11;
            byte b10 = getByte(j9);
            if ((b10 & 192) != 128) {
                skip(j9);
                return 65533;
            }
            i8 = (i8 << 6) | (b10 & 63);
        }
        skip(j8);
        if (i8 > 1114111) {
            return 65533;
        }
        if ((i8 < 55296 || i8 > 57343) && i8 >= i10) {
            return i8;
        }
        return 65533;
    }

    @Override // P7.e
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return e(jIndexOf);
        }
        long j8 = this.f3775b;
        if (j8 != 0) {
            return readUtf8(j8);
        }
        return null;
    }

    @Override // P7.e
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // P7.e
    public boolean request(long j8) {
        return this.f3775b >= j8;
    }

    @Override // P7.e
    public void require(long j8) throws EOFException {
        if (this.f3775b < j8) {
            throw new EOFException();
        }
    }

    @Override // P7.e
    public int select(o oVar) {
        int iF = f(oVar, false);
        if (iF == -1) {
            return -1;
        }
        try {
            skip(oVar.f3801a[iF].size());
            return iF;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final f sha1() {
        return a("SHA-1");
    }

    public final f sha256() {
        return a(Constants.CODE_CHALLENGE_ALGORITHM);
    }

    public final f sha512() {
        return a(Constants.CODE_VERIFIER_ALGORITHM);
    }

    public final long size() {
        return this.f3775b;
    }

    @Override // P7.e
    public void skip(long j8) throws EOFException {
        while (j8 > 0) {
            if (this.f3774a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j8, r0.f3815c - r0.f3814b);
            long j9 = iMin;
            this.f3775b -= j9;
            j8 -= j9;
            s sVar = this.f3774a;
            int i8 = sVar.f3814b + iMin;
            sVar.f3814b = i8;
            if (i8 == sVar.f3815c) {
                this.f3774a = sVar.pop();
                t.a(sVar);
            }
        }
    }

    public final f snapshot() {
        long j8 = this.f3775b;
        if (j8 <= 2147483647L) {
            return snapshot((int) j8);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f3775b);
    }

    @Override // P7.e, P7.w
    public x timeout() {
        return x.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    @Override // P7.d
    public long writeAll(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j8 = 0;
        while (true) {
            long j9 = wVar.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j9 == -1) {
                return j8;
            }
            j8 += j9;
        }
    }

    public final c writeTo(OutputStream outputStream) {
        return writeTo(outputStream, this.f3775b);
    }

    /* renamed from: clone */
    public c m11clone() {
        c cVar = new c();
        if (this.f3775b == 0) {
            return cVar;
        }
        s sVarA = this.f3774a.a();
        cVar.f3774a = sVarA;
        sVarA.f3819g = sVarA;
        sVarA.f3818f = sVarA;
        s sVar = this.f3774a;
        while (true) {
            sVar = sVar.f3818f;
            if (sVar == this.f3774a) {
                cVar.f3775b = this.f3775b;
                return cVar;
            }
            cVar.f3774a.f3819g.push(sVar.a());
        }
    }

    public final c copyTo(OutputStream outputStream, long j8, long j9) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.checkOffsetAndCount(this.f3775b, j8, j9);
        if (j9 == 0) {
            return this;
        }
        s sVar = this.f3774a;
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
            int iMin = (int) Math.min(sVar.f3815c - r9, j9);
            outputStream.write(sVar.f3813a, (int) (sVar.f3814b + j8), iMin);
            j9 -= iMin;
            sVar = sVar.f3818f;
            j8 = 0;
        }
        return this;
    }

    @Override // P7.d
    public c emitCompleteSegments() {
        return this;
    }

    @Override // P7.e
    public long indexOf(byte b9, long j8) {
        return indexOf(b9, j8, Long.MAX_VALUE);
    }

    @Override // P7.e
    public long indexOfElement(f fVar, long j8) {
        int i8;
        int i9;
        long j9 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        s sVar = this.f3774a;
        if (sVar == null) {
            return -1L;
        }
        long j10 = this.f3775b;
        if (j10 - j8 < j8) {
            while (j10 > j8) {
                sVar = sVar.f3819g;
                j10 -= sVar.f3815c - sVar.f3814b;
            }
        } else {
            while (true) {
                long j11 = (sVar.f3815c - sVar.f3814b) + j9;
                if (j11 >= j8) {
                    break;
                }
                sVar = sVar.f3818f;
                j9 = j11;
            }
            j10 = j9;
        }
        if (fVar.size() == 2) {
            byte b9 = fVar.getByte(0);
            byte b10 = fVar.getByte(1);
            while (j10 < this.f3775b) {
                byte[] bArr = sVar.f3813a;
                i8 = (int) ((sVar.f3814b + j8) - j10);
                int i10 = sVar.f3815c;
                while (i8 < i10) {
                    byte b11 = bArr[i8];
                    if (b11 == b9 || b11 == b10) {
                        i9 = sVar.f3814b;
                        return (i8 - i9) + j10;
                    }
                    i8++;
                }
                j10 += sVar.f3815c - sVar.f3814b;
                sVar = sVar.f3818f;
                j8 = j10;
            }
            return -1L;
        }
        byte[] bArrE = fVar.e();
        while (j10 < this.f3775b) {
            byte[] bArr2 = sVar.f3813a;
            i8 = (int) ((sVar.f3814b + j8) - j10);
            int i11 = sVar.f3815c;
            while (i8 < i11) {
                byte b12 = bArr2[i8];
                for (byte b13 : bArrE) {
                    if (b12 == b13) {
                        i9 = sVar.f3814b;
                        return (i8 - i9) + j10;
                    }
                }
                i8++;
            }
            j10 += sVar.f3815c - sVar.f3814b;
            sVar = sVar.f3818f;
            j8 = j10;
        }
        return -1L;
    }

    @Override // P7.e
    public boolean rangeEquals(long j8, f fVar, int i8, int i9) {
        if (j8 < 0 || i8 < 0 || i9 < 0 || this.f3775b - j8 < i9 || fVar.size() - i8 < i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (getByte(i10 + j8) != fVar.getByte(i8 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // P7.e
    public int read(byte[] bArr, int i8, int i9) {
        y.checkOffsetAndCount(bArr.length, i8, i9);
        s sVar = this.f3774a;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(i9, sVar.f3815c - sVar.f3814b);
        System.arraycopy(sVar.f3813a, sVar.f3814b, bArr, i8, iMin);
        int i10 = sVar.f3814b + iMin;
        sVar.f3814b = i10;
        this.f3775b -= iMin;
        if (i10 == sVar.f3815c) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        }
        return iMin;
    }

    public final C0065c readAndWriteUnsafe(C0065c c0065c) {
        if (c0065c.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0065c.buffer = this;
        c0065c.readWrite = true;
        return c0065c;
    }

    @Override // P7.e
    public f readByteString(long j8) {
        return new f(readByteArray(j8));
    }

    public final c readFrom(InputStream inputStream, long j8) throws IOException {
        if (j8 >= 0) {
            d(inputStream, j8, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    public final C0065c readUnsafe(C0065c c0065c) {
        if (c0065c.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c0065c.buffer = this;
        c0065c.readWrite = false;
        return c0065c;
    }

    @Override // P7.e
    public String readUtf8LineStrict(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j8);
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j9);
        if (jIndexOf != -1) {
            return e(jIndexOf);
        }
        if (j9 < size() && getByte(j9 - 1) == 13 && getByte(j9) == 10) {
            return e(j9);
        }
        c cVar = new c();
        copyTo(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j8) + " content=" + cVar.readByteString().hex() + (char) 8230);
    }

    @Override // P7.d
    public c writeByte(int i8) {
        s sVarG = g(1);
        byte[] bArr = sVarG.f3813a;
        int i9 = sVarG.f3815c;
        sVarG.f3815c = i9 + 1;
        bArr[i9] = (byte) i8;
        this.f3775b++;
        return this;
    }

    @Override // P7.d
    public c writeDecimalLong(long j8) {
        boolean z8;
        if (j8 == 0) {
            return writeByte(48);
        }
        int i8 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j8 >= 100000000) {
            i8 = j8 < 1000000000000L ? j8 < 10000000000L ? j8 < 1000000000 ? 9 : 10 : j8 < 100000000000L ? 11 : 12 : j8 < 1000000000000000L ? j8 < 10000000000000L ? 13 : j8 < 100000000000000L ? 14 : 15 : j8 < 100000000000000000L ? j8 < 10000000000000000L ? 16 : 17 : j8 < 1000000000000000000L ? 18 : 19;
        } else if (j8 >= H0.y.MIN_BACKOFF_MILLIS) {
            i8 = j8 < 1000000 ? j8 < 100000 ? 5 : 6 : j8 < 10000000 ? 7 : 8;
        } else if (j8 >= 100) {
            i8 = j8 < 1000 ? 3 : 4;
        } else if (j8 >= 10) {
            i8 = 2;
        }
        if (z8) {
            i8++;
        }
        s sVarG = g(i8);
        byte[] bArr = sVarG.f3813a;
        int i9 = sVarG.f3815c + i8;
        while (j8 != 0) {
            i9--;
            bArr[i9] = f3773c[(int) (j8 % 10)];
            j8 /= 10;
        }
        if (z8) {
            bArr[i9 - 1] = 45;
        }
        sVarG.f3815c += i8;
        this.f3775b += i8;
        return this;
    }

    @Override // P7.d
    public c writeHexadecimalUnsignedLong(long j8) {
        if (j8 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j8)) / 4) + 1;
        s sVarG = g(iNumberOfTrailingZeros);
        byte[] bArr = sVarG.f3813a;
        int i8 = sVarG.f3815c;
        for (int i9 = (i8 + iNumberOfTrailingZeros) - 1; i9 >= i8; i9--) {
            bArr[i9] = f3773c[(int) (15 & j8)];
            j8 >>>= 4;
        }
        sVarG.f3815c += iNumberOfTrailingZeros;
        this.f3775b += iNumberOfTrailingZeros;
        return this;
    }

    @Override // P7.d
    public c writeInt(int i8) {
        s sVarG = g(4);
        byte[] bArr = sVarG.f3813a;
        int i9 = sVarG.f3815c;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        sVarG.f3815c = i9 + 4;
        this.f3775b += 4;
        return this;
    }

    @Override // P7.d
    public c writeIntLe(int i8) {
        return writeInt(y.reverseBytesInt(i8));
    }

    @Override // P7.d
    public c writeLong(long j8) {
        s sVarG = g(8);
        byte[] bArr = sVarG.f3813a;
        int i8 = sVarG.f3815c;
        bArr[i8] = (byte) ((j8 >>> 56) & 255);
        bArr[i8 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i8 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i8 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i8 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i8 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i8 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i8 + 7] = (byte) (j8 & 255);
        sVarG.f3815c = i8 + 8;
        this.f3775b += 8;
        return this;
    }

    @Override // P7.d
    public c writeLongLe(long j8) {
        return writeLong(y.reverseBytesLong(j8));
    }

    @Override // P7.d
    public c writeShort(int i8) {
        s sVarG = g(2);
        byte[] bArr = sVarG.f3813a;
        int i9 = sVarG.f3815c;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        sVarG.f3815c = i9 + 2;
        this.f3775b += 2;
        return this;
    }

    @Override // P7.d
    public c writeShortLe(int i8) {
        return writeShort((int) y.reverseBytesShort((short) i8));
    }

    public final c writeTo(OutputStream outputStream, long j8) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.checkOffsetAndCount(this.f3775b, 0L, j8);
        s sVar = this.f3774a;
        while (j8 > 0) {
            int iMin = (int) Math.min(j8, sVar.f3815c - sVar.f3814b);
            outputStream.write(sVar.f3813a, sVar.f3814b, iMin);
            int i8 = sVar.f3814b + iMin;
            sVar.f3814b = i8;
            long j9 = iMin;
            this.f3775b -= j9;
            j8 -= j9;
            if (i8 == sVar.f3815c) {
                s sVarPop = sVar.pop();
                this.f3774a = sVarPop;
                t.a(sVar);
                sVar = sVarPop;
            }
        }
        return this;
    }

    @Override // P7.d
    public c writeUtf8CodePoint(int i8) {
        if (i8 < 128) {
            writeByte(i8);
        } else if (i8 < 2048) {
            writeByte((i8 >> 6) | 192);
            writeByte((i8 & 63) | 128);
        } else if (i8 < 65536) {
            if (i8 < 55296 || i8 > 57343) {
                writeByte((i8 >> 12) | 224);
                writeByte(((i8 >> 6) & 63) | 128);
                writeByte((i8 & 63) | 128);
            } else {
                writeByte(63);
            }
        } else {
            if (i8 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i8));
            }
            writeByte((i8 >> 18) | 240);
            writeByte(((i8 >> 12) & 63) | 128);
            writeByte(((i8 >> 6) & 63) | 128);
            writeByte((i8 & 63) | 128);
        }
        return this;
    }

    @Override // P7.e
    public long indexOf(byte b9, long j8, long j9) {
        s sVar;
        long j10 = 0;
        if (j8 >= 0 && j9 >= j8) {
            long j11 = this.f3775b;
            long j12 = j9 > j11 ? j11 : j9;
            if (j8 == j12 || (sVar = this.f3774a) == null) {
                return -1L;
            }
            if (j11 - j8 < j8) {
                while (j11 > j8) {
                    sVar = sVar.f3819g;
                    j11 -= sVar.f3815c - sVar.f3814b;
                }
            } else {
                while (true) {
                    long j13 = (sVar.f3815c - sVar.f3814b) + j10;
                    if (j13 >= j8) {
                        break;
                    }
                    sVar = sVar.f3818f;
                    j10 = j13;
                }
                j11 = j10;
            }
            long j14 = j8;
            while (j11 < j12) {
                byte[] bArr = sVar.f3813a;
                int iMin = (int) Math.min(sVar.f3815c, (sVar.f3814b + j12) - j11);
                for (int i8 = (int) ((sVar.f3814b + j14) - j11); i8 < iMin; i8++) {
                    if (bArr[i8] == b9) {
                        return (i8 - sVar.f3814b) + j11;
                    }
                }
                j11 += sVar.f3815c - sVar.f3814b;
                sVar = sVar.f3818f;
                j14 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f3775b), Long.valueOf(j8), Long.valueOf(j9)));
    }

    @Override // P7.e
    public byte[] readByteArray(long j8) throws EOFException {
        y.checkOffsetAndCount(this.f3775b, 0L, j8);
        if (j8 <= 2147483647L) {
            byte[] bArr = new byte[(int) j8];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
    }

    @Override // P7.e
    public String readString(long j8, Charset charset) {
        y.checkOffsetAndCount(this.f3775b, 0L, j8);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j8 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
        }
        if (j8 == 0) {
            return "";
        }
        s sVar = this.f3774a;
        int i8 = sVar.f3814b;
        if (i8 + j8 > sVar.f3815c) {
            return new String(readByteArray(j8), charset);
        }
        String str = new String(sVar.f3813a, i8, (int) j8, charset);
        int i9 = (int) (sVar.f3814b + j8);
        sVar.f3814b = i9;
        this.f3775b -= j8;
        if (i9 == sVar.f3815c) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        }
        return str;
    }

    @Override // P7.e
    public String readUtf8(long j8) {
        return readString(j8, y.UTF_8);
    }

    @Override // P7.d
    public c writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @Override // P7.d
    public c writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    public final f snapshot(int i8) {
        if (i8 == 0) {
            return f.EMPTY;
        }
        return new u(this, i8);
    }

    @Override // P7.d
    public c write(f fVar) {
        if (fVar != null) {
            fVar.f(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // P7.d
    public c writeString(String str, int i8, int i9, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i8 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i8);
        }
        if (i9 >= i8) {
            if (i9 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(y.UTF_8)) {
                        return writeUtf8(str, i8, i9);
                    }
                    byte[] bytes = str.substring(i8, i9).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
    }

    @Override // P7.d
    public c writeUtf8(String str, int i8, int i9) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i8);
        }
        if (i9 >= i8) {
            if (i9 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
            }
            while (i8 < i9) {
                char cCharAt = str.charAt(i8);
                if (cCharAt < 128) {
                    s sVarG = g(1);
                    byte[] bArr = sVarG.f3813a;
                    int i10 = sVarG.f3815c - i8;
                    int iMin = Math.min(i9, 8192 - i10);
                    int i11 = i8 + 1;
                    bArr[i8 + i10] = (byte) cCharAt;
                    while (i11 < iMin) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 >= 128) {
                            break;
                        }
                        bArr[i11 + i10] = (byte) cCharAt2;
                        i11++;
                    }
                    int i12 = sVarG.f3815c;
                    int i13 = (i10 + i11) - i12;
                    sVarG.f3815c = i12 + i13;
                    this.f3775b += i13;
                    i8 = i11;
                } else {
                    if (cCharAt < 2048) {
                        writeByte((cCharAt >> 6) | 192);
                        writeByte((cCharAt & '?') | 128);
                    } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                        int i14 = i8 + 1;
                        char cCharAt3 = i14 < i9 ? str.charAt(i14) : (char) 0;
                        if (cCharAt <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i15 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            writeByte((i15 >> 18) | 240);
                            writeByte(((i15 >> 12) & 63) | 128);
                            writeByte(((i15 >> 6) & 63) | 128);
                            writeByte((i15 & 63) | 128);
                            i8 += 2;
                        } else {
                            writeByte(63);
                            i8 = i14;
                        }
                    } else {
                        writeByte((cCharAt >> '\f') | 224);
                        writeByte(((cCharAt >> 6) & 63) | 128);
                        writeByte((cCharAt & '?') | 128);
                    }
                    i8++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
    }

    @Override // P7.e
    public void readFully(byte[] bArr) throws EOFException {
        int i8 = 0;
        while (i8 < bArr.length) {
            int i9 = read(bArr, i8, bArr.length - i8);
            if (i9 == -1) {
                throw new EOFException();
            }
            i8 += i9;
        }
    }

    @Override // P7.d
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // P7.d
    public c write(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            long j8 = i9;
            y.checkOffsetAndCount(bArr.length, i8, j8);
            int i10 = i9 + i8;
            while (i8 < i10) {
                s sVarG = g(1);
                int iMin = Math.min(i10 - i8, 8192 - sVarG.f3815c);
                System.arraycopy(bArr, i8, sVarG.f3813a, sVarG.f3815c, iMin);
                i8 += iMin;
                sVarG.f3815c += iMin;
            }
            this.f3775b += j8;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c copyTo(c cVar, long j8, long j9) {
        if (cVar != null) {
            y.checkOffsetAndCount(this.f3775b, j8, j9);
            if (j9 == 0) {
                return this;
            }
            cVar.f3775b += j9;
            s sVar = this.f3774a;
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
                s sVarA = sVar.a();
                int i10 = (int) (sVarA.f3814b + j8);
                sVarA.f3814b = i10;
                sVarA.f3815c = Math.min(i10 + ((int) j9), sVarA.f3815c);
                s sVar2 = cVar.f3774a;
                if (sVar2 == null) {
                    sVarA.f3819g = sVarA;
                    sVarA.f3818f = sVarA;
                    cVar.f3774a = sVarA;
                } else {
                    sVar2.f3819g.push(sVarA);
                }
                j9 -= sVarA.f3815c - sVarA.f3814b;
                sVar = sVar.f3818f;
                j8 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        s sVar = this.f3774a;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), sVar.f3815c - sVar.f3814b);
        byteBuffer.put(sVar.f3813a, sVar.f3814b, iMin);
        int i8 = sVar.f3814b + iMin;
        sVar.f3814b = i8;
        this.f3775b -= iMin;
        if (i8 == sVar.f3815c) {
            this.f3774a = sVar.pop();
            t.a(sVar);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i8 = iRemaining;
            while (i8 > 0) {
                s sVarG = g(1);
                int iMin = Math.min(i8, 8192 - sVarG.f3815c);
                byteBuffer.get(sVarG.f3813a, sVarG.f3815c, iMin);
                i8 -= iMin;
                sVarG.f3815c += iMin;
            }
            this.f3775b += iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // P7.e
    public long indexOf(f fVar) {
        return indexOf(fVar, 0L);
    }

    @Override // P7.e
    public long indexOf(f fVar, long j8) {
        byte[] bArr;
        if (fVar.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j9 = 0;
        if (j8 >= 0) {
            s sVar = this.f3774a;
            long j10 = -1;
            if (sVar == null) {
                return -1L;
            }
            long j11 = this.f3775b;
            if (j11 - j8 < j8) {
                while (j11 > j8) {
                    sVar = sVar.f3819g;
                    j11 -= sVar.f3815c - sVar.f3814b;
                }
            } else {
                while (true) {
                    long j12 = (sVar.f3815c - sVar.f3814b) + j9;
                    if (j12 >= j8) {
                        break;
                    }
                    sVar = sVar.f3818f;
                    j9 = j12;
                }
                j11 = j9;
            }
            byte b9 = fVar.getByte(0);
            int size = fVar.size();
            long j13 = 1 + (this.f3775b - size);
            long j14 = j8;
            s sVar2 = sVar;
            long j15 = j11;
            while (j15 < j13) {
                byte[] bArr2 = sVar2.f3813a;
                int iMin = (int) Math.min(sVar2.f3815c, (sVar2.f3814b + j13) - j15);
                int i8 = (int) ((sVar2.f3814b + j14) - j15);
                while (i8 < iMin) {
                    if (bArr2[i8] == b9) {
                        bArr = bArr2;
                        if (c(sVar2, i8 + 1, fVar, 1, size)) {
                            return (i8 - sVar2.f3814b) + j15;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i8++;
                    bArr2 = bArr;
                }
                j15 += sVar2.f3815c - sVar2.f3814b;
                sVar2 = sVar2.f3818f;
                j14 = j15;
                j10 = -1;
            }
            return j10;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // P7.e, P7.w
    public long read(c cVar, long j8) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j8 >= 0) {
            long j9 = this.f3775b;
            if (j9 == 0) {
                return -1L;
            }
            if (j8 > j9) {
                j8 = j9;
            }
            cVar.write(this, j8);
            return j8;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    @Override // P7.d
    public d write(w wVar, long j8) throws EOFException {
        while (j8 > 0) {
            long j9 = wVar.read(this, j8);
            if (j9 == -1) {
                throw new EOFException();
            }
            j8 -= j9;
        }
        return this;
    }

    @Override // P7.d, P7.v
    public void write(c cVar, long j8) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            y.checkOffsetAndCount(cVar.f3775b, 0L, j8);
            while (j8 > 0) {
                s sVar = cVar.f3774a;
                if (j8 < sVar.f3815c - sVar.f3814b) {
                    s sVar2 = this.f3774a;
                    s sVar3 = sVar2 != null ? sVar2.f3819g : null;
                    if (sVar3 != null && sVar3.f3817e) {
                        if ((sVar3.f3815c + j8) - (sVar3.f3816d ? 0 : sVar3.f3814b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            sVar.writeTo(sVar3, (int) j8);
                            cVar.f3775b -= j8;
                            this.f3775b += j8;
                            return;
                        }
                    }
                    cVar.f3774a = sVar.split((int) j8);
                }
                s sVar4 = cVar.f3774a;
                long j9 = sVar4.f3815c - sVar4.f3814b;
                cVar.f3774a = sVar4.pop();
                s sVar5 = this.f3774a;
                if (sVar5 == null) {
                    this.f3774a = sVar4;
                    sVar4.f3819g = sVar4;
                    sVar4.f3818f = sVar4;
                } else {
                    sVar5.f3819g.push(sVar4).compact();
                }
                cVar.f3775b -= j9;
                this.f3775b += j9;
                j8 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // P7.e, P7.d
    public c buffer() {
        return this;
    }

    @Override // P7.e, P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // P7.d
    public d emit() {
        return this;
    }

    @Override // P7.d, P7.v, java.io.Flushable
    public void flush() {
    }

    @Override // P7.e
    public c getBuffer() {
        return this;
    }
}
