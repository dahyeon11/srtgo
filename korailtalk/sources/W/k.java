package w;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.B0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.y0;

/* loaded from: classes.dex */
public class k implements y0 {
    private List a(String str, int i8) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i8 == 34 || i8 == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    private List b(String str, int i8) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i8 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List c(String str, int i8) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i8 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private static boolean d() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean e() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    static boolean g() {
        return e() || f() || d();
    }

    public List<Size> getExcludedSizes(String str, int i8) {
        if (e()) {
            return b(str, i8);
        }
        if (f()) {
            return c(str, i8);
        }
        if (d()) {
            return a(str, i8);
        }
        B0.w("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
