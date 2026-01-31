package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.C5269x;
import com.google.protobuf.N1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.v0 */
/* loaded from: classes2.dex */
public final class C5253v0 extends AbstractC5209f0 implements InterfaceC5268w0 {
    public static final int VALUES_FIELD_NUMBER = 1;

    /* renamed from: c */
    private static final C5253v0 f26830c = new C5253v0();

    /* renamed from: d */
    private static final Z0 f26831d = new a();

    /* renamed from: a */
    private List f26832a;

    /* renamed from: b */
    private byte f26833b;

    /* renamed from: com.google.protobuf.v0$a */
    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public C5253v0 parsePartialFrom(r rVar, M m8) throws C5230m0 {
            b bVarNewBuilder = C5253v0.newBuilder();
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

    /* renamed from: com.google.protobuf.v0$b */
    public static final class b extends AbstractC5209f0.b implements InterfaceC5268w0 {

        /* renamed from: a */
        private int f26834a;

        /* renamed from: b */
        private List f26835b;

        /* renamed from: c */
        private C5213g1 f26836c;

        /* synthetic */ b(AbstractC5209f0.c cVar, a aVar) {
            this(cVar);
        }

        private void e(C5253v0 c5253v0) {
        }

        private void f(C5253v0 c5253v0) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 != null) {
                c5253v0.f26832a = c5213g1.build();
                return;
            }
            if ((this.f26834a & 1) != 0) {
                this.f26835b = Collections.unmodifiableList(this.f26835b);
                this.f26834a &= -2;
            }
            c5253v0.f26832a = this.f26835b;
        }

        private void g() {
            if ((this.f26834a & 1) == 0) {
                this.f26835b = new ArrayList(this.f26835b);
                this.f26834a |= 1;
            }
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC5245r1.f26710g;
        }

        private C5213g1 h() {
            if (this.f26836c == null) {
                this.f26836c = new C5213g1(this.f26835b, (this.f26834a & 1) != 0, getParentForChildren(), isClean());
                this.f26835b = null;
            }
            return this.f26836c;
        }

        public b addAllValues(Iterable<? extends N1> iterable) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                g();
                AbstractC5196b.a.addAll((Iterable) iterable, this.f26835b);
                onChanged();
            } else {
                c5213g1.addAllMessages(iterable);
            }
            return this;
        }

        public b addValues(N1 n12) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                n12.getClass();
                g();
                this.f26835b.add(n12);
                onChanged();
            } else {
                c5213g1.addMessage(n12);
            }
            return this;
        }

        public N1.c addValuesBuilder() {
            return (N1.c) h().addBuilder(N1.getDefaultInstance());
        }

        public b clearValues() {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                this.f26835b = Collections.emptyList();
                this.f26834a &= -2;
                onChanged();
            } else {
                c5213g1.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return AbstractC5245r1.f26710g;
        }

        @Override // com.google.protobuf.InterfaceC5268w0
        public N1 getValues(int i8) {
            C5213g1 c5213g1 = this.f26836c;
            return c5213g1 == null ? (N1) this.f26835b.get(i8) : (N1) c5213g1.getMessage(i8);
        }

        public N1.c getValuesBuilder(int i8) {
            return (N1.c) h().getBuilder(i8);
        }

        public List<N1.c> getValuesBuilderList() {
            return h().getBuilderList();
        }

        @Override // com.google.protobuf.InterfaceC5268w0
        public int getValuesCount() {
            C5213g1 c5213g1 = this.f26836c;
            return c5213g1 == null ? this.f26835b.size() : c5213g1.getCount();
        }

        @Override // com.google.protobuf.InterfaceC5268w0
        public List<N1> getValuesList() {
            C5213g1 c5213g1 = this.f26836c;
            return c5213g1 == null ? Collections.unmodifiableList(this.f26835b) : c5213g1.getMessageList();
        }

        @Override // com.google.protobuf.InterfaceC5268w0
        public O1 getValuesOrBuilder(int i8) {
            C5213g1 c5213g1 = this.f26836c;
            return c5213g1 == null ? (O1) this.f26835b.get(i8) : (O1) c5213g1.getMessageOrBuilder(i8);
        }

        @Override // com.google.protobuf.InterfaceC5268w0
        public List<? extends O1> getValuesOrBuilderList() {
            C5213g1 c5213g1 = this.f26836c;
            return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.f26835b);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC5245r1.f26711h.ensureFieldAccessorsInitialized(C5253v0.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            return true;
        }

        public b removeValues(int i8) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                g();
                this.f26835b.remove(i8);
                onChanged();
            } else {
                c5213g1.remove(i8);
            }
            return this;
        }

        public b setValues(int i8, N1 n12) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                n12.getClass();
                g();
                this.f26835b.set(i8, n12);
                onChanged();
            } else {
                c5213g1.setMessage(i8, n12);
            }
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f26835b = Collections.emptyList();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5253v0 build() {
            C5253v0 c5253v0BuildPartial = buildPartial();
            if (c5253v0BuildPartial.isInitialized()) {
                return c5253v0BuildPartial;
            }
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) c5253v0BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public C5253v0 buildPartial() {
            C5253v0 c5253v0 = new C5253v0(this, null);
            f(c5253v0);
            if (this.f26834a != 0) {
                e(c5253v0);
            }
            onBuilt();
            return c5253v0;
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public C5253v0 getDefaultInstanceForType() {
            return C5253v0.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b setUnknownFields(G1 g12) {
            return (b) super.setUnknownFields(g12);
        }

        public N1.c addValuesBuilder(int i8) {
            return (N1.c) h().addBuilder(i8, N1.getDefaultInstance());
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public final b mergeUnknownFields(G1 g12) {
            return (b) super.mergeUnknownFields(g12);
        }

        private b(AbstractC5209f0.c cVar) {
            super(cVar);
            this.f26835b = Collections.emptyList();
        }

        @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public b clear() {
            super.clear();
            this.f26834a = 0;
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                this.f26835b = Collections.emptyList();
            } else {
                this.f26835b = null;
                c5213g1.clear();
            }
            this.f26834a &= -2;
            return this;
        }

        public b addValues(int i8, N1 n12) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                n12.getClass();
                g();
                this.f26835b.add(i8, n12);
                onChanged();
            } else {
                c5213g1.addMessage(i8, n12);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public b mergeFrom(H0 h02) {
            if (h02 instanceof C5253v0) {
                return mergeFrom((C5253v0) h02);
            }
            super.mergeFrom(h02);
            return this;
        }

        public b setValues(int i8, N1.c cVar) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                g();
                this.f26835b.set(i8, cVar.build());
                onChanged();
            } else {
                c5213g1.setMessage(i8, cVar.build());
            }
            return this;
        }

        public b mergeFrom(C5253v0 c5253v0) {
            if (c5253v0 == C5253v0.getDefaultInstance()) {
                return this;
            }
            if (this.f26836c == null) {
                if (!c5253v0.f26832a.isEmpty()) {
                    if (this.f26835b.isEmpty()) {
                        this.f26835b = c5253v0.f26832a;
                        this.f26834a &= -2;
                    } else {
                        g();
                        this.f26835b.addAll(c5253v0.f26832a);
                    }
                    onChanged();
                }
            } else if (!c5253v0.f26832a.isEmpty()) {
                if (!this.f26836c.isEmpty()) {
                    this.f26836c.addAllMessages(c5253v0.f26832a);
                } else {
                    this.f26836c.dispose();
                    this.f26836c = null;
                    this.f26835b = c5253v0.f26832a;
                    this.f26834a &= -2;
                    this.f26836c = AbstractC5209f0.alwaysUseFieldBuilders ? h() : null;
                }
            }
            mergeUnknownFields(c5253v0.getUnknownFields());
            onChanged();
            return this;
        }

        public b addValues(N1.c cVar) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                g();
                this.f26835b.add(cVar.build());
                onChanged();
            } else {
                c5213g1.addMessage(cVar.build());
            }
            return this;
        }

        public b addValues(int i8, N1.c cVar) {
            C5213g1 c5213g1 = this.f26836c;
            if (c5213g1 == null) {
                g();
                this.f26835b.add(i8, cVar.build());
                onChanged();
            } else {
                c5213g1.addMessage(i8, cVar.build());
            }
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
                                N1 n12 = (N1) rVar.readMessage(N1.parser(), m8);
                                C5213g1 c5213g1 = this.f26836c;
                                if (c5213g1 == null) {
                                    g();
                                    this.f26835b.add(n12);
                                } else {
                                    c5213g1.addMessage(n12);
                                }
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

    /* synthetic */ C5253v0(AbstractC5209f0.b bVar, a aVar) {
        this(bVar);
    }

    public static C5253v0 getDefaultInstance() {
        return f26830c;
    }

    public static final C5269x.b getDescriptor() {
        return AbstractC5245r1.f26710g;
    }

    public static b newBuilder() {
        return f26830c.toBuilder();
    }

    public static C5253v0 parseDelimitedFrom(InputStream inputStream) {
        return (C5253v0) AbstractC5209f0.parseDelimitedWithIOException(f26831d, inputStream);
    }

    public static C5253v0 parseFrom(ByteBuffer byteBuffer) {
        return (C5253v0) f26831d.parseFrom(byteBuffer);
    }

    public static Z0 parser() {
        return f26831d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5253v0)) {
            return super.equals(obj);
        }
        C5253v0 c5253v0 = (C5253v0) obj;
        return getValuesList().equals(c5253v0.getValuesList()) && getUnknownFields().equals(c5253v0.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return f26831d;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iComputeMessageSize = 0;
        for (int i9 = 0; i9 < this.f26832a.size(); i9++) {
            iComputeMessageSize += AbstractC5248t.computeMessageSize(1, (K0) this.f26832a.get(i9));
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC5268w0
    public N1 getValues(int i8) {
        return (N1) this.f26832a.get(i8);
    }

    @Override // com.google.protobuf.InterfaceC5268w0
    public int getValuesCount() {
        return this.f26832a.size();
    }

    @Override // com.google.protobuf.InterfaceC5268w0
    public List<N1> getValuesList() {
        return this.f26832a;
    }

    @Override // com.google.protobuf.InterfaceC5268w0
    public O1 getValuesOrBuilder(int i8) {
        return (O1) this.f26832a.get(i8);
    }

    @Override // com.google.protobuf.InterfaceC5268w0
    public List<? extends O1> getValuesOrBuilderList() {
        return this.f26832a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected AbstractC5209f0.g internalGetFieldAccessorTable() {
        return AbstractC5245r1.f26711h.ensureFieldAccessorsInitialized(C5253v0.class, b.class);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        byte b9 = this.f26833b;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        this.f26833b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC5209f0
    protected Object newInstance(AbstractC5209f0.h hVar) {
        return new C5253v0();
    }

    @Override // com.google.protobuf.AbstractC5209f0
    /* renamed from: o */
    public b newBuilderForType(AbstractC5209f0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        for (int i8 = 0; i8 < this.f26832a.size(); i8++) {
            abstractC5248t.writeMessage(1, (K0) this.f26832a.get(i8));
        }
        getUnknownFields().writeTo(abstractC5248t);
    }

    private C5253v0(AbstractC5209f0.b bVar) {
        super(bVar);
        this.f26833b = (byte) -1;
    }

    public static b newBuilder(C5253v0 c5253v0) {
        return f26830c.toBuilder().mergeFrom(c5253v0);
    }

    public static C5253v0 parseFrom(ByteBuffer byteBuffer, M m8) {
        return (C5253v0) f26831d.parseFrom(byteBuffer, m8);
    }

    public static C5253v0 parseDelimitedFrom(InputStream inputStream, M m8) {
        return (C5253v0) AbstractC5209f0.parseDelimitedWithIOException(f26831d, inputStream, m8);
    }

    public static C5253v0 parseFrom(AbstractC5235o abstractC5235o) {
        return (C5253v0) f26831d.parseFrom(abstractC5235o);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5253v0 getDefaultInstanceForType() {
        return f26830c;
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b toBuilder() {
        return this == f26830c ? new b((a) null) : new b((a) null).mergeFrom(this);
    }

    private C5253v0() {
        this.f26833b = (byte) -1;
        this.f26832a = Collections.emptyList();
    }

    public static C5253v0 parseFrom(AbstractC5235o abstractC5235o, M m8) {
        return (C5253v0) f26831d.parseFrom(abstractC5235o, m8);
    }

    @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public b newBuilderForType() {
        return newBuilder();
    }

    public static C5253v0 parseFrom(byte[] bArr) {
        return (C5253v0) f26831d.parseFrom(bArr);
    }

    public static C5253v0 parseFrom(byte[] bArr, M m8) {
        return (C5253v0) f26831d.parseFrom(bArr, m8);
    }

    public static C5253v0 parseFrom(InputStream inputStream) {
        return (C5253v0) AbstractC5209f0.parseWithIOException(f26831d, inputStream);
    }

    public static C5253v0 parseFrom(InputStream inputStream, M m8) {
        return (C5253v0) AbstractC5209f0.parseWithIOException(f26831d, inputStream, m8);
    }

    public static C5253v0 parseFrom(r rVar) {
        return (C5253v0) AbstractC5209f0.parseWithIOException(f26831d, rVar);
    }

    public static C5253v0 parseFrom(r rVar, M m8) {
        return (C5253v0) AbstractC5209f0.parseWithIOException(f26831d, rVar, m8);
    }
}
