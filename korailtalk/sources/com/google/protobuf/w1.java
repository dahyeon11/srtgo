package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class w1 extends AbstractC5209f0 implements x1 {
    public static final int NANOS_FIELD_NUMBER = 2;
    public static final int SECONDS_FIELD_NUMBER = 1;

    /* renamed from: d */
    private static final w1 f27306d = new w1();

    /* renamed from: e */
    private static final Z0 f27307e = new a();

    /* renamed from: a */
    private long f27308a;

    /* renamed from: b */
    private int f27309b;

    /* renamed from: c */
    private byte f27310c;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public w1 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = w1.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements x1 {

        /* renamed from: a */
        private int f27311a;

        /* renamed from: b */
        private long f27312b;

        /* renamed from: c */
        private int f27313c;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(w1 w1Var) {
            int i8 = this.f27311a;
            if ((i8 & 1) != 0) {
                w1Var.f27308a = this.f27312b;
            }
            if ((i8 & 2) != 0) {
                w1Var.f27309b = this.f27313c;
            }
        }

        public static final C5269x.b getDescriptor() {
            return y1.f27422a;
        }

        public b clearNanos() {
            this.f27311a &= -3;
            this.f27313c = 0;
            onChanged();
            return this;
        }

        public b clearSeconds() {
            this.f27311a &= -2;
            this.f27312b = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return y1.f27422a;
        }

        @Override // com.google.protobuf.x1
        public int getNanos() {
            return this.f27313c;
        }

        @Override // com.google.protobuf.x1
        public long getSeconds() {
            return this.f27312b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return y1.f27423b.ensureFieldAccessorsInitialized(w1.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setNanos(int i8) {
            this.f27313c = i8;
            this.f27311a |= 2;
            onChanged();
            return this;
        }

        public b setSeconds(long j8) {
            this.f27312b = j8;
            this.f27311a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public w1 build() {
            w1 w1VarBuildPartial = buildPartial();
            if (w1VarBuildPartial.isInitialized()) {
                return w1VarBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) w1VarBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public w1 buildPartial() {
            w1 w1Var = new w1(this, null);
            if (this.f27311a != 0) {
                e(w1Var);
            }
            onBuilt();
            return w1Var;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public w1 getDefaultInstanceForType() {
            return w1.getDefaultInstance();
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
            this.f27311a = 0;
            this.f27312b = 0L;
            this.f27313c = 0;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof w1) {
                return mergeFrom((w1) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(w1 w1Var) {
            if (w1Var == w1.getDefaultInstance()) {
                return this;
            }
            if (w1Var.getSeconds() != 0) {
                setSeconds(w1Var.getSeconds());
            }
            if (w1Var.getNanos() != 0) {
                setNanos(w1Var.getNanos());
            }
            mergeUnknownFields(w1Var.getUnknownFields());
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
                                this.f27312b = rVar.readInt64();
                                this.f27311a |= 1;
                            } else if (tag != 16) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f27313c = rVar.readInt32();
                                this.f27311a |= 2;
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

    /* synthetic */ w1(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static w1 getDefaultInstance() {
        return f27306d;
    }

    public static final C5269x.b getDescriptor() {
        return y1.f27422a;
    }

    public static b newBuilder() {
        return f27306d.toBuilder();
    }

    public static w1 parseDelimitedFrom(InputStream inputStream) {
        return (w1) AbstractC5209f0.parseDelimitedWithIOException(f27307e, inputStream);
    }

    public static w1 parseFrom(ByteBuffer byteBuffer) {
        return (w1) f27307e.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f27307e;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return super.equals(obj);
        }
        w1 w1Var = (w1) obj;
        return getSeconds() == w1Var.getSeconds() && getNanos() == w1Var.getNanos() && getUnknownFields().equals(w1Var.getUnknownFields());
    }

    @Override // com.google.protobuf.x1
    public int getNanos() {
        return this.f27309b;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f27307e;
    }

    @Override // com.google.protobuf.x1
    public long getSeconds() {
        return this.f27308a;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        long j8 = this.f27308a;
        int iComputeInt64Size = j8 != 0 ? AbstractC5248t.computeInt64Size(1, j8) : 0;
        int i9 = this.f27309b;
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
        return y1.f27423b.ensureFieldAccessorsInitialized(w1.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f27310c;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f27310c = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new w1();
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: o */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        long j8 = this.f27308a;
        if (j8 != 0) {
            abstractC5248t.writeInt64(1, j8);
        }
        int i8 = this.f27309b;
        if (i8 != 0) {
            abstractC5248t.writeInt32(2, i8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private w1(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f27308a = 0L;
        this.f27309b = 0;
        this.f27310c = (byte) -1;
    }

    public static b newBuilder(w1 w1Var) {
        return f27306d.toBuilder().mergeFrom(w1Var);
    }

    public static w1 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (w1) f27307e.parseFrom(byteBuffer, m8);
    }

    public static w1 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (w1) AbstractC5209f0.parseDelimitedWithIOException(f27307e, inputStream, m8);
    }

    public static w1 parseFrom(AbstractC5235o abstractC5235o) {
        return (w1) f27307e.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public w1 getDefaultInstanceForType() {
        return f27306d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f27306d ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    public static w1 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (w1) f27307e.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static w1 parseFrom(byte[] bArr) {
        return (w1) f27307e.parseFrom(bArr);
    }

    private w1() {
        this.f27308a = 0L;
        this.f27309b = 0;
        this.f27310c = (byte) -1;
    }

    public static w1 parseFrom(byte[] bArr, M m8) {
        return (w1) f27307e.parseFrom(bArr, m8);
    }

    public static w1 parseFrom(InputStream inputStream) {
        return (w1) AbstractC5209f0.parseWithIOException(f27307e, inputStream);
    }

    public static w1 parseFrom(InputStream inputStream, M m8) {
        return (w1) AbstractC5209f0.parseWithIOException(f27307e, inputStream, m8);
    }

    public static w1 parseFrom(r rVar) {
        return (w1) AbstractC5209f0.parseWithIOException(f27307e, rVar);
    }

    public static w1 parseFrom(r rVar, M m8) {
        return (w1) AbstractC5209f0.parseWithIOException(f27307e, rVar, m8);
    }
}
