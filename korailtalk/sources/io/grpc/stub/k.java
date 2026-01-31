package io.grpc.stub;

/* loaded from: classes.dex */
public interface k {
    void onCompleted();

    void onError(Throwable th);

    void onNext(Object obj);
}
