package R7;

import Q7.C0708l;
import Q7.O;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private int f4500a = 0;

    private void a(Object obj, Object obj2, Comparator comparator) {
        if (obj instanceof long[]) {
            append((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            append((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            append((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            append((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            append((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            append((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj, (boolean[]) obj2);
        } else {
            append((Object[]) obj, (Object[]) obj2, (Comparator<?>) comparator);
        }
    }

    private static void b(Object obj, Object obj2, Class cls, b bVar, boolean z8, String[] strArr) throws SecurityException {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i8 = 0; i8 < declaredFields.length && bVar.f4500a == 0; i8++) {
            Field field = declaredFields[i8];
            if (!C0708l.contains(strArr, field.getName()) && !field.getName().contains("$") && ((z8 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                bVar.append(i.a(field, obj), i.a(field, obj2));
            }
        }
    }

    public static int reflectionCompare(Object obj, Object obj2) {
        return reflectionCompare(obj, obj2, false, null, new String[0]);
    }

    public b append(boolean z8, boolean z9) {
        if (this.f4500a != 0 || z8 == z9) {
            return this;
        }
        if (z8) {
            this.f4500a = 1;
        } else {
            this.f4500a = -1;
        }
        return this;
    }

    public b appendSuper(int i8) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = i8;
        return this;
    }

    public int toComparison() {
        return this.f4500a;
    }

    public static int reflectionCompare(Object obj, Object obj2, boolean z8) {
        return reflectionCompare(obj, obj2, z8, null, new String[0]);
    }

    @Override // R7.a
    public Integer build() {
        return Integer.valueOf(toComparison());
    }

    public static int reflectionCompare(Object obj, Object obj2, boolean z8, Class<?> cls, String... strArr) throws SecurityException {
        if (obj == obj2) {
            return 0;
        }
        Objects.requireNonNull(obj, "lhs");
        Objects.requireNonNull(obj2, "rhs");
        Class<?> superclass = obj.getClass();
        if (superclass.isInstance(obj2)) {
            b bVar = new b();
            b(obj, obj2, superclass, bVar, z8, strArr);
            while (superclass.getSuperclass() != null && superclass != cls) {
                superclass = superclass.getSuperclass();
                b(obj, obj2, superclass, bVar, z8, strArr);
            }
            return bVar.toComparison();
        }
        throw new ClassCastException();
    }

    public b append(boolean[] zArr, boolean[] zArr2) {
        if (this.f4500a != 0 || zArr == zArr2) {
            return this;
        }
        if (zArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (zArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (zArr.length != zArr2.length) {
            this.f4500a = zArr.length >= zArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < zArr.length && this.f4500a == 0; i8++) {
            append(zArr[i8], zArr2[i8]);
        }
        return this;
    }

    public b append(byte b9, byte b10) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Byte.compare(b9, b10);
        return this;
    }

    public b append(byte[] bArr, byte[] bArr2) {
        if (this.f4500a != 0 || bArr == bArr2) {
            return this;
        }
        if (bArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (bArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (bArr.length != bArr2.length) {
            this.f4500a = bArr.length >= bArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < bArr.length && this.f4500a == 0; i8++) {
            append(bArr[i8], bArr2[i8]);
        }
        return this;
    }

    public static int reflectionCompare(Object obj, Object obj2, Collection<String> collection) {
        return reflectionCompare(obj, obj2, l.f(collection));
    }

    public static int reflectionCompare(Object obj, Object obj2, String... strArr) {
        return reflectionCompare(obj, obj2, false, null, strArr);
    }

    public b append(char c9, char c10) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Character.compare(c9, c10);
        return this;
    }

    public b append(char[] cArr, char[] cArr2) {
        if (this.f4500a != 0 || cArr == cArr2) {
            return this;
        }
        if (cArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (cArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (cArr.length != cArr2.length) {
            this.f4500a = cArr.length >= cArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < cArr.length && this.f4500a == 0; i8++) {
            append(cArr[i8], cArr2[i8]);
        }
        return this;
    }

    public b append(double d9, double d10) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Double.compare(d9, d10);
        return this;
    }

    public b append(double[] dArr, double[] dArr2) {
        if (this.f4500a != 0 || dArr == dArr2) {
            return this;
        }
        if (dArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (dArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (dArr.length != dArr2.length) {
            this.f4500a = dArr.length >= dArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < dArr.length && this.f4500a == 0; i8++) {
            append(dArr[i8], dArr2[i8]);
        }
        return this;
    }

    public b append(float f8, float f9) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Float.compare(f8, f9);
        return this;
    }

    public b append(float[] fArr, float[] fArr2) {
        if (this.f4500a != 0 || fArr == fArr2) {
            return this;
        }
        if (fArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (fArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (fArr.length != fArr2.length) {
            this.f4500a = fArr.length >= fArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < fArr.length && this.f4500a == 0; i8++) {
            append(fArr[i8], fArr2[i8]);
        }
        return this;
    }

    public b append(int i8, int i9) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Integer.compare(i8, i9);
        return this;
    }

    public b append(int[] iArr, int[] iArr2) {
        if (this.f4500a != 0 || iArr == iArr2) {
            return this;
        }
        if (iArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (iArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (iArr.length != iArr2.length) {
            this.f4500a = iArr.length >= iArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < iArr.length && this.f4500a == 0; i8++) {
            append(iArr[i8], iArr2[i8]);
        }
        return this;
    }

    public b append(long j8, long j9) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Long.compare(j8, j9);
        return this;
    }

    public b append(long[] jArr, long[] jArr2) {
        if (this.f4500a != 0 || jArr == jArr2) {
            return this;
        }
        if (jArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (jArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (jArr.length != jArr2.length) {
            this.f4500a = jArr.length >= jArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < jArr.length && this.f4500a == 0; i8++) {
            append(jArr[i8], jArr2[i8]);
        }
        return this;
    }

    public b append(Object obj, Object obj2) {
        return append(obj, obj2, (Comparator<?>) null);
    }

    public b append(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f4500a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f4500a = -1;
            return this;
        }
        if (obj2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (O.isArray(obj)) {
            a(obj, obj2, comparator);
        } else if (comparator == null) {
            this.f4500a = ((Comparable) obj).compareTo(obj2);
        } else {
            this.f4500a = comparator.compare(obj, obj2);
        }
        return this;
    }

    public b append(Object[] objArr, Object[] objArr2) {
        return append(objArr, objArr2, (Comparator<?>) null);
    }

    public b append(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f4500a != 0 || objArr == objArr2) {
            return this;
        }
        if (objArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (objArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (objArr.length != objArr2.length) {
            this.f4500a = objArr.length >= objArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < objArr.length && this.f4500a == 0; i8++) {
            append(objArr[i8], objArr2[i8], comparator);
        }
        return this;
    }

    public b append(short s8, short s9) {
        if (this.f4500a != 0) {
            return this;
        }
        this.f4500a = Short.compare(s8, s9);
        return this;
    }

    public b append(short[] sArr, short[] sArr2) {
        if (this.f4500a != 0 || sArr == sArr2) {
            return this;
        }
        if (sArr == null) {
            this.f4500a = -1;
            return this;
        }
        if (sArr2 == null) {
            this.f4500a = 1;
            return this;
        }
        if (sArr.length != sArr2.length) {
            this.f4500a = sArr.length >= sArr2.length ? 1 : -1;
            return this;
        }
        for (int i8 = 0; i8 < sArr.length && this.f4500a == 0; i8++) {
            append(sArr[i8], sArr2[i8]);
        }
        return this;
    }
}
