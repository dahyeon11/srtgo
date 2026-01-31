package j7;

import S6.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public class m implements Iterable, KMappedMarker {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f33517a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33518b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33519c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m fromClosedRange(long j8, long j9, long j10) {
            return new m(j8, j9, j10);
        }

        private a() {
        }
    }

    public m(long j8, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f33517a = j8;
        this.f33518b = a7.c.getProgressionLastElement(j8, j9, j10);
        this.f33519c = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (this.f33517a != mVar.f33517a || this.f33518b != mVar.f33518b || this.f33519c != mVar.f33519c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.f33517a;
    }

    public final long getLast() {
        return this.f33518b;
    }

    public final long getStep() {
        return this.f33519c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = 31;
        long j9 = this.f33517a;
        long j10 = this.f33518b;
        long j11 = j8 * (((j9 ^ (j9 >>> 32)) * j8) + (j10 ^ (j10 >>> 32)));
        long j12 = this.f33519c;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j8 = this.f33519c;
        long j9 = this.f33517a;
        long j10 = this.f33518b;
        if (j8 > 0) {
            if (j9 <= j10) {
                return false;
            }
        } else if (j9 >= j10) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        long j8;
        if (this.f33519c > 0) {
            sb = new StringBuilder();
            sb.append(this.f33517a);
            sb.append("..");
            sb.append(this.f33518b);
            sb.append(" step ");
            j8 = this.f33519c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f33517a);
            sb.append(" downTo ");
            sb.append(this.f33518b);
            sb.append(" step ");
            j8 = -this.f33519c;
        }
        sb.append(j8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public N iterator() {
        return new n(this.f33517a, this.f33518b, this.f33519c);
    }
}
