package S6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final int f4671a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4672b;

    public J(int i8, Object obj) {
        this.f4671a = i8;
        this.f4672b = obj;
    }

    public static /* synthetic */ J copy$default(J j8, int i8, Object obj, int i9, Object obj2) {
        if ((i9 & 1) != 0) {
            i8 = j8.f4671a;
        }
        if ((i9 & 2) != 0) {
            obj = j8.f4672b;
        }
        return j8.copy(i8, obj);
    }

    public final int component1() {
        return this.f4671a;
    }

    public final Object component2() {
        return this.f4672b;
    }

    public final J copy(int i8, Object obj) {
        return new J(i8, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j8 = (J) obj;
        return this.f4671a == j8.f4671a && Intrinsics.areEqual(this.f4672b, j8.f4672b);
    }

    public final int getIndex() {
        return this.f4671a;
    }

    public final Object getValue() {
        return this.f4672b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f4671a) * 31;
        Object obj = this.f4672b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f4671a + ", value=" + this.f4672b + ')';
    }
}
