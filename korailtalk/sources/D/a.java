package D;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract class a {
    public static void close(ImageWriter imageWriter) {
        b.a(imageWriter);
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return b.b(imageWriter);
    }

    public static ImageWriter newInstance(Surface surface, int i8, int i9) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return d.a(surface, i8, i9);
        }
        if (i10 >= 26) {
            return c.a(surface, i8, i9);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i10 + ". Version 26 or higher required.");
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        b.d(imageWriter, image);
    }

    public static ImageWriter newInstance(Surface surface, int i8) {
        return b.c(surface, i8);
    }
}
