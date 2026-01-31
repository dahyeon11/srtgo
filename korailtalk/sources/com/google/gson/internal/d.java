package com.google.gson.internal;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26039a = a();

    private static int a() {
        return c(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int c(String str) throws NumberFormatException {
        int iD = d(str);
        if (iD == -1) {
            iD = b(str);
        }
        if (iD == -1) {
            return 6;
        }
        return iD;
    }

    private static int d(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split("[._]");
            int i8 = Integer.parseInt(strArrSplit[0]);
            return (i8 != 1 || strArrSplit.length <= 1) ? i8 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int getMajorJavaVersion() {
        return f26039a;
    }

    public static boolean isJava9OrLater() {
        return f26039a >= 9;
    }
}
