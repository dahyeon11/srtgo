package com.google.firebase.installations;

import com.google.firebase.installations.m;

/* loaded from: classes2.dex */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final String f25698a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25699b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25700c;

    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25701a;

        /* renamed from: b, reason: collision with root package name */
        private Long f25702b;

        /* renamed from: c, reason: collision with root package name */
        private Long f25703c;

        @Override // com.google.firebase.installations.m.a
        public m build() {
            String str = "";
            if (this.f25701a == null) {
                str = " token";
            }
            if (this.f25702b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f25703c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f25701a, this.f25702b.longValue(), this.f25703c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.m.a
        public m.a setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f25701a = str;
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a setTokenCreationTimestamp(long j8) {
            this.f25703c = Long.valueOf(j8);
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a setTokenExpirationTimestamp(long j8) {
            this.f25702b = Long.valueOf(j8);
            return this;
        }

        b() {
        }

        private b(m mVar) {
            this.f25701a = mVar.getToken();
            this.f25702b = Long.valueOf(mVar.getTokenExpirationTimestamp());
            this.f25703c = Long.valueOf(mVar.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f25698a.equals(mVar.getToken()) && this.f25699b == mVar.getTokenExpirationTimestamp() && this.f25700c == mVar.getTokenCreationTimestamp();
    }

    @Override // com.google.firebase.installations.m
    public String getToken() {
        return this.f25698a;
    }

    @Override // com.google.firebase.installations.m
    public long getTokenCreationTimestamp() {
        return this.f25700c;
    }

    @Override // com.google.firebase.installations.m
    public long getTokenExpirationTimestamp() {
        return this.f25699b;
    }

    public int hashCode() {
        int iHashCode = (this.f25698a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f25699b;
        long j9 = this.f25700c;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    @Override // com.google.firebase.installations.m
    public m.a toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f25698a + ", tokenExpirationTimestamp=" + this.f25699b + ", tokenCreationTimestamp=" + this.f25700c + "}";
    }

    private a(String str, long j8, long j9) {
        this.f25698a = str;
        this.f25699b = j8;
        this.f25700c = j9;
    }
}
