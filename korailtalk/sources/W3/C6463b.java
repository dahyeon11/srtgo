package w3;

import w3.AbstractC6466e;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6463b extends AbstractC6466e {

    /* renamed from: a, reason: collision with root package name */
    private final String f37401a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37402b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6466e.b f37403c;

    /* renamed from: w3.b$b, reason: collision with other inner class name */
    static final class C0430b extends AbstractC6466e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f37404a;

        /* renamed from: b, reason: collision with root package name */
        private Long f37405b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC6466e.b f37406c;

        @Override // w3.AbstractC6466e.a
        public AbstractC6466e build() {
            String str = "";
            if (this.f37405b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6463b(this.f37404a, this.f37405b.longValue(), this.f37406c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w3.AbstractC6466e.a
        public AbstractC6466e.a setResponseCode(AbstractC6466e.b bVar) {
            this.f37406c = bVar;
            return this;
        }

        @Override // w3.AbstractC6466e.a
        public AbstractC6466e.a setToken(String str) {
            this.f37404a = str;
            return this;
        }

        @Override // w3.AbstractC6466e.a
        public AbstractC6466e.a setTokenExpirationTimestamp(long j8) {
            this.f37405b = Long.valueOf(j8);
            return this;
        }

        C0430b() {
        }

        private C0430b(AbstractC6466e abstractC6466e) {
            this.f37404a = abstractC6466e.getToken();
            this.f37405b = Long.valueOf(abstractC6466e.getTokenExpirationTimestamp());
            this.f37406c = abstractC6466e.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6466e)) {
            return false;
        }
        AbstractC6466e abstractC6466e = (AbstractC6466e) obj;
        String str = this.f37401a;
        if (str != null ? str.equals(abstractC6466e.getToken()) : abstractC6466e.getToken() == null) {
            if (this.f37402b == abstractC6466e.getTokenExpirationTimestamp()) {
                AbstractC6466e.b bVar = this.f37403c;
                if (bVar == null) {
                    if (abstractC6466e.getResponseCode() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC6466e.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w3.AbstractC6466e
    public AbstractC6466e.b getResponseCode() {
        return this.f37403c;
    }

    @Override // w3.AbstractC6466e
    public String getToken() {
        return this.f37401a;
    }

    @Override // w3.AbstractC6466e
    public long getTokenExpirationTimestamp() {
        return this.f37402b;
    }

    public int hashCode() {
        String str = this.f37401a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j8 = this.f37402b;
        int i8 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        AbstractC6466e.b bVar = this.f37403c;
        return i8 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // w3.AbstractC6466e
    public AbstractC6466e.a toBuilder() {
        return new C0430b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f37401a + ", tokenExpirationTimestamp=" + this.f37402b + ", responseCode=" + this.f37403c + "}";
    }

    private C6463b(String str, long j8, AbstractC6466e.b bVar) {
        this.f37401a = str;
        this.f37402b = j8;
        this.f37403c = bVar;
    }
}
