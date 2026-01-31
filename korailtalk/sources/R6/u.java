package R6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4489a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4490b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4491c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f4489a = obj;
        this.f4490b = obj2;
        this.f4491c = obj3;
    }

    public static /* synthetic */ u copy$default(u uVar, Object obj, Object obj2, Object obj3, int i8, Object obj4) {
        if ((i8 & 1) != 0) {
            obj = uVar.f4489a;
        }
        if ((i8 & 2) != 0) {
            obj2 = uVar.f4490b;
        }
        if ((i8 & 4) != 0) {
            obj3 = uVar.f4491c;
        }
        return uVar.copy(obj, obj2, obj3);
    }

    public final Object component1() {
        return this.f4489a;
    }

    public final Object component2() {
        return this.f4490b;
    }

    public final Object component3() {
        return this.f4491c;
    }

    public final u copy(Object obj, Object obj2, Object obj3) {
        return new u(obj, obj2, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f4489a, uVar.f4489a) && Intrinsics.areEqual(this.f4490b, uVar.f4490b) && Intrinsics.areEqual(this.f4491c, uVar.f4491c);
    }

    public final Object getFirst() {
        return this.f4489a;
    }

    public final Object getSecond() {
        return this.f4490b;
    }

    public final Object getThird() {
        return this.f4491c;
    }

    public int hashCode() {
        Object obj = this.f4489a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4490b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f4491c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f4489a + ", " + this.f4490b + ", " + this.f4491c + ')';
    }
}
