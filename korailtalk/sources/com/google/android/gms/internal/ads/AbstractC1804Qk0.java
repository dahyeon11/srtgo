package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Qk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1804Qk0 extends AbstractC1845Rk0 implements Map {
    protected AbstractC1804Qk0() {
    }

    protected abstract Map b();

    protected final int c() {
        return AbstractC2854fm0.a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    protected final boolean d(Object obj) {
        C4448tl0 c4448tl0 = new C4448tl0(entrySet().iterator());
        if (obj == null) {
            while (c4448tl0.hasNext()) {
                if (c4448tl0.next() == null) {
                }
            }
            return false;
        }
        while (c4448tl0.hasNext()) {
            if (obj.equals(c4448tl0.next())) {
            }
        }
        return false;
        return true;
    }

    protected final boolean e(Object obj) {
        return AbstractC5018yl0.b(this, obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return b().values();
    }
}
