package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Z extends AbstractC5209f0 implements InterfaceC5194a0 {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final Z f26373c = new Z();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26374d = new a();

    /* renamed from: a, reason: collision with root package name */
    private float f26375a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26376b;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public Z parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = Z.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements InterfaceC5194a0 {

        /* renamed from: a, reason: collision with root package name */
        private int f26377a;

        /* renamed from: b, reason: collision with root package name */
        private float f26378b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(Z z8) {
            if ((this.f26377a & 1) != 0) {
                z8.f26375a = this.f26378b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26283c;
        }

        public b clearValue() {
            this.f26377a &= -2;
            this.f26378b = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26283c;
        }

        @Override // com.google.protobuf.InterfaceC5194a0
        public float getValue() {
            return this.f26378b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26284d.ensureFieldAccessorsInitialized(Z.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(float f8) {
            this.f26378b = f8;
            this.f26377a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public Z build() {
            Z zBuildPartial = buildPartial();
            if (zBuildPartial.isInitialized()) {
                return zBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) zBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public Z buildPartial() {
            Z z8 = new Z(this, null);
            if (this.f26377a != 0) {
                e(z8);
            }
            onBuilt();
            return z8;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Z getDefaultInstanceForType() {
            return Z.getDefaultInstance();
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
            this.f26377a = 0;
            this.f26378b = 0.0f;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof Z) {
                return mergeFrom((Z) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(Z z8) {
            if (z8 == Z.getDefaultInstance()) {
                return this;
            }
            if (z8.getValue() != 0.0f) {
                setValue(z8.getValue());
            }
            mergeUnknownFields(z8.getUnknownFields());
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
                            if (tag != 13) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f26378b = rVar.readFloat();
                                this.f26377a |= 1;
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

    /* synthetic */ Z(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static Z getDefaultInstance() {
        return f26373c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26283c;
    }

    public static b newBuilder() {
        return f26373c.toBuilder();
    }

    public static Z of(float f8) {
        return newBuilder().setValue(f8).build();
    }

    public static Z parseDelimitedFrom(InputStream inputStream) {
        return (Z) AbstractC5209f0.parseDelimitedWithIOException(f26374d, inputStream);
    }

    public static Z parseFrom(ByteBuffer byteBuffer) {
        return (Z) f26374d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26374d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return super.equals(obj);
        }
        Z z8 = (Z) obj;
        return Float.floatToIntBits(getValue()) == Float.floatToIntBits(z8.getValue()) && getUnknownFields().equals(z8.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26374d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeFloatSize = (Float.floatToRawIntBits(this.f26375a) != 0 ? AbstractC5248t.computeFloatSize(1, this.f26375a) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeFloatSize;
        return iComputeFloatSize;
    }

    @Override // com.google.protobuf.InterfaceC5194a0
    public float getValue() {
        return this.f26375a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getValue())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26284d.ensureFieldAccessorsInitialized(Z.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26376b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26376b = (byte) 1;
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
        return new Z();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (Float.floatToRawIntBits(this.f26375a) != 0) {
            abstractC5248t.writeFloat(1, this.f26375a);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private Z(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26375a = 0.0f;
        this.f26376b = (byte) -1;
    }

    public static b newBuilder(Z z8) {
        return f26373c.toBuilder().mergeFrom(z8);
    }

    public static Z parseFrom(ByteBuffer byteBuffer, M m8) {
        return (Z) f26374d.parseFrom(byteBuffer, m8);
    }

    public static Z parseDelimitedFrom(InputStream inputStream, M m8) {
        return (Z) AbstractC5209f0.parseDelimitedWithIOException(f26374d, inputStream, m8);
    }

    public static Z parseFrom(AbstractC5235o abstractC5235o) {
        return (Z) f26374d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public Z getDefaultInstanceForType() {
        return f26373c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26373c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static Z parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (Z) f26374d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Z() {
        this.f26375a = 0.0f;
        this.f26376b = (byte) -1;
    }

    public static Z parseFrom(byte[] bArr) {
        return (Z) f26374d.parseFrom(bArr);
    }

    public static Z parseFrom(byte[] bArr, M m8) {
        return (Z) f26374d.parseFrom(bArr, m8);
    }

    public static Z parseFrom(InputStream inputStream) {
        return (Z) AbstractC5209f0.parseWithIOException(f26374d, inputStream);
    }

    public static Z parseFrom(InputStream inputStream, M m8) {
        return (Z) AbstractC5209f0.parseWithIOException(f26374d, inputStream, m8);
    }

    public static Z parseFrom(r rVar) {
        return (Z) AbstractC5209f0.parseWithIOException(f26374d, rVar);
    }

    public static Z parseFrom(r rVar, M m8) {
        return (Z) AbstractC5209f0.parseWithIOException(f26374d, rVar, m8);
    }
}
