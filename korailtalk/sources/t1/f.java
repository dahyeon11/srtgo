package t1;

import v1.InterfaceC6428b;

/* loaded from: classes.dex */
final /* synthetic */ class f implements InterfaceC6428b.a {

    /* renamed from: a, reason: collision with root package name */
    private final j f36902a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.l f36903b;

    private f(j jVar, o1.l lVar) {
        this.f36902a = jVar;
        this.f36903b = lVar;
    }

    public static InterfaceC6428b.a lambdaFactory$(j jVar, o1.l lVar) {
        return new f(jVar, lVar);
    }

    @Override // v1.InterfaceC6428b.a
    public Object execute() {
        return j.b(this.f36902a, this.f36903b);
    }
}
