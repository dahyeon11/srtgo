package W0;

import android.graphics.Path;
import android.graphics.PointF;
import g1.C5534a;

/* loaded from: classes.dex */
public class i extends C5534a {

    /* renamed from: h, reason: collision with root package name */
    private Path f5266h;

    /* renamed from: i, reason: collision with root package name */
    private final C5534a f5267i;

    public i(T0.h hVar, C5534a c5534a) {
        super(hVar, (PointF) c5534a.startValue, (PointF) c5534a.endValue, c5534a.interpolator, c5534a.xInterpolator, c5534a.yInterpolator, c5534a.startFrame, c5534a.endFrame);
        this.f5267i = c5534a;
        createPath();
    }

    Path a() {
        return this.f5266h;
    }

    public void createPath() {
        Object obj;
        Object obj2;
        Object obj3 = this.endValue;
        boolean z8 = (obj3 == null || (obj2 = this.startValue) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.startValue;
        if (obj4 == null || (obj = this.endValue) == null || z8) {
            return;
        }
        C5534a c5534a = this.f5267i;
        this.f5266h = f1.j.createPath((PointF) obj4, (PointF) obj, c5534a.pathCp1, c5534a.pathCp2);
    }
}
