package V0;

import W0.a;
import android.graphics.PointF;
import b1.AbstractC1064b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a */
    private final com.airbnb.lottie.p f5185a;

    /* renamed from: b */
    private final String f5186b;

    /* renamed from: c */
    private final W0.a f5187c;

    /* renamed from: d */
    private a1.n f5188d;

    public q(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.m mVar) {
        this.f5185a = pVar;
        this.f5186b = mVar.getName();
        W0.a aVarCreateAnimation = mVar.getCornerRadius().createAnimation();
        this.f5187c = aVarCreateAnimation;
        abstractC1064b.addAnimation(aVarCreateAnimation);
        aVarCreateAnimation.addUpdateListener(this);
    }

    private static int a(int i8, int i9) {
        int i10 = i8 / i9;
        return ((i8 ^ i9) >= 0 || i9 * i10 == i8) ? i10 : i10 - 1;
    }

    private static int b(int i8, int i9) {
        return i8 - (a(i8, i9) * i9);
    }

    private a1.n c(a1.n nVar) {
        List<Y0.a> curves = nVar.getCurves();
        boolean zIsClosed = nVar.isClosed();
        int size = curves.size() - 1;
        int i8 = 0;
        while (size >= 0) {
            Y0.a aVar = curves.get(size);
            Y0.a aVar2 = curves.get(b(size - 1, curves.size()));
            PointF vertex = (size != 0 || zIsClosed) ? aVar2.getVertex() : nVar.getInitialPoint();
            i8 = (((size != 0 || zIsClosed) ? aVar2.getControlPoint2() : vertex).equals(vertex) && aVar.getControlPoint1().equals(vertex) && !(!nVar.isClosed() && size == 0 && size == curves.size() - 1)) ? i8 + 2 : i8 + 1;
            size--;
        }
        a1.n nVar2 = this.f5188d;
        if (nVar2 == null || nVar2.getCurves().size() != i8) {
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                arrayList.add(new Y0.a());
            }
            this.f5188d = new a1.n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f5188d.setClosed(zIsClosed);
        return this.f5188d;
    }

    @Override // V0.s, V0.c, V0.e
    public String getName() {
        return this.f5186b;
    }

    public W0.a getRoundedCorners() {
        return this.f5187c;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x009f  */
    @Override // V0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a1.n modifyShape(a1.n r19) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.q.modifyShape(a1.n):a1.n");
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5185a.invalidateSelf();
    }

    @Override // V0.s, V0.c, V0.e
    public void setContents(List<c> list, List<c> list2) {
    }
}
