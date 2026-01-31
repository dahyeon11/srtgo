package io.grpc.stub;

/* loaded from: classes.dex */
public abstract class e implements k {
    public abstract void disableAutoInboundFlowControl();

    public abstract boolean isReady();

    @Override // io.grpc.stub.k
    public abstract /* synthetic */ void onCompleted();

    @Override // io.grpc.stub.k
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.grpc.stub.k
    public abstract /* synthetic */ void onNext(Object obj);

    public abstract void request(int i8);

    public abstract void setMessageCompression(boolean z8);

    public abstract void setOnReadyHandler(Runnable runnable);
}
