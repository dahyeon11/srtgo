package D;

import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
abstract class d {
    static ImageWriter a(Surface surface, int i8, int i9) {
        return ImageWriter.newInstance(surface, i8, i9);
    }
}
