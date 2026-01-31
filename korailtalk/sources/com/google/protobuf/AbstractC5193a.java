package com.google.protobuf;

import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K0;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5193a extends AbstractC5196b implements H0 {
    protected int memoizedSize = -1;

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0218a extends AbstractC5196b.a implements H0.a {
        protected static E1 newUninitializedMessageException(H0 h02) {
            return new E1((List<String>) O0.c(h02));
        }

        public abstract /* synthetic */ H0.a addRepeatedField(C5269x.g gVar, Object obj);

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 build();

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public abstract /* synthetic */ H0 buildPartial();

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public /* bridge */ /* synthetic */ K0 buildPartial() {
            return super.buildPartial();
        }

        public abstract /* synthetic */ H0.a clearField(C5269x.g gVar);

        void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.H0.a, com.google.protobuf.N0
        public List<String> findInitializationErrors() {
            return O0.c(this);
        }

        public abstract /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public abstract /* synthetic */ C5269x.b getDescriptorForType();

        public abstract /* synthetic */ Object getField(C5269x.g gVar);

        public H0.a getFieldBuilder(C5269x.g gVar) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.google.protobuf.H0.a, com.google.protobuf.N0
        public String getInitializationErrorString() {
            return O0.a(findInitializationErrors());
        }

        public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public abstract /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        public H0.a getRepeatedFieldBuilder(C5269x.g gVar, int i8) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public abstract /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        protected G1.b getUnknownFieldSetBuilder() {
            return G1.newBuilder(getUnknownFields());
        }

        public abstract /* synthetic */ G1 getUnknownFields();

        public abstract /* synthetic */ boolean hasField(C5269x.g gVar);

        public boolean hasOneof(C5269x.l lVar) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public abstract /* synthetic */ boolean isInitialized();

        void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public abstract /* synthetic */ H0.a newBuilderForField(C5269x.g gVar);

        public abstract /* synthetic */ H0.a setField(C5269x.g gVar, Object obj);

        public abstract /* synthetic */ H0.a setRepeatedField(C5269x.g gVar, int i8, Object obj);

        protected void setUnknownFieldSetBuilder(G1.b bVar) {
            setUnknownFields(bVar.build());
        }

        public abstract /* synthetic */ H0.a setUnknownFields(G1 g12);

        public String toString() {
            return t1.printer().printToString(this);
        }

        @Override // com.google.protobuf.H0.a
        public AbstractC0218a clearOneof(C5269x.l lVar) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC5196b.a
        public AbstractC0218a internalMergeFrom(AbstractC5196b abstractC5196b) {
            return mergeFrom((H0) abstractC5196b);
        }

        @Override // com.google.protobuf.H0.a
        public AbstractC0218a mergeUnknownFields(G1 g12) {
            setUnknownFields(G1.newBuilder(getUnknownFields()).mergeFrom(g12).build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public AbstractC0218a clear() {
            Iterator it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField((C5269x.g) ((Map.Entry) it.next()).getKey());
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5196b.a
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public AbstractC0218a mo3clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        @Override // com.google.protobuf.H0.a
        public AbstractC0218a mergeFrom(H0 h02) {
            return mergeFrom(h02, (Map<C5269x.g, Object>) h02.getAllFields());
        }

        AbstractC0218a mergeFrom(H0 h02, Map<C5269x.g, Object> map) {
            if (h02.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry<C5269x.g, Object> entry : map.entrySet()) {
                    C5269x.g key = entry.getKey();
                    if (key.isRepeated()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            addRepeatedField(key, it.next());
                        }
                    } else if (key.getJavaType() == C5269x.g.b.MESSAGE) {
                        H0 h03 = (H0) getField(key);
                        if (h03 == h03.getDefaultInstanceForType()) {
                            setField(key, entry.getValue());
                        } else {
                            setField(key, h03.newBuilderForType().mergeFrom(h03).mergeFrom((H0) entry.getValue()).build());
                        }
                    } else {
                        setField(key, entry.getValue());
                    }
                }
                mergeUnknownFields(h02.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(r rVar) {
            return mergeFrom(rVar, (M) K.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
        public AbstractC0218a mergeFrom(r rVar, M m8) {
            G1.b unknownFieldSetBuilder = rVar.d() ? null : getUnknownFieldSetBuilder();
            O0.h(this, unknownFieldSetBuilder, rVar, m8);
            if (unknownFieldSetBuilder != null) {
                setUnknownFieldSetBuilder(unknownFieldSetBuilder);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(AbstractC5235o abstractC5235o) {
            return (AbstractC0218a) super.mergeFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AbstractC0218a) super.mergeFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(byte[] bArr) {
            return (AbstractC0218a) super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(byte[] bArr, int i8, int i9) {
            return (AbstractC0218a) super.mergeFrom(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(byte[] bArr, M m8) {
            return (AbstractC0218a) super.mergeFrom(bArr, m8);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(byte[] bArr, int i8, int i9, M m8) {
            return (AbstractC0218a) super.mergeFrom(bArr, i8, i9, m8);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(InputStream inputStream) {
            return (AbstractC0218a) super.mergeFrom(inputStream);
        }

        @Override // com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a
        public AbstractC0218a mergeFrom(InputStream inputStream, M m8) {
            return (AbstractC0218a) super.mergeFrom(inputStream, m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.protobuf.a$b */
    public interface b {
        void markDirty();
    }

    private static boolean b(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : f(obj).equals(f(obj2));
    }

    private static boolean c(Object obj, Object obj2) {
        return C0.h(d((List) obj), d((List) obj2));
    }

    static boolean compareFields(Map<C5269x.g, Object> map, Map<C5269x.g, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C5269x.g gVar : map.keySet()) {
            if (!map2.containsKey(gVar)) {
                return false;
            }
            Object obj = map.get(gVar);
            Object obj2 = map2.get(gVar);
            if (gVar.getType() == C5269x.g.c.BYTES) {
                if (gVar.isRepeated()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        if (!b(list.get(i8), list2.get(i8))) {
                            return false;
                        }
                    }
                } else if (!b(obj, obj2)) {
                    return false;
                }
            } else if (gVar.isMapField()) {
                if (!c(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static Map d(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        H0 h02 = (H0) it.next();
        C5269x.b descriptorForType = h02.getDescriptorForType();
        C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName("key");
        C5269x.g gVarFindFieldByName2 = descriptorForType.findFieldByName("value");
        Object field = h02.getField(gVarFindFieldByName2);
        if (field instanceof C5269x.f) {
            field = Integer.valueOf(((C5269x.f) field).getNumber());
        }
        map.put(h02.getField(gVarFindFieldByName), field);
        while (it.hasNext()) {
            H0 h03 = (H0) it.next();
            Object field2 = h03.getField(gVarFindFieldByName2);
            if (field2 instanceof C5269x.f) {
                field2 = Integer.valueOf(((C5269x.f) field2).getNumber());
            }
            map.put(h03.getField(gVarFindFieldByName), field2);
        }
        return map;
    }

    private static int e(Object obj) {
        return C0.a(d((List) obj));
    }

    private static AbstractC5235o f(Object obj) {
        return obj instanceof byte[] ? AbstractC5235o.copyFrom((byte[]) obj) : (AbstractC5235o) obj;
    }

    @Deprecated
    protected static int hashBoolean(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    @Deprecated
    protected static int hashEnum(AbstractC5227l0.c cVar) {
        return cVar.getNumber();
    }

    @Deprecated
    protected static int hashEnumList(List<? extends AbstractC5227l0.c> list) {
        Iterator<? extends AbstractC5227l0.c> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    protected static int hashFields(int i8, Map<C5269x.g, Object> map) {
        int i9;
        int iHashEnum;
        for (Map.Entry<C5269x.g, Object> entry : map.entrySet()) {
            C5269x.g key = entry.getKey();
            Object value = entry.getValue();
            int number = (i8 * 37) + key.getNumber();
            if (key.isMapField()) {
                i9 = number * 53;
                iHashEnum = e(value);
            } else if (key.getType() != C5269x.g.c.ENUM) {
                i9 = number * 53;
                iHashEnum = value.hashCode();
            } else if (key.isRepeated()) {
                i9 = number * 53;
                iHashEnum = AbstractC5227l0.hashEnumList((List) value);
            } else {
                i9 = number * 53;
                iHashEnum = AbstractC5227l0.hashEnum((AbstractC5227l0.c) value);
            }
            i8 = i9 + iHashEnum;
        }
        return i8;
    }

    @Deprecated
    protected static int hashLong(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (getDescriptorForType() != h02.getDescriptorForType()) {
            return false;
        }
        return compareFields(getAllFields(), h02.getAllFields()) && getUnknownFields().equals(h02.getUnknownFields());
    }

    @Override // com.google.protobuf.H0, com.google.protobuf.N0
    public List<String> findInitializationErrors() {
        return O0.c(this);
    }

    public abstract /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public abstract /* synthetic */ H0 getDefaultInstanceForType();

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public /* bridge */ /* synthetic */ K0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public abstract /* synthetic */ C5269x.b getDescriptorForType();

    public abstract /* synthetic */ Object getField(C5269x.g gVar);

    @Override // com.google.protobuf.H0, com.google.protobuf.N0
    public String getInitializationErrorString() {
        return O0.a(findInitializationErrors());
    }

    @Override // com.google.protobuf.AbstractC5196b
    int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public C5269x.g getOneofFieldDescriptor(C5269x.l lVar) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ Z0 getParserForType();

    public abstract /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

    public abstract /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        int i8 = this.memoizedSize;
        if (i8 != -1) {
            return i8;
        }
        int iE = O0.e(this, getAllFields());
        this.memoizedSize = iE;
        return iE;
    }

    public abstract /* synthetic */ G1 getUnknownFields();

    public abstract /* synthetic */ boolean hasField(C5269x.g gVar);

    public boolean hasOneof(C5269x.l lVar) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int iHashFields = (hashFields(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashFields;
        return iHashFields;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public boolean isInitialized() {
        return O0.f(this);
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ H0.a newBuilderForType();

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC5196b
    E1 newUninitializedMessageException() {
        return AbstractC0218a.newUninitializedMessageException((H0) this);
    }

    @Override // com.google.protobuf.AbstractC5196b
    void setMemoizedSerializedSize(int i8) {
        this.memoizedSize = i8;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public abstract /* synthetic */ H0.a toBuilder();

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.H0
    public final String toString() {
        return t1.printer().printToString(this);
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        O0.l(this, getAllFields(), abstractC5248t, false);
    }

    protected H0.a newBuilderForType(b bVar) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }
}
