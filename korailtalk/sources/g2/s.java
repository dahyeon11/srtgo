package g2;

import f2.C5394d;

/* loaded from: classes.dex */
public final class s extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C5394d f31314a;

    public s(C5394d c5394d) {
        this.f31314a = c5394d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f31314a));
    }
}
