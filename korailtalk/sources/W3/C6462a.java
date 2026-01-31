package w3;

import w3.AbstractC6465d;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6462a extends AbstractC6465d {

    /* renamed from: a, reason: collision with root package name */
    private final String f37391a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37392b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37393c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6466e f37394d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC6465d.b f37395e;

    /* renamed from: w3.a$b */
    static final class b extends AbstractC6465d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f37396a;

        /* renamed from: b, reason: collision with root package name */
        private String f37397b;

        /* renamed from: c, reason: collision with root package name */
        private String f37398c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC6466e f37399d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC6465d.b f37400e;

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d build() {
            return new C6462a(this.f37396a, this.f37397b, this.f37398c, this.f37399d, this.f37400e);
        }

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d.a setAuthToken(AbstractC6466e abstractC6466e) {
            this.f37399d = abstractC6466e;
            return this;
        }

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d.a setFid(String str) {
            this.f37397b = str;
            return this;
        }

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d.a setRefreshToken(String str) {
            this.f37398c = str;
            return this;
        }

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d.a setResponseCode(AbstractC6465d.b bVar) {
            this.f37400e = bVar;
            return this;
        }

        @Override // w3.AbstractC6465d.a
        public AbstractC6465d.a setUri(String str) {
            this.f37396a = str;
            return this;
        }

        b() {
        }

        private b(AbstractC6465d abstractC6465d) {
            this.f37396a = abstractC6465d.getUri();
            this.f37397b = abstractC6465d.getFid();
            this.f37398c = abstractC6465d.getRefreshToken();
            this.f37399d = abstractC6465d.getAuthToken();
            this.f37400e = abstractC6465d.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6465d)) {
            return false;
        }
        AbstractC6465d abstractC6465d = (AbstractC6465d) obj;
        String str = this.f37391a;
        if (str != null ? str.equals(abstractC6465d.getUri()) : abstractC6465d.getUri() == null) {
            String str2 = this.f37392b;
            if (str2 != null ? str2.equals(abstractC6465d.getFid()) : abstractC6465d.getFid() == null) {
                String str3 = this.f37393c;
                if (str3 != null ? str3.equals(abstractC6465d.getRefreshToken()) : abstractC6465d.getRefreshToken() == null) {
                    AbstractC6466e abstractC6466e = this.f37394d;
                    if (abstractC6466e != null ? abstractC6466e.equals(abstractC6465d.getAuthToken()) : abstractC6465d.getAuthToken() == null) {
                        AbstractC6465d.b bVar = this.f37395e;
                        if (bVar == null) {
                            if (abstractC6465d.getResponseCode() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC6465d.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // w3.AbstractC6465d
    public AbstractC6466e getAuthToken() {
        return this.f37394d;
    }

    @Override // w3.AbstractC6465d
    public String getFid() {
        return this.f37392b;
    }

    @Override // w3.AbstractC6465d
    public String getRefreshToken() {
        return this.f37393c;
    }

    @Override // w3.AbstractC6465d
    public AbstractC6465d.b getResponseCode() {
        return this.f37395e;
    }

    @Override // w3.AbstractC6465d
    public String getUri() {
        return this.f37391a;
    }

    public int hashCode() {
        String str = this.f37391a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f37392b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37393c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC6466e abstractC6466e = this.f37394d;
        int iHashCode4 = (iHashCode3 ^ (abstractC6466e == null ? 0 : abstractC6466e.hashCode())) * 1000003;
        AbstractC6465d.b bVar = this.f37395e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // w3.AbstractC6465d
    public AbstractC6465d.a toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f37391a + ", fid=" + this.f37392b + ", refreshToken=" + this.f37393c + ", authToken=" + this.f37394d + ", responseCode=" + this.f37395e + "}";
    }

    private C6462a(String str, String str2, String str3, AbstractC6466e abstractC6466e, AbstractC6465d.b bVar) {
        this.f37391a = str;
        this.f37392b = str2;
        this.f37393c = str3;
        this.f37394d = abstractC6466e;
        this.f37395e = bVar;
    }
}
