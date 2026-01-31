package W0;

import W0.a;
import android.graphics.Color;
import android.graphics.Paint;
import b1.AbstractC1064b;
import d1.C5315j;
import g1.C5535b;
import g1.C5536c;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f5253a;

    /* renamed from: b, reason: collision with root package name */
    private final W0.a f5254b;

    /* renamed from: c, reason: collision with root package name */
    private final W0.a f5255c;

    /* renamed from: d, reason: collision with root package name */
    private final W0.a f5256d;

    /* renamed from: e, reason: collision with root package name */
    private final W0.a f5257e;

    /* renamed from: f, reason: collision with root package name */
    private final W0.a f5258f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5259g = true;

    class a extends C5536c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5536c f5260d;

        a(C5536c c5536c) {
            this.f5260d = c5536c;
        }

        @Override // g1.C5536c
        public Float getValue(C5535b c5535b) {
            Float f8 = (Float) this.f5260d.getValue(c5535b);
            if (f8 == null) {
                return null;
            }
            return Float.valueOf(f8.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, AbstractC1064b abstractC1064b, C5315j c5315j) {
        this.f5253a = bVar;
        W0.a aVarCreateAnimation = c5315j.getColor().createAnimation();
        this.f5254b = aVarCreateAnimation;
        aVarCreateAnimation.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation);
        W0.a aVarCreateAnimation2 = c5315j.getOpacity().createAnimation();
        this.f5255c = aVarCreateAnimation2;
        aVarCreateAnimation2.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        W0.a aVarCreateAnimation3 = c5315j.getDirection().createAnimation();
        this.f5256d = aVarCreateAnimation3;
        aVarCreateAnimation3.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
        W0.a aVarCreateAnimation4 = c5315j.getDistance().createAnimation();
        this.f5257e = aVarCreateAnimation4;
        aVarCreateAnimation4.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation4);
        W0.a aVarCreateAnimation5 = c5315j.getRadius().createAnimation();
        this.f5258f = aVarCreateAnimation5;
        aVarCreateAnimation5.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation5);
    }

    public void applyTo(Paint paint) {
        if (this.f5259g) {
            this.f5259g = false;
            double dFloatValue = ((Float) this.f5256d.getValue()).floatValue() * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f5257e.getValue()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f5254b.getValue()).intValue();
            paint.setShadowLayer(((Float) this.f5258f.getValue()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f5255c.getValue()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5259g = true;
        this.f5253a.onValueChanged();
    }

    public void setColorCallback(C5536c c5536c) {
        this.f5254b.setValueCallback(c5536c);
    }

    public void setDirectionCallback(C5536c c5536c) {
        this.f5256d.setValueCallback(c5536c);
    }

    public void setDistanceCallback(C5536c c5536c) {
        this.f5257e.setValueCallback(c5536c);
    }

    public void setOpacityCallback(C5536c c5536c) {
        if (c5536c == null) {
            this.f5255c.setValueCallback(null);
        } else {
            this.f5255c.setValueCallback(new a(c5536c));
        }
    }

    public void setRadiusCallback(C5536c c5536c) {
        this.f5258f.setValueCallback(c5536c);
    }
}
