package K;

import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface g {
    List<e> getOutputConfigs();

    Map<CaptureRequest.Key<?>, Object> getSessionParameters();

    int getSessionTemplateId();
}
