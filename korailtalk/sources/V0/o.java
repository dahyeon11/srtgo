package V0;

import T0.y;
import W0.a;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f5166c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5167d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.p f5168e;

    /* renamed from: f, reason: collision with root package name */
    private final W0.a f5169f;

    /* renamed from: g, reason: collision with root package name */
    private final W0.a f5170g;

    /* renamed from: h, reason: collision with root package name */
    private final W0.a f5171h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5174k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f5164a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f5165b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f5172i = new b();

    /* renamed from: j, reason: collision with root package name */
    private W0.a f5173j = null;

    public o(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.k kVar) {
        this.f5166c = kVar.getName();
        this.f5167d = kVar.isHidden();
        this.f5168e = pVar;
        W0.a aVarCreateAnimation = kVar.getPosition().createAnimation();
        this.f5169f = aVarCreateAnimation;
        W0.a aVarCreateAnimation2 = kVar.getSize().createAnimation();
        this.f5170g = aVarCreateAnimation2;
        W0.a aVarCreateAnimation3 = kVar.getCornerRadius().createAnimation();
        this.f5171h = aVarCreateAnimation3;
        abstractC1064b.addAnimation(aVarCreateAnimation);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
        aVarCreateAnimation.addUpdateListener(this);
        aVarCreateAnimation2.addUpdateListener(this);
        aVarCreateAnimation3.addUpdateListener(this);
    }

    private void a() {
        this.f5174k = false;
        this.f5168e.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        if (t8 == y.RECTANGLE_SIZE) {
            this.f5170g.setValueCallback(c5536c);
        } else if (t8 == y.POSITION) {
            this.f5169f.setValueCallback(c5536c);
        } else if (t8 == y.CORNER_RADIUS) {
            this.f5171h.setValueCallback(c5536c);
        }
    }

    @Override // V0.k, V0.c, V0.e
    public String getName() {
        return this.f5166c;
    }

    @Override // V0.m
    public Path getPath() {
        W0.a aVar;
        if (this.f5174k) {
            return this.f5164a;
        }
        this.f5164a.reset();
        if (this.f5167d) {
            this.f5174k = true;
            return this.f5164a;
        }
        PointF pointF = (PointF) this.f5170g.getValue();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        W0.a aVar2 = this.f5171h;
        float floatValue = aVar2 == null ? 0.0f : ((W0.d) aVar2).getFloatValue();
        if (floatValue == 0.0f && (aVar = this.f5173j) != null) {
            floatValue = Math.min(((Float) aVar.getValue()).floatValue(), Math.min(f8, f9));
        }
        float fMin = Math.min(f8, f9);
        if (floatValue > fMin) {
            floatValue = fMin;
        }
        PointF pointF2 = (PointF) this.f5169f.getValue();
        this.f5164a.moveTo(pointF2.x + f8, (pointF2.y - f9) + floatValue);
        this.f5164a.lineTo(pointF2.x + f8, (pointF2.y + f9) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.f5165b;
            float f10 = pointF2.x;
            float f11 = floatValue * 2.0f;
            float f12 = pointF2.y;
            rectF.set((f10 + f8) - f11, (f12 + f9) - f11, f10 + f8, f12 + f9);
            this.f5164a.arcTo(this.f5165b, 0.0f, 90.0f, false);
        }
        this.f5164a.lineTo((pointF2.x - f8) + floatValue, pointF2.y + f9);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.f5165b;
            float f13 = pointF2.x;
            float f14 = pointF2.y;
            float f15 = floatValue * 2.0f;
            rectF2.set(f13 - f8, (f14 + f9) - f15, (f13 - f8) + f15, f14 + f9);
            this.f5164a.arcTo(this.f5165b, 90.0f, 90.0f, false);
        }
        this.f5164a.lineTo(pointF2.x - f8, (pointF2.y - f9) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.f5165b;
            float f16 = pointF2.x;
            float f17 = pointF2.y;
            float f18 = floatValue * 2.0f;
            rectF3.set(f16 - f8, f17 - f9, (f16 - f8) + f18, (f17 - f9) + f18);
            this.f5164a.arcTo(this.f5165b, 180.0f, 90.0f, false);
        }
        this.f5164a.lineTo((pointF2.x + f8) - floatValue, pointF2.y - f9);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.f5165b;
            float f19 = pointF2.x;
            float f20 = floatValue * 2.0f;
            float f21 = pointF2.y;
            rectF4.set((f19 + f8) - f20, f21 - f9, f19 + f8, (f21 - f9) + f20);
            this.f5164a.arcTo(this.f5165b, 270.0f, 90.0f, false);
        }
        this.f5164a.close();
        this.f5172i.apply(this.f5164a);
        this.f5174k = true;
        return this.f5164a;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        a();
    }

    @Override // V0.k, Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        f1.i.resolveKeyPath(eVar, i8, list, eVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // V0.k, V0.c, V0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<V0.c> r5, java.util.List<V0.c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            V0.c r0 = (V0.c) r0
            boolean r1 = r0 instanceof V0.u
            if (r1 == 0) goto L25
            r1 = r0
            V0.u r1 = (V0.u) r1
            a1.s$a r2 = r1.b()
            a1.s$a r3 = a1.s.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            V0.b r0 = r4.f5172i
            r0.a(r1)
            r1.a(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof V0.q
            if (r1 == 0) goto L31
            V0.q r0 = (V0.q) r0
            W0.a r0 = r0.getRoundedCorners()
            r4.f5173j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.o.setContents(java.util.List, java.util.List):void");
    }
}
