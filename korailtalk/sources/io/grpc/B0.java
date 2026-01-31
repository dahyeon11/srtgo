package io.grpc;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final C5730i0 f31943a;

    /* renamed from: b, reason: collision with root package name */
    private final y0 f31944b;

    private B0(C5730i0 c5730i0, y0 y0Var) {
        this.f31943a = c5730i0;
        this.f31944b = y0Var;
    }

    public static <ReqT, RespT> B0 create(C5730i0 c5730i0, y0 y0Var) {
        return new B0(c5730i0, y0Var);
    }

    public C5730i0 getMethodDescriptor() {
        return this.f31943a;
    }

    public y0 getServerCallHandler() {
        return this.f31944b;
    }

    public B0 withServerCallHandler(y0 y0Var) {
        return new B0(this.f31943a, y0Var);
    }
}
