package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class R0 {
    R0() {
    }

    static R0 a(Size size, Rect rect, int i8) {
        return new C0882i(size, rect, i8);
    }

    public abstract Rect getCropRect();

    public abstract Size getResolution();

    public abstract int getRotationDegrees();
}
