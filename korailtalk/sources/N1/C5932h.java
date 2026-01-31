package n1;

import java.util.List;
import n1.AbstractC5942r;

/* renamed from: n1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5932h extends AbstractC5942r {

    /* renamed from: a, reason: collision with root package name */
    private final long f34180a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34181b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5937m f34182c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34183d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34184e;

    /* renamed from: f, reason: collision with root package name */
    private final List f34185f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC5926b f34186g;

    /* renamed from: n1.h$b */
    static final class b extends AbstractC5942r.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f34187a;

        /* renamed from: b, reason: collision with root package name */
        private Long f34188b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5937m f34189c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f34190d;

        /* renamed from: e, reason: collision with root package name */
        private String f34191e;

        /* renamed from: f, reason: collision with root package name */
        private List f34192f;

        /* renamed from: g, reason: collision with root package name */
        private EnumC5926b f34193g;

        b() {
        }

        @Override // n1.AbstractC5942r.a
        AbstractC5942r.a a(int i8) {
            this.f34190d = Integer.valueOf(i8);
            return this;
        }

        @Override // n1.AbstractC5942r.a
        AbstractC5942r.a b(String str) {
            this.f34191e = str;
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r.a zza(long j8) {
            this.f34187a = Long.valueOf(j8);
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r.a zzb(long j8) {
            this.f34188b = Long.valueOf(j8);
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r.a zza(AbstractC5937m abstractC5937m) {
            this.f34189c = abstractC5937m;
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r.a zza(List<AbstractC5940p> list) {
            this.f34192f = list;
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r.a zza(EnumC5926b enumC5926b) {
            this.f34193g = enumC5926b;
            return this;
        }

        @Override // n1.AbstractC5942r.a
        public AbstractC5942r zza() {
            String str = "";
            if (this.f34187a == null) {
                str = " requestTimeMs";
            }
            if (this.f34188b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f34190d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new C5932h(this.f34187a.longValue(), this.f34188b.longValue(), this.f34189c, this.f34190d.intValue(), this.f34191e, this.f34192f, this.f34193g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ C5932h(long j8, long j9, AbstractC5937m abstractC5937m, int i8, String str, List list, EnumC5926b enumC5926b, a aVar) {
        this.f34180a = j8;
        this.f34181b = j9;
        this.f34182c = abstractC5937m;
        this.f34183d = i8;
        this.f34184e = str;
        this.f34185f = list;
        this.f34186g = enumC5926b;
    }

    public boolean equals(Object obj) {
        AbstractC5937m abstractC5937m;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5942r)) {
            return false;
        }
        C5932h c5932h = (C5932h) ((AbstractC5942r) obj);
        if (this.f34180a == c5932h.f34180a && this.f34181b == c5932h.f34181b && ((abstractC5937m = this.f34182c) != null ? abstractC5937m.equals(c5932h.f34182c) : c5932h.f34182c == null) && this.f34183d == c5932h.f34183d && ((str = this.f34184e) != null ? str.equals(c5932h.f34184e) : c5932h.f34184e == null) && ((list = this.f34185f) != null ? list.equals(c5932h.f34185f) : c5932h.f34185f == null)) {
            EnumC5926b enumC5926b = this.f34186g;
            if (enumC5926b == null) {
                if (c5932h.f34186g == null) {
                    return true;
                }
            } else if (enumC5926b.equals(c5932h.f34186g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f34180a;
        long j9 = this.f34181b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        AbstractC5937m abstractC5937m = this.f34182c;
        int iHashCode = (((i8 ^ (abstractC5937m == null ? 0 : abstractC5937m.hashCode())) * 1000003) ^ this.f34183d) * 1000003;
        String str = this.f34184e;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f34185f;
        int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC5926b enumC5926b = this.f34186g;
        return iHashCode3 ^ (enumC5926b != null ? enumC5926b.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f34180a + ", requestUptimeMs=" + this.f34181b + ", clientInfo=" + this.f34182c + ", logSource=" + this.f34183d + ", logSourceName=" + this.f34184e + ", logEvents=" + this.f34185f + ", qosTier=" + this.f34186g + "}";
    }

    public AbstractC5937m zzb() {
        return this.f34182c;
    }

    public List<AbstractC5940p> zzc() {
        return this.f34185f;
    }

    public int zzd() {
        return this.f34183d;
    }

    public String zze() {
        return this.f34184e;
    }

    public long zzf() {
        return this.f34180a;
    }

    public long zzg() {
        return this.f34181b;
    }
}
