package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class B extends AbstractC5209f0 implements C {
    public static final int NANOS_FIELD_NUMBER = 2;
    public static final int SECONDS_FIELD_NUMBER = 1;

    /* renamed from: d */
    private static final B f26099d = new B();

    /* renamed from: e */
    private static final Z0 f26100e = new a();

    /* renamed from: a */
    private long f26101a;

    /* renamed from: b */
    private int f26102b;

    /* renamed from: c */
    private byte f26103c;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public B parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = B.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements C {

        /* renamed from: a */
        private int f26104a;

        /* renamed from: b */
        private long f26105b;

        /* renamed from: c */
        private int f26106c;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(B b9) {
            int i8 = this.f26104a;
            if ((i8 & 1) != 0) {
                b9.f26101a = this.f26105b;
            }
            if ((i8 & 2) != 0) {
                b9.f26102b = this.f26106c;
            }
        }

        public static final C5269x.b getDescriptor() {
            return D.f26130a;
        }

        public b clearNanos() {
            this.f26104a &= -3;
            this.f26106c = 0;
            onChanged();
            return this;
        }

        public b clearSeconds() {
            this.f26104a &= -2;
            this.f26105b = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return D.f26130a;
        }

        @Override // com.google.protobuf.C
        public int getNanos() {
            return this.f26106c;
        }

        @Override // com.google.protobuf.C
        public long getSeconds() {
            return this.f26105b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return D.f26131b.ensureFieldAccessorsInitialized(B.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setNanos(int i8) {
            this.f26106c = i8;
            this.f26104a |= 2;
            onChanged();
            return this;
        }

        public b setSeconds(long j8) {
            this.f26105b = j8;
            this.f26104a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public B build() {
            B bBuildPartial = buildPartial();
            if (bBuildPartial.isInitialized()) {
                return bBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) bBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public B buildPartial() {
            B b9 = new B(this, null);
            if (this.f26104a != 0) {
                e(b9);
            }
            onBuilt();
            return b9;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public B getDefaultInstanceForType() {
            return B.getDefaultInstance();
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
            this.f26104a = 0;
            this.f26105b = 0L;
            this.f26106c = 0;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof B) {
                return mergeFrom((B) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(B b9) {
            if (b9 == B.getDefaultInstance()) {
                return this;
            }
            if (b9.getSeconds() != 0) {
                setSeconds(b9.getSeconds());
            }
            if (b9.getNanos() != 0) {
                setNanos(b9.getNanos());
            }
            mergeUnknownFields(b9.getUnknownFields());
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
                            if (tag == 8) {
                                this.f26105b = rVar.readInt64();
                                this.f26104a |= 1;
                            } else if (tag != 16) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f26106c = rVar.readInt32();
                                this.f26104a |= 2;
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

    /* synthetic */ B(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static B getDefaultInstance() {
        return f26099d;
    }

    public static final C5269x.b getDescriptor() {
        return D.f26130a;
    }

    public static b newBuilder() {
        return f26099d.toBuilder();
    }

    public static B parseDelimitedFrom(InputStream inputStream) {
        return (B) AbstractC5209f0.parseDelimitedWithIOException(f26100e, inputStream);
    }

    public static B parseFrom(ByteBuffer byteBuffer) {
        return (B) f26100e.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26100e;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return super.equals(obj);
        }
        B b9 = (B) obj;
        return getSeconds() == b9.getSeconds() && getNanos() == b9.getNanos() && getUnknownFields().equals(b9.getUnknownFields());
    }

    @Override // com.google.protobuf.C
    public int getNanos() {
        return this.f26102b;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26100e;
    }

    @Override // com.google.protobuf.C
    public long getSeconds() {
        return this.f26101a;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        long j8 = this.f26101a;
        int iComputeInt64Size = j8 != 0 ? AbstractC5248t.computeInt64Size(1, j8) : 0;
        int i9 = this.f26102b;
        if (i9 != 0) {
            iComputeInt64Size += AbstractC5248t.computeInt32Size(2, i9);
        }
        int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashLong(getSeconds())) * 37) + 2) * 53) + getNanos()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return D.f26131b.ensureFieldAccessorsInitialized(B.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26103c;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26103c = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new B();
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: o */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        long j8 = this.f26101a;
        if (j8 != 0) {
            abstractC5248t.writeInt64(1, j8);
        }
        int i8 = this.f26102b;
        if (i8 != 0) {
            abstractC5248t.writeInt32(2, i8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private B(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26101a = 0L;
        this.f26102b = 0;
        this.f26103c = (byte) -1;
    }

    public static b newBuilder(B b9) {
        return f26099d.toBuilder().mergeFrom(b9);
    }

    public static B parseFrom(ByteBuffer byteBuffer, M m8) {
        return (B) f26100e.parseFrom(byteBuffer, m8);
    }

    public static B parseDelimitedFrom(InputStream inputStream, M m8) {
        return (B) AbstractC5209f0.parseDelimitedWithIOException(f26100e, inputStream, m8);
    }

    public static B parseFrom(AbstractC5235o abstractC5235o) {
        return (B) f26100e.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public B getDefaultInstanceForType() {
        return f26099d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f26099d ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    public static B parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (B) f26100e.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static B parseFrom(byte[] bArr) {
        return (B) f26100e.parseFrom(bArr);
    }

    private B() {
        this.f26101a = 0L;
        this.f26102b = 0;
        this.f26103c = (byte) -1;
    }

    public static B parseFrom(byte[] bArr, M m8) {
        return (B) f26100e.parseFrom(bArr, m8);
    }

    public static B parseFrom(InputStream inputStream) {
        return (B) AbstractC5209f0.parseWithIOException(f26100e, inputStream);
    }

    public static B parseFrom(InputStream inputStream, M m8) {
        return (B) AbstractC5209f0.parseWithIOException(f26100e, inputStream, m8);
    }

    public static B parseFrom(r rVar) {
        return (B) AbstractC5209f0.parseWithIOException(f26100e, rVar);
    }

    public static B parseFrom(r rVar, M m8) {
        return (B) AbstractC5209f0.parseWithIOException(f26100e, rVar, m8);
    }
}
