package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements Comparable {
    public static final a Companion = new a(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    /* renamed from: a, reason: collision with root package name */
    private final byte f4492a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ w(byte b9) {
        this.f4492a = b9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ w m76boximpl(byte b9) {
        return new w(b9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m78equalsimpl(byte b9, Object obj) {
        return (obj instanceof w) && b9 == ((w) obj).m82unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m79equalsimpl0(byte b9, byte b10) {
        return b9 == b10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m80hashCodeimpl(byte b9) {
        return Byte.hashCode(b9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m81toStringimpl(byte b9) {
        return String.valueOf(b9 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m82unboximpl() & 255, ((w) obj).m82unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m78equalsimpl(this.f4492a, obj);
    }

    public int hashCode() {
        return m80hashCodeimpl(this.f4492a);
    }

    public String toString() {
        return m81toStringimpl(this.f4492a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m82unboximpl() {
        return this.f4492a;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m77constructorimpl(byte b9) {
        return b9;
    }
}
