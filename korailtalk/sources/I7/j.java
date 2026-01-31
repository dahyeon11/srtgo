package I7;

import I7.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f2500g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final P7.d f2501a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2502b;

    /* renamed from: c, reason: collision with root package name */
    private final P7.c f2503c;

    /* renamed from: d, reason: collision with root package name */
    private int f2504d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2505e;

    /* renamed from: f, reason: collision with root package name */
    final d.b f2506f;

    j(P7.d dVar, boolean z8) {
        this.f2501a = dVar;
        this.f2502b = z8;
        P7.c cVar = new P7.c();
        this.f2503c = cVar;
        this.f2506f = new d.b(cVar);
        this.f2504d = 16384;
    }

    private void b(int i8, long j8) {
        while (j8 > 0) {
            int iMin = (int) Math.min(this.f2504d, j8);
            long j9 = iMin;
            j8 -= j9;
            frameHeader(i8, iMin, (byte) 9, j8 == 0 ? (byte) 4 : (byte) 0);
            this.f2501a.write(this.f2503c, j9);
        }
    }

    private static void c(P7.d dVar, int i8) {
        dVar.writeByte((i8 >>> 16) & 255);
        dVar.writeByte((i8 >>> 8) & 255);
        dVar.writeByte(i8 & 255);
    }

    void a(int i8, byte b9, P7.c cVar, int i9) {
        frameHeader(i8, i9, (byte) 0, b9);
        if (i9 > 0) {
            this.f2501a.write(cVar, i9);
        }
    }

    public synchronized void applyAndAckSettings(m mVar) {
        try {
            if (this.f2505e) {
                throw new IOException("closed");
            }
            this.f2504d = mVar.f(this.f2504d);
            if (mVar.c() != -1) {
                this.f2506f.e(mVar.c());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.f2501a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2505e = true;
        this.f2501a.close();
    }

    public synchronized void connectionPreface() {
        try {
            if (this.f2505e) {
                throw new IOException("closed");
            }
            if (this.f2502b) {
                Logger logger = f2500g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(D7.e.format(">> CONNECTION %s", e.f2383a.hex()));
                }
                this.f2501a.write(e.f2383a.toByteArray());
                this.f2501a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void data(boolean z8, int i8, P7.c cVar, int i9) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        a(i8, z8 ? (byte) 1 : (byte) 0, cVar, i9);
    }

    public synchronized void flush() {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        this.f2501a.flush();
    }

    public void frameHeader(int i8, int i9, byte b9, byte b10) {
        Logger logger = f2500g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i8, i9, b9, b10));
        }
        int i10 = this.f2504d;
        if (i9 > i10) {
            throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
        }
        if ((Integer.MIN_VALUE & i8) != 0) {
            throw e.c("reserved bit set: %s", Integer.valueOf(i8));
        }
        c(this.f2501a, i9);
        this.f2501a.writeByte(b9 & 255);
        this.f2501a.writeByte(b10 & 255);
        this.f2501a.writeInt(i8 & Integer.MAX_VALUE);
    }

    public synchronized void goAway(int i8, b bVar, byte[] bArr) {
        try {
            if (this.f2505e) {
                throw new IOException("closed");
            }
            if (bVar.httpCode == -1) {
                throw e.c("errorCode.httpCode == -1", new Object[0]);
            }
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f2501a.writeInt(i8);
            this.f2501a.writeInt(bVar.httpCode);
            if (bArr.length > 0) {
                this.f2501a.write(bArr);
            }
            this.f2501a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void headers(boolean z8, int i8, List<c> list) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        this.f2506f.g(list);
        long size = this.f2503c.size();
        int iMin = (int) Math.min(this.f2504d, size);
        long j8 = iMin;
        byte b9 = size == j8 ? (byte) 4 : (byte) 0;
        if (z8) {
            b9 = (byte) (b9 | 1);
        }
        frameHeader(i8, iMin, (byte) 1, b9);
        this.f2501a.write(this.f2503c, j8);
        if (size > j8) {
            b(i8, size - j8);
        }
    }

    public int maxDataLength() {
        return this.f2504d;
    }

    public synchronized void ping(boolean z8, int i8, int i9) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
        this.f2501a.writeInt(i8);
        this.f2501a.writeInt(i9);
        this.f2501a.flush();
    }

    public synchronized void pushPromise(int i8, int i9, List<c> list) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        this.f2506f.g(list);
        long size = this.f2503c.size();
        int iMin = (int) Math.min(this.f2504d - 4, size);
        long j8 = iMin;
        frameHeader(i8, iMin + 4, (byte) 5, size == j8 ? (byte) 4 : (byte) 0);
        this.f2501a.writeInt(i9 & Integer.MAX_VALUE);
        this.f2501a.write(this.f2503c, j8);
        if (size > j8) {
            b(i8, size - j8);
        }
    }

    public synchronized void rstStream(int i8, b bVar) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        if (bVar.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        frameHeader(i8, 4, (byte) 3, (byte) 0);
        this.f2501a.writeInt(bVar.httpCode);
        this.f2501a.flush();
    }

    public synchronized void settings(m mVar) {
        try {
            if (this.f2505e) {
                throw new IOException("closed");
            }
            int i8 = 0;
            frameHeader(0, mVar.j() * 6, (byte) 4, (byte) 0);
            while (i8 < 10) {
                if (mVar.g(i8)) {
                    this.f2501a.writeShort(i8 == 4 ? 3 : i8 == 7 ? 4 : i8);
                    this.f2501a.writeInt(mVar.b(i8));
                }
                i8++;
            }
            this.f2501a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void windowUpdate(int i8, long j8) {
        if (this.f2505e) {
            throw new IOException("closed");
        }
        if (j8 == 0 || j8 > 2147483647L) {
            throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
        }
        frameHeader(i8, 4, (byte) 8, (byte) 0);
        this.f2501a.writeInt((int) j8);
        this.f2501a.flush();
    }
}
