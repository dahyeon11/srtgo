package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class g {
    public static final long BYTES_OFFSET_UNKNOWN = -1;

    /* renamed from: a, reason: collision with root package name */
    static final Charset f7681a = StandardCharsets.US_ASCII;

    /* renamed from: b, reason: collision with root package name */
    static final String[] f7682b = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f7683c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: d, reason: collision with root package name */
    static final byte[] f7684d = {65, 83, 67, 73, 73, 0, 0, 0};
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;

    g(int i8, int i9, byte[] bArr) {
        this(i8, i9, -1L, bArr);
    }

    public static g createByte(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f7681a);
        return new g(1, bytes.length, bytes);
    }

    public static g createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d9 : dArr) {
            byteBufferWrap.putDouble(d9);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i8 : iArr) {
            byteBufferWrap.putInt(i8);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g createSRational(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[10] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(10, kVarArr.length, byteBufferWrap.array());
    }

    public static g createString(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f7681a);
        return new g(2, bytes.length, bytes);
    }

    public static g createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j8 : jArr) {
            byteBufferWrap.putInt((int) j8);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g createURational(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[5] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(5, kVarArr.length, byteBufferWrap.array());
    }

    public static g createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f7683c[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i8 : iArr) {
            byteBufferWrap.putShort((short) i8);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:17:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.Object a(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.g.a(java.nio.ByteOrder):java.lang.Object");
    }

    public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objA instanceof String) {
            return Double.parseDouble((String) objA);
        }
        if (objA instanceof long[]) {
            if (((long[]) objA).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objA instanceof int[]) {
            if (((int[]) objA).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objA instanceof double[]) {
            double[] dArr = (double[]) objA;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objA instanceof k[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        k[] kVarArr = (k[]) objA;
        if (kVarArr.length == 1) {
            return kVarArr[0].c();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public int getIntValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objA instanceof String) {
            return Integer.parseInt((String) objA);
        }
        if (objA instanceof long[]) {
            long[] jArr = (long[]) objA;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objA instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objA;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public String getStringValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            return null;
        }
        if (objA instanceof String) {
            return (String) objA;
        }
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        if (objA instanceof long[]) {
            long[] jArr = (long[]) objA;
            while (i8 < jArr.length) {
                sb.append(jArr[i8]);
                i8++;
                if (i8 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objA instanceof int[]) {
            int[] iArr = (int[]) objA;
            while (i8 < iArr.length) {
                sb.append(iArr[i8]);
                i8++;
                if (i8 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objA instanceof double[]) {
            double[] dArr = (double[]) objA;
            while (i8 < dArr.length) {
                sb.append(dArr[i8]);
                i8++;
                if (i8 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objA instanceof k[])) {
            return null;
        }
        k[] kVarArr = (k[]) objA;
        while (i8 < kVarArr.length) {
            sb.append(kVarArr[i8].b());
            sb.append('/');
            sb.append(kVarArr[i8].a());
            i8++;
            if (i8 != kVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public int size() {
        return f7683c[this.format] * this.numberOfComponents;
    }

    public String toString() {
        return "(" + f7682b[this.format] + ", data length:" + this.bytes.length + ")";
    }

    g(int i8, int i9, long j8, byte[] bArr) {
        this.format = i8;
        this.numberOfComponents = i9;
        this.bytesOffset = j8;
        this.bytes = bArr;
    }

    public static g createDouble(double d9, ByteOrder byteOrder) {
        return createDouble(new double[]{d9}, byteOrder);
    }

    public static g createSLong(int i8, ByteOrder byteOrder) {
        return createSLong(new int[]{i8}, byteOrder);
    }

    public static g createULong(long j8, ByteOrder byteOrder) {
        return createULong(new long[]{j8}, byteOrder);
    }

    public static g createUShort(int i8, ByteOrder byteOrder) {
        return createUShort(new int[]{i8}, byteOrder);
    }

    public static g createSRational(k kVar, ByteOrder byteOrder) {
        return createSRational(new k[]{kVar}, byteOrder);
    }

    public static g createURational(k kVar, ByteOrder byteOrder) {
        return createURational(new k[]{kVar}, byteOrder);
    }
}
