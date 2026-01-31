package k4;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private SurfaceHolder f33633a;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f33634b;

    public l(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f33633a = surfaceHolder;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f33633a;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.f33634b;
    }

    public void setPreview(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f33633a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f33634b);
        }
    }

    public l(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f33634b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
