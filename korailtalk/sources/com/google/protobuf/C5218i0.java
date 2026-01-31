package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5218i0 extends AbstractC5209f0 implements InterfaceC5221j0 {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C5218i0 f26539c = new C5218i0();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26540d = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f26541a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26542b;

    /* renamed from: com.google.protobuf.i0$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5218i0 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5218i0.newBuilder();
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

    /* renamed from: com.google.protobuf.i0$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5221j0 {

        /* renamed from: a, reason: collision with root package name */
        private int f26543a;

        /* renamed from: b, reason: collision with root package name */
        private long f26544b;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(C5218i0 c5218i0) {
            if ((this.f26543a & 1) != 0) {
                c5218i0.f26541a = this.f26544b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26285e;
        }

        public b clearValue() {
            this.f26543a &= -2;
            this.f26544b = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26285e;
        }

        @Override // com.google.protobuf.InterfaceC5221j0
        public long getValue() {
            return this.f26544b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26286f.ensureFieldAccessorsInitialized(C5218i0.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(long j8) {
            this.f26544b = j8;
            this.f26543a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5218i0 build() {
            C5218i0 c5218i0BuildPartial = buildPartial();
            if (c5218i0BuildPartial.isInitialized()) {
                return c5218i0BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5218i0BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5218i0 buildPartial() {
            C5218i0 c5218i0 = new C5218i0(this, null);
            if (this.f26543a != 0) {
                e(c5218i0);
            }
            onBuilt();
            return c5218i0;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5218i0 getDefaultInstanceForType() {
            return C5218i0.getDefaultInstance();
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
            this.f26543a = 0;
            this.f26544b = 0L;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5218i0) {
                return mergeFrom((C5218i0) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5218i0 c5218i0) {
            if (c5218i0 == C5218i0.getDefaultInstance()) {
                return this;
            }
            if (c5218i0.getValue() != 0) {
                setValue(c5218i0.getValue());
            }
            mergeUnknownFields(c5218i0.getUnknownFields());
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
                                this.f26544b = rVar.readInt64();
                                this.f26543a |= 1;
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

    /* synthetic */ C5218i0(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5218i0 getDefaultInstance() {
        return f26539c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26285e;
    }

    public static b newBuilder() {
        return f26539c.toBuilder();
    }

    public static C5218i0 of(long j8) {
        return newBuilder().setValue(j8).build();
    }

    public static C5218i0 parseDelimitedFrom(InputStream inputStream) {
        return (C5218i0) AbstractC5209f0.parseDelimitedWithIOException(f26540d, inputStream);
    }

    public static C5218i0 parseFrom(ByteBuffer byteBuffer) {
        return (C5218i0) f26540d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26540d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5218i0)) {
            return super.equals(obj);
        }
        C5218i0 c5218i0 = (C5218i0) obj;
        return getValue() == c5218i0.getValue() && getUnknownFields().equals(c5218i0.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26540d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        long j8 = this.f26541a;
        int iComputeInt64Size = (j8 != 0 ? AbstractC5248t.computeInt64Size(1, j8) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeInt64Size;
        return iComputeInt64Size;
    }

    @Override // com.google.protobuf.InterfaceC5221j0
    public long getValue() {
        return this.f26541a;
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
        return Q1.f26286f.ensureFieldAccessorsInitialized(C5218i0.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26542b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26542b = (byte) 1;
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
        return new C5218i0();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        long j8 = this.f26541a;
        if (j8 != 0) {
            abstractC5248t.writeInt64(1, j8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5218i0(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26541a = 0L;
        this.f26542b = (byte) -1;
    }

    public static b newBuilder(C5218i0 c5218i0) {
        return f26539c.toBuilder().mergeFrom(c5218i0);
    }

    public static C5218i0 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5218i0) f26540d.parseFrom(byteBuffer, m8);
    }

    public static C5218i0 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5218i0) AbstractC5209f0.parseDelimitedWithIOException(f26540d, inputStream, m8);
    }

    public static C5218i0 parseFrom(AbstractC5235o abstractC5235o) {
        return (C5218i0) f26540d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5218i0 getDefaultInstanceForType() {
        return f26539c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26539c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5218i0 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5218i0) f26540d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C5218i0() {
        this.f26541a = 0L;
        this.f26542b = (byte) -1;
    }

    public static C5218i0 parseFrom(byte[] bArr) {
        return (C5218i0) f26540d.parseFrom(bArr);
    }

    public static C5218i0 parseFrom(byte[] bArr, M m8) {
        return (C5218i0) f26540d.parseFrom(bArr, m8);
    }

    public static C5218i0 parseFrom(InputStream inputStream) {
        return (C5218i0) AbstractC5209f0.parseWithIOException(f26540d, inputStream);
    }

    public static C5218i0 parseFrom(InputStream inputStream, M m8) {
        return (C5218i0) AbstractC5209f0.parseWithIOException(f26540d, inputStream, m8);
    }

    public static C5218i0 parseFrom(r rVar) {
        return (C5218i0) AbstractC5209f0.parseWithIOException(f26540d, rVar);
    }

    public static C5218i0 parseFrom(r rVar, M m8) {
        return (C5218i0) AbstractC5209f0.parseWithIOException(f26540d, rVar, m8);
    }
}
