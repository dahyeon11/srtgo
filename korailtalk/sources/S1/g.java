package s1;

import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public final class g implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36152a;

    public g(Q6.a aVar) {
        this.f36152a = aVar;
    }

    public static t1.d config(InterfaceC6458a interfaceC6458a) {
        return (t1.d) H6.e.checkNotNull(f.a(interfaceC6458a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g create(Q6.a aVar) {
        return new g(aVar);
    }

    @Override // H6.b, Q6.a, G6.a
    public t1.d get() {
        return config((InterfaceC6458a) this.f36152a.get());
    }
}
