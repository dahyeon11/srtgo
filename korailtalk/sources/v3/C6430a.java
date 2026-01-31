package v3;

import v3.c;
import v3.d;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C6430a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f37224a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a f37225b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37226c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37227d;

    /* renamed from: e, reason: collision with root package name */
    private final long f37228e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37229f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37230g;

    /* renamed from: v3.a$b */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f37231a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f37232b;

        /* renamed from: c, reason: collision with root package name */
        private String f37233c;

        /* renamed from: d, reason: collision with root package name */
        private String f37234d;

        /* renamed from: e, reason: collision with root package name */
        private Long f37235e;

        /* renamed from: f, reason: collision with root package name */
        private Long f37236f;

        /* renamed from: g, reason: collision with root package name */
        private String f37237g;

        @Override // v3.d.a
        public d build() {
            String str = "";
            if (this.f37232b == null) {
                str = " registrationStatus";
            }
            if (this.f37235e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f37236f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C6430a(this.f37231a, this.f37232b, this.f37233c, this.f37234d, this.f37235e.longValue(), this.f37236f.longValue(), this.f37237g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v3.d.a
        public d.a setAuthToken(String str) {
            this.f37233c = str;
            return this;
        }

        @Override // v3.d.a
        public d.a setExpiresInSecs(long j8) {
            this.f37235e = Long.valueOf(j8);
            return this;
        }

        @Override // v3.d.a
        public d.a setFirebaseInstallationId(String str) {
            this.f37231a = str;
            return this;
        }

        @Override // v3.d.a
        public d.a setFisError(String str) {
            this.f37237g = str;
            return this;
        }

        @Override // v3.d.a
        public d.a setRefreshToken(String str) {
            this.f37234d = str;
            return this;
        }

        @Override // v3.d.a
        public d.a setRegistrationStatus(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f37232b = aVar;
            return this;
        }

        @Override // v3.d.a
        public d.a setTokenCreationEpochInSecs(long j8) {
            this.f37236f = Long.valueOf(j8);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f37231a = dVar.getFirebaseInstallationId();
            this.f37232b = dVar.getRegistrationStatus();
            this.f37233c = dVar.getAuthToken();
            this.f37234d = dVar.getRefreshToken();
            this.f37235e = Long.valueOf(dVar.getExpiresInSecs());
            this.f37236f = Long.valueOf(dVar.getTokenCreationEpochInSecs());
            this.f37237g = dVar.getFisError();
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f37224a;
        if (str3 != null ? str3.equals(dVar.getFirebaseInstallationId()) : dVar.getFirebaseInstallationId() == null) {
            if (this.f37225b.equals(dVar.getRegistrationStatus()) && ((str = this.f37226c) != null ? str.equals(dVar.getAuthToken()) : dVar.getAuthToken() == null) && ((str2 = this.f37227d) != null ? str2.equals(dVar.getRefreshToken()) : dVar.getRefreshToken() == null) && this.f37228e == dVar.getExpiresInSecs() && this.f37229f == dVar.getTokenCreationEpochInSecs()) {
                String str4 = this.f37230g;
                if (str4 == null) {
                    if (dVar.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v3.d
    public String getAuthToken() {
        return this.f37226c;
    }

    @Override // v3.d
    public long getExpiresInSecs() {
        return this.f37228e;
    }

    @Override // v3.d
    public String getFirebaseInstallationId() {
        return this.f37224a;
    }

    @Override // v3.d
    public String getFisError() {
        return this.f37230g;
    }

    @Override // v3.d
    public String getRefreshToken() {
        return this.f37227d;
    }

    @Override // v3.d
    public c.a getRegistrationStatus() {
        return this.f37225b;
    }

    @Override // v3.d
    public long getTokenCreationEpochInSecs() {
        return this.f37229f;
    }

    public int hashCode() {
        String str = this.f37224a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f37225b.hashCode()) * 1000003;
        String str2 = this.f37226c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37227d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j8 = this.f37228e;
        int i8 = (iHashCode3 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f37229f;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f37230g;
        return i9 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // v3.d
    public d.a toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f37224a + ", registrationStatus=" + this.f37225b + ", authToken=" + this.f37226c + ", refreshToken=" + this.f37227d + ", expiresInSecs=" + this.f37228e + ", tokenCreationEpochInSecs=" + this.f37229f + ", fisError=" + this.f37230g + "}";
    }

    private C6430a(String str, c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f37224a = str;
        this.f37225b = aVar;
        this.f37226c = str2;
        this.f37227d = str3;
        this.f37228e = j8;
        this.f37229f = j9;
        this.f37230g = str4;
    }
}
