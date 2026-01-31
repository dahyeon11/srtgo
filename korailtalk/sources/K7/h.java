package K7;

import C7.F;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
class h extends j {

    /* renamed from: c */
    private final Method f2985c;

    /* renamed from: d */
    private final Method f2986d;

    /* renamed from: e */
    private final Method f2987e;

    /* renamed from: f */
    private final Class f2988f;

    /* renamed from: g */
    private final Class f2989g;

    private static class a implements InvocationHandler {

        /* renamed from: a */
        private final List f2990a;

        /* renamed from: b */
        boolean f2991b;

        /* renamed from: c */
        String f2992c;

        a(List list) {
            this.f2990a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = D7.e.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f2991b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f2990a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String str = (String) list.get(i8);
                        if (this.f2990a.contains(str)) {
                            this.f2992c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f2990a.get(0);
                    this.f2992c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f2992c = (String) objArr[0];
            return null;
        }
    }

    h(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f2985c = method;
        this.f2986d = method2;
        this.f2987e = method3;
        this.f2988f = cls;
        this.f2989g = cls2;
    }

    public static j buildIfSupported() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            return new h(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // K7.j
    public void afterHandshake(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2987e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // K7.j
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2985c.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f2988f, this.f2989g}, new a(j.alpnProtocolNames(list))));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // K7.j
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f2986d.invoke(null, sSLSocket));
            boolean z8 = aVar.f2991b;
            if (!z8 && aVar.f2992c == null) {
                j.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z8) {
                return null;
            }
            return aVar.f2992c;
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
