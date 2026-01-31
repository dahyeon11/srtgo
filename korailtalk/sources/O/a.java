package O;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends h implements Map {

    /* renamed from: h, reason: collision with root package name */
    g f3339h;

    /* renamed from: O.a$a, reason: collision with other inner class name */
    class C0057a extends g {
        C0057a() {
        }

        @Override // O.g
        protected void a() {
            a.this.clear();
        }

        @Override // O.g
        protected Object b(int i8, int i9) {
            return a.this.f3392b[(i8 << 1) + i9];
        }

        @Override // O.g
        protected Map c() {
            return a.this;
        }

        @Override // O.g
        protected int d() {
            return a.this.f3393c;
        }

        @Override // O.g
        protected int e(Object obj) {
            return a.this.indexOfKey(obj);
        }

        @Override // O.g
        protected int f(Object obj) {
            return a.this.f(obj);
        }

        @Override // O.g
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // O.g
        protected void h(int i8) {
            a.this.removeAt(i8);
        }

        @Override // O.g
        protected Object i(int i8, Object obj) {
            return a.this.setValueAt(i8, obj);
        }
    }

    public a() {
    }

    private g g() {
        if (this.f3339h == null) {
            this.f3339h = new C0057a();
        }
        return this.f3339h;
    }

    public boolean containsAll(Collection<?> collection) {
        return g.containsAllHelper(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return g().getEntrySet();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return g().getKeySet();
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        ensureCapacity(this.f3393c + map.size());
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        return g.removeAllHelper(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return g.retainAllHelper(this, collection);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return g().getValues();
    }

    public a(int i8) {
        super(i8);
    }

    public a(h hVar) {
        super(hVar);
    }
}
