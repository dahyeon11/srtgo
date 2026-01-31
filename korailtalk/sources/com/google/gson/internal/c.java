package com.google.gson.internal;

import com.google.gson.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26023a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26024b;

    /* renamed from: c, reason: collision with root package name */
    private final List f26025c;

    class a implements com.google.gson.internal.i {
        a() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new TreeSet();
        }
    }

    class b implements com.google.gson.internal.i {
        b() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    class C0213c implements com.google.gson.internal.i {
        C0213c() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new ArrayDeque();
        }
    }

    class d implements com.google.gson.internal.i {
        d() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new ArrayList();
        }
    }

    class e implements com.google.gson.internal.i {
        e() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements com.google.gson.internal.i {
        f() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new ConcurrentHashMap();
        }
    }

    class g implements com.google.gson.internal.i {
        g() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new TreeMap();
        }
    }

    class h implements com.google.gson.internal.i {
        h() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new LinkedHashMap();
        }
    }

    class i implements com.google.gson.internal.i {
        i() {
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            return new com.google.gson.internal.g();
        }
    }

    class j implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f26026a;

        j(Class cls) {
            this.f26026a = cls;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            try {
                return com.google.gson.internal.n.INSTANCE.newInstance(this.f26026a);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to create instance of " + this.f26026a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e8);
            }
        }
    }

    class k implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26028a;

        k(String str) {
            this.f26028a = str;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            throw new com.google.gson.j(this.f26028a);
        }
    }

    class l implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26030a;

        l(String str) {
            this.f26030a = str;
        }

        @Override // com.google.gson.internal.i
        public T construct() {
            throw new com.google.gson.j(this.f26030a);
        }
    }

    class m implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26032a;

        m(String str) {
            this.f26032a = str;
        }

        @Override // com.google.gson.internal.i
        public T construct() {
            throw new com.google.gson.j(this.f26032a);
        }
    }

    class n implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f26034a;

        n(Type type) {
            this.f26034a = type;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            Type type = this.f26034a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.j("Invalid EnumSet type: " + this.f26034a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.j("Invalid EnumSet type: " + this.f26034a.toString());
        }
    }

    class o implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f26035a;

        o(Type type) {
            this.f26035a = type;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            Type type = this.f26035a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.j("Invalid EnumMap type: " + this.f26035a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new com.google.gson.j("Invalid EnumMap type: " + this.f26035a.toString());
        }
    }

    class p implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26036a;

        p(String str) {
            this.f26036a = str;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            throw new com.google.gson.j(this.f26036a);
        }
    }

    class q implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26037a;

        q(String str) {
            this.f26037a = str;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            throw new com.google.gson.j(this.f26037a);
        }
    }

    class r implements com.google.gson.internal.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f26038a;

        r(Constructor constructor) {
            this.f26038a = constructor;
        }

        @Override // com.google.gson.internal.i
        public Object construct() {
            try {
                return this.f26038a.newInstance(null);
            } catch (IllegalAccessException e8) {
                throw B3.a.createExceptionForUnexpectedIllegalAccess(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Failed to invoke constructor '" + B3.a.constructorToString(this.f26038a) + "' with no args", e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + B3.a.constructorToString(this.f26038a) + "' with no args", e10.getCause());
            }
        }
    }

    public c(Map<Type, Object> map, boolean z8, List<t> list) {
        this.f26023a = map;
        this.f26024b = z8;
        this.f26025c = list;
    }

    static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    private static com.google.gson.internal.i b(Class cls, t.e eVar) throws NoSuchMethodException, SecurityException {
        String strTryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            t.e eVar2 = t.e.ALLOW;
            if (eVar == eVar2 || (com.google.gson.internal.l.canAccess(declaredConstructor, null) && (eVar != t.e.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (eVar != eVar2 || (strTryMakeAccessible = B3.a.tryMakeAccessible(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strTryMakeAccessible);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static com.google.gson.internal.i c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0213c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C3.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    private static com.google.gson.internal.i d(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private com.google.gson.internal.i e(Class cls) {
        if (this.f26024b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> com.google.gson.internal.i get(C3.a aVar) throws NoSuchMethodException, SecurityException {
        Type type = aVar.getType();
        Class<Object> rawType = aVar.getRawType();
        android.support.v4.media.session.f.a(this.f26023a.get(type));
        android.support.v4.media.session.f.a(this.f26023a.get(rawType));
        com.google.gson.internal.i iVarD = d(type, rawType);
        if (iVarD != null) {
            return iVarD;
        }
        t.e filterResult = com.google.gson.internal.l.getFilterResult(this.f26025c, rawType);
        com.google.gson.internal.i iVarB = b(rawType, filterResult);
        if (iVarB != null) {
            return iVarB;
        }
        com.google.gson.internal.i iVarC = c(type, rawType);
        if (iVarC != null) {
            return iVarC;
        }
        String strA = a(rawType);
        if (strA != null) {
            return new l(strA);
        }
        if (filterResult == t.e.ALLOW) {
            return e(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f26023a.toString();
    }
}
