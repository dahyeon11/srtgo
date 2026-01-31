package W6;

import W6.g;
import f7.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a implements g.b {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f5379a;

    public a(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f5379a = key;
    }

    @Override // W6.g.b, W6.g
    public <R> R fold(R r8, p pVar) {
        return (R) g.b.a.fold(this, r8, pVar);
    }

    @Override // W6.g.b, W6.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.get(this, cVar);
    }

    @Override // W6.g.b
    public g.c getKey() {
        return this.f5379a;
    }

    @Override // W6.g.b, W6.g
    public g minusKey(g.c cVar) {
        return g.b.a.minusKey(this, cVar);
    }

    @Override // W6.g.b, W6.g
    public g plus(g gVar) {
        return g.b.a.plus(this, gVar);
    }
}
