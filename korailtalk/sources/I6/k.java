package I6;

import J6.h;
import e3.w;
import io.grpc.internal.U;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2325b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final J6.h f2326c = J6.h.get();

    /* renamed from: d, reason: collision with root package name */
    private static k f2327d = d(k.class.getClassLoader());

    /* renamed from: a, reason: collision with root package name */
    protected final J6.h f2328a;

    static final class a extends k {

        /* renamed from: e, reason: collision with root package name */
        private static final J6.g f2329e;

        /* renamed from: f, reason: collision with root package name */
        private static final J6.g f2330f;

        /* renamed from: g, reason: collision with root package name */
        private static final J6.g f2331g;

        /* renamed from: h, reason: collision with root package name */
        private static final J6.g f2332h;

        /* renamed from: i, reason: collision with root package name */
        private static final J6.g f2333i;

        /* renamed from: j, reason: collision with root package name */
        private static final J6.g f2334j;

        /* renamed from: k, reason: collision with root package name */
        private static final Method f2335k;

        /* renamed from: l, reason: collision with root package name */
        private static final Method f2336l;

        /* renamed from: m, reason: collision with root package name */
        private static final Method f2337m;

        /* renamed from: n, reason: collision with root package name */
        private static final Method f2338n;

        /* renamed from: o, reason: collision with root package name */
        private static final Method f2339o;

        /* renamed from: p, reason: collision with root package name */
        private static final Method f2340p;

        /* renamed from: q, reason: collision with root package name */
        private static final Constructor f2341q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f2329e = new J6.g(null, "setUseSessionTickets", cls2);
            f2330f = new J6.g(null, "setHostname", String.class);
            f2331g = new J6.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f2332h = new J6.g(null, "setAlpnProtocols", byte[].class);
            f2333i = new J6.g(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f2334j = new J6.g(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException e8) {
                            e = e8;
                            method4 = null;
                        } catch (NoSuchMethodException e9) {
                            e = e9;
                            method4 = null;
                        }
                        try {
                            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                        } catch (ClassNotFoundException e10) {
                            e = e10;
                            k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f2337m = method;
                            f2338n = method2;
                            f2339o = method3;
                            f2335k = method4;
                            f2336l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            f2340p = method6;
                            f2341q = constructor;
                        } catch (NoSuchMethodException e11) {
                            e = e11;
                            k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f2337m = method;
                            f2338n = method2;
                            f2339o = method3;
                            f2335k = method4;
                            f2336l = method5;
                            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            f2340p = method6;
                            f2341q = constructor;
                        }
                    } catch (ClassNotFoundException e12) {
                        e = e12;
                        method3 = null;
                        method4 = method3;
                        k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f2337m = method;
                        f2338n = method2;
                        f2339o = method3;
                        f2335k = method4;
                        f2336l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f2340p = method6;
                        f2341q = constructor;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        method3 = null;
                        method4 = method3;
                        k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f2337m = method;
                        f2338n = method2;
                        f2339o = method3;
                        f2335k = method4;
                        f2336l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f2340p = method6;
                        f2341q = constructor;
                    }
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2337m = method;
                    f2338n = method2;
                    f2339o = method3;
                    f2335k = method4;
                    f2336l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2340p = method6;
                    f2341q = constructor;
                } catch (NoSuchMethodException e15) {
                    e = e15;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    k.f2325b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2337m = method;
                    f2338n = method2;
                    f2339o = method3;
                    f2335k = method4;
                    f2336l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2340p = method6;
                    f2341q = constructor;
                }
            } catch (ClassNotFoundException e16) {
                e = e16;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e17) {
                e = e17;
                method = null;
                method2 = null;
            }
            f2337m = method;
            f2338n = method2;
            f2339o = method3;
            f2335k = method4;
            f2336l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException e18) {
                e = e18;
                method6 = null;
            } catch (NoSuchMethodException e19) {
                e = e19;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e20) {
                e = e20;
                k.f2325b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f2340p = method6;
                f2341q = constructor;
            } catch (NoSuchMethodException e21) {
                e = e21;
                k.f2325b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                f2340p = method6;
                f2341q = constructor;
            }
            f2340p = method6;
            f2341q = constructor;
        }

        a(J6.h hVar) {
            super(hVar);
        }

        @Override // I6.k
        protected void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Constructor constructor;
            boolean z8;
            Method method;
            String[] strArrF = k.f(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (k.e(str)) {
                            Method method2 = f2335k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f2329e.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                            } else {
                                f2336l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f2340p;
                            if (method3 == null || (constructor = f2341q) == null) {
                                f2330f.invokeOptionalWithoutCheckedException(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (IllegalAccessException e8) {
                        throw new RuntimeException(e8);
                    } catch (InstantiationException e9) {
                        throw new RuntimeException(e9);
                    }
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
            Method method4 = f2339o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    f2337m.invoke(sSLParameters, strArrF);
                    z8 = true;
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e11;
                    }
                    k.f2325b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                }
            } else {
                z8 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z8 && (method = f2338n) != null && Arrays.equals(strArrF, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {J6.h.concatLengthPrefixed(list)};
            if (this.f2328a.getTlsExtensionType() == h.EnumC0048h.ALPN_AND_NPN) {
                f2332h.invokeWithoutCheckedException(sSLSocket, objArr);
            }
            if (this.f2328a.getTlsExtensionType() == h.EnumC0048h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f2334j.invokeWithoutCheckedException(sSLSocket, objArr);
        }

        @Override // I6.k
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            Method method = f2339o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                } catch (InvocationTargetException e9) {
                    if (!(e9.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e9);
                    }
                    k.f2325b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f2328a.getTlsExtensionType() == h.EnumC0048h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f2331g.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, J6.l.UTF_8);
                    }
                } catch (Exception e10) {
                    k.f2325b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e10);
                }
            }
            if (this.f2328a.getTlsExtensionType() != h.EnumC0048h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f2333i.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, J6.l.UTF_8);
                    }
                } catch (Exception e11) {
                    k.f2325b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e11);
                }
            }
            return null;
        }

        @Override // I6.k
        public String negotiate(SSLSocket sSLSocket, String str, List<J6.i> list) {
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            return selectedProtocol == null ? super.negotiate(sSLSocket, str, list) : selectedProtocol;
        }
    }

    k(J6.h hVar) {
        this.f2328a = (J6.h) w.checkNotNull(hVar, "platform");
    }

    static k d(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e8) {
            f2325b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e8);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e9) {
                f2325b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e9);
                return new k(f2326c);
            }
        }
        return new a(f2326c);
    }

    static boolean e(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            U.checkAuthority(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J6.i) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k get() {
        return f2327d;
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.f2328a.configureTlsExtensions(sSLSocket, str, list);
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return this.f2328a.getSelectedProtocol(sSLSocket);
    }

    public String negotiate(SSLSocket sSLSocket, String str, List<J6.i> list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            if (selectedProtocol != null) {
                return selectedProtocol;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f2328a.afterHandshake(sSLSocket);
        }
    }
}
