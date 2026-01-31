package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k1 */
/* loaded from: classes2.dex */
abstract class AbstractC5225k1 {

    /* renamed from: a */
    private static final Class f26562a = B();

    /* renamed from: b */
    private static final F1 f26563b = D(false);

    /* renamed from: c */
    private static final F1 f26564c = D(true);

    /* renamed from: d */
    private static final F1 f26565d = new I1();

    static Object A(Object obj, int i8, List list, AbstractC5227l0.e eVar, Object obj2, F1 f12) {
        if (eVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int iIntValue = num.intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = J(obj, i8, iIntValue, obj2, f12);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!eVar.isInRange(iIntValue2)) {
                    obj2 = J(obj, i8, iIntValue2, obj2, f12);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    private static Class B() {
        try {
            boolean z8 = AbstractC5209f0.alwaysUseFieldBuilders;
            return AbstractC5209f0.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object C(Class cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + K(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return L1.I(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static F1 D(boolean z8) {
        try {
            Class clsE = E();
            if (clsE == null) {
                return null;
            }
            return (F1) clsE.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class E() {
        return J1.class;
    }

    static void F(N n8, Object obj, Object obj2) {
        W extensions = n8.getExtensions(obj2);
        if (extensions.p()) {
            return;
        }
        n8.c(obj).mergeFrom(extensions);
    }

    static void G(D0 d02, Object obj, Object obj2, long j8) {
        L1.Z(obj, j8, d02.mergeFrom(L1.H(obj, j8), L1.H(obj2, j8)));
    }

    static void H(F1 f12, Object obj, Object obj2) {
        f12.p(obj, f12.k(f12.g(obj), f12.g(obj2)));
    }

    static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object J(Object obj, int i8, int i9, Object obj2, F1 f12) {
        if (obj2 == null) {
            obj2 = f12.f(obj);
        }
        f12.e(obj2, i8, i9);
        return obj2;
    }

    static String K(String str, boolean z8) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z8 = true;
                } else if (i8 != 0 || z8) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z8) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z8 = false;
        }
        return sb.toString();
    }

    private static void L(int i8, String str, R1 r12) {
        if (str == null || str.isEmpty()) {
            return;
        }
        r12.writeString(i8, str);
    }

    static int a(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(size) : size * AbstractC5248t.computeBoolSize(i8, true);
    }

    static int b(List list) {
        return list.size();
    }

    static int c(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * AbstractC5248t.computeTagSize(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            iComputeTagSize += AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) list.get(i9));
        }
        return iComputeTagSize;
    }

    static int d(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iE) : iE + (size * AbstractC5248t.computeTagSize(i8));
    }

    static int e(List list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5224k0) {
            C5224k0 c5224k0 = (C5224k0) list;
            iComputeEnumSizeNoTag = 0;
            while (i8 < size) {
                iComputeEnumSizeNoTag += AbstractC5248t.computeEnumSizeNoTag(c5224k0.getInt(i8));
                i8++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i8 < size) {
                iComputeEnumSizeNoTag += AbstractC5248t.computeEnumSizeNoTag(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    static int f(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(size * 4) : size * AbstractC5248t.computeFixed32Size(i8, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(size * 8) : size * AbstractC5248t.computeFixed64Size(i8, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i8, List list, InterfaceC5219i1 interfaceC5219i1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iB += AbstractC5248t.b(i8, (K0) list.get(i9), interfaceC5219i1);
        }
        return iB;
    }

    static int k(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iL) : iL + (size * AbstractC5248t.computeTagSize(i8));
    }

    static int l(List list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5224k0) {
            C5224k0 c5224k0 = (C5224k0) list;
            iComputeInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeInt32SizeNoTag += AbstractC5248t.computeInt32SizeNoTag(c5224k0.getInt(i8));
                i8++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeInt32SizeNoTag += AbstractC5248t.computeInt32SizeNoTag(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    static int m(int i8, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iN) : iN + (list.size() * AbstractC5248t.computeTagSize(i8));
    }

    static int n(List list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5270x0) {
            C5270x0 c5270x0 = (C5270x0) list;
            iComputeInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeInt64SizeNoTag += AbstractC5248t.computeInt64SizeNoTag(c5270x0.getLong(i8));
                i8++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeInt64SizeNoTag += AbstractC5248t.computeInt64SizeNoTag(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    static int o(int i8, Object obj, InterfaceC5219i1 interfaceC5219i1) {
        return obj instanceof C5244r0 ? AbstractC5248t.computeLazyFieldSize(i8, (C5244r0) obj) : AbstractC5248t.e(i8, (K0) obj, interfaceC5219i1);
    }

    static int p(int i8, List list, InterfaceC5219i1 interfaceC5219i1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC5248t.computeTagSize(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            iComputeTagSize += obj instanceof C5244r0 ? AbstractC5248t.computeLazyFieldSizeNoTag((C5244r0) obj) : AbstractC5248t.f((K0) obj, interfaceC5219i1);
        }
        return iComputeTagSize;
    }

    public static F1 proto2UnknownFieldSetSchema() {
        return f26563b;
    }

    public static F1 proto3UnknownFieldSetSchema() {
        return f26564c;
    }

    static int q(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iR) : iR + (size * AbstractC5248t.computeTagSize(i8));
    }

    static int r(List list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5224k0) {
            C5224k0 c5224k0 = (C5224k0) list;
            iComputeSInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeSInt32SizeNoTag += AbstractC5248t.computeSInt32SizeNoTag(c5224k0.getInt(i8));
                i8++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeSInt32SizeNoTag += AbstractC5248t.computeSInt32SizeNoTag(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class cls2;
        if (!AbstractC5206e0.class.isAssignableFrom(cls) && (cls2 = f26562a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static int s(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iT) : iT + (size * AbstractC5248t.computeTagSize(i8));
    }

    public static boolean shouldUseTableSwitch(int i8, int i9, int i10) {
        if (i9 < 40) {
            return true;
        }
        long j8 = i9 - i8;
        long j9 = i10;
        return j8 + 10 <= ((2 * j9) + 3) + ((j9 + 3) * 3);
    }

    static int t(List list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5270x0) {
            C5270x0 c5270x0 = (C5270x0) list;
            iComputeSInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeSInt64SizeNoTag += AbstractC5248t.computeSInt64SizeNoTag(c5270x0.getLong(i8));
                i8++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeSInt64SizeNoTag += AbstractC5248t.computeSInt64SizeNoTag(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    static int u(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC5248t.computeTagSize(i8) * size;
        if (list instanceof InterfaceC5249t0) {
            InterfaceC5249t0 interfaceC5249t0 = (InterfaceC5249t0) list;
            while (i9 < size) {
                Object raw = interfaceC5249t0.getRaw(i9);
                iComputeTagSize += raw instanceof AbstractC5235o ? AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) raw) : AbstractC5248t.computeStringSizeNoTag((String) raw);
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                iComputeTagSize += obj instanceof AbstractC5235o ? AbstractC5248t.computeBytesSizeNoTag((AbstractC5235o) obj) : AbstractC5248t.computeStringSizeNoTag((String) obj);
                i9++;
            }
        }
        return iComputeTagSize;
    }

    public static F1 unknownFieldSetLiteSchema() {
        return f26565d;
    }

    static int v(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iW) : iW + (size * AbstractC5248t.computeTagSize(i8));
    }

    static int w(List list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5224k0) {
            C5224k0 c5224k0 = (C5224k0) list;
            iComputeUInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeUInt32SizeNoTag += AbstractC5248t.computeUInt32SizeNoTag(c5224k0.getInt(i8));
                i8++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i8 < size) {
                iComputeUInt32SizeNoTag += AbstractC5248t.computeUInt32SizeNoTag(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    public static void writeBool(int i8, boolean z8, R1 r12) {
        if (z8) {
            r12.writeBool(i8, true);
        }
    }

    public static void writeBoolList(int i8, List<Boolean> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeBoolList(i8, list, z8);
    }

    public static void writeBytes(int i8, AbstractC5235o abstractC5235o, R1 r12) {
        if (abstractC5235o == null || abstractC5235o.isEmpty()) {
            return;
        }
        r12.writeBytes(i8, abstractC5235o);
    }

    public static void writeBytesList(int i8, List<AbstractC5235o> list, R1 r12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeBytesList(i8, list);
    }

    public static void writeDouble(int i8, double d9, R1 r12) {
        if (Double.doubleToRawLongBits(d9) != 0) {
            r12.writeDouble(i8, d9);
        }
    }

    public static void writeDoubleList(int i8, List<Double> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeDoubleList(i8, list, z8);
    }

    public static void writeEnum(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeEnum(i8, i9);
        }
    }

    public static void writeEnumList(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeEnumList(i8, list, z8);
    }

    public static void writeFixed32(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeFixed32(i8, i9);
        }
    }

    public static void writeFixed32List(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeFixed32List(i8, list, z8);
    }

    public static void writeFixed64(int i8, long j8, R1 r12) {
        if (j8 != 0) {
            r12.writeFixed64(i8, j8);
        }
    }

    public static void writeFixed64List(int i8, List<Long> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeFixed64List(i8, list, z8);
    }

    public static void writeFloat(int i8, float f8, R1 r12) {
        if (Float.floatToRawIntBits(f8) != 0) {
            r12.writeFloat(i8, f8);
        }
    }

    public static void writeFloatList(int i8, List<Float> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeFloatList(i8, list, z8);
    }

    public static void writeGroupList(int i8, List<?> list, R1 r12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeGroupList(i8, list);
    }

    public static void writeInt32(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeInt32(i8, i9);
        }
    }

    public static void writeInt32List(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeInt32List(i8, list, z8);
    }

    public static void writeInt64(int i8, long j8, R1 r12) {
        if (j8 != 0) {
            r12.writeInt64(i8, j8);
        }
    }

    public static void writeInt64List(int i8, List<Long> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeInt64List(i8, list, z8);
    }

    public static void writeLazyFieldList(int i8, List<?> list, R1 r12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((C5244r0) it.next()).d(r12, i8);
        }
    }

    public static void writeMessage(int i8, Object obj, R1 r12) {
        if (obj != null) {
            r12.writeMessage(i8, obj);
        }
    }

    public static void writeMessageList(int i8, List<?> list, R1 r12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeMessageList(i8, list);
    }

    public static void writeSFixed32(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeSFixed32(i8, i9);
        }
    }

    public static void writeSFixed32List(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeSFixed32List(i8, list, z8);
    }

    public static void writeSFixed64(int i8, long j8, R1 r12) {
        if (j8 != 0) {
            r12.writeSFixed64(i8, j8);
        }
    }

    public static void writeSFixed64List(int i8, List<Long> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeSFixed64List(i8, list, z8);
    }

    public static void writeSInt32(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeSInt32(i8, i9);
        }
    }

    public static void writeSInt32List(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeSInt32List(i8, list, z8);
    }

    public static void writeSInt64(int i8, long j8, R1 r12) {
        if (j8 != 0) {
            r12.writeSInt64(i8, j8);
        }
    }

    public static void writeSInt64List(int i8, List<Long> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeSInt64List(i8, list, z8);
    }

    public static void writeString(int i8, Object obj, R1 r12) {
        if (obj instanceof String) {
            L(i8, (String) obj, r12);
        } else {
            writeBytes(i8, (AbstractC5235o) obj, r12);
        }
    }

    public static void writeStringList(int i8, List<String> list, R1 r12) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeStringList(i8, list);
    }

    public static void writeUInt32(int i8, int i9, R1 r12) {
        if (i9 != 0) {
            r12.writeUInt32(i8, i9);
        }
    }

    public static void writeUInt32List(int i8, List<Integer> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeUInt32List(i8, list, z8);
    }

    public static void writeUInt64(int i8, long j8, R1 r12) {
        if (j8 != 0) {
            r12.writeUInt64(i8, j8);
        }
    }

    public static void writeUInt64List(int i8, List<Long> list, R1 r12, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeUInt64List(i8, list, z8);
    }

    static int x(int i8, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z8 ? AbstractC5248t.computeTagSize(i8) + AbstractC5248t.d(iY) : iY + (size * AbstractC5248t.computeTagSize(i8));
    }

    static int y(List list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5270x0) {
            C5270x0 c5270x0 = (C5270x0) list;
            iComputeUInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeUInt64SizeNoTag += AbstractC5248t.computeUInt64SizeNoTag(c5270x0.getLong(i8));
                i8++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i8 < size) {
                iComputeUInt64SizeNoTag += AbstractC5248t.computeUInt64SizeNoTag(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    static Object z(Object obj, int i8, List list, AbstractC5227l0.d dVar, Object obj2, F1 f12) {
        if (dVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) list.get(i10);
                int iIntValue = num.intValue();
                if (dVar.findValueByNumber(iIntValue) != null) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    obj2 = J(obj, i8, iIntValue, obj2, f12);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (dVar.findValueByNumber(iIntValue2) == null) {
                    obj2 = J(obj, i8, iIntValue2, obj2, f12);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static boolean shouldUseTableSwitch(S[] sArr) {
        if (sArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(sArr[0].getFieldNumber(), sArr[sArr.length - 1].getFieldNumber(), sArr.length);
    }

    public static void writeGroupList(int i8, List<?> list, R1 r12, InterfaceC5219i1 interfaceC5219i1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeGroupList(i8, list, interfaceC5219i1);
    }

    public static void writeMessageList(int i8, List<?> list, R1 r12, InterfaceC5219i1 interfaceC5219i1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r12.writeMessageList(i8, list, interfaceC5219i1);
    }
}
