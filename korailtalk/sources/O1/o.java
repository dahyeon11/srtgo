package o1;

import m1.AbstractC5905c;
import m1.C5904b;

/* loaded from: classes.dex */
final class o implements m1.f {

    /* renamed from: a, reason: collision with root package name */
    private final l f34429a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34430b;

    /* renamed from: c, reason: collision with root package name */
    private final C5904b f34431c;

    /* renamed from: d, reason: collision with root package name */
    private final m1.e f34432d;

    /* renamed from: e, reason: collision with root package name */
    private final p f34433e;

    o(l lVar, String str, C5904b c5904b, m1.e eVar, p pVar) {
        this.f34429a = lVar;
        this.f34430b = str;
        this.f34431c = c5904b;
        this.f34432d = eVar;
        this.f34433e = pVar;
    }

    @Override // m1.f
    public void schedule(AbstractC5905c abstractC5905c, m1.h hVar) {
        this.f34433e.send(k.builder().setTransportContext(this.f34429a).b(abstractC5905c).setTransportName(this.f34430b).c(this.f34432d).a(this.f34431c).build(), hVar);
    }

    @Override // m1.f
    public void send(AbstractC5905c abstractC5905c) {
        schedule(abstractC5905c, n.f34428a);
    }

    static /* synthetic */ void a(Exception exc) {
    }
}
