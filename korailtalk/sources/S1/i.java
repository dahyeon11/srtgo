package s1;

import android.content.Context;
import t1.p;
import u1.InterfaceC6407c;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public final class i implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f36153a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f36154b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f36155c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.a f36156d;

    public i(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        this.f36153a = aVar;
        this.f36154b = aVar2;
        this.f36155c = aVar3;
        this.f36156d = aVar4;
    }

    public static i create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3, Q6.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static p workScheduler(Context context, InterfaceC6407c interfaceC6407c, t1.d dVar, InterfaceC6458a interfaceC6458a) {
        return (p) H6.e.checkNotNull(h.a(context, interfaceC6407c, dVar, interfaceC6458a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // H6.b, Q6.a, G6.a
    public p get() {
        return workScheduler((Context) this.f36153a.get(), (InterfaceC6407c) this.f36154b.get(), (t1.d) this.f36155c.get(), (InterfaceC6458a) this.f36156d.get());
    }
}
