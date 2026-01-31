package Y0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f5579b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final O.f f5580a = new O.f(20);

    g() {
    }

    public static g getInstance() {
        return f5579b;
    }

    public void clear() {
        this.f5580a.evictAll();
    }

    public T0.h get(String str) {
        if (str == null) {
            return null;
        }
        return (T0.h) this.f5580a.get(str);
    }

    public void put(String str, T0.h hVar) {
        if (str == null) {
            return;
        }
        this.f5580a.put(str, hVar);
    }

    public void resize(int i8) {
        this.f5580a.resize(i8);
    }
}
