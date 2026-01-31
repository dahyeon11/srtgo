package com.google.protobuf;

import com.kakao.sdk.template.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f26188a = J();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f26189b = AbstractC5205e.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f26190c = r(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f26191d = r(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f26192e = G();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f26193f = b0();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f26194g = a0();

    /* renamed from: h, reason: collision with root package name */
    static final long f26195h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f26196i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f26197j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f26198k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f26199l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f26200m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f26201n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f26202o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f26203p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f26204q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f26205r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f26206s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f26207t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f26208u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f26209v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f26210w;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public boolean getBoolean(Object obj, long j8) {
            return L1.f26210w ? L1.v(obj, j8) : L1.w(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(Object obj, long j8) {
            return L1.f26210w ? L1.z(obj, j8) : L1.A(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public double getDouble(Object obj, long j8) {
            return Double.longBitsToDouble(getLong(obj, j8));
        }

        @Override // com.google.protobuf.L1.e
        public float getFloat(Object obj, long j8) {
            return Float.intBitsToFloat(getInt(obj, j8));
        }

        @Override // com.google.protobuf.L1.e
        public int getInt(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public long getLong(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putBoolean(Object obj, long j8, boolean z8) {
            if (L1.f26210w) {
                L1.P(obj, j8, z8);
            } else {
                L1.Q(obj, j8, z8);
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(Object obj, long j8, byte b9) {
            if (L1.f26210w) {
                L1.T(obj, j8, b9);
            } else {
                L1.U(obj, j8, b9);
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putDouble(Object obj, long j8, double d9) {
            putLong(obj, j8, Double.doubleToLongBits(d9));
        }

        @Override // com.google.protobuf.L1.e
        public void putFloat(Object obj, long j8, float f8) {
            putInt(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.protobuf.L1.e
        public void putInt(long j8, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public void putLong(long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(long j8, byte b9) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public boolean getBoolean(Object obj, long j8) {
            return L1.f26210w ? L1.v(obj, j8) : L1.w(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(Object obj, long j8) {
            return L1.f26210w ? L1.z(obj, j8) : L1.A(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public double getDouble(Object obj, long j8) {
            return Double.longBitsToDouble(getLong(obj, j8));
        }

        @Override // com.google.protobuf.L1.e
        public float getFloat(Object obj, long j8) {
            return Float.intBitsToFloat(getInt(obj, j8));
        }

        @Override // com.google.protobuf.L1.e
        public int getInt(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public long getLong(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putBoolean(Object obj, long j8, boolean z8) {
            if (L1.f26210w) {
                L1.P(obj, j8, z8);
            } else {
                L1.Q(obj, j8, z8);
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(Object obj, long j8, byte b9) {
            if (L1.f26210w) {
                L1.T(obj, j8, b9);
            } else {
                L1.U(obj, j8, b9);
            }
        }

        @Override // com.google.protobuf.L1.e
        public void putDouble(Object obj, long j8, double d9) {
            putLong(obj, j8, Double.doubleToLongBits(d9));
        }

        @Override // com.google.protobuf.L1.e
        public void putFloat(Object obj, long j8, float f8) {
            putInt(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // com.google.protobuf.L1.e
        public void putInt(long j8, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public void putLong(long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(long j8, byte b9) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            this.f26211a.copyMemory((Object) null, j8, bArr, L1.f26195h + j9, j10);
        }

        @Override // com.google.protobuf.L1.e
        public boolean getBoolean(Object obj, long j8) {
            return this.f26211a.getBoolean(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(Object obj, long j8) {
            return this.f26211a.getByte(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public double getDouble(Object obj, long j8) {
            return this.f26211a.getDouble(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public float getFloat(Object obj, long j8) {
            return this.f26211a.getFloat(obj, j8);
        }

        @Override // com.google.protobuf.L1.e
        public int getInt(long j8) {
            return this.f26211a.getInt(j8);
        }

        @Override // com.google.protobuf.L1.e
        public long getLong(long j8) {
            return this.f26211a.getLong(j8);
        }

        @Override // com.google.protobuf.L1.e
        public Object getStaticObject(Field field) {
            return getObject(this.f26211a.staticFieldBase(field), this.f26211a.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.L1.e
        public void putBoolean(Object obj, long j8, boolean z8) {
            this.f26211a.putBoolean(obj, j8, z8);
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(Object obj, long j8, byte b9) {
            this.f26211a.putByte(obj, j8, b9);
        }

        @Override // com.google.protobuf.L1.e
        public void putDouble(Object obj, long j8, double d9) {
            this.f26211a.putDouble(obj, j8, d9);
        }

        @Override // com.google.protobuf.L1.e
        public void putFloat(Object obj, long j8, float f8) {
            this.f26211a.putFloat(obj, j8, f8);
        }

        @Override // com.google.protobuf.L1.e
        public void putInt(long j8, int i8) {
            this.f26211a.putInt(j8, i8);
        }

        @Override // com.google.protobuf.L1.e
        public void putLong(long j8, long j9) {
            this.f26211a.putLong(j8, j9);
        }

        @Override // com.google.protobuf.L1.e
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f26211a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                L1.M(th);
                return false;
            }
        }

        @Override // com.google.protobuf.L1.e
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f26211a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                L1.M(th);
                return false;
            }
        }

        @Override // com.google.protobuf.L1.e
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            this.f26211a.copyMemory(bArr, L1.f26195h + j8, (Object) null, j9, j10);
        }

        @Override // com.google.protobuf.L1.e
        public byte getByte(long j8) {
            return this.f26211a.getByte(j8);
        }

        @Override // com.google.protobuf.L1.e
        public void putByte(long j8, byte b9) {
            this.f26211a.putByte(j8, b9);
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f26211a;

        e(Unsafe unsafe) {
            this.f26211a = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.f26211a.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.f26211a.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j8, byte[] bArr, long j9, long j10);

        public abstract void copyMemory(byte[] bArr, long j8, long j9, long j10);

        public abstract boolean getBoolean(Object obj, long j8);

        public abstract byte getByte(long j8);

        public abstract byte getByte(Object obj, long j8);

        public abstract double getDouble(Object obj, long j8);

        public abstract float getFloat(Object obj, long j8);

        public abstract int getInt(long j8);

        public final int getInt(Object obj, long j8) {
            return this.f26211a.getInt(obj, j8);
        }

        public abstract long getLong(long j8);

        public final long getLong(Object obj, long j8) {
            return this.f26211a.getLong(obj, j8);
        }

        public final Object getObject(Object obj, long j8) {
            return this.f26211a.getObject(obj, j8);
        }

        public abstract Object getStaticObject(Field field);

        public final long objectFieldOffset(Field field) {
            return this.f26211a.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j8, boolean z8);

        public abstract void putByte(long j8, byte b9);

        public abstract void putByte(Object obj, long j8, byte b9);

        public abstract void putDouble(Object obj, long j8, double d9);

        public abstract void putFloat(Object obj, long j8, float f8);

        public abstract void putInt(long j8, int i8);

        public final void putInt(Object obj, long j8, int i8) {
            this.f26211a.putInt(obj, j8, i8);
        }

        public abstract void putLong(long j8, long j9);

        public final void putLong(Object obj, long j8, long j9) {
            this.f26211a.putLong(obj, j8, j9);
        }

        public final void putObject(Object obj, long j8, Object obj2) {
            this.f26211a.putObject(obj, j8, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.f26211a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                L1.M(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.f26211a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return L1.o() != null;
            } catch (Throwable th) {
                L1.M(th);
                return false;
            }
        }
    }

    static {
        long jM = m(byte[].class);
        f26195h = jM;
        f26196i = m(boolean[].class);
        f26197j = n(boolean[].class);
        f26198k = m(int[].class);
        f26199l = n(int[].class);
        f26200m = m(long[].class);
        f26201n = n(long[].class);
        f26202o = m(float[].class);
        f26203p = n(float[].class);
        f26204q = m(double[].class);
        f26205r = n(double[].class);
        f26206s = m(Object[].class);
        f26207t = n(Object[].class);
        f26208u = t(o());
        f26209v = (int) (jM & 7);
        f26210w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte A(Object obj, long j8) {
        return (byte) ((D(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    static double B(Object obj, long j8) {
        return f26192e.getDouble(obj, j8);
    }

    static float C(Object obj, long j8) {
        return f26192e.getFloat(obj, j8);
    }

    static int D(Object obj, long j8) {
        return f26192e.getInt(obj, j8);
    }

    static long E(long j8) {
        return f26192e.getLong(j8);
    }

    static long F(Object obj, long j8) {
        return f26192e.getLong(obj, j8);
    }

    private static e G() {
        Unsafe unsafe = f26188a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC5205e.c()) {
            return new d(unsafe);
        }
        if (f26190c) {
            return new c(unsafe);
        }
        if (f26191d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object H(Object obj, long j8) {
        return f26192e.getObject(obj, j8);
    }

    static Object I(Field field) {
        return f26192e.getStaticObject(field);
    }

    static Unsafe J() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean K() {
        return f26194g;
    }

    static boolean L() {
        return f26193f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Throwable th) {
        Logger.getLogger(L1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static long N(Field field) {
        return f26192e.objectFieldOffset(field);
    }

    static void O(Object obj, long j8, boolean z8) {
        f26192e.putBoolean(obj, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j8, boolean z8) {
        T(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Object obj, long j8, boolean z8) {
        U(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    static void R(long j8, byte b9) {
        f26192e.putByte(j8, b9);
    }

    static void S(byte[] bArr, long j8, byte b9) {
        f26192e.putByte(bArr, f26195h + j8, b9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int iD = D(obj, j9);
        int i8 = ((~((int) j8)) & 3) << 3;
        X(obj, j9, ((255 & b9) << i8) | (iD & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        X(obj, j9, ((255 & b9) << i8) | (D(obj, j9) & (~(255 << i8))));
    }

    static void V(Object obj, long j8, double d9) {
        f26192e.putDouble(obj, j8, d9);
    }

    static void W(Object obj, long j8, float f8) {
        f26192e.putFloat(obj, j8, f8);
    }

    static void X(Object obj, long j8, int i8) {
        f26192e.putInt(obj, j8, i8);
    }

    static void Y(Object obj, long j8, long j9) {
        f26192e.putLong(obj, j8, j9);
    }

    static void Z(Object obj, long j8, Object obj2) {
        f26192e.putObject(obj, j8, obj2);
    }

    private static boolean a0() {
        e eVar = f26192e;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeArrayOperations();
    }

    private static boolean b0() {
        e eVar = f26192e;
        if (eVar == null) {
            return false;
        }
        return eVar.supportsUnsafeByteBufferOperations();
    }

    static long k(ByteBuffer byteBuffer) {
        return f26192e.getLong(byteBuffer, f26208u);
    }

    static Object l(Class cls) {
        try {
            return f26188a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static int m(Class cls) {
        if (f26194g) {
            return f26192e.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int n(Class cls) {
        if (f26194g) {
            return f26192e.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field o() {
        Field fieldS;
        if (AbstractC5205e.c() && (fieldS = s(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldS;
        }
        Field fieldS2 = s(Buffer.class, Constants.ADDRESS);
        if (fieldS2 == null || fieldS2.getType() != Long.TYPE) {
            return null;
        }
        return fieldS2;
    }

    static void p(long j8, byte[] bArr, long j9, long j10) {
        f26192e.copyMemory(j8, bArr, j9, j10);
    }

    static void q(byte[] bArr, long j8, long j9, long j10) {
        f26192e.copyMemory(bArr, j8, j9, j10);
    }

    static boolean r(Class cls) {
        if (!AbstractC5205e.c()) {
            return false;
        }
        try {
            Class cls2 = f26189b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long t(Field field) {
        e eVar;
        if (field == null || (eVar = f26192e) == null) {
            return -1L;
        }
        return eVar.objectFieldOffset(field);
    }

    static boolean u(Object obj, long j8) {
        return f26192e.getBoolean(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j8) {
        return z(obj, j8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(Object obj, long j8) {
        return A(obj, j8) != 0;
    }

    static byte x(long j8) {
        return f26192e.getByte(j8);
    }

    static byte y(byte[] bArr, long j8) {
        return f26192e.getByte(bArr, f26195h + j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j8) {
        return (byte) ((D(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }
}
