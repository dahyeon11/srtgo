package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.P1;
import com.google.protobuf.R1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.u */
/* loaded from: classes2.dex */
final class C5250u implements R1 {

    /* renamed from: a */
    private final AbstractC5248t f26803a;

    /* renamed from: com.google.protobuf.u$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26804a;

        static {
            int[] iArr = new int[P1.b.values().length];
            f26804a = iArr;
            try {
                iArr[P1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26804a[P1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26804a[P1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26804a[P1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26804a[P1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26804a[P1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26804a[P1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26804a[P1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26804a[P1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26804a[P1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26804a[P1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26804a[P1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C5250u(AbstractC5248t abstractC5248t) {
        AbstractC5248t abstractC5248t2 = (AbstractC5248t) AbstractC5227l0.b(abstractC5248t, "output");
        this.f26803a = abstractC5248t2;
        abstractC5248t2.f26735a = this;
    }

    private void a(int i8, boolean z8, Object obj, A0.b bVar) {
        this.f26803a.writeTag(i8, 2);
        this.f26803a.writeUInt32NoTag(A0.a(bVar, Boolean.valueOf(z8), obj));
        A0.e(this.f26803a, bVar, Boolean.valueOf(z8), obj);
    }

    private void b(int i8, A0.b bVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        Arrays.sort(iArr);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            Object obj = map.get(Integer.valueOf(i11));
            this.f26803a.writeTag(i8, 2);
            this.f26803a.writeUInt32NoTag(A0.a(bVar, Integer.valueOf(i11), obj));
            A0.e(this.f26803a, bVar, Integer.valueOf(i11), obj);
        }
    }

    private void c(int i8, A0.b bVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        Arrays.sort(jArr);
        for (int i10 = 0; i10 < size; i10++) {
            long j8 = jArr[i10];
            Object obj = map.get(Long.valueOf(j8));
            this.f26803a.writeTag(i8, 2);
            this.f26803a.writeUInt32NoTag(A0.a(bVar, Long.valueOf(j8), obj));
            A0.e(this.f26803a, bVar, Long.valueOf(j8), obj);
        }
    }

    private void d(int i8, A0.b bVar, Map map) {
        switch (a.f26804a[bVar.keyType.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    a(i8, false, obj, bVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    a(i8, true, obj2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                b(i8, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                c(i8, bVar, map);
                return;
            case 12:
                e(i8, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.keyType);
        }
    }

    private void e(int i8, A0.b bVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            strArr[i9] = (String) it.next();
            i9++;
        }
        Arrays.sort(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            String str = strArr[i10];
            Object obj = map.get(str);
            this.f26803a.writeTag(i8, 2);
            this.f26803a.writeUInt32NoTag(A0.a(bVar, str, obj));
            A0.e(this.f26803a, bVar, str, obj);
        }
    }

    private void f(int i8, Object obj) {
        if (obj instanceof String) {
            this.f26803a.writeString(i8, (String) obj);
        } else {
            this.f26803a.writeBytes(i8, (AbstractC5235o) obj);
        }
    }

    public static C5250u forCodedOutput(AbstractC5248t abstractC5248t) {
        C5250u c5250u = abstractC5248t.f26735a;
        return c5250u != null ? c5250u : new C5250u(abstractC5248t);
    }

    @Override // com.google.protobuf.R1
    public R1.a fieldOrder() {
        return R1.a.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.f26803a.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.R1
    public void writeBool(int i8, boolean z8) {
        this.f26803a.writeBool(i8, z8);
    }

    @Override // com.google.protobuf.R1
    public void writeBoolList(int i8, List<Boolean> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeBool(i8, list.get(i9).booleanValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeBoolSizeNoTag += AbstractC5248t.computeBoolSizeNoTag(list.get(i10).booleanValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeBoolNoTag(list.get(i9).booleanValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeBytes(int i8, AbstractC5235o abstractC5235o) {
        this.f26803a.writeBytes(i8, abstractC5235o);
    }

    @Override // com.google.protobuf.R1
    public void writeBytesList(int i8, List<AbstractC5235o> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f26803a.writeBytes(i8, list.get(i9));
        }
    }

    @Override // com.google.protobuf.R1
    public void writeDouble(int i8, double d9) {
        this.f26803a.writeDouble(i8, d9);
    }

    @Override // com.google.protobuf.R1
    public void writeDoubleList(int i8, List<Double> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeDouble(i8, list.get(i9).doubleValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeDoubleSizeNoTag += AbstractC5248t.computeDoubleSizeNoTag(list.get(i10).doubleValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeDoubleNoTag(list.get(i9).doubleValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    @Deprecated
    public void writeEndGroup(int i8) {
        this.f26803a.writeTag(i8, 4);
    }

    @Override // com.google.protobuf.R1
    public void writeEnum(int i8, int i9) {
        this.f26803a.writeEnum(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeEnumList(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeEnum(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeEnumSizeNoTag += AbstractC5248t.computeEnumSizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeEnumNoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeFixed32(int i8, int i9) {
        this.f26803a.writeFixed32(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeFixed32List(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeFixed32(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeFixed32SizeNoTag += AbstractC5248t.computeFixed32SizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeFixed32NoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeFixed64(int i8, long j8) {
        this.f26803a.writeFixed64(i8, j8);
    }

    @Override // com.google.protobuf.R1
    public void writeFixed64List(int i8, List<Long> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeFixed64(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeFixed64SizeNoTag += AbstractC5248t.computeFixed64SizeNoTag(list.get(i10).longValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeFixed64NoTag(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeFloat(int i8, float f8) {
        this.f26803a.writeFloat(i8, f8);
    }

    @Override // com.google.protobuf.R1
    public void writeFloatList(int i8, List<Float> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeFloat(i8, list.get(i9).floatValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeFloatSizeNoTag += AbstractC5248t.computeFloatSizeNoTag(list.get(i10).floatValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeFloatNoTag(list.get(i9).floatValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    @Deprecated
    public void writeGroup(int i8, Object obj) {
        this.f26803a.writeGroup(i8, (K0) obj);
    }

    @Override // com.google.protobuf.R1
    @Deprecated
    public void writeGroupList(int i8, List<?> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeGroup(i8, list.get(i9));
        }
    }

    @Override // com.google.protobuf.R1
    public void writeInt32(int i8, int i9) {
        this.f26803a.writeInt32(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeInt32List(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeInt32(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeInt32SizeNoTag += AbstractC5248t.computeInt32SizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeInt32NoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeInt64(int i8, long j8) {
        this.f26803a.writeInt64(i8, j8);
    }

    @Override // com.google.protobuf.R1
    public void writeInt64List(int i8, List<Long> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeInt64(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeInt64SizeNoTag += AbstractC5248t.computeInt64SizeNoTag(list.get(i10).longValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeInt64NoTag(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public <K, V> void writeMap(int i8, A0.b bVar, Map<K, V> map) {
        if (this.f26803a.i()) {
            d(i8, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f26803a.writeTag(i8, 2);
            this.f26803a.writeUInt32NoTag(A0.a(bVar, entry.getKey(), entry.getValue()));
            A0.e(this.f26803a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.R1
    public void writeMessage(int i8, Object obj) {
        this.f26803a.writeMessage(i8, (K0) obj);
    }

    @Override // com.google.protobuf.R1
    public void writeMessageList(int i8, List<?> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeMessage(i8, list.get(i9));
        }
    }

    @Override // com.google.protobuf.R1
    public final void writeMessageSetItem(int i8, Object obj) {
        if (obj instanceof AbstractC5235o) {
            this.f26803a.writeRawMessageSetExtension(i8, (AbstractC5235o) obj);
        } else {
            this.f26803a.writeMessageSetExtension(i8, (K0) obj);
        }
    }

    @Override // com.google.protobuf.R1
    public void writeSFixed32(int i8, int i9) {
        this.f26803a.writeSFixed32(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeSFixed32List(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeSFixed32(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeSFixed32SizeNoTag += AbstractC5248t.computeSFixed32SizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeSFixed32NoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeSFixed64(int i8, long j8) {
        this.f26803a.writeSFixed64(i8, j8);
    }

    @Override // com.google.protobuf.R1
    public void writeSFixed64List(int i8, List<Long> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeSFixed64(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeSFixed64SizeNoTag += AbstractC5248t.computeSFixed64SizeNoTag(list.get(i10).longValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeSFixed64NoTag(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeSInt32(int i8, int i9) {
        this.f26803a.writeSInt32(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeSInt32List(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeSInt32(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeSInt32SizeNoTag += AbstractC5248t.computeSInt32SizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeSInt32NoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeSInt64(int i8, long j8) {
        this.f26803a.writeSInt64(i8, j8);
    }

    @Override // com.google.protobuf.R1
    public void writeSInt64List(int i8, List<Long> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeSInt64(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeSInt64SizeNoTag += AbstractC5248t.computeSInt64SizeNoTag(list.get(i10).longValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeSInt64NoTag(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    @Deprecated
    public void writeStartGroup(int i8) {
        this.f26803a.writeTag(i8, 3);
    }

    @Override // com.google.protobuf.R1
    public void writeString(int i8, String str) {
        this.f26803a.writeString(i8, str);
    }

    @Override // com.google.protobuf.R1
    public void writeStringList(int i8, List<String> list) {
        int i9 = 0;
        if (!(list instanceof InterfaceC5249t0)) {
            while (i9 < list.size()) {
                this.f26803a.writeString(i8, list.get(i9));
                i9++;
            }
        } else {
            InterfaceC5249t0 interfaceC5249t0 = (InterfaceC5249t0) list;
            while (i9 < list.size()) {
                f(i8, interfaceC5249t0.getRaw(i9));
                i9++;
            }
        }
    }

    @Override // com.google.protobuf.R1
    public void writeUInt32(int i8, int i9) {
        this.f26803a.writeUInt32(i8, i9);
    }

    @Override // com.google.protobuf.R1
    public void writeUInt32List(int i8, List<Integer> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeUInt32(i8, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeUInt32SizeNoTag += AbstractC5248t.computeUInt32SizeNoTag(list.get(i10).intValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeUInt32NoTag(list.get(i9).intValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeUInt64(int i8, long j8) {
        this.f26803a.writeUInt64(i8, j8);
    }

    @Override // com.google.protobuf.R1
    public void writeUInt64List(int i8, List<Long> list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f26803a.writeUInt64(i8, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.f26803a.writeTag(i8, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeUInt64SizeNoTag += AbstractC5248t.computeUInt64SizeNoTag(list.get(i10).longValue());
        }
        this.f26803a.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i9 < list.size()) {
            this.f26803a.writeUInt64NoTag(list.get(i9).longValue());
            i9++;
        }
    }

    @Override // com.google.protobuf.R1
    public void writeGroup(int i8, Object obj, InterfaceC5219i1 interfaceC5219i1) {
        this.f26803a.l(i8, (K0) obj, interfaceC5219i1);
    }

    @Override // com.google.protobuf.R1
    public void writeMessage(int i8, Object obj, InterfaceC5219i1 interfaceC5219i1) {
        this.f26803a.n(i8, (K0) obj, interfaceC5219i1);
    }

    @Override // com.google.protobuf.R1
    public void writeGroupList(int i8, List<?> list, InterfaceC5219i1 interfaceC5219i1) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeGroup(i8, list.get(i9), interfaceC5219i1);
        }
    }

    @Override // com.google.protobuf.R1
    public void writeMessageList(int i8, List<?> list, InterfaceC5219i1 interfaceC5219i1) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeMessage(i8, list.get(i9), interfaceC5219i1);
        }
    }
}
