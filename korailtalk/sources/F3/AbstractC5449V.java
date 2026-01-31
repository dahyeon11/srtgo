package f3;

import f3.K0;
import java.util.Set;

/* renamed from: f3.V, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5449V extends AbstractC5444P implements K0 {
    protected AbstractC5449V() {
    }

    public int add(Object obj, int i8) {
        return a().add(obj, i8);
    }

    @Override // f3.K0
    public int count(Object obj) {
        return a().count(obj);
    }

    /* renamed from: d */
    protected abstract K0 a();

    public Set<Object> elementSet() {
        return a().elementSet();
    }

    public Set<K0.a> entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Collection, f3.K0
    public boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    @Override // java.util.Collection, f3.K0
    public int hashCode() {
        return a().hashCode();
    }

    public int remove(Object obj, int i8) {
        return a().remove(obj, i8);
    }

    public int setCount(Object obj, int i8) {
        return a().setCount(obj, i8);
    }

    public boolean setCount(Object obj, int i8, int i9) {
        return a().setCount(obj, i8, i9);
    }
}
