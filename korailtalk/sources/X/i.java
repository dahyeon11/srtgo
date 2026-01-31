package x;

import android.graphics.PointF;
import androidx.camera.core.F0;
import w.C6456b;
import z.z0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final z0 f37486a;

    public i(z0 z0Var) {
        this.f37486a = z0Var;
    }

    public PointF getCorrectedPoint(F0 f02, int i8) {
        return (i8 == 1 && this.f37486a.contains(C6456b.class)) ? new PointF(1.0f - f02.getX(), f02.getY()) : new PointF(f02.getX(), f02.getY());
    }
}
