package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.h;

/* renamed from: androidx.camera.core.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0897p0 {
    int getRotationDegrees();

    default Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    z.J0 getTagBundle();

    long getTimestamp();

    void populateExifData(h.b bVar);
}
