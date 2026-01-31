package R6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0753g implements Comparable {
    public static final int MAX_COMPONENT_VALUE = 255;

    /* renamed from: a, reason: collision with root package name */
    private final int f4473a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4474b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4475c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4476d;
    public static final a Companion = new a(null);
    public static final C0753g CURRENT = C0754h.get();

    /* renamed from: R6.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C0753g(int i8, int i9, int i10) {
        this.f4473a = i8;
        this.f4474b = i9;
        this.f4475c = i10;
        this.f4476d = a(i8, i9, i10);
    }

    private final int a(int i8, int i9, int i10) {
        if (new j7.l(0, 255).contains(i8) && new j7.l(0, 255).contains(i9) && new j7.l(0, 255).contains(i10)) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + Q7.C.PACKAGE_SEPARATOR_CHAR + i9 + Q7.C.PACKAGE_SEPARATOR_CHAR + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0753g c0753g = obj instanceof C0753g ? (C0753g) obj : null;
        return c0753g != null && this.f4476d == c0753g.f4476d;
    }

    public final int getMajor() {
        return this.f4473a;
    }

    public final int getMinor() {
        return this.f4474b;
    }

    public final int getPatch() {
        return this.f4475c;
    }

    public int hashCode() {
        return this.f4476d;
    }

    public final boolean isAtLeast(int i8, int i9) {
        int i10 = this.f4473a;
        return i10 > i8 || (i10 == i8 && this.f4474b >= i9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4473a);
        sb.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
        sb.append(this.f4474b);
        sb.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
        sb.append(this.f4475c);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(C0753g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f4476d - other.f4476d;
    }

    public final boolean isAtLeast(int i8, int i9, int i10) {
        int i11;
        int i12 = this.f4473a;
        return i12 > i8 || (i12 == i8 && ((i11 = this.f4474b) > i9 || (i11 == i9 && this.f4475c >= i10)));
    }

    public C0753g(int i8, int i9) {
        this(i8, i9, 0);
    }
}
