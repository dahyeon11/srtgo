package io.grpc;

/* loaded from: classes.dex */
public class L0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f31989a;

    /* renamed from: b, reason: collision with root package name */
    private final C5728h0 f31990b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31991c;

    public L0(J0 j02) {
        this(j02, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f31991c ? super.fillInStackTrace() : this;
    }

    public final J0 getStatus() {
        return this.f31989a;
    }

    public final C5728h0 getTrailers() {
        return this.f31990b;
    }

    public L0(J0 j02, C5728h0 c5728h0) {
        this(j02, c5728h0, true);
    }

    L0(J0 j02, C5728h0 c5728h0, boolean z8) {
        super(J0.d(j02), j02.getCause());
        this.f31989a = j02;
        this.f31990b = c5728h0;
        this.f31991c = z8;
        fillInStackTrace();
    }
}
