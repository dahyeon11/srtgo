package V0;

import T0.y;
import W0.a;
import a1.C0825b;
import a1.s;
import android.graphics.Path;
import android.graphics.PointF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.List;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f5089b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f5090c;

    /* renamed from: d, reason: collision with root package name */
    private final W0.a f5091d;

    /* renamed from: e, reason: collision with root package name */
    private final W0.a f5092e;

    /* renamed from: f, reason: collision with root package name */
    private final C0825b f5093f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5095h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f5088a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f5094g = new b();

    public f(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, C0825b c0825b) {
        this.f5089b = c0825b.getName();
        this.f5090c = pVar;
        W0.a aVarCreateAnimation = c0825b.getSize().createAnimation();
        this.f5091d = aVarCreateAnimation;
        W0.a aVarCreateAnimation2 = c0825b.getPosition().createAnimation();
        this.f5092e = aVarCreateAnimation2;
        this.f5093f = c0825b;
        abstractC1064b.addAnimation(aVarCreateAnimation);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        aVarCreateAnimation.addUpdateListener(this);
        aVarCreateAnimation2.addUpdateListener(this);
    }

    private void a() {
        this.f5095h = false;
        this.f5090c.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        if (t8 == y.ELLIPSE_SIZE) {
            this.f5091d.setValueCallback(c5536c);
        } else if (t8 == y.POSITION) {
            this.f5092e.setValueCallback(c5536c);
        }
    }

    @Override // V0.m, V0.c, V0.e
    public String getName() {
        return this.f5089b;
    }

    @Override // V0.m
    public Path getPath() {
        if (this.f5095h) {
            return this.f5088a;
        }
        this.f5088a.reset();
        if (this.f5093f.isHidden()) {
            this.f5095h = true;
            return this.f5088a;
        }
        PointF pointF = (PointF) this.f5091d.getValue();
        float f8 = pointF.x / 2.0f;
        float f9 = pointF.y / 2.0f;
        float f10 = f8 * 0.55228f;
        float f11 = 0.55228f * f9;
        this.f5088a.reset();
        if (this.f5093f.isReversed()) {
            float f12 = -f9;
            this.f5088a.moveTo(0.0f, f12);
            float f13 = 0.0f - f10;
            float f14 = -f8;
            float f15 = 0.0f - f11;
            this.f5088a.cubicTo(f13, f12, f14, f15, f14, 0.0f);
            float f16 = f11 + 0.0f;
            this.f5088a.cubicTo(f14, f16, f13, f9, 0.0f, f9);
            float f17 = f10 + 0.0f;
            this.f5088a.cubicTo(f17, f9, f8, f16, f8, 0.0f);
            this.f5088a.cubicTo(f8, f15, f17, f12, 0.0f, f12);
        } else {
            float f18 = -f9;
            this.f5088a.moveTo(0.0f, f18);
            float f19 = f10 + 0.0f;
            float f20 = 0.0f - f11;
            this.f5088a.cubicTo(f19, f18, f8, f20, f8, 0.0f);
            float f21 = f11 + 0.0f;
            this.f5088a.cubicTo(f8, f21, f19, f9, 0.0f, f9);
            float f22 = 0.0f - f10;
            float f23 = -f8;
            this.f5088a.cubicTo(f22, f9, f23, f21, f23, 0.0f);
            this.f5088a.cubicTo(f23, f20, f22, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f5092e.getValue();
        this.f5088a.offset(pointF2.x, pointF2.y);
        this.f5088a.close();
        this.f5094g.apply(this.f5088a);
        this.f5095h = true;
        return this.f5088a;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        a();
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
                    this.f5094g.a(uVar);
                    uVar.a(this);
                }
            }
        }
    }
}
