package G7;

import C7.B;
import C7.H;
import C7.InterfaceC0472f;
import C7.InterfaceC0478l;
import C7.J;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g implements B.a {

    /* renamed from: a */
    private final List f1498a;

    /* renamed from: b */
    private final F7.k f1499b;

    /* renamed from: c */
    private final F7.c f1500c;

    /* renamed from: d */
    private final int f1501d;

    /* renamed from: e */
    private final H f1502e;

    /* renamed from: f */
    private final InterfaceC0472f f1503f;

    /* renamed from: g */
    private final int f1504g;

    /* renamed from: h */
    private final int f1505h;

    /* renamed from: i */
    private final int f1506i;

    /* renamed from: j */
    private int f1507j;

    public g(List<B> list, F7.k kVar, F7.c cVar, int i8, H h8, InterfaceC0472f interfaceC0472f, int i9, int i10, int i11) {
        this.f1498a = list;
        this.f1499b = kVar;
        this.f1500c = cVar;
        this.f1501d = i8;
        this.f1502e = h8;
        this.f1503f = interfaceC0472f;
        this.f1504g = i9;
        this.f1505h = i10;
        this.f1506i = i11;
    }

    @Override // C7.B.a
    public InterfaceC0472f call() {
        return this.f1503f;
    }

    @Override // C7.B.a
    public int connectTimeoutMillis() {
        return this.f1504g;
    }

    @Override // C7.B.a
    public InterfaceC0478l connection() {
        F7.c cVar = this.f1500c;
        if (cVar != null) {
            return cVar.connection();
        }
        return null;
    }

    public F7.c exchange() {
        F7.c cVar = this.f1500c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    @Override // C7.B.a
    public J proceed(H h8) {
        return proceed(h8, this.f1499b, this.f1500c);
    }

    @Override // C7.B.a
    public int readTimeoutMillis() {
        return this.f1505h;
    }

    @Override // C7.B.a
    public H request() {
        return this.f1502e;
    }

    public F7.k transmitter() {
        return this.f1499b;
    }

    @Override // C7.B.a
    public B.a withConnectTimeout(int i8, TimeUnit timeUnit) {
        return new g(this.f1498a, this.f1499b, this.f1500c, this.f1501d, this.f1502e, this.f1503f, D7.e.checkDuration("timeout", i8, timeUnit), this.f1505h, this.f1506i);
    }

    @Override // C7.B.a
    public B.a withReadTimeout(int i8, TimeUnit timeUnit) {
        return new g(this.f1498a, this.f1499b, this.f1500c, this.f1501d, this.f1502e, this.f1503f, this.f1504g, D7.e.checkDuration("timeout", i8, timeUnit), this.f1506i);
    }

    @Override // C7.B.a
    public B.a withWriteTimeout(int i8, TimeUnit timeUnit) {
        return new g(this.f1498a, this.f1499b, this.f1500c, this.f1501d, this.f1502e, this.f1503f, this.f1504g, this.f1505h, D7.e.checkDuration("timeout", i8, timeUnit));
    }

    @Override // C7.B.a
    public int writeTimeoutMillis() {
        return this.f1506i;
    }

    public J proceed(H h8, F7.k kVar, F7.c cVar) {
        if (this.f1501d >= this.f1498a.size()) {
            throw new AssertionError();
        }
        this.f1507j++;
        F7.c cVar2 = this.f1500c;
        if (cVar2 != null && !cVar2.connection().supportsUrl(h8.url())) {
            throw new IllegalStateException("network interceptor " + this.f1498a.get(this.f1501d - 1) + " must retain the same host and port");
        }
        if (this.f1500c != null && this.f1507j > 1) {
            throw new IllegalStateException("network interceptor " + this.f1498a.get(this.f1501d - 1) + " must call proceed() exactly once");
        }
        g gVar = new g(this.f1498a, kVar, cVar, this.f1501d + 1, h8, this.f1503f, this.f1504g, this.f1505h, this.f1506i);
        B b9 = (B) this.f1498a.get(this.f1501d);
        J jIntercept = b9.intercept(gVar);
        if (cVar != null && this.f1501d + 1 < this.f1498a.size() && gVar.f1507j != 1) {
            throw new IllegalStateException("network interceptor " + b9 + " must call proceed() exactly once");
        }
        if (jIntercept == null) {
            throw new NullPointerException("interceptor " + b9 + " returned null");
        }
        if (jIntercept.body() != null) {
            return jIntercept;
        }
        throw new IllegalStateException("interceptor " + b9 + " returned a response with no body");
    }
}
