package F;

import androidx.camera.core.InterfaceC0902s0;
import z.C6562K;

/* loaded from: classes.dex */
public class a {
    public boolean isRotationOptionSupported() {
        E.c cVar = (E.c) E.a.get(E.c.class);
        if (cVar != null) {
            return cVar.isSupported(C6562K.OPTION_ROTATION);
        }
        return true;
    }

    public boolean shouldUseExifOrientation(InterfaceC0902s0 interfaceC0902s0) {
        E.c cVar = (E.c) E.a.get(E.c.class);
        return (cVar == null || cVar.isSupported(C6562K.OPTION_ROTATION)) && interfaceC0902s0.getFormat() == 256;
    }
}
