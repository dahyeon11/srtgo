package io.grpc;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: io.grpc.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5787j0 {

    /* renamed from: io.grpc.j0$a */
    class a extends e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f33227a;

        a(f fVar) {
            this.f33227a = fVar;
        }

        @Override // io.grpc.AbstractC5787j0.e, io.grpc.AbstractC5787j0.f
        public void onError(J0 j02) {
            this.f33227a.onError(j02);
        }

        @Override // io.grpc.AbstractC5787j0.e
        public void onResult(g gVar) {
            this.f33227a.onAddresses(gVar.getAddresses(), gVar.getAttributes());
        }
    }

    /* renamed from: io.grpc.j0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f33229a;

        /* renamed from: b, reason: collision with root package name */
        private final s0 f33230b;

        /* renamed from: c, reason: collision with root package name */
        private final N0 f33231c;

        /* renamed from: d, reason: collision with root package name */
        private final h f33232d;

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f33233e;

        /* renamed from: f, reason: collision with root package name */
        private final AbstractC5727h f33234f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f33235g;

        /* renamed from: h, reason: collision with root package name */
        private final String f33236h;

        /* renamed from: io.grpc.j0$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Integer f33237a;

            /* renamed from: b, reason: collision with root package name */
            private s0 f33238b;

            /* renamed from: c, reason: collision with root package name */
            private N0 f33239c;

            /* renamed from: d, reason: collision with root package name */
            private h f33240d;

            /* renamed from: e, reason: collision with root package name */
            private ScheduledExecutorService f33241e;

            /* renamed from: f, reason: collision with root package name */
            private AbstractC5727h f33242f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f33243g;

            /* renamed from: h, reason: collision with root package name */
            private String f33244h;

            a() {
            }

            public b build() {
                return new b(this.f33237a, this.f33238b, this.f33239c, this.f33240d, this.f33241e, this.f33242f, this.f33243g, this.f33244h, null);
            }

            public a setChannelLogger(AbstractC5727h abstractC5727h) {
                this.f33242f = (AbstractC5727h) e3.w.checkNotNull(abstractC5727h);
                return this;
            }

            public a setDefaultPort(int i8) {
                this.f33237a = Integer.valueOf(i8);
                return this;
            }

            public a setOffloadExecutor(Executor executor) {
                this.f33243g = executor;
                return this;
            }

            public a setOverrideAuthority(String str) {
                this.f33244h = str;
                return this;
            }

            public a setProxyDetector(s0 s0Var) {
                this.f33238b = (s0) e3.w.checkNotNull(s0Var);
                return this;
            }

            public a setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
                this.f33241e = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService);
                return this;
            }

            public a setServiceConfigParser(h hVar) {
                this.f33240d = (h) e3.w.checkNotNull(hVar);
                return this;
            }

            public a setSynchronizationContext(N0 n02) {
                this.f33239c = (N0) e3.w.checkNotNull(n02);
                return this;
            }
        }

        /* synthetic */ b(Integer num, s0 s0Var, N0 n02, h hVar, ScheduledExecutorService scheduledExecutorService, AbstractC5727h abstractC5727h, Executor executor, String str, a aVar) {
            this(num, s0Var, n02, hVar, scheduledExecutorService, abstractC5727h, executor, str);
        }

        public static a newBuilder() {
            return new a();
        }

        public AbstractC5727h getChannelLogger() {
            AbstractC5727h abstractC5727h = this.f33234f;
            if (abstractC5727h != null) {
                return abstractC5727h;
            }
            throw new IllegalStateException("ChannelLogger is not set in Builder");
        }

        public int getDefaultPort() {
            return this.f33229a;
        }

        public Executor getOffloadExecutor() {
            return this.f33235g;
        }

        public String getOverrideAuthority() {
            return this.f33236h;
        }

        public s0 getProxyDetector() {
            return this.f33230b;
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            ScheduledExecutorService scheduledExecutorService = this.f33233e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public h getServiceConfigParser() {
            return this.f33232d;
        }

        public N0 getSynchronizationContext() {
            return this.f33231c;
        }

        public a toBuilder() {
            a aVar = new a();
            aVar.setDefaultPort(this.f33229a);
            aVar.setProxyDetector(this.f33230b);
            aVar.setSynchronizationContext(this.f33231c);
            aVar.setServiceConfigParser(this.f33232d);
            aVar.setScheduledExecutorService(this.f33233e);
            aVar.setChannelLogger(this.f33234f);
            aVar.setOffloadExecutor(this.f33235g);
            aVar.setOverrideAuthority(this.f33236h);
            return aVar;
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("defaultPort", this.f33229a).add("proxyDetector", this.f33230b).add("syncContext", this.f33231c).add("serviceConfigParser", this.f33232d).add("scheduledExecutorService", this.f33233e).add("channelLogger", this.f33234f).add("executor", this.f33235g).add("overrideAuthority", this.f33236h).toString();
        }

        private b(Integer num, s0 s0Var, N0 n02, h hVar, ScheduledExecutorService scheduledExecutorService, AbstractC5727h abstractC5727h, Executor executor, String str) {
            this.f33229a = ((Integer) e3.w.checkNotNull(num, "defaultPort not set")).intValue();
            this.f33230b = (s0) e3.w.checkNotNull(s0Var, "proxyDetector not set");
            this.f33231c = (N0) e3.w.checkNotNull(n02, "syncContext not set");
            this.f33232d = (h) e3.w.checkNotNull(hVar, "serviceConfigParser not set");
            this.f33233e = scheduledExecutorService;
            this.f33234f = abstractC5727h;
            this.f33235g = executor;
            this.f33236h = str;
        }
    }

    /* renamed from: io.grpc.j0$d */
    public static abstract class d {
        public abstract String getDefaultScheme();

        public abstract AbstractC5787j0 newNameResolver(URI uri, b bVar);
    }

    /* renamed from: io.grpc.j0$e */
    public static abstract class e implements f {
        @Override // io.grpc.AbstractC5787j0.f
        @Deprecated
        public final void onAddresses(List<C> list, C5713a c5713a) {
            onResult(g.newBuilder().setAddresses(list).setAttributes(c5713a).build());
        }

        @Override // io.grpc.AbstractC5787j0.f
        public abstract void onError(J0 j02);

        public abstract void onResult(g gVar);
    }

    /* renamed from: io.grpc.j0$f */
    public interface f {
        void onAddresses(List<C> list, C5713a c5713a);

        void onError(J0 j02);
    }

    /* renamed from: io.grpc.j0$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final List f33247a;

        /* renamed from: b, reason: collision with root package name */
        private final C5713a f33248b;

        /* renamed from: c, reason: collision with root package name */
        private final c f33249c;

        /* renamed from: io.grpc.j0$g$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private List f33250a = Collections.emptyList();

            /* renamed from: b, reason: collision with root package name */
            private C5713a f33251b = C5713a.EMPTY;

            /* renamed from: c, reason: collision with root package name */
            private c f33252c;

            a() {
            }

            public g build() {
                return new g(this.f33250a, this.f33251b, this.f33252c);
            }

            public a setAddresses(List<C> list) {
                this.f33250a = list;
                return this;
            }

            public a setAttributes(C5713a c5713a) {
                this.f33251b = c5713a;
                return this;
            }

            public a setServiceConfig(c cVar) {
                this.f33252c = cVar;
                return this;
            }
        }

        g(List list, C5713a c5713a, c cVar) {
            this.f33247a = Collections.unmodifiableList(new ArrayList(list));
            this.f33248b = (C5713a) e3.w.checkNotNull(c5713a, "attributes");
            this.f33249c = cVar;
        }

        public static a newBuilder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return e3.r.equal(this.f33247a, gVar.f33247a) && e3.r.equal(this.f33248b, gVar.f33248b) && e3.r.equal(this.f33249c, gVar.f33249c);
        }

        public List<C> getAddresses() {
            return this.f33247a;
        }

        public C5713a getAttributes() {
            return this.f33248b;
        }

        public c getServiceConfig() {
            return this.f33249c;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f33247a, this.f33248b, this.f33249c);
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f33247a).setAttributes(this.f33248b).setServiceConfig(this.f33249c);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("addresses", this.f33247a).add("attributes", this.f33248b).add("serviceConfig", this.f33249c).toString();
        }
    }

    /* renamed from: io.grpc.j0$h */
    public static abstract class h {
        public abstract c parseServiceConfig(Map<String, ?> map);
    }

    public abstract String getServiceAuthority();

    public void refresh() {
    }

    public abstract void shutdown();

    public void start(f fVar) {
        if (fVar instanceof e) {
            start((e) fVar);
        } else {
            start((e) new a(fVar));
        }
    }

    /* renamed from: io.grpc.j0$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final J0 f33245a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f33246b;

        private c(Object obj) {
            this.f33246b = e3.w.checkNotNull(obj, "config");
            this.f33245a = null;
        }

        public static c fromConfig(Object obj) {
            return new c(obj);
        }

        public static c fromError(J0 j02) {
            return new c(j02);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return e3.r.equal(this.f33245a, cVar.f33245a) && e3.r.equal(this.f33246b, cVar.f33246b);
        }

        public Object getConfig() {
            return this.f33246b;
        }

        public J0 getError() {
            return this.f33245a;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f33245a, this.f33246b);
        }

        public String toString() {
            return this.f33246b != null ? e3.p.toStringHelper(this).add("config", this.f33246b).toString() : e3.p.toStringHelper(this).add("error", this.f33245a).toString();
        }

        private c(J0 j02) {
            this.f33246b = null;
            this.f33245a = (J0) e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            e3.w.checkArgument(!j02.isOk(), "cannot use OK status: %s", j02);
        }
    }

    public void start(e eVar) {
        start((f) eVar);
    }
}
