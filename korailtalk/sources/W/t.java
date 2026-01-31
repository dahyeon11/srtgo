package w;

import android.os.Build;
import java.util.Locale;
import z.y0;

/* loaded from: classes.dex */
public class t implements y0 {
    static boolean a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
