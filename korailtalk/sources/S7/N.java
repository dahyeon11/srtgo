package s7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class N {
    public static final boolean systemProp(String str, boolean z8) {
        String strSystemProp = L.systemProp(str);
        return strSystemProp != null ? Boolean.parseBoolean(strSystemProp) : z8;
    }

    public static /* synthetic */ int systemProp$default(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return L.systemProp(str, i8, i9, i10);
    }

    public static final int systemProp(String str, int i8, int i9, int i10) {
        return (int) L.systemProp(str, i8, i9, i10);
    }

    public static /* synthetic */ long systemProp$default(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return L.systemProp(str, j8, j11, j10);
    }

    public static final long systemProp(String str, long j8, long j9, long j10) {
        String strSystemProp = L.systemProp(str);
        if (strSystemProp == null) {
            return j8;
        }
        Long longOrNull = l7.r.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j9 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String strSystemProp = L.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
