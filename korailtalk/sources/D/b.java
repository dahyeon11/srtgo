package D;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
abstract class b {
    static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static ImageWriter c(Surface surface, int i8) {
        return ImageWriter.newInstance(surface, i8);
    }

    static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
