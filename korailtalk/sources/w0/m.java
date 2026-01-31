package W0;

import V0.s;
import android.graphics.Path;
import g1.C5534a;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: i, reason: collision with root package name */
    private final a1.n f5274i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f5275j;

    /* renamed from: k, reason: collision with root package name */
    private List f5276k;

    public m(List<C5534a> list) {
        super(list);
        this.f5274i = new a1.n();
        this.f5275j = new Path();
    }

    public void setShapeModifiers(List<s> list) {
        this.f5276k = list;
    }

    @Override // W0.a
    public Path getValue(C5534a c5534a, float f8) {
        this.f5274i.interpolateBetween((a1.n) c5534a.startValue, (a1.n) c5534a.endValue, f8);
        a1.n nVarModifyShape = this.f5274i;
        List list = this.f5276k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVarModifyShape = ((s) this.f5276k.get(size)).modifyShape(nVarModifyShape);
            }
        }
        f1.i.getPathFromData(nVarModifyShape, this.f5275j);
        return this.f5275j;
    }
}
