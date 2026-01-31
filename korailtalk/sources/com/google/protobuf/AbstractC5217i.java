package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5217i {

    /* renamed from: com.google.protobuf.i$a */
    static final class a {
    }

    static int A(byte[] bArr, int i8, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int B(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i9, aVar);
        throw null;
    }

    static int C(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i9, aVar);
        throw null;
    }

    static int D(byte[] bArr, int i8, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int E(int i8, byte[] bArr, int i9, int i10, H1 h12, a aVar) {
        if (P1.getTagFieldNumber(i8) == 0) {
            throw C5230m0.b();
        }
        int tagWireType = P1.getTagWireType(i8);
        if (tagWireType == 0) {
            J(bArr, i9, aVar);
            throw null;
        }
        if (tagWireType == 1) {
            h12.j(i8, Long.valueOf(h(bArr, i9)));
            return i9 + 8;
        }
        if (tagWireType == 2) {
            G(bArr, i9, aVar);
            throw null;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw C5230m0.b();
            }
            h12.j(i8, Integer.valueOf(f(bArr, i9)));
            return i9 + 4;
        }
        H1 h1G = H1.g();
        int i11 = (i8 & (-8)) | 4;
        if (i9 < i10) {
            G(bArr, i9, aVar);
            throw null;
        }
        if (i9 > i10 || i11 != 0) {
            throw C5230m0.g();
        }
        h12.j(i8, h1G);
        return i9;
    }

    static int F(int i8, byte[] bArr, int i9, a aVar) {
        int i10 = i9 + 1;
        if (bArr[i9] >= 0) {
            throw null;
        }
        int i11 = i9 + 2;
        if (bArr[i10] >= 0) {
            throw null;
        }
        int i12 = i9 + 3;
        if (bArr[i11] >= 0) {
            throw null;
        }
        int i13 = i9 + 4;
        if (bArr[i12] >= 0) {
            throw null;
        }
        while (true) {
            int i14 = i13 + 1;
            if (bArr[i13] >= 0) {
                throw null;
            }
            i13 = i14;
        }
    }

    static int G(byte[] bArr, int i8, a aVar) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        if (b9 < 0) {
            return F(b9, bArr, i9, aVar);
        }
        throw null;
    }

    static int H(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i9, aVar);
        throw null;
    }

    static int I(long j8, byte[] bArr, int i8, a aVar) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        while (b9 < 0) {
            b9 = bArr[i9];
            i9++;
        }
        throw null;
    }

    static int J(byte[] bArr, int i8, a aVar) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 < 0) {
            return I(j8, bArr, i9, aVar);
        }
        throw null;
    }

    static int K(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        J(bArr, i9, aVar);
        throw null;
    }

    static int L(Object obj, InterfaceC5219i1 interfaceC5219i1, byte[] bArr, int i8, int i9, int i10, a aVar) {
        ((P0) interfaceC5219i1).V(obj, bArr, i8, i9, i10, aVar);
        throw null;
    }

    static int M(Object obj, InterfaceC5219i1 interfaceC5219i1, byte[] bArr, int i8, int i9, a aVar) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            F(i11, bArr, i10, aVar);
            throw null;
        }
        if (i11 < 0 || i11 > i9 - i10) {
            throw C5230m0.k();
        }
        interfaceC5219i1.mergeFrom(obj, bArr, i10, i10 + i11, aVar);
        throw null;
    }

    static int a(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        J(bArr, i9, aVar);
        throw null;
    }

    static int b(byte[] bArr, int i8, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int c(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i9, aVar);
        throw null;
    }

    static double d(byte[] bArr, int i8) {
        return Double.longBitsToDouble(h(bArr, i8));
    }

    static int e(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        ((C5271y) iVar).addDouble(d(bArr, i9));
        int i11 = i9 + 8;
        if (i11 >= i10) {
            return i11;
        }
        G(bArr, i11, aVar);
        throw null;
    }

    static int f(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    static int g(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        ((C5224k0) iVar).addInt(f(bArr, i9));
        int i11 = i9 + 4;
        if (i11 >= i10) {
            return i11;
        }
        G(bArr, i11, aVar);
        throw null;
    }

    static long h(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    static int i(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        ((C5270x0) iVar).addLong(h(bArr, i9));
        int i11 = i9 + 8;
        if (i11 >= i10) {
            return i11;
        }
        G(bArr, i11, aVar);
        throw null;
    }

    static float j(byte[] bArr, int i8) {
        return Float.intBitsToFloat(f(bArr, i8));
    }

    static int k(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        ((Y) iVar).addFloat(j(bArr, i9));
        int i11 = i9 + 4;
        if (i11 >= i10) {
            return i11;
        }
        G(bArr, i11, aVar);
        throw null;
    }

    static int l(InterfaceC5219i1 interfaceC5219i1, byte[] bArr, int i8, int i9, int i10, a aVar) {
        Object objNewInstance = interfaceC5219i1.newInstance();
        L(objNewInstance, interfaceC5219i1, bArr, i8, i9, i10, aVar);
        interfaceC5219i1.makeImmutable(objNewInstance);
        throw null;
    }

    static int m(InterfaceC5219i1 interfaceC5219i1, int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        l(interfaceC5219i1, bArr, i9, i10, (i8 & (-8)) | 4, aVar);
        throw null;
    }

    static int n(InterfaceC5219i1 interfaceC5219i1, byte[] bArr, int i8, int i9, a aVar) {
        Object objNewInstance = interfaceC5219i1.newInstance();
        M(objNewInstance, interfaceC5219i1, bArr, i8, i9, aVar);
        interfaceC5219i1.makeImmutable(objNewInstance);
        throw null;
    }

    static int o(InterfaceC5219i1 interfaceC5219i1, int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        n(interfaceC5219i1, bArr, i9, i10, aVar);
        throw null;
    }

    static int p(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int q(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int r(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int s(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int t(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int u(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int v(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int w(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int x(byte[] bArr, int i8, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i8, aVar);
        throw null;
    }

    static int y(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        G(bArr, i9, aVar);
        throw null;
    }

    static int z(int i8, byte[] bArr, int i9, int i10, AbstractC5227l0.i iVar, a aVar) {
        J(bArr, i9, aVar);
        throw null;
    }
}
