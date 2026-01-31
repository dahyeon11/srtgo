package c4;

import F3.d;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1091a {

    /* renamed from: a, reason: collision with root package name */
    private final C1092b f11473a = C1092b.PDF417_GF;

    private int[] a(c cVar) throws d {
        int iD = cVar.d();
        int[] iArr = new int[iD];
        int i8 = 0;
        for (int i9 = 1; i9 < this.f11473a.e() && i8 < iD; i9++) {
            if (cVar.b(i9) == 0) {
                iArr[i8] = this.f11473a.g(i9);
                i8++;
            }
        }
        if (i8 == iD) {
            return iArr;
        }
        throw d.getChecksumInstance();
    }

    private int[] b(c cVar, c cVar2, int[] iArr) {
        int iD = cVar2.d();
        int[] iArr2 = new int[iD];
        for (int i8 = 1; i8 <= iD; i8++) {
            iArr2[iD - i8] = this.f11473a.i(i8, cVar2.c(i8));
        }
        c cVar3 = new c(this.f11473a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            int iG = this.f11473a.g(iArr[i9]);
            iArr3[i9] = this.f11473a.i(this.f11473a.j(0, cVar.b(iG)), this.f11473a.g(cVar3.b(iG)));
        }
        return iArr3;
    }

    private c[] c(c cVar, c cVar2, int i8) throws d {
        if (cVar.d() < cVar2.d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c cVarF = this.f11473a.f();
        c cVarD = this.f11473a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = cVarD;
            c cVar5 = cVarF;
            cVarF = cVar4;
            if (cVar.d() < i8 / 2) {
                int iC = cVarF.c(0);
                if (iC == 0) {
                    throw d.getChecksumInstance();
                }
                int iG = this.f11473a.g(iC);
                return new c[]{cVarF.f(iG), cVar.f(iG)};
            }
            if (cVar.e()) {
                throw d.getChecksumInstance();
            }
            c cVarF2 = this.f11473a.f();
            int iG2 = this.f11473a.g(cVar.c(cVar.d()));
            while (cVar2.d() >= cVar.d() && !cVar2.e()) {
                int iD = cVar2.d() - cVar.d();
                int i9 = this.f11473a.i(cVar2.c(cVar2.d()), iG2);
                cVarF2 = cVarF2.a(this.f11473a.b(iD, i9));
                cVar2 = cVar2.j(cVar.h(iD, i9));
            }
            cVarD = cVarF2.g(cVarF).j(cVar5).i();
        }
    }

    public int decode(int[] iArr, int i8, int[] iArr2) throws d {
        c cVar = new c(this.f11473a, iArr);
        int[] iArr3 = new int[i8];
        boolean z8 = false;
        for (int i9 = i8; i9 > 0; i9--) {
            int iB = cVar.b(this.f11473a.c(i9));
            iArr3[i8 - i9] = iB;
            if (iB != 0) {
                z8 = true;
            }
        }
        if (!z8) {
            return 0;
        }
        c cVarD = this.f11473a.d();
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                int iC = this.f11473a.c((iArr.length - 1) - i10);
                C1092b c1092b = this.f11473a;
                cVarD = cVarD.g(new c(c1092b, new int[]{c1092b.j(0, iC), 1}));
            }
        }
        c[] cVarArrC = c(this.f11473a.b(i8, 1), new c(this.f11473a, iArr3), i8);
        c cVar2 = cVarArrC[0];
        c cVar3 = cVarArrC[1];
        int[] iArrA = a(cVar2);
        int[] iArrB = b(cVar3, cVar2, iArrA);
        for (int i11 = 0; i11 < iArrA.length; i11++) {
            int length = (iArr.length - 1) - this.f11473a.h(iArrA[i11]);
            if (length < 0) {
                throw d.getChecksumInstance();
            }
            iArr[length] = this.f11473a.j(iArr[length], iArrB[i11]);
        }
        return iArrA.length;
    }
}
