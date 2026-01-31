package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Excluder f25888a;

    /* renamed from: b, reason: collision with root package name */
    private s f25889b;

    /* renamed from: c, reason: collision with root package name */
    private d f25890c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f25891d;

    /* renamed from: e, reason: collision with root package name */
    private final List f25892e;

    /* renamed from: f, reason: collision with root package name */
    private final List f25893f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25894g;

    /* renamed from: h, reason: collision with root package name */
    private String f25895h;

    /* renamed from: i, reason: collision with root package name */
    private int f25896i;

    /* renamed from: j, reason: collision with root package name */
    private int f25897j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25898k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25899l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25900m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25901n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25902o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25903p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25904q;

    /* renamed from: r, reason: collision with root package name */
    private v f25905r;

    /* renamed from: s, reason: collision with root package name */
    private v f25906s;

    /* renamed from: t, reason: collision with root package name */
    private final LinkedList f25907t;

    public e() {
        this.f25888a = Excluder.DEFAULT;
        this.f25889b = s.DEFAULT;
        this.f25890c = c.IDENTITY;
        this.f25891d = new HashMap();
        this.f25892e = new ArrayList();
        this.f25893f = new ArrayList();
        this.f25894g = false;
        this.f25895h = Gson.f25854z;
        this.f25896i = 2;
        this.f25897j = 2;
        this.f25898k = false;
        this.f25899l = false;
        this.f25900m = true;
        this.f25901n = false;
        this.f25902o = false;
        this.f25903p = false;
        this.f25904q = true;
        this.f25905r = Gson.f25852B;
        this.f25906s = Gson.f25853C;
        this.f25907t = new LinkedList();
    }

    private void a(String str, int i8, int i9, List list) {
        w wVarCreateAdapterFactory;
        w wVarCreateAdapterFactory2;
        boolean z8 = com.google.gson.internal.sql.a.SUPPORTS_SQL_TYPES;
        w wVarCreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            wVarCreateAdapterFactory = DefaultDateTypeAdapter.b.DATE.createAdapterFactory(str);
            if (z8) {
                wVarCreateAdapterFactory3 = com.google.gson.internal.sql.a.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                wVarCreateAdapterFactory2 = com.google.gson.internal.sql.a.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                wVarCreateAdapterFactory2 = null;
            }
        } else {
            if (i8 == 2 || i9 == 2) {
                return;
            }
            w wVarCreateAdapterFactory4 = DefaultDateTypeAdapter.b.DATE.createAdapterFactory(i8, i9);
            if (z8) {
                wVarCreateAdapterFactory3 = com.google.gson.internal.sql.a.TIMESTAMP_DATE_TYPE.createAdapterFactory(i8, i9);
                w wVarCreateAdapterFactory5 = com.google.gson.internal.sql.a.DATE_DATE_TYPE.createAdapterFactory(i8, i9);
                wVarCreateAdapterFactory = wVarCreateAdapterFactory4;
                wVarCreateAdapterFactory2 = wVarCreateAdapterFactory5;
            } else {
                wVarCreateAdapterFactory = wVarCreateAdapterFactory4;
                wVarCreateAdapterFactory2 = null;
            }
        }
        list.add(wVarCreateAdapterFactory);
        if (z8) {
            list.add(wVarCreateAdapterFactory3);
            list.add(wVarCreateAdapterFactory2);
        }
    }

    public e addDeserializationExclusionStrategy(a aVar) {
        Objects.requireNonNull(aVar);
        this.f25888a = this.f25888a.withExclusionStrategy(aVar, false, true);
        return this;
    }

    public e addReflectionAccessFilter(t tVar) {
        Objects.requireNonNull(tVar);
        this.f25907t.addFirst(tVar);
        return this;
    }

    public e addSerializationExclusionStrategy(a aVar) {
        Objects.requireNonNull(aVar);
        this.f25888a = this.f25888a.withExclusionStrategy(aVar, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(this.f25892e.size() + this.f25893f.size() + 3);
        arrayList.addAll(this.f25892e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f25893f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f25895h, this.f25896i, this.f25897j, arrayList);
        return new Gson(this.f25888a, this.f25890c, new HashMap(this.f25891d), this.f25894g, this.f25898k, this.f25902o, this.f25900m, this.f25901n, this.f25903p, this.f25899l, this.f25904q, this.f25889b, this.f25895h, this.f25896i, this.f25897j, new ArrayList(this.f25892e), new ArrayList(this.f25893f), arrayList, this.f25905r, this.f25906s, new ArrayList(this.f25907t));
    }

    public e disableHtmlEscaping() {
        this.f25900m = false;
        return this;
    }

    public e disableInnerClassSerialization() {
        this.f25888a = this.f25888a.disableInnerClassSerialization();
        return this;
    }

    public e disableJdkUnsafe() {
        this.f25904q = false;
        return this;
    }

    public e enableComplexMapKeySerialization() {
        this.f25898k = true;
        return this;
    }

    public e excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.f25888a = this.f25888a.withModifiers(iArr);
        return this;
    }

    public e excludeFieldsWithoutExposeAnnotation() {
        this.f25888a = this.f25888a.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public e generateNonExecutableJson() {
        this.f25902o = true;
        return this;
    }

    public e registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        com.google.gson.internal.a.checkArgument(obj instanceof TypeAdapter);
        if (obj instanceof TypeAdapter) {
            this.f25892e.add(TypeAdapters.newFactory(C3.a.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public e registerTypeAdapterFactory(w wVar) {
        Objects.requireNonNull(wVar);
        this.f25892e.add(wVar);
        return this;
    }

    public e registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        com.google.gson.internal.a.checkArgument(obj instanceof TypeAdapter);
        if (obj instanceof TypeAdapter) {
            this.f25892e.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public e serializeNulls() {
        this.f25894g = true;
        return this;
    }

    public e serializeSpecialFloatingPointValues() {
        this.f25899l = true;
        return this;
    }

    public e setDateFormat(String str) {
        this.f25895h = str;
        return this;
    }

    public e setExclusionStrategies(a... aVarArr) {
        Objects.requireNonNull(aVarArr);
        for (a aVar : aVarArr) {
            this.f25888a = this.f25888a.withExclusionStrategy(aVar, true, true);
        }
        return this;
    }

    public e setFieldNamingPolicy(c cVar) {
        return setFieldNamingStrategy(cVar);
    }

    public e setFieldNamingStrategy(d dVar) {
        Objects.requireNonNull(dVar);
        this.f25890c = dVar;
        return this;
    }

    public e setLenient() {
        this.f25903p = true;
        return this;
    }

    public e setLongSerializationPolicy(s sVar) {
        Objects.requireNonNull(sVar);
        this.f25889b = sVar;
        return this;
    }

    public e setNumberToNumberStrategy(v vVar) {
        Objects.requireNonNull(vVar);
        this.f25906s = vVar;
        return this;
    }

    public e setObjectToNumberStrategy(v vVar) {
        Objects.requireNonNull(vVar);
        this.f25905r = vVar;
        return this;
    }

    public e setPrettyPrinting() {
        this.f25901n = true;
        return this;
    }

    public e setVersion(double d9) {
        if (!Double.isNaN(d9) && d9 >= 0.0d) {
            this.f25888a = this.f25888a.withVersion(d9);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d9);
    }

    public e setDateFormat(int i8) {
        this.f25896i = i8;
        this.f25895h = null;
        return this;
    }

    public e setDateFormat(int i8, int i9) {
        this.f25896i = i8;
        this.f25897j = i9;
        this.f25895h = null;
        return this;
    }

    e(Gson gson) {
        this.f25888a = Excluder.DEFAULT;
        this.f25889b = s.DEFAULT;
        this.f25890c = c.IDENTITY;
        HashMap map = new HashMap();
        this.f25891d = map;
        ArrayList arrayList = new ArrayList();
        this.f25892e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f25893f = arrayList2;
        this.f25894g = false;
        this.f25895h = Gson.f25854z;
        this.f25896i = 2;
        this.f25897j = 2;
        this.f25898k = false;
        this.f25899l = false;
        this.f25900m = true;
        this.f25901n = false;
        this.f25902o = false;
        this.f25903p = false;
        this.f25904q = true;
        this.f25905r = Gson.f25852B;
        this.f25906s = Gson.f25853C;
        LinkedList linkedList = new LinkedList();
        this.f25907t = linkedList;
        this.f25888a = gson.f25860f;
        this.f25890c = gson.f25861g;
        map.putAll(gson.f25862h);
        this.f25894g = gson.f25863i;
        this.f25898k = gson.f25864j;
        this.f25902o = gson.f25865k;
        this.f25900m = gson.f25866l;
        this.f25901n = gson.f25867m;
        this.f25903p = gson.f25868n;
        this.f25899l = gson.f25869o;
        this.f25889b = gson.f25874t;
        this.f25895h = gson.f25871q;
        this.f25896i = gson.f25872r;
        this.f25897j = gson.f25873s;
        arrayList.addAll(gson.f25875u);
        arrayList2.addAll(gson.f25876v);
        this.f25904q = gson.f25870p;
        this.f25905r = gson.f25877w;
        this.f25906s = gson.f25878x;
        linkedList.addAll(gson.f25879y);
    }
}
