package io.grpc.stub;

import e3.w;
import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5792m;
import io.grpc.C5721e;
import io.grpc.C5806x;
import io.grpc.InterfaceC5788k;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class d {
    private final C5721e callOptions;
    private final AbstractC5723f channel;

    public interface a {
        d newStub(AbstractC5723f abstractC5723f, C5721e c5721e);
    }

    protected d(AbstractC5723f abstractC5723f, C5721e c5721e) {
        this.channel = (AbstractC5723f) w.checkNotNull(abstractC5723f, "channel");
        this.callOptions = (C5721e) w.checkNotNull(c5721e, "callOptions");
    }

    public static <T extends d> T newStub(a aVar, AbstractC5723f abstractC5723f) {
        return (T) newStub(aVar, abstractC5723f, C5721e.DEFAULT);
    }

    protected abstract d build(AbstractC5723f abstractC5723f, C5721e c5721e);

    public final C5721e getCallOptions() {
        return this.callOptions;
    }

    public final AbstractC5723f getChannel() {
        return this.channel;
    }

    public final d withCallCredentials(AbstractC5719d abstractC5719d) {
        return build(this.channel, this.callOptions.withCallCredentials(abstractC5719d));
    }

    @Deprecated
    public final d withChannel(AbstractC5723f abstractC5723f) {
        return build(abstractC5723f, this.callOptions);
    }

    public final d withCompression(String str) {
        return build(this.channel, this.callOptions.withCompression(str));
    }

    public final d withDeadline(C5806x c5806x) {
        return build(this.channel, this.callOptions.withDeadline(c5806x));
    }

    public final d withDeadlineAfter(long j8, TimeUnit timeUnit) {
        return build(this.channel, this.callOptions.withDeadlineAfter(j8, timeUnit));
    }

    public final d withExecutor(Executor executor) {
        return build(this.channel, this.callOptions.withExecutor(executor));
    }

    public final d withInterceptors(InterfaceC5788k... interfaceC5788kArr) {
        return build(AbstractC5792m.intercept(this.channel, interfaceC5788kArr), this.callOptions);
    }

    public final d withMaxInboundMessageSize(int i8) {
        return build(this.channel, this.callOptions.withMaxInboundMessageSize(i8));
    }

    public final d withMaxOutboundMessageSize(int i8) {
        return build(this.channel, this.callOptions.withMaxOutboundMessageSize(i8));
    }

    public final <T> d withOption(C5721e.c cVar, T t8) {
        return build(this.channel, this.callOptions.withOption(cVar, t8));
    }

    public final d withWaitForReady() {
        return build(this.channel, this.callOptions.withWaitForReady());
    }

    public static <T extends d> T newStub(a aVar, AbstractC5723f abstractC5723f, C5721e c5721e) {
        return (T) aVar.newStub(abstractC5723f, c5721e);
    }
}
