package q7;

import java.util.List;

/* renamed from: q7.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6117C extends InterfaceC6122H, InterfaceC6148j {
    @Override // q7.InterfaceC6122H, q7.InterfaceC6147i
    /* synthetic */ Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar);

    @Override // q7.InterfaceC6148j
    Object emit(Object obj, W6.d<? super R6.G> dVar);

    @Override // q7.InterfaceC6122H
    /* synthetic */ List getReplayCache();

    InterfaceC6132S getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(Object obj);
}
