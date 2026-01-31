package n7;

/* renamed from: n7.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5975c0 extends AbstractC5992l {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5973b0 f34323a;

    public C5975c0(InterfaceC5973b0 interfaceC5973b0) {
        this.f34323a = interfaceC5973b0;
    }

    @Override // n7.AbstractC5992l, n7.AbstractC5994m, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f34323a + ']';
    }

    @Override // n7.AbstractC5994m
    public void invoke(Throwable th) {
        this.f34323a.dispose();
    }
}
