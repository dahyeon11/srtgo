package K7;

import C7.E;
import C7.F;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class j {
    public static final int INFO = 4;
    public static final int WARN = 5;

    /* renamed from: a, reason: collision with root package name */
    private static final j f2995a = d();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2996b = Logger.getLogger(E.class.getName());

    static byte[] a(List list) {
        P7.c cVar = new P7.c();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            F f8 = (F) list.get(i8);
            if (f8 != F.HTTP_1_0) {
                cVar.writeByte(f8.toString().length());
                cVar.writeUtf8(f8.toString());
            }
        }
        return cVar.readByteArray();
    }

    public static List<String> alpnProtocolNames(List<F> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            F f8 = list.get(i8);
            if (f8 != F.HTTP_1_0) {
                arrayList.add(f8.toString());
            }
        }
        return arrayList;
    }

    private static j b() throws ClassNotFoundException {
        j jVarBuildIfSupported = e.buildIfSupported();
        if (jVarBuildIfSupported != null) {
            return jVarBuildIfSupported;
        }
        j jVarBuildIfSupported2 = f.buildIfSupported();
        if (jVarBuildIfSupported2 != null) {
            return jVarBuildIfSupported2;
        }
        throw new NullPointerException("No platform found on Android");
    }

    private static j c() {
        g gVarBuildIfSupported;
        if (isConscryptPreferred() && (gVarBuildIfSupported = g.buildIfSupported()) != null) {
            return gVarBuildIfSupported;
        }
        i iVarBuildIfSupported = i.buildIfSupported();
        if (iVarBuildIfSupported != null) {
            return iVarBuildIfSupported;
        }
        j jVarBuildIfSupported = h.buildIfSupported();
        return jVarBuildIfSupported != null ? jVarBuildIfSupported : new j();
    }

    private static j d() {
        return isAndroid() ? b() : c();
    }

    static Object e(Object obj, Class cls, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objE;
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (objE = e(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return e(objE, cls, str);
    }

    public static j get() {
        return f2995a;
    }

    public static boolean isAndroid() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean isConscryptPreferred() {
        if ("conscrypt".equals(D7.e.getSystemProperty("okhttp.platform", null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public M7.c buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        return new M7.a(buildTrustRootIndex(x509TrustManager));
    }

    public M7.e buildTrustRootIndex(X509TrustManager x509TrustManager) {
        return new M7.b(x509TrustManager.getAcceptedIssuers());
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i8) throws IOException {
        socket.connect(inetSocketAddress, i8);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public SSLContext getSSLContext() throws NoSuchAlgorithmException {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        if (f2996b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        return true;
    }

    public void log(int i8, String str, Throwable th) {
        f2996b.log(i8 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    protected X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Object objE = e(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objE == null) {
                return null;
            }
            return (X509TrustManager) e(objE, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public M7.c buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        X509TrustManager x509TrustManagerTrustManager = trustManager(sSLSocketFactory);
        if (x509TrustManagerTrustManager != null) {
            return buildCertificateChainCleaner(x509TrustManagerTrustManager);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) {
    }
}
