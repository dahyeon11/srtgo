package P7;

/* loaded from: classes3.dex */
public abstract class h implements w {

    /* renamed from: a, reason: collision with root package name */
    private final w f3784a;

    public h(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3784a = wVar;
    }

    @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3784a.close();
    }

    public final w delegate() {
        return this.f3784a;
    }

    @Override // P7.w
    public long read(c cVar, long j8) {
        return this.f3784a.read(cVar, j8);
    }

    @Override // P7.w
    public x timeout() {
        return this.f3784a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f3784a.toString() + ")";
    }
}
