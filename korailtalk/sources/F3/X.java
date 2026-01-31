package f3;

/* loaded from: classes2.dex */
public abstract class X {
    protected X() {
    }

    protected abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
