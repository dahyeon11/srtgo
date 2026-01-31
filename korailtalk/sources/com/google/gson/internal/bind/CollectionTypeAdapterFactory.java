package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.i;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements w {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f25930a;

    private static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f25931a;

        /* renamed from: b, reason: collision with root package name */
        private final i f25932b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, i iVar) {
            this.f25931a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f25932b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public Collection<E> read(D3.a aVar) throws IOException {
            if (aVar.peek() == D3.b.NULL) {
                aVar.nextNull();
                return null;
            }
            O.b bVar = (Collection<E>) ((Collection) this.f25932b.construct());
            aVar.beginArray();
            while (aVar.hasNext()) {
                bVar.add(this.f25931a.read(aVar));
            }
            aVar.endArray();
            return bVar;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.nullValue();
                return;
            }
            cVar.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f25931a.write(cVar, it.next());
            }
            cVar.endArray();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.c cVar) {
        this.f25930a = cVar;
    }

    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, C3.a aVar) {
        Type type = aVar.getType();
        Class<Object> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = com.google.gson.internal.b.getCollectionElementType(type, rawType);
        return new Adapter(gson, collectionElementType, gson.getAdapter(C3.a.get(collectionElementType)), this.f25930a.get(aVar));
    }
}
