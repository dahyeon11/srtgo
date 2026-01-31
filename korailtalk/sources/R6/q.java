package R6;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f4481a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {
        public final Throwable exception;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.areEqual(this.exception, ((b) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    private /* synthetic */ q(Object obj) {
        this.f4481a = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q m66boximpl(Object obj) {
        return new q(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m68equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof q) && Intrinsics.areEqual(obj, ((q) obj2).m75unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m69equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m70exceptionOrNullimpl(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).exception;
        }
        return null;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m71hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m72isFailureimpl(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m73isSuccessimpl(Object obj) {
        return !(obj instanceof b);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m74toStringimpl(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m68equalsimpl(this.f4481a, obj);
    }

    public int hashCode() {
        return m71hashCodeimpl(this.f4481a);
    }

    public String toString() {
        return m74toStringimpl(this.f4481a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m75unboximpl() {
        return this.f4481a;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m67constructorimpl(Object obj) {
        return obj;
    }
}
