package androidx.lifecycle;

import androidx.lifecycle.AbstractC1019h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1013b {

    /* renamed from: c, reason: collision with root package name */
    static C1013b f10018c = new C1013b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f10019a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f10020b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f10021a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f10022b;

        a(Map map) {
            this.f10022b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1019h.a aVar = (AbstractC1019h.a) entry.getValue();
                List arrayList = (List) this.f10021a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f10021a.put(aVar, arrayList);
                }
                arrayList.add((C0153b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0153b) list.get(size)).a(interfaceC1025n, aVar, obj);
                }
            }
        }

        void a(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b((List) this.f10021a.get(aVar), interfaceC1025n, aVar, obj);
            b((List) this.f10021a.get(AbstractC1019h.a.ON_ANY), interfaceC1025n, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0153b {

        /* renamed from: a, reason: collision with root package name */
        final int f10023a;

        /* renamed from: b, reason: collision with root package name */
        final Method f10024b;

        C0153b(int i8, Method method) throws SecurityException {
            this.f10023a = i8;
            this.f10024b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i8 = this.f10023a;
                if (i8 == 0) {
                    this.f10024b.invoke(obj, null);
                } else if (i8 == 1) {
                    this.f10024b.invoke(obj, interfaceC1025n);
                } else {
                    if (i8 != 2) {
                        return;
                    }
                    this.f10024b.invoke(obj, interfaceC1025n, aVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to call observer method", e9.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0153b)) {
                return false;
            }
            C0153b c0153b = (C0153b) obj;
            return this.f10023a == c0153b.f10023a && this.f10024b.getName().equals(c0153b.f10024b.getName());
        }

        public int hashCode() {
            return (this.f10023a * 31) + this.f10024b.getName().hashCode();
        }
    }

    C1013b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i8;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f10022b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f10022b.entrySet()) {
                e(map, (C0153b) entry.getKey(), (AbstractC1019h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else {
                    if (!InterfaceC1025n.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i8 = 1;
                }
                AbstractC1019h.a aVarValue = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1019h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1019h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0153b(i8, method), aVarValue, cls);
                z8 = true;
            }
        }
        a aVar = new a(map);
        this.f10019a.put(cls, aVar);
        this.f10020b.put(cls, Boolean.valueOf(z8));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    private void e(Map map, C0153b c0153b, AbstractC1019h.a aVar, Class cls) {
        AbstractC1019h.a aVar2 = (AbstractC1019h.a) map.get(c0153b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0153b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0153b.f10024b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f10019a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f10020b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((v) method.getAnnotation(v.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f10020b.put(cls, Boolean.FALSE);
        return false;
    }
}
