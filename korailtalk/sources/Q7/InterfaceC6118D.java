package q7;

import java.util.List;

/* renamed from: q7.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6118D extends InterfaceC6132S, InterfaceC6117C {
    @Override // q7.InterfaceC6132S, q7.InterfaceC6122H, q7.InterfaceC6147i
    /* synthetic */ Object collect(InterfaceC6148j interfaceC6148j, W6.d dVar);

    boolean compareAndSet(Object obj, Object obj2);

    @Override // q7.InterfaceC6117C, q7.InterfaceC6148j
    /* synthetic */ Object emit(Object obj, W6.d dVar);

    @Override // q7.InterfaceC6132S, q7.InterfaceC6122H
    /* synthetic */ List getReplayCache();

    @Override // q7.InterfaceC6117C
    /* synthetic */ InterfaceC6132S getSubscriptionCount();

    @Override // q7.InterfaceC6132S
    Object getValue();

    @Override // q7.InterfaceC6117C
    /* synthetic */ void resetReplayCache();

    void setValue(Object obj);

    @Override // q7.InterfaceC6117C
    /* synthetic */ boolean tryEmit(Object obj);
}
