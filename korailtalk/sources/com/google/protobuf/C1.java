package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class C1 extends AbstractC5209f0 implements D1 {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C1 f26124c = new C1();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26125d = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f26126a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26127b;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C1.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements D1 {

        /* renamed from: a, reason: collision with root package name */
        private int f26128a;

        /* renamed from: b, reason: collision with root package name */
        private long f26129b;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(C1 c12) {
            if ((this.f26128a & 1) != 0) {
                c12.f26126a = this.f26129b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26287g;
        }

        public b clearValue() {
            this.f26128a &= -2;
            this.f26129b = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26287g;
        }

        @Override // com.google.protobuf.D1
        public long getValue() {
            return this.f26129b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26288h.ensureFieldAccessorsInitialized(C1.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(long j8) {
            this.f26129b = j8;
            this.f26128a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C1 build() {
            C1 c1BuildPartial = buildPartial();
            if (c1BuildPartial.isInitialized()) {
                return c1BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c1BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C1 buildPartial() {
            C1 c12 = new C1(this, null);
            if (this.f26128a != 0) {
                e(c12);
            }
            onBuilt();
            return c12;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C1 getDefaultInstanceForType() {
            return C1.getDefaultInstance();
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
            this.f26128a = 0;
            this.f26129b = 0L;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C1) {
                return mergeFrom((C1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C1 c12) {
            if (c12 == C1.getDefaultInstance()) {
                return this;
            }
            if (c12.getValue() != 0) {
                setValue(c12.getValue());
            }
            mergeUnknownFields(c12.getUnknownFields());
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
                                this.f26129b = rVar.readUInt64();
                                this.f26128a |= 1;
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

    /* synthetic */ C1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C1 getDefaultInstance() {
        return f26124c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26287g;
    }

    public static b newBuilder() {
        return f26124c.toBuilder();
    }

    public static C1 of(long j8) {
        return newBuilder().setValue(j8).build();
    }

    public static C1 parseDelimitedFrom(InputStream inputStream) {
        return (C1) AbstractC5209f0.parseDelimitedWithIOException(f26125d, inputStream);
    }

    public static C1 parseFrom(ByteBuffer byteBuffer) {
        return (C1) f26125d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26125d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1)) {
            return super.equals(obj);
        }
        C1 c12 = (C1) obj;
        return getValue() == c12.getValue() && getUnknownFields().equals(c12.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26125d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        long j8 = this.f26126a;
        int iComputeUInt64Size = (j8 != 0 ? AbstractC5248t.computeUInt64Size(1, j8) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeUInt64Size;
        return iComputeUInt64Size;
    }

    @Override // com.google.protobuf.D1
    public long getValue() {
        return this.f26126a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashLong(getValue())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26288h.ensureFieldAccessorsInitialized(C1.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26127b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26127b = (byte) 1;
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
        return new C1();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        long j8 = this.f26126a;
        if (j8 != 0) {
            abstractC5248t.writeUInt64(1, j8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26126a = 0L;
        this.f26127b = (byte) -1;
    }

    public static b newBuilder(C1 c12) {
        return f26124c.toBuilder().mergeFrom(c12);
    }

    public static C1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C1) f26125d.parseFrom(byteBuffer, m8);
    }

    public static C1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C1) AbstractC5209f0.parseDelimitedWithIOException(f26125d, inputStream, m8);
    }

    public static C1 parseFrom(AbstractC5235o abstractC5235o) {
        return (C1) f26125d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C1 getDefaultInstanceForType() {
        return f26124c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26124c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C1) f26125d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C1() {
        this.f26126a = 0L;
        this.f26127b = (byte) -1;
    }

    public static C1 parseFrom(byte[] bArr) {
        return (C1) f26125d.parseFrom(bArr);
    }

    public static C1 parseFrom(byte[] bArr, M m8) {
        return (C1) f26125d.parseFrom(bArr, m8);
    }

    public static C1 parseFrom(InputStream inputStream) {
        return (C1) AbstractC5209f0.parseWithIOException(f26125d, inputStream);
    }

    public static C1 parseFrom(InputStream inputStream, M m8) {
        return (C1) AbstractC5209f0.parseWithIOException(f26125d, inputStream, m8);
    }

    public static C1 parseFrom(r rVar) {
        return (C1) AbstractC5209f0.parseWithIOException(f26125d, rVar);
    }

    public static C1 parseFrom(r rVar, M m8) {
        return (C1) AbstractC5209f0.parseWithIOException(f26125d, rVar, m8);
    }
}
