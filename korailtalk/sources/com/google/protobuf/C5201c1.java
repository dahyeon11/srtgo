package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.c1 */
/* loaded from: classes2.dex */
final class C5201c1 {

    /* renamed from: c */
    private static final C5201c1 f26399c = new C5201c1();

    /* renamed from: b */
    private final ConcurrentMap f26401b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC5222j1 f26400a = new C5272y0();

    private C5201c1() {
    }

    public static C5201c1 getInstance() {
        return f26399c;
    }

    public <T> void makeImmutable(T t8) {
        schemaFor((C5201c1) t8).makeImmutable(t8);
    }

    public <T> void mergeFrom(T t8, InterfaceC5210f1 interfaceC5210f1) {
        mergeFrom(t8, interfaceC5210f1, M.getEmptyRegistry());
    }

    public InterfaceC5219i1 registerSchema(Class<?> cls, InterfaceC5219i1 interfaceC5219i1) {
        AbstractC5227l0.b(cls, "messageType");
        AbstractC5227l0.b(interfaceC5219i1, "schema");
        return (InterfaceC5219i1) this.f26401b.putIfAbsent(cls, interfaceC5219i1);
    }

    public InterfaceC5219i1 registerSchemaOverride(Class<?> cls, InterfaceC5219i1 interfaceC5219i1) {
        AbstractC5227l0.b(cls, "messageType");
        AbstractC5227l0.b(interfaceC5219i1, "schema");
        return (InterfaceC5219i1) this.f26401b.put(cls, interfaceC5219i1);
    }

    public <T> InterfaceC5219i1 schemaFor(Class<T> cls) {
        AbstractC5227l0.b(cls, "messageType");
        InterfaceC5219i1 interfaceC5219i1 = (InterfaceC5219i1) this.f26401b.get(cls);
        if (interfaceC5219i1 != null) {
            return interfaceC5219i1;
        }
        InterfaceC5219i1 interfaceC5219i1CreateSchema = this.f26400a.createSchema(cls);
        InterfaceC5219i1 interfaceC5219i1RegisterSchema = registerSchema(cls, interfaceC5219i1CreateSchema);
        return interfaceC5219i1RegisterSchema != null ? interfaceC5219i1RegisterSchema : interfaceC5219i1CreateSchema;
    }

    public <T> void writeTo(T t8, R1 r12) {
        schemaFor((C5201c1) t8).writeTo(t8, r12);
    }

    public <T> void mergeFrom(T t8, InterfaceC5210f1 interfaceC5210f1, M m8) {
        schemaFor((C5201c1) t8).mergeFrom(t8, interfaceC5210f1, m8);
    }

    public <T> InterfaceC5219i1 schemaFor(T t8) {
        return schemaFor((Class) t8.getClass());
    }
}
