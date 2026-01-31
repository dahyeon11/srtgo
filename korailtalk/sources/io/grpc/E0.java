package io.grpc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final H0 f31955a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f31956b;

    public static b builder(String str) {
        return new b(str);
    }

    public B0 getMethod(String str) {
        return (B0) this.f31956b.get(str);
    }

    public Collection<B0> getMethods() {
        return this.f31956b.values();
    }

    public H0 getServiceDescriptor() {
        return this.f31955a;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f31957a;

        /* renamed from: b, reason: collision with root package name */
        private final H0 f31958b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f31959c;

        public <ReqT, RespT> b addMethod(C5730i0 c5730i0, y0 y0Var) {
            return addMethod(B0.create((C5730i0) e3.w.checkNotNull(c5730i0, "method must not be null"), (y0) e3.w.checkNotNull(y0Var, "handler must not be null")));
        }

        public E0 build() {
            H0 h02 = this.f31958b;
            if (h02 == null) {
                ArrayList arrayList = new ArrayList(this.f31959c.size());
                Iterator it = this.f31959c.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((B0) it.next()).getMethodDescriptor());
                }
                h02 = new H0(this.f31957a, arrayList);
            }
            HashMap map = new HashMap(this.f31959c);
            for (C5730i0 c5730i0 : h02.getMethods()) {
                B0 b02 = (B0) map.remove(c5730i0.getFullMethodName());
                if (b02 == null) {
                    throw new IllegalStateException("No method bound for descriptor entry " + c5730i0.getFullMethodName());
                }
                if (b02.getMethodDescriptor() != c5730i0) {
                    throw new IllegalStateException("Bound method for " + c5730i0.getFullMethodName() + " not same instance as method in service descriptor");
                }
            }
            if (map.size() <= 0) {
                return new E0(h02, this.f31959c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((B0) map.values().iterator().next()).getMethodDescriptor().getFullMethodName());
        }

        private b(String str) {
            this.f31959c = new HashMap();
            this.f31957a = (String) e3.w.checkNotNull(str, "serviceName");
            this.f31958b = null;
        }

        public <ReqT, RespT> b addMethod(B0 b02) {
            C5730i0 methodDescriptor = b02.getMethodDescriptor();
            e3.w.checkArgument(this.f31957a.equals(methodDescriptor.getServiceName()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f31957a, methodDescriptor.getFullMethodName());
            String fullMethodName = methodDescriptor.getFullMethodName();
            e3.w.checkState(!this.f31959c.containsKey(fullMethodName), "Method by same name already registered: %s", fullMethodName);
            this.f31959c.put(fullMethodName, b02);
            return this;
        }

        private b(H0 h02) {
            this.f31959c = new HashMap();
            this.f31958b = (H0) e3.w.checkNotNull(h02, "serviceDescriptor");
            this.f31957a = h02.getName();
        }
    }

    private E0(H0 h02, Map map) {
        this.f31955a = (H0) e3.w.checkNotNull(h02, "serviceDescriptor");
        this.f31956b = Collections.unmodifiableMap(new HashMap(map));
    }

    public static b builder(H0 h02) {
        return new b(h02);
    }
}
