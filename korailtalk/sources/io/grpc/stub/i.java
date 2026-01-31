package io.grpc.stub;

/* loaded from: classes.dex */
public abstract class i extends e {
    public void disableAutoRequest() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isCancelled();

    @Override // io.grpc.stub.e
    public abstract boolean isReady();

    @Override // io.grpc.stub.e, io.grpc.stub.k
    public abstract /* synthetic */ void onCompleted();

    @Override // io.grpc.stub.e, io.grpc.stub.k
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.grpc.stub.e, io.grpc.stub.k
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.grpc.stub.e
    public abstract void request(int i8);

    public abstract void setCompression(String str);

    @Override // io.grpc.stub.e
    public abstract void setMessageCompression(boolean z8);

    public abstract void setOnCancelHandler(Runnable runnable);

    public void setOnCloseHandler(Runnable runnable) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.stub.e
    public abstract void setOnReadyHandler(Runnable runnable);
}
