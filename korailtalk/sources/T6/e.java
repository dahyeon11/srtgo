package T6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends a {

    /* renamed from: a */
    private final d f4960a;

    public e(d backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f4960a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<Object, Object>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f4960a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f4960a.containsAllEntries$kotlin_stdlib(elements);
    }

    @Override // T6.a
    public boolean containsEntry(Map.Entry<Object, Object> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f4960a.containsEntry$kotlin_stdlib(element);
    }

    public final d getBacking() {
        return this.f4960a;
    }

    @Override // S6.AbstractC0762f
    public int getSize() {
        return this.f4960a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f4960a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return this.f4960a.entriesIterator$kotlin_stdlib();
    }

    @Override // T6.a
    public boolean remove(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f4960a.removeEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f4960a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f4960a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @Override // S6.AbstractC0762f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Object, Object> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }
}
