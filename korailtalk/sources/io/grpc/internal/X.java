package io.grpc.internal;

import e3.AbstractC5364f;
import io.grpc.C5728h0;
import io.grpc.V;
import io.grpc.internal.AbstractC5736a;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class X extends AbstractC5736a.c {

    /* renamed from: w, reason: collision with root package name */
    private static final V.a f32579w;

    /* renamed from: x, reason: collision with root package name */
    private static final C5728h0.i f32580x;

    /* renamed from: s, reason: collision with root package name */
    private io.grpc.J0 f32581s;

    /* renamed from: t, reason: collision with root package name */
    private C5728h0 f32582t;

    /* renamed from: u, reason: collision with root package name */
    private Charset f32583u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f32584v;

    class a implements V.a {
        a() {
        }

        @Override // io.grpc.V.a, io.grpc.C5728h0.m
        public Integer parseAsciiString(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, io.grpc.V.US_ASCII));
        }

        @Override // io.grpc.V.a, io.grpc.C5728h0.m
        public byte[] toAsciiString(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f32579w = aVar;
        f32580x = io.grpc.V.keyOf(I7.c.RESPONSE_STATUS_UTF8, aVar);
    }

    protected X(int i8, O0 o02, V0 v02) {
        super(i8, o02, v02);
        this.f32583u = AbstractC5364f.UTF_8;
    }

    private static Charset F(C5728h0 c5728h0) {
        String str = (String) c5728h0.get(U.CONTENT_TYPE_KEY);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC5364f.UTF_8;
    }

    private io.grpc.J0 H(C5728h0 c5728h0) {
        io.grpc.J0 j02 = (io.grpc.J0) c5728h0.get(io.grpc.X.CODE_KEY);
        if (j02 != null) {
            return j02.withDescription((String) c5728h0.get(io.grpc.X.MESSAGE_KEY));
        }
        if (this.f32584v) {
            return io.grpc.J0.UNKNOWN.withDescription("missing GRPC status in response");
        }
        Integer num = (Integer) c5728h0.get(f32580x);
        return (num != null ? U.httpStatusToGrpcStatus(num.intValue()) : io.grpc.J0.INTERNAL.withDescription("missing HTTP status code")).augmentDescription("missing GRPC status, inferred error from HTTP status code");
    }

    private static void I(C5728h0 c5728h0) {
        c5728h0.discardAll(f32580x);
        c5728h0.discardAll(io.grpc.X.CODE_KEY);
        c5728h0.discardAll(io.grpc.X.MESSAGE_KEY);
    }

    private io.grpc.J0 M(C5728h0 c5728h0) {
        Integer num = (Integer) c5728h0.get(f32580x);
        if (num == null) {
            return io.grpc.J0.INTERNAL.withDescription("Missing HTTP status code");
        }
        String str = (String) c5728h0.get(U.CONTENT_TYPE_KEY);
        if (U.isGrpcContentType(str)) {
            return null;
        }
        return U.httpStatusToGrpcStatus(num.intValue()).augmentDescription("invalid content-type: " + str);
    }

    protected abstract void G(io.grpc.J0 j02, boolean z8, C5728h0 c5728h0);

    protected void J(y0 y0Var, boolean z8) throws Throwable {
        io.grpc.J0 j02 = this.f32581s;
        if (j02 != null) {
            this.f32581s = j02.augmentDescription("DATA-----------------------------\n" + z0.readAsString(y0Var, this.f32583u));
            y0Var.close();
            if (this.f32581s.getDescription().length() > 1000 || z8) {
                G(this.f32581s, false, this.f32582t);
                return;
            }
            return;
        }
        if (!this.f32584v) {
            G(io.grpc.J0.INTERNAL.withDescription("headers not received before payload"), false, new C5728h0());
            return;
        }
        int i8 = y0Var.readableBytes();
        x(y0Var);
        if (z8) {
            if (i8 > 0) {
                this.f32581s = io.grpc.J0.INTERNAL.withDescription("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f32581s = io.grpc.J0.INTERNAL.withDescription("Received unexpected EOS on empty DATA frame from server");
            }
            C5728h0 c5728h0 = new C5728h0();
            this.f32582t = c5728h0;
            transportReportStatus(this.f32581s, false, c5728h0);
        }
    }

    /* JADX WARN: Finally extract failed */
    protected void K(C5728h0 c5728h0) {
        e3.w.checkNotNull(c5728h0, "headers");
        io.grpc.J0 j02 = this.f32581s;
        if (j02 != null) {
            this.f32581s = j02.augmentDescription("headers: " + c5728h0);
            return;
        }
        try {
            if (this.f32584v) {
                io.grpc.J0 j0WithDescription = io.grpc.J0.INTERNAL.withDescription("Received headers twice");
                this.f32581s = j0WithDescription;
                if (j0WithDescription != null) {
                    this.f32581s = j0WithDescription.augmentDescription("headers: " + c5728h0);
                    this.f32582t = c5728h0;
                    this.f32583u = F(c5728h0);
                    return;
                }
                return;
            }
            Integer num = (Integer) c5728h0.get(f32580x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                io.grpc.J0 j03 = this.f32581s;
                if (j03 != null) {
                    this.f32581s = j03.augmentDescription("headers: " + c5728h0);
                    this.f32582t = c5728h0;
                    this.f32583u = F(c5728h0);
                    return;
                }
                return;
            }
            this.f32584v = true;
            io.grpc.J0 j0M = M(c5728h0);
            this.f32581s = j0M;
            if (j0M != null) {
                if (j0M != null) {
                    this.f32581s = j0M.augmentDescription("headers: " + c5728h0);
                    this.f32582t = c5728h0;
                    this.f32583u = F(c5728h0);
                    return;
                }
                return;
            }
            I(c5728h0);
            y(c5728h0);
            io.grpc.J0 j04 = this.f32581s;
            if (j04 != null) {
                this.f32581s = j04.augmentDescription("headers: " + c5728h0);
                this.f32582t = c5728h0;
                this.f32583u = F(c5728h0);
            }
        } catch (Throwable th) {
            io.grpc.J0 j05 = this.f32581s;
            if (j05 != null) {
                this.f32581s = j05.augmentDescription("headers: " + c5728h0);
                this.f32582t = c5728h0;
                this.f32583u = F(c5728h0);
            }
            throw th;
        }
    }

    protected void L(C5728h0 c5728h0) {
        e3.w.checkNotNull(c5728h0, U.TE_TRAILERS);
        if (this.f32581s == null && !this.f32584v) {
            io.grpc.J0 j0M = M(c5728h0);
            this.f32581s = j0M;
            if (j0M != null) {
                this.f32582t = c5728h0;
            }
        }
        io.grpc.J0 j02 = this.f32581s;
        if (j02 == null) {
            io.grpc.J0 j0H = H(c5728h0);
            I(c5728h0);
            z(c5728h0, j0H);
        } else {
            io.grpc.J0 j0AugmentDescription = j02.augmentDescription("trailers: " + c5728h0);
            this.f32581s = j0AugmentDescription;
            G(j0AugmentDescription, false, this.f32582t);
        }
    }

    @Override // io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
    public abstract /* synthetic */ void bytesRead(int i8);

    @Override // io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
    public abstract /* synthetic */ void deframeFailed(Throwable th);

    @Override // io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
    public /* bridge */ /* synthetic */ void deframerClosed(boolean z8) {
        super.deframerClosed(z8);
    }

    @Override // io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5746f.h, io.grpc.internal.C5748g.d
    public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);
}
