package w;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import z.H0;
import z.y0;

/* loaded from: classes.dex */
public class s implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f37373a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610M");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37374a;

        static {
            int[] iArr = new int[H0.b.values().length];
            f37374a = iArr;
            try {
                iArr[H0.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37374a[H0.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37374a[H0.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static boolean a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f37373a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    static boolean b() {
        return a();
    }

    public Size selectResolution(H0.b bVar) {
        if (!a()) {
            return null;
        }
        int i8 = a.f37374a[bVar.ordinal()];
        if (i8 == 1) {
            return new Size(1920, 1080);
        }
        if (i8 == 2) {
            return new Size(1280, 720);
        }
        if (i8 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
