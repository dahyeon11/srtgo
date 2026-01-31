package u1;

import u1.AbstractC6408d;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6405a extends AbstractC6408d {

    /* renamed from: b, reason: collision with root package name */
    private final long f37064b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37065c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37066d;

    /* renamed from: e, reason: collision with root package name */
    private final long f37067e;

    /* renamed from: u1.a$b */
    static final class b extends AbstractC6408d.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f37068a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f37069b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f37070c;

        /* renamed from: d, reason: collision with root package name */
        private Long f37071d;

        b() {
        }

        @Override // u1.AbstractC6408d.a
        AbstractC6408d a() {
            String str = "";
            if (this.f37068a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f37069b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f37070c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f37071d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C6405a(this.f37068a.longValue(), this.f37069b.intValue(), this.f37070c.intValue(), this.f37071d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // u1.AbstractC6408d.a
        AbstractC6408d.a b(int i8) {
            this.f37070c = Integer.valueOf(i8);
            return this;
        }

        @Override // u1.AbstractC6408d.a
        AbstractC6408d.a c(long j8) {
            this.f37071d = Long.valueOf(j8);
            return this;
        }

        @Override // u1.AbstractC6408d.a
        AbstractC6408d.a d(int i8) {
            this.f37069b = Integer.valueOf(i8);
            return this;
        }

        @Override // u1.AbstractC6408d.a
        AbstractC6408d.a e(long j8) {
            this.f37068a = Long.valueOf(j8);
            return this;
        }
    }

    @Override // u1.AbstractC6408d
    int b() {
        return this.f37066d;
    }

    @Override // u1.AbstractC6408d
    long c() {
        return this.f37067e;
    }

    @Override // u1.AbstractC6408d
    int d() {
        return this.f37065c;
    }

    @Override // u1.AbstractC6408d
    long e() {
        return this.f37064b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6408d)) {
            return false;
        }
        AbstractC6408d abstractC6408d = (AbstractC6408d) obj;
        return this.f37064b == abstractC6408d.e() && this.f37065c == abstractC6408d.d() && this.f37066d == abstractC6408d.b() && this.f37067e == abstractC6408d.c();
    }

    public int hashCode() {
        long j8 = this.f37064b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f37065c) * 1000003) ^ this.f37066d) * 1000003;
        long j9 = this.f37067e;
        return i8 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f37064b + ", loadBatchSize=" + this.f37065c + ", criticalSectionEnterTimeoutMs=" + this.f37066d + ", eventCleanUpAge=" + this.f37067e + "}";
    }

    private C6405a(long j8, int i8, int i9, long j9) {
        this.f37064b = j8;
        this.f37065c = i8;
        this.f37066d = i9;
        this.f37067e = j9;
    }
}
