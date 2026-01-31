package io.grpc;

import io.grpc.AbstractC5787j0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class D extends AbstractC5722e0 {
    protected D() {
    }

    public static AbstractC5722e0 forAddress(String str, int i8) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    public static AbstractC5722e0 forTarget(String str) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    protected abstract AbstractC5722e0 b();

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5720d0 build() {
        return b().build();
    }

    protected final D c() {
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public /* bridge */ /* synthetic */ AbstractC5722e0 defaultServiceConfig(Map map) {
        return defaultServiceConfig((Map<String, ?>) map);
    }

    @Override // io.grpc.AbstractC5722e0
    public /* bridge */ /* synthetic */ AbstractC5722e0 intercept(List list) {
        return intercept((List<InterfaceC5788k>) list);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", b()).toString();
    }

    @Override // io.grpc.AbstractC5722e0
    public D compressorRegistry(C5801s c5801s) {
        b().compressorRegistry(c5801s);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D decompressorRegistry(C5808z c5808z) {
        b().decompressorRegistry(c5808z);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D defaultLoadBalancingPolicy(String str) {
        b().defaultLoadBalancingPolicy(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D defaultServiceConfig(Map<String, ?> map) {
        b().defaultServiceConfig(map);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D directExecutor() {
        b().directExecutor();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D disableRetry() {
        b().disableRetry();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D disableServiceConfigLookUp() {
        b().disableServiceConfigLookUp();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D enableFullStreamDecompression() {
        b().enableFullStreamDecompression();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D enableRetry() {
        b().enableRetry();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D executor(Executor executor) {
        b().executor(executor);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D idleTimeout(long j8, TimeUnit timeUnit) {
        b().idleTimeout(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D keepAliveTime(long j8, TimeUnit timeUnit) {
        b().keepAliveTime(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D keepAliveTimeout(long j8, TimeUnit timeUnit) {
        b().keepAliveTimeout(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D keepAliveWithoutCalls(boolean z8) {
        b().keepAliveWithoutCalls(z8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D maxHedgedAttempts(int i8) {
        b().maxHedgedAttempts(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D maxInboundMessageSize(int i8) {
        b().maxInboundMessageSize(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D maxInboundMetadataSize(int i8) {
        b().maxInboundMetadataSize(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D maxRetryAttempts(int i8) {
        b().maxRetryAttempts(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D maxTraceEvents(int i8) {
        b().maxTraceEvents(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    @Deprecated
    public D nameResolverFactory(AbstractC5787j0.d dVar) {
        b().nameResolverFactory(dVar);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D offloadExecutor(Executor executor) {
        b().offloadExecutor(executor);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D overrideAuthority(String str) {
        b().overrideAuthority(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D perRpcBufferLimit(long j8) {
        b().perRpcBufferLimit(j8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D proxyDetector(s0 s0Var) {
        b().proxyDetector(s0Var);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D retryBufferSize(long j8) {
        b().retryBufferSize(j8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D setBinaryLog(AbstractC5715b abstractC5715b) {
        b().setBinaryLog(abstractC5715b);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D usePlaintext() {
        b().usePlaintext();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D useTransportSecurity() {
        b().useTransportSecurity();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D userAgent(String str) {
        b().userAgent(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D intercept(List<InterfaceC5788k> list) {
        b().intercept(list);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public D intercept(InterfaceC5788k... interfaceC5788kArr) {
        b().intercept(interfaceC5788kArr);
        return c();
    }
}
