package T0;

/* loaded from: classes.dex */
public enum E {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4779a;

        static {
            int[] iArr = new int[E.values().length];
            f4779a = iArr;
            try {
                iArr[E.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4779a[E.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4779a[E.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i8, boolean z8, int i9) {
        int i10 = a.f4779a[ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return (z8 && i8 < 28) || i9 > 4 || i8 <= 25;
        }
        return true;
    }
}
