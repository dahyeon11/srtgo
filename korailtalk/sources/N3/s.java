package n3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import r3.C6173a;

/* loaded from: classes2.dex */
class s implements r3.d, r3.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34244a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f34245b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f34246c;

    s(Executor executor) {
        this.f34246c = executor;
    }

    private synchronized Set b(C6173a c6173a) {
        Map map;
        try {
            map = (Map) this.f34244a.get(c6173a.getType());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    void a() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f34245b;
                if (queue != null) {
                    this.f34245b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                publish((C6173a) it.next());
            }
        }
    }

    @Override // r3.c
    public void publish(C6173a c6173a) {
        v.checkNotNull(c6173a);
        synchronized (this) {
            try {
                Queue queue = this.f34245b;
                if (queue != null) {
                    queue.add(c6173a);
                    return;
                }
                for (Map.Entry entry : b(c6173a)) {
                    ((Executor) entry.getValue()).execute(r.lambdaFactory$(entry, c6173a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r3.d
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, r3.b bVar) {
        try {
            v.checkNotNull(cls);
            v.checkNotNull(bVar);
            v.checkNotNull(executor);
            if (!this.f34244a.containsKey(cls)) {
                this.f34244a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f34244a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r3.d
    public synchronized <T> void unsubscribe(Class<T> cls, r3.b bVar) {
        v.checkNotNull(cls);
        v.checkNotNull(bVar);
        if (this.f34244a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f34244a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f34244a.remove(cls);
            }
        }
    }

    @Override // r3.d
    public <T> void subscribe(Class<T> cls, r3.b bVar) {
        subscribe(cls, this.f34246c, bVar);
    }
}
