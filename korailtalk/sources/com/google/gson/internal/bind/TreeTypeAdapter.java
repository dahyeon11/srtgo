package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.w;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    final Gson f25977a;

    /* renamed from: b, reason: collision with root package name */
    private final C3.a f25978b;

    /* renamed from: c, reason: collision with root package name */
    private final w f25979c;

    /* renamed from: d, reason: collision with root package name */
    private final b f25980d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25981e;

    /* renamed from: f, reason: collision with root package name */
    private volatile TypeAdapter f25982f;

    private final class b implements p, g {
        private b() {
        }

        @Override // com.google.gson.g
        public <R> R deserialize(i iVar, Type type) {
            return (R) TreeTypeAdapter.this.f25977a.fromJson(iVar, type);
        }

        @Override // com.google.gson.p
        public i serialize(Object obj) {
            return TreeTypeAdapter.this.f25977a.toJsonTree(obj);
        }

        @Override // com.google.gson.p
        public i serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.f25977a.toJsonTree(obj, type);
        }
    }

    private static final class c implements w {

        /* renamed from: a, reason: collision with root package name */
        private final C3.a f25984a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25985b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f25986c;

        c(Object obj, C3.a aVar, boolean z8, Class cls) {
            com.google.gson.internal.a.checkArgument(false);
            this.f25984a = aVar;
            this.f25985b = z8;
            this.f25986c = cls;
        }

        @Override // com.google.gson.w
        public <T> TypeAdapter create(Gson gson, C3.a aVar) {
            C3.a aVar2 = this.f25984a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f25985b && this.f25984a.getType() == aVar.getRawType()) : this.f25986c.isAssignableFrom(aVar.getRawType())) {
                return new TreeTypeAdapter(null, null, gson, aVar, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(q qVar, h hVar, Gson gson, C3.a aVar, w wVar, boolean z8) {
        this.f25980d = new b();
        this.f25977a = gson;
        this.f25978b = aVar;
        this.f25979c = wVar;
        this.f25981e = z8;
    }

    private TypeAdapter a() {
        TypeAdapter typeAdapter = this.f25982f;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter delegateAdapter = this.f25977a.getDelegateAdapter(this.f25979c, this.f25978b);
        this.f25982f = delegateAdapter;
        return delegateAdapter;
    }

    public static w newFactory(C3.a aVar, Object obj) {
        return new c(obj, aVar, false, null);
    }

    public static w newFactoryWithMatchRawType(C3.a aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    public static w newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter getSerializationDelegate() {
        return a();
    }

    @Override // com.google.gson.TypeAdapter
    public T read(D3.a aVar) {
        return (T) a().read(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(D3.c cVar, T t8) {
        a().write(cVar, t8);
    }

    public TreeTypeAdapter(q qVar, h hVar, Gson gson, C3.a aVar, w wVar) {
        this(qVar, hVar, gson, aVar, wVar, true);
    }
}
