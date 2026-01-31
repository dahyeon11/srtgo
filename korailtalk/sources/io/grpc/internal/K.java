package io.grpc.internal;

import io.grpc.C5713a;
import io.grpc.C5806x;
import io.grpc.C5808z;
import java.io.InputStream;

/* loaded from: classes.dex */
abstract class K implements InterfaceC5772s {
    K() {
    }

    protected abstract InterfaceC5772s a();

    @Override // io.grpc.internal.InterfaceC5772s
    public void appendTimeoutInsight(C5737a0 c5737a0) {
        a().appendTimeoutInsight(c5737a0);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void cancel(io.grpc.J0 j02) {
        a().cancel(j02);
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void flush() {
        a().flush();
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public C5713a getAttributes() {
        return a().getAttributes();
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void halfClose() {
        a().halfClose();
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public boolean isReady() {
        return a().isReady();
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void optimizeForDirectExecutor() {
        a().optimizeForDirectExecutor();
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void request(int i8) {
        a().request(i8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setAuthority(String str) {
        a().setAuthority(str);
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setCompressor(io.grpc.r rVar) {
        a().setCompressor(rVar);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDeadline(C5806x c5806x) {
        a().setDeadline(c5806x);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDecompressorRegistry(C5808z c5808z) {
        a().setDecompressorRegistry(c5808z);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setFullStreamDecompression(boolean z8) {
        a().setFullStreamDecompression(z8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxInboundMessageSize(int i8) {
        a().setMaxInboundMessageSize(i8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxOutboundMessageSize(int i8) {
        a().setMaxOutboundMessageSize(i8);
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setMessageCompression(boolean z8) {
        a().setMessageCompression(z8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void start(InterfaceC5774t interfaceC5774t) {
        a().start(interfaceC5774t);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", a()).toString();
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void writeMessage(InputStream inputStream) {
        a().writeMessage(inputStream);
    }
}
