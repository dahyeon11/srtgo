package I7;

import I7.d;
import P7.w;
import P7.x;
import R6.D;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class h implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    static final Logger f2464e = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final P7.e f2465a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2466b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2467c;

    /* renamed from: d, reason: collision with root package name */
    final d.a f2468d;

    interface b {
        void ackSettings();

        void alternateService(int i8, String str, P7.f fVar, String str2, int i9, long j8);

        void data(boolean z8, int i8, P7.e eVar, int i9);

        void goAway(int i8, I7.b bVar, P7.f fVar);

        void headers(boolean z8, int i8, int i9, List<c> list);

        void ping(boolean z8, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z8);

        void pushPromise(int i8, int i9, List<c> list);

        void rstStream(int i8, I7.b bVar);

        void settings(boolean z8, m mVar);

        void windowUpdate(int i8, long j8);
    }

    h(P7.e eVar, boolean z8) {
        this.f2465a = eVar;
        this.f2467c = z8;
        a aVar = new a(eVar);
        this.f2466b = aVar;
        this.f2468d = new d.a(4096, aVar);
    }

    static int a(int i8, byte b9, short s8) throws IOException {
        if ((b9 & 8) != 0) {
            i8--;
        }
        if (s8 <= i8) {
            return (short) (i8 - s8);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s8), Integer.valueOf(i8));
    }

    private void b(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i9 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z8 = (b9 & 1) != 0;
        if ((b9 & 32) != 0) {
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s8 = (b9 & 8) != 0 ? (short) (this.f2465a.readByte() & 255) : (short) 0;
        bVar.data(z8, i9, this.f2465a, a(i8, b9, s8));
        this.f2465a.skip(s8);
    }

    private void c(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i8 < 8) {
            throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i8));
        }
        if (i9 != 0) {
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i10 = this.f2465a.readInt();
        int i11 = this.f2465a.readInt();
        int i12 = i8 - 8;
        I7.b bVarFromHttp2 = I7.b.fromHttp2(i11);
        if (bVarFromHttp2 == null) {
            throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i11));
        }
        P7.f byteString = P7.f.EMPTY;
        if (i12 > 0) {
            byteString = this.f2465a.readByteString(i12);
        }
        bVar.goAway(i10, bVarFromHttp2, byteString);
    }

    private List d(int i8, short s8, byte b9, int i9) throws IOException {
        a aVar = this.f2466b;
        aVar.f2473e = i8;
        aVar.f2470b = i8;
        aVar.f2474f = s8;
        aVar.f2471c = b9;
        aVar.f2472d = i9;
        this.f2468d.j();
        return this.f2468d.getAndResetHeaderList();
    }

    private void e(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i9 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z8 = (b9 & 1) != 0;
        short s8 = (b9 & 8) != 0 ? (short) (this.f2465a.readByte() & 255) : (short) 0;
        if ((b9 & 32) != 0) {
            h(bVar, i9);
            i8 -= 5;
        }
        bVar.headers(z8, i9, -1, d(a(i8, b9, s8), s8, b9, i9));
    }

    static int f(P7.e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    private void g(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i8 != 8) {
            throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i8));
        }
        if (i9 != 0) {
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.ping((b9 & 1) != 0, this.f2465a.readInt(), this.f2465a.readInt());
    }

    private void h(b bVar, int i8) {
        int i9 = this.f2465a.readInt();
        bVar.priority(i8, i9 & Integer.MAX_VALUE, (this.f2465a.readByte() & 255) + 1, (Integer.MIN_VALUE & i9) != 0);
    }

    private void i(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i8 != 5) {
            throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i8));
        }
        if (i9 == 0) {
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        h(bVar, i9);
    }

    private void j(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i9 == 0) {
            throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s8 = (b9 & 8) != 0 ? (short) (this.f2465a.readByte() & 255) : (short) 0;
        bVar.pushPromise(i9, this.f2465a.readInt() & Integer.MAX_VALUE, d(a(i8 - 4, b9, s8), s8, b9, i9));
    }

    private void k(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i8 != 4) {
            throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i8));
        }
        if (i9 == 0) {
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i10 = this.f2465a.readInt();
        I7.b bVarFromHttp2 = I7.b.fromHttp2(i10);
        if (bVarFromHttp2 == null) {
            throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
        }
        bVar.rstStream(i9, bVarFromHttp2);
    }

    private void l(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i9 != 0) {
            throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b9 & 1) != 0) {
            if (i8 != 0) {
                throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.ackSettings();
            return;
        }
        if (i8 % 6 != 0) {
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i8));
        }
        m mVar = new m();
        for (int i10 = 0; i10 < i8; i10 += 6) {
            int i11 = this.f2465a.readShort() & D.MAX_VALUE;
            int i12 = this.f2465a.readInt();
            if (i11 == 2) {
                if (i12 != 0 && i12 != 1) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i11 == 3) {
                i11 = 4;
            } else if (i11 != 4) {
                if (i11 == 5 && (i12 < 16384 || i12 > 16777215)) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i12));
                }
            } else {
                if (i12 < 0) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i11 = 7;
            }
            mVar.i(i11, i12);
        }
        bVar.settings(false, mVar);
    }

    private void m(b bVar, int i8, byte b9, int i9) throws IOException {
        if (i8 != 4) {
            throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i8));
        }
        long j8 = this.f2465a.readInt() & 2147483647L;
        if (j8 == 0) {
            throw e.d("windowSizeIncrement was 0", Long.valueOf(j8));
        }
        bVar.windowUpdate(i9, j8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2465a.close();
    }

    public boolean nextFrame(boolean z8, b bVar) throws IOException {
        try {
            this.f2465a.require(9L);
            int iF = f(this.f2465a);
            if (iF < 0 || iF > 16384) {
                throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(iF));
            }
            byte b9 = (byte) (this.f2465a.readByte() & 255);
            if (z8 && b9 != 4) {
                throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(b9));
            }
            byte b10 = (byte) (this.f2465a.readByte() & 255);
            int i8 = this.f2465a.readInt() & Integer.MAX_VALUE;
            Logger logger = f2464e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, i8, iF, b9, b10));
            }
            switch (b9) {
                case 0:
                    b(bVar, iF, b10, i8);
                    return true;
                case 1:
                    e(bVar, iF, b10, i8);
                    return true;
                case 2:
                    i(bVar, iF, b10, i8);
                    return true;
                case 3:
                    k(bVar, iF, b10, i8);
                    return true;
                case 4:
                    l(bVar, iF, b10, i8);
                    return true;
                case 5:
                    j(bVar, iF, b10, i8);
                    return true;
                case 6:
                    g(bVar, iF, b10, i8);
                    return true;
                case 7:
                    c(bVar, iF, b10, i8);
                    return true;
                case 8:
                    m(bVar, iF, b10, i8);
                    return true;
                default:
                    this.f2465a.skip(iF);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void readConnectionPreface(b bVar) throws IOException {
        if (this.f2467c) {
            if (!nextFrame(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        P7.e eVar = this.f2465a;
        P7.f fVar = e.f2383a;
        P7.f byteString = eVar.readByteString(fVar.size());
        Logger logger = f2464e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(D7.e.format("<< CONNECTION %s", byteString.hex()));
        }
        if (!fVar.equals(byteString)) {
            throw e.d("Expected a connection header but was %s", byteString.utf8());
        }
    }

    static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        private final P7.e f2469a;

        /* renamed from: b, reason: collision with root package name */
        int f2470b;

        /* renamed from: c, reason: collision with root package name */
        byte f2471c;

        /* renamed from: d, reason: collision with root package name */
        int f2472d;

        /* renamed from: e, reason: collision with root package name */
        int f2473e;

        /* renamed from: f, reason: collision with root package name */
        short f2474f;

        a(P7.e eVar) {
            this.f2469a = eVar;
        }

        private void a() throws IOException {
            int i8 = this.f2472d;
            int iF = h.f(this.f2469a);
            this.f2473e = iF;
            this.f2470b = iF;
            byte b9 = (byte) (this.f2469a.readByte() & 255);
            this.f2471c = (byte) (this.f2469a.readByte() & 255);
            Logger logger = h.f2464e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f2472d, this.f2470b, b9, this.f2471c));
            }
            int i9 = this.f2469a.readInt() & Integer.MAX_VALUE;
            this.f2472d = i9;
            if (b9 != 9) {
                throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(b9));
            }
            if (i9 != i8) {
                throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            while (true) {
                int i8 = this.f2473e;
                if (i8 != 0) {
                    long j9 = this.f2469a.read(cVar, Math.min(j8, i8));
                    if (j9 == -1) {
                        return -1L;
                    }
                    this.f2473e = (int) (this.f2473e - j9);
                    return j9;
                }
                this.f2469a.skip(this.f2474f);
                this.f2474f = (short) 0;
                if ((this.f2471c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // P7.w
        public x timeout() {
            return this.f2469a.timeout();
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
