package p7;

import R6.G;
import java.util.concurrent.CancellationException;
import n7.AbstractC5970a;
import n7.B0;
import n7.C6010u0;

/* renamed from: p7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6068f extends AbstractC5970a implements InterfaceC6067e {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6067e f34681d;

    public C6068f(W6.g gVar, InterfaceC6067e interfaceC6067e, boolean z8, boolean z9) {
        super(gVar, z8, z9);
        this.f34681d = interfaceC6067e;
    }

    protected final InterfaceC6067e W() {
        return this.f34681d;
    }

    @Override // n7.B0, n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C6010u0(k(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // n7.B0
    public void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = B0.toCancellationException$default(this, th, null, 1, null);
        this.f34681d.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean close(Throwable th) {
        return this.f34681d.close(th);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceive() {
        return this.f34681d.getOnReceive();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceiveCatching() {
        return this.f34681d.getOnReceiveCatching();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public v7.f getOnReceiveOrNull() {
        return this.f34681d.getOnReceiveOrNull();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public v7.h getOnSend() {
        return this.f34681d.getOnSend();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public void invokeOnClose(f7.l lVar) {
        this.f34681d.invokeOnClose(lVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public boolean isClosedForReceive() {
        return this.f34681d.isClosedForReceive();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean isClosedForSend() {
        return this.f34681d.isClosedForSend();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public boolean isEmpty() {
        return this.f34681d.isEmpty();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public InterfaceC6069g iterator() {
        return this.f34681d.iterator();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public boolean offer(Object obj) {
        return this.f34681d.offer(obj);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object poll() {
        return this.f34681d.poll();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object receive(W6.d<Object> dVar) {
        return this.f34681d.receive(dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    /* renamed from: receiveCatching-JP2dKIU */
    public Object mo533receiveCatchingJP2dKIU(W6.d<? super C6071i> dVar) {
        Object objMo533receiveCatchingJP2dKIU = this.f34681d.mo533receiveCatchingJP2dKIU(dVar);
        X6.b.getCOROUTINE_SUSPENDED();
        return objMo533receiveCatchingJP2dKIU;
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    public Object receiveOrNull(W6.d<Object> dVar) {
        return this.f34681d.receiveOrNull(dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    public Object send(Object obj, W6.d<? super G> dVar) {
        return this.f34681d.send(obj, dVar);
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6098w
    /* renamed from: tryReceive-PtdJZtk */
    public Object mo534tryReceivePtdJZtk() {
        return this.f34681d.mo534tryReceivePtdJZtk();
    }

    @Override // p7.InterfaceC6067e, p7.InterfaceC6099x
    /* renamed from: trySend-JP2dKIU */
    public Object mo535trySendJP2dKIU(Object obj) {
        return this.f34681d.mo535trySendJP2dKIU(obj);
    }

    @Override // n7.B0, n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public /* synthetic */ void cancel() {
        cancelInternal(new C6010u0(k(), null, this));
    }

    @Override // n7.B0, n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new C6010u0(k(), null, this));
        return true;
    }

    public final InterfaceC6067e getChannel() {
        return this;
    }
}
