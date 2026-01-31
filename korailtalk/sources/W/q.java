package w;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import z.y0;

/* loaded from: classes.dex */
public class q implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f37371a = Arrays.asList("NEXUS 4");

    static boolean a() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
