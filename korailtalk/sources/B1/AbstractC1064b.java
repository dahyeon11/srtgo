package b1;

import T0.AbstractC0786c;
import W0.a;
import a1.C0824a;
import a1.h;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import b1.C1067e;
import com.airbnb.lottie.p;
import d1.C5315j;
import f1.j;
import g1.C5536c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1064b implements V0.e, a.b, Y0.f {

    /* renamed from: A */
    private Paint f11291A;

    /* renamed from: B */
    float f11292B;

    /* renamed from: C */
    BlurMaskFilter f11293C;

    /* renamed from: a */
    private final Path f11294a = new Path();

    /* renamed from: b */
    private final Matrix f11295b = new Matrix();

    /* renamed from: c */
    private final Matrix f11296c = new Matrix();

    /* renamed from: d */
    private final Paint f11297d = new U0.a(1);

    /* renamed from: e */
    private final Paint f11298e;

    /* renamed from: f */
    private final Paint f11299f;

    /* renamed from: g */
    private final Paint f11300g;

    /* renamed from: h */
    private final Paint f11301h;

    /* renamed from: i */
    private final RectF f11302i;

    /* renamed from: j */
    private final RectF f11303j;

    /* renamed from: k */
    private final RectF f11304k;

    /* renamed from: l */
    private final RectF f11305l;

    /* renamed from: m */
    private final RectF f11306m;

    /* renamed from: n */
    private final String f11307n;

    /* renamed from: o */
    final Matrix f11308o;

    /* renamed from: p */
    final p f11309p;

    /* renamed from: q */
    final C1067e f11310q;

    /* renamed from: r */
    private W0.h f11311r;

    /* renamed from: s */
    private W0.d f11312s;

    /* renamed from: t */
    private AbstractC1064b f11313t;

    /* renamed from: u */
    private AbstractC1064b f11314u;

    /* renamed from: v */
    private List f11315v;

    /* renamed from: w */
    private final List f11316w;

    /* renamed from: x */
    final W0.p f11317x;

    /* renamed from: y */
    private boolean f11318y;

    /* renamed from: z */
    private boolean f11319z;

    /* renamed from: b1.b$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11320a;

        /* renamed from: b */
        static final /* synthetic */ int[] f11321b;

        static {
            int[] iArr = new int[h.a.values().length];
            f11321b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11321b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11321b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11321b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C1067e.a.values().length];
            f11320a = iArr2;
            try {
                iArr2[C1067e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11320a[C1067e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11320a[C1067e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11320a[C1067e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11320a[C1067e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11320a[C1067e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11320a[C1067e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    AbstractC1064b(p pVar, C1067e c1067e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f11298e = new U0.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f11299f = new U0.a(1, mode2);
        U0.a aVar = new U0.a(1);
        this.f11300g = aVar;
        this.f11301h = new U0.a(PorterDuff.Mode.CLEAR);
        this.f11302i = new RectF();
        this.f11303j = new RectF();
        this.f11304k = new RectF();
        this.f11305l = new RectF();
        this.f11306m = new RectF();
        this.f11308o = new Matrix();
        this.f11316w = new ArrayList();
        this.f11318y = true;
        this.f11292B = 0.0f;
        this.f11309p = pVar;
        this.f11310q = c1067e;
        this.f11307n = c1067e.e() + "#draw";
        if (c1067e.d() == C1067e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        W0.p pVarCreateAnimation = c1067e.s().createAnimation();
        this.f11317x = pVarCreateAnimation;
        pVarCreateAnimation.addListener(this);
        if (c1067e.c() != null && !c1067e.c().isEmpty()) {
            W0.h hVar = new W0.h(c1067e.c());
            this.f11311r = hVar;
            Iterator<W0.a> it = hVar.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (W0.a aVar2 : this.f11311r.getOpacityAnimations()) {
                addAnimation(aVar2);
                aVar2.addUpdateListener(this);
            }
        }
        y();
    }

    private void b(Canvas canvas, Matrix matrix, W0.a aVar, W0.a aVar2) {
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        this.f11297d.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f11294a, this.f11297d);
    }

    private void c(Canvas canvas, Matrix matrix, W0.a aVar, W0.a aVar2) {
        j.saveLayerCompat(canvas, this.f11302i, this.f11298e);
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        this.f11297d.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f11294a, this.f11297d);
        canvas.restore();
    }

    private void d(Canvas canvas, Matrix matrix, W0.a aVar, W0.a aVar2) {
        j.saveLayerCompat(canvas, this.f11302i, this.f11297d);
        canvas.drawRect(this.f11302i, this.f11297d);
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        this.f11297d.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        canvas.drawPath(this.f11294a, this.f11299f);
        canvas.restore();
    }

    private void e(Canvas canvas, Matrix matrix, W0.a aVar, W0.a aVar2) {
        j.saveLayerCompat(canvas, this.f11302i, this.f11298e);
        canvas.drawRect(this.f11302i, this.f11297d);
        this.f11299f.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        canvas.drawPath(this.f11294a, this.f11299f);
        canvas.restore();
    }

    private void f(Canvas canvas, Matrix matrix, W0.a aVar, W0.a aVar2) {
        j.saveLayerCompat(canvas, this.f11302i, this.f11299f);
        canvas.drawRect(this.f11302i, this.f11297d);
        this.f11299f.setAlpha((int) (((Integer) aVar2.getValue()).intValue() * 2.55f));
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        canvas.drawPath(this.f11294a, this.f11299f);
        canvas.restore();
    }

    private void g(Canvas canvas, Matrix matrix) {
        AbstractC0786c.beginSection("Layer#saveLayer");
        j.saveLayerCompat(canvas, this.f11302i, this.f11298e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            k(canvas);
        }
        AbstractC0786c.endSection("Layer#saveLayer");
        for (int i8 = 0; i8 < this.f11311r.getMasks().size(); i8++) {
            a1.h hVar = this.f11311r.getMasks().get(i8);
            W0.a aVar = this.f11311r.getMaskAnimations().get(i8);
            W0.a aVar2 = this.f11311r.getOpacityAnimations().get(i8);
            int i9 = a.f11321b[hVar.getMaskMode().ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    if (i8 == 0) {
                        this.f11297d.setColor(-16777216);
                        this.f11297d.setAlpha(255);
                        canvas.drawRect(this.f11302i, this.f11297d);
                    }
                    if (hVar.isInverted()) {
                        f(canvas, matrix, aVar, aVar2);
                    } else {
                        h(canvas, matrix, aVar);
                    }
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (hVar.isInverted()) {
                            d(canvas, matrix, aVar, aVar2);
                        } else {
                            b(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.isInverted()) {
                    e(canvas, matrix, aVar, aVar2);
                } else {
                    c(canvas, matrix, aVar, aVar2);
                }
            } else if (i()) {
                this.f11297d.setAlpha(255);
                canvas.drawRect(this.f11302i, this.f11297d);
            }
        }
        AbstractC0786c.beginSection("Layer#restoreLayer");
        canvas.restore();
        AbstractC0786c.endSection("Layer#restoreLayer");
    }

    private void h(Canvas canvas, Matrix matrix, W0.a aVar) {
        this.f11294a.set((Path) aVar.getValue());
        this.f11294a.transform(matrix);
        canvas.drawPath(this.f11294a, this.f11299f);
    }

    private boolean i() {
        if (this.f11311r.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f11311r.getMasks().size(); i8++) {
            if (this.f11311r.getMasks().get(i8).getMaskMode() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void j() {
        if (this.f11315v != null) {
            return;
        }
        if (this.f11314u == null) {
            this.f11315v = Collections.emptyList();
            return;
        }
        this.f11315v = new ArrayList();
        for (AbstractC1064b abstractC1064b = this.f11314u; abstractC1064b != null; abstractC1064b = abstractC1064b.f11314u) {
            this.f11315v.add(abstractC1064b);
        }
    }

    private void k(Canvas canvas) {
        AbstractC0786c.beginSection("Layer#clearLayer");
        RectF rectF = this.f11302i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f11301h);
        AbstractC0786c.endSection("Layer#clearLayer");
    }

    static AbstractC1064b l(C1065c c1065c, C1067e c1067e, p pVar, T0.h hVar) {
        switch (a.f11320a[c1067e.getLayerType().ordinal()]) {
            case 1:
                return new C1069g(pVar, c1067e, c1065c);
            case 2:
                return new C1065c(pVar, c1067e, hVar.getPrecomps(c1067e.i()), hVar);
            case 3:
                return new C1070h(pVar, c1067e);
            case 4:
                return new C1066d(pVar, c1067e);
            case 5:
                return new C1068f(pVar, c1067e);
            case 6:
                return new C1071i(pVar, c1067e);
            default:
                f1.f.warning("Unknown layer type " + c1067e.getLayerType());
                return null;
        }
    }

    private void p(RectF rectF, Matrix matrix) {
        this.f11304k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (n()) {
            int size = this.f11311r.getMasks().size();
            for (int i8 = 0; i8 < size; i8++) {
                a1.h hVar = this.f11311r.getMasks().get(i8);
                Path path = (Path) this.f11311r.getMaskAnimations().get(i8).getValue();
                if (path != null) {
                    this.f11294a.set(path);
                    this.f11294a.transform(matrix);
                    int i9 = a.f11321b[hVar.getMaskMode().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        return;
                    }
                    if ((i9 == 3 || i9 == 4) && hVar.isInverted()) {
                        return;
                    }
                    this.f11294a.computeBounds(this.f11306m, false);
                    if (i8 == 0) {
                        this.f11304k.set(this.f11306m);
                    } else {
                        RectF rectF2 = this.f11304k;
                        rectF2.set(Math.min(rectF2.left, this.f11306m.left), Math.min(this.f11304k.top, this.f11306m.top), Math.max(this.f11304k.right, this.f11306m.right), Math.max(this.f11304k.bottom, this.f11306m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f11304k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void q(RectF rectF, Matrix matrix) {
        if (o() && this.f11310q.d() != C1067e.b.INVERT) {
            this.f11305l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f11313t.getBounds(this.f11305l, matrix, true);
            if (rectF.intersect(this.f11305l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void r() {
        this.f11309p.invalidateSelf();
    }

    public /* synthetic */ void s() {
        x(this.f11312s.getFloatValue() == 1.0f);
    }

    private void t(float f8) {
        this.f11309p.getComposition().getPerformanceTracker().recordRenderTime(this.f11310q.e(), f8);
    }

    private void x(boolean z8) {
        if (z8 != this.f11318y) {
            this.f11318y = z8;
            r();
        }
    }

    private void y() {
        if (this.f11310q.b().isEmpty()) {
            x(true);
            return;
        }
        W0.d dVar = new W0.d(this.f11310q.b());
        this.f11312s = dVar;
        dVar.setIsDiscrete();
        this.f11312s.addUpdateListener(new a.b() { // from class: b1.a
            @Override // W0.a.b
            public final void onValueChanged() {
                this.f11290a.s();
            }
        });
        x(((Float) this.f11312s.getValue()).floatValue() == 1.0f);
        addAnimation(this.f11312s);
    }

    public void addAnimation(W0.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11316w.add(aVar);
    }

    @Override // Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        this.f11317x.applyValueCallback(t8, c5536c);
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        Paint paint;
        AbstractC0786c.beginSection(this.f11307n);
        if (!this.f11318y || this.f11310q.isHidden()) {
            AbstractC0786c.endSection(this.f11307n);
            return;
        }
        j();
        AbstractC0786c.beginSection("Layer#parentMatrix");
        this.f11295b.reset();
        this.f11295b.set(matrix);
        for (int size = this.f11315v.size() - 1; size >= 0; size--) {
            this.f11295b.preConcat(((AbstractC1064b) this.f11315v.get(size)).f11317x.getMatrix());
        }
        AbstractC0786c.endSection("Layer#parentMatrix");
        int iIntValue = (int) ((((i8 / 255.0f) * (this.f11317x.getOpacity() == null ? 100 : ((Integer) this.f11317x.getOpacity().getValue()).intValue())) / 100.0f) * 255.0f);
        if (!o() && !n()) {
            this.f11295b.preConcat(this.f11317x.getMatrix());
            AbstractC0786c.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.f11295b, iIntValue);
            AbstractC0786c.endSection("Layer#drawLayer");
            t(AbstractC0786c.endSection(this.f11307n));
            return;
        }
        AbstractC0786c.beginSection("Layer#computeBounds");
        getBounds(this.f11302i, this.f11295b, false);
        q(this.f11302i, matrix);
        this.f11295b.preConcat(this.f11317x.getMatrix());
        p(this.f11302i, this.f11295b);
        this.f11303j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f11296c);
        if (!this.f11296c.isIdentity()) {
            Matrix matrix2 = this.f11296c;
            matrix2.invert(matrix2);
            this.f11296c.mapRect(this.f11303j);
        }
        if (!this.f11302i.intersect(this.f11303j)) {
            this.f11302i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        AbstractC0786c.endSection("Layer#computeBounds");
        if (this.f11302i.width() >= 1.0f && this.f11302i.height() >= 1.0f) {
            AbstractC0786c.beginSection("Layer#saveLayer");
            this.f11297d.setAlpha(255);
            j.saveLayerCompat(canvas, this.f11302i, this.f11297d);
            AbstractC0786c.endSection("Layer#saveLayer");
            k(canvas);
            AbstractC0786c.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.f11295b, iIntValue);
            AbstractC0786c.endSection("Layer#drawLayer");
            if (n()) {
                g(canvas, this.f11295b);
            }
            if (o()) {
                AbstractC0786c.beginSection("Layer#drawMatte");
                AbstractC0786c.beginSection("Layer#saveLayer");
                j.saveLayerCompat(canvas, this.f11302i, this.f11300g, 19);
                AbstractC0786c.endSection("Layer#saveLayer");
                k(canvas);
                this.f11313t.draw(canvas, matrix, iIntValue);
                AbstractC0786c.beginSection("Layer#restoreLayer");
                canvas.restore();
                AbstractC0786c.endSection("Layer#restoreLayer");
                AbstractC0786c.endSection("Layer#drawMatte");
            }
            AbstractC0786c.beginSection("Layer#restoreLayer");
            canvas.restore();
            AbstractC0786c.endSection("Layer#restoreLayer");
        }
        if (this.f11319z && (paint = this.f11291A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f11291A.setColor(-251901);
            this.f11291A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f11302i, this.f11291A);
            this.f11291A.setStyle(Paint.Style.FILL);
            this.f11291A.setColor(1357638635);
            canvas.drawRect(this.f11302i, this.f11291A);
        }
        t(AbstractC0786c.endSection(this.f11307n));
    }

    abstract void drawLayer(Canvas canvas, Matrix matrix, int i8);

    public C0824a getBlurEffect() {
        return this.f11310q.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f8) {
        if (this.f11292B == f8) {
            return this.f11293C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f8 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f11293C = blurMaskFilter;
        this.f11292B = f8;
        return blurMaskFilter;
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        this.f11302i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.f11308o.set(matrix);
        if (z8) {
            List list = this.f11315v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f11308o.preConcat(((AbstractC1064b) this.f11315v.get(size)).f11317x.getMatrix());
                }
            } else {
                AbstractC1064b abstractC1064b = this.f11314u;
                if (abstractC1064b != null) {
                    this.f11308o.preConcat(abstractC1064b.f11317x.getMatrix());
                }
            }
        }
        this.f11308o.preConcat(this.f11317x.getMatrix());
    }

    public C5315j getDropShadowEffect() {
        return this.f11310q.getDropShadowEffect();
    }

    @Override // V0.e
    public String getName() {
        return this.f11310q.e();
    }

    C1067e m() {
        return this.f11310q;
    }

    boolean n() {
        W0.h hVar = this.f11311r;
        return (hVar == null || hVar.getMaskAnimations().isEmpty()) ? false : true;
    }

    boolean o() {
        return this.f11313t != null;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        r();
    }

    public void removeAnimation(W0.a aVar) {
        this.f11316w.remove(aVar);
    }

    @Override // Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        AbstractC1064b abstractC1064b = this.f11313t;
        if (abstractC1064b != null) {
            Y0.e eVarAddKey = eVar2.addKey(abstractC1064b.getName());
            if (eVar.fullyResolvesTo(this.f11313t.getName(), i8)) {
                list.add(eVarAddKey.resolve(this.f11313t));
            }
            if (eVar.propagateToChildren(getName(), i8)) {
                this.f11313t.u(eVar, eVar.incrementDepthBy(this.f11313t.getName(), i8) + i8, list, eVarAddKey);
            }
        }
        if (eVar.matches(getName(), i8)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.addKey(getName());
                if (eVar.fullyResolvesTo(getName(), i8)) {
                    list.add(eVar2.resolve(this));
                }
            }
            if (eVar.propagateToChildren(getName(), i8)) {
                u(eVar, i8 + eVar.incrementDepthBy(getName(), i8), list, eVar2);
            }
        }
    }

    void setOutlineMasksAndMattes(boolean z8) {
        if (z8 && this.f11291A == null) {
            this.f11291A = new U0.a();
        }
        this.f11319z = z8;
    }

    void setProgress(float f8) {
        this.f11317x.setProgress(f8);
        if (this.f11311r != null) {
            for (int i8 = 0; i8 < this.f11311r.getMaskAnimations().size(); i8++) {
                this.f11311r.getMaskAnimations().get(i8).setProgress(f8);
            }
        }
        W0.d dVar = this.f11312s;
        if (dVar != null) {
            dVar.setProgress(f8);
        }
        AbstractC1064b abstractC1064b = this.f11313t;
        if (abstractC1064b != null) {
            abstractC1064b.setProgress(f8);
        }
        for (int i9 = 0; i9 < this.f11316w.size(); i9++) {
            ((W0.a) this.f11316w.get(i9)).setProgress(f8);
        }
    }

    void v(AbstractC1064b abstractC1064b) {
        this.f11313t = abstractC1064b;
    }

    void w(AbstractC1064b abstractC1064b) {
        this.f11314u = abstractC1064b;
    }

    @Override // V0.e
    public void setContents(List<V0.c> list, List<V0.c> list2) {
    }

    void u(Y0.e eVar, int i8, List list, Y0.e eVar2) {
    }
}
