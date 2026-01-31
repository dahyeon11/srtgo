package Q7;

import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.delay.CashRfnDao;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public class C {

    /* renamed from: b */
    private static final Map f4072b;

    /* renamed from: c */
    private static final Map f4073c;

    /* renamed from: d */
    private static final Map f4074d;

    /* renamed from: e */
    private static final Map f4075e;

    /* renamed from: f */
    private static final Map f4076f;

    /* renamed from: a */
    private static final Comparator f4071a = new Comparator() { // from class: Q7.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C.q((Class) obj, (Class) obj2);
        }
    };
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    public static final String PACKAGE_SEPARATOR = String.valueOf(PACKAGE_SEPARATOR_CHAR);
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final String INNER_CLASS_SEPARATOR = String.valueOf(INNER_CLASS_SEPARATOR_CHAR);

    class a implements Iterator {

        /* renamed from: a */
        final /* synthetic */ V7.c f4077a;

        a(V7.c cVar) {
            this.f4077a = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4077a.getValue() != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Class<?> next() {
            Class<?> cls = (Class) this.f4077a.getValue();
            this.f4077a.setValue(cls.getSuperclass());
            return cls;
        }
    }

    class b implements Iterator {

        /* renamed from: a */
        Iterator f4078a = Collections.emptyIterator();

        /* renamed from: b */
        final /* synthetic */ Iterator f4079b;

        /* renamed from: c */
        final /* synthetic */ Set f4080c;

        b(Iterator it, Set set) {
            this.f4079b = it;
            this.f4080c = set;
        }

        private void a(Set set, Class cls) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (!this.f4080c.contains(cls2)) {
                    set.add(cls2);
                }
                a(set, cls2);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4078a.hasNext() || this.f4079b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Class<?> next() {
            if (this.f4078a.hasNext()) {
                Class<?> cls = (Class) this.f4078a.next();
                this.f4080c.add(cls);
                return cls;
            }
            Class<?> cls2 = (Class) this.f4079b.next();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a(linkedHashSet, cls2);
            this.f4078a = linkedHashSet.iterator();
            return cls2;
        }
    }

    public enum c {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap map = new HashMap();
        f4072b = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        map.put("byte", cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Short.TYPE;
        map.put("short", cls4);
        Class cls5 = Integer.TYPE;
        map.put("int", cls5);
        Class cls6 = Long.TYPE;
        map.put("long", cls6);
        Class cls7 = Double.TYPE;
        map.put("double", cls7);
        Class cls8 = Float.TYPE;
        map.put("float", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        HashMap map2 = new HashMap();
        f4073c = map2;
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls4, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(cls7, Double.class);
        map2.put(cls8, Float.class);
        map2.put(cls9, cls9);
        f4074d = new HashMap();
        map2.forEach(new BiConsumer() { // from class: Q7.t
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C.r((Class) obj, (Class) obj2);
            }
        });
        HashMap map3 = new HashMap();
        map3.put("int", CashRfnDao.f27552I);
        map3.put("boolean", "Z");
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", "S");
        map3.put("byte", CashRfnDao.f27551B);
        map3.put("double", HelpSrvCustDao.HelpSrvCustRequest.f27549D);
        map3.put("char", "C");
        f4075e = Collections.unmodifiableMap(map3);
        f4076f = Collections.unmodifiableMap((Map) map3.entrySet().stream().collect(Collectors.toMap(new Function() { // from class: Q7.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getValue();
            }
        }, new Function() { // from class: Q7.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }
        })));
    }

    public static Comparator<Class<?>> comparator() {
        return f4071a;
    }

    public static List<Class<?>> convertClassNamesToClasses(List<String> list) {
        if (list == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList(list.size());
        list.forEach(new Consumer() { // from class: Q7.w
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C.l(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static List<String> convertClassesToClassNames(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        return (List) list.stream().map(new Function() { // from class: Q7.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C.m((Class) obj);
            }
        }).collect(Collectors.toList());
    }

    public static String getAbbreviatedName(Class<?> cls, int i8) {
        return cls == null ? "" : getAbbreviatedName(cls.getName(), i8);
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        j(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static List<Class<?>> getAllSuperclasses(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    public static String getCanonicalName(Class<?> cls) {
        return getCanonicalName(cls, "");
    }

    public static Class<?> getClass(ClassLoader classLoader, String str) {
        return getClass(classLoader, str, true);
    }

    public static <T> Class<T> getComponentType(Class<T[]> cls) {
        if (cls == null) {
            return null;
        }
        return (Class<T>) cls.getComponentType();
    }

    public static String getName(Class<?> cls) {
        return getName(cls, "");
    }

    public static String getPackageCanonicalName(Class<?> cls) {
        return cls == null ? "" : getPackageCanonicalName(cls.getName());
    }

    public static String getPackageName(Class<?> cls) {
        return cls == null ? "" : getPackageName(cls.getName());
    }

    public static Method getPublicMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method method = cls.getMethod(str, clsArr);
        if (isPublic(method.getDeclaringClass())) {
            return method;
        }
        ArrayList<Class> arrayList = new ArrayList(getAllInterfaces(cls));
        arrayList.addAll(getAllSuperclasses(cls));
        for (Class cls2 : arrayList) {
            if (isPublic(cls2)) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + X.SPACE + C0708l.toString(clsArr));
    }

    public static String getShortCanonicalName(Class<?> cls) {
        return cls == null ? "" : getShortCanonicalName(cls.getCanonicalName());
    }

    public static String getShortClassName(Class<?> cls) {
        return cls == null ? "" : getShortClassName(cls.getName());
    }

    public static String getSimpleName(Class<?> cls) {
        return getSimpleName(cls, "");
    }

    public static Iterable<Class<?>> hierarchy(Class<?> cls) {
        return hierarchy(cls, c.EXCLUDE);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2) {
        return isAssignable(cls, cls2, true);
    }

    public static boolean isInnerClass(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean isPrimitiveOrWrapper(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || isPrimitiveWrapper(cls);
    }

    public static boolean isPrimitiveWrapper(Class<?> cls) {
        return f4074d.containsKey(cls);
    }

    public static boolean isPublic(Class<?> cls) {
        return Modifier.isPublic(cls.getModifiers());
    }

    private static void j(Class cls, HashSet hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    j(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    private static String k(String str) {
        String strDeleteWhitespace = X.deleteWhitespace(str);
        if (strDeleteWhitespace == null) {
            return null;
        }
        int i8 = 0;
        while (strDeleteWhitespace.startsWith("[")) {
            i8++;
            strDeleteWhitespace = strDeleteWhitespace.substring(1);
        }
        if (i8 < 1) {
            return strDeleteWhitespace;
        }
        if (strDeleteWhitespace.startsWith("L")) {
            strDeleteWhitespace = strDeleteWhitespace.substring(1, strDeleteWhitespace.endsWith(";") ? strDeleteWhitespace.length() - 1 : strDeleteWhitespace.length());
        } else if (!strDeleteWhitespace.isEmpty()) {
            strDeleteWhitespace = (String) f4076f.get(strDeleteWhitespace.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(strDeleteWhitespace);
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("[]");
        }
        return sb.toString();
    }

    public static /* synthetic */ void l(List list, String str) {
        try {
            list.add(Class.forName(str));
        } catch (Exception unused) {
            list.add(null);
        }
    }

    public static /* synthetic */ String m(Class cls) {
        return getName((Class<?>) cls, (String) null);
    }

    public static /* synthetic */ Iterator n(Class cls) {
        return new a(new V7.c(cls));
    }

    public static /* synthetic */ Iterator o(Iterable iterable) {
        return new b(iterable.iterator(), new HashSet());
    }

    public static /* synthetic */ Class p(Class[] clsArr, int i8) {
        return primitiveToWrapper(clsArr[i8]);
    }

    public static Class<?> primitiveToWrapper(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : (Class) f4073c.get(cls);
    }

    public static Class<?>[] primitivesToWrappers(final Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        Arrays.setAll(clsArr2, new IntFunction() { // from class: Q7.s
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C.p(clsArr, i8);
            }
        });
        return clsArr2;
    }

    public static /* synthetic */ int q(Class cls, Class cls2) {
        return Objects.compare(getName((Class<?>) cls), getName((Class<?>) cls2), new D7.c());
    }

    public static /* synthetic */ void r(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return;
        }
        f4074d.put(cls2, cls);
    }

    public static /* synthetic */ Class s(Object[] objArr, int i8) {
        Object obj = objArr[i8];
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static /* synthetic */ Class t(Class[] clsArr, int i8) {
        return wrapperToPrimitive(clsArr[i8]);
    }

    public static Class<?>[] toClass(final Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return C0708l.EMPTY_CLASS_ARRAY;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        Arrays.setAll(clsArr, new IntFunction() { // from class: Q7.A
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C.s(objArr, i8);
            }
        });
        return clsArr;
    }

    private static String u(String str) {
        String strDeleteWhitespace = X.deleteWhitespace(str);
        Objects.requireNonNull(strDeleteWhitespace, "className");
        if (!strDeleteWhitespace.endsWith("[]")) {
            return strDeleteWhitespace;
        }
        StringBuilder sb = new StringBuilder();
        while (strDeleteWhitespace.endsWith("[]")) {
            strDeleteWhitespace = strDeleteWhitespace.substring(0, strDeleteWhitespace.length() - 2);
            sb.append("[");
        }
        String str2 = (String) f4075e.get(strDeleteWhitespace);
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append("L");
            sb.append(strDeleteWhitespace);
            sb.append(";");
        }
        return sb.toString();
    }

    private static boolean v(int i8, int i9, int i10, int i11) {
        return i9 >= i10 || (i8 + i10) - i9 <= i11;
    }

    public static Class<?> wrapperToPrimitive(Class<?> cls) {
        return (Class) f4074d.get(cls);
    }

    public static Class<?>[] wrappersToPrimitives(final Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        Arrays.setAll(clsArr2, new IntFunction() { // from class: Q7.B
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C.t(clsArr, i8);
            }
        });
        return clsArr2;
    }

    public static String getCanonicalName(Class<?> cls, String str) {
        String canonicalName;
        return (cls == null || (canonicalName = cls.getCanonicalName()) == null) ? str : canonicalName;
    }

    public static Class<?> getClass(ClassLoader classLoader, String str, boolean z8) throws ClassNotFoundException {
        try {
            Class<?> cls = (Class) f4072b.get(str);
            return cls != null ? cls : Class.forName(u(str), z8, classLoader);
        } catch (ClassNotFoundException e8) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                try {
                    return getClass(classLoader, str.substring(0, iLastIndexOf) + INNER_CLASS_SEPARATOR_CHAR + str.substring(iLastIndexOf + 1), z8);
                } catch (ClassNotFoundException unused) {
                    throw e8;
                }
            }
            throw e8;
        }
    }

    public static String getName(Class<?> cls, String str) {
        return cls == null ? str : cls.getName();
    }

    public static String getShortCanonicalName(Object obj, String str) {
        return obj == null ? str : getShortCanonicalName(obj.getClass().getCanonicalName());
    }

    public static String getSimpleName(Class<?> cls, String str) {
        return cls == null ? str : cls.getSimpleName();
    }

    public static Iterable<Class<?>> hierarchy(final Class<?> cls, c cVar) {
        final Iterable<Class<?>> iterable = new Iterable() { // from class: Q7.x
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C.n(cls);
            }
        };
        return cVar != c.INCLUDE ? iterable : new Iterable() { // from class: Q7.y
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C.o(iterable);
            }
        };
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2, boolean z8) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z8) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = primitiveToWrapper(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = wrapperToPrimitive(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        if (cls3.equals(cls)) {
            return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        Class cls4 = Long.TYPE;
        if (cls4.equals(cls)) {
            return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls)) {
            return false;
        }
        Class cls5 = Double.TYPE;
        if (cls5.equals(cls)) {
            return false;
        }
        Class cls6 = Float.TYPE;
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (!Character.TYPE.equals(cls)) {
            Class cls7 = Short.TYPE;
            if (!cls7.equals(cls)) {
                if (Byte.TYPE.equals(cls)) {
                    return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
                }
                return false;
            }
        }
        return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
    }

    public static String getAbbreviatedName(String str, int i8) {
        char c9;
        if (i8 <= 0) {
            throw new IllegalArgumentException("len must be > 0");
        }
        if (str == null) {
            return "";
        }
        if (str.length() <= i8) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i9 = 0;
        int i10 = 0;
        while (i9 < charArray.length) {
            int i11 = i10;
            while (i9 < charArray.length && (c9 = charArray[i9]) != '.') {
                i9++;
                charArray[i11] = c9;
                i11++;
            }
            int i12 = i10 + 1;
            if (!v(i11, i9, charArray.length, i8) && i12 <= i11) {
                i11 = i12;
            }
            if (i9 < charArray.length) {
                i10 = i11 + 1;
                charArray[i11] = charArray[i9];
                i9++;
            } else {
                i10 = i11;
            }
        }
        return new String(charArray, 0, i10);
    }

    public static String getCanonicalName(Object obj) {
        return getCanonicalName(obj, "");
    }

    public static String getName(Object obj) {
        return getName(obj, "");
    }

    public static String getPackageCanonicalName(Object obj, String str) {
        return obj == null ? str : getPackageCanonicalName(obj.getClass().getName());
    }

    public static String getPackageName(Object obj, String str) {
        return obj == null ? str : getPackageName(obj.getClass());
    }

    public static String getShortCanonicalName(String str) {
        return getShortClassName(k(str));
    }

    public static String getShortClassName(Object obj, String str) {
        return obj == null ? str : getShortClassName(obj.getClass());
    }

    public static String getSimpleName(Object obj) {
        return getSimpleName(obj, "");
    }

    public static String getCanonicalName(Object obj, String str) {
        String canonicalName;
        return (obj == null || (canonicalName = obj.getClass().getCanonicalName()) == null) ? str : canonicalName;
    }

    public static String getName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getName();
    }

    public static String getPackageCanonicalName(String str) {
        return getPackageName(k(str));
    }

    public static String getPackageName(String str) {
        if (X.isEmpty(str)) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    public static String getShortClassName(String str) {
        if (X.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map map = f4076f;
            if (map.containsKey(str)) {
                str = (String) map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace(INNER_CLASS_SEPARATOR_CHAR, PACKAGE_SEPARATOR_CHAR);
        }
        return strSubstring + ((Object) sb);
    }

    public static String getSimpleName(Object obj, String str) {
        return obj == null ? str : obj.getClass().getSimpleName();
    }

    public static Class<?> getClass(String str) {
        return getClass(str, true);
    }

    public static Class<?> getClass(String str, boolean z8) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C.class.getClassLoader();
        }
        return getClass(contextClassLoader, str, z8);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>... clsArr2) {
        return isAssignable(clsArr, clsArr2, true);
    }

    public static boolean isAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z8) {
        if (!C0708l.isSameLength((Object[]) clsArr, (Object[]) clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = C0708l.EMPTY_CLASS_ARRAY;
        }
        if (clsArr2 == null) {
            clsArr2 = C0708l.EMPTY_CLASS_ARRAY;
        }
        for (int i8 = 0; i8 < clsArr.length; i8++) {
            if (!isAssignable(clsArr[i8], clsArr2[i8], z8)) {
                return false;
            }
        }
        return true;
    }
}
