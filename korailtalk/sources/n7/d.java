package N7;

import P7.c;
import P7.f;
import e3.AbstractC5358c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    final boolean f3312a;

    /* renamed from: b, reason: collision with root package name */
    final P7.e f3313b;

    /* renamed from: c, reason: collision with root package name */
    final a f3314c;

    /* renamed from: d, reason: collision with root package name */
    boolean f3315d;

    /* renamed from: e, reason: collision with root package name */
    int f3316e;

    /* renamed from: f, reason: collision with root package name */
    long f3317f;

    /* renamed from: g, reason: collision with root package name */
    boolean f3318g;

    /* renamed from: h, reason: collision with root package name */
    boolean f3319h;

    /* renamed from: i, reason: collision with root package name */
    private final P7.c f3320i = new P7.c();

    /* renamed from: j, reason: collision with root package name */
    private final P7.c f3321j = new P7.c();

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f3322k;

    /* renamed from: l, reason: collision with root package name */
    private final c.C0065c f3323l;

    public interface a {
        void onReadClose(int i8, String str);

        void onReadMessage(f fVar);

        void onReadMessage(String str);

        void onReadPing(f fVar);

        void onReadPong(f fVar);
    }

    d(boolean z8, P7.e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        if (aVar == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.f3312a = z8;
        this.f3313b = eVar;
        this.f3314c = aVar;
        this.f3322k = z8 ? null : new byte[4];
        this.f3323l = z8 ? null : new c.C0065c();
    }

    private void b() throws ProtocolException {
        short s8;
        String utf8;
        long j8 = this.f3317f;
        if (j8 > 0) {
            this.f3313b.readFully(this.f3320i, j8);
            if (!this.f3312a) {
                this.f3320i.readAndWriteUnsafe(this.f3323l);
                this.f3323l.seek(0L);
                c.b(this.f3323l, this.f3322k);
                this.f3323l.close();
            }
        }
        switch (this.f3316e) {
            case 8:
                long size = this.f3320i.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s8 = this.f3320i.readShort();
                    utf8 = this.f3320i.readUtf8();
                    String strA = c.a(s8);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s8 = 1005;
                    utf8 = "";
                }
                this.f3314c.onReadClose(s8, utf8);
                this.f3315d = true;
                return;
            case 9:
                this.f3314c.onReadPing(this.f3320i.readByteString());
                return;
            case 10:
                this.f3314c.onReadPong(this.f3320i.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f3316e));
        }
    }

    private void c() throws IOException {
        if (this.f3315d) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.f3313b.timeout().timeoutNanos();
        this.f3313b.timeout().clearTimeout();
        try {
            byte b9 = this.f3313b.readByte();
            this.f3313b.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            this.f3316e = b9 & AbstractC5358c.SI;
            boolean z8 = (b9 & 128) != 0;
            this.f3318g = z8;
            boolean z9 = (b9 & 8) != 0;
            this.f3319h = z9;
            if (z9 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (b9 & 64) != 0;
            boolean z11 = (b9 & 32) != 0;
            boolean z12 = (b9 & AbstractC5358c.DLE) != 0;
            if (z10 || z11 || z12) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte b10 = this.f3313b.readByte();
            boolean z13 = (b10 & 128) != 0;
            if (z13 == this.f3312a) {
                throw new ProtocolException(this.f3312a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j8 = b10 & 127;
            this.f3317f = j8;
            if (j8 == 126) {
                this.f3317f = this.f3313b.readShort() & 65535;
            } else if (j8 == 127) {
                long j9 = this.f3313b.readLong();
                this.f3317f = j9;
                if (j9 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f3317f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f3319h && this.f3317f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z13) {
                this.f3313b.readFully(this.f3322k);
            }
        } catch (Throwable th) {
            this.f3313b.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void d() throws IOException {
        while (!this.f3315d) {
            long j8 = this.f3317f;
            if (j8 > 0) {
                this.f3313b.readFully(this.f3321j, j8);
                if (!this.f3312a) {
                    this.f3321j.readAndWriteUnsafe(this.f3323l);
                    this.f3323l.seek(this.f3321j.size() - this.f3317f);
                    c.b(this.f3323l, this.f3322k);
                    this.f3323l.close();
                }
            }
            if (this.f3318g) {
                return;
            }
            f();
            if (this.f3316e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f3316e));
            }
        }
        throw new IOException("closed");
    }

    private void e() throws IOException {
        int i8 = this.f3316e;
        if (i8 != 1 && i8 != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i8));
        }
        d();
        if (i8 == 1) {
            this.f3314c.onReadMessage(this.f3321j.readUtf8());
        } else {
            this.f3314c.onReadMessage(this.f3321j.readByteString());
        }
    }

    private void f() throws IOException {
        while (!this.f3315d) {
            c();
            if (!this.f3319h) {
                return;
            } else {
                b();
            }
        }
    }

    void a() throws IOException {
        c();
        if (this.f3319h) {
            b();
        } else {
            e();
        }
    }
}
