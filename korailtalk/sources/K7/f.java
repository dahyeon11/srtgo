package K7;

import C7.F;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
class f extends j {

    /* renamed from: c */
    private final Class f2971c;

    /* renamed from: d */
    private final Class f2972d;

    /* renamed from: e */
    private final Method f2973e;

    /* renamed from: f */
    private final Method f2974f;

    /* renamed from: g */
    private final Method f2975g;

    /* renamed from: h */
    private final Method f2976h;

    /* renamed from: i */
    private final b f2977i = b.b();

    static final class a extends M7.c {

        /* renamed from: a */
        private final Object f2978a;

        /* renamed from: b */
        private final Method f2979b;

        a(Object obj, Method method) {
            this.f2978a = obj;
            this.f2979b = method;
        }

        @Override // M7.c
        public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f2979b.invoke(this.f2978a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e9.getMessage());
                sSLPeerUnverifiedException.initCause(e9);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    static final class b {

        /* renamed from: a */
        private final Method f2980a;

        /* renamed from: b */
        private final Method f2981b;

        /* renamed from: c */
        private final Method f2982c;

        b(Method method, Method method2, Method method3) {
            this.f2980a = method;
            this.f2981b = method2;
            this.f2982c = method3;
        }

        static b b() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }

        Object a(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f2980a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, null);
                    this.f2981b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean c(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (obj != null) {
                try {
                    this.f2982c.invoke(obj, null);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    static final class c implements M7.e {

        /* renamed from: a */
        private final X509TrustManager f2983a;

        /* renamed from: b */
        private final Method f2984b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.f2984b = method;
            this.f2983a = x509TrustManager;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2983a.equals(cVar.f2983a) && this.f2984b.equals(cVar.f2984b);
        }

        @Override // M7.e
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f2984b.invoke(this.f2983a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e8) {
                throw new AssertionError("unable to get issues and signature", e8);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f2983a.hashCode() + (this.f2984b.hashCode() * 31);
        }
    }

    f(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.f2971c = cls;
        this.f2972d = cls2;
        this.f2973e = method;
        this.f2974f = method2;
        this.f2975g = method3;
        this.f2976h = method4;
    }

    public static j buildIfSupported() {
        if (!j.isAndroid()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new f(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", null), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    private boolean f(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    private boolean g(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return f(str, cls, obj);
        }
    }

    static int h() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // K7.j
    public M7.c buildCertificateChainCleaner(X509TrustManager x509TrustManager) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    @Override // K7.j
    public M7.e buildTrustRootIndex(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // K7.j
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f2972d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f2973e.invoke(sSLSocket, Boolean.TRUE);
                    this.f2974f.invoke(sSLSocket, str);
                } catch (IllegalAccessException e8) {
                    e = e8;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e9) {
                    e = e9;
                    throw new AssertionError(e);
                }
            }
            this.f2976h.invoke(sSLSocket, j.a(list));
        }
    }

    @Override // K7.j
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i8) throws IOException {
        try {
            socket.connect(inetSocketAddress, i8);
        } catch (AssertionError e8) {
            if (!D7.e.isAndroidGetsocknameError(e8)) {
                throw e8;
            }
            throw new IOException(e8);
        } catch (ClassCastException e9) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e9;
            }
            throw new IOException("Exception in connect", e9);
        }
    }

    @Override // K7.j
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    @Override // K7.j
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        if (!this.f2972d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2975g.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // K7.j
    public Object getStackTraceForCloseable(String str) {
        return this.f2977i.a(str);
    }

    @Override // K7.j
    public boolean isCleartextTrafficPermitted(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return g(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e9) {
            e = e9;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // K7.j
    public void log(int i8, String str, Throwable th) {
        int iMin;
        int i9 = i8 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf(10, i10);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i10 + 4000);
                Log.println(i9, "OkHttp", str.substring(i10, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i10 = iMin;
                }
            }
            i10 = iMin + 1;
        }
    }

    @Override // K7.j
    public void logCloseableLeak(String str, Object obj) {
        if (this.f2977i.c(obj)) {
            return;
        }
        log(5, str, null);
    }

    @Override // K7.j
    protected X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object objE = j.e(sSLSocketFactory, this.f2971c, "sslParameters");
        if (objE == null) {
            try {
                objE = j.e(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) j.e(objE, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) j.e(objE, X509TrustManager.class, "trustManager");
    }
}
