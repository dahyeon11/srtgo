package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f25987a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f25988b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f25989c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f25987a = gson;
        this.f25988b = typeAdapter;
        this.f25989c = type;
    }

    private static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean b(TypeAdapter typeAdapter) {
        TypeAdapter serializationDelegate;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (serializationDelegate = ((SerializationDelegatingTypeAdapter) typeAdapter).getSerializationDelegate()) != typeAdapter) {
            typeAdapter = serializationDelegate;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(D3.a aVar) {
        return (T) this.f25988b.read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, T t8) {
        TypeAdapter adapter = this.f25988b;
        Type typeA = a(this.f25989c, t8);
        if (typeA != this.f25989c) {
            adapter = this.f25987a.getAdapter(C3.a.get(typeA));
            if ((adapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f25988b)) {
                adapter = this.f25988b;
            }
        }
        adapter.write(cVar, t8);
    }
}
