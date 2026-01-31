package r7;

import W6.g;

/* renamed from: r7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6197n implements W6.g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ W6.g f35912a;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f35913e;

    public C6197n(Throwable th, W6.g gVar) {
        this.f35913e = th;
        this.f35912a = gVar;
    }

    @Override // W6.g
    public <R> R fold(R r8, f7.p pVar) {
        return (R) this.f35912a.fold(r8, pVar);
    }

    @Override // W6.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) this.f35912a.get(cVar);
    }

    @Override // W6.g
    public W6.g minusKey(g.c cVar) {
        return this.f35912a.minusKey(cVar);
    }

    @Override // W6.g
    public W6.g plus(W6.g gVar) {
        return this.f35912a.plus(gVar);
    }
}
