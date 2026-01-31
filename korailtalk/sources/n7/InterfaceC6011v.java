package n7;

import W6.g;
import java.util.concurrent.CancellationException;

/* renamed from: n7.v */
/* loaded from: classes3.dex */
public interface InterfaceC6011v extends InterfaceC6008t0 {
    /* synthetic */ InterfaceC6007t attachChild(InterfaceC6011v interfaceC6011v);

    /* synthetic */ void cancel();

    /* synthetic */ void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ Object fold(Object obj, f7.p pVar);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ g.b get(g.c cVar);

    /* synthetic */ CancellationException getCancellationException();

    /* synthetic */ k7.m getChildren();

    @Override // n7.InterfaceC6008t0, W6.g.b
    /* synthetic */ g.c getKey();

    /* synthetic */ v7.d getOnJoin();

    /* synthetic */ InterfaceC6008t0 getParent();

    /* synthetic */ InterfaceC5973b0 invokeOnCompletion(f7.l lVar);

    /* synthetic */ InterfaceC5973b0 invokeOnCompletion(boolean z8, boolean z9, f7.l lVar);

    /* synthetic */ boolean isActive();

    /* synthetic */ boolean isCancelled();

    /* synthetic */ boolean isCompleted();

    /* synthetic */ Object join(W6.d dVar);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ W6.g minusKey(g.c cVar);

    void parentCancelled(J0 j02);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ W6.g plus(W6.g gVar);

    /* synthetic */ InterfaceC6008t0 plus(InterfaceC6008t0 interfaceC6008t0);

    /* synthetic */ boolean start();
}
