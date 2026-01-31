package x;

import android.hardware.camera2.CaptureRequest;
import s.C6203b;

/* loaded from: classes.dex */
public class g {
    public void toggleHDRPlus(int i8, C6203b.a aVar) {
        if (((w.n) w.i.get(w.n.class)) == null) {
            return;
        }
        if (i8 == 0) {
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i8 != 1) {
                return;
            }
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
