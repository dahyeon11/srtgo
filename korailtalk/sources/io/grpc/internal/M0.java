package io.grpc.internal;

import io.grpc.internal.L0;

/* loaded from: classes.dex */
public final class M0 implements InterfaceC5773s0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0.d f32508a;

    private M0(L0.d dVar) {
        this.f32508a = dVar;
    }

    public static <T> M0 forResource(L0.d dVar) {
        return new M0(dVar);
    }

    @Override // io.grpc.internal.InterfaceC5773s0
    public Object getObject() {
        return L0.get(this.f32508a);
    }

    @Override // io.grpc.internal.InterfaceC5773s0
    public Object returnObject(Object obj) {
        L0.release(this.f32508a, obj);
        return null;
    }
}
