package n1;

import n1.AbstractC5925a;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5928d extends AbstractC5925a {

    /* renamed from: a, reason: collision with root package name */
    private final int f34145a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34146b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34147c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34148d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34149e;

    /* renamed from: f, reason: collision with root package name */
    private final String f34150f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34151g;

    /* renamed from: h, reason: collision with root package name */
    private final String f34152h;

    /* renamed from: n1.d$b */
    static final class b extends AbstractC5925a.AbstractC0353a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f34153a;

        /* renamed from: b, reason: collision with root package name */
        private String f34154b;

        /* renamed from: c, reason: collision with root package name */
        private String f34155c;

        /* renamed from: d, reason: collision with root package name */
        private String f34156d;

        /* renamed from: e, reason: collision with root package name */
        private String f34157e;

        /* renamed from: f, reason: collision with root package name */
        private String f34158f;

        /* renamed from: g, reason: collision with root package name */
        private String f34159g;

        /* renamed from: h, reason: collision with root package name */
        private String f34160h;

        b() {
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zza(int i8) {
            this.f34153a = Integer.valueOf(i8);
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zzb(String str) {
            this.f34160h = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zzc(String str) {
            this.f34155c = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zzd(String str) {
            this.f34159g = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zze(String str) {
            this.f34154b = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zzf(String str) {
            this.f34158f = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zzg(String str) {
            this.f34157e = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a.AbstractC0353a zza(String str) {
            this.f34156d = str;
            return this;
        }

        @Override // n1.AbstractC5925a.AbstractC0353a
        public AbstractC5925a zza() {
            String str = "";
            if (this.f34153a == null) {
                str = " sdkVersion";
            }
            if (str.isEmpty()) {
                return new C5928d(this.f34153a.intValue(), this.f34154b, this.f34155c, this.f34156d, this.f34157e, this.f34158f, this.f34159g, this.f34160h, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ C5928d(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.f34145a = i8;
        this.f34146b = str;
        this.f34147c = str2;
        this.f34148d = str3;
        this.f34149e = str4;
        this.f34150f = str5;
        this.f34151g = str6;
        this.f34152h = str7;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5925a)) {
            return false;
        }
        C5928d c5928d = (C5928d) ((AbstractC5925a) obj);
        if (this.f34145a == c5928d.f34145a && ((str = this.f34146b) != null ? str.equals(c5928d.f34146b) : c5928d.f34146b == null) && ((str2 = this.f34147c) != null ? str2.equals(c5928d.f34147c) : c5928d.f34147c == null) && ((str3 = this.f34148d) != null ? str3.equals(c5928d.f34148d) : c5928d.f34148d == null) && ((str4 = this.f34149e) != null ? str4.equals(c5928d.f34149e) : c5928d.f34149e == null) && ((str5 = this.f34150f) != null ? str5.equals(c5928d.f34150f) : c5928d.f34150f == null) && ((str6 = this.f34151g) != null ? str6.equals(c5928d.f34151g) : c5928d.f34151g == null)) {
            String str7 = this.f34152h;
            if (str7 == null) {
                if (c5928d.f34152h == null) {
                    return true;
                }
            } else if (str7.equals(c5928d.f34152h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8 = (this.f34145a ^ 1000003) * 1000003;
        String str = this.f34146b;
        int iHashCode = (i8 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f34147c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f34148d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f34149e;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f34150f;
        int iHashCode5 = (iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f34151g;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f34152h;
        return iHashCode6 ^ (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f34145a + ", model=" + this.f34146b + ", hardware=" + this.f34147c + ", device=" + this.f34148d + ", product=" + this.f34149e + ", osBuild=" + this.f34150f + ", manufacturer=" + this.f34151g + ", fingerprint=" + this.f34152h + "}";
    }

    public String zzb() {
        return this.f34148d;
    }

    public String zzc() {
        return this.f34152h;
    }

    public String zzd() {
        return this.f34147c;
    }

    public String zze() {
        return this.f34151g;
    }

    public String zzf() {
        return this.f34146b;
    }

    public String zzg() {
        return this.f34150f;
    }

    public String zzh() {
        return this.f34149e;
    }

    public int zzi() {
        return this.f34145a;
    }
}
