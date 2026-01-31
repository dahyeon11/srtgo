package com.google.protobuf;

import com.google.protobuf.AbstractC5206e0;
import com.google.protobuf.AbstractC5217i;
import com.google.protobuf.C5242q0;
import com.google.protobuf.P1;
import com.google.protobuf.W;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class Q0 implements InterfaceC5219i1 {

    /* renamed from: a */
    private final K0 f26277a;

    /* renamed from: b */
    private final F1 f26278b;

    /* renamed from: c */
    private final boolean f26279c;

    /* renamed from: d */
    private final N f26280d;

    private Q0(F1 f12, N n8, K0 k02) {
        this.f26278b = f12;
        this.f26279c = n8.d(k02);
        this.f26280d = n8;
        this.f26277a = k02;
    }

    private int a(F1 f12, Object obj) {
        return f12.i(f12.g(obj));
    }

    private void b(F1 f12, N n8, Object obj, InterfaceC5210f1 interfaceC5210f1, M m8) {
        Object objF = f12.f(obj);
        W wC = n8.c(obj);
        do {
            try {
                if (interfaceC5210f1.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                f12.o(obj, objF);
            }
        } while (d(interfaceC5210f1, m8, n8, wC, f12, objF));
    }

    static Q0 c(F1 f12, N n8, K0 k02) {
        return new Q0(f12, n8, k02);
    }

    private boolean d(InterfaceC5210f1 interfaceC5210f1, M m8, N n8, W w8, F1 f12, Object obj) throws C5230m0 {
        int tag = interfaceC5210f1.getTag();
        if (tag != P1.f26264a) {
            if (P1.getTagWireType(tag) != 2) {
                return interfaceC5210f1.skipField();
            }
            Object objB = n8.b(m8, this.f26277a, P1.getTagFieldNumber(tag));
            if (objB == null) {
                return f12.m(obj, interfaceC5210f1);
            }
            n8.g(interfaceC5210f1, objB, m8, w8);
            return true;
        }
        Object objB2 = null;
        int uInt32 = 0;
        AbstractC5235o bytes = null;
        while (interfaceC5210f1.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = interfaceC5210f1.getTag();
            if (tag2 == P1.f26266c) {
                uInt32 = interfaceC5210f1.readUInt32();
                objB2 = n8.b(m8, this.f26277a, uInt32);
            } else if (tag2 == P1.f26267d) {
                if (objB2 != null) {
                    n8.g(interfaceC5210f1, objB2, m8, w8);
                } else {
                    bytes = interfaceC5210f1.readBytes();
                }
            } else if (!interfaceC5210f1.skipField()) {
                break;
            }
        }
        if (interfaceC5210f1.getTag() != P1.f26265b) {
            throw C5230m0.a();
        }
        if (bytes != null) {
            if (objB2 != null) {
                n8.h(bytes, objB2, m8, w8);
            } else {
                f12.d(obj, uInt32, bytes);
            }
        }
        return true;
    }

    private void e(F1 f12, Object obj, R1 r12) {
        f12.s(f12.g(obj), r12);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public boolean equals(Object obj, Object obj2) {
        if (!this.f26278b.g(obj).equals(this.f26278b.g(obj2))) {
            return false;
        }
        if (this.f26279c) {
            return this.f26280d.getExtensions(obj).equals(this.f26280d.getExtensions(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public int getSerializedSize(Object obj) {
        int iA = a(this.f26278b, obj);
        return this.f26279c ? iA + this.f26280d.getExtensions(obj).getMessageSetSerializedSize() : iA;
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public int hashCode(Object obj) {
        int iHashCode = this.f26278b.g(obj).hashCode();
        return this.f26279c ? (iHashCode * 53) + this.f26280d.getExtensions(obj).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public final boolean isInitialized(Object obj) {
        return this.f26280d.getExtensions(obj).isInitialized();
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void makeImmutable(Object obj) {
        this.f26278b.j(obj);
        this.f26280d.e(obj);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, Object obj2) {
        AbstractC5225k1.H(this.f26278b, obj, obj2);
        if (this.f26279c) {
            AbstractC5225k1.F(this.f26280d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public Object newInstance() {
        K0 k02 = this.f26277a;
        return k02 instanceof AbstractC5206e0 ? ((AbstractC5206e0) k02).t() : k02.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void writeTo(Object obj, R1 r12) {
        Iterator<Map.Entry<W.c, Object>> it = this.f26280d.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<W.c, Object> next = it.next();
            W.c key = next.getKey();
            if (key.getLiteJavaType() != P1.c.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C5242q0.b) {
                r12.writeMessageSetItem(key.getNumber(), ((C5242q0.b) next).getField().toByteString());
            } else {
                r12.writeMessageSetItem(key.getNumber(), next.getValue());
            }
        }
        e(this.f26278b, obj, r12);
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, byte[] bArr, int i8, int i9, AbstractC5217i.a aVar) throws C5230m0 {
        AbstractC5206e0 abstractC5206e0 = (AbstractC5206e0) obj;
        if (abstractC5206e0.f26409b == H1.getDefaultInstance()) {
            abstractC5206e0.f26409b = H1.g();
        }
        ((AbstractC5206e0.b) obj).v();
        if (i8 < i9) {
            AbstractC5217i.G(bArr, i8, aVar);
            throw null;
        }
        if (i8 != i9) {
            throw C5230m0.g();
        }
    }

    @Override // com.google.protobuf.InterfaceC5219i1
    public void mergeFrom(Object obj, InterfaceC5210f1 interfaceC5210f1, M m8) {
        b(this.f26278b, this.f26280d, obj, interfaceC5210f1, m8);
    }
}
