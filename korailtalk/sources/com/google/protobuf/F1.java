package com.google.protobuf;

/* loaded from: classes2.dex */
abstract class F1 {
    F1() {
    }

    abstract void a(Object obj, int i8, int i9);

    abstract void b(Object obj, int i8, long j8);

    abstract void c(Object obj, int i8, Object obj2);

    abstract void d(Object obj, int i8, AbstractC5235o abstractC5235o);

    abstract void e(Object obj, int i8, long j8);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final void l(Object obj, InterfaceC5210f1 interfaceC5210f1) {
        while (interfaceC5210f1.getFieldNumber() != Integer.MAX_VALUE && m(obj, interfaceC5210f1)) {
        }
    }

    final boolean m(Object obj, InterfaceC5210f1 interfaceC5210f1) throws C5230m0 {
        int tag = interfaceC5210f1.getTag();
        int tagFieldNumber = P1.getTagFieldNumber(tag);
        int tagWireType = P1.getTagWireType(tag);
        if (tagWireType == 0) {
            e(obj, tagFieldNumber, interfaceC5210f1.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            b(obj, tagFieldNumber, interfaceC5210f1.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            d(obj, tagFieldNumber, interfaceC5210f1.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw C5230m0.d();
            }
            a(obj, tagFieldNumber, interfaceC5210f1.readFixed32());
            return true;
        }
        Object objN = n();
        int iA = P1.a(tagFieldNumber, 4);
        l(objN, interfaceC5210f1);
        if (iA != interfaceC5210f1.getTag()) {
            throw C5230m0.a();
        }
        c(obj, tagFieldNumber, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(InterfaceC5210f1 interfaceC5210f1);

    abstract Object r(Object obj);

    abstract void s(Object obj, R1 r12);

    abstract void t(Object obj, R1 r12);
}
