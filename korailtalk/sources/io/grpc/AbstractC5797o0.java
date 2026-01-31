package io.grpc;

/* renamed from: io.grpc.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5797o0 extends w0 {
    AbstractC5797o0() {
    }

    protected abstract w0 a();

    @Override // io.grpc.w0
    public void close(J0 j02, C5728h0 c5728h0) {
        a().close(j02, c5728h0);
    }

    @Override // io.grpc.w0
    public C5713a getAttributes() {
        return a().getAttributes();
    }

    @Override // io.grpc.w0
    public String getAuthority() {
        return a().getAuthority();
    }

    @Override // io.grpc.w0
    public t0 getSecurityLevel() {
        return a().getSecurityLevel();
    }

    @Override // io.grpc.w0
    public boolean isCancelled() {
        return a().isCancelled();
    }

    @Override // io.grpc.w0
    public boolean isReady() {
        return a().isReady();
    }

    @Override // io.grpc.w0
    public void request(int i8) {
        a().request(i8);
    }

    @Override // io.grpc.w0
    public void sendHeaders(C5728h0 c5728h0) {
        a().sendHeaders(c5728h0);
    }

    @Override // io.grpc.w0
    public void setCompression(String str) {
        a().setCompression(str);
    }

    @Override // io.grpc.w0
    public void setMessageCompression(boolean z8) {
        a().setMessageCompression(z8);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", a()).toString();
    }
}
