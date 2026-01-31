package a3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f5920a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f5921b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f5922c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f5923d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f5924e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f5925f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f5926g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f5927h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f5928i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f5929j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f5930k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f5931l = true;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final l f5932a = new l();
    }

    public interface b {
        void onCornerPathCreated(m mVar, Matrix matrix, int i8);

        void onEdgePathCreated(m mVar, Matrix matrix, int i8);
    }

    static final class c {
        public final RectF bounds;
        public final float interpolation;
        public final Path path;
        public final b pathListener;
        public final k shapeAppearanceModel;

        c(k kVar, float f8, RectF rectF, b bVar, Path path) {
            this.pathListener = bVar;
            this.shapeAppearanceModel = kVar;
            this.interpolation = f8;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public l() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.f5920a[i8] = new m();
            this.f5921b[i8] = new Matrix();
            this.f5922c[i8] = new Matrix();
        }
    }

    private float a(int i8) {
        return (i8 + 1) * 90;
    }

    private void b(c cVar, int i8) {
        this.f5927h[0] = this.f5920a[i8].i();
        this.f5927h[1] = this.f5920a[i8].j();
        this.f5921b[i8].mapPoints(this.f5927h);
        if (i8 == 0) {
            Path path = cVar.path;
            float[] fArr = this.f5927h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.path;
            float[] fArr2 = this.f5927h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f5920a[i8].applyToPath(this.f5921b[i8], cVar.path);
        b bVar = cVar.pathListener;
        if (bVar != null) {
            bVar.onCornerPathCreated(this.f5920a[i8], this.f5921b[i8], i8);
        }
    }

    private void c(c cVar, int i8) {
        int i9 = (i8 + 1) % 4;
        this.f5927h[0] = this.f5920a[i8].g();
        this.f5927h[1] = this.f5920a[i8].h();
        this.f5921b[i8].mapPoints(this.f5927h);
        this.f5928i[0] = this.f5920a[i9].i();
        this.f5928i[1] = this.f5920a[i9].j();
        this.f5921b[i9].mapPoints(this.f5928i);
        float f8 = this.f5927h[0];
        float[] fArr = this.f5928i;
        float fMax = Math.max(((float) Math.hypot(f8 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fG = g(cVar.bounds, i8);
        this.f5926g.reset(0.0f, 0.0f);
        f fVarH = h(i8, cVar.shapeAppearanceModel);
        fVarH.getEdgePath(fMax, fG, cVar.interpolation, this.f5926g);
        this.f5929j.reset();
        this.f5926g.applyToPath(this.f5922c[i8], this.f5929j);
        if (this.f5931l && (fVarH.a() || i(this.f5929j, i8) || i(this.f5929j, i9))) {
            Path path = this.f5929j;
            path.op(path, this.f5925f, Path.Op.DIFFERENCE);
            this.f5927h[0] = this.f5926g.i();
            this.f5927h[1] = this.f5926g.j();
            this.f5922c[i8].mapPoints(this.f5927h);
            Path path2 = this.f5924e;
            float[] fArr2 = this.f5927h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f5926g.applyToPath(this.f5922c[i8], this.f5924e);
        } else {
            this.f5926g.applyToPath(this.f5922c[i8], cVar.path);
        }
        b bVar = cVar.pathListener;
        if (bVar != null) {
            bVar.onEdgePathCreated(this.f5926g, this.f5922c[i8], i8);
        }
    }

    private void d(int i8, RectF rectF, PointF pointF) {
        if (i8 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i8 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i8 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private a3.c e(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.getTopRightCornerSize() : kVar.getTopLeftCornerSize() : kVar.getBottomLeftCornerSize() : kVar.getBottomRightCornerSize();
    }

    private d f(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.getTopRightCorner() : kVar.getTopLeftCorner() : kVar.getBottomLeftCorner() : kVar.getBottomRightCorner();
    }

    private float g(RectF rectF, int i8) {
        float[] fArr = this.f5927h;
        m mVar = this.f5920a[i8];
        fArr[0] = mVar.endX;
        fArr[1] = mVar.endY;
        this.f5921b[i8].mapPoints(fArr);
        return (i8 == 1 || i8 == 3) ? Math.abs(rectF.centerX() - this.f5927h[0]) : Math.abs(rectF.centerY() - this.f5927h[1]);
    }

    public static l getInstance() {
        return a.f5932a;
    }

    private f h(int i8, k kVar) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.getRightEdge() : kVar.getTopEdge() : kVar.getLeftEdge() : kVar.getBottomEdge();
    }

    private boolean i(Path path, int i8) {
        this.f5930k.reset();
        this.f5920a[i8].applyToPath(this.f5921b[i8], this.f5930k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5930k.computeBounds(rectF, true);
        path.op(this.f5930k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void j(c cVar, int i8) {
        f(i8, cVar.shapeAppearanceModel).getCornerPath(this.f5920a[i8], 90.0f, cVar.interpolation, cVar.bounds, e(i8, cVar.shapeAppearanceModel));
        float fA = a(i8);
        this.f5921b[i8].reset();
        d(i8, cVar.bounds, this.f5923d);
        Matrix matrix = this.f5921b[i8];
        PointF pointF = this.f5923d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f5921b[i8].preRotate(fA);
    }

    private void l(int i8) {
        this.f5927h[0] = this.f5920a[i8].g();
        this.f5927h[1] = this.f5920a[i8].h();
        this.f5921b[i8].mapPoints(this.f5927h);
        float fA = a(i8);
        this.f5922c[i8].reset();
        Matrix matrix = this.f5922c[i8];
        float[] fArr = this.f5927h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f5922c[i8].preRotate(fA);
    }

    public void calculatePath(k kVar, float f8, RectF rectF, Path path) {
        calculatePath(kVar, f8, rectF, null, path);
    }

    void k(boolean z8) {
        this.f5931l = z8;
    }

    public void calculatePath(k kVar, float f8, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f5924e.rewind();
        this.f5925f.rewind();
        this.f5925f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f8, rectF, bVar, path);
        for (int i8 = 0; i8 < 4; i8++) {
            j(cVar, i8);
            l(i8);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            b(cVar, i9);
            c(cVar, i9);
        }
        path.close();
        this.f5924e.close();
        if (this.f5924e.isEmpty()) {
            return;
        }
        path.op(this.f5924e, Path.Op.UNION);
    }
}
