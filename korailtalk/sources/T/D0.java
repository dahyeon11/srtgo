package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import s.C6203b;
import t.y1;
import u.C6372C;

/* loaded from: classes.dex */
final class D0 implements y1.b {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;

    /* renamed from: a */
    private final C6372C f36393a;

    /* renamed from: c */
    private c.a f36395c;

    /* renamed from: b */
    private Rect f36394b = null;

    /* renamed from: d */
    private Rect f36396d = null;

    D0(C6372C c6372c) {
        this.f36393a = c6372c;
    }

    private static Rect a(Rect rect, float f8) {
        float fWidth = rect.width() / f8;
        float fHeight = rect.height() / f8;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    private Rect b() {
        return (Rect) Z.h.checkNotNull((Rect) this.f36393a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // t.y1.b
    public void addRequestOption(C6203b.a aVar) {
        Rect rect = this.f36394b;
        if (rect != null) {
            aVar.setCaptureRequestOption(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // t.y1.b
    public Rect getCropSensorRegion() {
        Rect rect = this.f36394b;
        return rect != null ? rect : b();
    }

    @Override // t.y1.b
    public float getMaxZoom() {
        Float f8 = (Float) this.f36393a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f8 == null) {
            return 1.0f;
        }
        return f8.floatValue() < getMinZoom() ? getMinZoom() : f8.floatValue();
    }

    @Override // t.y1.b
    public float getMinZoom() {
        return 1.0f;
    }

    @Override // t.y1.b
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.f36395c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f36396d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f36395c.set(null);
            this.f36395c = null;
            this.f36396d = null;
        }
    }

    @Override // t.y1.b
    public void resetZoom() {
        this.f36396d = null;
        this.f36394b = null;
        c.a aVar = this.f36395c;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
            this.f36395c = null;
        }
    }

    @Override // t.y1.b
    public void setZoomRatio(float f8, c.a aVar) {
        this.f36394b = a(b(), f8);
        c.a aVar2 = this.f36395c;
        if (aVar2 != null) {
            aVar2.setException(new InterfaceC0892n.a("There is a new zoomRatio being set"));
        }
        this.f36396d = this.f36394b;
        this.f36395c = aVar;
    }
}
