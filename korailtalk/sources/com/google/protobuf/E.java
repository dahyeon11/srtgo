package com.google.protobuf;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.C5269x;
import com.google.protobuf.H0;
import com.google.protobuf.W;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E extends AbstractC5193a {

    /* renamed from: a, reason: collision with root package name */
    private final C5269x.b f26133a;

    /* renamed from: b, reason: collision with root package name */
    private final W f26134b;

    /* renamed from: c, reason: collision with root package name */
    private final C5269x.g[] f26135c;

    /* renamed from: d, reason: collision with root package name */
    private final G1 f26136d;

    /* renamed from: e, reason: collision with root package name */
    private int f26137e = -1;

    class a extends AbstractC5199c {
        a() {
        }

        @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
        public E parsePartialFrom(r rVar, M m8) throws C5230m0 {
            c cVarNewBuilder = E.newBuilder(E.this.f26133a);
            try {
                cVarNewBuilder.mergeFrom(rVar, m8);
                return cVarNewBuilder.buildPartial();
            } catch (C5230m0 e8) {
                throw e8.setUnfinishedMessage(cVarNewBuilder.buildPartial());
            } catch (IOException e9) {
                throw new C5230m0(e9).setUnfinishedMessage(cVarNewBuilder.buildPartial());
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26139a;

        static {
            int[] iArr = new int[C5269x.g.c.values().length];
            f26139a = iArr;
            try {
                iArr[C5269x.g.c.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26139a[C5269x.g.c.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class c extends AbstractC5193a.AbstractC0218a {

        /* renamed from: a, reason: collision with root package name */
        private final C5269x.b f26140a;

        /* renamed from: b, reason: collision with root package name */
        private W.b f26141b;

        /* renamed from: c, reason: collision with root package name */
        private final C5269x.g[] f26142c;

        /* renamed from: d, reason: collision with root package name */
        private G1 f26143d;

        /* synthetic */ c(C5269x.b bVar, a aVar) {
            this(bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public E d() throws C5230m0 {
            if (isInitialized()) {
                return buildPartial();
            }
            C5269x.b bVar = this.f26140a;
            W wBuild = this.f26141b.build();
            C5269x.g[] gVarArr = this.f26142c;
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) new E(bVar, wBuild, (C5269x.g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f26143d)).asInvalidProtocolBufferException();
        }

        private static H0.a e(Object obj) {
            if (obj instanceof H0.a) {
                return (H0.a) obj;
            }
            if (obj instanceof C5242q0) {
                obj = ((C5242q0) obj).getValue();
            }
            if (obj instanceof H0) {
                return ((H0) obj).toBuilder();
            }
            throw new IllegalArgumentException(String.format("Cannot convert %s to Message.Builder", obj.getClass()));
        }

        private void f(C5269x.g gVar) {
            if (gVar.getContainingType() != this.f26140a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void g(C5269x.l lVar) {
            if (lVar.getContainingType() != this.f26140a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        private void h(C5269x.g gVar, Object obj) {
            int i8 = b.f26139a[gVar.getType().ordinal()];
            if (i8 != 1) {
                if (i8 == 2 && (obj instanceof H0.a)) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(gVar.getNumber()), gVar.getLiteType().getJavaType(), obj.getClass().getName()));
                }
            } else {
                AbstractC5227l0.a(obj);
                if (!(obj instanceof C5269x.f)) {
                    throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }

        private void i(C5269x.g gVar, Object obj) {
            if (!gVar.isRepeated()) {
                h(gVar, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                h(gVar, it.next());
            }
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Map<C5269x.g, Object> getAllFields() {
            return this.f26141b.getAllFields();
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
        public C5269x.b getDescriptorForType() {
            return this.f26140a;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getField(C5269x.g gVar) {
            f(gVar);
            Object field = this.f26141b.getField(gVar);
            return field == null ? gVar.isRepeated() ? Collections.emptyList() : gVar.getJavaType() == C5269x.g.b.MESSAGE ? E.getDefaultInstance(gVar.getMessageType()) : gVar.getDefaultValue() : field;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getFieldBuilder(C5269x.g gVar) {
            f(gVar);
            if (gVar.isMapField()) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
            if (gVar.getJavaType() != C5269x.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            Object objC = this.f26141b.c(gVar);
            H0.a cVar = objC == null ? new c(gVar.getMessageType()) : e(objC);
            this.f26141b.setField(gVar, cVar);
            return cVar;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            g(lVar);
            return this.f26142c[lVar.getIndex()];
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public Object getRepeatedField(C5269x.g gVar, int i8) {
            f(gVar);
            return this.f26141b.getRepeatedField(gVar, i8);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public H0.a getRepeatedFieldBuilder(C5269x.g gVar, int i8) {
            f(gVar);
            if (gVar.isMapField()) {
                throw new UnsupportedOperationException("Map fields cannot be repeated");
            }
            if (gVar.getJavaType() != C5269x.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            H0.a aVarE = e(this.f26141b.d(gVar, i8));
            this.f26141b.setRepeatedField(gVar, i8, aVarE);
            return aVarE;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public int getRepeatedFieldCount(C5269x.g gVar) {
            f(gVar);
            return this.f26141b.getRepeatedFieldCount(gVar);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public G1 getUnknownFields() {
            return this.f26143d;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasField(C5269x.g gVar) {
            f(gVar);
            return this.f26141b.hasField(gVar);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0
        public boolean hasOneof(C5269x.l lVar) {
            g(lVar);
            return this.f26142c[lVar.getIndex()] != null;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public boolean isInitialized() {
            for (C5269x.g gVar : this.f26140a.getFields()) {
                if (gVar.isRequired() && !this.f26141b.hasField(gVar)) {
                    return false;
                }
            }
            return this.f26141b.isInitialized();
        }

        private c(C5269x.b bVar) {
            this.f26140a = bVar;
            this.f26141b = W.newBuilder();
            this.f26143d = G1.getDefaultInstance();
            this.f26142c = new C5269x.g[bVar.toProto().getOneofDeclCount()];
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c addRepeatedField(C5269x.g gVar, Object obj) {
            f(gVar);
            h(gVar, obj);
            this.f26141b.addRepeatedField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c clearField(C5269x.g gVar) {
            f(gVar);
            C5269x.l containingOneof = gVar.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                C5269x.g[] gVarArr = this.f26142c;
                if (gVarArr[index] == gVar) {
                    gVarArr[index] = null;
                }
            }
            this.f26141b.clearField(gVar);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c newBuilderForField(C5269x.g gVar) {
            f(gVar);
            if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                return new c(gVar.getMessageType());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c setField(C5269x.g gVar, Object obj) {
            f(gVar);
            i(gVar, obj);
            C5269x.l containingOneof = gVar.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                C5269x.g gVar2 = this.f26142c[index];
                if (gVar2 != null && gVar2 != gVar) {
                    this.f26141b.clearField(gVar2);
                }
                this.f26142c[index] = gVar;
            } else if (gVar.getFile().getSyntax() == C5269x.h.b.PROTO3 && !gVar.isRepeated() && gVar.getJavaType() != C5269x.g.b.MESSAGE && obj.equals(gVar.getDefaultValue())) {
                this.f26141b.clearField(gVar);
                return this;
            }
            this.f26141b.setField(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c setRepeatedField(C5269x.g gVar, int i8, Object obj) {
            f(gVar);
            h(gVar, obj);
            this.f26141b.setRepeatedField(gVar, i8, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c setUnknownFields(G1 g12) {
            this.f26143d = g12;
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public E build() {
            if (isInitialized()) {
                return buildPartial();
            }
            C5269x.b bVar = this.f26140a;
            W wBuild = this.f26141b.build();
            C5269x.g[] gVarArr = this.f26142c;
            throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) new E(bVar, wBuild, (C5269x.g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f26143d));
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public E buildPartial() {
            if (this.f26140a.getOptions().getMapEntry()) {
                for (C5269x.g gVar : this.f26140a.getFields()) {
                    if (gVar.isOptional() && !this.f26141b.hasField(gVar)) {
                        if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                            this.f26141b.setField(gVar, E.getDefaultInstance(gVar.getMessageType()));
                        } else {
                            this.f26141b.setField(gVar, gVar.getDefaultValue());
                        }
                    }
                }
            }
            C5269x.b bVar = this.f26140a;
            W wBuildPartial = this.f26141b.buildPartial();
            C5269x.g[] gVarArr = this.f26142c;
            return new E(bVar, wBuildPartial, (C5269x.g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f26143d);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c clearOneof(C5269x.l lVar) {
            g(lVar);
            C5269x.g gVar = this.f26142c[lVar.getIndex()];
            if (gVar != null) {
                clearField(gVar);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public E getDefaultInstanceForType() {
            return E.getDefaultInstance(this.f26140a);
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c mergeFrom(H0 h02) {
            if (h02 instanceof E) {
                E e8 = (E) h02;
                if (e8.f26133a == this.f26140a) {
                    this.f26141b.mergeFrom(e8.f26134b);
                    mergeUnknownFields(e8.f26136d);
                    int i8 = 0;
                    while (true) {
                        C5269x.g[] gVarArr = this.f26142c;
                        if (i8 >= gVarArr.length) {
                            return this;
                        }
                        if (gVarArr[i8] == null) {
                            gVarArr[i8] = e8.f26135c[i8];
                        } else if (e8.f26135c[i8] != null && this.f26142c[i8] != e8.f26135c[i8]) {
                            this.f26141b.clearField(this.f26142c[i8]);
                            this.f26142c[i8] = e8.f26135c[i8];
                        }
                        i8++;
                    }
                } else {
                    throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
                }
            } else {
                return (c) super.mergeFrom(h02);
            }
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
        public c mergeUnknownFields(G1 g12) {
            this.f26143d = G1.newBuilder(this.f26143d).mergeFrom(g12).build();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public c clear() {
            this.f26141b = W.newBuilder();
            this.f26143d = G1.getDefaultInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
        /* renamed from: clone */
        public c mo3clone() {
            c cVar = new c(this.f26140a);
            cVar.f26141b.mergeFrom(this.f26141b.build());
            cVar.mergeUnknownFields(this.f26143d);
            C5269x.g[] gVarArr = this.f26142c;
            System.arraycopy(gVarArr, 0, cVar.f26142c, 0, gVarArr.length);
            return cVar;
        }
    }

    E(C5269x.b bVar, W w8, C5269x.g[] gVarArr, G1 g12) {
        this.f26133a = bVar;
        this.f26134b = w8;
        this.f26135c = gVarArr;
        this.f26136d = g12;
    }

    public static E getDefaultInstance(C5269x.b bVar) {
        return new E(bVar, W.emptySet(), new C5269x.g[bVar.toProto().getOneofDeclCount()], G1.getDefaultInstance());
    }

    static boolean k(C5269x.b bVar, W w8) {
        for (C5269x.g gVar : bVar.getFields()) {
            if (gVar.isRequired() && !w8.hasField(gVar)) {
                return false;
            }
        }
        return w8.isInitialized();
    }

    private void l(C5269x.g gVar) {
        if (gVar.getContainingType() != this.f26133a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    private void m(C5269x.l lVar) {
        if (lVar.getContainingType() != this.f26133a) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    public static c newBuilder(C5269x.b bVar) {
        return new c(bVar, null);
    }

    public static E parseFrom(C5269x.b bVar, r rVar) {
        return ((c) newBuilder(bVar).mergeFrom(rVar)).d();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Map<C5269x.g, Object> getAllFields() {
        return this.f26134b.getAllFields();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public C5269x.b getDescriptorForType() {
        return this.f26133a;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getField(C5269x.g gVar) {
        l(gVar);
        Object field = this.f26134b.getField(gVar);
        return field == null ? gVar.isRepeated() ? Collections.emptyList() : gVar.getJavaType() == C5269x.g.b.MESSAGE ? getDefaultInstance(gVar.getMessageType()) : gVar.getDefaultValue() : field;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
        m(lVar);
        return this.f26135c[lVar.getIndex()];
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public Z0 getParserForType() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public Object getRepeatedField(C5269x.g gVar, int i8) {
        l(gVar);
        return this.f26134b.getRepeatedField(gVar, i8);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public int getRepeatedFieldCount(C5269x.g gVar) {
        l(gVar);
        return this.f26134b.getRepeatedFieldCount(gVar);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int serializedSize;
        int serializedSize2;
        int i8 = this.f26137e;
        if (i8 != -1) {
            return i8;
        }
        if (this.f26133a.getOptions().getMessageSetWireFormat()) {
            serializedSize = this.f26134b.getMessageSetSerializedSize();
            serializedSize2 = this.f26136d.getSerializedSizeAsMessageSet();
        } else {
            serializedSize = this.f26134b.getSerializedSize();
            serializedSize2 = this.f26136d.getSerializedSize();
        }
        int i9 = serializedSize + serializedSize2;
        this.f26137e = i9;
        return i9;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public G1 getUnknownFields() {
        return this.f26136d;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public boolean hasField(C5269x.g gVar) {
        l(gVar);
        return this.f26134b.hasField(gVar);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0, com.google.protobuf.N0
    public boolean hasOneof(C5269x.l lVar) {
        m(lVar);
        return this.f26135c[lVar.getIndex()] != null;
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public boolean isInitialized() {
        return k(this.f26133a, this.f26134b);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        if (this.f26133a.getOptions().getMessageSetWireFormat()) {
            this.f26134b.writeMessageSetTo(abstractC5248t);
            this.f26136d.writeAsMessageSetTo(abstractC5248t);
        } else {
            this.f26134b.writeTo(abstractC5248t);
            this.f26136d.writeTo(abstractC5248t);
        }
    }

    public static c newBuilder(H0 h02) {
        return new c(h02.getDescriptorForType(), null).mergeFrom(h02);
    }

    public static E parseFrom(C5269x.b bVar, r rVar, K k8) {
        return ((c) newBuilder(bVar).mergeFrom(rVar, (M) k8)).d();
    }

    public static E parseFrom(C5269x.b bVar, AbstractC5235o abstractC5235o) {
        return ((c) newBuilder(bVar).mergeFrom(abstractC5235o)).d();
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public E getDefaultInstanceForType() {
        return getDefaultInstance(this.f26133a);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public c newBuilderForType() {
        return new c(this.f26133a, null);
    }

    @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public c toBuilder() {
        return newBuilderForType().mergeFrom((H0) this);
    }

    public static E parseFrom(C5269x.b bVar, AbstractC5235o abstractC5235o, K k8) {
        return ((c) newBuilder(bVar).mergeFrom(abstractC5235o, (M) k8)).d();
    }

    public static E parseFrom(C5269x.b bVar, byte[] bArr) {
        return ((c) newBuilder(bVar).mergeFrom(bArr)).d();
    }

    public static E parseFrom(C5269x.b bVar, byte[] bArr, K k8) {
        return ((c) newBuilder(bVar).mergeFrom(bArr, (M) k8)).d();
    }

    public static E parseFrom(C5269x.b bVar, InputStream inputStream) {
        return ((c) newBuilder(bVar).mergeFrom(inputStream)).d();
    }

    public static E parseFrom(C5269x.b bVar, InputStream inputStream, K k8) {
        return ((c) newBuilder(bVar).mergeFrom(inputStream, (M) k8)).d();
    }
}
