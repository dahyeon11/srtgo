package R7;

import Q7.C;
import Q7.C0708l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f4501g = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private boolean f4502a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4503b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4504c;

    /* renamed from: d, reason: collision with root package name */
    private List f4505d;

    /* renamed from: e, reason: collision with root package name */
    private Class f4506e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f4507f;

    public c() {
        ArrayList arrayList = new ArrayList(1);
        this.f4505d = arrayList;
        arrayList.add(String.class);
    }

    private void a(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            g(false);
            return;
        }
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
            append((Object[]) obj, (Object[]) obj2);
        }
    }

    static a8.b b(Object obj, Object obj2) {
        return a8.b.of(new h(obj), new h(obj2));
    }

    static Set c() {
        return (Set) f4501g.get();
    }

    static boolean d(Object obj, Object obj2) {
        Set setC = c();
        a8.b bVarB = b(obj, obj2);
        return setC != null && (setC.contains(bVarB) || setC.contains(a8.b.of((h) bVarB.getRight(), (h) bVarB.getLeft())));
    }

    private void e(Object obj, Object obj2, Class cls) {
        if (d(obj, obj2)) {
            return;
        }
        try {
            f(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i8 = 0; i8 < declaredFields.length && this.f4502a; i8++) {
                Field field = declaredFields[i8];
                if (!C0708l.contains(this.f4507f, field.getName()) && !field.getName().contains("$") && (this.f4503b || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(d.class)) {
                        append(i.a(field, obj), i.a(field, obj2));
                    }
                }
            }
            h(obj, obj2);
        } catch (Throwable th) {
            h(obj, obj2);
            throw th;
        }
    }

    private static void f(Object obj, Object obj2) {
        Set setC = c();
        if (setC == null) {
            setC = new HashSet();
            f4501g.set(setC);
        }
        setC.add(b(obj, obj2));
    }

    private static void h(Object obj, Object obj2) {
        Set setC = c();
        if (setC != null) {
            setC.remove(b(obj, obj2));
            if (setC.isEmpty()) {
                f4501g.remove();
            }
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z8) {
        return reflectionEquals(obj, obj2, z8, null, new String[0]);
    }

    public c append(boolean z8, boolean z9) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = z8 == z9;
        return this;
    }

    public c appendSuper(boolean z8) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = z8;
        return this;
    }

    protected void g(boolean z8) {
        this.f4502a = z8;
    }

    public boolean isEquals() {
        return this.f4502a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R7.c reflectionAppend(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4502a
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = 0
            if (r6 == 0) goto L70
            if (r7 != 0) goto Le
            goto L70
        Le:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            boolean r3 = r1.isInstance(r7)
            if (r3 == 0) goto L23
            boolean r3 = r2.isInstance(r6)
            if (r3 != 0) goto L2f
            goto L31
        L23:
            boolean r3 = r2.isInstance(r6)
            if (r3 == 0) goto L6d
            boolean r3 = r1.isInstance(r7)
            if (r3 != 0) goto L31
        L2f:
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            boolean r4 = r3.isArray()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r4 == 0) goto L3c
            r5.append(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L3c:
            java.util.List r4 = r5.f4505d     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r4 == 0) goto L55
            boolean r1 = r4.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 != 0) goto L4e
            java.util.List r1 = r5.f4505d     // Catch: java.lang.IllegalArgumentException -> L6a
            boolean r1 = r1.contains(r2)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 == 0) goto L55
        L4e:
            boolean r6 = r6.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L6a
            r5.f4502a = r6     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L55:
            r5.e(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6a
        L58:
            java.lang.Class r1 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 == 0) goto L6c
            java.lang.Class r1 = r5.f4506e     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r3 == r1) goto L6c
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            r5.e(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L58
        L6a:
            r5.f4502a = r0
        L6c:
            return r5
        L6d:
            r5.f4502a = r0
            return r5
        L70:
            r5.f4502a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: R7.c.reflectionAppend(java.lang.Object, java.lang.Object):R7.c");
    }

    public void reset() {
        this.f4502a = true;
    }

    public c setBypassReflectionClasses(List<Class<?>> list) {
        this.f4505d = list;
        return this;
    }

    public c setExcludeFields(String... strArr) {
        this.f4507f = strArr;
        return this;
    }

    public c setReflectUpToClass(Class<?> cls) {
        this.f4506e = cls;
        return this;
    }

    public c setTestRecursive(boolean z8) {
        this.f4504c = z8;
        return this;
    }

    public c setTestTransients(boolean z8) {
        this.f4503b = z8;
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z8, Class<?> cls, boolean z9, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return new c().setExcludeFields(strArr).setReflectUpToClass(cls).setTestTransients(z8).setTestRecursive(z9).reflectionAppend(obj, obj2).isEquals();
    }

    @Override // R7.a
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

    public c append(boolean[] zArr, boolean[] zArr2) {
        if (!this.f4502a || zArr == zArr2) {
            return this;
        }
        if (zArr != null && zArr2 != null) {
            if (zArr.length != zArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < zArr.length && this.f4502a; i8++) {
                append(zArr[i8], zArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z8, Class<?> cls, String... strArr) {
        return reflectionEquals(obj, obj2, z8, cls, false, strArr);
    }

    public c append(byte b9, byte b10) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = b9 == b10;
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection<String> collection) {
        return reflectionEquals(obj, obj2, l.f(collection));
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String... strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    public c append(byte[] bArr, byte[] bArr2) {
        if (!this.f4502a || bArr == bArr2) {
            return this;
        }
        if (bArr != null && bArr2 != null) {
            if (bArr.length != bArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < bArr.length && this.f4502a; i8++) {
                append(bArr[i8], bArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(char c9, char c10) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = c9 == c10;
        return this;
    }

    public c append(char[] cArr, char[] cArr2) {
        if (!this.f4502a || cArr == cArr2) {
            return this;
        }
        if (cArr != null && cArr2 != null) {
            if (cArr.length != cArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < cArr.length && this.f4502a; i8++) {
                append(cArr[i8], cArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(double d9, double d10) {
        return !this.f4502a ? this : append(Double.doubleToLongBits(d9), Double.doubleToLongBits(d10));
    }

    public c append(double[] dArr, double[] dArr2) {
        if (!this.f4502a || dArr == dArr2) {
            return this;
        }
        if (dArr != null && dArr2 != null) {
            if (dArr.length != dArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < dArr.length && this.f4502a; i8++) {
                append(dArr[i8], dArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(float f8, float f9) {
        return !this.f4502a ? this : append(Float.floatToIntBits(f8), Float.floatToIntBits(f9));
    }

    public c append(float[] fArr, float[] fArr2) {
        if (!this.f4502a || fArr == fArr2) {
            return this;
        }
        if (fArr != null && fArr2 != null) {
            if (fArr.length != fArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < fArr.length && this.f4502a; i8++) {
                append(fArr[i8], fArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(int i8, int i9) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = i8 == i9;
        return this;
    }

    public c append(int[] iArr, int[] iArr2) {
        if (!this.f4502a || iArr == iArr2) {
            return this;
        }
        if (iArr != null && iArr2 != null) {
            if (iArr.length != iArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < iArr.length && this.f4502a; i8++) {
                append(iArr[i8], iArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(long j8, long j9) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = j8 == j9;
        return this;
    }

    public c append(long[] jArr, long[] jArr2) {
        if (!this.f4502a || jArr == jArr2) {
            return this;
        }
        if (jArr != null && jArr2 != null) {
            if (jArr.length != jArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < jArr.length && this.f4502a; i8++) {
                append(jArr[i8], jArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(Object obj, Object obj2) {
        if (!this.f4502a || obj == obj2) {
            return this;
        }
        if (obj != null && obj2 != null) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                a(obj, obj2);
            } else if (this.f4504c && !C.isPrimitiveOrWrapper(cls)) {
                reflectionAppend(obj, obj2);
            } else {
                this.f4502a = obj.equals(obj2);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(Object[] objArr, Object[] objArr2) {
        if (!this.f4502a || objArr == objArr2) {
            return this;
        }
        if (objArr != null && objArr2 != null) {
            if (objArr.length != objArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < objArr.length && this.f4502a; i8++) {
                append(objArr[i8], objArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }

    public c append(short s8, short s9) {
        if (!this.f4502a) {
            return this;
        }
        this.f4502a = s8 == s9;
        return this;
    }

    public c append(short[] sArr, short[] sArr2) {
        if (!this.f4502a || sArr == sArr2) {
            return this;
        }
        if (sArr != null && sArr2 != null) {
            if (sArr.length != sArr2.length) {
                g(false);
                return this;
            }
            for (int i8 = 0; i8 < sArr.length && this.f4502a; i8++) {
                append(sArr[i8], sArr2[i8]);
            }
            return this;
        }
        g(false);
        return this;
    }
}
