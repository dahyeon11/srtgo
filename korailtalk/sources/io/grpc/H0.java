package io.grpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31962a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection f31963b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f31964c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f31965a;

        /* renamed from: b, reason: collision with root package name */
        private List f31966b;

        /* renamed from: c, reason: collision with root package name */
        private Object f31967c;

        /* JADX INFO: Access modifiers changed from: private */
        public b e(Collection collection) {
            this.f31966b.addAll(collection);
            return this;
        }

        public b addMethod(C5730i0 c5730i0) {
            this.f31966b.add((C5730i0) e3.w.checkNotNull(c5730i0, "method"));
            return this;
        }

        public H0 build() {
            return new H0(this);
        }

        public b setName(String str) {
            this.f31965a = (String) e3.w.checkNotNull(str, "name");
            return this;
        }

        public b setSchemaDescriptor(Object obj) {
            this.f31967c = obj;
            return this;
        }

        private b(String str) {
            this.f31966b = new ArrayList();
            setName(str);
        }
    }

    static void a(String str, Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5730i0 c5730i0 = (C5730i0) it.next();
            e3.w.checkNotNull(c5730i0, "method");
            String serviceName = c5730i0.getServiceName();
            e3.w.checkArgument(str.equals(serviceName), "service names %s != %s", serviceName, str);
            e3.w.checkArgument(hashSet.add(c5730i0.getFullMethodName()), "duplicate name %s", c5730i0.getFullMethodName());
        }
    }

    public static b newBuilder(String str) {
        return new b(str);
    }

    public Collection<C5730i0> getMethods() {
        return this.f31963b;
    }

    public String getName() {
        return this.f31962a;
    }

    public Object getSchemaDescriptor() {
        return this.f31964c;
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("name", this.f31962a).add("schemaDescriptor", this.f31964c).add("methods", this.f31963b).omitNullValues().toString();
    }

    public H0(String str, C5730i0... c5730i0Arr) {
        this(str, Arrays.asList(c5730i0Arr));
    }

    public H0(String str, Collection<C5730i0> collection) {
        this(newBuilder(str).e((Collection) e3.w.checkNotNull(collection, "methods")));
    }

    private H0(b bVar) {
        String str = bVar.f31965a;
        this.f31962a = str;
        a(str, bVar.f31966b);
        this.f31963b = Collections.unmodifiableList(new ArrayList(bVar.f31966b));
        this.f31964c = bVar.f31967c;
    }
}
