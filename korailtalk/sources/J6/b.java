package J6;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {
    public static final b CLEARTEXT;
    public static final b COMPATIBLE_TLS;
    public static final b MODERN_TLS;

    /* renamed from: e, reason: collision with root package name */
    private static final J6.a[] f2631e;

    /* renamed from: a, reason: collision with root package name */
    final boolean f2632a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f2633b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f2634c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f2635d;

    static {
        J6.a[] aVarArr = {J6.a.TLS_AES_128_GCM_SHA256, J6.a.TLS_AES_256_GCM_SHA384, J6.a.TLS_CHACHA20_POLY1305_SHA256, J6.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, J6.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, J6.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, J6.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, J6.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, J6.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, J6.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, J6.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, J6.a.TLS_RSA_WITH_AES_128_GCM_SHA256, J6.a.TLS_RSA_WITH_AES_256_GCM_SHA384, J6.a.TLS_RSA_WITH_AES_128_CBC_SHA, J6.a.TLS_RSA_WITH_AES_256_CBC_SHA, J6.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f2631e = aVarArr;
        C0047b c0047bCipherSuites = new C0047b(true).cipherSuites(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b bVarBuild = c0047bCipherSuites.tlsVersions(kVar, kVar2).supportsTlsExtensions(true).build();
        MODERN_TLS = bVarBuild;
        COMPATIBLE_TLS = new C0047b(bVarBuild).tlsVersions(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new C0047b(false).build();
    }

    private static boolean c(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (l.equal(obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                if (c(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private b e(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        if (this.f2633b != null) {
            enabledCipherSuites = (String[]) l.intersect(String.class, this.f2633b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z8 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C0047b(this).cipherSuites(enabledCipherSuites).tlsVersions((String[]) l.intersect(String.class, this.f2634c, sSLSocket.getEnabledProtocols())).build();
    }

    public void apply(SSLSocket sSLSocket, boolean z8) {
        b bVarE = e(sSLSocket, z8);
        sSLSocket.setEnabledProtocols(bVarE.f2634c);
        String[] strArr = bVarE.f2633b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<J6.a> cipherSuites() {
        String[] strArr = this.f2633b;
        if (strArr == null) {
            return null;
        }
        J6.a[] aVarArr = new J6.a[strArr.length];
        int i8 = 0;
        while (true) {
            String[] strArr2 = this.f2633b;
            if (i8 >= strArr2.length) {
                return l.immutableList(aVarArr);
            }
            aVarArr[i8] = J6.a.forJavaName(strArr2[i8]);
            i8++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z8 = this.f2632a;
        if (z8 != bVar.f2632a) {
            return false;
        }
        return !z8 || (Arrays.equals(this.f2633b, bVar.f2633b) && Arrays.equals(this.f2634c, bVar.f2634c) && this.f2635d == bVar.f2635d);
    }

    public int hashCode() {
        if (this.f2632a) {
            return ((((527 + Arrays.hashCode(this.f2633b)) * 31) + Arrays.hashCode(this.f2634c)) * 31) + (!this.f2635d ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.f2632a) {
            return false;
        }
        if (!d(this.f2634c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f2633b == null) {
            return sSLSocket.getEnabledCipherSuites().length > 0;
        }
        return d(this.f2633b, sSLSocket.getEnabledCipherSuites());
    }

    public boolean isTls() {
        return this.f2632a;
    }

    public boolean supportsTlsExtensions() {
        return this.f2635d;
    }

    public List<k> tlsVersions() {
        k[] kVarArr = new k[this.f2634c.length];
        int i8 = 0;
        while (true) {
            String[] strArr = this.f2634c;
            if (i8 >= strArr.length) {
                return l.immutableList(kVarArr);
            }
            kVarArr[i8] = k.forJavaName(strArr[i8]);
            i8++;
        }
    }

    public String toString() {
        if (!this.f2632a) {
            return "ConnectionSpec()";
        }
        List<J6.a> listCipherSuites = cipherSuites();
        return "ConnectionSpec(cipherSuites=" + (listCipherSuites == null ? "[use default]" : listCipherSuites.toString()) + ", tlsVersions=" + tlsVersions() + ", supportsTlsExtensions=" + this.f2635d + ")";
    }

    /* renamed from: J6.b$b, reason: collision with other inner class name */
    public static final class C0047b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2636a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f2637b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f2638c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2639d;

        public C0047b(boolean z8) {
            this.f2636a = z8;
        }

        public b build() {
            return new b(this);
        }

        public C0047b cipherSuites(J6.a... aVarArr) {
            if (!this.f2636a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i8 = 0; i8 < aVarArr.length; i8++) {
                strArr[i8] = aVarArr[i8].f2630a;
            }
            this.f2637b = strArr;
            return this;
        }

        public C0047b supportsTlsExtensions(boolean z8) {
            if (!this.f2636a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f2639d = z8;
            return this;
        }

        public C0047b tlsVersions(k... kVarArr) {
            if (!this.f2636a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i8 = 0; i8 < kVarArr.length; i8++) {
                strArr[i8] = kVarArr[i8].f2677a;
            }
            this.f2638c = strArr;
            return this;
        }

        public C0047b(b bVar) {
            this.f2636a = bVar.f2632a;
            this.f2637b = bVar.f2633b;
            this.f2638c = bVar.f2634c;
            this.f2639d = bVar.f2635d;
        }

        public C0047b cipherSuites(String... strArr) {
            if (!this.f2636a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f2637b = null;
            } else {
                this.f2637b = (String[]) strArr.clone();
            }
            return this;
        }

        public C0047b tlsVersions(String... strArr) {
            if (!this.f2636a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f2638c = null;
            } else {
                this.f2638c = (String[]) strArr.clone();
            }
            return this;
        }
    }

    private b(C0047b c0047b) {
        this.f2632a = c0047b.f2636a;
        this.f2633b = c0047b.f2637b;
        this.f2634c = c0047b.f2638c;
        this.f2635d = c0047b.f2639d;
    }
}
