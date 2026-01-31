package o1;

import s1.InterfaceC6211e;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public final class s implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f34439a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f34440b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f34441c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f34442d;

    /* renamed from: e, reason: collision with root package name */
    private final Q6.a f34443e;

    public s(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5) {
        this.f34439a = aVar;
        this.f34440b = aVar2;
        this.f34441c = aVar3;
        this.f34442d = aVar4;
        this.f34443e = aVar5;
    }

    public static s create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static q newInstance(InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, InterfaceC6211e interfaceC6211e, t1.j jVar, t1.n nVar) {
        return new q(interfaceC6458a, interfaceC6458a2, interfaceC6211e, jVar, nVar);
    }

    @Override // H6.b, Q6.a, G6.a
    public q get() {
        return new q((InterfaceC6458a) this.f34439a.get(), (InterfaceC6458a) this.f34440b.get(), (InterfaceC6211e) this.f34441c.get(), (t1.j) this.f34442d.get(), (t1.n) this.f34443e.get());
    }
}
