package Q7;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class P implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f4091a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f4092b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4093c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f4094d;

    /* renamed from: e, reason: collision with root package name */
    private transient String f4095e;

    private enum a implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    P(Object obj, Object obj2, Comparator comparator) {
        Objects.requireNonNull(obj, "element1");
        Objects.requireNonNull(obj2, "element2");
        if (comparator == null) {
            this.f4091a = a.INSTANCE;
        } else {
            this.f4091a = comparator;
        }
        if (this.f4091a.compare(obj, obj2) < 1) {
            this.f4094d = obj;
            this.f4093c = obj2;
        } else {
            this.f4094d = obj2;
            this.f4093c = obj;
        }
    }

    @Deprecated
    public static <T extends Comparable<? super T>> P between(T t8, T t9) {
        return of(t8, t9, null);
    }

    public static <T extends Comparable<? super T>> P is(T t8) {
        return of(t8, t8, null);
    }

    public static <T extends Comparable<? super T>> P of(T t8, T t9) {
        return of(t8, t9, null);
    }

    public boolean contains(Object obj) {
        return obj != null && this.f4091a.compare(obj, this.f4094d) > -1 && this.f4091a.compare(obj, this.f4093c) < 1;
    }

    public boolean containsRange(P p8) {
        return p8 != null && contains(p8.f4094d) && contains(p8.f4093c);
    }

    public int elementCompareTo(Object obj) {
        Objects.requireNonNull(obj, "element");
        if (isAfter(obj)) {
            return -1;
        }
        return isBefore(obj) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        P p8 = (P) obj;
        return this.f4094d.equals(p8.f4094d) && this.f4093c.equals(p8.f4093c);
    }

    public Object fit(Object obj) {
        Objects.requireNonNull(obj, "element");
        return isAfter(obj) ? this.f4094d : isBefore(obj) ? this.f4093c : obj;
    }

    public Comparator<Object> getComparator() {
        return this.f4091a;
    }

    public Object getMaximum() {
        return this.f4093c;
    }

    public Object getMinimum() {
        return this.f4094d;
    }

    public int hashCode() {
        int i8 = this.f4092b;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.f4093c.hashCode() + ((((629 + getClass().hashCode()) * 37) + this.f4094d.hashCode()) * 37);
        this.f4092b = iHashCode;
        return iHashCode;
    }

    public P intersectionWith(P p8) {
        if (!isOverlappedBy(p8)) {
            throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", p8));
        }
        if (equals(p8)) {
            return this;
        }
        return of(getComparator().compare(this.f4094d, p8.f4094d) < 0 ? p8.f4094d : this.f4094d, getComparator().compare(this.f4093c, p8.f4093c) < 0 ? this.f4093c : p8.f4093c, getComparator());
    }

    public boolean isAfter(Object obj) {
        return obj != null && this.f4091a.compare(obj, this.f4094d) < 0;
    }

    public boolean isAfterRange(P p8) {
        if (p8 == null) {
            return false;
        }
        return isAfter(p8.f4093c);
    }

    public boolean isBefore(Object obj) {
        return obj != null && this.f4091a.compare(obj, this.f4093c) > 0;
    }

    public boolean isBeforeRange(P p8) {
        if (p8 == null) {
            return false;
        }
        return isBefore(p8.f4094d);
    }

    public boolean isEndedBy(Object obj) {
        return obj != null && this.f4091a.compare(obj, this.f4093c) == 0;
    }

    public boolean isNaturalOrdering() {
        return this.f4091a == a.INSTANCE;
    }

    public boolean isOverlappedBy(P p8) {
        if (p8 == null) {
            return false;
        }
        return p8.contains(this.f4094d) || p8.contains(this.f4093c) || contains(p8.f4094d);
    }

    public boolean isStartedBy(Object obj) {
        return obj != null && this.f4091a.compare(obj, this.f4094d) == 0;
    }

    public String toString() {
        if (this.f4095e == null) {
            this.f4095e = "[" + this.f4094d + ".." + this.f4093c + "]";
        }
        return this.f4095e;
    }

    @Deprecated
    public static <T> P between(T t8, T t9, Comparator<T> comparator) {
        return new P(t8, t9, comparator);
    }

    public static <T> P is(T t8, Comparator<T> comparator) {
        return of(t8, t8, comparator);
    }

    public static <T> P of(T t8, T t9, Comparator<T> comparator) {
        return new P(t8, t9, comparator);
    }

    public String toString(String str) {
        return String.format(str, this.f4094d, this.f4093c, this.f4091a);
    }
}
