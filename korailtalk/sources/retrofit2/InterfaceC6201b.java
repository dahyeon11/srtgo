package retrofit2;

import C7.H;

/* renamed from: retrofit2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6201b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    InterfaceC6201b<T> mo568clone();

    void enqueue(d dVar);

    w<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    H request();
}
