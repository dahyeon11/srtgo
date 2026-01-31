package j7;

import j7.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class h implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f33505a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparable f33506b;

    public h(Comparable<Object> start, Comparable<Object> endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.f33505a = start;
        this.f33506b = endExclusive;
    }

    @Override // j7.r
    public boolean contains(Comparable<Object> comparable) {
        return r.a.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!Intrinsics.areEqual(getStart(), hVar.getStart()) || !Intrinsics.areEqual(getEndExclusive(), hVar.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j7.r
    public Comparable<Object> getEndExclusive() {
        return this.f33506b;
    }

    @Override // j7.r
    public Comparable<Object> getStart() {
        return this.f33505a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // j7.r
    public boolean isEmpty() {
        return r.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
