package P7;

/* loaded from: classes3.dex */
public abstract class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final v f3783a;

    public g(v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3783a = vVar;
    }

    @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3783a.close();
    }

    public final v delegate() {
        return this.f3783a;
    }

    @Override // P7.v, java.io.Flushable
    public void flush() {
        this.f3783a.flush();
    }

    @Override // P7.v
    public x timeout() {
        return this.f3783a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f3783a.toString() + ")";
    }

    @Override // P7.v
    public void write(c cVar, long j8) {
        this.f3783a.write(cVar, j8);
    }
}
