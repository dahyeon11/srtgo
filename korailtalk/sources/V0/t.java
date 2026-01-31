package V0;

import T0.y;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import b1.AbstractC1064b;
import g1.C5536c;

/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC1064b f5196r;

    /* renamed from: s, reason: collision with root package name */
    private final String f5197s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f5198t;

    /* renamed from: u, reason: collision with root package name */
    private final W0.a f5199u;

    /* renamed from: v, reason: collision with root package name */
    private W0.a f5200v;

    public t(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.r rVar) {
        super(pVar, abstractC1064b, rVar.getCapType().toPaintCap(), rVar.getJoinType().toPaintJoin(), rVar.getMiterLimit(), rVar.getOpacity(), rVar.getWidth(), rVar.getLineDashPattern(), rVar.getDashOffset());
        this.f5196r = abstractC1064b;
        this.f5197s = rVar.getName();
        this.f5198t = rVar.isHidden();
        W0.a aVarCreateAnimation = rVar.getColor().createAnimation();
        this.f5199u = aVarCreateAnimation;
        aVarCreateAnimation.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation);
    }

    @Override // V0.a, V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.STROKE_COLOR) {
            this.f5199u.setValueCallback(c5536c);
            return;
        }
        if (t8 == y.COLOR_FILTER) {
            W0.a aVar = this.f5200v;
            if (aVar != null) {
                this.f5196r.removeAnimation(aVar);
            }
            if (c5536c == null) {
                this.f5200v = null;
                return;
            }
            W0.q qVar = new W0.q(c5536c);
            this.f5200v = qVar;
            qVar.addUpdateListener(this);
            this.f5196r.addAnimation(this.f5199u);
        }
    }

    @Override // V0.a, V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.f5198t) {
            return;
        }
        this.f5065i.setColor(((W0.b) this.f5199u).getIntValue());
        W0.a aVar = this.f5200v;
        if (aVar != null) {
            this.f5065i.setColorFilter((ColorFilter) aVar.getValue());
        }
        super.draw(canvas, matrix, i8);
    }

    @Override // V0.a, V0.k, V0.c, V0.e
    public String getName() {
        return this.f5197s;
    }
}
