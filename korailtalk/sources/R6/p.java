package R6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4479a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4480b;

    public p(Object obj, Object obj2) {
        this.f4479a = obj;
        this.f4480b = obj2;
    }

    public static /* synthetic */ p copy$default(p pVar, Object obj, Object obj2, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = pVar.f4479a;
        }
        if ((i8 & 2) != 0) {
            obj2 = pVar.f4480b;
        }
        return pVar.copy(obj, obj2);
    }

    public final Object component1() {
        return this.f4479a;
    }

    public final Object component2() {
        return this.f4480b;
    }

    public final p copy(Object obj, Object obj2) {
        return new p(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f4479a, pVar.f4479a) && Intrinsics.areEqual(this.f4480b, pVar.f4480b);
    }

    public final Object getFirst() {
        return this.f4479a;
    }

    public final Object getSecond() {
        return this.f4480b;
    }

    public int hashCode() {
        Object obj = this.f4479a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4480b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f4479a + ", " + this.f4480b + ')';
    }
}
