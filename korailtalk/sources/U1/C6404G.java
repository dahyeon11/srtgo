package u1;

import android.content.Context;

/* renamed from: u1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6404G implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f37062a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f37063b;

    public C6404G(Q6.a aVar, Q6.a aVar2) {
        this.f37062a = aVar;
        this.f37063b = aVar2;
    }

    public static C6404G create(Q6.a aVar, Q6.a aVar2) {
        return new C6404G(aVar, aVar2);
    }

    public static C6403F newInstance(Context context, int i8) {
        return new C6403F(context, i8);
    }

    @Override // H6.b, Q6.a, G6.a
    public C6403F get() {
        return new C6403F((Context) this.f37062a.get(), ((Integer) this.f37063b.get()).intValue());
    }
}
