package io.grpc;

import io.grpc.AbstractC5787j0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5722e0 {
    private AbstractC5722e0 a() {
        return this;
    }

    public static AbstractC5722e0 forAddress(String str, int i8) {
        return AbstractC5724f0.provider().builderForAddress(str, i8);
    }

    public static AbstractC5722e0 forTarget(String str) {
        return AbstractC5724f0.provider().builderForTarget(str);
    }

    public abstract AbstractC5720d0 build();

    public abstract AbstractC5722e0 compressorRegistry(C5801s c5801s);

    public abstract AbstractC5722e0 decompressorRegistry(C5808z c5808z);

    public AbstractC5722e0 defaultLoadBalancingPolicy(String str) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 defaultServiceConfig(Map<String, ?> map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC5722e0 directExecutor();

    public AbstractC5722e0 disableRetry() {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 disableServiceConfigLookUp() {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 enableFullStreamDecompression() {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 enableRetry() {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC5722e0 executor(Executor executor);

    public abstract AbstractC5722e0 idleTimeout(long j8, TimeUnit timeUnit);

    public abstract AbstractC5722e0 intercept(List<InterfaceC5788k> list);

    public abstract AbstractC5722e0 intercept(InterfaceC5788k... interfaceC5788kArr);

    public AbstractC5722e0 keepAliveTime(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 keepAliveTimeout(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 keepAliveWithoutCalls(boolean z8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 maxHedgedAttempts(int i8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 maxInboundMessageSize(int i8) {
        e3.w.checkArgument(i8 >= 0, "bytes must be >= 0");
        return a();
    }

    public AbstractC5722e0 maxInboundMetadataSize(int i8) {
        e3.w.checkArgument(i8 > 0, "maxInboundMetadataSize must be > 0");
        return a();
    }

    public AbstractC5722e0 maxRetryAttempts(int i8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 maxTraceEvents(int i8) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public abstract AbstractC5722e0 nameResolverFactory(AbstractC5787j0.d dVar);

    public AbstractC5722e0 offloadExecutor(Executor executor) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC5722e0 overrideAuthority(String str);

    public AbstractC5722e0 perRpcBufferLimit(long j8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 proxyDetector(s0 s0Var) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 retryBufferSize(long j8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 setBinaryLog(AbstractC5715b abstractC5715b) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 usePlaintext() {
        throw new UnsupportedOperationException();
    }

    public AbstractC5722e0 useTransportSecurity() {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC5722e0 userAgent(String str);
}
