package Q3;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final O3.c f4029a = new O3.c(O3.a.DATA_MATRIX_FIELD_256);

    private void a(byte[] bArr, int i8) throws F3.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        try {
            this.f4029a.decode(iArr, bArr.length - i8);
            for (int i10 = 0; i10 < i8; i10++) {
                bArr[i10] = (byte) iArr[i10];
            }
        } catch (O3.e unused) {
            throw F3.d.getChecksumInstance();
        }
    }

    public M3.e decode(boolean[][] zArr) {
        int length = zArr.length;
        M3.b bVar = new M3.b(length);
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < length; i9++) {
                if (zArr[i8][i9]) {
                    bVar.set(i9, i8);
                }
            }
        }
        return decode(bVar);
    }

    public M3.e decode(M3.b bVar) throws F3.d {
        a aVar = new a(bVar);
        b[] bVarArrB = b.b(aVar.c(), aVar.b());
        int iC = 0;
        for (b bVar2 : bVarArrB) {
            iC += bVar2.c();
        }
        byte[] bArr = new byte[iC];
        int length = bVarArrB.length;
        for (int i8 = 0; i8 < length; i8++) {
            b bVar3 = bVarArrB[i8];
            byte[] bArrA = bVar3.a();
            int iC2 = bVar3.c();
            a(bArrA, iC2);
            for (int i9 = 0; i9 < iC2; i9++) {
                bArr[(i9 * length) + i8] = bArrA[i9];
            }
        }
        return c.a(bArr);
    }
}
