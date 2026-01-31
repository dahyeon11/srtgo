package n3;

import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
final /* synthetic */ class j implements InterfaceC6416a {

    /* renamed from: a, reason: collision with root package name */
    private final m f34224a;

    /* renamed from: b, reason: collision with root package name */
    private final e f34225b;

    private j(m mVar, e eVar) {
        this.f34224a = mVar;
        this.f34225b = eVar;
    }

    public static InterfaceC6416a lambdaFactory$(m mVar, e eVar) {
        return new j(mVar, eVar);
    }

    @Override // u3.InterfaceC6416a
    public Object get() {
        return m.a(this.f34224a, this.f34225b);
    }
}
