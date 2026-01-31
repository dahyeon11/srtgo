package n7;

/* loaded from: classes3.dex */
public final class H0 implements InterfaceC5973b0, InterfaceC6007t {
    public static final H0 INSTANCE = new H0();

    private H0() {
    }

    @Override // n7.InterfaceC6007t
    public boolean childCancelled(Throwable th) {
        return false;
    }

    @Override // n7.InterfaceC6007t
    public InterfaceC6008t0 getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // n7.InterfaceC5973b0
    public void dispose() {
    }
}
