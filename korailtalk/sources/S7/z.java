package s7;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import n7.F0;

/* loaded from: classes3.dex */
public final class z {
    public static final z INSTANCE;
    public static final F0 dispatcher;

    static {
        z zVar = new z();
        INSTANCE = zVar;
        L.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = zVar.a();
    }

    private z() {
    }

    private final F0 a() {
        Object next;
        F0 f0TryCreateDispatcher;
        try {
            List list = k7.p.toList(k7.p.asSequence(ServiceLoader.load(y.class, y.class.getClassLoader()).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((y) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((y) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            y yVar = (y) next;
            if (yVar != null && (f0TryCreateDispatcher = AbstractC6234A.tryCreateDispatcher(yVar, list)) != null) {
                return f0TryCreateDispatcher;
            }
            return AbstractC6234A.b(null, null, 3, null);
        } catch (Throwable th) {
            return AbstractC6234A.b(th, null, 2, null);
        }
    }
}
