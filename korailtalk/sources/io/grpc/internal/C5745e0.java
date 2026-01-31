package io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5745e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f32701a = TimeUnit.SECONDS.toNanos(1);

    private static boolean a(long j8, int i8) {
        if (j8 >= -315576000000L && j8 <= 315576000000L) {
            long j9 = i8;
            if (j9 >= -999999999 && j9 < f32701a) {
                if (j8 >= 0 && i8 >= 0) {
                    return true;
                }
                if (j8 <= 0 && i8 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long b(long j8, int i8) {
        long j9 = i8;
        long j10 = f32701a;
        if (j9 <= (-j10) || j9 >= j10) {
            j8 = i3.c.checkedAdd(j8, j9 / j10);
            i8 = (int) (j9 % j10);
        }
        if (j8 > 0 && i8 < 0) {
            i8 = (int) (i8 + j10);
            j8--;
        }
        if (j8 < 0 && i8 > 0) {
            i8 = (int) (i8 - j10);
            j8++;
        }
        if (a(j8, i8)) {
            return e(TimeUnit.SECONDS.toNanos(j8), i8);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j8), Integer.valueOf(i8)));
    }

    private static long c(String str) throws NumberFormatException, ParseException {
        boolean z8;
        String strSubstring;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z8 = true;
        } else {
            z8 = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j8 = Long.parseLong(strSubstring2);
        int iD = strSubstring.isEmpty() ? 0 : d(strSubstring);
        if (j8 < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z8) {
            j8 = -j8;
            iD = -iD;
        }
        try {
            return b(j8, iD);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<Map<String, ?>> checkObjectList(List<?> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!(list.get(i8) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i8), Integer.valueOf(i8), list));
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<String> checkStringList(List<?> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!(list.get(i8) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i8), Integer.valueOf(i8), list));
            }
        }
        return list;
    }

    private static int d(String str) throws ParseException {
        int iCharAt = 0;
        for (int i8 = 0; i8 < 9; i8++) {
            iCharAt *= 10;
            if (i8 < str.length()) {
                if (str.charAt(i8) < '0' || str.charAt(i8) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                iCharAt += str.charAt(i8) - '0';
            }
        }
        return iCharAt;
    }

    private static long e(long j8, long j9) {
        long j10 = j8 + j9;
        return (((j9 ^ j8) > 0L ? 1 : ((j9 ^ j8) == 0L ? 0 : -1)) < 0) | ((j8 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static Boolean getBoolean(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List<?> getList(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List<Map<String, ?>> getListOfObjects(Map<String, ?> map, String str) {
        List<?> list = getList(map, str);
        if (list == null) {
            return null;
        }
        return checkObjectList(list);
    }

    public static List<String> getListOfStrings(Map<String, ?> map, String str) {
        List<?> list = getList(map, str);
        if (list == null) {
            return null;
        }
        return checkStringList(list);
    }

    public static Double getNumberAsDouble(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Float getNumberAsFloat(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value %s for key '%s' is not a float", obj, str));
        }
        try {
            return Float.valueOf(Float.parseFloat((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("string value '%s' for key '%s' cannot be parsed as a float", obj, str));
        }
    }

    public static Integer getNumberAsInteger(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d9 = (Double) obj;
        int iIntValue = d9.intValue();
        if (iIntValue == d9.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d9);
    }

    public static Long getNumberAsLong(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a long integer", obj, str));
            }
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a long integer", obj, str));
            }
        }
        Double d9 = (Double) obj;
        long jLongValue = d9.longValue();
        if (jLongValue == d9.doubleValue()) {
            return Long.valueOf(jLongValue);
        }
        throw new ClassCastException("Number expected to be long: " + d9);
    }

    public static Map<String, ?> getObject(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String getString(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long getStringAsDuration(Map<String, ?> map, String str) {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return Long.valueOf(c(string));
        } catch (ParseException e8) {
            throw new RuntimeException(e8);
        }
    }
}
