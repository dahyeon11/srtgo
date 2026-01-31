package C7;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: C7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0480n {
    public static final C0480n CLEARTEXT;
    public static final C0480n COMPATIBLE_TLS;
    public static final C0480n MODERN_TLS;
    public static final C0480n RESTRICTED_TLS;

    /* renamed from: e, reason: collision with root package name */
    private static final C0477k[] f673e;

    /* renamed from: f, reason: collision with root package name */
    private static final C0477k[] f674f;

    /* renamed from: a, reason: collision with root package name */
    final boolean f675a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f676b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f677c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f678d;

    static {
        C0477k c0477k = C0477k.TLS_AES_128_GCM_SHA256;
        C0477k c0477k2 = C0477k.TLS_AES_256_GCM_SHA384;
        C0477k c0477k3 = C0477k.TLS_CHACHA20_POLY1305_SHA256;
        C0477k c0477k4 = C0477k.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        C0477k c0477k5 = C0477k.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        C0477k c0477k6 = C0477k.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        C0477k c0477k7 = C0477k.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        C0477k c0477k8 = C0477k.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        C0477k c0477k9 = C0477k.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        C0477k[] c0477kArr = {c0477k, c0477k2, c0477k3, c0477k4, c0477k5, c0477k6, c0477k7, c0477k8, c0477k9};
        f673e = c0477kArr;
        C0477k[] c0477kArr2 = {c0477k, c0477k2, c0477k3, c0477k4, c0477k5, c0477k6, c0477k7, c0477k8, c0477k9, C0477k.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C0477k.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C0477k.TLS_RSA_WITH_AES_128_GCM_SHA256, C0477k.TLS_RSA_WITH_AES_256_GCM_SHA384, C0477k.TLS_RSA_WITH_AES_128_CBC_SHA, C0477k.TLS_RSA_WITH_AES_256_CBC_SHA, C0477k.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f674f = c0477kArr2;
        a aVarCipherSuites = new a(true).cipherSuites(c0477kArr);
        M m8 = M.TLS_1_3;
        M m9 = M.TLS_1_2;
        RESTRICTED_TLS = aVarCipherSuites.tlsVersions(m8, m9).supportsTlsExtensions(true).build();
        MODERN_TLS = new a(true).cipherSuites(c0477kArr2).tlsVersions(m8, m9).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new a(true).cipherSuites(c0477kArr2).tlsVersions(m8, m9, M.TLS_1_1, M.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new a(false).build();
    }

    C0480n(a aVar) {
        this.f675a = aVar.f679a;
        this.f677c = aVar.f680b;
        this.f678d = aVar.f681c;
        this.f676b = aVar.f682d;
    }

    private C0480n b(SSLSocket sSLSocket, boolean z8) {
        String[] strArrIntersect = this.f677c != null ? D7.e.intersect(C0477k.f669b, sSLSocket.getEnabledCipherSuites(), this.f677c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrIntersect2 = this.f678d != null ? D7.e.intersect(D7.e.NATURAL_ORDER, sSLSocket.getEnabledProtocols(), this.f678d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iIndexOf = D7.e.indexOf(C0477k.f669b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && iIndexOf != -1) {
            strArrIntersect = D7.e.concat(strArrIntersect, supportedCipherSuites[iIndexOf]);
        }
        return new a(this).cipherSuites(strArrIntersect).tlsVersions(strArrIntersect2).build();
    }

    void a(SSLSocket sSLSocket, boolean z8) {
        C0480n c0480nB = b(sSLSocket, z8);
        String[] strArr = c0480nB.f678d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c0480nB.f677c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List<C0477k> cipherSuites() {
        String[] strArr = this.f677c;
        if (strArr != null) {
            return C0477k.b(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0480n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0480n c0480n = (C0480n) obj;
        boolean z8 = this.f675a;
        if (z8 != c0480n.f675a) {
            return false;
        }
        return !z8 || (Arrays.equals(this.f677c, c0480n.f677c) && Arrays.equals(this.f678d, c0480n.f678d) && this.f676b == c0480n.f676b);
    }

    public int hashCode() {
        if (this.f675a) {
            return ((((527 + Arrays.hashCode(this.f677c)) * 31) + Arrays.hashCode(this.f678d)) * 31) + (!this.f676b ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.f675a) {
            return false;
        }
        String[] strArr = this.f678d;
        if (strArr != null && !D7.e.nonEmptyIntersection(D7.e.NATURAL_ORDER, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f677c;
        return strArr2 == null || D7.e.nonEmptyIntersection(C0477k.f669b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean isTls() {
        return this.f675a;
    }

    public boolean supportsTlsExtensions() {
        return this.f676b;
    }

    public List<M> tlsVersions() {
        String[] strArr = this.f678d;
        if (strArr != null) {
            return M.a(strArr);
        }
        return null;
    }

    public String toString() {
        if (!this.f675a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.f676b + ")";
    }

    /* renamed from: C7.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f679a;

        /* renamed from: b, reason: collision with root package name */
        String[] f680b;

        /* renamed from: c, reason: collision with root package name */
        String[] f681c;

        /* renamed from: d, reason: collision with root package name */
        boolean f682d;

        a(boolean z8) {
            this.f679a = z8;
        }

        public a allEnabledCipherSuites() {
            if (!this.f679a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f680b = null;
            return this;
        }

        public a allEnabledTlsVersions() {
            if (!this.f679a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f681c = null;
            return this;
        }

        public C0480n build() {
            return new C0480n(this);
        }

        public a cipherSuites(C0477k... c0477kArr) {
            if (!this.f679a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c0477kArr.length];
            for (int i8 = 0; i8 < c0477kArr.length; i8++) {
                strArr[i8] = c0477kArr[i8].f671a;
            }
            return cipherSuites(strArr);
        }

        public a supportsTlsExtensions(boolean z8) {
            if (!this.f679a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f682d = z8;
            return this;
        }

        public a tlsVersions(M... mArr) {
            if (!this.f679a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[mArr.length];
            for (int i8 = 0; i8 < mArr.length; i8++) {
                strArr[i8] = mArr[i8].f589a;
            }
            return tlsVersions(strArr);
        }

        public a(C0480n c0480n) {
            this.f679a = c0480n.f675a;
            this.f680b = c0480n.f677c;
            this.f681c = c0480n.f678d;
            this.f682d = c0480n.f676b;
        }

        public a cipherSuites(String... strArr) {
            if (this.f679a) {
                if (strArr.length != 0) {
                    this.f680b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a tlsVersions(String... strArr) {
            if (this.f679a) {
                if (strArr.length != 0) {
                    this.f681c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }
}
