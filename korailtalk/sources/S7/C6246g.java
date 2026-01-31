package s7;

/* renamed from: s7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6246g implements n7.L {

    /* renamed from: a, reason: collision with root package name */
    private final W6.g f36344a;

    public C6246g(W6.g gVar) {
        this.f36344a = gVar;
    }

    @Override // n7.L
    public W6.g getCoroutineContext() {
        return this.f36344a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
