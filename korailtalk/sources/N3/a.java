package N3;

/* loaded from: classes2.dex */
public abstract class a {
    public static float distance(float f8, float f9, float f10, float f11) {
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        return (float) Math.sqrt((f12 * f12) + (f13 * f13));
    }

    public static int round(float f8) {
        return (int) (f8 + (f8 < 0.0f ? -0.5f : 0.5f));
    }

    public static int sum(int[] iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        return i8;
    }

    public static float distance(int i8, int i9, int i10, int i11) {
        int i12 = i8 - i10;
        int i13 = i9 - i11;
        return (float) Math.sqrt((i12 * i12) + (i13 * i13));
    }
}
