package V0;

import T0.AbstractC0786c;
import T0.y;
import W0.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.AbstractC0985p0;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a */
    private final Path f5096a;

    /* renamed from: b */
    private final Paint f5097b;

    /* renamed from: c */
    private final AbstractC1064b f5098c;

    /* renamed from: d */
    private final String f5099d;

    /* renamed from: e */
    private final boolean f5100e;

    /* renamed from: f */
    private final List f5101f;

    /* renamed from: g */
    private final W0.a f5102g;

    /* renamed from: h */
    private final W0.a f5103h;

    /* renamed from: i */
    private W0.a f5104i;

    /* renamed from: j */
    private final com.airbnb.lottie.p f5105j;

    /* renamed from: k */
    private W0.a f5106k;

    /* renamed from: l */
    float f5107l;

    /* renamed from: m */
    private W0.c f5108m;

    public g(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.o oVar) {
        Path path = new Path();
        this.f5096a = path;
        this.f5097b = new U0.a(1);
        this.f5101f = new ArrayList();
        this.f5098c = abstractC1064b;
        this.f5099d = oVar.getName();
        this.f5100e = oVar.isHidden();
        this.f5105j = pVar;
        if (abstractC1064b.getBlurEffect() != null) {
            W0.a aVarCreateAnimation = abstractC1064b.getBlurEffect().getBlurriness().createAnimation();
            this.f5106k = aVarCreateAnimation;
            aVarCreateAnimation.addUpdateListener(this);
            abstractC1064b.addAnimation(this.f5106k);
        }
        if (abstractC1064b.getDropShadowEffect() != null) {
            this.f5108m = new W0.c(this, abstractC1064b, abstractC1064b.getDropShadowEffect());
        }
        if (oVar.getColor() == null || oVar.getOpacity() == null) {
            this.f5102g = null;
            this.f5103h = null;
            return;
        }
        path.setFillType(oVar.getFillType());
        W0.a aVarCreateAnimation2 = oVar.getColor().createAnimation();
        this.f5102g = aVarCreateAnimation2;
        aVarCreateAnimation2.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        W0.a aVarCreateAnimation3 = oVar.getOpacity().createAnimation();
        this.f5103h = aVarCreateAnimation3;
        aVarCreateAnimation3.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        W0.c cVar;
        W0.c cVar2;
        W0.c cVar3;
        W0.c cVar4;
        W0.c cVar5;
        if (t8 == y.COLOR) {
            this.f5102g.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.OPACITY) {
            this.f5103h.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.COLOR_FILTER) {
            W0.a aVar = this.f5104i;
            if (aVar != null) {
                this.f5098c.removeAnimation(aVar);
            }
            if (c5536c == null) {
                this.f5104i = null;
                return;
            }
            W0.q qVar = new W0.q(c5536c);
            this.f5104i = qVar;
            qVar.addUpdateListener(this);
            this.f5098c.addAnimation(this.f5104i);
            return;
        }
        if (t8 == y.BLUR_RADIUS) {
            W0.a aVar2 = this.f5106k;
            if (aVar2 != null) {
                aVar2.setValueCallback(c5536c);
                return;
            }
            W0.q qVar2 = new W0.q(c5536c);
            this.f5106k = qVar2;
            qVar2.addUpdateListener(this);
            this.f5098c.addAnimation(this.f5106k);
            return;
        }
        if (t8 == y.DROP_SHADOW_COLOR && (cVar5 = this.f5108m) != null) {
            cVar5.setColorCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_OPACITY && (cVar4 = this.f5108m) != null) {
            cVar4.setOpacityCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DIRECTION && (cVar3 = this.f5108m) != null) {
            cVar3.setDirectionCallback(c5536c);
            return;
        }
        if (t8 == y.DROP_SHADOW_DISTANCE && (cVar2 = this.f5108m) != null) {
            cVar2.setDistanceCallback(c5536c);
        } else {
            if (t8 != y.DROP_SHADOW_RADIUS || (cVar = this.f5108m) == null) {
                return;
            }
            cVar.setRadiusCallback(c5536c);
        }
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.f5100e) {
            return;
        }
        AbstractC0786c.beginSection("FillContent#draw");
        this.f5097b.setColor((f1.i.clamp((int) ((((i8 / 255.0f) * ((Integer) this.f5103h.getValue()).intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((W0.b) this.f5102g).getIntValue() & AbstractC0985p0.MEASURED_SIZE_MASK));
        W0.a aVar = this.f5104i;
        if (aVar != null) {
            this.f5097b.setColorFilter((ColorFilter) aVar.getValue());
        }
        W0.a aVar2 = this.f5106k;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.getValue()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f5097b.setMaskFilter(null);
            } else if (fFloatValue != this.f5107l) {
                this.f5097b.setMaskFilter(this.f5098c.getBlurMaskFilter(fFloatValue));
            }
            this.f5107l = fFloatValue;
        }
        W0.c cVar = this.f5108m;
        if (cVar != null) {
            cVar.applyTo(this.f5097b);
        }
        this.f5096a.reset();
        for (int i9 = 0; i9 < this.f5101f.size(); i9++) {
            this.f5096a.addPath(((m) this.f5101f.get(i9)).getPath(), matrix);
        }
        canvas.drawPath(this.f5096a, this.f5097b);
        AbstractC0786c.endSection("FillContent#draw");
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        this.f5096a.reset();
        for (int i8 = 0; i8 < this.f5101f.size(); i8++) {
            this.f5096a.addPath(((m) this.f5101f.get(i8)).getPath(), matrix);
        }
        this.f5096a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // V0.e
    public String getName() {
        return this.f5099d;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5105j.invalidateSelf();
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
                this.f5101f.add((m) cVar);
            }
        }
    }
}
