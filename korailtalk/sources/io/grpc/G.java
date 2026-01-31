package io.grpc;

/* loaded from: classes.dex */
public abstract class G extends AbstractC5797o0 {
    @Override // io.grpc.AbstractC5797o0
    protected abstract w0 a();

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ void close(J0 j02, C5728h0 c5728h0) {
        super.close(j02, c5728h0);
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ C5713a getAttributes() {
        return super.getAttributes();
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ String getAuthority() {
        return super.getAuthority();
    }

    @Override // io.grpc.w0
    public C5730i0 getMethodDescriptor() {
        return a().getMethodDescriptor();
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ t0 getSecurityLevel() {
        return super.getSecurityLevel();
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ void request(int i8) {
        super.request(i8);
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ void sendHeaders(C5728h0 c5728h0) {
        super.sendHeaders(c5728h0);
    }

    @Override // io.grpc.w0
    public void sendMessage(Object obj) {
        a().sendMessage(obj);
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ void setCompression(String str) {
        super.setCompression(str);
    }

    @Override // io.grpc.AbstractC5797o0, io.grpc.w0
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z8) {
        super.setMessageCompression(z8);
    }

    @Override // io.grpc.AbstractC5797o0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
