package z;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class I0 {
    I0() {
    }

    public static I0 create(Size size, Size size2, Size size3) {
        return new C6580g(size, size2, size3);
    }

    public abstract Size getAnalysisSize();

    public abstract Size getPreviewSize();

    public abstract Size getRecordSize();
}
