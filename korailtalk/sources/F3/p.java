package F3;

/* loaded from: classes2.dex */
public abstract class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected static final boolean f1155a;

    /* renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f1156b;

    static {
        f1155a = System.getProperty("surefire.test.class.path") != null;
        f1156b = new StackTraceElement[0];
    }

    p() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    p(Throwable th) {
        super(th);
    }
}
