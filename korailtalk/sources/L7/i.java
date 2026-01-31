package l7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f34030a;

    /* renamed from: b, reason: collision with root package name */
    private final j7.l f34031b;

    public i(String value, j7.l range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f34030a = value;
        this.f34031b = range;
    }

    public static /* synthetic */ i copy$default(i iVar, String str, j7.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = iVar.f34030a;
        }
        if ((i8 & 2) != 0) {
            lVar = iVar.f34031b;
        }
        return iVar.copy(str, lVar);
    }

    public final String component1() {
        return this.f34030a;
    }

    public final j7.l component2() {
        return this.f34031b;
    }

    public final i copy(String value, j7.l range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        return new i(value, range);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f34030a, iVar.f34030a) && Intrinsics.areEqual(this.f34031b, iVar.f34031b);
    }

    public final j7.l getRange() {
        return this.f34031b;
    }

    public final String getValue() {
        return this.f34030a;
    }

    public int hashCode() {
        return (this.f34030a.hashCode() * 31) + this.f34031b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f34030a + ", range=" + this.f34031b + ')';
    }
}
