package I2;

/* renamed from: I2.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0612p implements InterfaceC0604h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0605i f2025a;

    C0612p(w wVar, InterfaceC0605i interfaceC0605i) {
        this.f2025a = interfaceC0605i;
    }

    @Override // I2.InterfaceC0604h
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f2025a.onCanceled();
    }
}
