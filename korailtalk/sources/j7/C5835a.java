package j7;

import S6.AbstractC0775q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5835a implements Iterable, KMappedMarker {
    public static final C0335a Companion = new C0335a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f33493a;

    /* renamed from: b, reason: collision with root package name */
    private final char f33494b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33495c;

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    public static final class C0335a {
        public /* synthetic */ C0335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5835a fromClosedRange(char c9, char c10, int i8) {
            return new C5835a(c9, c10, i8);
        }

        private C0335a() {
        }
    }

    public C5835a(char c9, char c10, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f33493a = c9;
        this.f33494b = (char) a7.c.getProgressionLastElement((int) c9, (int) c10, i8);
        this.f33495c = i8;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5835a) {
            if (!isEmpty() || !((C5835a) obj).isEmpty()) {
                C5835a c5835a = (C5835a) obj;
                if (this.f33493a != c5835a.f33493a || this.f33494b != c5835a.f33494b || this.f33495c != c5835a.f33495c) {
                }
            }
            return true;
        }
        return false;
    }

    public final char getFirst() {
        return this.f33493a;
    }

    public final char getLast() {
        return this.f33494b;
    }

    public final int getStep() {
        return this.f33495c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f33493a * 31) + this.f33494b) * 31) + this.f33495c;
    }

    public boolean isEmpty() {
        if (this.f33495c > 0) {
            if (Intrinsics.compare((int) this.f33493a, (int) this.f33494b) <= 0) {
                return false;
            }
        } else if (Intrinsics.compare((int) this.f33493a, (int) this.f33494b) >= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f33495c > 0) {
            sb = new StringBuilder();
            sb.append(this.f33493a);
            sb.append("..");
            sb.append(this.f33494b);
            sb.append(" step ");
            i8 = this.f33495c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33493a);
            sb.append(" downTo ");
            sb.append(this.f33494b);
            sb.append(" step ");
            i8 = -this.f33495c;
        }
        sb.append(i8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public AbstractC0775q iterator() {
        return new b(this.f33493a, this.f33494b, this.f33495c);
    }
}
