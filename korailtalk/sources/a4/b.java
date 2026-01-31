package A4;

import z4.N;

/* loaded from: classes.dex */
public class b {
    public static boolean isCongressPerson(String str, String str2) {
        if (!"102".equals(str + str2)) {
            if (!"1H1".equals(str + str2)) {
                if (!"1H2".equals(str + str2)) {
                    if (!"1H3".equals(str + str2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isCoupon(String str, String str2) {
        if (!"151".equals(str + str2)) {
            if (!"191".equals(str + str2)) {
                if (!"192".equals(str + str2)) {
                    if (!"351".equals(str + str2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isDelayCoupon(String str, String str2, String str3, String str4) {
        return N.isNotNull(str) && N.isNotNull(str2) && N.isNotNull(str3) && N.isNotNull(str4);
    }

    public static boolean isDisabledProtector(String str, String str2) {
        return "171".equals(str + str2);
    }

    public static boolean isEmployee(String str, String str2) {
        return "152".equals(str + str2);
    }

    public static boolean isMeritDC(String str, String str2) {
        return N.isNotNull(str2) && str2.startsWith("51") && "151".equals(str);
    }

    public static boolean isMeritFree(String str, String str2, String str3) {
        return isMeritFree(str + str2, str3);
    }

    public static boolean isMeritProtector(String str, String str2) {
        return "172".equals(str + str2);
    }

    public static boolean isSoldier(String str, String str2) {
        return "161".equals(str + str2);
    }

    public static boolean isMeritFree(String str, String str2) {
        return N.isNotNull(str2) && str2.startsWith("51") && "152".equals(str);
    }
}
