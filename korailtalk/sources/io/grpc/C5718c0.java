package io.grpc;

import io.grpc.I0;
import io.grpc.internal.C5779v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5718c0 {

    /* renamed from: d, reason: collision with root package name */
    private static C5718c0 f32095d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f32097a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f32098b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f32094c = Logger.getLogger(C5718c0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final Iterable f32096e = b();

    /* renamed from: io.grpc.c0$a */
    private static final class a implements I0.b {
        a() {
        }

        @Override // io.grpc.I0.b
        public int getPriority(AbstractC5716b0 abstractC5716b0) {
            return abstractC5716b0.getPriority();
        }

        @Override // io.grpc.I0.b
        public boolean isAvailable(AbstractC5716b0 abstractC5716b0) {
            return abstractC5716b0.isAvailable();
        }
    }

    private synchronized void a(AbstractC5716b0 abstractC5716b0) {
        e3.w.checkArgument(abstractC5716b0.isAvailable(), "isAvailable() returned false");
        this.f32097a.add(abstractC5716b0);
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        try {
            int i8 = C5779v0.f33196c;
            arrayList.add(C5779v0.class);
        } catch (ClassNotFoundException e8) {
            f32094c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e8);
        }
        try {
            int i9 = O6.i.f3547b;
            arrayList.add(O6.i.class);
        } catch (ClassNotFoundException e9) {
            f32094c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e9);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void c() {
        try {
            this.f32098b.clear();
            Iterator it = this.f32097a.iterator();
            while (it.hasNext()) {
                AbstractC5716b0 abstractC5716b0 = (AbstractC5716b0) it.next();
                String policyName = abstractC5716b0.getPolicyName();
                AbstractC5716b0 abstractC5716b02 = (AbstractC5716b0) this.f32098b.get(policyName);
                if (abstractC5716b02 == null || abstractC5716b02.getPriority() < abstractC5716b0.getPriority()) {
                    this.f32098b.put(policyName, abstractC5716b0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized C5718c0 getDefaultRegistry() {
        try {
            if (f32095d == null) {
                List<AbstractC5716b0> listLoadAll = I0.loadAll(AbstractC5716b0.class, f32096e, AbstractC5716b0.class.getClassLoader(), new a());
                f32095d = new C5718c0();
                for (AbstractC5716b0 abstractC5716b0 : listLoadAll) {
                    f32094c.fine("Service loader found " + abstractC5716b0);
                    f32095d.a(abstractC5716b0);
                }
                f32095d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32095d;
    }

    public synchronized void deregister(AbstractC5716b0 abstractC5716b0) {
        this.f32097a.remove(abstractC5716b0);
        c();
    }

    public synchronized AbstractC5716b0 getProvider(String str) {
        return (AbstractC5716b0) this.f32098b.get(e3.w.checkNotNull(str, "policy"));
    }

    public synchronized void register(AbstractC5716b0 abstractC5716b0) {
        a(abstractC5716b0);
        c();
    }
}
