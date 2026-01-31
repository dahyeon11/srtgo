package androidx.camera.core;

import z.InterfaceC6581g0;

/* loaded from: classes.dex */
final class U extends T {

    class a implements B.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0902s0 f7540a;

        a(InterfaceC0902s0 interfaceC0902s0) {
            this.f7540a = interfaceC0902s0;
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            this.f7540a.close();
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    U() {
    }

    @Override // androidx.camera.core.T
    InterfaceC0902s0 c(InterfaceC6581g0 interfaceC6581g0) {
        return interfaceC6581g0.acquireNextImage();
    }

    @Override // androidx.camera.core.T
    void f() {
    }

    @Override // androidx.camera.core.T
    void o(InterfaceC0902s0 interfaceC0902s0) {
        B.f.addCallback(d(interfaceC0902s0), new a(interfaceC0902s0), A.a.directExecutor());
    }
}
