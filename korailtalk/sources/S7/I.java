package s7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final Object f36324a;

    private /* synthetic */ I(Object obj) {
        this.f36324a = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ I m572boximpl(Object obj) {
        return new I(obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m574equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof I) && Intrinsics.areEqual(obj, ((I) obj2).m580unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m575equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: getSegment-impl, reason: not valid java name */
    public static final H m576getSegmentimpl(Object obj) {
        if (obj == AbstractC6244e.f36341a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (H) obj;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m577hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m578isClosedimpl(Object obj) {
        return obj == AbstractC6244e.f36341a;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m579toStringimpl(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m574equalsimpl(this.f36324a, obj);
    }

    public int hashCode() {
        return m577hashCodeimpl(this.f36324a);
    }

    public String toString() {
        return m579toStringimpl(this.f36324a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m580unboximpl() {
        return this.f36324a;
    }

    public static /* synthetic */ void getSegment$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <S extends H> Object m573constructorimpl(Object obj) {
        return obj;
    }
}
