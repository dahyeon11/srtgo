package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.i;
import com.google.gson.internal.k;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z3.InterfaceC6621b;
import z3.InterfaceC6622c;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements w {

    /* renamed from: a */
    private final com.google.gson.internal.c f25952a;

    /* renamed from: b */
    private final d f25953b;

    /* renamed from: c */
    private final Excluder f25954c;

    /* renamed from: d */
    private final com.google.gson.internal.bind.a f25955d;

    /* renamed from: e */
    private final List f25956e;

    public static abstract class Adapter<T, A> extends TypeAdapter {

        /* renamed from: a */
        final Map f25957a;

        Adapter(Map map) {
            this.f25957a = map;
        }

        abstract Object a();

        abstract Object b(Object obj);

        abstract void c(Object obj, D3.a aVar, b bVar);

        @Override // com.google.gson.TypeAdapter
        public T read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            Object objA = a();
            try {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    b bVar = (b) this.f25957a.get(aVar.nextName());
                    if (bVar == null || !bVar.f25976e) {
                        aVar.skipValue();
                    } else {
                        c(objA, aVar, bVar);
                    }
                }
                aVar.endObject();
                return (T) b(objA);
            } catch (IllegalAccessException e8) {
                throw B3.a.createExceptionForUnexpectedIllegalAccess(e8);
            } catch (IllegalStateException e9) {
                throw new r(e9);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, T t8) throws IOException {
            if (t8 == null) {
                cVar.nullValue();
                return;
            }
            cVar.beginObject();
            try {
                Iterator it = this.f25957a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(cVar, t8);
                }
                cVar.endObject();
            } catch (IllegalAccessException e8) {
                throw B3.a.createExceptionForUnexpectedIllegalAccess(e8);
            }
        }
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b */
        private final i f25958b;

        FieldReflectionAdapter(i iVar, Map map) {
            super(map);
            this.f25958b = iVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object a() {
            return this.f25958b.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object b(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void c(Object obj, D3.a aVar, b bVar) {
            bVar.b(aVar, obj);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e */
        static final Map f25959e = f();

        /* renamed from: b */
        private final Constructor f25960b;

        /* renamed from: c */
        private final Object[] f25961c;

        /* renamed from: d */
        private final Map f25962d;

        RecordAdapter(Class cls, Map map, boolean z8) {
            super(map);
            this.f25962d = new HashMap();
            Constructor canonicalRecordConstructor = B3.a.getCanonicalRecordConstructor(cls);
            this.f25960b = canonicalRecordConstructor;
            if (z8) {
                ReflectiveTypeAdapterFactory.b(null, canonicalRecordConstructor);
            } else {
                B3.a.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = B3.a.getRecordComponentNames(cls);
            for (int i8 = 0; i8 < recordComponentNames.length; i8++) {
                this.f25962d.put(recordComponentNames[i8], Integer.valueOf(i8));
            }
            Class<?>[] parameterTypes = this.f25960b.getParameterTypes();
            this.f25961c = new Object[parameterTypes.length];
            for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                this.f25961c[i9] = f25959e.get(parameterTypes[i9]);
            }
        }

        private static Map f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: d */
        public Object[] a() {
            return (Object[]) this.f25961c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: e */
        public Object b(Object[] objArr) {
            try {
                return this.f25960b.newInstance(objArr);
            } catch (IllegalAccessException e8) {
                throw B3.a.createExceptionForUnexpectedIllegalAccess(e8);
            } catch (IllegalArgumentException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + B3.a.constructorToString(this.f25960b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e10) {
                e = e10;
                throw new RuntimeException("Failed to invoke constructor '" + B3.a.constructorToString(this.f25960b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + B3.a.constructorToString(this.f25960b) + "' with args " + Arrays.toString(objArr), e11.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: g */
        public void c(Object[] objArr, D3.a aVar, b bVar) {
            Integer num = (Integer) this.f25962d.get(bVar.f25974c);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + B3.a.constructorToString(this.f25960b) + "' for field with name '" + bVar.f25974c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    class a extends b {

        /* renamed from: f */
        final /* synthetic */ boolean f25963f;

        /* renamed from: g */
        final /* synthetic */ Method f25964g;

        /* renamed from: h */
        final /* synthetic */ boolean f25965h;

        /* renamed from: i */
        final /* synthetic */ TypeAdapter f25966i;

        /* renamed from: j */
        final /* synthetic */ Gson f25967j;

        /* renamed from: k */
        final /* synthetic */ C3.a f25968k;

        /* renamed from: l */
        final /* synthetic */ boolean f25969l;

        /* renamed from: m */
        final /* synthetic */ boolean f25970m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z8, boolean z9, boolean z10, Method method, boolean z11, TypeAdapter typeAdapter, Gson gson, C3.a aVar, boolean z12, boolean z13) {
            super(str, field, z8, z9);
            this.f25963f = z10;
            this.f25964g = method;
            this.f25965h = z11;
            this.f25966i = typeAdapter;
            this.f25967j = gson;
            this.f25968k = aVar;
            this.f25969l = z12;
            this.f25970m = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(D3.a aVar, int i8, Object[] objArr) {
            Object obj = this.f25966i.read(aVar);
            if (obj != null || !this.f25969l) {
                objArr[i8] = obj;
                return;
            }
            throw new m("null is not allowed as value for record component '" + this.f25974c + "' of primitive type; at path " + aVar.getPath());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(D3.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            Object obj2 = this.f25966i.read(aVar);
            if (obj2 == null && this.f25969l) {
                return;
            }
            if (this.f25963f) {
                ReflectiveTypeAdapterFactory.b(obj, this.f25973b);
            } else if (this.f25970m) {
                throw new j("Cannot set value of 'static final' " + B3.a.getAccessibleObjectDescription(this.f25973b, false));
            }
            this.f25973b.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void c(D3.c cVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objInvoke;
            if (this.f25975d) {
                if (this.f25963f) {
                    Method method = this.f25964g;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.b(obj, this.f25973b);
                    } else {
                        ReflectiveTypeAdapterFactory.b(obj, method);
                    }
                }
                Method method2 = this.f25964g;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, null);
                    } catch (InvocationTargetException e8) {
                        throw new j("Accessor " + B3.a.getAccessibleObjectDescription(this.f25964g, false) + " threw exception", e8.getCause());
                    }
                } else {
                    objInvoke = this.f25973b.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                cVar.name(this.f25972a);
                (this.f25965h ? this.f25966i : new TypeAdapterRuntimeTypeWrapper(this.f25967j, this.f25966i, this.f25968k.getType())).write(cVar, objInvoke);
            }
        }
    }

    static abstract class b {

        /* renamed from: a */
        final String f25972a;

        /* renamed from: b */
        final Field f25973b;

        /* renamed from: c */
        final String f25974c;

        /* renamed from: d */
        final boolean f25975d;

        /* renamed from: e */
        final boolean f25976e;

        protected b(String str, Field field, boolean z8, boolean z9) {
            this.f25972a = str;
            this.f25973b = field;
            this.f25974c = field.getName();
            this.f25975d = z8;
            this.f25976e = z9;
        }

        abstract void a(D3.a aVar, int i8, Object[] objArr);

        abstract void b(D3.a aVar, Object obj);

        abstract void c(D3.c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c cVar, d dVar, Excluder excluder, com.google.gson.internal.bind.a aVar, List<t> list) {
        this.f25952a = cVar;
        this.f25953b = dVar;
        this.f25954c = excluder;
        this.f25955d = aVar;
        this.f25956e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (l.canAccess(accessibleObject, obj)) {
            return;
        }
        throw new j(B3.a.getAccessibleObjectDescription(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private b c(Gson gson, Field field, Method method, String str, C3.a aVar, boolean z8, boolean z9, boolean z10) {
        boolean zIsPrimitive = k.isPrimitive(aVar.getRawType());
        int modifiers = field.getModifiers();
        boolean z11 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        InterfaceC6621b interfaceC6621b = (InterfaceC6621b) field.getAnnotation(InterfaceC6621b.class);
        TypeAdapter typeAdapterA = interfaceC6621b != null ? this.f25955d.a(this.f25952a, gson, aVar, interfaceC6621b) : null;
        boolean z12 = typeAdapterA != null;
        if (typeAdapterA == null) {
            typeAdapterA = gson.getAdapter(aVar);
        }
        return new a(str, field, z8, z9, z10, method, z12, typeAdapterA, gson, aVar, zIsPrimitive, z11);
    }

    private Map d(Gson gson, C3.a aVar, Class cls, boolean z8, boolean z9) {
        boolean z10;
        Method method;
        int i8;
        int i9;
        boolean z11;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        C3.a aVar2 = aVar;
        boolean z12 = z8;
        Class rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z13 = true;
            boolean z14 = false;
            if (rawType != cls && declaredFields.length > 0) {
                t.e filterResult = l.getFilterResult(reflectiveTypeAdapterFactory.f25956e, rawType);
                if (filterResult == t.e.BLOCK_ALL) {
                    throw new j("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z12 = filterResult == t.e.BLOCK_INACCESSIBLE;
            }
            boolean z15 = z12;
            int length = declaredFields.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zF = reflectiveTypeAdapterFactory.f(field, z13);
                boolean zF2 = reflectiveTypeAdapterFactory.f(field, z14);
                if (zF || zF2) {
                    b bVar = null;
                    if (!z9) {
                        z10 = zF2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z10 = z14;
                    } else {
                        Method accessor = B3.a.getAccessor(rawType, field);
                        if (!z15) {
                            B3.a.makeAccessible(accessor);
                        }
                        if (accessor.getAnnotation(InterfaceC6622c.class) != null && field.getAnnotation(InterfaceC6622c.class) == null) {
                            throw new j("@SerializedName on " + B3.a.getAccessibleObjectDescription(accessor, z14) + " is not supported");
                        }
                        z10 = zF2;
                        method = accessor;
                    }
                    if (!z15 && method == null) {
                        B3.a.makeAccessible(field);
                    }
                    Type typeResolve = com.google.gson.internal.b.resolve(aVar2.getType(), rawType, field.getGenericType());
                    List listE = reflectiveTypeAdapterFactory.e(field);
                    int size = listE.size();
                    int i11 = z14;
                    while (i11 < size) {
                        String str = (String) listE.get(i11);
                        boolean z16 = i11 != 0 ? z14 : zF;
                        int i12 = i11;
                        b bVar2 = bVar;
                        int i13 = size;
                        List list = listE;
                        Field field2 = field;
                        int i14 = i10;
                        int i15 = length;
                        boolean z17 = z14;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, c(gson, field, method, str, C3.a.get(typeResolve), z16, z10, z15)) : bVar2;
                        i11 = i12 + 1;
                        zF = z16;
                        i10 = i14;
                        size = i13;
                        listE = list;
                        field = field2;
                        length = i15;
                        z14 = z17;
                    }
                    b bVar3 = bVar;
                    Field field3 = field;
                    i8 = i10;
                    i9 = length;
                    z11 = z14;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + bVar3.f25972a + "'; conflict is caused by fields " + B3.a.fieldToString(bVar3.f25973b) + " and " + B3.a.fieldToString(field3));
                    }
                } else {
                    i8 = i10;
                    i9 = length;
                    z11 = z14;
                }
                i10 = i8 + 1;
                z13 = true;
                reflectiveTypeAdapterFactory = this;
                length = i9;
                z14 = z11;
            }
            aVar2 = C3.a.get(com.google.gson.internal.b.resolve(aVar2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = aVar2.getRawType();
            reflectiveTypeAdapterFactory = this;
            z12 = z15;
        }
        return linkedHashMap;
    }

    private List e(Field field) {
        InterfaceC6622c interfaceC6622c = (InterfaceC6622c) field.getAnnotation(InterfaceC6622c.class);
        if (interfaceC6622c == null) {
            return Collections.singletonList(this.f25953b.translateName(field));
        }
        String strValue = interfaceC6622c.value();
        String[] strArrAlternate = interfaceC6622c.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean f(Field field, boolean z8) {
        return (this.f25954c.excludeClass(field.getType(), z8) || this.f25954c.excludeField(field, z8)) ? false : true;
    }

    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, C3.a aVar) {
        Class<Object> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        t.e filterResult = l.getFilterResult(this.f25956e, rawType);
        if (filterResult != t.e.BLOCK_ALL) {
            boolean z8 = filterResult == t.e.BLOCK_INACCESSIBLE;
            return B3.a.isRecord(rawType) ? new RecordAdapter(rawType, d(gson, aVar, rawType, z8, true), z8) : new FieldReflectionAdapter(this.f25952a.get(aVar), d(gson, aVar, rawType, z8, false));
        }
        throw new j("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
