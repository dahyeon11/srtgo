package androidx.camera.core;

/* loaded from: classes.dex */
final class X0 extends L {

    /* renamed from: c, reason: collision with root package name */
    private boolean f7570c;

    X0(InterfaceC0902s0 interfaceC0902s0) {
        super(interfaceC0902s0);
        this.f7570c = false;
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f7570c) {
            this.f7570c = true;
            super.close();
        }
    }
}
