package C6;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0012a f420a = b.getInstance();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f421b = true;

    /* renamed from: c, reason: collision with root package name */
    private static String f422c = "";

    /* renamed from: C6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0012a {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void setTagPrefix(String str);

        void v(String str, String str2);

        void w(String str, String str2);

        void write(int i8, String str, String str2);
    }

    public static void d(String str, String str2) {
        f420a.d(str, str2);
    }

    public static void e(String str, String str2) {
        f420a.e(str, str2);
    }

    public static void i(String str, String str2) {
        f420a.i(str, str2);
    }

    public static boolean isRealVersion() {
        return f421b;
    }

    public static void setAsRealVersion(boolean z8) {
        f421b = z8;
    }

    public static void setLogger(InterfaceC0012a interfaceC0012a) {
        f420a = interfaceC0012a;
    }

    public static void setTagPrefix(String str) {
        f422c = str;
        f420a.setTagPrefix(str);
    }

    public static void switchingToLogcat() {
        f420a = b.getInstance(f422c);
    }

    public static void switchingToNoLogging() {
        f420a = c.getInstance(f422c);
    }

    public static void v(String str, String str2) {
        f420a.v(str, str2);
    }

    public static void w(String str, String str2) {
        f420a.w(str, str2);
    }

    public static void write(int i8, String str, String str2) {
        f420a.write(i8, str, str2);
    }

    public static void write(Exception exc) {
        if (exc == null) {
            return;
        }
        e("Exception", exc.toString());
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            e("Exception", stackTraceElement.toString());
        }
    }
}
