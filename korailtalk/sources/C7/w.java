package C7;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final M f710a;

    /* renamed from: b, reason: collision with root package name */
    private final C0477k f711b;

    /* renamed from: c, reason: collision with root package name */
    private final List f712c;

    /* renamed from: d, reason: collision with root package name */
    private final List f713d;

    private w(M m8, C0477k c0477k, List list, List list2) {
        this.f710a = m8;
        this.f711b = c0477k;
        this.f712c = list;
        this.f713d = list2;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public static w get(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C0477k c0477kForJavaName = C0477k.forJavaName(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        M mForJavaName = M.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listImmutableList = peerCertificates != null ? D7.e.immutableList(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new w(mForJavaName, c0477kForJavaName, listImmutableList, localCertificates != null ? D7.e.immutableList(localCertificates) : Collections.emptyList());
    }

    public C0477k cipherSuite() {
        return this.f711b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f710a.equals(wVar.f710a) && this.f711b.equals(wVar.f711b) && this.f712c.equals(wVar.f712c) && this.f713d.equals(wVar.f713d);
    }

    public int hashCode() {
        return ((((((527 + this.f710a.hashCode()) * 31) + this.f711b.hashCode()) * 31) + this.f712c.hashCode()) * 31) + this.f713d.hashCode();
    }

    public List<Certificate> localCertificates() {
        return this.f713d;
    }

    public Principal localPrincipal() {
        if (this.f713d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f713d.get(0)).getSubjectX500Principal();
    }

    public List<Certificate> peerCertificates() {
        return this.f712c;
    }

    public Principal peerPrincipal() {
        if (this.f712c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f712c.get(0)).getSubjectX500Principal();
    }

    public M tlsVersion() {
        return this.f710a;
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f710a + " cipherSuite=" + this.f711b + " peerCertificates=" + a(this.f712c) + " localCertificates=" + a(this.f713d) + '}';
    }

    public static w get(M m8, C0477k c0477k, List<Certificate> list, List<Certificate> list2) {
        if (m8 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (c0477k != null) {
            return new w(m8, c0477k, D7.e.immutableList(list), D7.e.immutableList(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }
}
