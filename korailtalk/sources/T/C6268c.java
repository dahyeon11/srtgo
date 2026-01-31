package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.InterfaceC0892n;
import androidx.concurrent.futures.c;
import s.C6203b;
import t.y1;
import u.C6372C;

/* renamed from: t.c */
/* loaded from: classes.dex */
final class C6268c implements y1.b {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;

    /* renamed from: a */
    private final C6372C f36629a;

    /* renamed from: b */
    private final Range f36630b;

    /* renamed from: d */
    private c.a f36632d;

    /* renamed from: c */
    private float f36631c = 1.0f;

    /* renamed from: e */
    private float f36633e = 1.0f;

    C6268c(C6372C c6372c) {
        this.f36629a = c6372c;
        this.f36630b = (Range) c6372c.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // t.y1.b
    public void addRequestOption(C6203b.a aVar) {
        aVar.setCaptureRequestOption(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f36631c));
    }

    @Override // t.y1.b
    public Rect getCropSensorRegion() {
        return (Rect) Z.h.checkNotNull((Rect) this.f36629a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // t.y1.b
    public float getMaxZoom() {
        return ((Float) this.f36630b.getUpper()).floatValue();
    }

    @Override // t.y1.b
    public float getMinZoom() {
        return ((Float) this.f36630b.getLower()).floatValue();
    }

    @Override // t.y1.b
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.f36632d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f8 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f8 == null) {
                return;
            }
            if (this.f36633e == f8.floatValue()) {
                this.f36632d.set(null);
                this.f36632d = null;
            }
        }
    }

    @Override // t.y1.b
    public void resetZoom() {
        this.f36631c = 1.0f;
        c.a aVar = this.f36632d;
        if (aVar != null) {
            aVar.setException(new InterfaceC0892n.a("Camera is not active."));
            this.f36632d = null;
        }
    }

    @Override // t.y1.b
    public void setZoomRatio(float f8, c.a aVar) {
        this.f36631c = f8;
        c.a aVar2 = this.f36632d;
        if (aVar2 != null) {
            aVar2.setException(new InterfaceC0892n.a("There is a new zoomRatio being set"));
        }
        this.f36633e = this.f36631c;
        this.f36632d = aVar;
    }
}
