package t1;

import v1.InterfaceC6428b;

/* loaded from: classes.dex */
final /* synthetic */ class g implements InterfaceC6428b.a {

    /* renamed from: a, reason: collision with root package name */
    private final j f36904a;

    /* renamed from: b, reason: collision with root package name */
    private final p1.g f36905b;

    /* renamed from: c, reason: collision with root package name */
    private final Iterable f36906c;

    /* renamed from: d, reason: collision with root package name */
    private final o1.l f36907d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36908e;

    private g(j jVar, p1.g gVar, Iterable iterable, o1.l lVar, int i8) {
        this.f36904a = jVar;
        this.f36905b = gVar;
        this.f36906c = iterable;
        this.f36907d = lVar;
        this.f36908e = i8;
    }

    public static InterfaceC6428b.a lambdaFactory$(j jVar, p1.g gVar, Iterable iterable, o1.l lVar, int i8) {
        return new g(jVar, gVar, iterable, lVar, i8);
    }

    @Override // v1.InterfaceC6428b.a
    public Object execute() {
        return j.c(this.f36904a, this.f36905b, this.f36906c, this.f36907d, this.f36908e);
    }
}
