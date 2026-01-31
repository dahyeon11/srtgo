package n7;

import W6.g;
import java.util.concurrent.CancellationException;

/* renamed from: n7.z */
/* loaded from: classes3.dex */
public interface InterfaceC6019z extends InterfaceC6008t0 {
    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ InterfaceC6007t attachChild(InterfaceC6011v interfaceC6011v);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ void cancel();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ void cancel(CancellationException cancellationException);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ boolean cancel(Throwable th);

    boolean complete();

    boolean completeExceptionally(Throwable th);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ Object fold(Object obj, f7.p pVar);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ CancellationException getCancellationException();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ k7.m getChildren();

    @Override // n7.InterfaceC6008t0, W6.g.b
    /* synthetic */ g.c getKey();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ v7.d getOnJoin();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ InterfaceC6008t0 getParent();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ InterfaceC5973b0 invokeOnCompletion(f7.l lVar);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ InterfaceC5973b0 invokeOnCompletion(boolean z8, boolean z9, f7.l lVar);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ boolean isActive();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ boolean isCancelled();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ boolean isCompleted();

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ Object join(W6.d dVar);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ W6.g minusKey(g.c cVar);

    @Override // n7.InterfaceC6008t0, W6.g.b, W6.g
    /* synthetic */ W6.g plus(W6.g gVar);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ InterfaceC6008t0 plus(InterfaceC6008t0 interfaceC6008t0);

    @Override // n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    /* synthetic */ boolean start();
}
