package f3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: f3.Q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5445Q extends AbstractC5444P implements List {
    protected AbstractC5445Q() {
    }

    public void add(int i8, Object obj) {
        d().add(i8, obj);
    }

    public boolean addAll(int i8, Collection<Object> collection) {
        return d().addAll(i8, collection);
    }

    protected abstract List d();

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || d().equals(obj);
    }

    @Override // java.util.List
    public Object get(int i8) {
        return d().get(i8);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return d().listIterator();
    }

    @Override // java.util.List
    public Object remove(int i8) {
        return d().remove(i8);
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        return d().set(i8, obj);
    }

    @Override // java.util.List
    public List<Object> subList(int i8, int i9) {
        return d().subList(i8, i9);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return d().listIterator(i8);
    }
}
