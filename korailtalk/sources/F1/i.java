package f1;

import V0.k;
import a1.n;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f30519a = new PointF();

    private static int a(int i8, int i9) {
        int i10 = i8 / i9;
        return (((i8 ^ i9) >= 0) || i8 % i9 == 0) ? i10 : i10 - 1;
    }

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    static int b(float f8, float f9) {
        return c((int) f8, (int) f9);
    }

    private static int c(int i8, int i9) {
        return i8 - (i9 * a(i8, i9));
    }

    public static int clamp(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i10, i8));
    }

    public static boolean contains(float f8, float f9, float f10) {
        return f8 >= f9 && f8 <= f10;
    }

    public static void getPathFromData(n nVar, Path path) {
        path.reset();
        PointF initialPoint = nVar.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        f30519a.set(initialPoint.x, initialPoint.y);
        for (int i8 = 0; i8 < nVar.getCurves().size(); i8++) {
            Y0.a aVar = nVar.getCurves().get(i8);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            PointF pointF = f30519a;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
            } else {
                path.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
        }
        if (nVar.isClosed()) {
            path.close();
        }
    }

    public static float lerp(float f8, float f9, float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    public static void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2, k kVar) {
        if (eVar.fullyResolvesTo(kVar.getName(), i8)) {
            list.add(eVar2.addKey(kVar.getName()).resolve(kVar));
        }
    }

    public static float clamp(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f8));
    }

    public static double lerp(double d9, double d10, double d11) {
        return d9 + (d11 * (d10 - d9));
    }

    public static double clamp(double d9, double d10, double d11) {
        return Math.max(d10, Math.min(d11, d9));
    }

    public static int lerp(int i8, int i9, float f8) {
        return (int) (i8 + (f8 * (i9 - i8)));
    }
}
