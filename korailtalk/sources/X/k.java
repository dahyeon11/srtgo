package x;

import android.hardware.camera2.CaptureRequest;
import s.C6203b;
import w.r;
import z.C0;

/* loaded from: classes.dex */
public abstract class k {
    public static void setHDRnet(C0.b bVar) {
        if (((r) w.i.get(r.class)) == null) {
            return;
        }
        C6203b.a aVar = new C6203b.a();
        aVar.setCaptureRequestOption(CaptureRequest.TONEMAP_MODE, 2);
        bVar.addImplementationOptions(aVar.build());
    }
}
