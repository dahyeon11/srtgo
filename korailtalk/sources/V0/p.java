package V0;

import T0.y;
import W0.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f5175a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f5176b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f5177c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1064b f5178d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5179e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5180f;

    /* renamed from: g, reason: collision with root package name */
    private final W0.a f5181g;

    /* renamed from: h, reason: collision with root package name */
    private final W0.a f5182h;

    /* renamed from: i, reason: collision with root package name */
    private final W0.p f5183i;

    /* renamed from: j, reason: collision with root package name */
    private d f5184j;

    public p(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.l lVar) {
        this.f5177c = pVar;
        this.f5178d = abstractC1064b;
        this.f5179e = lVar.getName();
        this.f5180f = lVar.isHidden();
        W0.a aVarCreateAnimation = lVar.getCopies().createAnimation();
        this.f5181g = aVarCreateAnimation;
        abstractC1064b.addAnimation(aVarCreateAnimation);
        aVarCreateAnimation.addUpdateListener(this);
        W0.a aVarCreateAnimation2 = lVar.getOffset().createAnimation();
        this.f5182h = aVarCreateAnimation2;
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        aVarCreateAnimation2.addUpdateListener(this);
        W0.p pVarCreateAnimation = lVar.getTransform().createAnimation();
        this.f5183i = pVarCreateAnimation;
        pVarCreateAnimation.addAnimationsToLayer(abstractC1064b);
        pVarCreateAnimation.addListener(this);
    }

    @Override // V0.j
    public void absorbContent(ListIterator<c> listIterator) {
        if (this.f5184j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f5184j = new d(this.f5177c, this.f5178d, "Repeater", this.f5180f, arrayList, null);
    }

    @Override // V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        if (this.f5183i.applyValueCallback(t8, c5536c)) {
            return;
        }
        if (t8 == y.REPEATER_COPIES) {
            this.f5181g.setValueCallback(c5536c);
        } else if (t8 == y.REPEATER_OFFSET) {
            this.f5182h.setValueCallback(c5536c);
        }
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        float fFloatValue = ((Float) this.f5181g.getValue()).floatValue();
        float fFloatValue2 = ((Float) this.f5182h.getValue()).floatValue();
        float fFloatValue3 = ((Float) this.f5183i.getStartOpacity().getValue()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f5183i.getEndOpacity().getValue()).floatValue() / 100.0f;
        for (int i9 = ((int) fFloatValue) - 1; i9 >= 0; i9--) {
            this.f5175a.set(matrix);
            float f8 = i9;
            this.f5175a.preConcat(this.f5183i.getMatrixForRepeater(f8 + fFloatValue2));
            this.f5184j.draw(canvas, this.f5175a, (int) (i8 * f1.i.lerp(fFloatValue3, fFloatValue4, f8 / fFloatValue)));
        }
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        this.f5184j.getBounds(rectF, matrix, z8);
    }

    @Override // V0.e
    public String getName() {
        return this.f5179e;
    }

    @Override // V0.m
    public Path getPath() {
        Path path = this.f5184j.getPath();
        this.f5176b.reset();
        float fFloatValue = ((Float) this.f5181g.getValue()).floatValue();
        float fFloatValue2 = ((Float) this.f5182h.getValue()).floatValue();
        for (int i8 = ((int) fFloatValue) - 1; i8 >= 0; i8--) {
            this.f5175a.set(this.f5183i.getMatrixForRepeater(i8 + fFloatValue2));
            this.f5176b.addPath(path, this.f5175a);
        }
        return this.f5176b;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5177c.invalidateSelf();
    }

    @Override // V0.k, Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        f1.i.resolveKeyPath(eVar, i8, list, eVar2, this);
    }

    @Override // V0.e
    public void setContents(List<c> list, List<c> list2) {
        this.f5184j.setContents(list, list2);
    }
}
