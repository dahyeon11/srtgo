package r7;

/* loaded from: classes3.dex */
final class z implements W6.d, Y6.e {

    /* renamed from: a, reason: collision with root package name */
    private final W6.d f35929a;

    /* renamed from: b, reason: collision with root package name */
    private final W6.g f35930b;

    public z(W6.d<Object> dVar, W6.g gVar) {
        this.f35929a = dVar;
        this.f35930b = gVar;
    }

    @Override // Y6.e
    public Y6.e getCallerFrame() {
        W6.d dVar = this.f35929a;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // W6.d
    public W6.g getContext() {
        return this.f35930b;
    }

    @Override // Y6.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // W6.d
    public void resumeWith(Object obj) {
        this.f35929a.resumeWith(obj);
    }
}
