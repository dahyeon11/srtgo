package E;

import android.os.Build;
import z.C6562K;
import z.InterfaceC6565N;
import z.y0;

/* loaded from: classes.dex */
public final class c implements y0 {
    private static boolean a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean c() {
        return b() || a();
    }

    public boolean isSupported(InterfaceC6565N.a aVar) {
        return aVar != C6562K.OPTION_ROTATION;
    }
}
