package f3;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class W0 extends X0 implements e3.x, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final W0 f30841c = new W0(AbstractC5500z.c(), AbstractC5500z.a());

    /* renamed from: a, reason: collision with root package name */
    final AbstractC5500z f30842a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC5500z f30843b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30844a;

        static {
            int[] iArr = new int[EnumC5478o.values().length];
            f30844a = iArr;
            try {
                iArr[EnumC5478o.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30844a[EnumC5478o.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private W0(AbstractC5500z abstractC5500z, AbstractC5500z abstractC5500z2) {
        this.f30842a = (AbstractC5500z) e3.w.checkNotNull(abstractC5500z);
        this.f30843b = (AbstractC5500z) e3.w.checkNotNull(abstractC5500z2);
        if (abstractC5500z.compareTo(abstractC5500z2) > 0 || abstractC5500z == AbstractC5500z.a() || abstractC5500z2 == AbstractC5500z.c()) {
            throw new IllegalArgumentException("Invalid range: " + c(abstractC5500z, abstractC5500z2));
        }
    }

    static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> W0 all() {
        return f30841c;
    }

    public static <C extends Comparable<?>> W0 atLeast(C c9) {
        return b(AbstractC5500z.d(c9), AbstractC5500z.a());
    }

    public static <C extends Comparable<?>> W0 atMost(C c9) {
        return b(AbstractC5500z.c(), AbstractC5500z.b(c9));
    }

    static W0 b(AbstractC5500z abstractC5500z, AbstractC5500z abstractC5500z2) {
        return new W0(abstractC5500z, abstractC5500z2);
    }

    private static String c(AbstractC5500z abstractC5500z, AbstractC5500z abstractC5500z2) {
        StringBuilder sb = new StringBuilder(16);
        abstractC5500z.f(sb);
        sb.append("..");
        abstractC5500z2.g(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> W0 closed(C c9, C c10) {
        return b(AbstractC5500z.d(c9), AbstractC5500z.b(c10));
    }

    public static <C extends Comparable<?>> W0 closedOpen(C c9, C c10) {
        return b(AbstractC5500z.d(c9), AbstractC5500z.d(c10));
    }

    public static <C extends Comparable<?>> W0 downTo(C c9, EnumC5478o enumC5478o) {
        int i8 = a.f30844a[enumC5478o.ordinal()];
        if (i8 == 1) {
            return greaterThan(c9);
        }
        if (i8 == 2) {
            return atLeast(c9);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> W0 encloseAll(Iterable<C> iterable) {
        e3.w.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (T0.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) e3.w.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) e3.w.checkNotNull(it.next());
            comparable = (Comparable) T0.natural().min(comparable, comparable3);
            comparable2 = (Comparable) T0.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> W0 greaterThan(C c9) {
        return b(AbstractC5500z.b(c9), AbstractC5500z.a());
    }

    public static <C extends Comparable<?>> W0 lessThan(C c9) {
        return b(AbstractC5500z.c(), AbstractC5500z.d(c9));
    }

    public static <C extends Comparable<?>> W0 open(C c9, C c10) {
        return b(AbstractC5500z.b(c9), AbstractC5500z.d(c10));
    }

    public static <C extends Comparable<?>> W0 openClosed(C c9, C c10) {
        return b(AbstractC5500z.b(c9), AbstractC5500z.b(c10));
    }

    public static <C extends Comparable<?>> W0 range(C c9, EnumC5478o enumC5478o, C c10, EnumC5478o enumC5478o2) {
        e3.w.checkNotNull(enumC5478o);
        e3.w.checkNotNull(enumC5478o2);
        EnumC5478o enumC5478o3 = EnumC5478o.OPEN;
        return b(enumC5478o == enumC5478o3 ? AbstractC5500z.b(c9) : AbstractC5500z.d(c9), enumC5478o2 == enumC5478o3 ? AbstractC5500z.d(c10) : AbstractC5500z.b(c10));
    }

    public static <C extends Comparable<?>> W0 singleton(C c9) {
        return closed(c9, c9);
    }

    public static <C extends Comparable<?>> W0 upTo(C c9, EnumC5478o enumC5478o) {
        int i8 = a.f30844a[enumC5478o.ordinal()];
        if (i8 == 1) {
            return lessThan(c9);
        }
        if (i8 == 2) {
            return atMost(c9);
        }
        throw new AssertionError();
    }

    public W0 canonical(AbstractC5408A abstractC5408A) {
        e3.w.checkNotNull(abstractC5408A);
        AbstractC5500z abstractC5500zE = this.f30842a.e(abstractC5408A);
        AbstractC5500z abstractC5500zE2 = this.f30843b.e(abstractC5408A);
        return (abstractC5500zE == this.f30842a && abstractC5500zE2 == this.f30843b) ? this : b(abstractC5500zE, abstractC5500zE2);
    }

    public boolean contains(Comparable comparable) {
        e3.w.checkNotNull(comparable);
        return this.f30842a.i(comparable) && !this.f30843b.i(comparable);
    }

    public boolean containsAll(Iterable<Comparable> iterable) {
        if (AbstractC5493v0.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (T0.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<Comparable> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(W0 w02) {
        return this.f30842a.compareTo(w02.f30842a) <= 0 && this.f30843b.compareTo(w02.f30843b) >= 0;
    }

    @Override // e3.x
    public boolean equals(Object obj) {
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return this.f30842a.equals(w02.f30842a) && this.f30843b.equals(w02.f30843b);
    }

    public W0 gap(W0 w02) {
        if (this.f30842a.compareTo(w02.f30843b) >= 0 || w02.f30842a.compareTo(this.f30843b) >= 0) {
            boolean z8 = this.f30842a.compareTo(w02.f30842a) < 0;
            W0 w03 = z8 ? this : w02;
            if (!z8) {
                w02 = this;
            }
            return b(w03.f30843b, w02.f30842a);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + w02);
    }

    public boolean hasLowerBound() {
        return this.f30842a != AbstractC5500z.c();
    }

    public boolean hasUpperBound() {
        return this.f30843b != AbstractC5500z.a();
    }

    public int hashCode() {
        return (this.f30842a.hashCode() * 31) + this.f30843b.hashCode();
    }

    public W0 intersection(W0 w02) {
        int iCompareTo = this.f30842a.compareTo(w02.f30842a);
        int iCompareTo2 = this.f30843b.compareTo(w02.f30843b);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return w02;
        }
        AbstractC5500z abstractC5500z = iCompareTo >= 0 ? this.f30842a : w02.f30842a;
        AbstractC5500z abstractC5500z2 = iCompareTo2 <= 0 ? this.f30843b : w02.f30843b;
        e3.w.checkArgument(abstractC5500z.compareTo(abstractC5500z2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, w02);
        return b(abstractC5500z, abstractC5500z2);
    }

    public boolean isConnected(W0 w02) {
        return this.f30842a.compareTo(w02.f30843b) <= 0 && w02.f30842a.compareTo(this.f30843b) <= 0;
    }

    public boolean isEmpty() {
        return this.f30842a.equals(this.f30843b);
    }

    public EnumC5478o lowerBoundType() {
        return this.f30842a.j();
    }

    public Comparable lowerEndpoint() {
        return this.f30842a.h();
    }

    public W0 span(W0 w02) {
        int iCompareTo = this.f30842a.compareTo(w02.f30842a);
        int iCompareTo2 = this.f30843b.compareTo(w02.f30843b);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return b(iCompareTo <= 0 ? this.f30842a : w02.f30842a, iCompareTo2 >= 0 ? this.f30843b : w02.f30843b);
        }
        return w02;
    }

    public String toString() {
        return c(this.f30842a, this.f30843b);
    }

    public EnumC5478o upperBoundType() {
        return this.f30843b.k();
    }

    public Comparable upperEndpoint() {
        return this.f30843b.h();
    }

    @Override // e3.x
    @Deprecated
    public boolean apply(Comparable comparable) {
        return contains(comparable);
    }
}
