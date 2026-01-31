package V0;

import T0.AbstractC0786c;
import T0.y;
import W0.a;
import a1.C0827d;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final String f5109a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5110b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1064b f5111c;

    /* renamed from: d, reason: collision with root package name */
    private final O.e f5112d = new O.e();

    /* renamed from: e, reason: collision with root package name */
    private final O.e f5113e = new O.e();

    /* renamed from: f, reason: collision with root package name */
    private final Path f5114f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f5115g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f5116h;

    /* renamed from: i, reason: collision with root package name */
    private final List f5117i;

    /* renamed from: j, reason: collision with root package name */
    private final a1.g f5118j;

    /* renamed from: k, reason: collision with root package name */
    private final W0.a f5119k;

    /* renamed from: l, reason: collision with root package name */
    private final W0.a f5120l;

    /* renamed from: m, reason: collision with root package name */
    private final W0.a f5121m;

    /* renamed from: n, reason: collision with root package name */
    private final W0.a f5122n;

    /* renamed from: o, reason: collision with root package name */
    private W0.a f5123o;

    /* renamed from: p, reason: collision with root package name */
    private W0.q f5124p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.p f5125q;

    /* renamed from: r, reason: collision with root package name */
    private final int f5126r;

    /* renamed from: s, reason: collision with root package name */
    private W0.a f5127s;

    /* renamed from: t, reason: collision with root package name */
    float f5128t;

    /* renamed from: u, reason: collision with root package name */
    private W0.c f5129u;

    public h(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.e eVar) {
        Path path = new Path();
        this.f5114f = path;
        this.f5115g = new U0.a(1);
        this.f5116h = new RectF();
        this.f5117i = new ArrayList();
        this.f5128t = 0.0f;
        this.f5111c = abstractC1064b;
        this.f5109a = eVar.getName();
        this.f5110b = eVar.isHidden();
        this.f5125q = pVar;
        this.f5118j = eVar.getGradientType();
        path.setFillType(eVar.getFillType());
        this.f5126r = (int) (pVar.getComposition().getDuration() / 32.0f);
        W0.a aVarCreateAnimation = eVar.getGradientColor().createAnimation();
        this.f5119k = aVarCreateAnimation;
        aVarCreateAnimation.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation);
        W0.a aVarCreateAnimation2 = eVar.getOpacity().createAnimation();
        this.f5120l = aVarCreateAnimation2;
        aVarCreateAnimation2.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        W0.a aVarCreateAnimation3 = eVar.getStartPoint().createAnimation();
        this.f5121m = aVarCreateAnimation3;
        aVarCreateAnimation3.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
        W0.a aVarCreateAnimation4 = eVar.getEndPoint().createAnimation();
        this.f5122n = aVarCreateAnimation4;
        aVarCreateAnimation4.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation4);
        if (abstractC1064b.getBlurEffect() != null) {
            W0.a aVarCreateAnimation5 = abstractC1064b.getBlurEffect().getBlurriness().createAnimation();
            this.f5127s = aVarCreateAnimation5;
            aVarCreateAnimation5.addUpdateListener(this);
            abstractC1064b.addAnimation(this.f5127s);
        }
        if (abstractC1064b.getDropShadowEffect() != null) {
            this.f5129u = new W0.c(this, abstractC1064b, abstractC1064b.getDropShadowEffect());
        }
    }

    private int[] a(int[] iArr) {
        W0.q qVar = this.f5124p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.getValue();
            int i8 = 0;
            if (iArr.length == numArr.length) {
                while (i8 < iArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i8 < numArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            }
        }
        return iArr;
    }

    private int b() {
        int iRound = Math.round(this.f5121m.getProgress() * this.f5126r);
        int iRound2 = Math.round(this.f5122n.getProgress() * this.f5126r);
        int iRound3 = Math.round(this.f5119k.getProgress() * this.f5126r);
        int i8 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i8 = i8 * 31 * iRound2;
        }
        return iRound3 != 0 ? i8 * 31 * iRound3 : i8;
    }

    private LinearGradient c() {
        long jB = b();
        LinearGradient linearGradient = (LinearGradient) this.f5112d.get(jB);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f5121m.getValue();
        PointF pointF2 = (PointF) this.f5122n.getValue();
        C0827d c0827d = (C0827d) this.f5119k.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, a(c0827d.getColors()), c0827d.getPositions(), Shader.TileMode.CLAMP);
        this.f5112d.put(jB, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient d() {
        long jB = b();
        RadialGradient radialGradient = (RadialGradient) this.f5113e.get(jB);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f5121m.getValue();
        PointF pointF2 = (PointF) this.f5122n.getValue();
        C0827d c0827d = (C0827d) this.f5119k.getValue();
        int[] iArrA = a(c0827d.getColors());
        float[] positions = c0827d.getPositions();
        float f8 = pointF.x;
        float f9 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f8, pointF2.y - f9);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f8, f9, fHypot, iArrA, positions, Shader.TileMode.CLAMP);
        this.f5113e.put(jB, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        W0.c cVar;
        W0.c cVar2;
        W0.c cVar3;
        W0.c cVar4;
        W0.c cVar5;
        if (t8 == y.OPACITY) {
            this.f5120l.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.COLOR_FILTER) {
            W0.a aVar = this.f5123o;
            if (aVar != null) {
                this.f5111c.removeAnimation(aVar);
            }
            if (c5536c == null) {
                this.f5123o = null;
                return;
            }
            W0.q qVar = new W0.q(c5536c);
            this.f5123o = qVar;
            qVar.addUpdateListener(this);
            this.f5111c.addAnimation(this.f5123o);
            return;
        }
        if (t8 == y.GRADIENT_COLOR) {
            W0.q qVar2 = this.f5124p;
            if (qVar2 != null) {
                this.f5111c.removeAnimation(qVar2);
            }
            if (c5536c == null) {
                this.f5124p = null;
                return;
            }
            this.f5112d.clear();
            this.f5113e.clear();
            W0.q qVar3 = new W0.q(c5536c);
            this.f5124p = qVar3;
            qVar3.addUpdateListener(this);
            this.f5111c.addAnimation(this.f5124p);
            return;
        }
        if (t8 == y.BLUR_RADIUS) {
            W0.a aVar2 = this.f5127s;
            if (aVar2 != null) {
                aVar2.setValueCallback(c5536c);
                return;
            }
            W0.q qVar4 = new W0.q(c5536c);
            this.f5127s = qVar4;
            qVar4.addUpdateListener(this);
            this.f5111c.addAnimation(this.f5127s);
            return;
        }
        if (t8 == y.DROP_SHADOW_COLOR && (cVar5 = this.f5129u) != null) {
            cVar5.setColorCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_OPACITY && (cVar4 = this.f5129u) != null) {
            cVar4.setOpacityCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DIRECTION && (cVar3 = this.f5129u) != null) {
            cVar3.setDirectionCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DISTANCE && (cVar2 = this.f5129u) != null) {
            cVar2.setDistanceCallback(c5536c);
        } else {
            if (t8 != y.DROP_SHADOW_RADIUS || (cVar = this.f5129u) == null) {
                return;
            }
            cVar.setRadiusCallback(c5536c);
        }
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.f5110b) {
            return;
        }
        AbstractC0786c.beginSection("GradientFillContent#draw");
        this.f5114f.reset();
        for (int i9 = 0; i9 < this.f5117i.size(); i9++) {
            this.f5114f.addPath(((m) this.f5117i.get(i9)).getPath(), matrix);
        }
        this.f5114f.computeBounds(this.f5116h, false);
        Shader shaderC = this.f5118j == a1.g.LINEAR ? c() : d();
        shaderC.setLocalMatrix(matrix);
        this.f5115g.setShader(shaderC);
        W0.a aVar = this.f5123o;
        if (aVar != null) {
            this.f5115g.setColorFilter((ColorFilter) aVar.getValue());
        }
        W0.a aVar2 = this.f5127s;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.getValue()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f5115g.setMaskFilter(null);
            } else if (fFloatValue != this.f5128t) {
                this.f5115g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f5128t = fFloatValue;
        }
        W0.c cVar = this.f5129u;
        if (cVar != null) {
            cVar.applyTo(this.f5115g);
        }
        this.f5115g.setAlpha(f1.i.clamp((int) ((((i8 / 255.0f) * ((Integer) this.f5120l.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f5114f, this.f5115g);
        AbstractC0786c.endSection("GradientFillContent#draw");
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        this.f5114f.reset();
        for (int i8 = 0; i8 < this.f5117i.size(); i8++) {
            this.f5114f.addPath(((m) this.f5117i.get(i8)).getPath(), matrix);
        }
        this.f5114f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // V0.e
    public String getName() {
        return this.f5109a;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5125q.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        f1.i.resolveKeyPath(eVar, i8, list, eVar2, this);
    }

    @Override // V0.e
    public void setContents(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = list2.get(i8);
            if (cVar instanceof m) {
                this.f5117i.add((m) cVar);
            }
        }
    }
}
