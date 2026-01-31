package t1;

import java.util.concurrent.Executor;
import u1.InterfaceC6407c;
import v1.InterfaceC6428b;

/* loaded from: classes.dex */
public final class o implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36933a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f36934b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f36935c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f36936d;

    public o(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        this.f36933a = aVar;
        this.f36934b = aVar2;
        this.f36935c = aVar3;
        this.f36936d = aVar4;
    }

    public static o create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        return new o(aVar, aVar2, aVar3, aVar4);
    }

    public static n newInstance(Executor executor, InterfaceC6407c interfaceC6407c, p pVar, InterfaceC6428b interfaceC6428b) {
        return new n(executor, interfaceC6407c, pVar, interfaceC6428b);
    }

    @Override // H6.b, Q6.a, G6.a
    public n get() {
        return new n((Executor) this.f36933a.get(), (InterfaceC6407c) this.f36934b.get(), (p) this.f36935c.get(), (InterfaceC6428b) this.f36936d.get());
    }
}
