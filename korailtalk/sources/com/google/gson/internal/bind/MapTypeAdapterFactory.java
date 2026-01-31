package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.e;
import com.google.gson.internal.i;
import com.google.gson.internal.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f25937a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f25938b;

    private final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f25939a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter f25940b;

        /* renamed from: c, reason: collision with root package name */
        private final i f25941c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, i iVar) {
            this.f25939a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f25940b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f25941c = iVar;
        }

        private String a(com.google.gson.i iVar) {
            if (!iVar.isJsonPrimitive()) {
                if (iVar.isJsonNull()) {
                    return "null";
                }
                throw new AssertionError();
            }
            o asJsonPrimitive = iVar.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return String.valueOf(asJsonPrimitive.getAsNumber());
            }
            if (asJsonPrimitive.isBoolean()) {
                return Boolean.toString(asJsonPrimitive.getAsBoolean());
            }
            if (asJsonPrimitive.isString()) {
                return asJsonPrimitive.getAsString();
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public Map<K, V> read(D3.a aVar) throws IOException {
            D3.b bVarPeek = aVar.peek();
            if (bVarPeek == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            O.a aVar2 = (Map<K, V>) ((Map) this.f25941c.construct());
            if (bVarPeek == D3.b.BEGIN_ARRAY) {
                aVar.beginArray();
                while (aVar.hasNext()) {
                    aVar.beginArray();
                    Object obj = this.f25939a.read(aVar);
                    if (aVar2.put(obj, this.f25940b.read(aVar)) != null) {
                        throw new r("duplicate key: " + obj);
                    }
                    aVar.endArray();
                }
                aVar.endArray();
            } else {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    e.INSTANCE.promoteNameToValue(aVar);
                    Object obj2 = this.f25939a.read(aVar);
                    if (aVar2.put(obj2, this.f25940b.read(aVar)) != null) {
                        throw new r("duplicate key: " + obj2);
                    }
                }
                aVar.endObject();
            }
            return aVar2;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f25938b) {
                cVar.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.name(String.valueOf(entry.getKey()));
                    this.f25940b.write(cVar, entry.getValue());
                }
                cVar.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z8 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.i jsonTree = this.f25939a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z8 |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (!z8) {
                cVar.beginObject();
                int size = arrayList.size();
                while (i8 < size) {
                    cVar.name(a((com.google.gson.i) arrayList.get(i8)));
                    this.f25940b.write(cVar, arrayList2.get(i8));
                    i8++;
                }
                cVar.endObject();
                return;
            }
            cVar.beginArray();
            int size2 = arrayList.size();
            while (i8 < size2) {
                cVar.beginArray();
                m.write((com.google.gson.i) arrayList.get(i8), cVar);
                this.f25940b.write(cVar, arrayList2.get(i8));
                cVar.endArray();
                i8++;
            }
            cVar.endArray();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.c cVar, boolean z8) {
        this.f25937a = cVar;
        this.f25938b = z8;
    }

    private TypeAdapter a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(C3.a.get(type));
    }

    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, C3.a aVar) throws NoSuchMethodException, SecurityException {
        Type type = aVar.getType();
        Class<Object> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = com.google.gson.internal.b.getMapKeyAndValueTypes(type, rawType);
        return new Adapter(gson, mapKeyAndValueTypes[0], a(gson, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], gson.getAdapter(C3.a.get(mapKeyAndValueTypes[1])), this.f25937a.get(aVar));
    }
}
