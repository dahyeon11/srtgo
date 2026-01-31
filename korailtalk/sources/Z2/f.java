package z2;

/* loaded from: classes2.dex */
final class f extends y {

    /* renamed from: c */
    private final h f37863c;

    f(h hVar, int i8) {
        super(hVar.size(), i8);
        this.f37863c = hVar;
    }

    @Override // z2.y
    protected final Object a(int i8) {
        return this.f37863c.get(i8);
    }
}
