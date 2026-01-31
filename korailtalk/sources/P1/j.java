package p1;

import android.content.Context;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public final class j implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f34580a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f34581b;

    /* renamed from: c, reason: collision with root package name */
    private final Q6.a f34582c;

    public j(Q6.a aVar, Q6.a aVar2, Q6.a aVar3) {
        this.f34580a = aVar;
        this.f34581b = aVar2;
        this.f34582c = aVar3;
    }

    public static j create(Q6.a aVar, Q6.a aVar2, Q6.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i newInstance(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2) {
        return new i(context, interfaceC6458a, interfaceC6458a2);
    }

    @Override // H6.b, Q6.a, G6.a
    public i get() {
        return new i((Context) this.f34580a.get(), (InterfaceC6458a) this.f34581b.get(), (InterfaceC6458a) this.f34582c.get());
    }
}
