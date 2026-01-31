package t;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
import z.AbstractC6586j;

/* renamed from: t.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6306v0 {
    static CameraCaptureSession.CaptureCallback a(AbstractC6586j abstractC6586j) {
        if (abstractC6586j == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC6586j, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : T.a(arrayList);
    }

    static void b(AbstractC6586j abstractC6586j, List list) {
        if (abstractC6586j instanceof C6304u0) {
            list.add(((C6304u0) abstractC6586j).b());
        } else {
            list.add(new C6302t0(abstractC6586j));
        }
    }
}
