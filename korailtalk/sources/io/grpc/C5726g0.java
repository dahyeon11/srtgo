package io.grpc;

import io.grpc.AbstractC5724f0;
import io.grpc.I0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5726g0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f32123c = Logger.getLogger(C5726g0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static C5726g0 f32124d;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f32125a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private List f32126b = Collections.emptyList();

    /* renamed from: io.grpc.g0$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(AbstractC5724f0 abstractC5724f0, AbstractC5724f0 abstractC5724f02) {
            return abstractC5724f0.priority() - abstractC5724f02.priority();
        }
    }

    /* renamed from: io.grpc.g0$b */
    private static final class b implements I0.b {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // io.grpc.I0.b
        public int getPriority(AbstractC5724f0 abstractC5724f0) {
            return abstractC5724f0.priority();
        }

        @Override // io.grpc.I0.b
        public boolean isAvailable(AbstractC5724f0 abstractC5724f0) {
            return abstractC5724f0.isAvailable();
        }
    }

    /* renamed from: io.grpc.g0$c */
    public static final class c extends RuntimeException {
        public c(String str) {
            super(str);
        }
    }

    private synchronized void a(AbstractC5724f0 abstractC5724f0) {
        e3.w.checkArgument(abstractC5724f0.isAvailable(), "isAvailable() returned false");
        this.f32125a.add(abstractC5724f0);
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(I6.g.class);
        } catch (ClassNotFoundException e8) {
            f32123c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e9) {
            f32123c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e9);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e10) {
            f32123c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        ArrayList arrayList = new ArrayList(this.f32125a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f32126b = Collections.unmodifiableList(arrayList);
    }

    public static synchronized C5726g0 getDefaultRegistry() {
        try {
            if (f32124d == null) {
                List<AbstractC5724f0> listLoadAll = I0.loadAll(AbstractC5724f0.class, b(), AbstractC5724f0.class.getClassLoader(), new b(null));
                f32124d = new C5726g0();
                for (AbstractC5724f0 abstractC5724f0 : listLoadAll) {
                    f32123c.fine("Service loader found " + abstractC5724f0);
                    f32124d.a(abstractC5724f0);
                }
                f32124d.g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f32124d;
    }

    AbstractC5722e0 c(C5791l0 c5791l0, String str, AbstractC5725g abstractC5725g) {
        AbstractC5789k0 abstractC5789k0;
        try {
            abstractC5789k0 = (AbstractC5789k0) c5791l0.d().get(new URI(str).getScheme());
        } catch (URISyntaxException unused) {
            abstractC5789k0 = null;
        }
        if (abstractC5789k0 == null) {
            abstractC5789k0 = (AbstractC5789k0) c5791l0.d().get(c5791l0.asFactory().getDefaultScheme());
        }
        Collection<?> collectionA = abstractC5789k0 != null ? abstractC5789k0.a() : Collections.emptySet();
        if (f().isEmpty()) {
            throw new c("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
        StringBuilder sb = new StringBuilder();
        for (AbstractC5724f0 abstractC5724f0 : f()) {
            if (abstractC5724f0.a().containsAll(collectionA)) {
                AbstractC5724f0.a aVarNewChannelBuilder = abstractC5724f0.newChannelBuilder(str, abstractC5725g);
                if (aVarNewChannelBuilder.getChannelBuilder() != null) {
                    return aVarNewChannelBuilder.getChannelBuilder();
                }
                sb.append("; ");
                sb.append(abstractC5724f0.getClass().getName());
                sb.append(": ");
                sb.append(aVarNewChannelBuilder.getError());
            } else {
                sb.append("; ");
                sb.append(abstractC5724f0.getClass().getName());
                sb.append(": does not support 1 or more of ");
                sb.append(Arrays.toString(collectionA.toArray()));
            }
        }
        throw new c(sb.substring(2));
    }

    AbstractC5722e0 d(String str, AbstractC5725g abstractC5725g) {
        return c(C5791l0.getDefaultRegistry(), str, abstractC5725g);
    }

    public synchronized void deregister(AbstractC5724f0 abstractC5724f0) {
        this.f32125a.remove(abstractC5724f0);
        g();
    }

    AbstractC5724f0 e() {
        List listF = f();
        if (listF.isEmpty()) {
            return null;
        }
        return (AbstractC5724f0) listF.get(0);
    }

    synchronized List f() {
        return this.f32126b;
    }

    public synchronized void register(AbstractC5724f0 abstractC5724f0) {
        a(abstractC5724f0);
        g();
    }
}
