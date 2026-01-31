package z;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract class w0 {
    public static w0 create(Surface surface, Size size, int i8) {
        return new C6576e(surface, size, i8);
    }

    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract Surface getSurface();
}
