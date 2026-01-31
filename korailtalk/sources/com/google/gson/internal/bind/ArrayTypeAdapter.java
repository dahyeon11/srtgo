package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {
    public static final w FACTORY = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Class f25928a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f25929b;

    class a implements w {
        a() {
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = com.google.gson.internal.b.getArrayComponentType(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(C3.a.get(arrayComponentType)), com.google.gson.internal.b.getRawType(arrayComponentType));
        }
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class<E> cls) {
        this.f25929b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f25928a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object read(D3.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.peek() == D3.b.NULL) {
            aVar.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.beginArray();
        while (aVar.hasNext()) {
            arrayList.add(this.f25929b.read(aVar));
        }
        aVar.endArray();
        int size = arrayList.size();
        if (!this.f25928a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f25928a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f25928a, size);
        for (int i8 = 0; i8 < size; i8++) {
            Array.set(objNewInstance, i8, arrayList.get(i8));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.nullValue();
            return;
        }
        cVar.beginArray();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f25929b.write(cVar, Array.get(obj, i8));
        }
        cVar.endArray();
    }
}
