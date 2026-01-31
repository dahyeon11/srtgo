package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class n {
    public static final n INSTANCE = c();

    class a extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f26073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f26074b;

        a(Method method, Object obj) {
            this.f26073a = method;
            this.f26074b = obj;
        }

        @Override // com.google.gson.internal.n
        public <T> T newInstance(Class<T> cls) {
            n.b(cls);
            return (T) this.f26073a.invoke(this.f26074b, cls);
        }
    }

    class b extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f26075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26076b;

        b(Method method, int i8) {
            this.f26075a = method;
            this.f26076b = i8;
        }

        @Override // com.google.gson.internal.n
        public <T> T newInstance(Class<T> cls) {
            n.b(cls);
            return (T) this.f26075a.invoke(null, cls, Integer.valueOf(this.f26076b));
        }
    }

    class c extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f26077a;

        c(Method method) {
            this.f26077a = method;
        }

        @Override // com.google.gson.internal.n
        public <T> T newInstance(Class<T> cls) {
            n.b(cls);
            return (T) this.f26077a.invoke(null, cls, Object.class);
        }
    }

    class d extends n {
        d() {
        }

        @Override // com.google.gson.internal.n
        public <T> T newInstance(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strA = com.google.gson.internal.c.a(cls);
        if (strA == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strA);
    }

    private static n c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract <T> T newInstance(Class<T> cls);
}
