package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {
    public static final q INSTANCE = new q();

    /* renamed from: a, reason: collision with root package name */
    private static final Map f10059a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10060b = new HashMap();

    private q() {
    }

    private final InterfaceC1017f a(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            android.support.v4.media.session.f.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final Constructor b(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(name);
            if (fullPackage.length() != 0) {
                adapterName = fullPackage + Q7.C.PACKAGE_SEPARATOR_CHAR + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    private final int c(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map map = f10059a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iE = e(cls);
        map.put(cls, Integer.valueOf(iE));
        return iE;
    }

    private final boolean d(Class cls) {
        return cls != null && InterfaceC1024m.class.isAssignableFrom(cls);
    }

    private final int e(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f10060b.put(cls, S6.r.listOf(constructorB));
            return 2;
        }
        if (C1013b.f10018c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (d(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (c(superclass) == 1) {
                return 1;
            }
            Object obj = f10060b.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (d(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (c(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f10060b.get(intrface);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f10060b.put(cls, arrayList);
        return 2;
    }

    public static final String getAdapterName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return l7.r.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final InterfaceC1023l lifecycleEventObserver(Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(object, "object");
        if (object instanceof InterfaceC1023l) {
            return (InterfaceC1023l) object;
        }
        Class<?> cls = object.getClass();
        q qVar = INSTANCE;
        if (qVar.c(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        Object obj = f10060b.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            qVar.a((Constructor) list.get(0), object);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        InterfaceC1017f[] interfaceC1017fArr = new InterfaceC1017f[size];
        for (int i8 = 0; i8 < size; i8++) {
            INSTANCE.a((Constructor) list.get(i8), object);
            interfaceC1017fArr[i8] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1017fArr);
    }
}
