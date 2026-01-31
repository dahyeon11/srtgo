package io.grpc;

import io.grpc.F0;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class v0 {
    private v0 a() {
        return this;
    }

    public static v0 forPort(int i8) {
        return C0.provider().a(i8);
    }

    public abstract v0 addService(E0 e02);

    public abstract v0 addService(InterfaceC5717c interfaceC5717c);

    public final v0 addServices(List<E0> list) {
        e3.w.checkNotNull(list, "services");
        Iterator<E0> it = list.iterator();
        while (it.hasNext()) {
            addService(it.next());
        }
        return a();
    }

    public v0 addStreamTracerFactory(F0.a aVar) {
        throw new UnsupportedOperationException();
    }

    public v0 addTransportFilter(G0 g02) {
        throw new UnsupportedOperationException();
    }

    public abstract u0 build();

    public v0 callExecutor(x0 x0Var) {
        return a();
    }

    public abstract v0 compressorRegistry(C5801s c5801s);

    public abstract v0 decompressorRegistry(C5808z c5808z);

    public abstract v0 directExecutor();

    public abstract v0 executor(Executor executor);

    public abstract v0 fallbackHandlerRegistry(K k8);

    public v0 handshakeTimeout(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 intercept(A0 a02) {
        throw new UnsupportedOperationException();
    }

    public v0 keepAliveTime(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 keepAliveTimeout(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 maxConnectionAge(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 maxConnectionAgeGrace(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 maxConnectionIdle(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 maxInboundMessageSize(int i8) {
        e3.w.checkArgument(i8 >= 0, "bytes must be >= 0");
        return a();
    }

    public v0 maxInboundMetadataSize(int i8) {
        e3.w.checkArgument(i8 > 0, "maxInboundMetadataSize must be > 0");
        return a();
    }

    public v0 permitKeepAliveTime(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public v0 permitKeepAliveWithoutCalls(boolean z8) {
        throw new UnsupportedOperationException();
    }

    public v0 setBinaryLog(AbstractC5715b abstractC5715b) {
        throw new UnsupportedOperationException();
    }

    public abstract v0 useTransportSecurity(File file, File file2);

    public v0 useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        throw new UnsupportedOperationException();
    }
}
