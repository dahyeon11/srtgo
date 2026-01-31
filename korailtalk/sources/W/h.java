package w;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.y0;

/* loaded from: classes.dex */
public class h implements y0 {

    /* renamed from: a, reason: collision with root package name */
    static final List f37364a = Arrays.asList("SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X");

    static boolean a() {
        return f37364a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
