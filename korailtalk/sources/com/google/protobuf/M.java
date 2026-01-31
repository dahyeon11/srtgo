package com.google.protobuf;

import com.google.protobuf.AbstractC5206e0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class M {

    /* renamed from: b */
    private static volatile boolean f26212b = false;

    /* renamed from: c */
    private static boolean f26213c = true;

    /* renamed from: d */
    private static volatile M f26214d;

    /* renamed from: e */
    static final M f26215e = new M(true);

    /* renamed from: a */
    private final Map f26216a;

    private static class a {

        /* renamed from: a */
        static final Class f26217a = a();

        static Class a() {
            return I.class;
        }
    }

    private static final class b {

        /* renamed from: a */
        private final Object f26218a;

        /* renamed from: b */
        private final int f26219b;

        b(Object obj, int i8) {
            this.f26218a = obj;
            this.f26219b = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26218a == bVar.f26218a && this.f26219b == bVar.f26219b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f26218a) * 65535) + this.f26219b;
        }
    }

    M() {
        this.f26216a = new HashMap();
    }

    public static M getEmptyRegistry() {
        if (!f26213c) {
            return f26215e;
        }
        M mCreateEmpty = f26214d;
        if (mCreateEmpty == null) {
            synchronized (M.class) {
                try {
                    mCreateEmpty = f26214d;
                    if (mCreateEmpty == null) {
                        mCreateEmpty = L.createEmpty();
                        f26214d = mCreateEmpty;
                    }
                } finally {
                }
            }
        }
        return mCreateEmpty;
    }

    public static boolean isEagerlyParseMessageSets() {
        return f26212b;
    }

    public static M newInstance() {
        return f26213c ? L.create() : new M();
    }

    public static void setEagerlyParseMessageSets(boolean z8) {
        f26212b = z8;
    }

    public final void add(AbstractC5206e0.e eVar) {
        this.f26216a.put(new b(eVar.getContainingTypeDefaultInstance(), eVar.getNumber()), eVar);
    }

    public <ContainingType extends K0> AbstractC5206e0.e findLiteExtensionByNumber(ContainingType containingtype, int i8) {
        return (AbstractC5206e0.e) this.f26216a.get(new b(containingtype, i8));
    }

    public M getUnmodifiable() {
        return new M(this);
    }

    M(M m8) {
        if (m8 == f26215e) {
            this.f26216a = Collections.emptyMap();
        } else {
            this.f26216a = Collections.unmodifiableMap(m8.f26216a);
        }
    }

    public final void add(J j8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (AbstractC5206e0.e.class.isAssignableFrom(j8.getClass())) {
            add((AbstractC5206e0.e) j8);
        }
        if (f26213c && L.b(this)) {
            try {
                getClass().getMethod("add", a.f26217a).invoke(this, j8);
            } catch (Exception e8) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", j8), e8);
            }
        }
    }

    M(boolean z8) {
        this.f26216a = Collections.emptyMap();
    }
}
