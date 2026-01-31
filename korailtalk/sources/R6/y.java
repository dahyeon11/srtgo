package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class y implements Comparable {
    public static final a Companion = new a(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;

    /* renamed from: a, reason: collision with root package name */
    private final int f4496a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ y(int i8) {
        this.f4496a = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ y m101boximpl(int i8) {
        return new y(i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m103equalsimpl(int i8, Object obj) {
        return (obj instanceof y) && i8 == ((y) obj).m107unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m104equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m105hashCodeimpl(int i8) {
        return Integer.hashCode(i8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m106toStringimpl(int i8) {
        return String.valueOf(i8 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return J.uintCompare(m107unboximpl(), ((y) obj).m107unboximpl());
    }

    public boolean equals(Object obj) {
        return m103equalsimpl(this.f4496a, obj);
    }

    public int hashCode() {
        return m105hashCodeimpl(this.f4496a);
    }

    public String toString() {
        return m106toStringimpl(this.f4496a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m107unboximpl() {
        return this.f4496a;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m102constructorimpl(int i8) {
        return i8;
    }
}
