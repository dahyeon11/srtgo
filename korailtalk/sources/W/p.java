package w;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import u.C6372C;

/* loaded from: classes.dex */
public final class p implements E.e {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f37370a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    static boolean a(C6372C c6372c) {
        return f37370a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
