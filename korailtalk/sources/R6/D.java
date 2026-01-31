package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class D implements Comparable {
    public static final a Companion = new a(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    /* renamed from: a, reason: collision with root package name */
    private final short f4466a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ D(short s8) {
        this.f4466a = s8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ D m37boximpl(short s8) {
        return new D(s8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m39equalsimpl(short s8, Object obj) {
        return (obj instanceof D) && s8 == ((D) obj).m43unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m40equalsimpl0(short s8, short s9) {
        return s8 == s9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m41hashCodeimpl(short s8) {
        return Short.hashCode(s8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m42toStringimpl(short s8) {
        return String.valueOf(s8 & MAX_VALUE);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m43unboximpl() & MAX_VALUE, ((D) obj).m43unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m39equalsimpl(this.f4466a, obj);
    }

    public int hashCode() {
        return m41hashCodeimpl(this.f4466a);
    }

    public String toString() {
        return m42toStringimpl(this.f4466a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m43unboximpl() {
        return this.f4466a;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m38constructorimpl(short s8) {
        return s8;
    }
}
