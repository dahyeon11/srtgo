package F3;

/* loaded from: classes2.dex */
public final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private static final d f1136c;

    static {
        d dVar = new d();
        f1136c = dVar;
        dVar.setStackTrace(p.f1156b);
    }

    private d() {
    }

    public static d getChecksumInstance() {
        return p.f1155a ? new d() : f1136c;
    }

    private d(Throwable th) {
        super(th);
    }

    public static d getChecksumInstance(Throwable th) {
        return p.f1155a ? new d(th) : f1136c;
    }
}
