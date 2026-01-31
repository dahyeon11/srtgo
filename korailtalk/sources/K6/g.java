package K6;

import K6.b;
import K6.f;
import P7.w;
import P7.x;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f2939a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final P7.f f2940b = P7.f.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f2947a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f2948b = new String[64];

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f2949c = new String[256];

        static {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr = f2949c;
                if (i9 >= strArr.length) {
                    break;
                }
                strArr[i9] = String.format("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
                i9++;
            }
            String[] strArr2 = f2948b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i10 = iArr[0];
            strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr2[i11];
                int i13 = iArr[0];
                String[] strArr3 = f2948b;
                int i14 = i13 | i12;
                strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
                strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f2948b;
                if (i8 >= strArr4.length) {
                    return;
                }
                if (strArr4[i8] == null) {
                    strArr4[i8] = f2949c[i8];
                }
                i8++;
            }
        }

        static String a(byte b9, byte b10) {
            if (b10 == 0) {
                return "";
            }
            if (b9 != 2 && b9 != 3) {
                if (b9 == 4 || b9 == 6) {
                    return b10 == 1 ? "ACK" : f2949c[b10];
                }
                if (b9 != 7 && b9 != 8) {
                    String[] strArr = f2948b;
                    String str = b10 < strArr.length ? strArr[b10] : f2949c[b10];
                    return (b9 != 5 || (b10 & 4) == 0) ? (b9 != 0 || (b10 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f2949c[b10];
        }

        static String b(boolean z8, int i8, int i9, byte b9, byte b10) {
            String[] strArr = f2947a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z8 ? "<<" : ">>", Integer.valueOf(i8), Integer.valueOf(i9), b9 < strArr.length ? strArr[b9] : String.format("0x%02x", Byte.valueOf(b9)), a(b9, b10));
        }
    }

    static final class c implements K6.b {

        /* renamed from: a, reason: collision with root package name */
        private final P7.e f2950a;

        /* renamed from: b, reason: collision with root package name */
        private final a f2951b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2952c;

        /* renamed from: d, reason: collision with root package name */
        final f.a f2953d;

        c(P7.e eVar, int i8, boolean z8) {
            this.f2950a = eVar;
            this.f2952c = z8;
            a aVar = new a(eVar);
            this.f2951b = aVar;
            this.f2953d = new f.a(i8, aVar);
        }

        private void a(b.a aVar, int i8, byte b9, int i9) throws IOException {
            boolean z8 = (b9 & 1) != 0;
            if ((b9 & 32) != 0) {
                throw g.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s8 = (b9 & 8) != 0 ? (short) (this.f2950a.readByte() & 255) : (short) 0;
            aVar.data(z8, i9, this.f2950a, g.j(i8, b9, s8));
            this.f2950a.skip(s8);
        }

        private void b(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i8 < 8) {
                throw g.i("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i8));
            }
            if (i9 != 0) {
                throw g.i("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i10 = this.f2950a.readInt();
            int i11 = this.f2950a.readInt();
            int i12 = i8 - 8;
            K6.a aVarFromHttp2 = K6.a.fromHttp2(i11);
            if (aVarFromHttp2 == null) {
                throw g.i("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i11));
            }
            P7.f byteString = P7.f.EMPTY;
            if (i12 > 0) {
                byteString = this.f2950a.readByteString(i12);
            }
            aVar.goAway(i10, aVarFromHttp2, byteString);
        }

        private List c(int i8, short s8, byte b9, int i9) throws IOException {
            a aVar = this.f2951b;
            aVar.f2945e = i8;
            aVar.f2942b = i8;
            aVar.f2946f = s8;
            aVar.f2943c = b9;
            aVar.f2944d = i9;
            this.f2953d.k();
            return this.f2953d.getAndResetHeaderList();
        }

        private void d(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i9 == 0) {
                throw g.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z8 = (b9 & 1) != 0;
            short s8 = (b9 & 8) != 0 ? (short) (this.f2950a.readByte() & 255) : (short) 0;
            if ((b9 & 32) != 0) {
                f(aVar, i9);
                i8 -= 5;
            }
            aVar.headers(false, z8, i9, -1, c(g.j(i8, b9, s8), s8, b9, i9), e.HTTP_20_HEADERS);
        }

        private void e(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i8 != 8) {
                throw g.i("TYPE_PING length != 8: %s", Integer.valueOf(i8));
            }
            if (i9 != 0) {
                throw g.i("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.ping((b9 & 1) != 0, this.f2950a.readInt(), this.f2950a.readInt());
        }

        private void f(b.a aVar, int i8) {
            int i9 = this.f2950a.readInt();
            aVar.priority(i8, i9 & Integer.MAX_VALUE, (this.f2950a.readByte() & 255) + 1, (Integer.MIN_VALUE & i9) != 0);
        }

        private void g(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i8 != 5) {
                throw g.i("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i8));
            }
            if (i9 == 0) {
                throw g.i("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            f(aVar, i9);
        }

        private void h(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i9 == 0) {
                throw g.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s8 = (b9 & 8) != 0 ? (short) (this.f2950a.readByte() & 255) : (short) 0;
            aVar.pushPromise(i9, this.f2950a.readInt() & Integer.MAX_VALUE, c(g.j(i8 - 4, b9, s8), s8, b9, i9));
        }

        private void i(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i8 != 4) {
                throw g.i("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i8));
            }
            if (i9 == 0) {
                throw g.i("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i10 = this.f2950a.readInt();
            K6.a aVarFromHttp2 = K6.a.fromHttp2(i10);
            if (aVarFromHttp2 == null) {
                throw g.i("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
            }
            aVar.rstStream(i9, aVarFromHttp2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void j(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i9 != 0) {
                throw g.i("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b9 & 1) != 0) {
                if (i8 != 0) {
                    throw g.i("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.ackSettings();
                return;
            }
            if (i8 % 6 != 0) {
                throw g.i("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i8));
            }
            i iVar = new i();
            for (int i10 = 0; i10 < i8; i10 += 6) {
                short s8 = this.f2950a.readShort();
                int i11 = this.f2950a.readInt();
                switch (s8) {
                    case 1:
                    case 6:
                        iVar.set(s8, 0, i11);
                    case 2:
                        if (i11 != 0 && i11 != 1) {
                            throw g.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        iVar.set(s8, 0, i11);
                    case 3:
                        s8 = 4;
                        iVar.set(s8, 0, i11);
                    case 4:
                        if (i11 < 0) {
                            throw g.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s8 = 7;
                        iVar.set(s8, 0, i11);
                    case 5:
                        if (i11 < 16384 || i11 > 16777215) {
                            throw g.i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i11));
                        }
                        iVar.set(s8, 0, i11);
                        break;
                    default:
                }
            }
            aVar.settings(false, iVar);
            if (iVar.a() >= 0) {
                this.f2953d.f(iVar.a());
            }
        }

        private void k(b.a aVar, int i8, byte b9, int i9) throws IOException {
            if (i8 != 4) {
                throw g.i("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i8));
            }
            long j8 = this.f2950a.readInt() & 2147483647L;
            if (j8 == 0) {
                throw g.i("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.windowUpdate(i9, j8);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2950a.close();
        }

        @Override // K6.b
        public boolean nextFrame(b.a aVar) throws IOException {
            try {
                this.f2950a.require(9L);
                int iK = g.k(this.f2950a);
                if (iK < 0 || iK > 16384) {
                    throw g.i("FRAME_SIZE_ERROR: %s", Integer.valueOf(iK));
                }
                byte b9 = (byte) (this.f2950a.readByte() & 255);
                byte b10 = (byte) (this.f2950a.readByte() & 255);
                int i8 = this.f2950a.readInt() & Integer.MAX_VALUE;
                if (g.f2939a.isLoggable(Level.FINE)) {
                    g.f2939a.fine(b.b(true, i8, iK, b9, b10));
                }
                switch (b9) {
                    case 0:
                        a(aVar, iK, b10, i8);
                        return true;
                    case 1:
                        d(aVar, iK, b10, i8);
                        return true;
                    case 2:
                        g(aVar, iK, b10, i8);
                        return true;
                    case 3:
                        i(aVar, iK, b10, i8);
                        return true;
                    case 4:
                        j(aVar, iK, b10, i8);
                        return true;
                    case 5:
                        h(aVar, iK, b10, i8);
                        return true;
                    case 6:
                        e(aVar, iK, b10, i8);
                        return true;
                    case 7:
                        b(aVar, iK, b10, i8);
                        return true;
                    case 8:
                        k(aVar, iK, b10, i8);
                        return true;
                    default:
                        this.f2950a.skip(iK);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // K6.b
        public void readConnectionPreface() throws IOException {
            if (this.f2952c) {
                return;
            }
            P7.f byteString = this.f2950a.readByteString(g.f2940b.size());
            if (g.f2939a.isLoggable(Level.FINE)) {
                g.f2939a.fine(String.format("<< CONNECTION %s", byteString.hex()));
            }
            if (!g.f2940b.equals(byteString)) {
                throw g.i("Expected a connection header but was %s", byteString.utf8());
            }
        }
    }

    static final class d implements K6.c {

        /* renamed from: a, reason: collision with root package name */
        private final P7.d f2954a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2955b;

        /* renamed from: c, reason: collision with root package name */
        private final P7.c f2956c;

        /* renamed from: d, reason: collision with root package name */
        private final f.b f2957d;

        /* renamed from: e, reason: collision with root package name */
        private int f2958e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2959f;

        d(P7.d dVar, boolean z8) {
            this.f2954a = dVar;
            this.f2955b = z8;
            P7.c cVar = new P7.c();
            this.f2956c = cVar;
            this.f2957d = new f.b(cVar);
            this.f2958e = 16384;
        }

        private void d(int i8, long j8) {
            while (j8 > 0) {
                int iMin = (int) Math.min(this.f2958e, j8);
                long j9 = iMin;
                j8 -= j9;
                b(i8, iMin, (byte) 9, j8 == 0 ? (byte) 4 : (byte) 0);
                this.f2954a.write(this.f2956c, j9);
            }
        }

        void a(int i8, byte b9, P7.c cVar, int i9) {
            b(i8, i9, (byte) 0, b9);
            if (i9 > 0) {
                this.f2954a.write(cVar, i9);
            }
        }

        @Override // K6.c
        public synchronized void ackSettings(i iVar) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            this.f2958e = iVar.b(this.f2958e);
            b(0, 0, (byte) 4, (byte) 1);
            this.f2954a.flush();
        }

        void b(int i8, int i9, byte b9, byte b10) {
            if (g.f2939a.isLoggable(Level.FINE)) {
                g.f2939a.fine(b.b(false, i8, i9, b9, b10));
            }
            int i10 = this.f2958e;
            if (i9 > i10) {
                throw g.h("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
            }
            if ((Integer.MIN_VALUE & i8) != 0) {
                throw g.h("reserved bit set: %s", Integer.valueOf(i8));
            }
            g.l(this.f2954a, i9);
            this.f2954a.writeByte(b9 & 255);
            this.f2954a.writeByte(b10 & 255);
            this.f2954a.writeInt(i8 & Integer.MAX_VALUE);
        }

        void c(boolean z8, int i8, List list) throws IOException {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            this.f2957d.e(list);
            long size = this.f2956c.size();
            int iMin = (int) Math.min(this.f2958e, size);
            long j8 = iMin;
            byte b9 = size == j8 ? (byte) 4 : (byte) 0;
            if (z8) {
                b9 = (byte) (b9 | 1);
            }
            b(i8, iMin, (byte) 1, b9);
            this.f2954a.write(this.f2956c, j8);
            if (size > j8) {
                d(i8, size - j8);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f2959f = true;
            this.f2954a.close();
        }

        @Override // K6.c
        public synchronized void connectionPreface() {
            try {
                if (this.f2959f) {
                    throw new IOException("closed");
                }
                if (this.f2955b) {
                    if (g.f2939a.isLoggable(Level.FINE)) {
                        g.f2939a.fine(String.format(">> CONNECTION %s", g.f2940b.hex()));
                    }
                    this.f2954a.write(g.f2940b.toByteArray());
                    this.f2954a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // K6.c
        public synchronized void data(boolean z8, int i8, P7.c cVar, int i9) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            a(i8, z8 ? (byte) 1 : (byte) 0, cVar, i9);
        }

        @Override // K6.c
        public synchronized void flush() {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            this.f2954a.flush();
        }

        @Override // K6.c
        public synchronized void goAway(int i8, K6.a aVar, byte[] bArr) {
            try {
                if (this.f2959f) {
                    throw new IOException("closed");
                }
                if (aVar.httpCode == -1) {
                    throw g.h("errorCode.httpCode == -1", new Object[0]);
                }
                b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f2954a.writeInt(i8);
                this.f2954a.writeInt(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f2954a.write(bArr);
                }
                this.f2954a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // K6.c
        public synchronized void headers(int i8, List<K6.d> list) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            c(false, i8, list);
        }

        @Override // K6.c
        public int maxDataLength() {
            return this.f2958e;
        }

        @Override // K6.c
        public synchronized void ping(boolean z8, int i8, int i9) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            b(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.f2954a.writeInt(i8);
            this.f2954a.writeInt(i9);
            this.f2954a.flush();
        }

        @Override // K6.c
        public synchronized void pushPromise(int i8, int i9, List<K6.d> list) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            this.f2957d.e(list);
            long size = this.f2956c.size();
            int iMin = (int) Math.min(this.f2958e - 4, size);
            long j8 = iMin;
            b(i8, iMin + 4, (byte) 5, size == j8 ? (byte) 4 : (byte) 0);
            this.f2954a.writeInt(i9 & Integer.MAX_VALUE);
            this.f2954a.write(this.f2956c, j8);
            if (size > j8) {
                d(i8, size - j8);
            }
        }

        @Override // K6.c
        public synchronized void rstStream(int i8, K6.a aVar) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            b(i8, 4, (byte) 3, (byte) 0);
            this.f2954a.writeInt(aVar.httpCode);
            this.f2954a.flush();
        }

        @Override // K6.c
        public synchronized void settings(i iVar) {
            try {
                if (this.f2959f) {
                    throw new IOException("closed");
                }
                int i8 = 0;
                b(0, iVar.c() * 6, (byte) 4, (byte) 0);
                while (i8 < 10) {
                    if (iVar.isSet(i8)) {
                        this.f2954a.writeShort(i8 == 4 ? 3 : i8 == 7 ? 4 : i8);
                        this.f2954a.writeInt(iVar.get(i8));
                    }
                    i8++;
                }
                this.f2954a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // K6.c
        public synchronized void synReply(boolean z8, int i8, List<K6.d> list) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            c(z8, i8, list);
        }

        @Override // K6.c
        public synchronized void synStream(boolean z8, boolean z9, int i8, int i9, List<K6.d> list) {
            if (z9) {
                throw new UnsupportedOperationException();
            }
            if (this.f2959f) {
                throw new IOException("closed");
            }
            c(z8, i8, list);
        }

        @Override // K6.c
        public synchronized void windowUpdate(int i8, long j8) {
            if (this.f2959f) {
                throw new IOException("closed");
            }
            if (j8 == 0 || j8 > 2147483647L) {
                throw g.h("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
            }
            b(i8, 4, (byte) 8, (byte) 0);
            this.f2954a.writeInt((int) j8);
            this.f2954a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException h(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException i(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i8, byte b9, short s8) throws IOException {
        if ((b9 & 8) != 0) {
            i8--;
        }
        if (s8 <= i8) {
            return (short) (i8 - s8);
        }
        throw i("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s8), Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(P7.e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(P7.d dVar, int i8) {
        dVar.writeByte((i8 >>> 16) & 255);
        dVar.writeByte((i8 >>> 8) & 255);
        dVar.writeByte(i8 & 255);
    }

    @Override // K6.j
    public J6.i getProtocol() {
        return J6.i.HTTP_2;
    }

    @Override // K6.j
    public K6.b newReader(P7.e eVar, boolean z8) {
        return new c(eVar, 4096, z8);
    }

    @Override // K6.j
    public K6.c newWriter(P7.d dVar, boolean z8) {
        return new d(dVar, z8);
    }

    static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        private final P7.e f2941a;

        /* renamed from: b, reason: collision with root package name */
        int f2942b;

        /* renamed from: c, reason: collision with root package name */
        byte f2943c;

        /* renamed from: d, reason: collision with root package name */
        int f2944d;

        /* renamed from: e, reason: collision with root package name */
        int f2945e;

        /* renamed from: f, reason: collision with root package name */
        short f2946f;

        public a(P7.e eVar) {
            this.f2941a = eVar;
        }

        private void a() throws IOException {
            int i8 = this.f2944d;
            int iK = g.k(this.f2941a);
            this.f2945e = iK;
            this.f2942b = iK;
            byte b9 = (byte) (this.f2941a.readByte() & 255);
            this.f2943c = (byte) (this.f2941a.readByte() & 255);
            if (g.f2939a.isLoggable(Level.FINE)) {
                g.f2939a.fine(b.b(true, this.f2944d, this.f2942b, b9, this.f2943c));
            }
            int i9 = this.f2941a.readInt() & Integer.MAX_VALUE;
            this.f2944d = i9;
            if (b9 != 9) {
                throw g.i("%s != TYPE_CONTINUATION", Byte.valueOf(b9));
            }
            if (i9 != i8) {
                throw g.i("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // P7.w
        public long read(P7.c cVar, long j8) throws IOException {
            while (true) {
                int i8 = this.f2945e;
                if (i8 != 0) {
                    long j9 = this.f2941a.read(cVar, Math.min(j8, i8));
                    if (j9 == -1) {
                        return -1L;
                    }
                    this.f2945e -= (int) j9;
                    return j9;
                }
                this.f2941a.skip(this.f2946f);
                this.f2946f = (short) 0;
                if ((this.f2943c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // P7.w
        public x timeout() {
            return this.f2941a.timeout();
        }

        @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
