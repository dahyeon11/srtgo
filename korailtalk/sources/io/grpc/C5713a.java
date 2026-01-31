package io.grpc;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.grpc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5713a {
    public static final C5713a EMPTY;

    /* renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap f32068b;

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f32069a;

    /* renamed from: io.grpc.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C5713a f32070a;

        /* renamed from: b, reason: collision with root package name */
        private IdentityHashMap f32071b;

        private IdentityHashMap a(int i8) {
            if (this.f32071b == null) {
                this.f32071b = new IdentityHashMap(i8);
            }
            return this.f32071b;
        }

        public C5713a build() {
            if (this.f32071b != null) {
                for (Map.Entry entry : this.f32070a.f32069a.entrySet()) {
                    if (!this.f32071b.containsKey(entry.getKey())) {
                        this.f32071b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f32070a = new C5713a(this.f32071b);
                this.f32071b = null;
            }
            return this.f32070a;
        }

        public <T> b discard(c cVar) {
            if (this.f32070a.f32069a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f32070a.f32069a);
                identityHashMap.remove(cVar);
                this.f32070a = new C5713a(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f32071b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        public <T> b set(c cVar, T t8) {
            a(1).put(cVar, t8);
            return this;
        }

        public b setAll(C5713a c5713a) {
            a(c5713a.f32069a.size()).putAll(c5713a.f32069a);
            return this;
        }

        private b(C5713a c5713a) {
            this.f32070a = c5713a;
        }
    }

    /* renamed from: io.grpc.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f32072a;

        private c(String str) {
            this.f32072a = str;
        }

        public static <T> c create(String str) {
            return new c(str);
        }

        @Deprecated
        public static <T> c of(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f32072a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f32068b = identityHashMap;
        EMPTY = new C5713a(identityHashMap);
    }

    @Deprecated
    public static b newBuilder(C5713a c5713a) {
        e3.w.checkNotNull(c5713a, "base");
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5713a.class != obj.getClass()) {
            return false;
        }
        C5713a c5713a = (C5713a) obj;
        if (this.f32069a.size() != c5713a.f32069a.size()) {
            return false;
        }
        for (Map.Entry entry : this.f32069a.entrySet()) {
            if (!c5713a.f32069a.containsKey(entry.getKey()) || !e3.r.equal(entry.getValue(), c5713a.f32069a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public <T> T get(c cVar) {
        return (T) this.f32069a.get(cVar);
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f32069a.entrySet()) {
            iHashCode += e3.r.hashCode(entry.getKey(), entry.getValue());
        }
        return iHashCode;
    }

    @Deprecated
    public Set<c> keys() {
        return Collections.unmodifiableSet(this.f32069a.keySet());
    }

    public b toBuilder() {
        return new b();
    }

    public String toString() {
        return this.f32069a.toString();
    }

    private C5713a(IdentityHashMap identityHashMap) {
        this.f32069a = identityHashMap;
    }

    public static b newBuilder() {
        return new b();
    }
}
