package x;

import java.util.ArrayList;
import java.util.List;
import z.G0;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final w.l f37484a = (w.l) w.i.get(w.l.class);

    public List<G0> get(String str, int i8) {
        w.l lVar = this.f37484a;
        return lVar == null ? new ArrayList() : lVar.getExtraSupportedSurfaceCombinations(str, i8);
    }
}
