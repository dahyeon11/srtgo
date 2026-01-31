package j7;

import j7.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class i implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f33507a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparable f33508b;

    public i(Comparable<Object> start, Comparable<Object> endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.f33507a = start;
        this.f33508b = endInclusive;
    }

    @Override // j7.g, j7.r
    public boolean contains(Comparable<Object> comparable) {
        return g.a.contains(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!Intrinsics.areEqual(getStart(), iVar.getStart()) || !Intrinsics.areEqual(getEndInclusive(), iVar.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j7.g
    public Comparable<Object> getEndInclusive() {
        return this.f33508b;
    }

    @Override // j7.g, j7.r
    public Comparable<Object> getStart() {
        return this.f33507a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // j7.g, j7.r
    public boolean isEmpty() {
        return g.a.isEmpty(this);
    }

    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
