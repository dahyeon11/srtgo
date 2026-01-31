package z;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f37784a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f37785b = new HashMap();

    public static void addConfig(Object obj, InterfaceC6603u interfaceC6603u) {
        synchronized (f37784a) {
            f37785b.put(obj, interfaceC6603u);
        }
    }

    public static InterfaceC6603u getConfigProvider(Object obj) {
        InterfaceC6603u interfaceC6603u;
        synchronized (f37784a) {
            interfaceC6603u = (InterfaceC6603u) f37785b.get(obj);
        }
        return interfaceC6603u == null ? InterfaceC6603u.EMPTY : interfaceC6603u;
    }
}
