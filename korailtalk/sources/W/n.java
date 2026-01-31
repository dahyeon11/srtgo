package w;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import z.y0;

/* loaded from: classes.dex */
public class n implements y0 {
    public static final List<String> BUILD_MODELS = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean a() {
        return BUILD_MODELS.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
