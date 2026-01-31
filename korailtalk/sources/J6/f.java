package J6;

import Q7.C;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class f implements HostnameVerifier {
    public static final f INSTANCE = new f();

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2649a = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private f() {
    }

    private static List a(X509Certificate x509Certificate, int i8) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i8 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) throws CertificateParsingException {
        List listA = a(x509Certificate, 7);
        List listA2 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listA.size() + listA2.size());
        arrayList.addAll(listA);
        arrayList.addAll(listA2);
        return arrayList;
    }

    static boolean b(String str) {
        return f2649a.matcher(str).matches();
    }

    private boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + C.PACKAGE_SEPARATOR_CHAR;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + C.PACKAGE_SEPARATOR_CHAR;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    private boolean d(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strFindMostSpecific;
        String lowerCase = str.toLowerCase(Locale.US);
        List listA = a(x509Certificate, 2);
        int size = listA.size();
        int i8 = 0;
        boolean z8 = false;
        while (i8 < size) {
            if (c(lowerCase, (String) listA.get(i8))) {
                return true;
            }
            i8++;
            z8 = true;
        }
        if (z8 || (strFindMostSpecific = new d(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn")) == null) {
            return false;
        }
        return c(lowerCase, strFindMostSpecific);
    }

    private boolean e(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        List listA = a(x509Certificate, 7);
        int size = listA.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equalsIgnoreCase((String) listA.get(i8))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
        if (b(str)) {
            return e(str, x509Certificate);
        }
        return d(str, x509Certificate);
    }
}
