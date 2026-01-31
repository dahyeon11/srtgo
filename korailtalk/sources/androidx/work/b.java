package androidx.work;

import H0.l;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public static final int MAX_DATA_BYTES = 10240;

    /* renamed from: a, reason: collision with root package name */
    Map f11135a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f11134b = l.tagWithPrefix("Data");
    public static final b EMPTY = new a().build();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Map f11136a = new HashMap();

        public b build() throws Throwable {
            b bVar = new b((Map<String, ?>) this.f11136a);
            b.toByteArrayInternal(bVar);
            return bVar;
        }

        public a put(String str, Object obj) {
            if (obj == null) {
                this.f11136a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f11136a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f11136a.put(str, b.convertPrimitiveBooleanArray((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f11136a.put(str, b.convertPrimitiveByteArray((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f11136a.put(str, b.convertPrimitiveIntArray((int[]) obj));
                } else if (cls == long[].class) {
                    this.f11136a.put(str, b.convertPrimitiveLongArray((long[]) obj));
                } else if (cls == float[].class) {
                    this.f11136a.put(str, b.convertPrimitiveFloatArray((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f11136a.put(str, b.convertPrimitiveDoubleArray((double[]) obj));
                }
            }
            return this;
        }

        public a putAll(b bVar) {
            putAll(bVar.f11135a);
            return this;
        }

        public a putBoolean(String str, boolean z8) {
            this.f11136a.put(str, Boolean.valueOf(z8));
            return this;
        }

        public a putBooleanArray(String str, boolean[] zArr) {
            this.f11136a.put(str, b.convertPrimitiveBooleanArray(zArr));
            return this;
        }

        public a putByte(String str, byte b9) {
            this.f11136a.put(str, Byte.valueOf(b9));
            return this;
        }

        public a putByteArray(String str, byte[] bArr) {
            this.f11136a.put(str, b.convertPrimitiveByteArray(bArr));
            return this;
        }

        public a putDouble(String str, double d9) {
            this.f11136a.put(str, Double.valueOf(d9));
            return this;
        }

        public a putDoubleArray(String str, double[] dArr) {
            this.f11136a.put(str, b.convertPrimitiveDoubleArray(dArr));
            return this;
        }

        public a putFloat(String str, float f8) {
            this.f11136a.put(str, Float.valueOf(f8));
            return this;
        }

        public a putFloatArray(String str, float[] fArr) {
            this.f11136a.put(str, b.convertPrimitiveFloatArray(fArr));
            return this;
        }

        public a putInt(String str, int i8) {
            this.f11136a.put(str, Integer.valueOf(i8));
            return this;
        }

        public a putIntArray(String str, int[] iArr) {
            this.f11136a.put(str, b.convertPrimitiveIntArray(iArr));
            return this;
        }

        public a putLong(String str, long j8) {
            this.f11136a.put(str, Long.valueOf(j8));
            return this;
        }

        public a putLongArray(String str, long[] jArr) {
            this.f11136a.put(str, b.convertPrimitiveLongArray(jArr));
            return this;
        }

        public a putString(String str, String str2) {
            this.f11136a.put(str, str2);
            return this;
        }

        public a putStringArray(String str, String[] strArr) {
            this.f11136a.put(str, strArr);
            return this;
        }

        public a putAll(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public b(b bVar) {
        this.f11135a = new HashMap(bVar.f11135a);
    }

    public static Boolean[] convertPrimitiveBooleanArray(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i8 = 0; i8 < zArr.length; i8++) {
            boolArr[i8] = Boolean.valueOf(zArr[i8]);
        }
        return boolArr;
    }

    public static Byte[] convertPrimitiveByteArray(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = Byte.valueOf(bArr[i8]);
        }
        return bArr2;
    }

    public static Double[] convertPrimitiveDoubleArray(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr2[i8] = Double.valueOf(dArr[i8]);
        }
        return dArr2;
    }

    public static Float[] convertPrimitiveFloatArray(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr2[i8] = Float.valueOf(fArr[i8]);
        }
        return fArr2;
    }

    public static Integer[] convertPrimitiveIntArray(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        return numArr;
    }

    public static Long[] convertPrimitiveLongArray(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i8 = 0; i8 < jArr.length; i8++) {
            lArr[i8] = Long.valueOf(jArr[i8]);
        }
        return lArr;
    }

    public static boolean[] convertToPrimitiveArray(Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i8 = 0; i8 < boolArr.length; i8++) {
            zArr[i8] = boolArr[i8].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.b fromByteArray(byte[] r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L82
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L46 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4f
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
        L1b:
            if (r7 <= 0) goto L31
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L2b java.lang.ClassNotFoundException -> L2d java.io.IOException -> L2f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            r7 = move-exception
            goto L51
        L31:
            r3.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f11134b
            android.util.Log.e(r3, r0, r7)
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L65
        L3f:
            r7 = move-exception
            java.lang.String r2 = androidx.work.b.f11134b
            android.util.Log.e(r2, r0, r7)
            goto L65
        L46:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L6b
        L4a:
            r3 = move-exception
        L4b:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L51
        L4f:
            r3 = move-exception
            goto L4b
        L51:
            java.lang.String r4 = androidx.work.b.f11134b     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r3 = androidx.work.b.f11134b
            android.util.Log.e(r3, r0, r7)
        L62:
            r2.close()     // Catch: java.io.IOException -> L3f
        L65:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L6b:
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.io.IOException -> L71
            goto L77
        L71:
            r1 = move-exception
            java.lang.String r3 = androidx.work.b.f11134b
            android.util.Log.e(r3, r0, r1)
        L77:
            r2.close()     // Catch: java.io.IOException -> L7b
            goto L81
        L7b:
            r1 = move-exception
            java.lang.String r2 = androidx.work.b.f11134b
            android.util.Log.e(r2, r0, r1)
        L81:
            throw r7
        L82:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.b.fromByteArray(byte[]):androidx.work.b");
    }

    public static byte[] toByteArrayInternal(b bVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(bVar.size());
                    for (Map.Entry entry : bVar.f11135a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e8) {
                        Log.e(f11134b, "Error in Data#toByteArray: ", e8);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e9) {
                        Log.e(f11134b, "Error in Data#toByteArray: ", e9);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e10) {
                    e = e10;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f11134b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e11) {
                            Log.e(f11134b, "Error in Data#toByteArray: ", e11);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        Log.e(f11134b, "Error in Data#toByteArray: ", e12);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f11134b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e14) {
                        Log.e(f11134b, "Error in Data#toByteArray: ", e14);
                        throw th;
                    }
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> setKeySet = this.f11135a.keySet();
        if (!setKeySet.equals(bVar.f11135a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f11135a.get(str);
            Object obj3 = bVar.f11135a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(String str, boolean z8) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z8;
    }

    public boolean[] getBooleanArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Boolean[]) {
            return convertToPrimitiveArray((Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(String str, byte b9) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : b9;
    }

    public byte[] getByteArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Byte[]) {
            return convertToPrimitiveArray((Byte[]) obj);
        }
        return null;
    }

    public double getDouble(String str, double d9) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d9;
    }

    public double[] getDoubleArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Double[]) {
            return convertToPrimitiveArray((Double[]) obj);
        }
        return null;
    }

    public float getFloat(String str, float f8) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f8;
    }

    public float[] getFloatArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Float[]) {
            return convertToPrimitiveArray((Float[]) obj);
        }
        return null;
    }

    public int getInt(String str, int i8) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i8;
    }

    public int[] getIntArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Integer[]) {
            return convertToPrimitiveArray((Integer[]) obj);
        }
        return null;
    }

    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.f11135a);
    }

    public long getLong(String str, long j8) {
        Object obj = this.f11135a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j8;
    }

    public long[] getLongArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof Long[]) {
            return convertToPrimitiveArray((Long[]) obj);
        }
        return null;
    }

    public String getString(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public String[] getStringArray(String str) {
        Object obj = this.f11135a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean hasKeyWithValueOfType(String str, Class<T> cls) {
        Object obj = this.f11135a.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        return this.f11135a.hashCode() * 31;
    }

    public int size() {
        return this.f11135a.size();
    }

    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f11135a.isEmpty()) {
            for (String str : this.f11135a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f11135a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b(Map<String, ?> map) {
        this.f11135a = new HashMap(map);
    }

    public static byte[] convertToPrimitiveArray(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    public static int[] convertToPrimitiveArray(Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i8 = 0; i8 < numArr.length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    public static long[] convertToPrimitiveArray(Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i8 = 0; i8 < lArr.length; i8++) {
            jArr[i8] = lArr[i8].longValue();
        }
        return jArr;
    }

    public static float[] convertToPrimitiveArray(Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr2[i8] = fArr[i8].floatValue();
        }
        return fArr2;
    }

    public static double[] convertToPrimitiveArray(Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr2[i8] = dArr[i8].doubleValue();
        }
        return dArr2;
    }
}
