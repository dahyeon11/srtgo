package V0;

import W0.a;
import android.graphics.Path;
import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class r implements m, a.b {

    /* renamed from: b */
    private final String f5190b;

    /* renamed from: c */
    private final boolean f5191c;

    /* renamed from: d */
    private final com.airbnb.lottie.p f5192d;

    /* renamed from: e */
    private final W0.m f5193e;

    /* renamed from: f */
    private boolean f5194f;

    /* renamed from: a */
    private final Path f5189a = new Path();

    /* renamed from: g */
    private final b f5195g = new b();

    public r(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.q qVar) {
        this.f5190b = qVar.getName();
        this.f5191c = qVar.isHidden();
        this.f5192d = pVar;
        W0.m mVarCreateAnimation = qVar.getShapePath().createAnimation();
        this.f5193e = mVarCreateAnimation;
        abstractC1064b.addAnimation(mVarCreateAnimation);
        mVarCreateAnimation.addUpdateListener(this);
    }

    private void a() {
        this.f5194f = false;
        this.f5192d.invalidateSelf();
    }

    @Override // V0.m, V0.c, V0.e
    public String getName() {
        return this.f5190b;
    }

    @Override // V0.m
    public Path getPath() {
        if (this.f5194f) {
            return this.f5189a;
        }
        this.f5189a.reset();
        if (this.f5191c) {
            this.f5194f = true;
            return this.f5189a;
        }
        Path path = (Path) this.f5193e.getValue();
        if (path == null) {
            return this.f5189a;
        }
        this.f5189a.set(path);
        this.f5189a.setFillType(Path.FillType.EVEN_ODD);
        this.f5195g.apply(this.f5189a);
        this.f5194f = true;
        return this.f5189a;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0026  */
    @Override // V0.m, V0.c, V0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setContents(java.util.List<V0.c> r6, java.util.List<V0.c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            V0.c r1 = (V0.c) r1
            boolean r2 = r1 instanceof V0.u
            if (r2 == 0) goto L26
            r2 = r1
            V0.u r2 = (V0.u) r2
            a1.s$a r3 = r2.b()
            a1.s$a r4 = a1.s.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            V0.b r1 = r5.f5195g
            r1.a(r2)
            r2.a(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof V0.s
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            V0.s r1 = (V0.s) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            W0.m r6 = r5.f5193e
            r6.setShapeModifiers(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.r.setContents(java.util.List, java.util.List):void");
    }
}
