package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class g {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    static class a {
        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    static class b {
        static int a(AppOpsManager appOpsManager, String str, int i8, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i8, str2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int checkOrNoteProxyOp(Context context, int i8, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return noteProxyOpNoThrow(context, str, str2);
        }
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i8, b.b(context));
    }

    public static int noteOp(Context context, String str, int i8, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i8, str2);
    }

    public static int noteOpNoThrow(Context context, String str, int i8, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i8, str2);
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        return a.c((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static String permissionToOp(String str) {
        return a.d(str);
    }
}
