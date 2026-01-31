package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5223k extends AbstractC5209f0 implements InterfaceC5226l {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C5223k f26553c = new C5223k();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26554d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f26555a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26556b;

    /* renamed from: com.google.protobuf.k$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5223k parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5223k.newBuilder();
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

    /* renamed from: com.google.protobuf.k$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5226l {

        /* renamed from: a, reason: collision with root package name */
        private int f26557a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26558b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(C5223k c5223k) {
            if ((this.f26557a & 1) != 0) {
                c5223k.f26555a = this.f26558b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26293m;
        }

        public b clearValue() {
            this.f26557a &= -2;
            this.f26558b = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26293m;
        }

        @Override // com.google.protobuf.InterfaceC5226l
        public boolean getValue() {
            return this.f26558b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26294n.ensureFieldAccessorsInitialized(C5223k.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(boolean z8) {
            this.f26558b = z8;
            this.f26557a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5223k build() {
            C5223k c5223kBuildPartial = buildPartial();
            if (c5223kBuildPartial.isInitialized()) {
                return c5223kBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5223kBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5223k buildPartial() {
            C5223k c5223k = new C5223k(this, null);
            if (this.f26557a != 0) {
                e(c5223k);
            }
            onBuilt();
            return c5223k;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5223k getDefaultInstanceForType() {
            return C5223k.getDefaultInstance();
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
            this.f26557a = 0;
            this.f26558b = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5223k) {
                return mergeFrom((C5223k) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5223k c5223k) {
            if (c5223k == C5223k.getDefaultInstance()) {
                return this;
            }
            if (c5223k.getValue()) {
                setValue(c5223k.getValue());
            }
            mergeUnknownFields(c5223k.getUnknownFields());
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
                                this.f26558b = rVar.readBool();
                                this.f26557a |= 1;
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

    /* synthetic */ C5223k(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5223k getDefaultInstance() {
        return f26553c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26293m;
    }

    public static b newBuilder() {
        return f26553c.toBuilder();
    }

    public static C5223k of(boolean z8) {
        return newBuilder().setValue(z8).build();
    }

    public static C5223k parseDelimitedFrom(InputStream inputStream) {
        return (C5223k) AbstractC5209f0.parseDelimitedWithIOException(f26554d, inputStream);
    }

    public static C5223k parseFrom(ByteBuffer byteBuffer) {
        return (C5223k) f26554d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26554d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5223k)) {
            return super.equals(obj);
        }
        C5223k c5223k = (C5223k) obj;
        return getValue() == c5223k.getValue() && getUnknownFields().equals(c5223k.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26554d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        boolean z8 = this.f26555a;
        int iComputeBoolSize = (z8 ? AbstractC5248t.computeBoolSize(1, z8) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeBoolSize;
        return iComputeBoolSize;
    }

    @Override // com.google.protobuf.InterfaceC5226l
    public boolean getValue() {
        return this.f26555a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashBoolean(getValue())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return Q1.f26294n.ensureFieldAccessorsInitialized(C5223k.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26556b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26556b = (byte) 1;
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
        return new C5223k();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        boolean z8 = this.f26555a;
        if (z8) {
            abstractC5248t.writeBool(1, z8);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5223k(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26555a = false;
        this.f26556b = (byte) -1;
    }

    public static b newBuilder(C5223k c5223k) {
        return f26553c.toBuilder().mergeFrom(c5223k);
    }

    public static C5223k parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5223k) f26554d.parseFrom(byteBuffer, m8);
    }

    public static C5223k parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5223k) AbstractC5209f0.parseDelimitedWithIOException(f26554d, inputStream, m8);
    }

    public static C5223k parseFrom(AbstractC5235o abstractC5235o) {
        return (C5223k) f26554d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5223k getDefaultInstanceForType() {
        return f26553c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26553c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5223k parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5223k) f26554d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C5223k() {
        this.f26555a = false;
        this.f26556b = (byte) -1;
    }

    public static C5223k parseFrom(byte[] bArr) {
        return (C5223k) f26554d.parseFrom(bArr);
    }

    public static C5223k parseFrom(byte[] bArr, M m8) {
        return (C5223k) f26554d.parseFrom(bArr, m8);
    }

    public static C5223k parseFrom(InputStream inputStream) {
        return (C5223k) AbstractC5209f0.parseWithIOException(f26554d, inputStream);
    }

    public static C5223k parseFrom(InputStream inputStream, M m8) {
        return (C5223k) AbstractC5209f0.parseWithIOException(f26554d, inputStream, m8);
    }

    public static C5223k parseFrom(r rVar) {
        return (C5223k) AbstractC5209f0.parseWithIOException(f26554d, rVar);
    }

    public static C5223k parseFrom(r rVar, M m8) {
        return (C5223k) AbstractC5209f0.parseWithIOException(f26554d, rVar, m8);
    }
}
