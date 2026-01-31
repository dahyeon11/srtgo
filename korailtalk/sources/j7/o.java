package j7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class o extends m implements g, r {
    public static final a Companion = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final o f33524d = new o(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o getEMPTY() {
            return o.f33524d;
        }

        private a() {
        }
    }

    public o(long j8, long j9) {
        super(j8, j9, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j7.g, j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).longValue());
    }

    @Override // j7.m
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            if (!isEmpty() || !((o) obj).isEmpty()) {
                o oVar = (o) obj;
                if (getFirst() != oVar.getFirst() || getLast() != oVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j7.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    @Override // j7.m, j7.g, j7.r
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // j7.m
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(long j8) {
        return getFirst() <= j8 && j8 <= getLast();
    }

    @Override // j7.r
    public Long getEndExclusive() {
        if (getLast() != Long.MAX_VALUE) {
            return Long.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // j7.g
    public Long getEndInclusive() {
        return Long.valueOf(getLast());
    }

    @Override // j7.g, j7.r
    public Long getStart() {
        return Long.valueOf(getFirst());
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
