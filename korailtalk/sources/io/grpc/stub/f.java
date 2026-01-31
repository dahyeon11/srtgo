package io.grpc.stub;

/* loaded from: classes.dex */
public abstract class f extends e {
    public abstract void cancel(String str, Throwable th);

    public void disableAutoRequestWithInitial(int i8) {
        throw new UnsupportedOperationException();
    }

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

    @Override // io.grpc.stub.e
    public abstract void setMessageCompression(boolean z8);

    @Override // io.grpc.stub.e
    public abstract void setOnReadyHandler(Runnable runnable);
}
