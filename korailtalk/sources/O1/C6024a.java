package o1;

import java.util.Map;
import o1.h;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6024a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final String f34381a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f34382b;

    /* renamed from: c, reason: collision with root package name */
    private final g f34383c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34384d;

    /* renamed from: e, reason: collision with root package name */
    private final long f34385e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f34386f;

    /* renamed from: o1.a$b */
    static final class b extends h.a {

        /* renamed from: a, reason: collision with root package name */
        private String f34387a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f34388b;

        /* renamed from: c, reason: collision with root package name */
        private g f34389c;

        /* renamed from: d, reason: collision with root package name */
        private Long f34390d;

        /* renamed from: e, reason: collision with root package name */
        private Long f34391e;

        /* renamed from: f, reason: collision with root package name */
        private Map f34392f;

        b() {
        }

        @Override // o1.h.a
        protected Map a() {
            Map map = this.f34392f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o1.h.a
        protected h.a b(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f34392f = map;
            return this;
        }

        @Override // o1.h.a
        public h build() {
            String str = "";
            if (this.f34387a == null) {
                str = " transportName";
            }
            if (this.f34389c == null) {
                str = str + " encodedPayload";
            }
            if (this.f34390d == null) {
                str = str + " eventMillis";
            }
            if (this.f34391e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f34392f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6024a(this.f34387a, this.f34388b, this.f34389c, this.f34390d.longValue(), this.f34391e.longValue(), this.f34392f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o1.h.a
        public h.a setCode(Integer num) {
            this.f34388b = num;
            return this;
        }

        @Override // o1.h.a
        public h.a setEncodedPayload(g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f34389c = gVar;
            return this;
        }

        @Override // o1.h.a
        public h.a setEventMillis(long j8) {
            this.f34390d = Long.valueOf(j8);
            return this;
        }

        @Override // o1.h.a
        public h.a setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f34387a = str;
            return this;
        }

        @Override // o1.h.a
        public h.a setUptimeMillis(long j8) {
            this.f34391e = Long.valueOf(j8);
            return this;
        }
    }

    @Override // o1.h
    protected Map a() {
        return this.f34386f;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f34381a.equals(hVar.getTransportName()) && ((num = this.f34382b) != null ? num.equals(hVar.getCode()) : hVar.getCode() == null) && this.f34383c.equals(hVar.getEncodedPayload()) && this.f34384d == hVar.getEventMillis() && this.f34385e == hVar.getUptimeMillis() && this.f34386f.equals(hVar.a());
    }

    @Override // o1.h
    public Integer getCode() {
        return this.f34382b;
    }

    @Override // o1.h
    public g getEncodedPayload() {
        return this.f34383c;
    }

    @Override // o1.h
    public long getEventMillis() {
        return this.f34384d;
    }

    @Override // o1.h
    public String getTransportName() {
        return this.f34381a;
    }

    @Override // o1.h
    public long getUptimeMillis() {
        return this.f34385e;
    }

    public int hashCode() {
        int iHashCode = (this.f34381a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f34382b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f34383c.hashCode()) * 1000003;
        long j8 = this.f34384d;
        int i8 = (iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f34385e;
        return ((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f34386f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f34381a + ", code=" + this.f34382b + ", encodedPayload=" + this.f34383c + ", eventMillis=" + this.f34384d + ", uptimeMillis=" + this.f34385e + ", autoMetadata=" + this.f34386f + "}";
    }

    private C6024a(String str, Integer num, g gVar, long j8, long j9, Map map) {
        this.f34381a = str;
        this.f34382b = num;
        this.f34383c = gVar;
        this.f34384d = j8;
        this.f34385e = j9;
        this.f34386f = map;
    }
}
