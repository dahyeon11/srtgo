package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5234n1 extends AbstractC5209f0 implements InterfaceC5237o1 {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C5234n1 f26608c = new C5234n1();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26609d = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f26610a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26611b;

    /* renamed from: com.google.protobuf.n1$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5234n1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5234n1.newBuilder();
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

    /* renamed from: com.google.protobuf.n1$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5237o1 {

        /* renamed from: a, reason: collision with root package name */
        private int f26612a;

        /* renamed from: b, reason: collision with root package name */
        private Object f26613b;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(C5234n1 c5234n1) {
            if ((this.f26612a & 1) != 0) {
                c5234n1.f26610a = this.f26613b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26295o;
        }

        public b clearValue() {
            this.f26613b = C5234n1.getDefaultInstance().getValue();
            this.f26612a &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26295o;
        }

        @Override // com.google.protobuf.InterfaceC5237o1
        public String getValue() {
            Object obj = this.f26613b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.f26613b = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC5237o1
        public AbstractC5235o getValueBytes() {
            Object obj = this.f26613b;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.f26613b = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26296p.ensureFieldAccessorsInitialized(C5234n1.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(String str) {
            str.getClass();
            this.f26613b = str;
            this.f26612a |= 1;
            onChanged();
            return this;
        }

        public b setValueBytes(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
            this.f26613b = abstractC5235o;
            this.f26612a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f26613b = "";
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5234n1 build() {
            C5234n1 c5234n1BuildPartial = buildPartial();
            if (c5234n1BuildPartial.isInitialized()) {
                return c5234n1BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5234n1BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5234n1 buildPartial() {
            C5234n1 c5234n1 = new C5234n1(this, null);
            if (this.f26612a != 0) {
                e(c5234n1);
            }
            onBuilt();
            return c5234n1;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5234n1 getDefaultInstanceForType() {
            return C5234n1.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b setUnknownFields(G1 g12) {
            return (b) super.setUnknownFields(g12);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b mergeUnknownFields(G1 g12) {
            return (b) super.mergeUnknownFields(g12);
        }

        private b(AbstractC5209f0.c cVar) {
            super(cVar);
            this.f26613b = "";
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26612a = 0;
            this.f26613b = "";
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5234n1) {
                return mergeFrom((C5234n1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5234n1 c5234n1) {
            if (c5234n1 == C5234n1.getDefaultInstance()) {
                return this;
            }
            if (!c5234n1.getValue().isEmpty()) {
                this.f26613b = c5234n1.f26610a;
                this.f26612a |= 1;
                onChanged();
            }
            mergeUnknownFields(c5234n1.getUnknownFields());
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
                                this.f26613b = rVar.readStringRequireUtf8();
                                this.f26612a |= 1;
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

    /* synthetic */ C5234n1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5234n1 getDefaultInstance() {
        return f26608c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26295o;
    }

    public static b newBuilder() {
        return f26608c.toBuilder();
    }

    public static C5234n1 of(String str) {
        return newBuilder().setValue(str).build();
    }

    public static C5234n1 parseDelimitedFrom(InputStream inputStream) {
        return (C5234n1) AbstractC5209f0.parseDelimitedWithIOException(f26609d, inputStream);
    }

    public static C5234n1 parseFrom(ByteBuffer byteBuffer) {
        return (C5234n1) f26609d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26609d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5234n1)) {
            return super.equals(obj);
        }
        C5234n1 c5234n1 = (C5234n1) obj;
        return getValue().equals(c5234n1.getValue()) && getUnknownFields().equals(c5234n1.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26609d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.f26610a) ? AbstractC5209f0.computeStringSize(1, this.f26610a) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeStringSize;
        return iComputeStringSize;
    }

    @Override // com.google.protobuf.InterfaceC5237o1
    public String getValue() {
        Object obj = this.f26610a;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
        this.f26610a = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC5237o1
    public AbstractC5235o getValueBytes() {
        Object obj = this.f26610a;
        if (!(obj instanceof String)) {
            return (AbstractC5235o) obj;
        }
        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
        this.f26610a = abstractC5235oCopyFromUtf8;
        return abstractC5235oCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26296p.ensureFieldAccessorsInitialized(C5234n1.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26611b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26611b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new C5234n1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (!AbstractC5209f0.isStringEmpty(this.f26610a)) {
            AbstractC5209f0.writeString(abstractC5248t, 1, this.f26610a);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5234n1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26610a = "";
        this.f26611b = (byte) -1;
    }

    public static b newBuilder(C5234n1 c5234n1) {
        return f26608c.toBuilder().mergeFrom(c5234n1);
    }

    public static C5234n1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5234n1) f26609d.parseFrom(byteBuffer, m8);
    }

    public static C5234n1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5234n1) AbstractC5209f0.parseDelimitedWithIOException(f26609d, inputStream, m8);
    }

    public static C5234n1 parseFrom(AbstractC5235o abstractC5235o) {
        return (C5234n1) f26609d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5234n1 getDefaultInstanceForType() {
        return f26608c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26608c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5234n1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5234n1) f26609d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C5234n1() {
        this.f26610a = "";
        this.f26611b = (byte) -1;
        this.f26610a = "";
    }

    public static C5234n1 parseFrom(byte[] bArr) {
        return (C5234n1) f26609d.parseFrom(bArr);
    }

    public static C5234n1 parseFrom(byte[] bArr, M m8) {
        return (C5234n1) f26609d.parseFrom(bArr, m8);
    }

    public static C5234n1 parseFrom(InputStream inputStream) {
        return (C5234n1) AbstractC5209f0.parseWithIOException(f26609d, inputStream);
    }

    public static C5234n1 parseFrom(InputStream inputStream, M m8) {
        return (C5234n1) AbstractC5209f0.parseWithIOException(f26609d, inputStream, m8);
    }

    public static C5234n1 parseFrom(r rVar) {
        return (C5234n1) AbstractC5209f0.parseWithIOException(f26609d, rVar);
    }

    public static C5234n1 parseFrom(r rVar, M m8) {
        return (C5234n1) AbstractC5209f0.parseWithIOException(f26609d, rVar, m8);
    }
}
