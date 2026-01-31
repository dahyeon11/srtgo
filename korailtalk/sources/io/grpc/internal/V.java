package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
class V implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private int f32548e;

    /* renamed from: f, reason: collision with root package name */
    private int f32549f;

    /* renamed from: g, reason: collision with root package name */
    private Inflater f32550g;

    /* renamed from: j, reason: collision with root package name */
    private int f32553j;

    /* renamed from: k, reason: collision with root package name */
    private int f32554k;

    /* renamed from: l, reason: collision with root package name */
    private long f32555l;

    /* renamed from: a, reason: collision with root package name */
    private final C5780w f32544a = new C5780w();

    /* renamed from: b, reason: collision with root package name */
    private final CRC32 f32545b = new CRC32();

    /* renamed from: c, reason: collision with root package name */
    private final b f32546c = new b(this, null);

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f32547d = new byte[512];

    /* renamed from: h, reason: collision with root package name */
    private c f32551h = c.HEADER;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32552i = false;

    /* renamed from: m, reason: collision with root package name */
    private int f32556m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f32557n = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f32558o = true;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32559a;

        static {
            int[] iArr = new int[c.values().length];
            f32559a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32559a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32559a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32559a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32559a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32559a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32559a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32559a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32559a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32559a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int unsignedByte;
            if (V.this.f32549f - V.this.f32548e > 0) {
                unsignedByte = V.this.f32547d[V.this.f32548e] & 255;
                V.c(V.this, 1);
            } else {
                unsignedByte = V.this.f32544a.readUnsignedByte();
            }
            V.this.f32545b.update(unsignedByte);
            V.g(V.this, 1);
            return unsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return j() | (j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (V.this.f32549f - V.this.f32548e) + V.this.f32544a.readableBytes();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i8) {
            int i9;
            int i10 = V.this.f32549f - V.this.f32548e;
            if (i10 > 0) {
                int iMin = Math.min(i10, i8);
                V.this.f32545b.update(V.this.f32547d, V.this.f32548e, iMin);
                V.c(V.this, iMin);
                i9 = i8 - iMin;
            } else {
                i9 = i8;
            }
            if (i9 > 0) {
                byte[] bArr = new byte[512];
                int i11 = 0;
                while (i11 < i9) {
                    int iMin2 = Math.min(i9 - i11, 512);
                    V.this.f32544a.readBytes(bArr, 0, iMin2);
                    V.this.f32545b.update(bArr, 0, iMin2);
                    i11 += iMin2;
                }
            }
            V.g(V.this, i8);
        }

        /* synthetic */ b(V v8, a aVar) {
            this();
        }
    }

    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    V() {
    }

    static /* synthetic */ int c(V v8, int i8) {
        int i9 = v8.f32548e + i8;
        v8.f32548e = i9;
        return i9;
    }

    static /* synthetic */ int g(V v8, int i8) {
        int i9 = v8.f32556m + i8;
        v8.f32556m = i9;
        return i9;
    }

    private boolean i() {
        e3.w.checkState(this.f32550g != null, "inflater is null");
        e3.w.checkState(this.f32548e == this.f32549f, "inflaterInput has unconsumed bytes");
        int iMin = Math.min(this.f32544a.readableBytes(), 512);
        if (iMin == 0) {
            return false;
        }
        this.f32548e = 0;
        this.f32549f = iMin;
        this.f32544a.readBytes(this.f32547d, 0, iMin);
        this.f32550g.setInput(this.f32547d, this.f32548e, iMin);
        this.f32551h = c.INFLATING;
        return true;
    }

    private int m(byte[] bArr, int i8, int i9) throws DataFormatException {
        e3.w.checkState(this.f32550g != null, "inflater is null");
        try {
            int totalIn = this.f32550g.getTotalIn();
            int iInflate = this.f32550g.inflate(bArr, i8, i9);
            int totalIn2 = this.f32550g.getTotalIn() - totalIn;
            this.f32556m += totalIn2;
            this.f32557n += totalIn2;
            this.f32548e += totalIn2;
            this.f32545b.update(bArr, i8, iInflate);
            if (this.f32550g.finished()) {
                this.f32555l = this.f32550g.getBytesWritten() & 4294967295L;
                this.f32551h = c.TRAILER;
            } else if (this.f32550g.needsInput()) {
                this.f32551h = c.INFLATER_NEEDS_INPUT;
            }
            return iInflate;
        } catch (DataFormatException e8) {
            throw new DataFormatException("Inflater data format exception: " + e8.getMessage());
        }
    }

    private boolean o() {
        Inflater inflater = this.f32550g;
        if (inflater == null) {
            this.f32550g = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f32545b.reset();
        int i8 = this.f32549f;
        int i9 = this.f32548e;
        int i10 = i8 - i9;
        if (i10 > 0) {
            this.f32550g.setInput(this.f32547d, i9, i10);
            this.f32551h = c.INFLATING;
        } else {
            this.f32551h = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    private boolean q() throws ZipException {
        if (this.f32546c.k() < 10) {
            return false;
        }
        if (this.f32546c.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f32546c.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f32553j = this.f32546c.h();
        this.f32546c.l(6);
        this.f32551h = c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean r() {
        if ((this.f32553j & 16) != 16) {
            this.f32551h = c.HEADER_CRC;
            return true;
        }
        if (!this.f32546c.g()) {
            return false;
        }
        this.f32551h = c.HEADER_CRC;
        return true;
    }

    private boolean s() throws ZipException {
        if ((this.f32553j & 2) != 2) {
            this.f32551h = c.INITIALIZE_INFLATER;
            return true;
        }
        if (this.f32546c.k() < 2) {
            return false;
        }
        if ((((int) this.f32545b.getValue()) & 65535) != this.f32546c.j()) {
            throw new ZipException("Corrupt GZIP header");
        }
        this.f32551h = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean t() {
        int iK = this.f32546c.k();
        int i8 = this.f32554k;
        if (iK < i8) {
            return false;
        }
        this.f32546c.l(i8);
        this.f32551h = c.HEADER_NAME;
        return true;
    }

    private boolean u() {
        if ((this.f32553j & 4) != 4) {
            this.f32551h = c.HEADER_NAME;
            return true;
        }
        if (this.f32546c.k() < 2) {
            return false;
        }
        this.f32554k = this.f32546c.j();
        this.f32551h = c.HEADER_EXTRA;
        return true;
    }

    private boolean v() {
        if ((this.f32553j & 8) != 8) {
            this.f32551h = c.HEADER_COMMENT;
            return true;
        }
        if (!this.f32546c.g()) {
            return false;
        }
        this.f32551h = c.HEADER_COMMENT;
        return true;
    }

    private boolean w() throws ZipException {
        if (this.f32550g != null && this.f32546c.k() <= 18) {
            this.f32550g.end();
            this.f32550g = null;
        }
        if (this.f32546c.k() < 8) {
            return false;
        }
        if (this.f32545b.getValue() != this.f32546c.i() || this.f32555l != this.f32546c.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f32545b.reset();
        this.f32551h = c.HEADER;
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32552i) {
            return;
        }
        this.f32552i = true;
        this.f32544a.close();
        Inflater inflater = this.f32550g;
        if (inflater != null) {
            inflater.end();
            this.f32550g = null;
        }
    }

    void h(y0 y0Var) {
        e3.w.checkState(!this.f32552i, "GzipInflatingBuffer is closed");
        this.f32544a.addBuffer(y0Var);
        this.f32558o = false;
    }

    int j() {
        int i8 = this.f32556m;
        this.f32556m = 0;
        return i8;
    }

    int k() {
        int i8 = this.f32557n;
        this.f32557n = 0;
        return i8;
    }

    boolean l() {
        e3.w.checkState(!this.f32552i, "GzipInflatingBuffer is closed");
        return (this.f32546c.k() == 0 && this.f32551h == c.HEADER) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.f32551h != io.grpc.internal.V.c.HEADER) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r6.f32546c.k() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r6.f32558o = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int n(byte[] r7, int r8, int r9) throws java.util.zip.ZipException {
        /*
            r6 = this;
            boolean r0 = r6.f32552i
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            e3.w.checkState(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L77
            int r4 = r9 - r3
            if (r4 <= 0) goto L77
            int[] r2 = io.grpc.internal.V.a.f32559a
            io.grpc.internal.V$c r5 = r6.f32551h
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L72;
                case 2: goto L6d;
                case 3: goto L68;
                case 4: goto L63;
                case 5: goto L5e;
                case 6: goto L59;
                case 7: goto L54;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            io.grpc.internal.V$c r9 = r6.f32551h
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.w()
            goto Lc
        L3d:
            boolean r2 = r6.i()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.m(r7, r2, r4)
            int r3 = r3 + r2
            io.grpc.internal.V$c r2 = r6.f32551h
            io.grpc.internal.V$c r4 = io.grpc.internal.V.c.TRAILER
            if (r2 != r4) goto Lb
            boolean r2 = r6.w()
            goto Lc
        L54:
            boolean r2 = r6.o()
            goto Lc
        L59:
            boolean r2 = r6.s()
            goto Lc
        L5e:
            boolean r2 = r6.r()
            goto Lc
        L63:
            boolean r2 = r6.v()
            goto Lc
        L68:
            boolean r2 = r6.t()
            goto Lc
        L6d:
            boolean r2 = r6.u()
            goto Lc
        L72:
            boolean r2 = r6.q()
            goto Lc
        L77:
            if (r2 == 0) goto L8b
            io.grpc.internal.V$c r7 = r6.f32551h
            io.grpc.internal.V$c r8 = io.grpc.internal.V.c.HEADER
            if (r7 != r8) goto L8a
            io.grpc.internal.V$b r7 = r6.f32546c
            int r7 = io.grpc.internal.V.b.d(r7)
            r8 = 10
            if (r7 >= r8) goto L8a
            goto L8b
        L8a:
            r1 = r0
        L8b:
            r6.f32558o = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.V.n(byte[], int, int):int");
    }

    boolean p() {
        e3.w.checkState(!this.f32552i, "GzipInflatingBuffer is closed");
        return this.f32558o;
    }
}
