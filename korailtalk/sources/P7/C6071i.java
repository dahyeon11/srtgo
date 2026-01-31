package p7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6071i {
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final c f34685b = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f34686a;

    /* renamed from: p7.i$a */
    public static final class a extends c {
        public final Throwable cause;

        public a(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.cause, ((a) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p7.C6071i.c
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    /* renamed from: p7.i$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m553closedJP2dKIU(Throwable th) {
            return C6071i.m541constructorimpl(new a(th));
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m554failurePtdJZtk() {
            return C6071i.m541constructorimpl(C6071i.f34685b);
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m555successJP2dKIU(E e8) {
            return C6071i.m541constructorimpl(e8);
        }

        private b() {
        }
    }

    /* renamed from: p7.i$c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C6071i(Object obj) {
        this.f34686a = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C6071i m540boximpl(Object obj) {
        return new C6071i(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m542equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C6071i) && Intrinsics.areEqual(obj, ((C6071i) obj2).m552unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m543equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m544exceptionOrNullimpl(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.cause;
        }
        return null;
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final Object m545getOrNullimpl(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final Object m546getOrThrowimpl(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).cause) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m547hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m548isClosedimpl(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m549isFailureimpl(Object obj) {
        return obj instanceof c;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m550isSuccessimpl(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m551toStringimpl(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m542equalsimpl(this.f34686a, obj);
    }

    public int hashCode() {
        return m547hashCodeimpl(this.f34686a);
    }

    public String toString() {
        return m551toStringimpl(this.f34686a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m552unboximpl() {
        return this.f34686a;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m541constructorimpl(Object obj) {
        return obj;
    }
}
