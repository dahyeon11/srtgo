package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {

    /* renamed from: A */
    static final d f25851A = c.IDENTITY;

    /* renamed from: B */
    static final v f25852B = u.DOUBLE;

    /* renamed from: C */
    static final v f25853C = u.LAZILY_PARSED_NUMBER;

    /* renamed from: z */
    static final String f25854z = null;

    /* renamed from: a */
    private final ThreadLocal f25855a;

    /* renamed from: b */
    private final ConcurrentMap f25856b;

    /* renamed from: c */
    private final com.google.gson.internal.c f25857c;

    /* renamed from: d */
    private final com.google.gson.internal.bind.a f25858d;

    /* renamed from: e */
    final List f25859e;

    /* renamed from: f */
    final Excluder f25860f;

    /* renamed from: g */
    final d f25861g;

    /* renamed from: h */
    final Map f25862h;

    /* renamed from: i */
    final boolean f25863i;

    /* renamed from: j */
    final boolean f25864j;

    /* renamed from: k */
    final boolean f25865k;

    /* renamed from: l */
    final boolean f25866l;

    /* renamed from: m */
    final boolean f25867m;

    /* renamed from: n */
    final boolean f25868n;

    /* renamed from: o */
    final boolean f25869o;

    /* renamed from: p */
    final boolean f25870p;

    /* renamed from: q */
    final String f25871q;

    /* renamed from: r */
    final int f25872r;

    /* renamed from: s */
    final int f25873s;

    /* renamed from: t */
    final s f25874t;

    /* renamed from: u */
    final List f25875u;

    /* renamed from: v */
    final List f25876v;

    /* renamed from: w */
    final v f25877w;

    /* renamed from: x */
    final v f25878x;

    /* renamed from: y */
    final List f25879y;

    /* renamed from: com.google.gson.Gson$1 */
    class AnonymousClass1 extends TypeAdapter {
        AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public Double read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
                return;
            }
            double dDoubleValue = number.doubleValue();
            Gson.d(dDoubleValue);
            cVar.value(dDoubleValue);
        }
    }

    /* renamed from: com.google.gson.Gson$2 */
    class AnonymousClass2 extends TypeAdapter {
        AnonymousClass2() {
        }

        @Override // com.google.gson.TypeAdapter
        public Float read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
                return;
            }
            float fFloatValue = number.floatValue();
            Gson.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.value(number);
        }
    }

    /* renamed from: com.google.gson.Gson$3 */
    class AnonymousClass3 extends TypeAdapter {
        AnonymousClass3() {
        }

        @Override // com.google.gson.TypeAdapter
        public Number read(D3.a aVar) throws IOException {
            if (aVar.peek() != D3.b.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.Gson$4 */
    class AnonymousClass4 extends TypeAdapter {
        AnonymousClass4() {
        }

        @Override // com.google.gson.TypeAdapter
        public AtomicLong read(D3.a aVar) {
            return new AtomicLong(((Number) typeAdapter.read(aVar)).longValue());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, AtomicLong atomicLong) {
            typeAdapter.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.Gson$5 */
    class AnonymousClass5 extends TypeAdapter {
        AnonymousClass5() {
        }

        @Override // com.google.gson.TypeAdapter
        public AtomicLongArray read(D3.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.beginArray();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) typeAdapter.read(aVar)).longValue()));
            }
            aVar.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i8 = 0; i8 < size; i8++) {
                atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.beginArray();
            int length = atomicLongArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                typeAdapter.write(cVar, Long.valueOf(atomicLongArray.get(i8)));
            }
            cVar.endArray();
        }
    }

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter f25884a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter a() {
            TypeAdapter typeAdapter = this.f25884a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter getSerializationDelegate() {
            return a();
        }

        @Override // com.google.gson.TypeAdapter
        public T read(D3.a aVar) {
            return (T) a().read(aVar);
        }

        public void setDelegate(TypeAdapter typeAdapter) {
            if (this.f25884a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f25884a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, T t8) {
            a().write(cVar, t8);
        }
    }

    public Gson() {
        this(Excluder.DEFAULT, f25851A, Collections.emptyMap(), false, false, false, true, false, false, false, true, s.DEFAULT, f25854z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f25852B, f25853C, Collections.emptyList());
    }

    private static void a(Object obj, D3.a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() == D3.b.END_DOCUMENT) {
                } else {
                    throw new r("JSON document was not fully consumed.");
                }
            } catch (D3.d e8) {
                throw new r(e8);
            } catch (IOException e9) {
                throw new j(e9);
            }
        }
    }

    private static TypeAdapter b(TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.4
            AnonymousClass4() {
            }

            @Override // com.google.gson.TypeAdapter
            public AtomicLong read(D3.a aVar) {
                return new AtomicLong(((Number) typeAdapter.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, AtomicLong atomicLong) {
                typeAdapter.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter c(TypeAdapter typeAdapter) {
        return new TypeAdapter() { // from class: com.google.gson.Gson.5
            AnonymousClass5() {
            }

            @Override // com.google.gson.TypeAdapter
            public AtomicLongArray read(D3.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.beginArray();
                while (aVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.read(aVar)).longValue()));
                }
                aVar.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i8 = 0; i8 < size; i8++) {
                    atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.beginArray();
                int length = atomicLongArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    typeAdapter.write(cVar, Long.valueOf(atomicLongArray.get(i8)));
                }
                cVar.endArray();
            }
        }.nullSafe();
    }

    static void d(double d9) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(d9 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter e(boolean z8) {
        return z8 ? TypeAdapters.DOUBLE : new TypeAdapter() { // from class: com.google.gson.Gson.1
            AnonymousClass1() {
            }

            @Override // com.google.gson.TypeAdapter
            public Double read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Double.valueOf(aVar.nextDouble());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.d(dDoubleValue);
                cVar.value(dDoubleValue);
            }
        };
    }

    private TypeAdapter f(boolean z8) {
        return z8 ? TypeAdapters.FLOAT : new TypeAdapter() { // from class: com.google.gson.Gson.2
            AnonymousClass2() {
            }

            @Override // com.google.gson.TypeAdapter
            public Float read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Float.valueOf((float) aVar.nextDouble());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                    return;
                }
                float fFloatValue = number.floatValue();
                Gson.d(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                cVar.value(number);
            }
        };
    }

    private static TypeAdapter g(s sVar) {
        return sVar == s.DEFAULT ? TypeAdapters.LONG : new TypeAdapter() { // from class: com.google.gson.Gson.3
            AnonymousClass3() {
            }

            @Override // com.google.gson.TypeAdapter
            public Number read(D3.a aVar) throws IOException {
                if (aVar.peek() != D3.b.NULL) {
                    return Long.valueOf(aVar.nextLong());
                }
                aVar.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(D3.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.nullValue();
                } else {
                    cVar.value(number.toString());
                }
            }
        };
    }

    @Deprecated
    public Excluder excluder() {
        return this.f25860f;
    }

    public d fieldNamingStrategy() {
        return this.f25861g;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        return (T) com.google.gson.internal.k.wrap(cls).cast(fromJson(str, C3.a.get((Class) cls)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0051, code lost:
    
        r2.setDelegate(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.google.gson.TypeAdapter getAdapter(C3.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f25856b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.f25855a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f25855a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.f25859e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.w r4 = (com.google.gson.w) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.f25855a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r6.f25856b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r0 = r6.f25855a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.getAdapter(C3.a):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter getDelegateAdapter(w wVar, C3.a aVar) {
        if (!this.f25859e.contains(wVar)) {
            wVar = this.f25858d;
        }
        boolean z8 = false;
        for (w wVar2 : this.f25859e) {
            if (z8) {
                TypeAdapter typeAdapterCreate = wVar2.create(this, aVar);
                if (typeAdapterCreate != null) {
                    return typeAdapterCreate;
                }
            } else if (wVar2 == wVar) {
                z8 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.f25866l;
    }

    public e newBuilder() {
        return new e(this);
    }

    public D3.a newJsonReader(Reader reader) {
        D3.a aVar = new D3.a(reader);
        aVar.setLenient(this.f25868n);
        return aVar;
    }

    public D3.c newJsonWriter(Writer writer) throws IOException {
        if (this.f25865k) {
            writer.write(")]}'\n");
        }
        D3.c cVar = new D3.c(writer);
        if (this.f25867m) {
            cVar.setIndent("  ");
        }
        cVar.setHtmlSafe(this.f25866l);
        cVar.setLenient(this.f25868n);
        cVar.setSerializeNulls(this.f25863i);
        return cVar;
    }

    public boolean serializeNulls() {
        return this.f25863i;
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((i) k.INSTANCE) : toJson(obj, obj.getClass());
    }

    public i toJsonTree(Object obj) {
        return obj == null ? k.INSTANCE : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f25863i + ",factories:" + this.f25859e + ",instanceCreators:" + this.f25857c + "}";
    }

    public <T> T fromJson(String str, Type type) {
        return (T) fromJson(str, C3.a.get(type));
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public i toJsonTree(Object obj, Type type) {
        com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c();
        toJson(obj, type, cVar);
        return cVar.get();
    }

    public <T> T fromJson(String str, C3.a aVar) {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), aVar);
    }

    public <T> T fromJson(Reader reader, Class<T> cls) {
        return (T) com.google.gson.internal.k.wrap(cls).cast(fromJson(reader, C3.a.get((Class) cls)));
    }

    public void toJson(Object obj, Appendable appendable) {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((i) k.INSTANCE, appendable);
        }
    }

    Gson(Excluder excluder, d dVar, Map map, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, s sVar, String str, int i8, int i9, List list, List list2, List list3, v vVar, v vVar2, List list4) {
        this.f25855a = new ThreadLocal();
        this.f25856b = new ConcurrentHashMap();
        this.f25860f = excluder;
        this.f25861g = dVar;
        this.f25862h = map;
        com.google.gson.internal.c cVar = new com.google.gson.internal.c(map, z15, list4);
        this.f25857c = cVar;
        this.f25863i = z8;
        this.f25864j = z9;
        this.f25865k = z10;
        this.f25866l = z11;
        this.f25867m = z12;
        this.f25868n = z13;
        this.f25869o = z14;
        this.f25870p = z15;
        this.f25874t = sVar;
        this.f25871q = str;
        this.f25872r = i8;
        this.f25873s = i9;
        this.f25875u = list;
        this.f25876v = list2;
        this.f25877w = vVar;
        this.f25878x = vVar2;
        this.f25879y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.getFactory(vVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        TypeAdapter typeAdapterG = g(sVar);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, typeAdapterG));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.getFactory(vVar2));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, b(typeAdapterG)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, c(typeAdapterG)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.newFactory(com.google.gson.internal.f.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        if (com.google.gson.internal.sql.a.SUPPORTS_SQL_TYPES) {
            arrayList.add(com.google.gson.internal.sql.a.TIME_FACTORY);
            arrayList.add(com.google.gson.internal.sql.a.DATE_FACTORY);
            arrayList.add(com.google.gson.internal.sql.a.TIMESTAMP_FACTORY);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z9));
        com.google.gson.internal.bind.a aVar = new com.google.gson.internal.bind.a(cVar);
        this.f25858d = aVar;
        arrayList.add(aVar);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, aVar, list4));
        this.f25859e = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Type type) {
        return (T) fromJson(reader, C3.a.get(type));
    }

    public void toJson(Object obj, Type type, Appendable appendable) {
        try {
            toJson(obj, type, newJsonWriter(com.google.gson.internal.m.writerForAppendable(appendable)));
        } catch (IOException e8) {
            throw new j(e8);
        }
    }

    public <T> T fromJson(Reader reader, C3.a aVar) {
        D3.a aVarNewJsonReader = newJsonReader(reader);
        T t8 = (T) fromJson(aVarNewJsonReader, aVar);
        a(t8, aVarNewJsonReader);
        return t8;
    }

    public void toJson(Object obj, Type type, D3.c cVar) {
        TypeAdapter adapter = getAdapter(C3.a.get(type));
        boolean zIsLenient = cVar.isLenient();
        cVar.setLenient(true);
        boolean zIsHtmlSafe = cVar.isHtmlSafe();
        cVar.setHtmlSafe(this.f25866l);
        boolean serializeNulls = cVar.getSerializeNulls();
        cVar.setSerializeNulls(this.f25863i);
        try {
            try {
                adapter.write(cVar, obj);
            } catch (IOException e8) {
                throw new j(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.setLenient(zIsLenient);
            cVar.setHtmlSafe(zIsHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
        }
    }

    public <T> T fromJson(D3.a aVar, Type type) {
        return (T) fromJson(aVar, C3.a.get(type));
    }

    public <T> T fromJson(D3.a aVar, C3.a aVar2) {
        boolean zIsLenient = aVar.isLenient();
        boolean z8 = true;
        aVar.setLenient(true);
        try {
            try {
                try {
                    aVar.peek();
                    z8 = false;
                    return (T) getAdapter(aVar2).read(aVar);
                } catch (EOFException e8) {
                    if (z8) {
                        aVar.setLenient(zIsLenient);
                        return null;
                    }
                    throw new r(e8);
                } catch (IOException e9) {
                    throw new r(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        } finally {
            aVar.setLenient(zIsLenient);
        }
    }

    public <T> TypeAdapter getAdapter(Class<T> cls) {
        return getAdapter(C3.a.get((Class) cls));
    }

    public <T> T fromJson(i iVar, Class<T> cls) {
        return (T) com.google.gson.internal.k.wrap(cls).cast(fromJson(iVar, C3.a.get((Class) cls)));
    }

    public <T> T fromJson(i iVar, Type type) {
        return (T) fromJson(iVar, C3.a.get(type));
    }

    public String toJson(i iVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(iVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(i iVar, C3.a aVar) {
        if (iVar == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.b(iVar), aVar);
    }

    public void toJson(i iVar, Appendable appendable) {
        try {
            toJson(iVar, newJsonWriter(com.google.gson.internal.m.writerForAppendable(appendable)));
        } catch (IOException e8) {
            throw new j(e8);
        }
    }

    public void toJson(i iVar, D3.c cVar) {
        boolean zIsLenient = cVar.isLenient();
        cVar.setLenient(true);
        boolean zIsHtmlSafe = cVar.isHtmlSafe();
        cVar.setHtmlSafe(this.f25866l);
        boolean serializeNulls = cVar.getSerializeNulls();
        cVar.setSerializeNulls(this.f25863i);
        try {
            try {
                com.google.gson.internal.m.write(iVar, cVar);
            } catch (IOException e8) {
                throw new j(e8);
            } catch (AssertionError e9) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e9.getMessage(), e9);
            }
        } finally {
            cVar.setLenient(zIsLenient);
            cVar.setHtmlSafe(zIsHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
        }
    }
}
