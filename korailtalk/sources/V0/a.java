package V0;

import T0.AbstractC0786c;
import T0.y;
import W0.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.p f5061e;

    /* renamed from: f, reason: collision with root package name */
    protected final AbstractC1064b f5062f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f5064h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f5065i;

    /* renamed from: j, reason: collision with root package name */
    private final W0.a f5066j;

    /* renamed from: k, reason: collision with root package name */
    private final W0.a f5067k;

    /* renamed from: l, reason: collision with root package name */
    private final List f5068l;

    /* renamed from: m, reason: collision with root package name */
    private final W0.a f5069m;

    /* renamed from: n, reason: collision with root package name */
    private W0.a f5070n;

    /* renamed from: o, reason: collision with root package name */
    private W0.a f5071o;

    /* renamed from: p, reason: collision with root package name */
    float f5072p;

    /* renamed from: q, reason: collision with root package name */
    private W0.c f5073q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f5057a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f5058b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f5059c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f5060d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List f5063g = new ArrayList();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f5074a;

        /* renamed from: b, reason: collision with root package name */
        private final u f5075b;

        private b(u uVar) {
            this.f5074a = new ArrayList();
            this.f5075b = uVar;
        }
    }

    a(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, Paint.Cap cap, Paint.Join join, float f8, Z0.d dVar, Z0.b bVar, List list, Z0.b bVar2) {
        U0.a aVar = new U0.a(1);
        this.f5065i = aVar;
        this.f5072p = 0.0f;
        this.f5061e = pVar;
        this.f5062f = abstractC1064b;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f8);
        this.f5067k = dVar.createAnimation();
        this.f5066j = bVar.createAnimation();
        if (bVar2 == null) {
            this.f5069m = null;
        } else {
            this.f5069m = bVar2.createAnimation();
        }
        this.f5068l = new ArrayList(list.size());
        this.f5064h = new float[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f5068l.add(((Z0.b) list.get(i8)).createAnimation());
        }
        abstractC1064b.addAnimation(this.f5067k);
        abstractC1064b.addAnimation(this.f5066j);
        for (int i9 = 0; i9 < this.f5068l.size(); i9++) {
            abstractC1064b.addAnimation((W0.a) this.f5068l.get(i9));
        }
        W0.a aVar2 = this.f5069m;
        if (aVar2 != null) {
            abstractC1064b.addAnimation(aVar2);
        }
        this.f5067k.addUpdateListener(this);
        this.f5066j.addUpdateListener(this);
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((W0.a) this.f5068l.get(i10)).addUpdateListener(this);
        }
        W0.a aVar3 = this.f5069m;
        if (aVar3 != null) {
            aVar3.addUpdateListener(this);
        }
        if (abstractC1064b.getBlurEffect() != null) {
            W0.a aVarCreateAnimation = abstractC1064b.getBlurEffect().getBlurriness().createAnimation();
            this.f5071o = aVarCreateAnimation;
            aVarCreateAnimation.addUpdateListener(this);
            abstractC1064b.addAnimation(this.f5071o);
        }
        if (abstractC1064b.getDropShadowEffect() != null) {
            this.f5073q = new W0.c(this, abstractC1064b, abstractC1064b.getDropShadowEffect());
        }
    }

    private void a(Matrix matrix) {
        AbstractC0786c.beginSection("StrokeContent#applyDashPattern");
        if (this.f5068l.isEmpty()) {
            AbstractC0786c.endSection("StrokeContent#applyDashPattern");
            return;
        }
        float scale = f1.j.getScale(matrix);
        for (int i8 = 0; i8 < this.f5068l.size(); i8++) {
            this.f5064h[i8] = ((Float) ((W0.a) this.f5068l.get(i8)).getValue()).floatValue();
            if (i8 % 2 == 0) {
                float[] fArr = this.f5064h;
                if (fArr[i8] < 1.0f) {
                    fArr[i8] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f5064h;
                if (fArr2[i8] < 0.1f) {
                    fArr2[i8] = 0.1f;
                }
            }
            float[] fArr3 = this.f5064h;
            fArr3[i8] = fArr3[i8] * scale;
        }
        W0.a aVar = this.f5069m;
        this.f5065i.setPathEffect(new DashPathEffect(this.f5064h, aVar == null ? 0.0f : scale * ((Float) aVar.getValue()).floatValue()));
        AbstractC0786c.endSection("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(android.graphics.Canvas r17, V0.a.b r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.b(android.graphics.Canvas, V0.a$b, android.graphics.Matrix):void");
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        W0.c cVar;
        W0.c cVar2;
        W0.c cVar3;
        W0.c cVar4;
        W0.c cVar5;
        if (t8 == y.OPACITY) {
            this.f5067k.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.STROKE_WIDTH) {
            this.f5066j.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.COLOR_FILTER) {
            W0.a aVar = this.f5070n;
            if (aVar != null) {
                this.f5062f.removeAnimation(aVar);
            }
            if (c5536c == null) {
                this.f5070n = null;
                return;
            }
            W0.q qVar = new W0.q(c5536c);
            this.f5070n = qVar;
            qVar.addUpdateListener(this);
            this.f5062f.addAnimation(this.f5070n);
            return;
        }
        if (t8 == y.BLUR_RADIUS) {
            W0.a aVar2 = this.f5071o;
            if (aVar2 != null) {
                aVar2.setValueCallback(c5536c);
                return;
            }
            W0.q qVar2 = new W0.q(c5536c);
            this.f5071o = qVar2;
            qVar2.addUpdateListener(this);
            this.f5062f.addAnimation(this.f5071o);
            return;
        }
        if (t8 == y.DROP_SHADOW_COLOR && (cVar5 = this.f5073q) != null) {
            cVar5.setColorCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_OPACITY && (cVar4 = this.f5073q) != null) {
            cVar4.setOpacityCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DIRECTION && (cVar3 = this.f5073q) != null) {
            cVar3.setDirectionCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DISTANCE && (cVar2 = this.f5073q) != null) {
            cVar2.setDistanceCallback(c5536c);
        } else {
            if (t8 != y.DROP_SHADOW_RADIUS || (cVar = this.f5073q) == null) {
                return;
            }
            cVar.setRadiusCallback(c5536c);
        }
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        AbstractC0786c.beginSection("StrokeContent#draw");
        if (f1.j.hasZeroScaleAxis(matrix)) {
            AbstractC0786c.endSection("StrokeContent#draw");
            return;
        }
        this.f5065i.setAlpha(f1.i.clamp((int) ((((i8 / 255.0f) * ((W0.f) this.f5067k).getIntValue()) / 100.0f) * 255.0f), 0, 255));
        this.f5065i.setStrokeWidth(((W0.d) this.f5066j).getFloatValue() * f1.j.getScale(matrix));
        if (this.f5065i.getStrokeWidth() <= 0.0f) {
            AbstractC0786c.endSection("StrokeContent#draw");
            return;
        }
        a(matrix);
        W0.a aVar = this.f5070n;
        if (aVar != null) {
            this.f5065i.setColorFilter((ColorFilter) aVar.getValue());
        }
        W0.a aVar2 = this.f5071o;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.getValue()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f5065i.setMaskFilter(null);
            } else if (fFloatValue != this.f5072p) {
                this.f5065i.setMaskFilter(this.f5062f.getBlurMaskFilter(fFloatValue));
            }
            this.f5072p = fFloatValue;
        }
        W0.c cVar = this.f5073q;
        if (cVar != null) {
            cVar.applyTo(this.f5065i);
        }
        for (int i9 = 0; i9 < this.f5063g.size(); i9++) {
            b bVar = (b) this.f5063g.get(i9);
            if (bVar.f5075b != null) {
                b(canvas, bVar, matrix);
            } else {
                AbstractC0786c.beginSection("StrokeContent#buildPath");
                this.f5058b.reset();
                for (int size = bVar.f5074a.size() - 1; size >= 0; size--) {
                    this.f5058b.addPath(((m) bVar.f5074a.get(size)).getPath(), matrix);
                }
                AbstractC0786c.endSection("StrokeContent#buildPath");
                AbstractC0786c.beginSection("StrokeContent#drawPath");
                canvas.drawPath(this.f5058b, this.f5065i);
                AbstractC0786c.endSection("StrokeContent#drawPath");
            }
        }
        AbstractC0786c.endSection("StrokeContent#draw");
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        AbstractC0786c.beginSection("StrokeContent#getBounds");
        this.f5058b.reset();
        for (int i8 = 0; i8 < this.f5063g.size(); i8++) {
            b bVar = (b) this.f5063g.get(i8);
            for (int i9 = 0; i9 < bVar.f5074a.size(); i9++) {
                this.f5058b.addPath(((m) bVar.f5074a.get(i9)).getPath(), matrix);
            }
        }
        this.f5058b.computeBounds(this.f5060d, false);
        float floatValue = ((W0.d) this.f5066j).getFloatValue();
        RectF rectF2 = this.f5060d;
        float f8 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f8, rectF2.top - f8, rectF2.right + f8, rectF2.bottom + f8);
        rectF.set(this.f5060d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        AbstractC0786c.endSection("StrokeContent#getBounds");
    }

    @Override // V0.k, V0.c, V0.e
    public abstract /* synthetic */ String getName();

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5061e.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        f1.i.resolveKeyPath(eVar, i8, list, eVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // V0.k, V0.c, V0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<V0.c> r8, java.util.List<V0.c> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            V0.c r3 = (V0.c) r3
            boolean r4 = r3 instanceof V0.u
            if (r4 == 0) goto L1f
            V0.u r3 = (V0.u) r3
            a1.s$a r4 = r3.b()
            a1.s$a r5 = a1.s.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.a(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            V0.c r3 = (V0.c) r3
            boolean r4 = r3 instanceof V0.u
            if (r4 == 0) goto L55
            r4 = r3
            V0.u r4 = (V0.u) r4
            a1.s$a r5 = r4.b()
            a1.s$a r6 = a1.s.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List r3 = r7.f5063g
            r3.add(r0)
        L4c:
            V0.a$b r0 = new V0.a$b
            r0.<init>(r4)
            r4.a(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof V0.m
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            V0.a$b r0 = new V0.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = V0.a.b.a(r0)
            V0.m r3 = (V0.m) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List r8 = r7.f5063g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.a.setContents(java.util.List, java.util.List):void");
    }
}
