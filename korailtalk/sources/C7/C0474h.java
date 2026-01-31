package C7;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: C7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0474h {
    public static final C0474h DEFAULT = new a().build();

    /* renamed from: a, reason: collision with root package name */
    private final Set f660a;

    /* renamed from: b, reason: collision with root package name */
    private final M7.c f661b;

    /* renamed from: C7.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f662a = new ArrayList();

        public a add(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f662a.add(new b(str, str2));
            }
            return this;
        }

        public C0474h build() {
            return new C0474h(new LinkedHashSet(this.f662a), null);
        }
    }

    /* renamed from: C7.h$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f663a;

        /* renamed from: b, reason: collision with root package name */
        final String f664b;

        /* renamed from: c, reason: collision with root package name */
        final String f665c;

        /* renamed from: d, reason: collision with root package name */
        final P7.f f666d;

        b(String str, String str2) {
            String strHost;
            this.f663a = str;
            if (str.startsWith("*.")) {
                strHost = A.get("http://" + str.substring(2)).host();
            } else {
                strHost = A.get("http://" + str).host();
            }
            this.f664b = strHost;
            if (str2.startsWith("sha1/")) {
                this.f665c = "sha1/";
                this.f666d = P7.f.decodeBase64(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
                this.f665c = "sha256/";
                this.f666d = P7.f.decodeBase64(str2.substring(7));
            }
            if (this.f666d != null) {
                return;
            }
            throw new IllegalArgumentException("pins must be base64: " + str2);
        }

        boolean a(String str) {
            if (!this.f663a.startsWith("*.")) {
                return str.equals(this.f664b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 == this.f664b.length()) {
                String str2 = this.f664b;
                if (str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f663a.equals(bVar.f663a) && this.f665c.equals(bVar.f665c) && this.f666d.equals(bVar.f666d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f663a.hashCode()) * 31) + this.f665c.hashCode()) * 31) + this.f666d.hashCode();
        }

        public String toString() {
            return this.f665c + this.f666d.base64();
        }
    }

    C0474h(Set set, M7.c cVar) {
        this.f660a = set;
        this.f661b = cVar;
    }

    static P7.f b(X509Certificate x509Certificate) {
        return P7.f.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    static P7.f c(X509Certificate x509Certificate) {
        return P7.f.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    public static String pin(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + c((X509Certificate) certificate).base64();
    }

    List a(String str) {
        List listEmptyList = Collections.emptyList();
        for (b bVar : this.f660a) {
            if (bVar.a(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(bVar);
            }
        }
        return listEmptyList;
    }

    public void check(String str, List<Certificate> list) {
        List listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        M7.c cVar = this.f661b;
        if (cVar != null) {
            list = cVar.clean(list, str);
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i8);
            int size2 = listA.size();
            P7.f fVarC = null;
            P7.f fVarB = null;
            for (int i9 = 0; i9 < size2; i9++) {
                b bVar = (b) listA.get(i9);
                if (bVar.f665c.equals("sha256/")) {
                    if (fVarC == null) {
                        fVarC = c(x509Certificate);
                    }
                    if (bVar.f666d.equals(fVarC)) {
                        return;
                    }
                } else {
                    if (!bVar.f665c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f665c);
                    }
                    if (fVarB == null) {
                        fVarB = b(x509Certificate);
                    }
                    if (bVar.f666d.equals(fVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i10);
            sb.append("\n    ");
            sb.append(pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listA.size();
        for (int i11 = 0; i11 < size4; i11++) {
            b bVar2 = (b) listA.get(i11);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    C0474h d(M7.c cVar) {
        return Objects.equals(this.f661b, cVar) ? this : new C0474h(this.f660a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0474h) {
            C0474h c0474h = (C0474h) obj;
            if (Objects.equals(this.f661b, c0474h.f661b) && this.f660a.equals(c0474h.f660a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Objects.hashCode(this.f661b) * 31) + this.f660a.hashCode();
    }

    public void check(String str, Certificate... certificateArr) {
        check(str, Arrays.asList(certificateArr));
    }
}
