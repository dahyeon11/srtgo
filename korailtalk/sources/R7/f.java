package R7;

import Q7.C0697a;
import Q7.C0708l;
import Q7.O;
import Q7.Z;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public class f implements a {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f4508c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f4509a;

    /* renamed from: b, reason: collision with root package name */
    private int f4510b;

    public f() {
        this.f4509a = 37;
        this.f4510b = 17;
    }

    private void a(Object obj) {
        if (obj instanceof long[]) {
            append((long[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            append((int[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            append((short[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            append((char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            append((double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            append((float[]) obj);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj);
        } else {
            append((Object[]) obj);
        }
    }

    static Set b() {
        return (Set) f4508c.get();
    }

    static boolean c(Object obj) {
        Set setB = b();
        return setB != null && setB.contains(new h(obj));
    }

    private static void d(Object obj, Class cls, f fVar, boolean z8, String[] strArr) {
        if (c(obj)) {
            return;
        }
        try {
            e(obj);
            Field[] fieldArr = (Field[]) C0697a.sort(cls.getDeclaredFields(), Comparator.comparing(new e()));
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field : fieldArr) {
                if (!C0708l.contains(strArr, field.getName()) && !field.getName().contains("$") && (z8 || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(g.class)) {
                        fVar.append(i.a(field, obj));
                    }
                }
            }
            f(obj);
        } catch (Throwable th) {
            f(obj);
            throw th;
        }
    }

    private static void e(Object obj) {
        Set setB = b();
        if (setB == null) {
            setB = new HashSet();
            f4508c.set(setB);
        }
        setB.add(new h(obj));
    }

    private static void f(Object obj) {
        Set setB = b();
        if (setB != null) {
            setB.remove(new h(obj));
            if (setB.isEmpty()) {
                f4508c.remove();
            }
        }
    }

    public static int reflectionHashCode(int i8, int i9, Object obj) {
        return reflectionHashCode(i8, i9, obj, false, null, new String[0]);
    }

    public f append(boolean z8) {
        this.f4510b = (this.f4510b * this.f4509a) + (!z8 ? 1 : 0);
        return this;
    }

    public f appendSuper(int i8) {
        this.f4510b = (this.f4510b * this.f4509a) + i8;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f4510b == ((f) obj).f4510b;
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.f4510b;
    }

    public static int reflectionHashCode(int i8, int i9, Object obj, boolean z8) {
        return reflectionHashCode(i8, i9, obj, z8, null, new String[0]);
    }

    public f append(boolean[] zArr) {
        if (zArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (boolean z8 : zArr) {
                append(z8);
            }
        }
        return this;
    }

    @Override // R7.a
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

    public static <T> int reflectionHashCode(int i8, int i9, T t8, boolean z8, Class<? super T> cls, String... strArr) {
        Objects.requireNonNull(t8, "object");
        f fVar = new f(i8, i9);
        Class<?> superclass = t8.getClass();
        d(t8, superclass, fVar, z8, strArr);
        while (superclass.getSuperclass() != null && superclass != cls) {
            superclass = superclass.getSuperclass();
            d(t8, superclass, fVar, z8, strArr);
        }
        return fVar.toHashCode();
    }

    public f(int i8, int i9) {
        Z.isTrue(i8 % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        Z.isTrue(i9 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.f4509a = i9;
        this.f4510b = i8;
    }

    public f append(byte b9) {
        this.f4510b = (this.f4510b * this.f4509a) + b9;
        return this;
    }

    public f append(byte[] bArr) {
        if (bArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (byte b9 : bArr) {
                append(b9);
            }
        }
        return this;
    }

    public f append(char c9) {
        this.f4510b = (this.f4510b * this.f4509a) + c9;
        return this;
    }

    public f append(char[] cArr) {
        if (cArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (char c9 : cArr) {
                append(c9);
            }
        }
        return this;
    }

    public static int reflectionHashCode(Object obj, boolean z8) {
        return reflectionHashCode(17, 37, obj, z8, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, Collection<String> collection) {
        return reflectionHashCode(obj, l.f(collection));
    }

    public static int reflectionHashCode(Object obj, String... strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public f append(double d9) {
        return append(Double.doubleToLongBits(d9));
    }

    public f append(double[] dArr) {
        if (dArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (double d9 : dArr) {
                append(d9);
            }
        }
        return this;
    }

    public f append(float f8) {
        this.f4510b = (this.f4510b * this.f4509a) + Float.floatToIntBits(f8);
        return this;
    }

    public f append(float[] fArr) {
        if (fArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (float f8 : fArr) {
                append(f8);
            }
        }
        return this;
    }

    public f append(int i8) {
        this.f4510b = (this.f4510b * this.f4509a) + i8;
        return this;
    }

    public f append(int[] iArr) {
        if (iArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (int i8 : iArr) {
                append(i8);
            }
        }
        return this;
    }

    public f append(long j8) {
        this.f4510b = (this.f4510b * this.f4509a) + ((int) (j8 ^ (j8 >> 32)));
        return this;
    }

    public f append(long[] jArr) {
        if (jArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (long j8 : jArr) {
                append(j8);
            }
        }
        return this;
    }

    public f append(Object obj) {
        if (obj == null) {
            this.f4510b *= this.f4509a;
        } else if (O.isArray(obj)) {
            a(obj);
        } else {
            this.f4510b = (this.f4510b * this.f4509a) + obj.hashCode();
        }
        return this;
    }

    public f append(Object[] objArr) {
        if (objArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (Object obj : objArr) {
                append(obj);
            }
        }
        return this;
    }

    public f append(short s8) {
        this.f4510b = (this.f4510b * this.f4509a) + s8;
        return this;
    }

    public f append(short[] sArr) {
        if (sArr == null) {
            this.f4510b *= this.f4509a;
        } else {
            for (short s8 : sArr) {
                append(s8);
            }
        }
        return this;
    }
}
