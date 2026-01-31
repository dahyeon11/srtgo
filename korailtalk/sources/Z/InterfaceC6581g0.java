package z;

import android.view.Surface;
import androidx.camera.core.InterfaceC0902s0;
import java.util.concurrent.Executor;

/* renamed from: z.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6581g0 {

    /* renamed from: z.g0$a */
    public interface a {
        void onImageAvailable(InterfaceC6581g0 interfaceC6581g0);
    }

    InterfaceC0902s0 acquireLatestImage();

    InterfaceC0902s0 acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(a aVar, Executor executor);
}
