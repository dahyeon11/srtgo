package o;

import java.util.HashMap;
import java.util.Map;
import o.C6021b;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6020a extends C6021b {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f34356e = new HashMap();

    @Override // o.C6021b
    protected C6021b.c a(Object obj) {
        return (C6021b.c) this.f34356e.get(obj);
    }

    public Map.Entry<Object, Object> ceil(Object obj) {
        if (contains(obj)) {
            return ((C6021b.c) this.f34356e.get(obj)).f34364d;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.f34356e.containsKey(obj);
    }

    @Override // o.C6021b
    public Object putIfAbsent(Object obj, Object obj2) {
        C6021b.c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f34362b;
        }
        this.f34356e.put(obj, b(obj, obj2));
        return null;
    }

    @Override // o.C6021b
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f34356e.remove(obj);
        return objRemove;
    }
}
