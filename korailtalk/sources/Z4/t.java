package z4;

import android.app.Activity;
import android.widget.Toast;
import java.lang.reflect.InvocationTargetException;
import p4.C6054a;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f37906a = C6054a.IS_DEBUG_LOG;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Activity activity, String str) {
        Toast.makeText(activity, str, 0).show();
    }

    public static void d(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("d", str, str2);
        }
    }

    public static void e(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("e", str, str2);
        }
    }

    public static String getClassName(StackTraceElement[] stackTraceElementArr) {
        return stackTraceElementArr[4].getClassName().split("\\.")[r1.length - 1];
    }

    public static String getClassPackage(StackTraceElement[] stackTraceElementArr) {
        return stackTraceElementArr[4].getClassName();
    }

    public static int getLineNumber(StackTraceElement[] stackTraceElementArr) {
        return stackTraceElementArr[4].getLineNumber();
    }

    public static String getMethodName(StackTraceElement[] stackTraceElementArr) {
        return stackTraceElementArr[4].getMethodName();
    }

    public static String getTrace(StackTraceElement[] stackTraceElementArr) {
        return "[" + getClassPackage(stackTraceElementArr) + "][" + getClassName(stackTraceElementArr) + "][" + getMethodName(stackTraceElementArr) + "][" + getLineNumber(stackTraceElementArr) + "] ";
    }

    public static void i(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("i", str, str2);
        }
    }

    public static void logger(String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        try {
            Class.forName("android.util.Log").getMethod(str, String.class, String.class).invoke(null, str2, getTrace(stackTrace) + str3);
        } catch (Exception e8) {
            if (C6054a.IS_DEBUG_LOG) {
                e(e8.getMessage());
            }
        }
    }

    public static void t(final Activity activity, final String str) {
        if (f37906a) {
            activity.runOnUiThread(new Runnable() { // from class: z4.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.b(activity, str);
                }
            });
        }
    }

    public static void v(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("v", str, str2);
        }
    }

    public static void w(String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("w", str, str2);
        }
    }

    public static void d(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("d", "KorailTalk", str);
        }
    }

    public static void e(String str, String str2, Exception exc) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("e", str, str2);
        }
    }

    public static void i(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("i", "KorailTalk", str);
        }
    }

    public static void v(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("v", "KorailTalk", str);
        }
    }

    public static void w(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("w", "KorailTalk", str);
        }
    }

    public static void e(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (f37906a) {
            logger("e", "KorailTalk", str);
        }
    }
}
