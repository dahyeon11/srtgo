package io.grpc;

import io.grpc.C0;
import io.grpc.I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: c */
    private static final Logger f31950c = Logger.getLogger(D0.class.getName());

    /* renamed from: d */
    private static D0 f31951d;

    /* renamed from: a */
    private final LinkedHashSet f31952a = new LinkedHashSet();

    /* renamed from: b */
    private List f31953b = Collections.emptyList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(C0 c02, C0 c03) {
            return c02.d() - c03.d();
        }
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    private static final class c implements I0.b {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // io.grpc.I0.b
        public int getPriority(C0 c02) {
            return c02.d();
        }

        @Override // io.grpc.I0.b
        public boolean isAvailable(C0 c02) {
            return c02.b();
        }
    }

    private synchronized void a(C0 c02) {
        e3.w.checkArgument(c02.b(), "isAvailable() returned false");
        this.f31952a.add(c02);
    }

    private synchronized void e() {
        ArrayList arrayList = new ArrayList(this.f31952a);
        Collections.sort(arrayList, Collections.reverseOrder(new a()));
        this.f31953b = Collections.unmodifiableList(arrayList);
    }

    public static synchronized D0 getDefaultRegistry() {
        try {
            if (f31951d == null) {
                List<C0> listLoadAll = I0.loadAll(C0.class, Collections.emptyList(), C0.class.getClassLoader(), new c(null));
                f31951d = new D0();
                for (C0 c02 : listLoadAll) {
                    f31950c.fine("Service loader found " + c02);
                    f31951d.a(c02);
                }
                f31951d.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f31951d;
    }

    v0 b(int i8, z0 z0Var) {
        if (d().isEmpty()) {
            throw new b("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
        }
        StringBuilder sb = new StringBuilder();
        for (C0 c02 : d()) {
            C0.a aVarC = c02.c(i8, z0Var);
            if (aVarC.getServerBuilder() != null) {
                return aVarC.getServerBuilder();
            }
            sb.append("; ");
            sb.append(c02.getClass().getName());
            sb.append(": ");
            sb.append(aVarC.getError());
        }
        throw new b(sb.substring(2));
    }

    C0 c() {
        List listD = d();
        if (listD.isEmpty()) {
            return null;
        }
        return (C0) listD.get(0);
    }

    synchronized List d() {
        return this.f31953b;
    }

    public synchronized void deregister(C0 c02) {
        this.f31952a.remove(c02);
        e();
    }

    public synchronized void register(C0 c02) {
        a(c02);
        e();
    }
}
