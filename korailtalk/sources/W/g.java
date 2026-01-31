package w;

import java.util.ArrayList;
import u.C6372C;
import z.z0;

/* loaded from: classes.dex */
public abstract class g {
    public static z0 get(String str, C6372C c6372c) {
        ArrayList arrayList = new ArrayList();
        if (C6455a.b(c6372c)) {
            arrayList.add(new C6455a(c6372c));
        }
        if (c.a(c6372c)) {
            arrayList.add(new c());
        }
        if (p.a(c6372c)) {
            arrayList.add(new p());
        }
        if (e.a(c6372c)) {
            arrayList.add(new e(c6372c));
        }
        if (o.a(c6372c)) {
            arrayList.add(new o());
        }
        if (f.a(c6372c)) {
            arrayList.add(new f());
        }
        if (v.d(c6372c)) {
            arrayList.add(new v());
        }
        if (m.a(c6372c)) {
            arrayList.add(new m());
        }
        if (C6456b.a(c6372c)) {
            arrayList.add(new C6456b());
        }
        return new z0(arrayList);
    }
}
