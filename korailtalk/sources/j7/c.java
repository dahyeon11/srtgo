package j7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends C5835a implements g, r {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final c f33500d = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c getEMPTY() {
            return c.f33500d;
        }

        private a() {
        }
    }

    public c(char c9, char c10) {
        super(c9, c10, 1);
    }

    @Override // j7.g, j7.r
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    @Override // j7.C5835a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (getFirst() != cVar.getFirst() || getLast() != cVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j7.C5835a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // j7.C5835a, j7.g, j7.r
    public boolean isEmpty() {
        return Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // j7.C5835a
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public boolean contains(char c9) {
        return Intrinsics.compare((int) getFirst(), (int) c9) <= 0 && Intrinsics.compare((int) c9, (int) getLast()) <= 0;
    }

    @Override // j7.r
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // j7.g
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // j7.g, j7.r
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
