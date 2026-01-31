package x;

import android.hardware.camera2.CaptureRequest;
import java.util.Iterator;
import java.util.List;
import w.t;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37490a;

    public m() {
        this.f37490a = ((t) w.i.get(t.class)) != null;
    }

    public boolean shouldStopRepeatingBeforeCapture(List<CaptureRequest> list, boolean z8) {
        if (this.f37490a && z8) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
