package z4;

import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.ReceiveSRTData;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: z4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6634h {
    private static int a(int i8, int i9, int i10) {
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1) - i8;
        return (i9 * 100) + i10 > ((calendar.get(2) + 1) * 100) + calendar.get(5) ? i11 - 1 : i11;
    }

    public static String addDay(String str, int i8) {
        return addDay(null, str, i8);
    }

    public static String addMonth(String str, int i8) {
        return addMonth(null, str, i8);
    }

    public static String addYear(String str, int i8) {
        return addYear(null, str, i8);
    }

    public static String convertFormat(String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        Date date;
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            date = new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = null;
        }
        return new SimpleDateFormat(str3).format(date);
    }

    public static String convertFormatTimeZone(String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("KDT"));
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = null;
        }
        return new SimpleDateFormat(str3).format(date);
    }

    public static int getAge() {
        String memberBirthDay = I4.h.getInstance().getMemberBirthDay();
        if (N.isNotNull(memberBirthDay)) {
            return a(N.getInteger(memberBirthDay.substring(0, 4)), N.getInteger(memberBirthDay.substring(4, 6)), N.getInteger(memberBirthDay.substring(6, 8)));
        }
        return -1;
    }

    public static Calendar getCalendarFromString(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        Date date;
        try {
            date = new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static CalendarData getCalendarInfo(Calendar calendar) {
        return new CalendarData(String.valueOf(calendar.get(1)), N.addZero(2, calendar.get(2) + 1), N.addZero(2, calendar.get(5)), N.addZero(2, calendar.get(11)), N.addZero(2, calendar.get(12)));
    }

    public static ArrayList<String> getCommutationBetweenDates(Calendar calendar, Calendar calendar2, int i8) {
        ArrayList<String> arrayList = new ArrayList<>();
        while (calendar.before(calendar2)) {
            arrayList.add(new SimpleDateFormat("yyyyMMdd").format(calendar.getTime()));
            calendar.add(5, 1);
        }
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    public static String getDate(CalendarData calendarData) {
        return calendarData.getYear() + calendarData.getMonth() + calendarData.getDate();
    }

    public static String[] getEnableDatesOneMonth(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(2, 1);
        ArrayList arrayList = new ArrayList();
        while (!calendar.after(calendar2)) {
            arrayList.add(getStringFromCalendar(calendar, "yyyyMMdd"));
            calendar.add(6, 1);
        }
        String[] strArr = new String[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            strArr[i8] = (String) arrayList.get(i8);
        }
        return strArr;
    }

    public static CalendarData getExternalAppDate(Bundle bundle) {
        if (C6630d.isNotNull(bundle)) {
            if (bundle.containsKey("data_from_SRT")) {
                return ((ReceiveSRTData) bundle.getSerializable("data_from_SRT")).getCalendarInfo();
            }
            if (bundle.containsKey("txtGoAbrdDt") && bundle.containsKey("txtGoHour")) {
                String string = bundle.getString("txtGoAbrdDt");
                String string2 = bundle.getString("txtGoHour");
                if (N.isNotNull(string) && N.isNotNull(string2)) {
                    return getCalendarInfo(getCalendarFromString(string + string2, "yyyyMMddHHmmss"));
                }
            }
        }
        return null;
    }

    public static String getHour(CalendarData calendarData) {
        return calendarData.getHour() + calendarData.getMinute() + "00";
    }

    public static String getNearestDate(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i8 = Calendar.getInstance().get(7);
        int i9 = 0;
        int iIntValue = N.intValue(str, 0);
        if (iIntValue > 0) {
            if (i8 > iIntValue) {
                i9 = (7 - i8) + iIntValue;
            } else if (i8 < iIntValue) {
                i9 = iIntValue - i8;
            }
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, i9);
        return new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }

    public static String[] getNextDate(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(str));
            calendar.add(5, 1);
            return new String[]{String.valueOf(calendar.get(1)) + N.addZero(2, calendar.get(2) + 1) + N.addZero(2, calendar.get(5)), "000000"};
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public static String[] getPreviousDate(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            Calendar calendar = Calendar.getInstance();
            String strAddZero = N.addZero(2, calendar.get(11));
            String strAddZero2 = N.addZero(2, calendar.get(12));
            calendar.setTime(simpleDateFormat.parse(str));
            calendar.add(5, -1);
            String[] strArr = new String[2];
            strArr[0] = String.valueOf(calendar.get(1)) + N.addZero(2, calendar.get(2) + 1) + N.addZero(2, calendar.get(5));
            if (isToday(calendar)) {
                strArr[1] = strAddZero + strAddZero2 + "00";
            } else {
                strArr[1] = "000000";
            }
            return strArr;
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return null;
        }
    }

    public static String getStringFromCalendar(Calendar calendar, String str) {
        return new SimpleDateFormat(str).format(calendar.getTime());
    }

    public static String getToday(String str) {
        return new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isAfter(java.lang.String r5, java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 0
            long r2 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> Ld
            long r0 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lb
            goto L27
        Lb:
            r5 = move-exception
            goto Lf
        Ld:
            r5 = move-exception
            r2 = r0
        Lf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = "NumberFormatException : "
            r6.append(r4)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            z4.t.e(r5)
        L27:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6634h.isAfter(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isBefore(java.lang.String r4, java.lang.String r5) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 0
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> Ld
            long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> Lb
            goto L16
        Lb:
            r4 = move-exception
            goto Lf
        Ld:
            r4 = move-exception
            r2 = r0
        Lf:
            java.lang.String r4 = r4.getMessage()
            z4.t.e(r4)
        L16:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6634h.isBefore(java.lang.String, java.lang.String):boolean");
    }

    public static boolean isDeparture(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return new Date().compareTo(new SimpleDateFormat("yyyyMMddHH:mm").parse(str)) >= 0;
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return false;
        }
    }

    public static boolean isEquals(Calendar calendar, Calendar calendar2, String str) {
        if (!C6630d.isNotNull(calendar) || !C6630d.isNotNull(calendar2)) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        return isEquals(simpleDateFormat.format(calendar.getTime()), simpleDateFormat.format(calendar2.getTime()));
    }

    public static boolean isInValidMonth(String str) {
        return isEquals(str, "00") || isAfter(str, "12");
    }

    public static boolean isInValidYear(String str) {
        return isBefore(str, getToday("yyyy"));
    }

    public static boolean isToday(Calendar calendar) {
        return isToday(new SimpleDateFormat("yyyyMMdd").format(calendar.getTime()));
    }

    public static String addDay(String str, String str2, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            Date date2 = C6630d.isNull(str) ? new Date() : simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date2);
            calendar.add(5, i8);
            date = calendar.getTime();
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static String addMonth(String str, String str2, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            Date date2 = C6630d.isNull(str) ? new Date() : simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date2);
            calendar.add(2, i8);
            date = calendar.getTime();
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static String addYear(String str, String str2, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            Date date2 = C6630d.isNull(str) ? new Date() : simpleDateFormat.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date2);
            calendar.add(1, i8);
            date = calendar.getTime();
        } catch (ParseException e8) {
            t.e(e8.getMessage());
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static boolean isToday(String str) {
        return isEquals(getToday("yyyyMMdd"), str);
    }

    public static CalendarData getToday() {
        return getCalendarInfo(Calendar.getInstance());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isEquals(java.lang.String r4, java.lang.String r5) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 0
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> Ld
            long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> Lb
            goto L16
        Lb:
            r4 = move-exception
            goto Lf
        Ld:
            r4 = move-exception
            r2 = r0
        Lf:
            java.lang.String r4 = r4.getMessage()
            z4.t.e(r4)
        L16:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6634h.isEquals(java.lang.String, java.lang.String):boolean");
    }
}
