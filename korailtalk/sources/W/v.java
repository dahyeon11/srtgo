package w;

import android.os.Build;
import u.C6372C;

/* loaded from: classes.dex */
public final class v implements E.d {
    private static boolean a() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean b() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean c() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    static boolean d(C6372C c6372c) {
        return a() || b() || c();
    }
}
