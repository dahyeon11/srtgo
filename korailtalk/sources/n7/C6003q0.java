package n7;

/* renamed from: n7.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6003q0 extends AbstractC5992l {

    /* renamed from: a, reason: collision with root package name */
    private final f7.l f34349a;

    public C6003q0(f7.l lVar) {
        this.f34349a = lVar;
    }

    @Override // n7.AbstractC5992l, n7.AbstractC5994m, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + P.getClassSimpleName(this.f34349a) + '@' + P.getHexAddress(this) + ']';
    }

    @Override // n7.AbstractC5994m
    public void invoke(Throwable th) {
        this.f34349a.invoke(th);
    }
}
