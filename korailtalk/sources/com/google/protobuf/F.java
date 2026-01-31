package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class F extends AbstractC5209f0 implements G {

    /* renamed from: b */
    private static final F f26145b = new F();

    /* renamed from: c */
    private static final Z0 f26146c = new a();

    /* renamed from: a */
    private byte f26147a;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public F parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = F.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements G {
        /* synthetic */ b(a aVar) {
            this();
        }

        public static final C5269x.b getDescriptor() {
            return H.f26161a;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return H.f26161a;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return H.f26162b.ensureFieldAccessorsInitialized(F.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public F build() {
            F fBuildPartial = buildPartial();
            if (fBuildPartial.isInitialized()) {
                return fBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) fBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public F buildPartial() {
            F f8 = new F(this, null);
            onBuilt();
            return f8;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public F getDefaultInstanceForType() {
            return F.getDefaultInstance();
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
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof F) {
                return mergeFrom((F) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(F f8) {
            if (f8 == F.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(f8.getUnknownFields());
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
                        if (tag == 0 || !super.parseUnknownField(rVar, m8, tag)) {
                            z8 = true;
                        }
                    } catch (C5230m0 e8) {
                        throw e8.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }
    }

    /* synthetic */ F(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static F getDefaultInstance() {
        return f26145b;
    }

    public static final C5269x.b getDescriptor() {
        return H.f26161a;
    }

    public static b newBuilder() {
        return f26145b.toBuilder();
    }

    public static F parseDelimitedFrom(InputStream inputStream) {
        return (F) AbstractC5209f0.parseDelimitedWithIOException(f26146c, inputStream);
    }

    public static F parseFrom(ByteBuffer byteBuffer) {
        return (F) f26146c.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26146c;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof F) ? super.equals(obj) : getUnknownFields().equals(((F) obj).getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26146c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return H.f26162b.ensureFieldAccessorsInitialized(F.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26147a;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26147a = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: m */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new F();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        getUnknownFields().writeTo(abstractC5248t);
    }

    private F(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26147a = (byte) -1;
    }

    public static b newBuilder(F f8) {
        return f26145b.toBuilder().mergeFrom(f8);
    }

    public static F parseFrom(ByteBuffer byteBuffer, M m8) {
        return (F) f26146c.parseFrom(byteBuffer, m8);
    }

    public static F parseDelimitedFrom(InputStream inputStream, M m8) {
        return (F) AbstractC5209f0.parseDelimitedWithIOException(f26146c, inputStream, m8);
    }

    public static F parseFrom(AbstractC5235o abstractC5235o) {
        return (F) f26146c.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public F getDefaultInstanceForType() {
        return f26145b;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f26145b ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    private F() {
        this.f26147a = (byte) -1;
    }

    public static F parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (F) f26146c.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static F parseFrom(byte[] bArr) {
        return (F) f26146c.parseFrom(bArr);
    }

    public static F parseFrom(byte[] bArr, M m8) {
        return (F) f26146c.parseFrom(bArr, m8);
    }

    public static F parseFrom(InputStream inputStream) {
        return (F) AbstractC5209f0.parseWithIOException(f26146c, inputStream);
    }

    public static F parseFrom(InputStream inputStream, M m8) {
        return (F) AbstractC5209f0.parseWithIOException(f26146c, inputStream, m8);
    }

    public static F parseFrom(r rVar) {
        return (F) AbstractC5209f0.parseWithIOException(f26146c, rVar);
    }

    public static F parseFrom(r rVar, M m8) {
        return (F) AbstractC5209f0.parseWithIOException(f26146c, rVar, m8);
    }
}
