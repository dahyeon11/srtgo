package t;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import z.C6562K;

/* loaded from: classes.dex */
interface A0 {
    void cancelIssuedCaptureRequests();

    void close();

    List<C6562K> getCaptureConfigs();

    z.C0 getSessionConfig();

    void issueCaptureRequests(List<C6562K> list);

    com.google.common.util.concurrent.C open(z.C0 c02, CameraDevice cameraDevice, o1 o1Var);

    com.google.common.util.concurrent.C release(boolean z8);

    void setSessionConfig(z.C0 c02);
}
