package V0;

import T0.y;
import W0.a;
import a1.j;
import a1.s;
import android.graphics.Path;
import android.graphics.PointF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f5149b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f5150c;

    /* renamed from: d, reason: collision with root package name */
    private final j.a f5151d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5152e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5153f;

    /* renamed from: g, reason: collision with root package name */
    private final W0.a f5154g;

    /* renamed from: h, reason: collision with root package name */
    private final W0.a f5155h;

    /* renamed from: i, reason: collision with root package name */
    private final W0.a f5156i;

    /* renamed from: j, reason: collision with root package name */
    private final W0.a f5157j;

    /* renamed from: k, reason: collision with root package name */
    private final W0.a f5158k;

    /* renamed from: l, reason: collision with root package name */
    private final W0.a f5159l;

    /* renamed from: m, reason: collision with root package name */
    private final W0.a f5160m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5162o;

    /* renamed from: a, reason: collision with root package name */
    private final Path f5148a = new Path();

    /* renamed from: n, reason: collision with root package name */
    private final b f5161n = new b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5163a;

        static {
            int[] iArr = new int[j.a.values().length];
            f5163a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5163a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.j jVar) {
        this.f5150c = pVar;
        this.f5149b = jVar.getName();
        j.a type = jVar.getType();
        this.f5151d = type;
        this.f5152e = jVar.isHidden();
        this.f5153f = jVar.isReversed();
        W0.a aVarCreateAnimation = jVar.getPoints().createAnimation();
        this.f5154g = aVarCreateAnimation;
        W0.a aVarCreateAnimation2 = jVar.getPosition().createAnimation();
        this.f5155h = aVarCreateAnimation2;
        W0.a aVarCreateAnimation3 = jVar.getRotation().createAnimation();
        this.f5156i = aVarCreateAnimation3;
        W0.a aVarCreateAnimation4 = jVar.getOuterRadius().createAnimation();
        this.f5158k = aVarCreateAnimation4;
        W0.a aVarCreateAnimation5 = jVar.getOuterRoundedness().createAnimation();
        this.f5160m = aVarCreateAnimation5;
        j.a aVar = j.a.STAR;
        if (type == aVar) {
            this.f5157j = jVar.getInnerRadius().createAnimation();
            this.f5159l = jVar.getInnerRoundedness().createAnimation();
        } else {
            this.f5157j = null;
            this.f5159l = null;
        }
        abstractC1064b.addAnimation(aVarCreateAnimation);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
        abstractC1064b.addAnimation(aVarCreateAnimation4);
        abstractC1064b.addAnimation(aVarCreateAnimation5);
        if (type == aVar) {
            abstractC1064b.addAnimation(this.f5157j);
            abstractC1064b.addAnimation(this.f5159l);
        }
        aVarCreateAnimation.addUpdateListener(this);
        aVarCreateAnimation2.addUpdateListener(this);
        aVarCreateAnimation3.addUpdateListener(this);
        aVarCreateAnimation4.addUpdateListener(this);
        aVarCreateAnimation5.addUpdateListener(this);
        if (type == aVar) {
            this.f5157j.addUpdateListener(this);
            this.f5159l.addUpdateListener(this);
        }
    }

    private void a() {
        int i8;
        double d9;
        double d10;
        double d11;
        int iFloor = (int) Math.floor(((Float) this.f5154g.getValue()).floatValue());
        double radians = Math.toRadians((this.f5156i == null ? 0.0d : ((Float) r2.getValue()).floatValue()) - 90.0d);
        double d12 = iFloor;
        float fFloatValue = ((Float) this.f5160m.getValue()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.f5158k.getValue()).floatValue();
        double d13 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d13);
        float fSin = (float) (Math.sin(radians) * d13);
        this.f5148a.moveTo(fCos, fSin);
        double d14 = (float) (6.283185307179586d / d12);
        double d15 = radians + d14;
        double dCeil = Math.ceil(d12);
        int i9 = 0;
        while (i9 < dCeil) {
            float fCos2 = (float) (Math.cos(d15) * d13);
            double d16 = dCeil;
            float fSin2 = (float) (d13 * Math.sin(d15));
            if (fFloatValue != 0.0f) {
                d10 = d13;
                i8 = i9;
                d9 = d15;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d11 = d14;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f8 = fFloatValue2 * fFloatValue * 0.25f;
                this.f5148a.cubicTo(fCos - (fCos3 * f8), fSin - (fSin3 * f8), fCos2 + (((float) Math.cos(dAtan22)) * f8), fSin2 + (f8 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                i8 = i9;
                d9 = d15;
                d10 = d13;
                d11 = d14;
                this.f5148a.lineTo(fCos2, fSin2);
            }
            d15 = d9 + d11;
            i9 = i8 + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d16;
            d13 = d10;
            d14 = d11;
        }
        PointF pointF = (PointF) this.f5155h.getValue();
        this.f5148a.offset(pointF.x, pointF.y);
        this.f5148a.close();
    }

    private void b() {
        int i8;
        float f8;
        float f9;
        double d9;
        float fSin;
        float f10;
        float f11;
        float f12;
        double d10;
        float f13;
        float f14;
        float f15;
        double d11;
        float fFloatValue = ((Float) this.f5154g.getValue()).floatValue();
        double radians = Math.toRadians((this.f5156i == null ? 0.0d : ((Float) r2.getValue()).floatValue()) - 90.0d);
        double d12 = fFloatValue;
        float f16 = (float) (6.283185307179586d / d12);
        if (this.f5153f) {
            f16 *= -1.0f;
        }
        float f17 = f16 / 2.0f;
        float f18 = fFloatValue - ((int) fFloatValue);
        int i9 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i9 != 0) {
            radians += (1.0f - f18) * f17;
        }
        float fFloatValue2 = ((Float) this.f5158k.getValue()).floatValue();
        float fFloatValue3 = ((Float) this.f5157j.getValue()).floatValue();
        W0.a aVar = this.f5159l;
        float fFloatValue4 = aVar != null ? ((Float) aVar.getValue()).floatValue() / 100.0f : 0.0f;
        W0.a aVar2 = this.f5160m;
        float fFloatValue5 = aVar2 != null ? ((Float) aVar2.getValue()).floatValue() / 100.0f : 0.0f;
        if (i9 != 0) {
            f10 = ((fFloatValue2 - fFloatValue3) * f18) + fFloatValue3;
            i8 = i9;
            double d13 = f10;
            float fCos = (float) (d13 * Math.cos(radians));
            fSin = (float) (d13 * Math.sin(radians));
            this.f5148a.moveTo(fCos, fSin);
            d9 = radians + ((f16 * f18) / 2.0f);
            f8 = fCos;
            f9 = f17;
        } else {
            i8 = i9;
            double d14 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d14);
            float fSin2 = (float) (d14 * Math.sin(radians));
            this.f5148a.moveTo(fCos2, fSin2);
            f8 = fCos2;
            f9 = f17;
            d9 = radians + f9;
            fSin = fSin2;
            f10 = 0.0f;
        }
        double dCeil = Math.ceil(d12) * 2.0d;
        int i10 = 0;
        float f19 = f9;
        float f20 = f8;
        boolean z8 = false;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointF = (PointF) this.f5155h.getValue();
                this.f5148a.offset(pointF.x, pointF.y);
                this.f5148a.close();
                return;
            }
            float f21 = z8 ? fFloatValue2 : fFloatValue3;
            if (f10 == 0.0f || d15 != dCeil - 2.0d) {
                f11 = f16;
                f12 = f19;
            } else {
                f11 = f16;
                f12 = (f16 * f18) / 2.0f;
            }
            if (f10 == 0.0f || d15 != dCeil - 1.0d) {
                d10 = d15;
                f13 = f10;
                f10 = f21;
            } else {
                d10 = d15;
                f13 = f10;
            }
            double d16 = f10;
            double d17 = dCeil;
            float fCos3 = (float) (d16 * Math.cos(d9));
            float fSin3 = (float) (d16 * Math.sin(d9));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f5148a.lineTo(fCos3, fSin3);
                d11 = d9;
                f14 = fFloatValue4;
                f15 = fFloatValue5;
            } else {
                f14 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f20) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f15 = fFloatValue5;
                d11 = d9;
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f22 = z8 ? f14 : f15;
                float f23 = z8 ? f15 : f14;
                float f24 = (z8 ? fFloatValue3 : fFloatValue2) * f22 * 0.47829f;
                float f25 = fCos4 * f24;
                float f26 = f24 * fSin4;
                float f27 = (z8 ? fFloatValue2 : fFloatValue3) * f23 * 0.47829f;
                float f28 = fCos5 * f27;
                float f29 = f27 * fSin5;
                if (i8 != 0) {
                    if (i10 == 0) {
                        f25 *= f18;
                        f26 *= f18;
                    } else if (d10 == d17 - 1.0d) {
                        f28 *= f18;
                        f29 *= f18;
                    }
                }
                this.f5148a.cubicTo(f20 - f25, fSin - f26, fCos3 + f28, fSin3 + f29, fCos3, fSin3);
            }
            d9 = d11 + f12;
            z8 = !z8;
            i10++;
            f20 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f15;
            fFloatValue4 = f14;
            f10 = f13;
            f16 = f11;
            dCeil = d17;
        }
    }

    private void c() {
        this.f5162o = false;
        this.f5150c.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        W0.a aVar;
        W0.a aVar2;
        if (t8 == y.POLYSTAR_POINTS) {
            this.f5154g.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.POLYSTAR_ROTATION) {
            this.f5156i.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.POSITION) {
            this.f5155h.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.POLYSTAR_INNER_RADIUS && (aVar2 = this.f5157j) != null) {
            aVar2.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.POLYSTAR_OUTER_RADIUS) {
            this.f5158k.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.POLYSTAR_INNER_ROUNDEDNESS && (aVar = this.f5159l) != null) {
            aVar.setValueCallback(c5536c);
        } else if (t8 == y.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.f5160m.setValueCallback(c5536c);
        }
    }

    @Override // V0.m, V0.c, V0.e
    public String getName() {
        return this.f5149b;
    }

    @Override // V0.m
    public Path getPath() {
        if (this.f5162o) {
            return this.f5148a;
        }
        this.f5148a.reset();
        if (this.f5152e) {
            this.f5162o = true;
            return this.f5148a;
        }
        int i8 = a.f5163a[this.f5151d.ordinal()];
        if (i8 == 1) {
            b();
        } else if (i8 == 2) {
            a();
        }
        this.f5148a.close();
        this.f5161n.apply(this.f5148a);
        this.f5162o = true;
        return this.f5148a;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        c();
    }

    @Override // V0.k, Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        f1.i.resolveKeyPath(eVar, i8, list, eVar2, this);
    }

    @Override // V0.m, V0.c, V0.e
    public void setContents(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            c cVar = list.get(i8);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.b() == s.a.SIMULTANEOUSLY) {
                    this.f5161n.a(uVar);
                    uVar.a(this);
                }
            }
        }
    }
}
