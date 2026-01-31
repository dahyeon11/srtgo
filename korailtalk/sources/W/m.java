package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import u.C6372C;

/* loaded from: classes.dex */
public class m implements u {

    /* renamed from: a, reason: collision with root package name */
    private static final List f37369a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    static boolean a(C6372C c6372c) {
        return f37369a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) c6372c.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
