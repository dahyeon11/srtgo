package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9974a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9975b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9976c;

    public J() {
        this.f9974a = new HashMap();
        this.f9975b = new LinkedHashSet();
        this.f9976c = false;
    }

    private static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    final void a() {
        this.f9976c = true;
        Map map = this.f9974a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f9974a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f9975b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f9975b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    public void addCloseable(Closeable closeable) {
        Set set = this.f9975b;
        if (set != null) {
            synchronized (set) {
                this.f9975b.add(closeable);
            }
        }
    }

    Object c(String str) {
        Object obj;
        Map map = this.f9974a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f9974a.get(str);
        }
        return obj;
    }

    protected void d() {
    }

    Object e(String str, Object obj) throws IOException {
        Object obj2;
        synchronized (this.f9974a) {
            try {
                obj2 = this.f9974a.get(str);
                if (obj2 == null) {
                    this.f9974a.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f9976c) {
            b(obj);
        }
        return obj;
    }

    public J(Closeable... closeableArr) {
        this.f9974a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f9975b = linkedHashSet;
        this.f9976c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}
