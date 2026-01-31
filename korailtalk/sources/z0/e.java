package Z0;

import g1.C5534a;
import java.util.List;

/* loaded from: classes.dex */
public class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private final List f5694a;

    public e(List<C5534a> list) {
        this.f5694a = list;
    }

    @Override // Z0.m
    public W0.a createAnimation() {
        return ((C5534a) this.f5694a.get(0)).isStatic() ? new W0.k(this.f5694a) : new W0.j(this.f5694a);
    }

    @Override // Z0.m
    public List<C5534a> getKeyframes() {
        return this.f5694a;
    }

    @Override // Z0.m
    public boolean isStatic() {
        return this.f5694a.size() == 1 && ((C5534a) this.f5694a.get(0)).isStatic();
    }
}
