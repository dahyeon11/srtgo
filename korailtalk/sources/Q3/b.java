package Q3;

import Q3.e;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f4020a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4021b;

    private b(int i8, byte[] bArr) {
        this.f4020a = i8;
        this.f4021b = bArr;
    }

    static b[] b(byte[] bArr, e eVar) {
        e.c cVarB = eVar.b();
        e.b[] bVarArrA = cVarB.a();
        int iA = 0;
        for (e.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i8 = 0;
        for (e.b bVar2 : bVarArrA) {
            int i9 = 0;
            while (i9 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i8] = new b(iB, new byte[cVarB.b() + iB]);
                i9++;
                i8++;
            }
        }
        int length = bVarArr[0].f4021b.length - cVarB.b();
        int i10 = length - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (i13 < i8) {
                bVarArr[i13].f4021b[i12] = bArr[i11];
                i13++;
                i11++;
            }
        }
        boolean z8 = eVar.getVersionNumber() == 24;
        int i14 = z8 ? 8 : i8;
        int i15 = 0;
        while (i15 < i14) {
            bVarArr[i15].f4021b[i10] = bArr[i11];
            i15++;
            i11++;
        }
        int length2 = bVarArr[0].f4021b.length;
        while (length < length2) {
            int i16 = 0;
            while (i16 < i8) {
                int i17 = z8 ? (i16 + 8) % i8 : i16;
                bVarArr[i17].f4021b[(!z8 || i17 <= 7) ? length : length - 1] = bArr[i11];
                i16++;
                i11++;
            }
            length++;
        }
        if (i11 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    byte[] a() {
        return this.f4021b;
    }

    int c() {
        return this.f4020a;
    }
}
