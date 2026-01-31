package j7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class l extends j implements g, r {
    public static final a Companion = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final l f33516d = new l(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l getEMPTY() {
            return l.f33516d;
        }

        private a() {
        }
    }

    public l(int i8, int i9) {
        super(i8, i9, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.g, j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // j7.j
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (getFirst() != lVar.getFirst() || getLast() != lVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j7.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // j7.j, j7.g, j7.r
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // j7.j
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(int i8) {
        return getFirst() <= i8 && i8 <= getLast();
    }

    @Override // j7.r
    public Integer getEndExclusive() {
        if (getLast() != Integer.MAX_VALUE) {
            return Integer.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // j7.g
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // j7.g, j7.r
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
