package Z0;

import g1.C5534a;
import java.util.List;

/* loaded from: classes.dex */
public class i implements m {

    /* renamed from: a, reason: collision with root package name */
    private final b f5695a;

    /* renamed from: b, reason: collision with root package name */
    private final b f5696b;

    public i(b bVar, b bVar2) {
        this.f5695a = bVar;
        this.f5696b = bVar2;
    }

    @Override // Z0.m
    public W0.a createAnimation() {
        return new W0.n(this.f5695a.createAnimation(), this.f5696b.createAnimation());
    }

    @Override // Z0.m
    public List<C5534a> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // Z0.m
    public boolean isStatic() {
        return this.f5695a.isStatic() && this.f5696b.isStatic();
    }
}
