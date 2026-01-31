package a3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final List f5933a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f5934b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f5935c;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    class a extends i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5936b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f5937c;

        a(List list, Matrix matrix) {
            this.f5936b = list;
            this.f5937c = matrix;
        }

        @Override // a3.m.i
        public void draw(Matrix matrix, Z2.a aVar, int i8, Canvas canvas) {
            Iterator it = this.f5936b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).draw(this.f5937c, aVar, i8, canvas);
            }
        }
    }

    static class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final d f5939b;

        public b(d dVar) {
            this.f5939b = dVar;
        }

        @Override // a3.m.i
        public void draw(Matrix matrix, Z2.a aVar, int i8, Canvas canvas) {
            aVar.drawCornerShadow(canvas, matrix, new RectF(this.f5939b.j(), this.f5939b.n(), this.f5939b.k(), this.f5939b.i()), i8, this.f5939b.l(), this.f5939b.m());
        }
    }

    static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final f f5940b;

        /* renamed from: c, reason: collision with root package name */
        private final float f5941c;

        /* renamed from: d, reason: collision with root package name */
        private final float f5942d;

        public c(f fVar, float f8, float f9) {
            this.f5940b = fVar;
            this.f5941c = f8;
            this.f5942d = f9;
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.f5940b.f5951c - this.f5942d) / (this.f5940b.f5950b - this.f5941c)));
        }

        @Override // a3.m.i
        public void draw(Matrix matrix, Z2.a aVar, int i8, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f5940b.f5951c - this.f5942d, this.f5940b.f5950b - this.f5941c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f5941c, this.f5942d);
            matrix2.preRotate(a());
            aVar.drawEdgeShadow(canvas, matrix2, rectF, i8);
        }
    }

    public static class d extends g {

        /* renamed from: b, reason: collision with root package name */
        private static final RectF f5943b = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public d(float f8, float f9, float f10, float f11) {
            p(f8);
            t(f9);
            q(f10);
            o(f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float i() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.top;
        }

        private void o(float f8) {
            this.bottom = f8;
        }

        private void p(float f8) {
            this.left = f8;
        }

        private void q(float f8) {
            this.right = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(float f8) {
            this.startAngle = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f8) {
            this.sweepAngle = f8;
        }

        private void t(float f8) {
            this.top = f8;
        }

        @Override // a3.m.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5952a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5943b;
            rectF.set(j(), n(), k(), i());
            path.arcTo(rectF, l(), m(), false);
            path.transform(matrix);
        }
    }

    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f5944b;

        /* renamed from: c, reason: collision with root package name */
        private float f5945c;

        /* renamed from: d, reason: collision with root package name */
        private float f5946d;

        /* renamed from: e, reason: collision with root package name */
        private float f5947e;

        /* renamed from: f, reason: collision with root package name */
        private float f5948f;

        /* renamed from: g, reason: collision with root package name */
        private float f5949g;

        public e(float f8, float f9, float f10, float f11, float f12, float f13) {
            a(f8);
            c(f9);
            b(f10);
            d(f11);
            e(f12);
            f(f13);
        }

        private void a(float f8) {
            this.f5944b = f8;
        }

        private void b(float f8) {
            this.f5946d = f8;
        }

        private void c(float f8) {
            this.f5945c = f8;
        }

        private void d(float f8) {
            this.f5947e = f8;
        }

        private void e(float f8) {
            this.f5948f = f8;
        }

        private void f(float f8) {
            this.f5949g = f8;
        }

        @Override // a3.m.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5952a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f5944b, this.f5945c, this.f5946d, this.f5947e, this.f5948f, this.f5949g);
            path.transform(matrix);
        }
    }

    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f5950b;

        /* renamed from: c, reason: collision with root package name */
        private float f5951c;

        @Override // a3.m.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5952a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5950b, this.f5951c);
            path.transform(matrix);
        }
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f5952a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class h extends g {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float e() {
            return this.controlX;
        }

        private float f() {
            return this.controlY;
        }

        private float g() {
            return this.endX;
        }

        private float h() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(float f8) {
            this.controlX = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f8) {
            this.controlY = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f8) {
            this.endX = f8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f8) {
            this.endY = f8;
        }

        @Override // a3.m.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5952a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(e(), f(), g(), h());
            path.transform(matrix);
        }
    }

    static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f5953a = new Matrix();

        i() {
        }

        public final void draw(Z2.a aVar, int i8, Canvas canvas) {
            draw(f5953a, aVar, i8, canvas);
        }

        public abstract void draw(Matrix matrix, Z2.a aVar, int i8, Canvas canvas);
    }

    public m() {
        reset(0.0f, 0.0f);
    }

    private void a(float f8) {
        if (e() == f8) {
            return;
        }
        float fE = ((f8 - e()) + 360.0f) % 360.0f;
        if (fE > 180.0f) {
            return;
        }
        d dVar = new d(g(), h(), g(), h());
        dVar.r(e());
        dVar.s(fE);
        this.f5934b.add(new b(dVar));
        k(f8);
    }

    private void b(i iVar, float f8, float f9) {
        a(f8);
        this.f5934b.add(iVar);
        k(f9);
    }

    private float e() {
        return this.currentShadowAngle;
    }

    private float f() {
        return this.endShadowAngle;
    }

    private void k(float f8) {
        this.currentShadowAngle = f8;
    }

    private void l(float f8) {
        this.endShadowAngle = f8;
    }

    private void m(float f8) {
        this.endX = f8;
    }

    private void n(float f8) {
        this.endY = f8;
    }

    private void o(float f8) {
        this.startX = f8;
    }

    private void p(float f8) {
        this.startY = f8;
    }

    public void addArc(float f8, float f9, float f10, float f11, float f12, float f13) {
        d dVar = new d(f8, f9, f10, f11);
        dVar.r(f12);
        dVar.s(f13);
        this.f5933a.add(dVar);
        b bVar = new b(dVar);
        float f14 = f12 + f13;
        boolean z8 = f13 < 0.0f;
        if (z8) {
            f12 = (f12 + 180.0f) % 360.0f;
        }
        b(bVar, f12, z8 ? (180.0f + f14) % 360.0f : f14);
        double d9 = f14;
        m(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.cos(Math.toRadians(d9)))));
        n(((f9 + f11) * 0.5f) + (((f11 - f9) / 2.0f) * ((float) Math.sin(Math.toRadians(d9)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f5933a.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((g) this.f5933a.get(i8)).applyToPath(matrix, path);
        }
    }

    boolean c() {
        return this.f5935c;
    }

    public void cubicToPoint(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f5933a.add(new e(f8, f9, f10, f11, f12, f13));
        this.f5935c = true;
        m(f12);
        n(f13);
    }

    i d(Matrix matrix) {
        a(f());
        return new a(new ArrayList(this.f5934b), new Matrix(matrix));
    }

    float g() {
        return this.endX;
    }

    float h() {
        return this.endY;
    }

    float i() {
        return this.startX;
    }

    float j() {
        return this.startY;
    }

    public void lineTo(float f8, float f9) {
        f fVar = new f();
        fVar.f5950b = f8;
        fVar.f5951c = f9;
        this.f5933a.add(fVar);
        c cVar = new c(fVar, g(), h());
        b(cVar, cVar.a() + 270.0f, cVar.a() + 270.0f);
        m(f8);
        n(f9);
    }

    public void quadToPoint(float f8, float f9, float f10, float f11) {
        h hVar = new h();
        hVar.i(f8);
        hVar.j(f9);
        hVar.k(f10);
        hVar.l(f11);
        this.f5933a.add(hVar);
        this.f5935c = true;
        m(f10);
        n(f11);
    }

    public void reset(float f8, float f9) {
        reset(f8, f9, 270.0f, 0.0f);
    }

    public void reset(float f8, float f9, float f10, float f11) {
        o(f8);
        p(f9);
        m(f8);
        n(f9);
        k(f10);
        l((f10 + f11) % 360.0f);
        this.f5933a.clear();
        this.f5934b.clear();
        this.f5935c = false;
    }

    public m(float f8, float f9) {
        reset(f8, f9);
    }
}
