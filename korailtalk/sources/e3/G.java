package e3;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final G f30332a = new a();

    class a extends G {
        a() {
        }

        @Override // e3.G
        public long read() {
            return System.nanoTime();
        }
    }

    protected G() {
    }

    public static G systemTicker() {
        return f30332a;
    }

    public abstract long read();
}
