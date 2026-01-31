package n7;

/* loaded from: classes3.dex */
public final class T0 extends I {
    public static final T0 INSTANCE = new T0();

    private T0() {
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        X0 x02 = (X0) gVar.get(X0.Key);
        if (x02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        x02.dispatcherWasUnconfined = true;
    }

    @Override // n7.I
    public boolean isDispatchNeeded(W6.g gVar) {
        return false;
    }

    @Override // n7.I
    public I limitedParallelism(int i8) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // n7.I
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
