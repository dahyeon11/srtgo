package com.google.protobuf;

import com.google.protobuf.C5269x;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class z1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f27441b = Logger.getLogger(z1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Map f27442a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Set f27443a;

        /* renamed from: b, reason: collision with root package name */
        private Map f27444b;

        private void a(C5269x.h hVar) {
            if (this.f27443a.add(hVar.getFullName())) {
                Iterator<C5269x.h> it = hVar.getDependencies().iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                Iterator<C5269x.b> it2 = hVar.getMessageTypes().iterator();
                while (it2.hasNext()) {
                    b(it2.next());
                }
            }
        }

        private void b(C5269x.b bVar) {
            Iterator<C5269x.b> it = bVar.getNestedTypes().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            if (!this.f27444b.containsKey(bVar.getFullName())) {
                this.f27444b.put(bVar.getFullName(), bVar);
                return;
            }
            z1.f27441b.warning("Type " + bVar.getFullName() + " is added multiple times.");
        }

        public b add(C5269x.b bVar) {
            if (this.f27444b == null) {
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }
            a(bVar.getFile());
            return this;
        }

        public z1 build() {
            z1 z1Var = new z1(this.f27444b);
            this.f27444b = null;
            return z1Var;
        }

        private b() {
            this.f27443a = new HashSet();
            this.f27444b = new HashMap();
        }

        public b add(Iterable<C5269x.b> iterable) {
            if (this.f27444b != null) {
                Iterator<C5269x.b> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next().getFile());
                }
                return this;
            }
            throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final z1 f27445a = new z1(Collections.emptyMap());
    }

    z1(Map map) {
        this.f27442a = map;
    }

    private static String b(String str) throws C5230m0 {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new C5230m0("Invalid type url found: " + str);
    }

    public static z1 getEmptyTypeRegistry() {
        return c.f27445a;
    }

    public static b newBuilder() {
        return new b();
    }

    public C5269x.b find(String str) {
        return (C5269x.b) this.f27442a.get(str);
    }

    public final C5269x.b getDescriptorForTypeUrl(String str) {
        return find(b(str));
    }
}
