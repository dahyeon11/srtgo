package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import com.google.protobuf.P1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.google.protobuf.p1 */
/* loaded from: classes2.dex */
public final class C5240p1 extends AbstractC5209f0 implements InterfaceC5243q1 {
    public static final int FIELDS_FIELD_NUMBER = 1;

    /* renamed from: c */
    private static final C5240p1 f26641c = new C5240p1();

    /* renamed from: d */
    private static final Z0 f26642d = new a();

    /* renamed from: a */
    private B0 f26643a;

    /* renamed from: b */
    private byte f26644b;

    /* renamed from: com.google.protobuf.p1$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5240p1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5240p1.newBuilder();
            try {
                bVarNewBuilder.mergeFrom(rVar, m8);
                return bVarNewBuilder.buildPartial();
            } catch (E1 e8) {
                throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(bVarNewBuilder.buildPartial());
            } catch (C5230m0 e9) {
                throw e9.setUnfinishedMessage(bVarNewBuilder.buildPartial());
            } catch (IOException e10) {
                throw new C5230m0(e10).setUnfinishedMessage(bVarNewBuilder.buildPartial());
            }
        }
    }

    /* renamed from: com.google.protobuf.p1$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5243q1 {

        /* renamed from: a */
        private int f26645a;

        /* renamed from: b */
        private B0 f26646b;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(C5240p1 c5240p1) {
            if ((this.f26645a & 1) != 0) {
                c5240p1.f26643a = f();
                c5240p1.f26643a.makeImmutable();
            }
        }

        private B0 f() {
            B0 b02 = this.f26646b;
            return b02 == null ? B0.emptyMapField(c.f26647a) : b02;
        }

        private B0 g() {
            if (this.f26646b == null) {
                this.f26646b = B0.newMapField(c.f26647a);
            }
            if (!this.f26646b.isMutable()) {
                this.f26646b = this.f26646b.copy();
            }
            this.f26645a |= 1;
            onChanged();
            return this.f26646b;
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC5245r1.f26704a;
        }

        public b clearFields() {
            this.f26645a &= -2;
            g().getMutableMap().clear();
            return this;
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        public boolean containsFields(String str) {
            if (str != null) {
                return f().getMap().containsKey(str);
            }
            throw new NullPointerException("map key");
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return AbstractC5245r1.f26704a;
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        @Deprecated
        public Map<String, N1> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        public int getFieldsCount() {
            return f().getMap().size();
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        public Map<String, N1> getFieldsMap() {
            return f().getMap();
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        public N1 getFieldsOrDefault(String str, N1 n12) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<Object, Object> map = f().getMap();
            return map.containsKey(str) ? (N1) map.get(str) : n12;
        }

        @Override // com.google.protobuf.InterfaceC5243q1
        public N1 getFieldsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<Object, Object> map = f().getMap();
            if (map.containsKey(str)) {
                return (N1) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, N1> getMutableFields() {
            this.f26645a |= 1;
            return g().getMutableMap();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC5245r1.f26705b.ensureFieldAccessorsInitialized(C5240p1.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected B0 internalGetMapField(int i8) {
            if (i8 == 1) {
                return f();
            }
            throw new RuntimeException("Invalid map field number: " + i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected B0 internalGetMutableMapField(int i8) {
            if (i8 == 1) {
                return g();
            }
            throw new RuntimeException("Invalid map field number: " + i8);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b putAllFields(Map<String, N1> map) {
            g().getMutableMap().putAll(map);
            this.f26645a |= 1;
            return this;
        }

        public b putFields(String str, N1 n12) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (n12 == null) {
                throw new NullPointerException("map value");
            }
            g().getMutableMap().put(str, n12);
            this.f26645a |= 1;
            return this;
        }

        public b removeFields(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            g().getMutableMap().remove(str);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5240p1 build() {
            C5240p1 c5240p1BuildPartial = buildPartial();
            if (c5240p1BuildPartial.isInitialized()) {
                return c5240p1BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5240p1BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5240p1 buildPartial() {
            C5240p1 c5240p1 = new C5240p1(this, null);
            if (this.f26645a != 0) {
                e(c5240p1);
            }
            onBuilt();
            return c5240p1;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5240p1 getDefaultInstanceForType() {
            return C5240p1.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b setUnknownFields(G1 g12) {
            return (b) super.setUnknownFields(g12);
        }

        private b(AbstractC5209f0.c cVar) {
            super(cVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b mergeUnknownFields(G1 g12) {
            return (b) super.mergeUnknownFields(g12);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26645a = 0;
            g().clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5240p1) {
                return mergeFrom((C5240p1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5240p1 c5240p1) {
            if (c5240p1 == C5240p1.getDefaultInstance()) {
                return this;
            }
            g().mergeFrom(c5240p1.p());
            this.f26645a |= 1;
            mergeUnknownFields(c5240p1.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b mergeFrom(r rVar, M m8) {
            m8.getClass();
            boolean z8 = false;
            while (!z8) {
                try {
                    try {
                        int tag = rVar.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                C5274z0 c5274z0 = (C5274z0) rVar.readMessage(c.f26647a.getParserForType(), m8);
                                g().getMutableMap().put((String) c5274z0.getKey(), (N1) c5274z0.getValue());
                                this.f26645a |= 1;
                            }
                        }
                        z8 = true;
                    } catch (C5230m0 e8) {
                        throw e8.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    /* renamed from: com.google.protobuf.p1$c */
    private static final class c {

        /* renamed from: a */
        static final C5274z0 f26647a = C5274z0.newDefaultInstance(AbstractC5245r1.f26706c, P1.b.STRING, "", P1.b.MESSAGE, N1.getDefaultInstance());
    }

    /* synthetic */ C5240p1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5240p1 getDefaultInstance() {
        return f26641c;
    }

    public static final C5269x.b getDescriptor() {
        return AbstractC5245r1.f26704a;
    }

    public static b newBuilder() {
        return f26641c.toBuilder();
    }

    public B0 p() {
        B0 b02 = this.f26643a;
        return b02 == null ? B0.emptyMapField(c.f26647a) : b02;
    }

    public static C5240p1 parseDelimitedFrom(InputStream inputStream) {
        return (C5240p1) AbstractC5209f0.parseDelimitedWithIOException(f26642d, inputStream);
    }

    public static C5240p1 parseFrom(ByteBuffer byteBuffer) {
        return (C5240p1) f26642d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26642d;
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    public boolean containsFields(String str) {
        if (str != null) {
            return p().getMap().containsKey(str);
        }
        throw new NullPointerException("map key");
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5240p1)) {
            return super.equals(obj);
        }
        C5240p1 c5240p1 = (C5240p1) obj;
        return p().equals(c5240p1.p()) && getUnknownFields().equals(c5240p1.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    @Deprecated
    public Map<String, N1> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    public int getFieldsCount() {
        return p().getMap().size();
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    public Map<String, N1> getFieldsMap() {
        return p().getMap();
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    public N1 getFieldsOrDefault(String str, N1 n12) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<Object, Object> map = p().getMap();
        return map.containsKey(str) ? (N1) map.get(str) : n12;
    }

    @Override // com.google.protobuf.InterfaceC5243q1
    public N1 getFieldsOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<Object, Object> map = p().getMap();
        if (map.containsKey(str)) {
            return (N1) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26642d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeMessageSize = 0;
        for (Map.Entry<Object, Object> entry : p().getMap().entrySet()) {
            iComputeMessageSize += AbstractC5248t.computeMessageSize(1, c.f26647a.newBuilderForType().setKey((String) entry.getKey()).setValue((N1) entry.getValue()).build());
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (!p().getMap().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + p().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return AbstractC5245r1.f26705b.ensureFieldAccessorsInitialized(C5240p1.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected B0 internalGetMapField(int i8) {
        if (i8 == 1) {
            return p();
        }
        throw new RuntimeException("Invalid map field number: " + i8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26644b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26644b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new C5240p1();
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: q */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        AbstractC5209f0.serializeStringMapTo(abstractC5248t, p(), c.f26647a, 1);
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5240p1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26644b = (byte) -1;
    }

    public static b newBuilder(C5240p1 c5240p1) {
        return f26641c.toBuilder().mergeFrom(c5240p1);
    }

    public static C5240p1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5240p1) f26642d.parseFrom(byteBuffer, m8);
    }

    public static C5240p1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5240p1) AbstractC5209f0.parseDelimitedWithIOException(f26642d, inputStream, m8);
    }

    public static C5240p1 parseFrom(AbstractC5235o abstractC5235o) {
        return (C5240p1) f26642d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5240p1 getDefaultInstanceForType() {
        return f26641c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f26641c ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    private C5240p1() {
        this.f26644b = (byte) -1;
    }

    public static C5240p1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5240p1) f26642d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static C5240p1 parseFrom(byte[] bArr) {
        return (C5240p1) f26642d.parseFrom(bArr);
    }

    public static C5240p1 parseFrom(byte[] bArr, M m8) {
        return (C5240p1) f26642d.parseFrom(bArr, m8);
    }

    public static C5240p1 parseFrom(InputStream inputStream) {
        return (C5240p1) AbstractC5209f0.parseWithIOException(f26642d, inputStream);
    }

    public static C5240p1 parseFrom(InputStream inputStream, M m8) {
        return (C5240p1) AbstractC5209f0.parseWithIOException(f26642d, inputStream, m8);
    }

    public static C5240p1 parseFrom(r rVar) {
        return (C5240p1) AbstractC5209f0.parseWithIOException(f26642d, rVar);
    }

    public static C5240p1 parseFrom(r rVar, M m8) {
        return (C5240p1) AbstractC5209f0.parseWithIOException(f26642d, rVar, m8);
    }
}
