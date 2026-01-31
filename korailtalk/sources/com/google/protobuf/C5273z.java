package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5273z extends AbstractC5209f0 implements A {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C5273z f27425c = new C5273z();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f27426d = new a();

    /* renamed from: a, reason: collision with root package name */
    private double f27427a;

    /* renamed from: b, reason: collision with root package name */
    private byte f27428b;

    /* renamed from: com.google.protobuf.z$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5273z parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5273z.newBuilder();
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

    /* renamed from: com.google.protobuf.z$b */
    public static final class b extends AbstractC5209f0.b implements A {

        /* renamed from: a, reason: collision with root package name */
        private int f27429a;

        /* renamed from: b, reason: collision with root package name */
        private double f27430b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(C5273z c5273z) {
            if ((this.f27429a & 1) != 0) {
                c5273z.f27427a = this.f27430b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26281a;
        }

        public b clearValue() {
            this.f27429a &= -2;
            this.f27430b = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26281a;
        }

        @Override // com.google.protobuf.A
        public double getValue() {
            return this.f27430b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26282b.ensureFieldAccessorsInitialized(C5273z.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(double d9) {
            this.f27430b = d9;
            this.f27429a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5273z build() {
            C5273z c5273zBuildPartial = buildPartial();
            if (c5273zBuildPartial.isInitialized()) {
                return c5273zBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5273zBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5273z buildPartial() {
            C5273z c5273z = new C5273z(this, null);
            if (this.f27429a != 0) {
                e(c5273z);
            }
            onBuilt();
            return c5273z;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5273z getDefaultInstanceForType() {
            return C5273z.getDefaultInstance();
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
            this.f27429a = 0;
            this.f27430b = 0.0d;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5273z) {
                return mergeFrom((C5273z) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5273z c5273z) {
            if (c5273z == C5273z.getDefaultInstance()) {
                return this;
            }
            if (c5273z.getValue() != 0.0d) {
                setValue(c5273z.getValue());
            }
            mergeUnknownFields(c5273z.getUnknownFields());
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
                            if (tag != 9) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f27430b = rVar.readDouble();
                                this.f27429a |= 1;
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

    /* synthetic */ C5273z(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5273z getDefaultInstance() {
        return f27425c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26281a;
    }

    public static b newBuilder() {
        return f27425c.toBuilder();
    }

    public static C5273z of(double d9) {
        return newBuilder().setValue(d9).build();
    }

    public static C5273z parseDelimitedFrom(InputStream inputStream) {
        return (C5273z) AbstractC5209f0.parseDelimitedWithIOException(f27426d, inputStream);
    }

    public static C5273z parseFrom(ByteBuffer byteBuffer) {
        return (C5273z) f27426d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f27426d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5273z)) {
            return super.equals(obj);
        }
        C5273z c5273z = (C5273z) obj;
        return Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(c5273z.getValue()) && getUnknownFields().equals(c5273z.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f27426d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeDoubleSize = (Double.doubleToRawLongBits(this.f27427a) != 0 ? AbstractC5248t.computeDoubleSize(1, this.f27427a) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeDoubleSize;
        return iComputeDoubleSize;
    }

    @Override // com.google.protobuf.A
    public double getValue() {
        return this.f27427a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashLong(Double.doubleToLongBits(getValue()))) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26282b.ensureFieldAccessorsInitialized(C5273z.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f27428b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f27428b = (byte) 1;
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
        return new C5273z();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (Double.doubleToRawLongBits(this.f27427a) != 0) {
            abstractC5248t.writeDouble(1, this.f27427a);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5273z(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f27427a = 0.0d;
        this.f27428b = (byte) -1;
    }

    public static b newBuilder(C5273z c5273z) {
        return f27425c.toBuilder().mergeFrom(c5273z);
    }

    public static C5273z parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5273z) f27426d.parseFrom(byteBuffer, m8);
    }

    public static C5273z parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5273z) AbstractC5209f0.parseDelimitedWithIOException(f27426d, inputStream, m8);
    }

    public static C5273z parseFrom(AbstractC5235o abstractC5235o) {
        return (C5273z) f27426d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5273z getDefaultInstanceForType() {
        return f27425c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f27425c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5273z parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5273z) f27426d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C5273z() {
        this.f27427a = 0.0d;
        this.f27428b = (byte) -1;
    }

    public static C5273z parseFrom(byte[] bArr) {
        return (C5273z) f27426d.parseFrom(bArr);
    }

    public static C5273z parseFrom(byte[] bArr, M m8) {
        return (C5273z) f27426d.parseFrom(bArr, m8);
    }

    public static C5273z parseFrom(InputStream inputStream) {
        return (C5273z) AbstractC5209f0.parseWithIOException(f27426d, inputStream);
    }

    public static C5273z parseFrom(InputStream inputStream, M m8) {
        return (C5273z) AbstractC5209f0.parseWithIOException(f27426d, inputStream, m8);
    }

    public static C5273z parseFrom(r rVar) {
        return (C5273z) AbstractC5209f0.parseWithIOException(f27426d, rVar);
    }

    public static C5273z parseFrom(r rVar, M m8) {
        return (C5273z) AbstractC5209f0.parseWithIOException(f27426d, rVar, m8);
    }
}
