package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5238p extends AbstractC5209f0 implements InterfaceC5241q {
    public static final int VALUE_FIELD_NUMBER = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final C5238p f26631c = new C5238p();

    /* renamed from: d, reason: collision with root package name */
    private static final Z0 f26632d = new a();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5235o f26633a;

    /* renamed from: b, reason: collision with root package name */
    private byte f26634b;

    /* renamed from: com.google.protobuf.p$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5238p parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5238p.newBuilder();
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

    /* renamed from: com.google.protobuf.p$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5241q {

        /* renamed from: a, reason: collision with root package name */
        private int f26635a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5235o f26636b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(C5238p c5238p) {
            if ((this.f26635a & 1) != 0) {
                c5238p.f26633a = this.f26636b;
            }
        }

        public static final C5269x.b getDescriptor() {
            return Q1.f26297q;
        }

        public b clearValue() {
            this.f26635a &= -2;
            this.f26636b = C5238p.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return Q1.f26297q;
        }

        @Override // com.google.protobuf.InterfaceC5241q
        public AbstractC5235o getValue() {
            return this.f26636b;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Q1.f26298r.ensureFieldAccessorsInitialized(C5238p.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setValue(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            this.f26636b = abstractC5235o;
            this.f26635a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f26636b = AbstractC5235o.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5238p build() {
            C5238p c5238pBuildPartial = buildPartial();
            if (c5238pBuildPartial.isInitialized()) {
                return c5238pBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5238pBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5238p buildPartial() {
            C5238p c5238p = new C5238p(this, null);
            if (this.f26635a != 0) {
                e(c5238p);
            }
            onBuilt();
            return c5238p;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5238p getDefaultInstanceForType() {
            return C5238p.getDefaultInstance();
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
            this.f26636b = AbstractC5235o.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26635a = 0;
            this.f26636b = AbstractC5235o.EMPTY;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5238p) {
                return mergeFrom((C5238p) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5238p c5238p) {
            if (c5238p == C5238p.getDefaultInstance()) {
                return this;
            }
            if (c5238p.getValue() != AbstractC5235o.EMPTY) {
                setValue(c5238p.getValue());
            }
            mergeUnknownFields(c5238p.getUnknownFields());
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
                                this.f26636b = rVar.readBytes();
                                this.f26635a |= 1;
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

    /* synthetic */ C5238p(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5238p getDefaultInstance() {
        return f26631c;
    }

    public static final C5269x.b getDescriptor() {
        return Q1.f26297q;
    }

    public static b newBuilder() {
        return f26631c.toBuilder();
    }

    public static C5238p of(AbstractC5235o abstractC5235o) {
        return newBuilder().setValue(abstractC5235o).build();
    }

    public static C5238p parseDelimitedFrom(InputStream inputStream) {
        return (C5238p) AbstractC5209f0.parseDelimitedWithIOException(f26632d, inputStream);
    }

    public static C5238p parseFrom(ByteBuffer byteBuffer) {
        return (C5238p) f26632d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26632d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5238p)) {
            return super.equals(obj);
        }
        C5238p c5238p = (C5238p) obj;
        return getValue().equals(c5238p.getValue()) && getUnknownFields().equals(c5238p.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26632d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeBytesSize = (!this.f26633a.isEmpty() ? AbstractC5248t.computeBytesSize(1, this.f26633a) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeBytesSize;
        return iComputeBytesSize;
    }

    @Override // com.google.protobuf.InterfaceC5241q
    public AbstractC5235o getValue() {
        return this.f26633a;
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
        return Q1.f26298r.ensureFieldAccessorsInitialized(C5238p.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26634b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26634b = (byte) 1;
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
        return new C5238p();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (!this.f26633a.isEmpty()) {
            abstractC5248t.writeBytes(1, this.f26633a);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5238p(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26633a = AbstractC5235o.EMPTY;
        this.f26634b = (byte) -1;
    }

    public static b newBuilder(C5238p c5238p) {
        return f26631c.toBuilder().mergeFrom(c5238p);
    }

    public static C5238p parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5238p) f26632d.parseFrom(byteBuffer, m8);
    }

    public static C5238p parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5238p) AbstractC5209f0.parseDelimitedWithIOException(f26632d, inputStream, m8);
    }

    public static C5238p parseFrom(AbstractC5235o abstractC5235o) {
        return (C5238p) f26632d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5238p getDefaultInstanceForType() {
        return f26631c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26631c ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5238p parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5238p) f26632d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private C5238p() {
        AbstractC5235o abstractC5235o = AbstractC5235o.EMPTY;
        this.f26634b = (byte) -1;
        this.f26633a = abstractC5235o;
    }

    public static C5238p parseFrom(byte[] bArr) {
        return (C5238p) f26632d.parseFrom(bArr);
    }

    public static C5238p parseFrom(byte[] bArr, M m8) {
        return (C5238p) f26632d.parseFrom(bArr, m8);
    }

    public static C5238p parseFrom(InputStream inputStream) {
        return (C5238p) AbstractC5209f0.parseWithIOException(f26632d, inputStream);
    }

    public static C5238p parseFrom(InputStream inputStream, M m8) {
        return (C5238p) AbstractC5209f0.parseWithIOException(f26632d, inputStream, m8);
    }

    public static C5238p parseFrom(r rVar) {
        return (C5238p) AbstractC5209f0.parseWithIOException(f26632d, rVar);
    }

    public static C5238p parseFrom(r rVar, M m8) {
        return (C5238p) AbstractC5209f0.parseWithIOException(f26632d, rVar, m8);
    }
}
