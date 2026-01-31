package t1;

import v1.InterfaceC6428b;

/* loaded from: classes.dex */
final /* synthetic */ class i implements InterfaceC6428b.a {

    /* renamed from: a, reason: collision with root package name */
    private final j f36910a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f36911b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36912c;

    private i(j jVar, o1.l lVar, int i8) {
        this.f36910a = jVar;
        this.f36911b = lVar;
        this.f36912c = i8;
    }

    public static InterfaceC6428b.a lambdaFactory$(j jVar, o1.l lVar, int i8) {
        return new i(jVar, lVar, i8);
    }

    @Override // v1.InterfaceC6428b.a
    public Object execute() {
        return j.d(this.f36910a, this.f36911b, this.f36912c);
    }
}
