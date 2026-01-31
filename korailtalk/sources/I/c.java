package I;

import android.os.Build;
import z.y0;

/* loaded from: classes.dex */
public class c implements y0 {
    private static boolean a() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    static boolean b() {
        return a();
    }

    public boolean shouldDisableExtension(boolean z8) {
        return !z8 && a();
    }
}
