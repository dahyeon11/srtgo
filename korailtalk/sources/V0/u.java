package V0;

import W0.a;
import a1.s;
import b1.AbstractC1064b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5201a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5202b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5203c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final s.a f5204d;

    /* renamed from: e, reason: collision with root package name */
    private final W0.a f5205e;

    /* renamed from: f, reason: collision with root package name */
    private final W0.a f5206f;

    /* renamed from: g, reason: collision with root package name */
    private final W0.a f5207g;

    public u(AbstractC1064b abstractC1064b, a1.s sVar) {
        this.f5201a = sVar.getName();
        this.f5202b = sVar.isHidden();
        this.f5204d = sVar.getType();
        W0.a aVarCreateAnimation = sVar.getStart().createAnimation();
        this.f5205e = aVarCreateAnimation;
        W0.a aVarCreateAnimation2 = sVar.getEnd().createAnimation();
        this.f5206f = aVarCreateAnimation2;
        W0.a aVarCreateAnimation3 = sVar.getOffset().createAnimation();
        this.f5207g = aVarCreateAnimation3;
        abstractC1064b.addAnimation(aVarCreateAnimation);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
        aVarCreateAnimation.addUpdateListener(this);
        aVarCreateAnimation2.addUpdateListener(this);
        aVarCreateAnimation3.addUpdateListener(this);
    }

    void a(a.b bVar) {
        this.f5203c.add(bVar);
    }

    s.a b() {
        return this.f5204d;
    }

    public W0.a getEnd() {
        return this.f5206f;
    }

    @Override // V0.c, V0.e
    public String getName() {
        return this.f5201a;
    }

    public W0.a getOffset() {
        return this.f5207g;
    }

    public W0.a getStart() {
        return this.f5205e;
    }

    public boolean isHidden() {
        return this.f5202b;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        for (int i8 = 0; i8 < this.f5203c.size(); i8++) {
            ((a.b) this.f5203c.get(i8)).onValueChanged();
        }
    }

    @Override // V0.c, V0.e
    public void setContents(List<c> list, List<c> list2) {
    }
}
