package W0;

import a1.C0827d;
import g1.C5534a;
import java.util.List;

/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: i, reason: collision with root package name */
    private final C0827d f5262i;

    public e(List<C5534a> list) {
        super(list);
        C0827d c0827d = (C0827d) list.get(0).startValue;
        int size = c0827d != null ? c0827d.getSize() : 0;
        this.f5262i = new C0827d(new float[size], new int[size]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W0.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0827d getValue(C5534a c5534a, float f8) {
        this.f5262i.lerp((C0827d) c5534a.startValue, (C0827d) c5534a.endValue, f8);
        return this.f5262i;
    }
}
