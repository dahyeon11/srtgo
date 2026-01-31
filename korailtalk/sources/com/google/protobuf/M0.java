package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class M0 {

    /* renamed from: a */
    private static final char[] f26220a;

    static {
        char[] cArr = new char[80];
        f26220a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i8, StringBuilder sb) {
        while (i8 > 0) {
            char[] cArr = f26220a;
            int length = i8 > cArr.length ? cArr.length : i8;
            sb.append(cArr, 0, length);
            i8 -= length;
        }
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof AbstractC5235o ? obj.equals(AbstractC5235o.EMPTY) : obj instanceof K0 ? obj == ((K0) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i8 = 1; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    static void d(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i8, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(u1.e((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5235o) {
            sb.append(": \"");
            sb.append(u1.a((AbstractC5235o) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5206e0) {
            sb.append(" {");
            e((AbstractC5206e0) obj, sb, i8 + 2);
            sb.append(Q7.X.LF);
            a(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i8 + 2;
        d(sb, i9, "key", entry.getKey());
        d(sb, i9, "value", entry.getValue());
        sb.append(Q7.X.LF);
        a(i8, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(com.google.protobuf.K0 r16, java.lang.StringBuilder r17, int r18) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.M0.e(com.google.protobuf.K0, java.lang.StringBuilder, int):void");
    }

    static String f(K0 k02, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(k02, sb, 0);
        return sb.toString();
    }
}
