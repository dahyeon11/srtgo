package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5208f extends AbstractC5209f0 implements InterfaceC5211g {
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final C5208f f26424e = new C5208f();

    /* renamed from: f, reason: collision with root package name */
    private static final Z0 f26425f = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile H0 f26426a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f26427b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5235o f26428c;

    /* renamed from: d, reason: collision with root package name */
    private byte f26429d;

    /* renamed from: com.google.protobuf.f$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5208f parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5208f.newBuilder();
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

    /* renamed from: com.google.protobuf.f$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5211g {

        /* renamed from: a, reason: collision with root package name */
        private int f26430a;

        /* renamed from: b, reason: collision with root package name */
        private Object f26431b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5235o f26432c;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(C5208f c5208f) {
            int i8 = this.f26430a;
            if ((i8 & 1) != 0) {
                c5208f.f26427b = this.f26431b;
            }
            if ((i8 & 2) != 0) {
                c5208f.f26428c = this.f26432c;
            }
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC5214h.f26517a;
        }

        public b clearTypeUrl() {
            this.f26431b = C5208f.getDefaultInstance().getTypeUrl();
            this.f26430a &= -2;
            onChanged();
            return this;
        }

        public b clearValue() {
            this.f26430a &= -3;
            this.f26432c = C5208f.getDefaultInstance().getValue();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return AbstractC5214h.f26517a;
        }

        @Override // com.google.protobuf.InterfaceC5211g
        public String getTypeUrl() {
            Object obj = this.f26431b;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.f26431b = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC5211g
        public AbstractC5235o getTypeUrlBytes() {
            Object obj = this.f26431b;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.f26431b = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC5211g
        public AbstractC5235o getValue() {
            return this.f26432c;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC5214h.f26518b.ensureFieldAccessorsInitialized(C5208f.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setTypeUrl(String str) {
            str.getClass();
            this.f26431b = str;
            this.f26430a |= 1;
            onChanged();
            return this;
        }

        public b setTypeUrlBytes(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
            this.f26431b = abstractC5235o;
            this.f26430a |= 1;
            onChanged();
            return this;
        }

        public b setValue(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            this.f26432c = abstractC5235o;
            this.f26430a |= 2;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f26431b = "";
            this.f26432c = AbstractC5235o.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5208f build() {
            C5208f c5208fBuildPartial = buildPartial();
            if (c5208fBuildPartial.isInitialized()) {
                return c5208fBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5208fBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5208f buildPartial() {
            C5208f c5208f = new C5208f(this, null);
            if (this.f26430a != 0) {
                e(c5208f);
            }
            onBuilt();
            return c5208f;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5208f getDefaultInstanceForType() {
            return C5208f.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b setUnknownFields(G1 g12) {
            return (b) super.setUnknownFields(g12);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b mergeUnknownFields(G1 g12) {
            return (b) super.mergeUnknownFields(g12);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26430a = 0;
            this.f26431b = "";
            this.f26432c = AbstractC5235o.EMPTY;
            return this;
        }

        private b(AbstractC5209f0.c cVar) {
            super(cVar);
            this.f26431b = "";
            this.f26432c = AbstractC5235o.EMPTY;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5208f) {
                return mergeFrom((C5208f) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(C5208f c5208f) {
            if (c5208f == C5208f.getDefaultInstance()) {
                return this;
            }
            if (!c5208f.getTypeUrl().isEmpty()) {
                this.f26431b = c5208f.f26427b;
                this.f26430a |= 1;
                onChanged();
            }
            if (c5208f.getValue() != AbstractC5235o.EMPTY) {
                setValue(c5208f.getValue());
            }
            mergeUnknownFields(c5208f.getUnknownFields());
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
                            if (tag == 10) {
                                this.f26431b = rVar.readStringRequireUtf8();
                                this.f26430a |= 1;
                            } else if (tag != 18) {
                                if (!super.parseUnknownField(rVar, m8, tag)) {
                                }
                            } else {
                                this.f26432c = rVar.readBytes();
                                this.f26430a |= 2;
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

    /* synthetic */ C5208f(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5208f getDefaultInstance() {
        return f26424e;
    }

    public static final C5269x.b getDescriptor() {
        return AbstractC5214h.f26517a;
    }

    public static b newBuilder() {
        return f26424e.toBuilder();
    }

    private static String p(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    public static <T extends H0> C5208f pack(T t8) {
        return newBuilder().setTypeUrl(q("type.googleapis.com", t8.getDescriptorForType())).setValue(t8.toByteString()).build();
    }

    public static C5208f parseDelimitedFrom(InputStream inputStream) {
        return (C5208f) AbstractC5209f0.parseDelimitedWithIOException(f26425f, inputStream);
    }

    public static C5208f parseFrom(ByteBuffer byteBuffer) {
        return (C5208f) f26425f.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26425f;
    }

    private static String q(String str, C5269x.b bVar) {
        if (str.endsWith("/")) {
            return str + bVar.getFullName();
        }
        return str + "/" + bVar.getFullName();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5208f)) {
            return super.equals(obj);
        }
        C5208f c5208f = (C5208f) obj;
        return getTypeUrl().equals(c5208f.getTypeUrl()) && getValue().equals(c5208f.getValue()) && getUnknownFields().equals(c5208f.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26425f;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.f26427b) ? AbstractC5209f0.computeStringSize(1, this.f26427b) : 0;
        if (!this.f26428c.isEmpty()) {
            iComputeStringSize += AbstractC5248t.computeBytesSize(2, this.f26428c);
        }
        int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC5211g
    public String getTypeUrl() {
        Object obj = this.f26427b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
        this.f26427b = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC5211g
    public AbstractC5235o getTypeUrlBytes() {
        Object obj = this.f26427b;
        if (!(obj instanceof String)) {
            return (AbstractC5235o) obj;
        }
        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
        this.f26427b = abstractC5235oCopyFromUtf8;
        return abstractC5235oCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC5211g
    public AbstractC5235o getValue() {
        return this.f26428c;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTypeUrl().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return AbstractC5214h.f26518b.ensureFieldAccessorsInitialized(C5208f.class, b.class);
    }

    public <T extends H0> boolean is(Class<T> cls) {
        return p(getTypeUrl()).equals(((H0) AbstractC5227l0.getDefaultInstance(cls)).getDescriptorForType().getFullName());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26429d;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26429d = (byte) 1;
        return true;
    }

    public boolean isSameTypeAs(H0 h02) {
        return p(getTypeUrl()).equals(h02.getDescriptorForType().getFullName());
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new C5208f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    public <T extends H0> T unpack(Class<T> cls) throws C5230m0 {
        if (this.f26426a != null) {
            if (this.f26426a.getClass() == cls) {
                return (T) this.f26426a;
            }
        } else if (is(cls)) {
            T t8 = (T) ((H0) AbstractC5227l0.getDefaultInstance(cls)).getParserForType().parseFrom(getValue());
            this.f26426a = t8;
            return t8;
        }
        throw new C5230m0("Type of the Any message does not match the given class.");
    }

    public <T extends H0> T unpackSameTypeAs(T t8) throws C5230m0 {
        if (this.f26426a != null) {
            if (this.f26426a.getClass() == t8.getClass()) {
                return (T) this.f26426a;
            }
        } else if (isSameTypeAs(t8)) {
            T t9 = (T) t8.getParserForType().parseFrom(getValue());
            this.f26426a = t9;
            return t9;
        }
        throw new C5230m0("Type of the Any message does not match the given exemplar.");
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (!AbstractC5209f0.isStringEmpty(this.f26427b)) {
            AbstractC5209f0.writeString(abstractC5248t, 1, this.f26427b);
        }
        if (!this.f26428c.isEmpty()) {
            abstractC5248t.writeBytes(2, this.f26428c);
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5208f(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26427b = "";
        this.f26428c = AbstractC5235o.EMPTY;
        this.f26429d = (byte) -1;
    }

    public static b newBuilder(C5208f c5208f) {
        return f26424e.toBuilder().mergeFrom(c5208f);
    }

    public static C5208f parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5208f) f26425f.parseFrom(byteBuffer, m8);
    }

    public static C5208f parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5208f) AbstractC5209f0.parseDelimitedWithIOException(f26425f, inputStream, m8);
    }

    public static C5208f parseFrom(AbstractC5235o abstractC5235o) {
        return (C5208f) f26425f.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5208f getDefaultInstanceForType() {
        return f26424e;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        a aVar = null;
        return this == f26424e ? new b(aVar) : new b(aVar).mergeFrom(this);
    }

    public static C5208f parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5208f) f26425f.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static C5208f parseFrom(byte[] bArr) {
        return (C5208f) f26425f.parseFrom(bArr);
    }

    private C5208f() {
        this.f26427b = "";
        AbstractC5235o abstractC5235o = AbstractC5235o.EMPTY;
        this.f26428c = abstractC5235o;
        this.f26429d = (byte) -1;
        this.f26427b = "";
        this.f26428c = abstractC5235o;
    }

    public static <T extends H0> C5208f pack(T t8, String str) {
        return newBuilder().setTypeUrl(q(str, t8.getDescriptorForType())).setValue(t8.toByteString()).build();
    }

    public static C5208f parseFrom(byte[] bArr, M m8) {
        return (C5208f) f26425f.parseFrom(bArr, m8);
    }

    public static C5208f parseFrom(InputStream inputStream) {
        return (C5208f) AbstractC5209f0.parseWithIOException(f26425f, inputStream);
    }

    public static C5208f parseFrom(InputStream inputStream, M m8) {
        return (C5208f) AbstractC5209f0.parseWithIOException(f26425f, inputStream, m8);
    }

    public static C5208f parseFrom(r rVar) {
        return (C5208f) AbstractC5209f0.parseWithIOException(f26425f, rVar);
    }

    public static C5208f parseFrom(r rVar, M m8) {
        return (C5208f) AbstractC5209f0.parseWithIOException(f26425f, rVar, m8);
    }
}
