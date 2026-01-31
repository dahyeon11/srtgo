package j7;

import S6.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public class j implements Iterable, KMappedMarker {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f33509a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33510b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33511c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j fromClosedRange(int i8, int i9, int i10) {
            return new j(i8, i9, i10);
        }

        private a() {
        }
    }

    public j(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f33509a = i8;
        this.f33510b = a7.c.getProgressionLastElement(i8, i9, i10);
        this.f33511c = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f33509a != jVar.f33509a || this.f33510b != jVar.f33510b || this.f33511c != jVar.f33511c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.f33509a;
    }

    public final int getLast() {
        return this.f33510b;
    }

    public final int getStep() {
        return this.f33511c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f33509a * 31) + this.f33510b) * 31) + this.f33511c;
    }

    public boolean isEmpty() {
        if (this.f33511c > 0) {
            if (this.f33509a <= this.f33510b) {
                return false;
            }
        } else if (this.f33509a >= this.f33510b) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f33511c > 0) {
            sb = new StringBuilder();
            sb.append(this.f33509a);
            sb.append("..");
            sb.append(this.f33510b);
            sb.append(" step ");
            i8 = this.f33511c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33509a);
            sb.append(" downTo ");
            sb.append(this.f33510b);
            sb.append(" step ");
            i8 = -this.f33511c;
        }
        sb.append(i8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public M iterator() {
        return new k(this.f33509a, this.f33510b, this.f33511c);
    }
}
