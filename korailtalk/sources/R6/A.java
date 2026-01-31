package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class A implements Comparable {
    public static final a Companion = new a(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;

    /* renamed from: a, reason: collision with root package name */
    private final long f4462a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ A(long j8) {
        this.f4462a = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ A m12boximpl(long j8) {
        return new A(j8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m14equalsimpl(long j8, Object obj) {
        return (obj instanceof A) && j8 == ((A) obj).m18unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m15equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16hashCodeimpl(long j8) {
        return Long.hashCode(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m17toStringimpl(long j8) {
        return J.ulongToString(j8);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return J.ulongCompare(m18unboximpl(), ((A) obj).m18unboximpl());
    }

    public boolean equals(Object obj) {
        return m14equalsimpl(this.f4462a, obj);
    }

    public int hashCode() {
        return m16hashCodeimpl(this.f4462a);
    }

    public String toString() {
        return m17toStringimpl(this.f4462a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m18unboximpl() {
        return this.f4462a;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13constructorimpl(long j8) {
        return j8;
    }
}
