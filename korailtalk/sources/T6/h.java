package T6;

import S6.AbstractC0762f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: classes3.dex */
public final class h extends AbstractC0762f implements Set, Serializable, KMutableSet {

    /* renamed from: b, reason: collision with root package name */
    private static final a f4963b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f4964c = new h(d.Companion.getEmpty$kotlin_stdlib());

    /* renamed from: a, reason: collision with root package name */
    private final d f4965a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f4965a = backing;
    }

    @Override // S6.AbstractC0762f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f4965a.addKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f4965a.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    public final Set<Object> build() {
        this.f4965a.build();
        return size() > 0 ? this : f4964c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f4965a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f4965a.containsKey(obj);
    }

    @Override // S6.AbstractC0762f
    public int getSize() {
        return this.f4965a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f4965a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return this.f4965a.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f4965a.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f4965a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f4965a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }

    public h(int i8) {
        this(new d(i8));
    }
}
