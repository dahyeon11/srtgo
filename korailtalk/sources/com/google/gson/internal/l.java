package com.google.gson.internal;

import com.google.gson.t;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l {

    private static abstract class b {
        public static final b INSTANCE;

        class a extends b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Method f26068a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f26068a = method;
            }

            @Override // com.google.gson.internal.l.b
            public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f26068a.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e8) {
                    throw new RuntimeException("Failed invoking canAccess", e8);
                }
            }
        }

        /* renamed from: com.google.gson.internal.l$b$b, reason: collision with other inner class name */
        class C0214b extends b {
            C0214b() {
                super();
            }

            @Override // com.google.gson.internal.l.b
            public boolean canAccess(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (d.isJava9OrLater()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0214b();
            }
            INSTANCE = aVar;
        }

        private b() {
        }

        public abstract boolean canAccess(AccessibleObject accessibleObject, Object obj);
    }

    private static boolean a(String str) {
        return str.startsWith("android.") || str.startsWith("androidx.") || b(str);
    }

    private static boolean b(String str) {
        return str.startsWith("java.") || str.startsWith("javax.");
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object obj) {
        return b.INSTANCE.canAccess(accessibleObject, obj);
    }

    public static t.e getFilterResult(List<t> list, Class<?> cls) {
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            t.e eVarCheck = it.next().check(cls);
            if (eVarCheck != t.e.INDECISIVE) {
                return eVarCheck;
            }
        }
        return t.e.ALLOW;
    }

    public static boolean isAndroidType(Class<?> cls) {
        return a(cls.getName());
    }

    public static boolean isAnyPlatformType(Class<?> cls) {
        String name = cls.getName();
        return a(name) || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static boolean isJavaType(Class<?> cls) {
        return b(cls.getName());
    }
}
