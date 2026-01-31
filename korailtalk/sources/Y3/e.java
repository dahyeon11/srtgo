package y3;

import R6.C0753g;

/* loaded from: classes2.dex */
public abstract class e {
    public static String detectVersion() {
        try {
            return C0753g.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
