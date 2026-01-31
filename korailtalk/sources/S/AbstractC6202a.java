package s;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import t.C6276g;
import t.C6278h;
import z.C6588k;
import z.InterfaceC6600q;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6202a {
    public static CaptureFailure getCaptureFailure(C6588k c6588k) {
        if (c6588k instanceof C6276g) {
            return ((C6276g) c6588k).getCaptureFailure();
        }
        return null;
    }

    public static CaptureResult getCaptureResult(InterfaceC6600q interfaceC6600q) {
        if (interfaceC6600q instanceof C6278h) {
            return ((C6278h) interfaceC6600q).getCaptureResult();
        }
        return null;
    }
}
