package D7;

import C7.C0467a;
import C7.C0479m;
import C7.C0480n;
import C7.E;
import C7.H;
import C7.InterfaceC0472f;
import C7.J;
import C7.z;
import F7.g;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public abstract class a {
    public static a instance;

    public static void initializeInstanceForTests() {
        new E();
    }

    public abstract void addLenient(z.a aVar, String str);

    public abstract void addLenient(z.a aVar, String str, String str2);

    public abstract void apply(C0480n c0480n, SSLSocket sSLSocket, boolean z8);

    public abstract int code(J.a aVar);

    public abstract boolean equalsNonHost(C0467a c0467a, C0467a c0467a2);

    public abstract F7.c exchange(J j8);

    public abstract void initExchange(J.a aVar, F7.c cVar);

    public abstract InterfaceC0472f newWebSocketCall(E e8, H h8);

    public abstract g realConnectionPool(C0479m c0479m);
}
