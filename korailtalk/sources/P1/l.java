package p1;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Q6.a f34588a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6.a f34589b;

    public l(Q6.a aVar, Q6.a aVar2) {
        this.f34588a = aVar;
        this.f34589b = aVar2;
    }

    public static l create(Q6.a aVar, Q6.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k newInstance(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // H6.b, Q6.a, G6.a
    public k get() {
        return new k((Context) this.f34588a.get(), (i) this.f34589b.get());
    }
}
