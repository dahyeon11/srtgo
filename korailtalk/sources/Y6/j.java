package Y6;

/* loaded from: classes3.dex */
public abstract class j extends a {
    public j(W6.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != W6.h.INSTANCE) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Y6.a, W6.d
    public W6.g getContext() {
        return W6.h.INSTANCE;
    }
}
