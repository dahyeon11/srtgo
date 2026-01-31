package io.grpc.internal;

import io.grpc.C5713a;
import io.grpc.C5806x;
import io.grpc.C5808z;
import java.io.InputStream;

/* renamed from: io.grpc.internal.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5771r0 implements InterfaceC5772s {
    public static final C5771r0 INSTANCE = new C5771r0();

    @Override // io.grpc.internal.InterfaceC5772s
    public void appendTimeoutInsight(C5737a0 c5737a0) {
        c5737a0.append("noop");
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void cancel(io.grpc.J0 j02) {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void flush() {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public C5713a getAttributes() {
        return C5713a.EMPTY;
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void halfClose() {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public boolean isReady() {
        return false;
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void optimizeForDirectExecutor() {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void request(int i8) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setAuthority(String str) {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setCompressor(io.grpc.r rVar) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDeadline(C5806x c5806x) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDecompressorRegistry(C5808z c5808z) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setFullStreamDecompression(boolean z8) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxInboundMessageSize(int i8) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxOutboundMessageSize(int i8) {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setMessageCompression(boolean z8) {
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void start(InterfaceC5774t interfaceC5774t) {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void writeMessage(InputStream inputStream) {
    }
}
