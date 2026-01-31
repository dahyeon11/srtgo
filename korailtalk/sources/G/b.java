package G;

import android.util.Size;
import androidx.camera.core.impl.utils.c;
import z.InterfaceC6577e0;
import z.N0;

/* loaded from: classes.dex */
public abstract class b {
    public static void updateTargetRotationAndRelatedConfigs(N0.a aVar, int i8) {
        Size targetResolution;
        InterfaceC6577e0 interfaceC6577e0 = (InterfaceC6577e0) aVar.getUseCaseConfig();
        int targetRotation = interfaceC6577e0.getTargetRotation(-1);
        if (targetRotation == -1 || targetRotation != i8) {
            ((InterfaceC6577e0.a) aVar).setTargetRotation(i8);
        }
        if (targetRotation == -1 || i8 == -1 || targetRotation == i8) {
            return;
        }
        if (Math.abs(c.surfaceRotationToDegrees(i8) - c.surfaceRotationToDegrees(targetRotation)) % 180 != 90 || (targetResolution = interfaceC6577e0.getTargetResolution(null)) == null) {
            return;
        }
        ((InterfaceC6577e0.a) aVar).setTargetResolution(new Size(targetResolution.getHeight(), targetResolution.getWidth()));
    }
}
