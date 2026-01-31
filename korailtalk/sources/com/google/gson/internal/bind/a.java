package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.w;
import z3.InterfaceC6621b;

/* loaded from: classes2.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f26010a;

    public a(com.google.gson.internal.c cVar) {
        this.f26010a = cVar;
    }

    TypeAdapter a(com.google.gson.internal.c cVar, Gson gson, C3.a aVar, InterfaceC6621b interfaceC6621b) {
        TypeAdapter typeAdapterCreate;
        Object objConstruct = cVar.get(C3.a.get(interfaceC6621b.value())).construct();
        boolean zNullSafe = interfaceC6621b.nullSafe();
        if (objConstruct instanceof TypeAdapter) {
            typeAdapterCreate = (TypeAdapter) objConstruct;
        } else {
            if (!(objConstruct instanceof w)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            typeAdapterCreate = ((w) objConstruct).create(gson, aVar);
        }
        return (typeAdapterCreate == null || !zNullSafe) ? typeAdapterCreate : typeAdapterCreate.nullSafe();
    }

    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, C3.a aVar) {
        InterfaceC6621b interfaceC6621b = (InterfaceC6621b) aVar.getRawType().getAnnotation(InterfaceC6621b.class);
        if (interfaceC6621b == null) {
            return null;
        }
        return a(this.f26010a, gson, aVar, interfaceC6621b);
    }
}
