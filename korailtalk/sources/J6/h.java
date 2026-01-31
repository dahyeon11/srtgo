package J6;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final Provider f2655a;
    public static final Logger logger = Logger.getLogger(h.class.getName());

    /* renamed from: b */
    private static final String[] f2653b = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: c */
    private static final h f2654c = a();

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    class b implements PrivilegedExceptionAction {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    class c implements PrivilegedExceptionAction {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    private static class d extends h {

        /* renamed from: d */
        private final J6.g f2656d;

        /* renamed from: e */
        private final J6.g f2657e;

        /* renamed from: f */
        private final Method f2658f;

        /* renamed from: g */
        private final Method f2659g;

        /* renamed from: h */
        private final J6.g f2660h;

        /* renamed from: i */
        private final J6.g f2661i;

        /* renamed from: j */
        private final EnumC0048h f2662j;

        public d(J6.g gVar, J6.g gVar2, Method method, Method method2, J6.g gVar3, J6.g gVar4, Provider provider, EnumC0048h enumC0048h) {
            super(provider);
            this.f2656d = gVar;
            this.f2657e = gVar2;
            this.f2658f = method;
            this.f2659g = method2;
            this.f2660h = gVar3;
            this.f2661i = gVar4;
            this.f2662j = enumC0048h;
        }

        @Override // J6.h
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f2656d.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.f2657e.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            if (this.f2661i.isSupported(sSLSocket)) {
                this.f2661i.invokeWithoutCheckedException(sSLSocket, h.concatLengthPrefixed(list));
            }
        }

        @Override // J6.h
        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i8) throws IOException {
            try {
                socket.connect(inetSocketAddress, i8);
            } catch (SecurityException e8) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e8);
                throw iOException;
            }
        }

        @Override // J6.h
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f2660h.isSupported(sSLSocket) && (bArr = (byte[]) this.f2660h.invokeWithoutCheckedException(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.UTF_8);
            }
            return null;
        }

        @Override // J6.h
        public EnumC0048h getTlsExtensionType() {
            return this.f2662j;
        }

        @Override // J6.h
        public void tagSocket(Socket socket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f2658f;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9.getCause());
            }
        }

        @Override // J6.h
        public void untagSocket(Socket socket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f2659g;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9.getCause());
            }
        }
    }

    private static class e extends h {

        /* renamed from: d */
        private final Method f2663d;

        /* renamed from: e */
        private final Method f2664e;

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // J6.h
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<i> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i iVar : list) {
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f2663d.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }

        @Override // J6.h
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                return (String) this.f2664e.invoke(sSLSocket, null);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }

        @Override // J6.h
        public EnumC0048h getTlsExtensionType() {
            return EnumC0048h.ALPN_AND_NPN;
        }

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f2663d = method;
            this.f2664e = method2;
        }
    }

    private static class f extends h {

        /* renamed from: d */
        private final Method f2665d;

        /* renamed from: e */
        private final Method f2666e;

        /* renamed from: f */
        private final Method f2667f;

        /* renamed from: g */
        private final Class f2668g;

        /* renamed from: h */
        private final Class f2669h;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f2665d = method;
            this.f2666e = method2;
            this.f2667f = method3;
            this.f2668g = cls;
            this.f2669h = cls2;
        }

        @Override // J6.h
        public void afterHandshake(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                this.f2667f.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e8) {
                h.logger.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e8);
            }
        }

        @Override // J6.h
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<i> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = list.get(i8);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f2665d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f2668g, this.f2669h}, new g(arrayList)));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }

        @Override // J6.h
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f2666e.invoke(null, sSLSocket));
                if (!gVar.f2671b && gVar.f2672c == null) {
                    h.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f2671b) {
                    return null;
                }
                return gVar.f2672c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // J6.h
        public EnumC0048h getTlsExtensionType() {
            return EnumC0048h.ALPN_AND_NPN;
        }
    }

    private static class g implements InvocationHandler {

        /* renamed from: a */
        private final List f2670a;

        /* renamed from: b */
        private boolean f2671b;

        /* renamed from: c */
        private String f2672c;

        public g(List<String> list) {
            this.f2670a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f2671b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f2670a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.f2670a.contains(list.get(i8))) {
                            String str = (String) list.get(i8);
                            this.f2672c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f2670a.get(0);
                    this.f2672c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f2672c = (String) objArr[0];
            return null;
        }
    }

    /* renamed from: J6.h$h */
    public enum EnumC0048h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f2655a = provider;
    }

    private static h a() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        Provider providerB = b();
        if (providerB != null) {
            J6.g gVar = new J6.g(null, "setUseSessionTickets", Boolean.TYPE);
            J6.g gVar2 = new J6.g(null, "setHostname", String.class);
            J6.g gVar3 = new J6.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            J6.g gVar4 = new J6.g(null, "setAlpnProtocols", byte[].class);
            try {
                cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = null;
            }
            try {
                method3 = cls.getMethod("untagSocket", Socket.class);
                method2 = method;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = method;
                method3 = null;
                EnumC0048h enumC0048h = (!providerB.getName().equals("GmsCore_OpenSSL") || providerB.getName().equals("Conscrypt") || providerB.getName().equals("Ssl_Guard") || d()) ? EnumC0048h.ALPN_AND_NPN : c() ? EnumC0048h.NPN : EnumC0048h.NONE;
                return new d(gVar, gVar2, method2, method3, gVar3, gVar4, providerB, enumC0048h);
            }
            EnumC0048h enumC0048h2 = (!providerB.getName().equals("GmsCore_OpenSSL") || providerB.getName().equals("Conscrypt") || providerB.getName().equals("Ssl_Guard") || d()) ? EnumC0048h.ALPN_AND_NPN : c() ? EnumC0048h.NPN : EnumC0048h.NONE;
            return new d(gVar, gVar2, method2, method3, gVar3, gVar4, providerB, enumC0048h2);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), null);
                    return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new h(provider);
                }
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused4) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
            }
        } catch (NoSuchAlgorithmException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Provider b() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f2653b) {
                if (str.equals(provider.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        logger.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean c() throws ClassNotFoundException {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Can't find class", (Throwable) e8);
            return false;
        }
    }

    public static byte[] concatLengthPrefixed(List<i> list) {
        P7.c cVar = new P7.c();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = list.get(i8);
            if (iVar != i.HTTP_1_0) {
                cVar.writeByte(iVar.toString().length());
                cVar.writeUtf8(iVar.toString());
            }
        }
        return cVar.readByteArray();
    }

    private static boolean d() throws ClassNotFoundException {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Can't find class", (Throwable) e8);
            return false;
        }
    }

    public static h get() {
        return f2654c;
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i8) throws IOException {
        socket.connect(inetSocketAddress, i8);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public Provider getProvider() {
        return this.f2655a;
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC0048h getTlsExtensionType() {
        return EnumC0048h.NONE;
    }

    public void logW(String str) {
        System.out.println(str);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void tagSocket(Socket socket) {
    }

    public void untagSocket(Socket socket) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<i> list) {
    }
}
