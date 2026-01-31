package O3;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f3420a;

    public c(a aVar) {
        this.f3420a = aVar;
    }

    private int[] a(b bVar) throws e {
        int iF = bVar.f();
        if (iF == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[iF];
        int i8 = 0;
        for (int i9 = 1; i9 < this.f3420a.getSize() && i8 < iF; i9++) {
            if (bVar.c(i9) == 0) {
                iArr[i8] = this.f3420a.f(i9);
                i8++;
            }
        }
        if (i8 == iF) {
            return iArr;
        }
        throw new e("Error locator degree does not match number of roots");
    }

    private int[] b(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            int iF = this.f3420a.f(iArr[i8]);
            int iH = 1;
            for (int i9 = 0; i9 < length; i9++) {
                if (i8 != i9) {
                    int iH2 = this.f3420a.h(iArr[i9], iF);
                    iH = this.f3420a.h(iH, (iH2 & 1) == 0 ? iH2 | 1 : iH2 & (-2));
                }
            }
            iArr2[i8] = this.f3420a.h(bVar.c(iF), this.f3420a.f(iH));
            if (this.f3420a.getGeneratorBase() != 0) {
                iArr2[i8] = this.f3420a.h(iArr2[i8], iF);
            }
        }
        return iArr2;
    }

    private b[] c(b bVar, b bVar2, int i8) throws e {
        if (bVar.f() < bVar2.f()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b bVarE = this.f3420a.e();
        b bVarD = this.f3420a.d();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = bVarD;
            b bVar5 = bVarE;
            bVarE = bVar4;
            if (bVar.f() < i8 / 2) {
                int iD = bVarE.d(0);
                if (iD == 0) {
                    throw new e("sigmaTilde(0) was zero");
                }
                int iF = this.f3420a.f(iD);
                return new b[]{bVarE.h(iF), bVar.h(iF)};
            }
            if (bVar.g()) {
                throw new e("r_{i-1} was zero");
            }
            b bVarE2 = this.f3420a.e();
            int iF2 = this.f3420a.f(bVar.d(bVar.f()));
            while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                int iF3 = bVar2.f() - bVar.f();
                int iH = this.f3420a.h(bVar2.d(bVar2.f()), iF2);
                bVarE2 = bVarE2.a(this.f3420a.b(iF3, iH));
                bVar2 = bVar2.a(bVar.j(iF3, iH));
            }
            bVarD = bVarE2.i(bVarE).a(bVar5);
        } while (bVar2.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void decode(int[] iArr, int i8) throws e {
        b bVar = new b(this.f3420a, iArr);
        int[] iArr2 = new int[i8];
        boolean z8 = true;
        for (int i9 = 0; i9 < i8; i9++) {
            a aVar = this.f3420a;
            int iC = bVar.c(aVar.c(aVar.getGeneratorBase() + i9));
            iArr2[(i8 - 1) - i9] = iC;
            if (iC != 0) {
                z8 = false;
            }
        }
        if (z8) {
            return;
        }
        b[] bVarArrC = c(this.f3420a.b(i8, 1), new b(this.f3420a, iArr2), i8);
        b bVar2 = bVarArrC[0];
        b bVar3 = bVarArrC[1];
        int[] iArrA = a(bVar2);
        int[] iArrB = b(bVar3, iArrA);
        for (int i10 = 0; i10 < iArrA.length; i10++) {
            int length = (iArr.length - 1) - this.f3420a.g(iArrA[i10]);
            if (length < 0) {
                throw new e("Bad error location");
            }
            iArr[length] = a.a(iArr[length], iArrB[i10]);
        }
    }
}
