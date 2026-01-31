package s7;

/* loaded from: classes3.dex */
public abstract class L {
    public static final int getAVAILABLE_PROCESSORS() {
        return M.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i8, int i9, int i10) {
        return N.systemProp(str, i8, i9, i10);
    }

    public static final long systemProp(String str, long j8, long j9, long j10) {
        return N.systemProp(str, j8, j9, j10);
    }

    public static final String systemProp(String str) {
        return M.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return N.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z8) {
        return N.systemProp(str, z8);
    }
}
