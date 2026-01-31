package n3;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class p extends q {

    /* renamed from: a, reason: collision with root package name */
    private final List f34241a;

    public p(List<e> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f34241a = list;
    }

    public List<e> getComponentsInCycle() {
        return this.f34241a;
    }
}
