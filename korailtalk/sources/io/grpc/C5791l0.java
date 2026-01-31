package io.grpc;

import f3.AbstractC5469j0;
import io.grpc.AbstractC5787j0;
import io.grpc.I0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.l0 */
/* loaded from: classes.dex */
public final class C5791l0 {

    /* renamed from: e */
    private static final Logger f33253e = Logger.getLogger(C5791l0.class.getName());

    /* renamed from: f */
    private static C5791l0 f33254f;

    /* renamed from: a */
    private final AbstractC5787j0.d f33255a = new b();

    /* renamed from: b */
    private String f33256b = "unknown";

    /* renamed from: c */
    private final LinkedHashSet f33257c = new LinkedHashSet();

    /* renamed from: d */
    private AbstractC5469j0 f33258d = AbstractC5469j0.of();

    /* renamed from: io.grpc.l0$b */
    private final class b extends AbstractC5787j0.d {
        private b() {
        }

        @Override // io.grpc.AbstractC5787j0.d
        public String getDefaultScheme() {
            String str;
            synchronized (C5791l0.this) {
                str = C5791l0.this.f33256b;
            }
            return str;
        }

        @Override // io.grpc.AbstractC5787j0.d
        public AbstractC5787j0 newNameResolver(URI uri, AbstractC5787j0.b bVar) {
            AbstractC5789k0 abstractC5789k0;
            String scheme = uri.getScheme();
            if (scheme == null || (abstractC5789k0 = (AbstractC5789k0) C5791l0.this.d().get(scheme.toLowerCase(Locale.US))) == null) {
                return null;
            }
            return abstractC5789k0.newNameResolver(uri, bVar);
        }

        /* synthetic */ b(C5791l0 c5791l0, a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.l0$c */
    private static final class c implements I0.b {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // io.grpc.I0.b
        public int getPriority(AbstractC5789k0 abstractC5789k0) {
            return abstractC5789k0.priority();
        }

        @Override // io.grpc.I0.b
        public boolean isAvailable(AbstractC5789k0 abstractC5789k0) {
            return abstractC5789k0.c();
        }
    }

    private synchronized void b(AbstractC5789k0 abstractC5789k0) {
        e3.w.checkArgument(abstractC5789k0.c(), "isAvailable() returned false");
        this.f33257c.add(abstractC5789k0);
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            int i8 = io.grpc.internal.F.f32455b;
            arrayList.add(io.grpc.internal.F.class);
        } catch (ClassNotFoundException e8) {
            f33253e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e8);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void e() {
        try {
            HashMap map = new HashMap();
            String strB = "unknown";
            Iterator it = this.f33257c.iterator();
            int iPriority = Integer.MIN_VALUE;
            while (it.hasNext()) {
                AbstractC5789k0 abstractC5789k0 = (AbstractC5789k0) it.next();
                String strB2 = abstractC5789k0.b();
                AbstractC5789k0 abstractC5789k02 = (AbstractC5789k0) map.get(strB2);
                if (abstractC5789k02 == null || abstractC5789k02.priority() < abstractC5789k0.priority()) {
                    map.put(strB2, abstractC5789k0);
                }
                if (iPriority < abstractC5789k0.priority()) {
                    iPriority = abstractC5789k0.priority();
                    strB = abstractC5789k0.b();
                }
            }
            this.f33258d = AbstractC5469j0.copyOf((Map) map);
            this.f33256b = strB;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized C5791l0 getDefaultRegistry() {
        try {
            if (f33254f == null) {
                List<AbstractC5789k0> listLoadAll = I0.loadAll(AbstractC5789k0.class, c(), AbstractC5789k0.class.getClassLoader(), new c());
                if (listLoadAll.isEmpty()) {
                    f33253e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f33254f = new C5791l0();
                for (AbstractC5789k0 abstractC5789k0 : listLoadAll) {
                    f33253e.fine("Service loader found " + abstractC5789k0);
                    f33254f.b(abstractC5789k0);
                }
                f33254f.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33254f;
    }

    public AbstractC5787j0.d asFactory() {
        return this.f33255a;
    }

    synchronized Map d() {
        return this.f33258d;
    }

    public synchronized void deregister(AbstractC5789k0 abstractC5789k0) {
        this.f33257c.remove(abstractC5789k0);
        e();
    }

    public synchronized void register(AbstractC5789k0 abstractC5789k0) {
        b(abstractC5789k0);
        e();
    }
}
