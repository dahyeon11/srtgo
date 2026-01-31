package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z3.InterfaceC6620a;
import z3.InterfaceC6623d;
import z3.InterfaceC6624e;

/* loaded from: classes2.dex */
public final class Excluder implements w, Cloneable {
    public static final Excluder DEFAULT = new Excluder();

    /* renamed from: d */
    private boolean f25912d;

    /* renamed from: a */
    private double f25909a = -1.0d;

    /* renamed from: b */
    private int f25910b = 136;

    /* renamed from: c */
    private boolean f25911c = true;

    /* renamed from: e */
    private List f25913e = Collections.emptyList();

    /* renamed from: f */
    private List f25914f = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$1 */
    class AnonymousClass1 extends TypeAdapter {

        /* renamed from: a */
        private TypeAdapter f25915a;

        /* renamed from: b */
        final /* synthetic */ boolean f25916b;

        /* renamed from: c */
        final /* synthetic */ boolean f25917c;

        /* renamed from: d */
        final /* synthetic */ Gson f25918d;

        /* renamed from: e */
        final /* synthetic */ C3.a f25919e;

        AnonymousClass1(boolean z8, boolean z9, Gson gson, C3.a aVar) {
            z = z8;
            z = z9;
            gson = gson;
            aVar = aVar;
        }

        private TypeAdapter a() {
            TypeAdapter typeAdapter = this.f25915a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            TypeAdapter delegateAdapter = gson.getDelegateAdapter(Excluder.this, aVar);
            this.f25915a = delegateAdapter;
            return delegateAdapter;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.google.gson.TypeAdapter
        public T read(D3.a aVar) throws IOException {
            if (!z) {
                return a().read(aVar);
            }
            aVar.skipValue();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(D3.c cVar, T t8) throws IOException {
            if (z) {
                cVar.nullValue();
            } else {
                a().write(cVar, t8);
            }
        }
    }

    private boolean b(Class cls) {
        if (this.f25909a != -1.0d && !i((InterfaceC6623d) cls.getAnnotation(InterfaceC6623d.class), (InterfaceC6624e) cls.getAnnotation(InterfaceC6624e.class))) {
            return true;
        }
        if (this.f25911c || !e(cls)) {
            return d(cls);
        }
        return true;
    }

    private boolean c(Class cls, boolean z8) {
        Iterator it = (z8 ? this.f25913e : this.f25914f).iterator();
        while (it.hasNext()) {
            if (((com.google.gson.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean d(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || f(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean e(Class cls) {
        return cls.isMemberClass() && !f(cls);
    }

    private boolean f(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean g(InterfaceC6623d interfaceC6623d) {
        if (interfaceC6623d != null) {
            return this.f25909a >= interfaceC6623d.value();
        }
        return true;
    }

    private boolean h(InterfaceC6624e interfaceC6624e) {
        if (interfaceC6624e != null) {
            return this.f25909a < interfaceC6624e.value();
        }
        return true;
    }

    private boolean i(InterfaceC6623d interfaceC6623d, InterfaceC6624e interfaceC6624e) {
        return g(interfaceC6623d) && h(interfaceC6624e);
    }

    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, C3.a aVar) {
        Class<Object> rawType = aVar.getRawType();
        boolean zB = b(rawType);
        boolean z8 = zB || c(rawType, true);
        boolean z9 = zB || c(rawType, false);
        if (z8 || z9) {
            return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a */
                private TypeAdapter f25915a;

                /* renamed from: b */
                final /* synthetic */ boolean f25916b;

                /* renamed from: c */
                final /* synthetic */ boolean f25917c;

                /* renamed from: d */
                final /* synthetic */ Gson f25918d;

                /* renamed from: e */
                final /* synthetic */ C3.a f25919e;

                AnonymousClass1(boolean z92, boolean z82, Gson gson2, C3.a aVar2) {
                    z = z92;
                    z = z82;
                    gson = gson2;
                    aVar = aVar2;
                }

                private TypeAdapter a() {
                    TypeAdapter typeAdapter = this.f25915a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter delegateAdapter = gson.getDelegateAdapter(Excluder.this, aVar);
                    this.f25915a = delegateAdapter;
                    return delegateAdapter;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                @Override // com.google.gson.TypeAdapter
                public T read(D3.a aVar2) throws IOException {
                    if (!z) {
                        return a().read(aVar2);
                    }
                    aVar2.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(D3.c cVar, T t8) throws IOException {
                    if (z) {
                        cVar.nullValue();
                    } else {
                        a().write(cVar, t8);
                    }
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderClone = clone();
        excluderClone.f25911c = false;
        return excluderClone;
    }

    public boolean excludeClass(Class<?> cls, boolean z8) {
        return b(cls) || c(cls, z8);
    }

    public boolean excludeField(Field field, boolean z8) {
        InterfaceC6620a interfaceC6620a;
        if ((this.f25910b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f25909a != -1.0d && !i((InterfaceC6623d) field.getAnnotation(InterfaceC6623d.class), (InterfaceC6624e) field.getAnnotation(InterfaceC6624e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f25912d && ((interfaceC6620a = (InterfaceC6620a) field.getAnnotation(InterfaceC6620a.class)) == null || (!z8 ? interfaceC6620a.deserialize() : interfaceC6620a.serialize()))) {
            return true;
        }
        if ((!this.f25911c && e(field.getType())) || d(field.getType())) {
            return true;
        }
        List list = z8 ? this.f25913e : this.f25914f;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.google.gson.a) it.next()).shouldSkipField(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderClone = clone();
        excluderClone.f25912d = true;
        return excluderClone;
    }

    public Excluder withExclusionStrategy(com.google.gson.a aVar, boolean z8, boolean z9) {
        Excluder excluderClone = clone();
        if (z8) {
            ArrayList arrayList = new ArrayList(this.f25913e);
            excluderClone.f25913e = arrayList;
            arrayList.add(aVar);
        }
        if (z9) {
            ArrayList arrayList2 = new ArrayList(this.f25914f);
            excluderClone.f25914f = arrayList2;
            arrayList2.add(aVar);
        }
        return excluderClone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f25910b = 0;
        for (int i8 : iArr) {
            excluderClone.f25910b = i8 | excluderClone.f25910b;
        }
        return excluderClone;
    }

    public Excluder withVersion(double d9) {
        Excluder excluderClone = clone();
        excluderClone.f25909a = d9;
        return excluderClone;
    }
}
