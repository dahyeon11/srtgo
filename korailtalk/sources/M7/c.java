package M7;

import K7.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public abstract class c {
    public static c get(X509TrustManager x509TrustManager) {
        return j.get().buildCertificateChainCleaner(x509TrustManager);
    }

    public abstract List<Certificate> clean(List<Certificate> list, String str);

    public static c get(X509Certificate... x509CertificateArr) {
        return new a(new b(x509CertificateArr));
    }
}
