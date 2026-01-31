package x;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import s.C6203b;
import w.C6455a;
import z.z0;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6480a {

    /* renamed from: a, reason: collision with root package name */
    private final Range f37480a;

    public C6480a(z0 z0Var) {
        C6455a c6455a = (C6455a) z0Var.get(C6455a.class);
        if (c6455a == null) {
            this.f37480a = null;
        } else {
            this.f37480a = c6455a.getRange();
        }
    }

    public void addAeFpsRangeOptions(C6203b.a aVar) {
        Range range = this.f37480a;
        if (range != null) {
            aVar.setCaptureRequestOption(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
