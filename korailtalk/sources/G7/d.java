package G7;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class d {
    public static final long MAX_DATE = 253402300799999L;

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1493a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f1494b;

    /* renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f1495c;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(D7.e.UTC);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f1494b = strArr;
        f1495c = new DateFormat[strArr.length];
    }

    public static String format(Date date) {
        return ((DateFormat) f1493a.get()).format(date);
    }

    public static Date parse(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f1493a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f1494b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    DateFormat[] dateFormatArr = f1495c;
                    DateFormat simpleDateFormat = dateFormatArr[i8];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f1494b[i8], Locale.US);
                        simpleDateFormat.setTimeZone(D7.e.UTC);
                        dateFormatArr[i8] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
