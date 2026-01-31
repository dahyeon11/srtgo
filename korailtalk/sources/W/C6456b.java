package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import u.C6372C;
import z.y0;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6456b implements y0 {
    static boolean a(C6372C c6372c) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) c6372c.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
