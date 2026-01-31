package s7;

/* renamed from: s7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6250k extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final transient W6.g f36346a;

    public C6250k(W6.g gVar) {
        this.f36346a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f36346a.toString();
    }
}
