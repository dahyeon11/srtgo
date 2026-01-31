package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.C5269x;
import com.google.protobuf.H0;
import com.google.protobuf.P1;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5274z0 extends AbstractC5193a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27431a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27432b;

    /* renamed from: c, reason: collision with root package name */
    private final c f27433c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f27434d;

    /* renamed from: com.google.protobuf.z0$b */
    public static class b extends AbstractC5193a.AbstractC0218a {

        /* renamed from: a, reason: collision with root package name */
        private final c f27435a;

        /* renamed from: b, reason: collision with root package name */
        private Object f27436b;

        /* renamed from: c, reason: collision with root package name */
        private Object f27437c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27438d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27439e;

        private void c(C5269x.g gVar) {
            if (gVar.getContainingType() == this.f27435a.descriptor) {
                return;
            }
            throw new RuntimeException("Wrong FieldDescriptor \"" + gVar.getFullName() + "\" used in message \"" + this.f27435a.descriptor.getFullName());
        }

        public b clearKey() {
            this.f27436b = this.f27435a.defaultKey;
            this.f27438d = false;
            return this;
        }

        public b clearValue() {
            this.f27437c = this.f27435a.defaultValue;
            this.f27439e = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Map<C5269x.g, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (C5269x.g gVar : this.f27435a.descriptor.getFields()) {
                if (hasField(gVar)) {
                    treeMap.put(gVar, getField(gVar));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return this.f27435a.descriptor;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getField(C5269x.g gVar) {
            c(gVar);
            Object key = gVar.getNumber() == 1 ? getKey() : getValue();
            return gVar.getType() == C5269x.g.c.ENUM ? gVar.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
        }

        public Object getKey() {
            return this.f27436b;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getRepeatedField(C5269x.g gVar, int i8) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public int getRepeatedFieldCount(C5269x.g gVar) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public G1 getUnknownFields() {
            return G1.getDefaultInstance();
        }

        public Object getValue() {
            return this.f27437c;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasField(C5269x.g gVar) {
            c(gVar);
            return gVar.getNumber() == 1 ? this.f27438d : this.f27439e;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            return C5274z0.l(this.f27435a, this.f27437c);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a newBuilderForField(C5269x.g gVar) {
            c(gVar);
            if (gVar.getNumber() == 2 && gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                return ((H0) this.f27437c).newBuilderForType();
            }
            throw new RuntimeException("\"" + gVar.getFullName() + "\" is not a message value field.");
        }

        public b setKey(Object obj) {
            this.f27436b = obj;
            this.f27438d = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setUnknownFields(G1 g12) {
            return this;
        }

        public b setValue(Object obj) {
            this.f27437c = obj;
            this.f27439e = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b addRepeatedField(C5269x.g gVar, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b clearField(C5269x.g gVar) {
            c(gVar);
            if (gVar.getNumber() == 1) {
                clearKey();
            } else {
                clearValue();
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setField(C5269x.g gVar, Object obj) {
            c(gVar);
            if (obj == null) {
                throw new NullPointerException(gVar.getFullName() + " is null");
            }
            if (gVar.getNumber() == 1) {
                setKey(obj);
            } else {
                if (gVar.getType() == C5269x.g.c.ENUM) {
                    obj = Integer.valueOf(((C5269x.f) obj).getNumber());
                } else if (gVar.getType() == C5269x.g.c.MESSAGE && !this.f27435a.defaultValue.getClass().isInstance(obj)) {
                    obj = ((H0) this.f27435a.defaultValue).toBuilder().mergeFrom((H0) obj).build();
                }
                setValue(obj);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        private b(c cVar) {
            this(cVar, cVar.defaultKey, cVar.defaultValue, false, false);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5274z0 build() {
            C5274z0 c5274z0BuildPartial = buildPartial();
            if (c5274z0BuildPartial.isInitialized()) {
                return c5274z0BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5274z0BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5274z0 buildPartial() {
            return new C5274z0(this.f27435a, this.f27436b, this.f27437c);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5274z0 getDefaultInstanceForType() {
            c cVar = this.f27435a;
            return new C5274z0(cVar, cVar.defaultKey, cVar.defaultValue);
        }

        private b(c cVar, Object obj, Object obj2, boolean z8, boolean z9) {
            this.f27435a = cVar;
            this.f27436b = obj;
            this.f27437c = obj2;
            this.f27438d = z8;
            this.f27439e = z9;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
        /* renamed from: clone */
        public b mo3clone() {
            return new b(this.f27435a, this.f27436b, this.f27437c, this.f27438d, this.f27439e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.z0$c */
    static final class c extends A0.b {
        public final C5269x.b descriptor;
        public final Z0 parser;

        /* renamed from: com.google.protobuf.z0$c$a */
        class a extends AbstractC5199c {
            a() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public C5274z0 parsePartialFrom(r rVar, M m8) {
                return new C5274z0(c.this, rVar, m8);
            }
        }

        public c(C5269x.b bVar, C5274z0 c5274z0, P1.b bVar2, P1.b bVar3) {
            super(bVar2, c5274z0.f27431a, bVar3, c5274z0.f27432b);
            this.descriptor = bVar;
            this.parser = new a();
        }
    }

    private void j(C5269x.g gVar) {
        if (gVar.getContainingType() == this.f27433c.descriptor) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + gVar.getFullName() + "\" used in message \"" + this.f27433c.descriptor.getFullName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(c cVar, Object obj) {
        if (cVar.valueType.getJavaType() == P1.c.MESSAGE) {
            return ((K0) obj).isInitialized();
        }
        return true;
    }

    public static <K, V> C5274z0 newDefaultInstance(C5269x.b bVar, P1.b bVar2, K k8, P1.b bVar3, V v8) {
        return new C5274z0(bVar, bVar2, k8, bVar3, v8);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Map<C5269x.g, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (C5269x.g gVar : this.f27433c.descriptor.getFields()) {
            if (hasField(gVar)) {
                treeMap.put(gVar, getField(gVar));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5269x.b getDescriptorForType() {
        return this.f27433c.descriptor;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getField(C5269x.g gVar) {
        j(gVar);
        Object key = gVar.getNumber() == 1 ? getKey() : getValue();
        return gVar.getType() == C5269x.g.c.ENUM ? gVar.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.f27431a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return this.f27433c.parser;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getRepeatedField(C5269x.g gVar, int i8) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public int getRepeatedFieldCount(C5269x.g gVar) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        if (this.f27434d != -1) {
            return this.f27434d;
        }
        int iA = A0.a(this.f27433c, this.f27431a, this.f27432b);
        this.f27434d = iA;
        return iA;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public G1 getUnknownFields() {
        return G1.getDefaultInstance();
    }

    public Object getValue() {
        return this.f27432b;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public boolean hasField(C5269x.g gVar) {
        j(gVar);
        return true;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public boolean isInitialized() {
        return l(this.f27433c, this.f27432b);
    }

    final c k() {
        return this.f27433c;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        A0.e(abstractC5248t, this.f27433c, this.f27431a, this.f27432b);
    }

    private C5274z0(C5269x.b bVar, P1.b bVar2, Object obj, P1.b bVar3, Object obj2) {
        this.f27434d = -1;
        this.f27431a = obj;
        this.f27432b = obj2;
        this.f27433c = new c(bVar, this, bVar2, bVar3);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5274z0 getDefaultInstanceForType() {
        c cVar = this.f27433c;
        return new C5274z0(cVar, cVar.defaultKey, cVar.defaultValue);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return new b(this.f27433c);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return new b(this.f27433c, this.f27431a, this.f27432b, true, true);
    }

    private C5274z0(c cVar, Object obj, Object obj2) {
        this.f27434d = -1;
        this.f27431a = obj;
        this.f27432b = obj2;
        this.f27433c = cVar;
    }

    private C5274z0(c cVar, r rVar, M m8) throws C5230m0 {
        this.f27434d = -1;
        try {
            this.f27433c = cVar;
            Map.Entry entryC = A0.c(rVar, cVar, m8);
            this.f27431a = entryC.getKey();
            this.f27432b = entryC.getValue();
        } catch (C5230m0 e8) {
            throw e8.setUnfinishedMessage(this);
        } catch (IOException e9) {
            throw new C5230m0(e9).setUnfinishedMessage(this);
        }
    }
}
