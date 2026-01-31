package L;

import android.os.Build;
import z.y0;

/* loaded from: classes.dex */
public class d implements y0 {
    static boolean a() {
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    static boolean b() {
        return "SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER) && a();
    }
}
