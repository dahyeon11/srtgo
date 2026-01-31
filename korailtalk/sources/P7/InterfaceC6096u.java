package p7;

import n7.L;

/* renamed from: p7.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6096u extends L, InterfaceC6099x {
    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean close(Throwable th);

    InterfaceC6099x getChannel();

    @Override // n7.L
    /* synthetic */ W6.g getCoroutineContext();

    @Override // p7.InterfaceC6099x
    /* synthetic */ v7.h getOnSend();

    @Override // p7.InterfaceC6099x
    /* synthetic */ void invokeOnClose(f7.l lVar);

    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean isClosedForSend();

    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean offer(Object obj);

    @Override // p7.InterfaceC6099x
    /* synthetic */ Object send(Object obj, W6.d dVar);

    @Override // p7.InterfaceC6099x
    /* renamed from: trySend-JP2dKIU */
    /* synthetic */ Object mo535trySendJP2dKIU(Object obj);
}
