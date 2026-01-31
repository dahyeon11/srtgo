package io.grpc;

import io.grpc.AbstractC5787j0;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: io.grpc.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC5714a0 {
    public static final C5713a.c ATTR_HEALTH_CHECKING_CONFIG = C5713a.c.create("internal:health-checking-config");

    /* renamed from: a */
    private int f32073a;

    /* renamed from: io.grpc.a0$b */
    public static final class b {

        /* renamed from: a */
        private final List f32074a;

        /* renamed from: b */
        private final C5713a f32075b;

        /* renamed from: c */
        private final Object[][] f32076c;

        /* renamed from: io.grpc.a0$b$a */
        public static final class a {

            /* renamed from: a */
            private List f32077a;

            /* renamed from: b */
            private C5713a f32078b = C5713a.EMPTY;

            /* renamed from: c */
            private Object[][] f32079c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

            a() {
            }

            public a b(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                this.f32079c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public <T> a addOption(C0318b c0318b, T t8) {
                e3.w.checkNotNull(c0318b, "key");
                e3.w.checkNotNull(t8, "value");
                int length = 0;
                while (true) {
                    Object[][] objArr = this.f32079c;
                    if (length >= objArr.length) {
                        length = -1;
                        break;
                    }
                    if (c0318b.equals(objArr[length][0])) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f32079c.length + 1, 2);
                    Object[][] objArr3 = this.f32079c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f32079c = objArr2;
                    length = objArr2.length - 1;
                }
                this.f32079c[length] = new Object[]{c0318b, t8};
                return this;
            }

            public b build() {
                return new b(this.f32077a, this.f32078b, this.f32079c);
            }

            public a setAddresses(C c9) {
                this.f32077a = Collections.singletonList(c9);
                return this;
            }

            public a setAttributes(C5713a c5713a) {
                this.f32078b = (C5713a) e3.w.checkNotNull(c5713a, "attrs");
                return this;
            }

            public a setAddresses(List<C> list) {
                e3.w.checkArgument(!list.isEmpty(), "addrs is empty");
                this.f32077a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }
        }

        /* renamed from: io.grpc.a0$b$b */
        public static final class C0318b {

            /* renamed from: a */
            private final String f32080a;

            /* renamed from: b */
            private final Object f32081b;

            private C0318b(String str, Object obj) {
                this.f32080a = str;
                this.f32081b = obj;
            }

            public static <T> C0318b create(String str) {
                e3.w.checkNotNull(str, "debugString");
                return new C0318b(str, null);
            }

            public static <T> C0318b createWithDefault(String str, T t8) {
                e3.w.checkNotNull(str, "debugString");
                return new C0318b(str, t8);
            }

            public Object getDefault() {
                return this.f32081b;
            }

            public String toString() {
                return this.f32080a;
            }
        }

        /* synthetic */ b(List list, C5713a c5713a, Object[][] objArr, a aVar) {
            this(list, c5713a, objArr);
        }

        public static a newBuilder() {
            return new a();
        }

        public List<C> getAddresses() {
            return this.f32074a;
        }

        public C5713a getAttributes() {
            return this.f32075b;
        }

        public <T> T getOption(C0318b c0318b) {
            e3.w.checkNotNull(c0318b, "key");
            int i8 = 0;
            while (true) {
                Object[][] objArr = this.f32076c;
                if (i8 >= objArr.length) {
                    return (T) c0318b.f32081b;
                }
                if (c0318b.equals(objArr[i8][0])) {
                    return (T) this.f32076c[i8][1];
                }
                i8++;
            }
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f32074a).setAttributes(this.f32075b).b(this.f32076c);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("addrs", this.f32074a).add("attrs", this.f32075b).add("customOptions", Arrays.deepToString(this.f32076c)).toString();
        }

        private b(List list, C5713a c5713a, Object[][] objArr) {
            this.f32074a = (List) e3.w.checkNotNull(list, "addresses are not set");
            this.f32075b = (C5713a) e3.w.checkNotNull(c5713a, "attrs");
            this.f32076c = (Object[][]) e3.w.checkNotNull(objArr, "customOptions");
        }
    }

    /* renamed from: io.grpc.a0$c */
    public static abstract class c {
        public abstract AbstractC5714a0 newLoadBalancer(d dVar);
    }

    /* renamed from: io.grpc.a0$d */
    public static abstract class d {
        public abstract AbstractC5720d0 createOobChannel(C c9, String str);

        public AbstractC5720d0 createOobChannel(List<C> list, String str) {
            throw new UnsupportedOperationException();
        }

        public AbstractC5720d0 createResolvingOobChannel(String str) {
            return createResolvingOobChannelBuilder(str).build();
        }

        @Deprecated
        public AbstractC5722e0 createResolvingOobChannelBuilder(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public h createSubchannel(b bVar) {
            throw new UnsupportedOperationException();
        }

        public abstract String getAuthority();

        public AbstractC5725g getChannelCredentials() {
            return getUnsafeChannelCredentials().withoutBearerTokens();
        }

        public AbstractC5727h getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public AbstractC5787j0.b getNameResolverArgs() {
            throw new UnsupportedOperationException();
        }

        public C5791l0 getNameResolverRegistry() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            throw new UnsupportedOperationException();
        }

        public N0 getSynchronizationContext() {
            throw new UnsupportedOperationException();
        }

        public AbstractC5725g getUnsafeChannelCredentials() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public void ignoreRefreshNameResolutionCheck() {
        }

        public void refreshNameResolution() {
            throw new UnsupportedOperationException();
        }

        public abstract void updateBalancingState(EnumC5802t enumC5802t, i iVar);

        public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, C c9) {
            throw new UnsupportedOperationException();
        }

        public AbstractC5722e0 createResolvingOobChannelBuilder(String str, AbstractC5725g abstractC5725g) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, List<C> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: io.grpc.a0$f */
    public static abstract class f {
        public abstract C5721e getCallOptions();

        public abstract C5728h0 getHeaders();

        public abstract C5730i0 getMethodDescriptor();
    }

    /* renamed from: io.grpc.a0$g */
    public static final class g {

        /* renamed from: a */
        private final List f32087a;

        /* renamed from: b */
        private final C5713a f32088b;

        /* renamed from: c */
        private final Object f32089c;

        /* renamed from: io.grpc.a0$g$a */
        public static final class a {

            /* renamed from: a */
            private List f32090a;

            /* renamed from: b */
            private C5713a f32091b = C5713a.EMPTY;

            /* renamed from: c */
            private Object f32092c;

            a() {
            }

            public g build() {
                return new g(this.f32090a, this.f32091b, this.f32092c);
            }

            public a setAddresses(List<C> list) {
                this.f32090a = list;
                return this;
            }

            public a setAttributes(C5713a c5713a) {
                this.f32091b = c5713a;
                return this;
            }

            public a setLoadBalancingPolicyConfig(Object obj) {
                this.f32092c = obj;
                return this;
            }
        }

        /* synthetic */ g(List list, C5713a c5713a, Object obj, a aVar) {
            this(list, c5713a, obj);
        }

        public static a newBuilder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return e3.r.equal(this.f32087a, gVar.f32087a) && e3.r.equal(this.f32088b, gVar.f32088b) && e3.r.equal(this.f32089c, gVar.f32089c);
        }

        public List<C> getAddresses() {
            return this.f32087a;
        }

        public C5713a getAttributes() {
            return this.f32088b;
        }

        public Object getLoadBalancingPolicyConfig() {
            return this.f32089c;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f32087a, this.f32088b, this.f32089c);
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f32087a).setAttributes(this.f32088b).setLoadBalancingPolicyConfig(this.f32089c);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("addresses", this.f32087a).add("attributes", this.f32088b).add("loadBalancingPolicyConfig", this.f32089c).toString();
        }

        private g(List list, C5713a c5713a, Object obj) {
            this.f32087a = Collections.unmodifiableList(new ArrayList((Collection) e3.w.checkNotNull(list, "addresses")));
            this.f32088b = (C5713a) e3.w.checkNotNull(c5713a, "attributes");
            this.f32089c = obj;
        }
    }

    /* renamed from: io.grpc.a0$h */
    public static abstract class h {
        public AbstractC5723f asChannel() {
            throw new UnsupportedOperationException();
        }

        public final C getAddresses() {
            List<C> allAddresses = getAllAddresses();
            e3.w.checkState(allAddresses.size() == 1, "%s does not have exactly one group", allAddresses);
            return allAddresses.get(0);
        }

        public List<C> getAllAddresses() {
            throw new UnsupportedOperationException();
        }

        public abstract C5713a getAttributes();

        public AbstractC5727h getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public Object getInternalSubchannel() {
            throw new UnsupportedOperationException();
        }

        public abstract void requestConnection();

        public abstract void shutdown();

        public void start(j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void updateAddresses(List<C> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: io.grpc.a0$i */
    public static abstract class i {
        public abstract e pickSubchannel(f fVar);

        @Deprecated
        public void requestConnection() {
        }
    }

    /* renamed from: io.grpc.a0$j */
    public interface j {
        void onSubchannelState(C5803u c5803u);
    }

    public boolean acceptResolvedAddresses(g gVar) {
        if (!gVar.getAddresses().isEmpty() || canHandleEmptyAddressListFromNameResolution()) {
            int i8 = this.f32073a;
            this.f32073a = i8 + 1;
            if (i8 == 0) {
                handleResolvedAddresses(gVar);
            }
            this.f32073a = 0;
            return true;
        }
        handleNameResolutionError(J0.UNAVAILABLE.withDescription("NameResolver returned no usable address. addrs=" + gVar.getAddresses() + ", attrs=" + gVar.getAttributes()));
        return false;
    }

    public boolean canHandleEmptyAddressListFromNameResolution() {
        return false;
    }

    public abstract void handleNameResolutionError(J0 j02);

    public void handleResolvedAddresses(g gVar) {
        int i8 = this.f32073a;
        this.f32073a = i8 + 1;
        if (i8 == 0) {
            acceptResolvedAddresses(gVar);
        }
        this.f32073a = 0;
    }

    @Deprecated
    public void handleSubchannelState(h hVar, C5803u c5803u) {
    }

    public void requestConnection() {
    }

    public abstract void shutdown();

    /* renamed from: io.grpc.a0$e */
    public static final class e {

        /* renamed from: e */
        private static final e f32082e = new e(null, null, J0.OK, false);

        /* renamed from: a */
        private final h f32083a;

        /* renamed from: b */
        private final AbstractC5794n.a f32084b;

        /* renamed from: c */
        private final J0 f32085c;

        /* renamed from: d */
        private final boolean f32086d;

        private e(h hVar, AbstractC5794n.a aVar, J0 j02, boolean z8) {
            this.f32083a = hVar;
            this.f32084b = aVar;
            this.f32085c = (J0) e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            this.f32086d = z8;
        }

        public static e withDrop(J0 j02) {
            e3.w.checkArgument(!j02.isOk(), "drop status shouldn't be OK");
            return new e(null, null, j02, true);
        }

        public static e withError(J0 j02) {
            e3.w.checkArgument(!j02.isOk(), "error status shouldn't be OK");
            return new e(null, null, j02, false);
        }

        public static e withNoResult() {
            return f32082e;
        }

        public static e withSubchannel(h hVar, AbstractC5794n.a aVar) {
            return new e((h) e3.w.checkNotNull(hVar, "subchannel"), aVar, J0.OK, false);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return e3.r.equal(this.f32083a, eVar.f32083a) && e3.r.equal(this.f32085c, eVar.f32085c) && e3.r.equal(this.f32084b, eVar.f32084b) && this.f32086d == eVar.f32086d;
        }

        public J0 getStatus() {
            return this.f32085c;
        }

        public AbstractC5794n.a getStreamTracerFactory() {
            return this.f32084b;
        }

        public h getSubchannel() {
            return this.f32083a;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f32083a, this.f32085c, this.f32084b, Boolean.valueOf(this.f32086d));
        }

        public boolean isDrop() {
            return this.f32086d;
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("subchannel", this.f32083a).add("streamTracerFactory", this.f32084b).add(androidx.core.app.r.CATEGORY_STATUS, this.f32085c).add("drop", this.f32086d).toString();
        }

        public static e withSubchannel(h hVar) {
            return withSubchannel(hVar, null);
        }
    }
}
