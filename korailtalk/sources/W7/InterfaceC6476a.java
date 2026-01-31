package w7;

import R6.G;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6476a {
    Object acquire(W6.d<? super G> dVar);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
