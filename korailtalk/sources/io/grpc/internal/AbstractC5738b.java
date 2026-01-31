package io.grpc.internal;

import io.grpc.AbstractC5715b;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5722e0;
import io.grpc.AbstractC5787j0;
import io.grpc.C5801s;
import io.grpc.C5808z;
import io.grpc.InterfaceC5788k;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5738b extends AbstractC5722e0 {

    /* renamed from: a, reason: collision with root package name */
    protected int f32624a = 4194304;

    protected AbstractC5738b() {
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

    protected final AbstractC5738b c() {
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
    public AbstractC5722e0 compressorRegistry(C5801s c5801s) {
        b().compressorRegistry(c5801s);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 decompressorRegistry(C5808z c5808z) {
        b().decompressorRegistry(c5808z);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 defaultLoadBalancingPolicy(String str) {
        b().defaultLoadBalancingPolicy(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 defaultServiceConfig(Map<String, ?> map) {
        b().defaultServiceConfig(map);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 directExecutor() {
        b().directExecutor();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 disableRetry() {
        b().disableRetry();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 disableServiceConfigLookUp() {
        b().disableServiceConfigLookUp();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 enableFullStreamDecompression() {
        b().enableFullStreamDecompression();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 enableRetry() {
        b().enableRetry();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 executor(Executor executor) {
        b().executor(executor);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 idleTimeout(long j8, TimeUnit timeUnit) {
        b().idleTimeout(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 keepAliveTime(long j8, TimeUnit timeUnit) {
        b().keepAliveTime(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 keepAliveTimeout(long j8, TimeUnit timeUnit) {
        b().keepAliveTimeout(j8, timeUnit);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 keepAliveWithoutCalls(boolean z8) {
        b().keepAliveWithoutCalls(z8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 maxHedgedAttempts(int i8) {
        b().maxHedgedAttempts(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 maxInboundMessageSize(int i8) {
        e3.w.checkArgument(i8 >= 0, "negative max");
        this.f32624a = i8;
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 maxInboundMetadataSize(int i8) {
        b().maxInboundMetadataSize(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 maxRetryAttempts(int i8) {
        b().maxRetryAttempts(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 maxTraceEvents(int i8) {
        b().maxTraceEvents(i8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    @Deprecated
    public AbstractC5722e0 nameResolverFactory(AbstractC5787j0.d dVar) {
        b().nameResolverFactory(dVar);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 offloadExecutor(Executor executor) {
        b().offloadExecutor(executor);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 overrideAuthority(String str) {
        b().overrideAuthority(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 perRpcBufferLimit(long j8) {
        b().perRpcBufferLimit(j8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 proxyDetector(io.grpc.s0 s0Var) {
        b().proxyDetector(s0Var);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 retryBufferSize(long j8) {
        b().retryBufferSize(j8);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 setBinaryLog(AbstractC5715b abstractC5715b) {
        b().setBinaryLog(abstractC5715b);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 usePlaintext() {
        b().usePlaintext();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 useTransportSecurity() {
        b().useTransportSecurity();
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 userAgent(String str) {
        b().userAgent(str);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 intercept(List<InterfaceC5788k> list) {
        b().intercept(list);
        return c();
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5722e0 intercept(InterfaceC5788k... interfaceC5788kArr) {
        b().intercept(interfaceC5788kArr);
        return c();
    }
}
