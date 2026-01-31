package n7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5965A {
    public final Throwable cancelCause;
    public final AbstractC5992l cancelHandler;
    public final Object idempotentResume;
    public final f7.l onCancellation;
    public final Object result;

    public C5965A(Object obj, AbstractC5992l abstractC5992l, f7.l lVar, Object obj2, Throwable th) {
        this.result = obj;
        this.cancelHandler = abstractC5992l;
        this.onCancellation = lVar;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }

    public static /* synthetic */ C5965A copy$default(C5965A c5965a, Object obj, AbstractC5992l abstractC5992l, f7.l lVar, Object obj2, Throwable th, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = c5965a.result;
        }
        if ((i8 & 2) != 0) {
            abstractC5992l = c5965a.cancelHandler;
        }
        AbstractC5992l abstractC5992l2 = abstractC5992l;
        if ((i8 & 4) != 0) {
            lVar = c5965a.onCancellation;
        }
        f7.l lVar2 = lVar;
        if ((i8 & 8) != 0) {
            obj2 = c5965a.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i8 & 16) != 0) {
            th = c5965a.cancelCause;
        }
        return c5965a.copy(obj, abstractC5992l2, lVar2, obj4, th);
    }

    public final Object component1() {
        return this.result;
    }

    public final AbstractC5992l component2() {
        return this.cancelHandler;
    }

    public final f7.l component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final C5965A copy(Object obj, AbstractC5992l abstractC5992l, f7.l lVar, Object obj2, Throwable th) {
        return new C5965A(obj, abstractC5992l, lVar, obj2, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5965A)) {
            return false;
        }
        C5965A c5965a = (C5965A) obj;
        return Intrinsics.areEqual(this.result, c5965a.result) && Intrinsics.areEqual(this.cancelHandler, c5965a.cancelHandler) && Intrinsics.areEqual(this.onCancellation, c5965a.onCancellation) && Intrinsics.areEqual(this.idempotentResume, c5965a.idempotentResume) && Intrinsics.areEqual(this.cancelCause, c5965a.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC5992l abstractC5992l = this.cancelHandler;
        int iHashCode2 = (iHashCode + (abstractC5992l == null ? 0 : abstractC5992l.hashCode())) * 31;
        f7.l lVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(C5998o c5998o, Throwable th) {
        AbstractC5992l abstractC5992l = this.cancelHandler;
        if (abstractC5992l != null) {
            c5998o.callCancelHandler(abstractC5992l, th);
        }
        f7.l lVar = this.onCancellation;
        if (lVar != null) {
            c5998o.callOnCancellation(lVar, th);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ C5965A(Object obj, AbstractC5992l abstractC5992l, f7.l lVar, Object obj2, Throwable th, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i8 & 2) != 0 ? null : abstractC5992l, (i8 & 4) != 0 ? null : lVar, (i8 & 8) != 0 ? null : obj2, (i8 & 16) != 0 ? null : th);
    }
}
