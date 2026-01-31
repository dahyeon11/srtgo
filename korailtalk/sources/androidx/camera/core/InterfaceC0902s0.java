package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0902s0 extends AutoCloseable {

    /* renamed from: androidx.camera.core.s0$a */
    public interface a {
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    Rect getCropRect();

    int getFormat();

    int getHeight();

    Image getImage();

    InterfaceC0897p0 getImageInfo();

    a[] getPlanes();

    int getWidth();

    void setCropRect(Rect rect);
}
