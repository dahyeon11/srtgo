package n7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5967C {
    public final f7.l onCancellation;
    public final Object result;

    public C5967C(Object obj, f7.l lVar) {
        this.result = obj;
        this.onCancellation = lVar;
    }

    public static /* synthetic */ C5967C copy$default(C5967C c5967c, Object obj, f7.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = c5967c.result;
        }
        if ((i8 & 2) != 0) {
            lVar = c5967c.onCancellation;
        }
        return c5967c.copy(obj, lVar);
    }

    public final Object component1() {
        return this.result;
    }

    public final f7.l component2() {
        return this.onCancellation;
    }

    public final C5967C copy(Object obj, f7.l lVar) {
        return new C5967C(obj, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5967C)) {
            return false;
        }
        C5967C c5967c = (C5967C) obj;
        return Intrinsics.areEqual(this.result, c5967c.result) && Intrinsics.areEqual(this.onCancellation, c5967c.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.onCancellation.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.result + ", onCancellation=" + this.onCancellation + ')';
    }
}
