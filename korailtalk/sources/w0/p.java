package W0;

import T0.y;
import W0.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import b1.AbstractC1064b;
import g1.C5534a;
import g1.C5536c;
import g1.C5537d;
import java.util.Collections;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private final Matrix f5287a = new Matrix();

    /* renamed from: b */
    private final Matrix f5288b;

    /* renamed from: c */
    private final Matrix f5289c;

    /* renamed from: d */
    private final Matrix f5290d;

    /* renamed from: e */
    private final float[] f5291e;

    /* renamed from: f */
    private a f5292f;

    /* renamed from: g */
    private a f5293g;

    /* renamed from: h */
    private a f5294h;

    /* renamed from: i */
    private a f5295i;

    /* renamed from: j */
    private a f5296j;

    /* renamed from: k */
    private d f5297k;

    /* renamed from: l */
    private d f5298l;

    /* renamed from: m */
    private a f5299m;

    /* renamed from: n */
    private a f5300n;

    public p(Z0.l lVar) {
        this.f5292f = lVar.getAnchorPoint() == null ? null : lVar.getAnchorPoint().createAnimation();
        this.f5293g = lVar.getPosition() == null ? null : lVar.getPosition().createAnimation();
        this.f5294h = lVar.getScale() == null ? null : lVar.getScale().createAnimation();
        this.f5295i = lVar.getRotation() == null ? null : lVar.getRotation().createAnimation();
        d dVar = lVar.getSkew() == null ? null : (d) lVar.getSkew().createAnimation();
        this.f5297k = dVar;
        if (dVar != null) {
            this.f5288b = new Matrix();
            this.f5289c = new Matrix();
            this.f5290d = new Matrix();
            this.f5291e = new float[9];
        } else {
            this.f5288b = null;
            this.f5289c = null;
            this.f5290d = null;
            this.f5291e = null;
        }
        this.f5298l = lVar.getSkewAngle() == null ? null : (d) lVar.getSkewAngle().createAnimation();
        if (lVar.getOpacity() != null) {
            this.f5296j = lVar.getOpacity().createAnimation();
        }
        if (lVar.getStartOpacity() != null) {
            this.f5299m = lVar.getStartOpacity().createAnimation();
        } else {
            this.f5299m = null;
        }
        if (lVar.getEndOpacity() != null) {
            this.f5300n = lVar.getEndOpacity().createAnimation();
        } else {
            this.f5300n = null;
        }
    }

    private void a() {
        for (int i8 = 0; i8 < 9; i8++) {
            this.f5291e[i8] = 0.0f;
        }
    }

    public void addAnimationsToLayer(AbstractC1064b abstractC1064b) {
        abstractC1064b.addAnimation(this.f5296j);
        abstractC1064b.addAnimation(this.f5299m);
        abstractC1064b.addAnimation(this.f5300n);
        abstractC1064b.addAnimation(this.f5292f);
        abstractC1064b.addAnimation(this.f5293g);
        abstractC1064b.addAnimation(this.f5294h);
        abstractC1064b.addAnimation(this.f5295i);
        abstractC1064b.addAnimation(this.f5297k);
        abstractC1064b.addAnimation(this.f5298l);
    }

    public void addListener(a.b bVar) {
        a aVar = this.f5296j;
        if (aVar != null) {
            aVar.addUpdateListener(bVar);
        }
        a aVar2 = this.f5299m;
        if (aVar2 != null) {
            aVar2.addUpdateListener(bVar);
        }
        a aVar3 = this.f5300n;
        if (aVar3 != null) {
            aVar3.addUpdateListener(bVar);
        }
        a aVar4 = this.f5292f;
        if (aVar4 != null) {
            aVar4.addUpdateListener(bVar);
        }
        a aVar5 = this.f5293g;
        if (aVar5 != null) {
            aVar5.addUpdateListener(bVar);
        }
        a aVar6 = this.f5294h;
        if (aVar6 != null) {
            aVar6.addUpdateListener(bVar);
        }
        a aVar7 = this.f5295i;
        if (aVar7 != null) {
            aVar7.addUpdateListener(bVar);
        }
        d dVar = this.f5297k;
        if (dVar != null) {
            dVar.addUpdateListener(bVar);
        }
        d dVar2 = this.f5298l;
        if (dVar2 != null) {
            dVar2.addUpdateListener(bVar);
        }
    }

    public <T> boolean applyValueCallback(T t8, C5536c c5536c) {
        if (t8 == y.TRANSFORM_ANCHOR_POINT) {
            a aVar = this.f5292f;
            if (aVar == null) {
                this.f5292f = new q(c5536c, new PointF());
                return true;
            }
            aVar.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_POSITION) {
            a aVar2 = this.f5293g;
            if (aVar2 == null) {
                this.f5293g = new q(c5536c, new PointF());
                return true;
            }
            aVar2.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_POSITION_X) {
            a aVar3 = this.f5293g;
            if (aVar3 instanceof n) {
                ((n) aVar3).setXValueCallback(c5536c);
                return true;
            }
        }
        if (t8 == y.TRANSFORM_POSITION_Y) {
            a aVar4 = this.f5293g;
            if (aVar4 instanceof n) {
                ((n) aVar4).setYValueCallback(c5536c);
                return true;
            }
        }
        if (t8 == y.TRANSFORM_SCALE) {
            a aVar5 = this.f5294h;
            if (aVar5 == null) {
                this.f5294h = new q(c5536c, new C5537d());
                return true;
            }
            aVar5.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_ROTATION) {
            a aVar6 = this.f5295i;
            if (aVar6 == null) {
                this.f5295i = new q(c5536c, Float.valueOf(0.0f));
                return true;
            }
            aVar6.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_OPACITY) {
            a aVar7 = this.f5296j;
            if (aVar7 == null) {
                this.f5296j = new q(c5536c, 100);
                return true;
            }
            aVar7.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_START_OPACITY) {
            a aVar8 = this.f5299m;
            if (aVar8 == null) {
                this.f5299m = new q(c5536c, Float.valueOf(100.0f));
                return true;
            }
            aVar8.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_END_OPACITY) {
            a aVar9 = this.f5300n;
            if (aVar9 == null) {
                this.f5300n = new q(c5536c, Float.valueOf(100.0f));
                return true;
            }
            aVar9.setValueCallback(c5536c);
            return true;
        }
        if (t8 == y.TRANSFORM_SKEW) {
            if (this.f5297k == null) {
                this.f5297k = new d(Collections.singletonList(new C5534a(Float.valueOf(0.0f))));
            }
            this.f5297k.setValueCallback(c5536c);
            return true;
        }
        if (t8 != y.TRANSFORM_SKEW_ANGLE) {
            return false;
        }
        if (this.f5298l == null) {
            this.f5298l = new d(Collections.singletonList(new C5534a(Float.valueOf(0.0f))));
        }
        this.f5298l.setValueCallback(c5536c);
        return true;
    }

    public a getEndOpacity() {
        return this.f5300n;
    }

    public Matrix getMatrix() {
        PointF pointF;
        this.f5287a.reset();
        a aVar = this.f5293g;
        if (aVar != null && (pointF = (PointF) aVar.getValue()) != null) {
            float f8 = pointF.x;
            if (f8 != 0.0f || pointF.y != 0.0f) {
                this.f5287a.preTranslate(f8, pointF.y);
            }
        }
        a aVar2 = this.f5295i;
        if (aVar2 != null) {
            float fFloatValue = aVar2 instanceof q ? ((Float) aVar2.getValue()).floatValue() : ((d) aVar2).getFloatValue();
            if (fFloatValue != 0.0f) {
                this.f5287a.preRotate(fFloatValue);
            }
        }
        if (this.f5297k != null) {
            float fCos = this.f5298l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.getFloatValue()) + 90.0f));
            float fSin = this.f5298l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.getFloatValue()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.getFloatValue()));
            a();
            float[] fArr = this.f5291e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f9 = -fSin;
            fArr[3] = f9;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f5288b.setValues(fArr);
            a();
            float[] fArr2 = this.f5291e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f5289c.setValues(fArr2);
            a();
            float[] fArr3 = this.f5291e;
            fArr3[0] = fCos;
            fArr3[1] = f9;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f5290d.setValues(fArr3);
            this.f5289c.preConcat(this.f5288b);
            this.f5290d.preConcat(this.f5289c);
            this.f5287a.preConcat(this.f5290d);
        }
        a aVar3 = this.f5294h;
        if (aVar3 != null) {
            C5537d c5537d = (C5537d) aVar3.getValue();
            if (c5537d.getScaleX() != 1.0f || c5537d.getScaleY() != 1.0f) {
                this.f5287a.preScale(c5537d.getScaleX(), c5537d.getScaleY());
            }
        }
        a aVar4 = this.f5292f;
        if (aVar4 != null) {
            PointF pointF2 = (PointF) aVar4.getValue();
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.f5287a.preTranslate(-f10, -pointF2.y);
            }
        }
        return this.f5287a;
    }

    public Matrix getMatrixForRepeater(float f8) {
        a aVar = this.f5293g;
        PointF pointF = aVar == null ? null : (PointF) aVar.getValue();
        a aVar2 = this.f5294h;
        C5537d c5537d = aVar2 == null ? null : (C5537d) aVar2.getValue();
        this.f5287a.reset();
        if (pointF != null) {
            this.f5287a.preTranslate(pointF.x * f8, pointF.y * f8);
        }
        if (c5537d != null) {
            double d9 = f8;
            this.f5287a.preScale((float) Math.pow(c5537d.getScaleX(), d9), (float) Math.pow(c5537d.getScaleY(), d9));
        }
        a aVar3 = this.f5295i;
        if (aVar3 != null) {
            float fFloatValue = ((Float) aVar3.getValue()).floatValue();
            a aVar4 = this.f5292f;
            PointF pointF2 = aVar4 != null ? (PointF) aVar4.getValue() : null;
            this.f5287a.preRotate(fFloatValue * f8, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f5287a;
    }

    public a getOpacity() {
        return this.f5296j;
    }

    public a getStartOpacity() {
        return this.f5299m;
    }

    public void setProgress(float f8) {
        a aVar = this.f5296j;
        if (aVar != null) {
            aVar.setProgress(f8);
        }
        a aVar2 = this.f5299m;
        if (aVar2 != null) {
            aVar2.setProgress(f8);
        }
        a aVar3 = this.f5300n;
        if (aVar3 != null) {
            aVar3.setProgress(f8);
        }
        a aVar4 = this.f5292f;
        if (aVar4 != null) {
            aVar4.setProgress(f8);
        }
        a aVar5 = this.f5293g;
        if (aVar5 != null) {
            aVar5.setProgress(f8);
        }
        a aVar6 = this.f5294h;
        if (aVar6 != null) {
            aVar6.setProgress(f8);
        }
        a aVar7 = this.f5295i;
        if (aVar7 != null) {
            aVar7.setProgress(f8);
        }
        d dVar = this.f5297k;
        if (dVar != null) {
            dVar.setProgress(f8);
        }
        d dVar2 = this.f5298l;
        if (dVar2 != null) {
            dVar2.setProgress(f8);
        }
    }
}
