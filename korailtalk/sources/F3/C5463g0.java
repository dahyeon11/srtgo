package f3;

import java.util.Collection;
import java.util.EnumSet;

/* renamed from: f3.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5463g0 extends AbstractC5483q0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient EnumSet f30939c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f30940d;

    private C5463g0(EnumSet enumSet) {
        this.f30939c = enumSet;
    }

    static AbstractC5483q0 l(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new C5463g0(enumSet) : AbstractC5483q0.of((Enum) AbstractC5493v0.getOnlyElement(enumSet)) : AbstractC5483q0.of();
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30939c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C5463g0) {
            collection = ((C5463g0) collection).f30939c;
        }
        return this.f30939c.containsAll(collection);
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5463g0) {
            obj = ((C5463g0) obj).f30939c;
        }
        return this.f30939c.equals(obj);
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public int hashCode() {
        int i8 = this.f30940d;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.f30939c.hashCode();
        this.f30940d = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f30939c.isEmpty();
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return false;
    }

    @Override // f3.AbstractC5483q0
    boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30939c.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f30939c.toString();
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return AbstractC5495w0.unmodifiableIterator(this.f30939c.iterator());
    }
}
