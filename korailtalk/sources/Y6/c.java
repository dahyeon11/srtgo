package Y6;

/* loaded from: classes3.dex */
public final class c implements W6.d {
    public static final c INSTANCE = new c();

    private c() {
    }

    @Override // W6.d
    public W6.g getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // W6.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
