package n7;

/* renamed from: n7.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5977d0 extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5973b0 f34324d;

    public C5977d0(InterfaceC5973b0 interfaceC5973b0) {
        this.f34324d = interfaceC5973b0;
    }

    @Override // n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        this.f34324d.dispose();
    }
}
