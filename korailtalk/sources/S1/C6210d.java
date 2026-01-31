package s1;

import java.util.concurrent.Executor;
import t1.p;
import u1.InterfaceC6407c;
import v1.InterfaceC6428b;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6210d implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36147a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f36148b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f36149c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f36150d;

    /* renamed from: e, reason: collision with root package name */
    private final Q6.a f36151e;

    public C6210d(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5) {
        this.f36147a = aVar;
        this.f36148b = aVar2;
        this.f36149c = aVar3;
        this.f36150d = aVar4;
        this.f36151e = aVar5;
    }

    public static C6210d create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4, Q6.a aVar5) {
        return new C6210d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C6209c newInstance(Executor executor, p1.e eVar, p pVar, InterfaceC6407c interfaceC6407c, InterfaceC6428b interfaceC6428b) {
        return new C6209c(executor, eVar, pVar, interfaceC6407c, interfaceC6428b);
    }

    @Override // H6.b, Q6.a, G6.a
    public C6209c get() {
        return new C6209c((Executor) this.f36147a.get(), (p1.e) this.f36148b.get(), (p) this.f36149c.get(), (InterfaceC6407c) this.f36150d.get(), (InterfaceC6428b) this.f36151e.get());
    }
}
