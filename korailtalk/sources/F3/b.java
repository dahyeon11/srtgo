package F3;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f1133a;

    protected b(j jVar) {
        this.f1133a = jVar;
    }

    public abstract b createBinarizer(j jVar);

    public abstract M3.b getBlackMatrix();

    public abstract M3.a getBlackRow(int i8, M3.a aVar);

    public final int getHeight() {
        return this.f1133a.getHeight();
    }

    public final j getLuminanceSource() {
        return this.f1133a;
    }

    public final int getWidth() {
        return this.f1133a.getWidth();
    }
}
