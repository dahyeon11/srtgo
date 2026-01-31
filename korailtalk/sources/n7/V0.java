package n7;

import W6.g;

/* loaded from: classes3.dex */
final class V0 implements g.b, g.c {
    public static final V0 INSTANCE = new V0();

    private V0() {
    }

    @Override // W6.g.b, W6.g
    public <R> R fold(R r8, f7.p pVar) {
        return (R) g.b.a.fold(this, r8, pVar);
    }

    @Override // W6.g.b, W6.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.get(this, cVar);
    }

    @Override // W6.g.b, W6.g
    public W6.g minusKey(g.c cVar) {
        return g.b.a.minusKey(this, cVar);
    }

    @Override // W6.g.b, W6.g
    public W6.g plus(W6.g gVar) {
        return g.b.a.plus(this, gVar);
    }

    @Override // W6.g.b
    public g.c getKey() {
        return this;
    }
}
