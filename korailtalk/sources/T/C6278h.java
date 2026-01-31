package t;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.utils.h;
import z.EnumC6590l;
import z.EnumC6592m;
import z.EnumC6594n;
import z.EnumC6596o;
import z.EnumC6598p;
import z.InterfaceC6600q;

/* renamed from: t.h */
/* loaded from: classes.dex */
public class C6278h implements InterfaceC6600q {

    /* renamed from: a */
    private final z.J0 f36679a;

    /* renamed from: b */
    private final CaptureResult f36680b;

    public C6278h(z.J0 j02, CaptureResult captureResult) {
        this.f36679a = j02;
        this.f36680b = captureResult;
    }

    @Override // z.InterfaceC6600q
    public EnumC6590l getAeState() {
        Integer num = (Integer) this.f36680b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC6590l.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6590l.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC6590l.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC6590l.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC6590l.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                androidx.camera.core.B0.e("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC6590l.UNKNOWN;
            }
        }
        return EnumC6590l.SEARCHING;
    }

    @Override // z.InterfaceC6600q
    public EnumC6592m getAfMode() {
        Integer num = (Integer) this.f36680b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC6592m.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC6592m.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC6592m.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                androidx.camera.core.B0.e("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC6592m.UNKNOWN;
            }
        }
        return EnumC6592m.OFF;
    }

    @Override // z.InterfaceC6600q
    public EnumC6594n getAfState() {
        Integer num = (Integer) this.f36680b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC6594n.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                androidx.camera.core.B0.e("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC6594n.UNKNOWN;
    }

    @Override // z.InterfaceC6600q
    public EnumC6596o getAwbState() {
        Integer num = (Integer) this.f36680b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC6596o.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC6596o.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC6596o.METERING;
        }
        if (iIntValue == 2) {
            return EnumC6596o.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC6596o.LOCKED;
        }
        androidx.camera.core.B0.e("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC6596o.UNKNOWN;
    }

    public CaptureResult getCaptureResult() {
        return this.f36680b;
    }

    @Override // z.InterfaceC6600q
    public EnumC6598p getFlashState() {
        Integer num = (Integer) this.f36680b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC6598p.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC6598p.NONE;
        }
        if (iIntValue == 2) {
            return EnumC6598p.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC6598p.FIRED;
        }
        androidx.camera.core.B0.e("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC6598p.UNKNOWN;
    }

    @Override // z.InterfaceC6600q
    public z.J0 getTagBundle() {
        return this.f36679a;
    }

    @Override // z.InterfaceC6600q
    public long getTimestamp() {
        Long l8 = (Long) this.f36680b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    @Override // z.InterfaceC6600q
    public void populateExifData(h.b bVar) {
        super.populateExifData(bVar);
        Rect rect = (Rect) this.f36680b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.setImageWidth(rect.width()).setImageHeight(rect.height());
        }
        Integer num = (Integer) this.f36680b.get(CaptureResult.JPEG_ORIENTATION);
        if (num != null) {
            bVar.setOrientationDegrees(num.intValue());
        }
        Long l8 = (Long) this.f36680b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l8 != null) {
            bVar.setExposureTimeNanos(l8.longValue());
        }
        Float f8 = (Float) this.f36680b.get(CaptureResult.LENS_APERTURE);
        if (f8 != null) {
            bVar.setLensFNumber(f8.floatValue());
        }
        Integer numValueOf = (Integer) this.f36680b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f36680b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.setIso(numValueOf.intValue());
        }
        Float f9 = (Float) this.f36680b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f9 != null) {
            bVar.setFocalLength(f9.floatValue());
        }
        Integer num2 = (Integer) this.f36680b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            h.c cVar = h.c.AUTO;
            if (num2.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.setWhiteBalanceMode(cVar);
        }
    }

    public C6278h(CaptureResult captureResult) {
        this(z.J0.emptyBundle(), captureResult);
    }
}
