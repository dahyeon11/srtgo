package F3;

/* loaded from: classes2.dex */
public final class h extends p {

    /* renamed from: c, reason: collision with root package name */
    private static final h f1142c;

    static {
        h hVar = new h();
        f1142c = hVar;
        hVar.setStackTrace(p.f1156b);
    }

    private h() {
    }

    public static h getFormatInstance() {
        return p.f1155a ? new h() : f1142c;
    }

    private h(Throwable th) {
        super(th);
    }

    public static h getFormatInstance(Throwable th) {
        return p.f1155a ? new h(th) : f1142c;
    }
}
