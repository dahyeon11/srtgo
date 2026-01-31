package d1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import e1.AbstractC5342c;
import g1.C5534a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class t {

    /* renamed from: b, reason: collision with root package name */
    private static O.i f30022b;

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f30021a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static AbstractC5342c.a f30023c = AbstractC5342c.a.of("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static AbstractC5342c.a f30024d = AbstractC5342c.a.of("x", "y");

    private static WeakReference a(int i8) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().get(i8);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorCreate;
        pointF.x = f1.i.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = f1.i.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = f1.i.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = f1.i.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = f1.j.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference weakReferenceA = a(iHashFor);
        Interpolator interpolator = weakReferenceA != null ? (Interpolator) weakReferenceA.get() : null;
        if (weakReferenceA == null || interpolator == null) {
            try {
                interpolatorCreate = androidx.core.view.animation.a.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e8) {
                interpolatorCreate = "The Path cannot loop back on itself.".equals(e8.getMessage()) ? androidx.core.view.animation.a.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorCreate;
            try {
                h(iHashFor, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    static C5534a c(AbstractC5342c abstractC5342c, T0.h hVar, float f8, N n8, boolean z8, boolean z9) {
        return (z8 && z9) ? e(hVar, abstractC5342c, f8, n8) : z8 ? d(hVar, abstractC5342c, f8, n8) : f(abstractC5342c, f8, n8);
    }

    private static C5534a d(T0.h hVar, AbstractC5342c abstractC5342c, float f8, N n8) {
        Interpolator interpolatorB;
        Object obj;
        abstractC5342c.beginObject();
        PointF pointFE = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z8 = false;
        PointF pointFE4 = null;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f30023c)) {
                case 0:
                    fNextDouble = (float) abstractC5342c.nextDouble();
                    break;
                case 1:
                    obj3 = n8.parse(abstractC5342c, f8);
                    break;
                case 2:
                    obj2 = n8.parse(abstractC5342c, f8);
                    break;
                case 3:
                    pointFE = s.e(abstractC5342c, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(abstractC5342c, 1.0f);
                    break;
                case 5:
                    if (abstractC5342c.nextInt() != 1) {
                        z8 = false;
                        break;
                    } else {
                        z8 = true;
                        break;
                    }
                case 6:
                    pointFE2 = s.e(abstractC5342c, f8);
                    break;
                case 7:
                    pointFE3 = s.e(abstractC5342c, f8);
                    break;
                default:
                    abstractC5342c.skipValue();
                    break;
            }
        }
        abstractC5342c.endObject();
        if (z8) {
            interpolatorB = f30021a;
            obj = obj3;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f30021a : b(pointFE, pointFE4);
            obj = obj2;
        }
        C5534a c5534a = new C5534a(hVar, obj3, obj, interpolatorB, fNextDouble, null);
        c5534a.pathCp1 = pointFE2;
        c5534a.pathCp2 = pointFE3;
        return c5534a;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static g1.C5534a e(T0.h r21, e1.AbstractC5342c r22, float r23, d1.N r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.t.e(T0.h, e1.c, float, d1.N):g1.a");
    }

    private static C5534a f(AbstractC5342c abstractC5342c, float f8, N n8) {
        return new C5534a(n8.parse(abstractC5342c, f8));
    }

    private static O.i g() {
        if (f30022b == null) {
            f30022b = new O.i();
        }
        return f30022b;
    }

    private static void h(int i8, WeakReference weakReference) {
        synchronized (t.class) {
            f30022b.put(i8, weakReference);
        }
    }
}
