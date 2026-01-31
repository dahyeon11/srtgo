package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class A1 extends AbstractC5209f0 implements B1 {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final A1 f26093c = new A1();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26094d = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f26095a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26096b;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public A1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = A1.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements B1 {

        /* renamed from: a, reason: collision with root package name */
        private int f26097a;

        /* renamed from: b, reason: collision with root package name */
        private int f26098b;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(A1 a12) {
            if ((this.f26097a & 1) != 0) {
                a12.f26095a = this.f26098b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26291k;
        }

        public b clearValue() {
            this.f26097a &= -2;
            this.f26098b = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26291k;
        }

        @Override // com.google.protobuf.B1
        public int getValue() {
            return this.f26098b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26292l.ensureFieldAccessorsInitialized(A1.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(int i8) {
            this.f26098b = i8;
            this.f26097a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public A1 build() {
            A1 a1BuildPartial = buildPartial();
            if (a1BuildPartial.isInitialized()) {
                return a1BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) a1BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public A1 buildPartial() {
            A1 a12 = new A1(this, null);
            if (this.f26097a != 0) {
                e(a12);
            }
            onBuilt();
            return a12;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public A1 getDefaultInstanceForType() {
            return A1.getDefaultInstance();
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
            this.f26097a = 0;
            this.f26098b = 0;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof A1) {
                return mergeFrom((A1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(A1 a12) {
            if (a12 == A1.getDefaultInstance()) {
                return this;
            }
            if (a12.getValue() != 0) {
                setValue(a12.getValue());
            }
            mergeUnknownFields(a12.getUnknownFields());
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
                            if (tag != 8) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f26098b = rVar.readUInt32();
                                this.f26097a |= 1;
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

    /* synthetic */ A1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static A1 getDefaultInstance() {
        return f26093c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26291k;
    }

    public static b newBuilder() {
        return f26093c.toBuilder();
    }

    public static A1 of(int i8) {
        return newBuilder().setValue(i8).build();
    }

    public static A1 parseDelimitedFrom(InputStream inputStream) {
        return (A1) AbstractC5209f0.parseDelimitedWithIOException(f26094d, inputStream);
    }

    public static A1 parseFrom(ByteBuffer byteBuffer) {
        return (A1) f26094d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26094d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return super.equals(obj);
        }
        A1 a12 = (A1) obj;
        return getValue() == a12.getValue() && getUnknownFields().equals(a12.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26094d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int i9 = this.f26095a;
        int iComputeUInt32Size = (i9 != 0 ? AbstractC5248t.computeUInt32Size(1, i9) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeUInt32Size;
        return iComputeUInt32Size;
    }

    @Override // com.google.protobuf.B1
    public int getValue() {
        return this.f26095a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26292l.ensureFieldAccessorsInitialized(A1.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26096b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26096b = (byte) 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new A1();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        int i8 = this.f26095a;
        if (i8 != 0) {
            abstractC5248t.writeUInt32(1, i8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private A1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26095a = 0;
        this.f26096b = (byte) -1;
    }

    public static b newBuilder(A1 a12) {
        return f26093c.toBuilder().mergeFrom(a12);
    }

    public static A1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (A1) f26094d.parseFrom(byteBuffer, m8);
    }

    public static A1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (A1) AbstractC5209f0.parseDelimitedWithIOException(f26094d, inputStream, m8);
    }

    public static A1 parseFrom(AbstractC5235o abstractC5235o) {
        return (A1) f26094d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public A1 getDefaultInstanceForType() {
        return f26093c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26093c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static A1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (A1) f26094d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private A1() {
        this.f26095a = 0;
        this.f26096b = (byte) -1;
    }

    public static A1 parseFrom(byte[] bArr) {
        return (A1) f26094d.parseFrom(bArr);
    }

    public static A1 parseFrom(byte[] bArr, M m8) {
        return (A1) f26094d.parseFrom(bArr, m8);
    }

    public static A1 parseFrom(InputStream inputStream) {
        return (A1) AbstractC5209f0.parseWithIOException(f26094d, inputStream);
    }

    public static A1 parseFrom(InputStream inputStream, M m8) {
        return (A1) AbstractC5209f0.parseWithIOException(f26094d, inputStream, m8);
    }

    public static A1 parseFrom(r rVar) {
        return (A1) AbstractC5209f0.parseWithIOException(f26094d, rVar);
    }

    public static A1 parseFrom(r rVar, M m8) {
        return (A1) AbstractC5209f0.parseWithIOException(f26094d, rVar, m8);
    }
}
