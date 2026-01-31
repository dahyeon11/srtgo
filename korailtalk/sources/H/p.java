package H;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static final p f1564b = new p("1.1.0");

    /* renamed from: a, reason: collision with root package name */
    private final o f1565a;

    public p(String str) {
        this.f1565a = o.parse(str);
    }

    public static p getCurrentVersion() {
        return f1564b;
    }

    public o getVersion() {
        return this.f1565a;
    }

    public String toVersionString() {
        return this.f1565a.toString();
    }
}
