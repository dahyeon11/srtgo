package z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f37850a;

    public z0(List<y0> list) {
        this.f37850a = new ArrayList(list);
    }

    public boolean contains(Class<? extends y0> cls) {
        Iterator it = this.f37850a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((y0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends y0> T get(Class<T> cls) {
        for (T t8 : this.f37850a) {
            if (t8.getClass() == cls) {
                return t8;
            }
        }
        return null;
    }
}
