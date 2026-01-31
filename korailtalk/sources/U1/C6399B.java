package u1;

import w1.InterfaceC6458a;

/* renamed from: u1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6399B implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f37048a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f37049b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f37050c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f37051d;

    public C6399B(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        this.f37048a = aVar;
        this.f37049b = aVar2;
        this.f37050c = aVar3;
        this.f37051d = aVar4;
    }

    public static C6399B create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        return new C6399B(aVar, aVar2, aVar3, aVar4);
    }

    public static C6398A newInstance(InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, Object obj, Object obj2) {
        return new C6398A(interfaceC6458a, interfaceC6458a2, (AbstractC6408d) obj, (C6403F) obj2);
    }

    @Override // H6.b, Q6.a, G6.a
    public C6398A get() {
        return new C6398A((InterfaceC6458a) this.f37048a.get(), (InterfaceC6458a) this.f37049b.get(), (AbstractC6408d) this.f37050c.get(), (C6403F) this.f37051d.get());
    }
}
