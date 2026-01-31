package io.grpc.internal;

/* loaded from: classes.dex */
public final class J implements InterfaceC5773s0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32486a;

    public J(Object obj) {
        this.f32486a = e3.w.checkNotNull(obj, "object");
    }

    @Override // io.grpc.internal.InterfaceC5773s0
    public Object getObject() {
        return this.f32486a;
    }

    @Override // io.grpc.internal.InterfaceC5773s0
    public Object returnObject(Object obj) {
        return null;
    }
}
