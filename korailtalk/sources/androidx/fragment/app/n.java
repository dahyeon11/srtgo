package androidx.fragment.app;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Collection f9742a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9743b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9744c;

    n(Collection collection, Map map, Map map2) {
        this.f9742a = collection;
        this.f9743b = map;
        this.f9744c = map2;
    }

    Map a() {
        return this.f9743b;
    }

    Collection b() {
        return this.f9742a;
    }

    Map c() {
        return this.f9744c;
    }
}
