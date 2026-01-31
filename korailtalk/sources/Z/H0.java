package z;

/* loaded from: classes.dex */
public abstract class H0 {

    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);


        /* renamed from: a, reason: collision with root package name */
        final int f37728a;

        a(int i8) {
            this.f37728a = i8;
        }

        int a() {
            return this.f37728a;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    H0() {
    }

    public static H0 create(b bVar, a aVar) {
        return new C6578f(bVar, aVar);
    }

    public abstract a getConfigSize();

    public abstract b getConfigType();

    public final boolean isSupported(H0 h02) {
        return h02.getConfigSize().a() <= getConfigSize().a() && h02.getConfigType() == getConfigType();
    }
}
