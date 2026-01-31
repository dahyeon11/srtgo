package com.google.protobuf;

import com.google.protobuf.AbstractC5200c0;
import com.google.protobuf.C5269x;
import com.google.protobuf.I;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class K extends M {

    /* renamed from: j */
    static final K f26173j = new K(true);

    /* renamed from: f */
    private final Map f26174f;

    /* renamed from: g */
    private final Map f26175g;

    /* renamed from: h */
    private final Map f26176h;

    /* renamed from: i */
    private final Map f26177i;

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26178a;

        static {
            int[] iArr = new int[I.a.values().length];
            f26178a = iArr;
            try {
                iArr[I.a.IMMUTABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26178a[I.a.MUTABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class b {

        /* renamed from: a */
        private final C5269x.b f26179a;

        /* renamed from: b */
        private final int f26180b;

        b(C5269x.b bVar, int i8) {
            this.f26179a = bVar;
            this.f26180b = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26179a == bVar.f26179a && this.f26180b == bVar.f26180b;
        }

        public int hashCode() {
            return (this.f26179a.hashCode() * 65535) + this.f26180b;
        }
    }

    public static final class c {
        public final H0 defaultInstance;
        public final C5269x.g descriptor;

        /* synthetic */ c(C5269x.g gVar, H0 h02, a aVar) {
            this(gVar, h02);
        }

        private c(C5269x.g gVar, H0 h02) {
            this.descriptor = gVar;
            this.defaultInstance = h02;
        }
    }

    private K() {
        this.f26174f = new HashMap();
        this.f26175g = new HashMap();
        this.f26176h = new HashMap();
        this.f26177i = new HashMap();
    }

    private void a(c cVar, I.a aVar) {
        Map map;
        Map map2;
        if (!cVar.descriptor.isExtension()) {
            throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
        }
        int i8 = a.f26178a[aVar.ordinal()];
        if (i8 == 1) {
            map = this.f26174f;
            map2 = this.f26176h;
        } else {
            if (i8 != 2) {
                return;
            }
            map = this.f26175g;
            map2 = this.f26177i;
        }
        map.put(cVar.descriptor.getFullName(), cVar);
        map2.put(new b(cVar.descriptor.getContainingType(), cVar.descriptor.getNumber()), cVar);
        C5269x.g gVar = cVar.descriptor;
        if (gVar.getContainingType().getOptions().getMessageSetWireFormat() && gVar.getType() == C5269x.g.c.MESSAGE && gVar.isOptional() && gVar.getExtensionScope() == gVar.getMessageType()) {
            map.put(gVar.getMessageType().getFullName(), cVar);
        }
    }

    static c b(I i8) {
        if (i8.getDescriptor().getJavaType() != C5269x.g.b.MESSAGE) {
            return new c(i8.getDescriptor(), null, null);
        }
        if (i8.getMessageDefaultInstance() != null) {
            return new c(i8.getDescriptor(), i8.getMessageDefaultInstance(), null);
        }
        throw new IllegalStateException("Registered message-type extension had null default instance: " + i8.getDescriptor().getFullName());
    }

    public static K getEmptyRegistry() {
        return f26173j;
    }

    public static K newInstance() {
        return new K();
    }

    public void add(I i8) {
        if (i8.c() == I.a.IMMUTABLE || i8.c() == I.a.MUTABLE) {
            a(b(i8), i8.c());
        }
    }

    @Deprecated
    public c findExtensionByName(String str) {
        return findImmutableExtensionByName(str);
    }

    @Deprecated
    public c findExtensionByNumber(C5269x.b bVar, int i8) {
        return findImmutableExtensionByNumber(bVar, i8);
    }

    public c findImmutableExtensionByName(String str) {
        return (c) this.f26174f.get(str);
    }

    public c findImmutableExtensionByNumber(C5269x.b bVar, int i8) {
        return (c) this.f26176h.get(new b(bVar, i8));
    }

    public c findMutableExtensionByName(String str) {
        return (c) this.f26175g.get(str);
    }

    public c findMutableExtensionByNumber(C5269x.b bVar, int i8) {
        return (c) this.f26177i.get(new b(bVar, i8));
    }

    public Set<c> getAllImmutableExtensionsByExtendedType(String str) {
        HashSet hashSet = new HashSet();
        for (b bVar : this.f26176h.keySet()) {
            if (bVar.f26179a.getFullName().equals(str)) {
                hashSet.add((c) this.f26176h.get(bVar));
            }
        }
        return hashSet;
    }

    public Set<c> getAllMutableExtensionsByExtendedType(String str) {
        HashSet hashSet = new HashSet();
        for (b bVar : this.f26177i.keySet()) {
            if (bVar.f26179a.getFullName().equals(str)) {
                hashSet.add((c) this.f26177i.get(bVar));
            }
        }
        return hashSet;
    }

    @Override // com.google.protobuf.M
    public K getUnmodifiable() {
        return new K(this);
    }

    public void add(AbstractC5200c0.g gVar) {
        add((I) gVar);
    }

    public void add(C5269x.g gVar) {
        if (gVar.getJavaType() != C5269x.g.b.MESSAGE) {
            c cVar = new c(gVar, null, null);
            a(cVar, I.a.IMMUTABLE);
            a(cVar, I.a.MUTABLE);
            return;
        }
        throw new IllegalArgumentException("ExtensionRegistry.add() must be provided a default instance when adding an embedded message extension.");
    }

    private K(K k8) {
        super(k8);
        this.f26174f = Collections.unmodifiableMap(k8.f26174f);
        this.f26175g = Collections.unmodifiableMap(k8.f26175g);
        this.f26176h = Collections.unmodifiableMap(k8.f26176h);
        this.f26177i = Collections.unmodifiableMap(k8.f26177i);
    }

    public void add(C5269x.g gVar, H0 h02) {
        if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
            a(new c(gVar, h02, null), I.a.IMMUTABLE);
            return;
        }
        throw new IllegalArgumentException("ExtensionRegistry.add() provided a default instance for a non-message extension.");
    }

    K(boolean z8) {
        super(M.f26215e);
        this.f26174f = Collections.emptyMap();
        this.f26175g = Collections.emptyMap();
        this.f26176h = Collections.emptyMap();
        this.f26177i = Collections.emptyMap();
    }
}
