package g4;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final O3.c f31335a = new O3.c(O3.a.QR_CODE_FIELD_256);

    private void a(byte[] bArr, int i8) throws F3.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        try {
            this.f31335a.decode(iArr, bArr.length - i8);
            for (int i10 = 0; i10 < i8; i10++) {
                bArr[i10] = (byte) iArr[i10];
            }
        } catch (O3.e unused) {
            throw F3.d.getChecksumInstance();
        }
    }

    private M3.e b(C5555a c5555a, Map map) throws F3.d, F3.h {
        j jVarE = c5555a.e();
        f fVarD = c5555a.d().d();
        C5556b[] c5556bArrB = C5556b.b(c5555a.c(), jVarE, fVarD);
        int iC = 0;
        for (C5556b c5556b : c5556bArrB) {
            iC += c5556b.c();
        }
        byte[] bArr = new byte[iC];
        int i8 = 0;
        for (C5556b c5556b2 : c5556bArrB) {
            byte[] bArrA = c5556b2.a();
            int iC2 = c5556b2.c();
            a(bArrA, iC2);
            int i9 = 0;
            while (i9 < iC2) {
                bArr[i8] = bArrA[i9];
                i9++;
                i8++;
            }
        }
        return d.a(bArr, jVarE, fVarD, map);
    }

    public M3.e decode(boolean[][] zArr) {
        return decode(zArr, (Map<F3.e, ?>) null);
    }

    public M3.e decode(boolean[][] zArr, Map<F3.e, ?> map) {
        int length = zArr.length;
        M3.b bVar = new M3.b(length);
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < length; i9++) {
                if (zArr[i8][i9]) {
                    bVar.set(i9, i8);
                }
            }
        }
        return decode(bVar, map);
    }

    public M3.e decode(M3.b bVar) {
        return decode(bVar, (Map<F3.e, ?>) null);
    }

    public M3.e decode(M3.b bVar, Map<F3.e, ?> map) throws F3.d, F3.h {
        F3.d e8;
        C5555a c5555a = new C5555a(bVar);
        F3.h hVar = null;
        try {
            return b(c5555a, map);
        } catch (F3.d e9) {
            e8 = e9;
            try {
                c5555a.f();
                c5555a.g(true);
                c5555a.e();
                c5555a.d();
                c5555a.b();
                M3.e eVarB = b(c5555a, map);
                eVarB.setOther(new i(true));
                return eVarB;
            } catch (F3.d | F3.h e10) {
                if (hVar != null) {
                    throw hVar;
                }
                if (e8 != null) {
                    throw e8;
                }
                throw e10;
            }
        } catch (F3.h e11) {
            e8 = null;
            hVar = e11;
            c5555a.f();
            c5555a.g(true);
            c5555a.e();
            c5555a.d();
            c5555a.b();
            M3.e eVarB2 = b(c5555a, map);
            eVarB2.setOther(new i(true));
            return eVarB2;
        }
    }
}
