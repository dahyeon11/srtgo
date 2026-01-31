package f3;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class Y extends AbstractC5444P implements Set {
    protected Y() {
    }

    protected abstract Set d();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || d().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d().hashCode();
    }
}
