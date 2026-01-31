package Z0;

import g1.C5534a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class n implements m {

    /* renamed from: a, reason: collision with root package name */
    final List f5706a;

    n(Object obj) {
        this(Collections.singletonList(new C5534a(obj)));
    }

    @Override // Z0.m
    public abstract /* synthetic */ W0.a createAnimation();

    @Override // Z0.m
    public List<C5534a> getKeyframes() {
        return this.f5706a;
    }

    @Override // Z0.m
    public boolean isStatic() {
        if (this.f5706a.isEmpty()) {
            return true;
        }
        return this.f5706a.size() == 1 && ((C5534a) this.f5706a.get(0)).isStatic();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f5706a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f5706a.toArray()));
        }
        return sb.toString();
    }

    n(List list) {
        this.f5706a = list;
    }
}
