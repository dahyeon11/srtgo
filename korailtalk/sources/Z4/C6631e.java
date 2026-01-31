package z4;

import android.text.TextUtils;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.network.dao.schedule.TrainCalendarDao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: z4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6631e {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f37885a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f37886b;

    /* renamed from: c, reason: collision with root package name */
    private static String[] f37887c;

    /* renamed from: d, reason: collision with root package name */
    private static String[] f37888d;

    /* renamed from: e, reason: collision with root package name */
    private static String[] f37889e;

    /* renamed from: f, reason: collision with root package name */
    private static String[] f37890f;

    /* renamed from: g, reason: collision with root package name */
    private static String[] f37891g;

    /* renamed from: h, reason: collision with root package name */
    private static String[] f37892h;

    /* renamed from: i, reason: collision with root package name */
    private static String[] f37893i;

    /* renamed from: j, reason: collision with root package name */
    private static AvailableDates f37894j;

    /* renamed from: k, reason: collision with root package name */
    private static AvailableDates f37895k;

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(java.util.List r6) {
        /*
            r0 = 1
            r1 = r0
        L2:
            if (r1 == 0) goto L37
            r1 = 0
            r2 = r1
        L6:
            int r3 = r1 + 1
            int r4 = r6.size()
            if (r3 >= r4) goto L35
            java.lang.Object r4 = r6.get(r1)
            com.korail.talk.network.dao.schedule.TrainCalendarDao$TrainCalendarResponse$RunningCalendar r4 = (com.korail.talk.network.dao.schedule.TrainCalendarDao.TrainCalendarResponse.RunningCalendar) r4
            java.lang.Object r5 = r6.get(r3)
            com.korail.talk.network.dao.schedule.TrainCalendarDao$TrainCalendarResponse$RunningCalendar r5 = (com.korail.talk.network.dao.schedule.TrainCalendarDao.TrainCalendarResponse.RunningCalendar) r5
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L33
            java.lang.Object r2 = r6.get(r1)
            com.korail.talk.network.dao.schedule.TrainCalendarDao$TrainCalendarResponse$RunningCalendar r2 = (com.korail.talk.network.dao.schedule.TrainCalendarDao.TrainCalendarResponse.RunningCalendar) r2
            java.lang.Object r4 = r6.get(r3)
            com.korail.talk.network.dao.schedule.TrainCalendarDao$TrainCalendarResponse$RunningCalendar r4 = (com.korail.talk.network.dao.schedule.TrainCalendarDao.TrainCalendarResponse.RunningCalendar) r4
            r6.set(r1, r4)
            r6.set(r3, r2)
            r2 = r0
        L33:
            r1 = r3
            goto L6
        L35:
            r1 = r2
            goto L2
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C6631e.a(java.util.List):void");
    }

    public static String[] getNormalDateStrArray() {
        if (C6630d.isNull(f37885a) || f37885a.length == 0) {
            t.e("Server did not give valid calendar!!");
            f37885a = C6634h.getEnableDatesOneMonth(Calendar.getInstance());
        }
        return f37885a;
    }

    public static String[] getTrainDateListByJobDvCode(String str) {
        t.e("jobDvCode : " + str);
        String[] strArr = "OTRN".equals(str) ? f37887c : "VTRN".equals(str) ? f37888d : "STRN".equals(str) ? f37889e : "DTRN".equals(str) ? f37890f : "ATRN".equals(str) ? f37891g : "GTRN".equals(str) ? f37892h : "XTRN".equals(str) ? f37893i : null;
        if (!C6630d.isNull(strArr) && strArr.length != 0) {
            return strArr;
        }
        t.e("Server did not give valid calendar!!");
        return getNormalDateStrArray();
    }

    public static boolean isHoliday(Calendar calendar) {
        if (C6630d.isNull(f37894j) || f37894j.isEmpty()) {
            return false;
        }
        return f37894j.isAvailableDate(calendar);
    }

    public static boolean isPeakSeason(Calendar calendar) {
        if (C6630d.isNull(f37895k) || f37894j.isEmpty()) {
            return false;
        }
        return f37895k.isAvailableDate(calendar);
    }

    public static void makeAvailableDatesFactory(List<TrainCalendarDao.TrainCalendarResponse.RunningCalendar> list) {
        if (C6630d.isNull(list) || list.size() <= 0) {
            t.e("Server did not give valid calendar!!");
            return;
        }
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        for (TrainCalendarDao.TrainCalendarResponse.RunningCalendar runningCalendar : list) {
            String dateStr = runningCalendar.getDateStr();
            if (runningCalendar.isHoliday()) {
                arrayList9.add(dateStr);
            }
            if (runningCalendar.isPeakSeason()) {
                arrayList10.add(dateStr);
            }
            if (runningCalendar.isForSaleDate() && !TextUtils.isEmpty(dateStr)) {
                arrayList.add(dateStr);
                if (runningCalendar.isOTrainAvailable()) {
                    arrayList2.add(dateStr);
                }
                if (runningCalendar.isVTrainAvailable()) {
                    arrayList3.add(dateStr);
                }
                if (runningCalendar.isSTrainAvailable()) {
                    arrayList4.add(dateStr);
                }
                if (runningCalendar.isDMZTrainAvailable()) {
                    arrayList5.add(dateStr);
                }
                if (runningCalendar.isATrainAvailable()) {
                    arrayList6.add(dateStr);
                }
                if (runningCalendar.isGTrainAvailable()) {
                    arrayList7.add(dateStr);
                }
                if (runningCalendar.isXTrainAvailable()) {
                    arrayList8.add(dateStr);
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        f37885a = strArr;
        arrayList.toArray(strArr);
        String[] strArr2 = new String[arrayList2.size()];
        f37887c = strArr2;
        arrayList2.toArray(strArr2);
        String[] strArr3 = new String[arrayList3.size()];
        f37888d = strArr3;
        arrayList3.toArray(strArr3);
        String[] strArr4 = new String[arrayList4.size()];
        f37889e = strArr4;
        arrayList4.toArray(strArr4);
        String[] strArr5 = new String[arrayList5.size()];
        f37890f = strArr5;
        arrayList5.toArray(strArr5);
        String[] strArr6 = new String[arrayList6.size()];
        f37891g = strArr6;
        arrayList6.toArray(strArr6);
        String[] strArr7 = new String[arrayList7.size()];
        f37892h = strArr7;
        arrayList7.toArray(strArr7);
        String[] strArr8 = new String[arrayList8.size()];
        f37893i = strArr8;
        arrayList8.toArray(strArr8);
        String[] strArr9 = new String[arrayList9.size()];
        arrayList9.toArray(strArr9);
        f37894j = new AvailableDates(strArr9, false);
        String[] strArr10 = new String[arrayList10.size()];
        arrayList10.toArray(strArr10);
        f37895k = new AvailableDates(strArr10, false);
    }

    public static boolean isPeakSeason(CalendarData calendarData) {
        return isPeakSeason(C6634h.getCalendarFromString(calendarData.getYear() + calendarData.getMonth() + calendarData.getDate(), "yyyyMMdd"));
    }

    public static String[] getNormalDateStrArray(int i8) {
        String[] normalDateStrArray = getNormalDateStrArray();
        f37886b = normalDateStrArray;
        String[] strArr = new String[normalDateStrArray.length - i8];
        int i9 = 0;
        while (true) {
            String[] strArr2 = f37886b;
            if (i8 >= strArr2.length) {
                return strArr;
            }
            strArr[i9] = strArr2[i8];
            i9++;
            i8++;
        }
    }

    public static String[] getNormalDateStrArray(String str) {
        f37886b = getNormalDateStrArray();
        ArrayList arrayList = new ArrayList();
        for (String str2 : f37886b) {
            if (C6634h.isEquals(str, str2) || C6634h.isAfter(str2, str)) {
                arrayList.add(str2);
            }
        }
        return C6625A.toArray(arrayList);
    }
}
