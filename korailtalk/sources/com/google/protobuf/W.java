package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5242q0;
import com.google.protobuf.K0;
import com.google.protobuf.P1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class W {

    /* renamed from: d, reason: collision with root package name */
    private static final W f26338d = new W(true);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5231m1 f26339a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26340b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26341c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26342a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26343b;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26343b = iArr;
            try {
                iArr[P1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26343b[P1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26343b[P1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26343b[P1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26343b[P1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26343b[P1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26343b[P1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26343b[P1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26343b[P1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26343b[P1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26343b[P1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26343b[P1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26343b[P1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26343b[P1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26343b[P1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26343b[P1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26343b[P1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26343b[P1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[P1.c.values().length];
            f26342a = iArr2;
            try {
                iArr2[P1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26342a[P1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26342a[P1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26342a[P1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26342a[P1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26342a[P1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26342a[P1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f26342a[P1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26342a[P1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5231m1 f26344a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26345b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26346c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f26347d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private W a(boolean z8) {
            if (this.f26344a.isEmpty()) {
                return W.emptySet();
            }
            this.f26346c = false;
            AbstractC5231m1 abstractC5231m1H = this.f26344a;
            if (this.f26347d) {
                abstractC5231m1H = W.h(abstractC5231m1H, false);
                h(abstractC5231m1H, z8);
            }
            W w8 = new W(abstractC5231m1H, null);
            w8.f26341c = this.f26345b;
            return w8;
        }

        private void b() {
            if (this.f26346c) {
                return;
            }
            this.f26344a = W.h(this.f26344a, true);
            this.f26346c = true;
        }

        private void e(Map.Entry entry) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C5242q0) {
                value = ((C5242q0) value).getValue();
            }
            if (cVar.isRepeated()) {
                List arrayList = (List) c(cVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f26344a.put((Comparable<Object>) cVar, (Object) arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(W.j(it.next()));
                }
                return;
            }
            if (cVar.getLiteJavaType() != P1.c.MESSAGE) {
                this.f26344a.put((Comparable<Object>) cVar, W.j(value));
                return;
            }
            Object objC = c(cVar);
            if (objC == null) {
                this.f26344a.put((Comparable<Object>) cVar, W.j(value));
            } else if (objC instanceof K0.a) {
                cVar.internalMergeFrom((K0.a) objC, (K0) value);
            } else {
                this.f26344a.put((Comparable<Object>) cVar, (Object) cVar.internalMergeFrom(((K0) objC).toBuilder(), (K0) value).build());
            }
        }

        private static Object f(Object obj, boolean z8) {
            if (!(obj instanceof K0.a)) {
                return obj;
            }
            K0.a aVar = (K0.a) obj;
            return z8 ? aVar.buildPartial() : aVar.build();
        }

        public static <T extends c> b fromFieldSet(W w8) {
            b bVar = new b(W.h(w8.f26339a, true));
            bVar.f26345b = w8.f26341c;
            return bVar;
        }

        private static Object g(c cVar, Object obj, boolean z8) {
            if (obj == null || cVar.getLiteJavaType() != P1.c.MESSAGE) {
                return obj;
            }
            if (!cVar.isRepeated()) {
                return f(obj, z8);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                Object obj2 = arrayList.get(i8);
                Object objF = f(obj2, z8);
                if (objF != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i8, objF);
                }
            }
            return arrayList;
        }

        private static void h(AbstractC5231m1 abstractC5231m1, boolean z8) {
            for (int i8 = 0; i8 < abstractC5231m1.getNumArrayEntries(); i8++) {
                i(abstractC5231m1.getArrayEntryAt(i8), z8);
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = abstractC5231m1.getOverflowEntries().iterator();
            while (it.hasNext()) {
                i(it.next(), z8);
            }
        }

        private static void i(Map.Entry entry, boolean z8) {
            entry.setValue(g((c) entry.getKey(), entry.getValue(), z8));
        }

        private void j(c cVar, Object obj) {
            if (W.s(cVar.getLiteType(), obj)) {
                return;
            }
            if (cVar.getLiteType().getJavaType() != P1.c.MESSAGE || !(obj instanceof K0.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public void addRepeatedField(c cVar, Object obj) {
            List arrayList;
            b();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f26347d = this.f26347d || (obj instanceof K0.a);
            j(cVar, obj);
            Object objC = c(cVar);
            if (objC == null) {
                arrayList = new ArrayList();
                this.f26344a.put((Comparable<Object>) cVar, (Object) arrayList);
            } else {
                arrayList = (List) objC;
            }
            arrayList.add(obj);
        }

        public W build() {
            return a(false);
        }

        public W buildPartial() {
            return a(true);
        }

        Object c(c cVar) {
            Object obj = this.f26344a.get(cVar);
            return obj instanceof C5242q0 ? ((C5242q0) obj).getValue() : obj;
        }

        public void clearField(c cVar) {
            b();
            this.f26344a.remove(cVar);
            if (this.f26344a.isEmpty()) {
                this.f26345b = false;
            }
        }

        Object d(c cVar, int i8) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objC = c(cVar);
            if (objC != null) {
                return ((List) objC).get(i8);
            }
            throw new IndexOutOfBoundsException();
        }

        public Map<c, Object> getAllFields() {
            if (!this.f26345b) {
                return this.f26344a.isImmutable() ? this.f26344a : Collections.unmodifiableMap(this.f26344a);
            }
            AbstractC5231m1 abstractC5231m1H = W.h(this.f26344a, false);
            if (this.f26344a.isImmutable()) {
                abstractC5231m1H.makeImmutable();
            } else {
                h(abstractC5231m1H, true);
            }
            return abstractC5231m1H;
        }

        public Object getField(c cVar) {
            return g(cVar, c(cVar), true);
        }

        public Object getRepeatedField(c cVar, int i8) {
            if (this.f26347d) {
                b();
            }
            return f(d(cVar, i8), true);
        }

        public int getRepeatedFieldCount(c cVar) {
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objC = c(cVar);
            if (objC == null) {
                return 0;
            }
            return ((List) objC).size();
        }

        public boolean hasField(c cVar) {
            if (cVar.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f26344a.get(cVar) != null;
        }

        public boolean isInitialized() {
            for (int i8 = 0; i8 < this.f26344a.getNumArrayEntries(); i8++) {
                if (!W.q(this.f26344a.getArrayEntryAt(i8))) {
                    return false;
                }
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f26344a.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!W.q(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(W w8) {
            b();
            for (int i8 = 0; i8 < w8.f26339a.getNumArrayEntries(); i8++) {
                e(w8.f26339a.getArrayEntryAt(i8));
            }
            Iterator<Map.Entry<Comparable<Object>, Object>> it = w8.f26339a.getOverflowEntries().iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }

        public void setField(c cVar, Object obj) {
            b();
            if (!cVar.isRepeated()) {
                j(cVar, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    j(cVar, obj2);
                    this.f26347d = this.f26347d || (obj2 instanceof K0.a);
                }
                obj = arrayList;
            }
            if (obj instanceof C5242q0) {
                this.f26345b = true;
            }
            this.f26347d = this.f26347d || (obj instanceof K0.a);
            this.f26344a.put((Comparable<Object>) cVar, obj);
        }

        public void setRepeatedField(c cVar, int i8, Object obj) {
            b();
            if (!cVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f26347d = this.f26347d || (obj instanceof K0.a);
            Object objC = c(cVar);
            if (objC == null) {
                throw new IndexOutOfBoundsException();
            }
            j(cVar, obj);
            ((List) objC).set(i8, obj);
        }

        private b() {
            this(AbstractC5231m1.k(16));
        }

        private b(AbstractC5231m1 abstractC5231m1) {
            this.f26344a = abstractC5231m1;
            this.f26346c = true;
        }
    }

    public interface c extends Comparable {
        AbstractC5227l0.d getEnumType();

        P1.c getLiteJavaType();

        P1.b getLiteType();

        int getNumber();

        K0.a internalMergeFrom(K0.a aVar, K0 k02);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ W(AbstractC5231m1 abstractC5231m1, a aVar) {
        this(abstractC5231m1);
    }

    public static int computeFieldSize(c cVar, Object obj) {
        P1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return k(liteType, number, obj);
        }
        List list = (List) obj;
        int iK = 0;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iK += k(liteType, number, it.next());
            }
            return iK;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iK += l(liteType, it2.next());
        }
        return AbstractC5248t.computeTagSize(number) + iK + AbstractC5248t.computeUInt32SizeNoTag(iK);
    }

    public static <T extends c> W emptySet() {
        return f26338d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5231m1 h(AbstractC5231m1 abstractC5231m1, boolean z8) {
        AbstractC5231m1 abstractC5231m1K = AbstractC5231m1.k(16);
        for (int i8 = 0; i8 < abstractC5231m1.getNumArrayEntries(); i8++) {
            i(abstractC5231m1K, abstractC5231m1.getArrayEntryAt(i8), z8);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = abstractC5231m1.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i(abstractC5231m1K, it.next(), z8);
        }
        return abstractC5231m1K;
    }

    private static void i(Map map, Map.Entry entry, boolean z8) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5242q0) {
            map.put(cVar, ((C5242q0) value).getValue());
        } else if (z8 && (value instanceof List)) {
            map.put(cVar, new ArrayList((List) value));
        } else {
            map.put(cVar, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object j(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int k(P1.b bVar, int i8, Object obj) {
        int iComputeTagSize = AbstractC5248t.computeTagSize(i8);
        if (bVar == P1.b.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + l(bVar, obj);
    }

    static int l(P1.b bVar, Object obj) {
        switch (a.f26343b[bVar.ordinal()]) {
            case 1:
                return AbstractC5248t.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return AbstractC5248t.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return AbstractC5248t.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return AbstractC5248t.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return AbstractC5248t.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return AbstractC5248t.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return AbstractC5248t.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return AbstractC5248t.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC5248t.computeGroupSizeNoTag((K0) obj);
            case 10:
                return obj instanceof C5242q0 ? AbstractC5248t.computeLazyFieldSizeNoTag((C5242q0) obj) : AbstractC5248t.computeMessageSizeNoTag((K0) obj);
            case 11:
                return obj instanceof AbstractC5235o ? AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) obj) : AbstractC5248t.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof AbstractC5235o ? AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) obj) : AbstractC5248t.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return AbstractC5248t.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return AbstractC5248t.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return AbstractC5248t.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return AbstractC5248t.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return AbstractC5248t.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof AbstractC5227l0.c ? AbstractC5248t.computeEnumSizeNoTag(((AbstractC5227l0.c) obj).getNumber()) : AbstractC5248t.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private int n(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        return (cVar.getLiteJavaType() != P1.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) ? computeFieldSize(cVar, value) : value instanceof C5242q0 ? AbstractC5248t.computeLazyFieldMessageSetExtensionSize(((c) entry.getKey()).getNumber(), (C5242q0) value) : AbstractC5248t.computeMessageSetExtensionSize(((c) entry.getKey()).getNumber(), (K0) value);
    }

    public static <T extends c> b newBuilder() {
        return new b((a) null);
    }

    public static <T extends c> W newFieldSet() {
        return new W();
    }

    static int o(P1.b bVar, boolean z8) {
        if (z8) {
            return 2;
        }
        return bVar.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        if (cVar.getLiteJavaType() != P1.c.MESSAGE) {
            return true;
        }
        if (!cVar.isRepeated()) {
            return r(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!r(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof L0) {
            return ((L0) obj).isInitialized();
        }
        if (obj instanceof C5242q0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static Object readPrimitiveField(r rVar, P1.b bVar, boolean z8) {
        return z8 ? P1.b(rVar, bVar, P1.d.STRICT) : P1.b(rVar, bVar, P1.d.LOOSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(P1.b bVar, Object obj) {
        AbstractC5227l0.a(obj);
        switch (a.f26342a[bVar.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof AbstractC5235o) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof AbstractC5227l0.c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof K0) && !(obj instanceof C5242q0)) {
                    break;
                }
                break;
        }
        return false;
    }

    private void t(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5242q0) {
            value = ((C5242q0) value).getValue();
        }
        if (cVar.isRepeated()) {
            Object field = getField(cVar);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(j(it.next()));
            }
            this.f26339a.put((Comparable<Object>) cVar, field);
            return;
        }
        if (cVar.getLiteJavaType() != P1.c.MESSAGE) {
            this.f26339a.put((Comparable<Object>) cVar, j(value));
            return;
        }
        Object field2 = getField(cVar);
        if (field2 == null) {
            this.f26339a.put((Comparable<Object>) cVar, j(value));
        } else {
            this.f26339a.put((Comparable<Object>) cVar, (Object) cVar.internalMergeFrom(((K0) field2).toBuilder(), (K0) value).build());
        }
    }

    private void u(c cVar, Object obj) {
        if (!s(cVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(cVar.getNumber()), cVar.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    static void v(AbstractC5248t abstractC5248t, P1.b bVar, int i8, Object obj) {
        if (bVar == P1.b.GROUP) {
            abstractC5248t.writeGroup(i8, (K0) obj);
        } else {
            abstractC5248t.writeTag(i8, o(bVar, false));
            w(abstractC5248t, bVar, obj);
        }
    }

    static void w(AbstractC5248t abstractC5248t, P1.b bVar, Object obj) {
        switch (a.f26343b[bVar.ordinal()]) {
            case 1:
                abstractC5248t.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC5248t.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                abstractC5248t.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                abstractC5248t.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                abstractC5248t.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                abstractC5248t.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                abstractC5248t.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                abstractC5248t.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC5248t.writeGroupNoTag((K0) obj);
                break;
            case 10:
                abstractC5248t.writeMessageNoTag((K0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC5235o)) {
                    abstractC5248t.writeStringNoTag((String) obj);
                    break;
                } else {
                    abstractC5248t.writeBytesNoTag((AbstractC5235o) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC5235o)) {
                    abstractC5248t.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    abstractC5248t.writeBytesNoTag((AbstractC5235o) obj);
                    break;
                }
            case 13:
                abstractC5248t.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                abstractC5248t.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                abstractC5248t.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                abstractC5248t.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                abstractC5248t.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof AbstractC5227l0.c)) {
                    abstractC5248t.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC5248t.writeEnumNoTag(((AbstractC5227l0.c) obj).getNumber());
                    break;
                }
        }
    }

    public static void writeField(c cVar, Object obj, AbstractC5248t abstractC5248t) {
        P1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof C5242q0) {
                v(abstractC5248t, liteType, number, ((C5242q0) obj).getValue());
                return;
            } else {
                v(abstractC5248t, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v(abstractC5248t, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            abstractC5248t.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int iL = 0;
            while (it2.hasNext()) {
                iL += l(liteType, it2.next());
            }
            abstractC5248t.writeUInt32NoTag(iL);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                w(abstractC5248t, liteType, it3.next());
            }
        }
    }

    private void x(Map.Entry entry, AbstractC5248t abstractC5248t) {
        c cVar = (c) entry.getKey();
        if (cVar.getLiteJavaType() != P1.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
            writeField(cVar, entry.getValue(), abstractC5248t);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof C5242q0) {
            value = ((C5242q0) value).getValue();
        }
        abstractC5248t.writeMessageSetExtension(((c) entry.getKey()).getNumber(), (K0) value);
    }

    public void addRepeatedField(c cVar, Object obj) {
        List arrayList;
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        u(cVar, obj);
        Object field = getField(cVar);
        if (field == null) {
            arrayList = new ArrayList();
            this.f26339a.put((Comparable<Object>) cVar, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.f26339a.clear();
        this.f26341c = false;
    }

    public void clearField(c cVar) {
        this.f26339a.remove(cVar);
        if (this.f26339a.isEmpty()) {
            this.f26341c = false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W) {
            return this.f26339a.equals(((W) obj).f26339a);
        }
        return false;
    }

    public Map<c, Object> getAllFields() {
        if (!this.f26341c) {
            return this.f26339a.isImmutable() ? this.f26339a : Collections.unmodifiableMap(this.f26339a);
        }
        AbstractC5231m1 abstractC5231m1H = h(this.f26339a, false);
        if (this.f26339a.isImmutable()) {
            abstractC5231m1H.makeImmutable();
        }
        return abstractC5231m1H;
    }

    public Object getField(c cVar) {
        Object obj = this.f26339a.get(cVar);
        return obj instanceof C5242q0 ? ((C5242q0) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int iN = 0;
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            iN += n(this.f26339a.getArrayEntryAt(i8));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f26339a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            iN += n(it.next());
        }
        return iN;
    }

    public Object getRepeatedField(c cVar, int i8) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field != null) {
            return ((List) field).get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(c cVar) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.f26339a.getArrayEntryAt(i8);
            iComputeFieldSize += computeFieldSize((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.f26339a.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(c cVar) {
        if (cVar.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f26339a.get(cVar) != null;
    }

    public int hashCode() {
        return this.f26339a.hashCode();
    }

    public boolean isImmutable() {
        return this.f26340b;
    }

    public boolean isInitialized() {
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            if (!q(this.f26339a.getArrayEntryAt(i8))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f26339a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<c, Object>> iterator() {
        return this.f26341c ? new C5242q0.c(this.f26339a.entrySet().iterator()) : this.f26339a.entrySet().iterator();
    }

    Iterator m() {
        return this.f26341c ? new C5242q0.c(this.f26339a.h().iterator()) : this.f26339a.h().iterator();
    }

    public void makeImmutable() {
        if (this.f26340b) {
            return;
        }
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.f26339a.getArrayEntryAt(i8);
            if (arrayEntryAt.getValue() instanceof AbstractC5206e0) {
                ((AbstractC5206e0) arrayEntryAt.getValue()).r();
            }
        }
        this.f26339a.makeImmutable();
        this.f26340b = true;
    }

    public void mergeFrom(W w8) {
        for (int i8 = 0; i8 < w8.f26339a.getNumArrayEntries(); i8++) {
            t(w8.f26339a.getArrayEntryAt(i8));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = w8.f26339a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            t(it.next());
        }
    }

    boolean p() {
        return this.f26339a.isEmpty();
    }

    public void setField(c cVar, Object obj) {
        if (!cVar.isRepeated()) {
            u(cVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u(cVar, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C5242q0) {
            this.f26341c = true;
        }
        this.f26339a.put((Comparable<Object>) cVar, obj);
    }

    public void setRepeatedField(c cVar, int i8, Object obj) {
        if (!cVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(cVar);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        u(cVar, obj);
        ((List) field).set(i8, obj);
    }

    public void writeMessageSetTo(AbstractC5248t abstractC5248t) {
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            x(this.f26339a.getArrayEntryAt(i8), abstractC5248t);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f26339a.getOverflowEntries().iterator();
        while (it.hasNext()) {
            x(it.next(), abstractC5248t);
        }
    }

    public void writeTo(AbstractC5248t abstractC5248t) {
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.f26339a.getArrayEntryAt(i8);
            writeField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), abstractC5248t);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.f26339a.getOverflowEntries()) {
            writeField((c) entry.getKey(), entry.getValue(), abstractC5248t);
        }
    }

    private W() {
        this.f26339a = AbstractC5231m1.k(16);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m397clone() {
        W wNewFieldSet = newFieldSet();
        for (int i8 = 0; i8 < this.f26339a.getNumArrayEntries(); i8++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.f26339a.getArrayEntryAt(i8);
            wNewFieldSet.setField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.f26339a.getOverflowEntries()) {
            wNewFieldSet.setField((c) entry.getKey(), entry.getValue());
        }
        wNewFieldSet.f26341c = this.f26341c;
        return wNewFieldSet;
    }

    private W(boolean z8) {
        this(AbstractC5231m1.k(0));
        makeImmutable();
    }

    private W(AbstractC5231m1 abstractC5231m1) {
        this.f26339a = abstractC5231m1;
        makeImmutable();
    }
}
