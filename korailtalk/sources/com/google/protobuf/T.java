package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class T extends AbstractC5209f0 implements U {
    public static final int PATHS_FIELD_NUMBER = 1;

    /* renamed from: c */
    private static final T f26327c = new T();

    /* renamed from: d */
    private static final Z0 f26328d = new a();

    /* renamed from: a */
    private C5247s0 f26329a;

    /* renamed from: b */
    private byte f26330b;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public T parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = T.newBuilder();
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

    public static final class b extends AbstractC5209f0.b implements U {

        /* renamed from: a */
        private int f26331a;

        /* renamed from: b */
        private C5247s0 f26332b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void e(T t8) {
            if ((this.f26331a & 1) != 0) {
                this.f26332b.makeImmutable();
                t8.f26329a = this.f26332b;
            }
        }

        private void f() {
            if (!this.f26332b.isModifiable()) {
                this.f26332b = new C5247s0((InterfaceC5249t0) this.f26332b);
            }
            this.f26331a |= 1;
        }

        public static final C5269x.b getDescriptor() {
            return V.f26333a;
        }

        public b addAllPaths(Iterable<String> iterable) {
            f();
            AbstractC5196b.a.addAll((Iterable) iterable, (List) this.f26332b);
            this.f26331a |= 1;
            onChanged();
            return this;
        }

        public b addPaths(String str) {
            str.getClass();
            f();
            this.f26332b.add(str);
            this.f26331a |= 1;
            onChanged();
            return this;
        }

        public b addPathsBytes(AbstractC5235o abstractC5235o) {
            abstractC5235o.getClass();
            AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
            f();
            this.f26332b.add(abstractC5235o);
            this.f26331a |= 1;
            onChanged();
            return this;
        }

        public b clearPaths() {
            this.f26332b = C5247s0.emptyList();
            this.f26331a &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return V.f26333a;
        }

        @Override // com.google.protobuf.U
        public String getPaths(int i8) {
            return this.f26332b.get(i8);
        }

        @Override // com.google.protobuf.U
        public AbstractC5235o getPathsBytes(int i8) {
            return this.f26332b.getByteString(i8);
        }

        @Override // com.google.protobuf.U
        public int getPathsCount() {
            return this.f26332b.size();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return V.f26334b.ensureFieldAccessorsInitialized(T.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b setPaths(int i8, String str) {
            str.getClass();
            f();
            this.f26332b.set(i8, str);
            this.f26331a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        @Override // com.google.protobuf.U
        public InterfaceC5207e1 getPathsList() {
            this.f26332b.makeImmutable();
            return this.f26332b;
        }

        private b() {
            this.f26332b = C5247s0.emptyList();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public T build() {
            T tBuildPartial = buildPartial();
            if (tBuildPartial.isInitialized()) {
                return tBuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) tBuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public T buildPartial() {
            T t8 = new T(this, null);
            if (this.f26331a != 0) {
                e(t8);
            }
            onBuilt();
            return t8;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public T getDefaultInstanceForType() {
            return T.getDefaultInstance();
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
            this.f26332b = C5247s0.emptyList();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26331a = 0;
            this.f26332b = C5247s0.emptyList();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof T) {
                return mergeFrom((T) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b mergeFrom(T t8) {
            if (t8 == T.getDefaultInstance()) {
                return this;
            }
            if (!t8.f26329a.isEmpty()) {
                if (this.f26332b.isEmpty()) {
                    this.f26332b = t8.f26329a;
                    this.f26331a |= 1;
                } else {
                    f();
                    this.f26332b.addAll(t8.f26329a);
                }
                onChanged();
            }
            mergeUnknownFields(t8.getUnknownFields());
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
                                String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                f();
                                this.f26332b.add(stringRequireUtf8);
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

    /* synthetic */ T(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static T getDefaultInstance() {
        return f26327c;
    }

    public static final C5269x.b getDescriptor() {
        return V.f26333a;
    }

    public static b newBuilder() {
        return f26327c.toBuilder();
    }

    public static T parseDelimitedFrom(InputStream inputStream) {
        return (T) AbstractC5209f0.parseDelimitedWithIOException(f26328d, inputStream);
    }

    public static T parseFrom(ByteBuffer byteBuffer) {
        return (T) f26328d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26328d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T)) {
            return super.equals(obj);
        }
        T t8 = (T) obj;
        return getPathsList().equals(t8.getPathsList()) && getUnknownFields().equals(t8.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26328d;
    }

    @Override // com.google.protobuf.U
    public String getPaths(int i8) {
        return this.f26329a.get(i8);
    }

    @Override // com.google.protobuf.U
    public AbstractC5235o getPathsBytes(int i8) {
        return this.f26329a.getByteString(i8);
    }

    @Override // com.google.protobuf.U
    public int getPathsCount() {
        return this.f26329a.size();
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i9 = 0; i9 < this.f26329a.size(); i9++) {
            iComputeStringSizeNoTag += AbstractC5209f0.computeStringSizeNoTag(this.f26329a.getRaw(i9));
        }
        int size = iComputeStringSizeNoTag + getPathsList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getPathsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPathsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return V.f26334b.ensureFieldAccessorsInitialized(T.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26330b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26330b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new T();
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: o */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        for (int i8 = 0; i8 < this.f26329a.size(); i8++) {
            AbstractC5209f0.writeString(abstractC5248t, 1, this.f26329a.getRaw(i8));
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private T(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26329a = C5247s0.emptyList();
        this.f26330b = (byte) -1;
    }

    public static b newBuilder(T t8) {
        return f26327c.toBuilder().mergeFrom(t8);
    }

    public static T parseFrom(ByteBuffer byteBuffer, M m8) {
        return (T) f26328d.parseFrom(byteBuffer, m8);
    }

    @Override // com.google.protobuf.U
    public InterfaceC5207e1 getPathsList() {
        return this.f26329a;
    }

    public static T parseDelimitedFrom(InputStream inputStream, M m8) {
        return (T) AbstractC5209f0.parseDelimitedWithIOException(f26328d, inputStream, m8);
    }

    public static T parseFrom(AbstractC5235o abstractC5235o) {
        return (T) f26328d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public T getDefaultInstanceForType() {
        return f26327c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f26327c ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    public static T parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (T) f26328d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    private T() {
        this.f26329a = C5247s0.emptyList();
        this.f26330b = (byte) -1;
        this.f26329a = C5247s0.emptyList();
    }

    public static T parseFrom(byte[] bArr) {
        return (T) f26328d.parseFrom(bArr);
    }

    public static T parseFrom(byte[] bArr, M m8) {
        return (T) f26328d.parseFrom(bArr, m8);
    }

    public static T parseFrom(InputStream inputStream) {
        return (T) AbstractC5209f0.parseWithIOException(f26328d, inputStream);
    }

    public static T parseFrom(InputStream inputStream, M m8) {
        return (T) AbstractC5209f0.parseWithIOException(f26328d, inputStream, m8);
    }

    public static T parseFrom(r rVar) {
        return (T) AbstractC5209f0.parseWithIOException(f26328d, rVar);
    }

    public static T parseFrom(r rVar, M m8) {
        return (T) AbstractC5209f0.parseWithIOException(f26328d, rVar, m8);
    }
}
