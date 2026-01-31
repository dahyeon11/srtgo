package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
abstract class I0 {

    class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f31973a;

        a(b bVar) {
            this.f31973a = bVar;
        }

        @Override // java.util.Comparator
        public int compare(T t8, T t9) {
            int priority = this.f31973a.getPriority(t8) - this.f31973a.getPriority(t9);
            return priority != 0 ? priority : t8.getClass().getName().compareTo(t9.getClass().getName());
        }
    }

    public interface b {
        int getPriority(Object obj);

        boolean isAvailable(Object obj);
    }

    private static Object a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(null).newInstance(null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    static Iterable b(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object objA = a(cls, (Class) it.next());
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    static boolean c(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        return !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b bVar) {
        List listLoadAll = loadAll(cls, iterable, classLoader, bVar);
        if (listLoadAll.isEmpty()) {
            return null;
        }
        return (T) listLoadAll.get(0);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b bVar) {
        Iterable iterableB = c(classLoader) ? b(cls, iterable) : getCandidatesViaServiceLoader(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterableB) {
            if (bVar.isAvailable(t8)) {
                arrayList.add(t8);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
