package x;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import w.s;
import z.H0;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final s f37489a;

    public l() {
        this((s) w.i.get(s.class));
    }

    public List<Size> insertOrPrioritize(H0.b bVar, List<Size> list) {
        Size sizeSelectResolution;
        s sVar = this.f37489a;
        if (sVar == null || (sizeSelectResolution = sVar.selectResolution(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeSelectResolution);
        for (Size size : list) {
            if (!size.equals(sizeSelectResolution)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    l(s sVar) {
        this.f37489a = sVar;
    }
}
