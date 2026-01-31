package L;

import android.os.Build;
import z.y0;

/* loaded from: classes.dex */
public class c implements y0 {
    static boolean a() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
