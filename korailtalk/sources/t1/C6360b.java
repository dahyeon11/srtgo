package t1;

import java.util.Set;
import t1.d;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6360b extends d.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f36886a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36887b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f36888c;

    /* renamed from: t1.b$b, reason: collision with other inner class name */
    static final class C0423b extends d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f36889a;

        /* renamed from: b, reason: collision with root package name */
        private Long f36890b;

        /* renamed from: c, reason: collision with root package name */
        private Set f36891c;

        C0423b() {
        }

        @Override // t1.d.b.a
        public d.b build() {
            String str = "";
            if (this.f36889a == null) {
                str = " delta";
            }
            if (this.f36890b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f36891c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6360b(this.f36889a.longValue(), this.f36890b.longValue(), this.f36891c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // t1.d.b.a
        public d.b.a setDelta(long j8) {
            this.f36889a = Long.valueOf(j8);
            return this;
        }

        @Override // t1.d.b.a
        public d.b.a setFlags(Set<d.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f36891c = set;
            return this;
        }

        @Override // t1.d.b.a
        public d.b.a setMaxAllowedDelay(long j8) {
            this.f36890b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // t1.d.b
    long a() {
        return this.f36886a;
    }

    @Override // t1.d.b
    Set b() {
        return this.f36888c;
    }

    @Override // t1.d.b
    long c() {
        return this.f36887b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d.b)) {
            return false;
        }
        d.b bVar = (d.b) obj;
        return this.f36886a == bVar.a() && this.f36887b == bVar.c() && this.f36888c.equals(bVar.b());
    }

    public int hashCode() {
        long j8 = this.f36886a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f36887b;
        return ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f36888c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f36886a + ", maxAllowedDelay=" + this.f36887b + ", flags=" + this.f36888c + "}";
    }

    private C6360b(long j8, long j9, Set set) {
        this.f36886a = j8;
        this.f36887b = j9;
        this.f36888c = set;
    }
}
