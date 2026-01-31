package D;

import Z.h;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static Method f716a;

    static {
        try {
            Class cls = Integer.TYPE;
            f716a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException unused) {
        }
    }

    static ImageWriter a(Surface surface, int i8, int i9) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) h.checkNotNull(f716a.invoke(null, surface, Integer.valueOf(i8), Integer.valueOf(i9)));
            } catch (IllegalAccessException | InvocationTargetException e8) {
                th = e8;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
