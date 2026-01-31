package f3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.I, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5437I extends AbstractC5462g implements InterfaceC5439K {

    /* renamed from: f, reason: collision with root package name */
    final F0 f30771f;

    /* renamed from: g, reason: collision with root package name */
    final e3.x f30772g;

    /* renamed from: f3.I$a */
    static class a extends AbstractC5445Q {

        /* renamed from: a, reason: collision with root package name */
        final Object f30773a;

        a(Object obj) {
            this.f30773a = obj;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            add(0, obj);
            return true;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            addAll(0, collection);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f3.X
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List delegate() {
            return Collections.emptyList();
        }

        @Override // f3.AbstractC5445Q, java.util.List
        public void add(int i8, Object obj) {
            e3.w.checkPositionIndex(i8, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f30773a);
        }

        @Override // f3.AbstractC5445Q, java.util.List
        public boolean addAll(int i8, Collection<Object> collection) {
            e3.w.checkNotNull(collection);
            e3.w.checkPositionIndex(i8, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f30773a);
        }
    }

    /* renamed from: f3.I$b */
    static class b extends Y {

        /* renamed from: a, reason: collision with root package name */
        final Object f30774a;

        b(Object obj) {
            this.f30774a = obj;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f30774a);
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            e3.w.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f30774a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f3.X
        /* renamed from: d */
        public Set delegate() {
            return Collections.emptySet();
        }
    }

    /* renamed from: f3.I$c */
    class c extends AbstractC5444P {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f3.X
        /* renamed from: a */
        public Collection delegate() {
            return AbstractC5486s.filter(C5437I.this.f30771f.entries(), C5437I.this.entryPredicate());
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C5437I.this.f30771f.containsKey(entry.getKey()) && C5437I.this.f30772g.apply(entry.getKey())) {
                return C5437I.this.f30771f.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    C5437I(F0 f02, e3.x xVar) {
        this.f30771f = (F0) e3.w.checkNotNull(f02);
        this.f30772g = (e3.x) e3.w.checkNotNull(xVar);
    }

    @Override // f3.AbstractC5462g
    Map a() {
        return E0.filterKeys(this.f30771f.asMap(), this.f30772g);
    }

    @Override // f3.AbstractC5462g
    Collection b() {
        return new c();
    }

    @Override // f3.AbstractC5462g
    Set c() {
        return h1.filter(this.f30771f.keySet(), this.f30772g);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public void clear() {
        keySet().clear();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public boolean containsKey(Object obj) {
        if (this.f30771f.containsKey(obj)) {
            return this.f30772g.apply(obj);
        }
        return false;
    }

    @Override // f3.AbstractC5462g
    K0 d() {
        return L0.filter(this.f30771f.keys(), this.f30772g);
    }

    @Override // f3.AbstractC5462g
    Collection e() {
        return new C5440L(this);
    }

    @Override // f3.InterfaceC5439K
    public e3.x entryPredicate() {
        return E0.w(this.f30772g);
    }

    @Override // f3.AbstractC5462g
    Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> get(Object obj) {
        return this.f30772g.apply(obj) ? this.f30771f.get(obj) : this.f30771f instanceof g1 ? new b(obj) : new a(obj);
    }

    Collection h() {
        return this.f30771f instanceof g1 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> removeAll(Object obj) {
        return containsKey(obj) ? this.f30771f.removeAll(obj) : h();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public int size() {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public F0 unfiltered() {
        return this.f30771f;
    }
}
