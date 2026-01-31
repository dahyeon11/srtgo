package a8;

import T7.C;
import T7.InterfaceC0815z;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class b implements Map.Entry, Comparable, Serializable {
    public static final b[] EMPTY_ARRAY = new b[0];

    public static <L, R> b[] emptyArray() {
        return EMPTY_ARRAY;
    }

    public static <L, R> b of(L l8, R r8) {
        return a.of((Object) l8, (Object) r8);
    }

    public static <L, R> b ofNonNull(L l8, R r8) {
        return a.ofNonNull((Object) l8, (Object) r8);
    }

    public <E extends Throwable> void accept(InterfaceC0815z interfaceC0815z) {
        interfaceC0815z.accept(getKey(), getValue());
    }

    public <V, E extends Throwable> V apply(C c9) {
        return (V) c9.apply(getKey(), getValue());
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return getLeft();
    }

    public abstract Object getLeft();

    public abstract Object getRight();

    @Override // java.util.Map.Entry
    public Object getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    public String toString() {
        return "(" + getLeft() + ',' + getRight() + ')';
    }

    public static <L, R> b of(Map.Entry<L, R> entry) {
        return a.of((Map.Entry) entry);
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        return new R7.b().append(getLeft(), bVar.getLeft()).append(getRight(), bVar.getRight()).toComparison();
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
