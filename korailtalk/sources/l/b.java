package L;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {
    static List a() {
        ArrayList arrayList = new ArrayList();
        if (d.b()) {
            arrayList.add(new d());
        }
        if (c.a()) {
            arrayList.add(new c());
        }
        return arrayList;
    }
}
