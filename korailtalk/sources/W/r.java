package w;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.y0;

/* loaded from: classes.dex */
public class r implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f37372a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f37372a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
