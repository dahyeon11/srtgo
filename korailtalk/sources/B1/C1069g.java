package b1;

import a1.C0824a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.p;
import d1.C5315j;
import java.util.Collections;
import java.util.List;

/* renamed from: b1.g */
/* loaded from: classes.dex */
public class C1069g extends AbstractC1064b {

    /* renamed from: D */
    private final V0.d f11363D;

    /* renamed from: E */
    private final C1065c f11364E;

    C1069g(p pVar, C1067e c1067e, C1065c c1065c) {
        super(pVar, c1067e);
        this.f11364E = c1065c;
        V0.d dVar = new V0.d(pVar, this, new a1.p("__container", c1067e.j(), false));
        this.f11363D = dVar;
        dVar.setContents(Collections.emptyList(), Collections.emptyList());
    }

    @Override // b1.AbstractC1064b
    void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        this.f11363D.draw(canvas, matrix, i8);
    }

    @Override // b1.AbstractC1064b
    public C0824a getBlurEffect() {
        C0824a blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.f11364E.getBlurEffect();
    }

    @Override // b1.AbstractC1064b, V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        super.getBounds(rectF, matrix, z8);
        this.f11363D.getBounds(rectF, this.f11308o, z8);
    }

    @Override // b1.AbstractC1064b
    public C5315j getDropShadowEffect() {
        C5315j dropShadowEffect = super.getDropShadowEffect();
        return dropShadowEffect != null ? dropShadowEffect : this.f11364E.getDropShadowEffect();
    }

    @Override // b1.AbstractC1064b
    protected void u(Y0.e eVar, int i8, List list, Y0.e eVar2) {
        this.f11363D.resolveKeyPath(eVar, i8, list, eVar2);
    }
}
