package O3;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f3418a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f3419b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f3418a = aVar;
        int length = iArr.length;
        int i8 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f3419b = iArr;
            return;
        }
        while (i8 < length && iArr[i8] == 0) {
            i8++;
        }
        if (i8 == length) {
            this.f3419b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i8];
        this.f3419b = iArr2;
        System.arraycopy(iArr, i8, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f3418a.equals(bVar.f3418a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f3419b;
        int[] iArr2 = bVar.f3419b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i8 = length; i8 < iArr.length; i8++) {
            iArr3[i8] = a.a(iArr2[i8 - length], iArr[i8]);
        }
        return new b(this.f3418a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f3418a.equals(bVar.f3418a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarE = this.f3418a.e();
        int iF = this.f3418a.f(bVar.d(bVar.f()));
        b bVarA = this;
        while (bVarA.f() >= bVar.f() && !bVarA.g()) {
            int iF2 = bVarA.f() - bVar.f();
            int iH = this.f3418a.h(bVarA.d(bVarA.f()), iF);
            b bVarJ = bVar.j(iF2, iH);
            bVarE = bVarE.a(this.f3418a.b(iF2, iH));
            bVarA = bVarA.a(bVarJ);
        }
        return new b[]{bVarE, bVarA};
    }

    int c(int i8) {
        if (i8 == 0) {
            return d(0);
        }
        if (i8 == 1) {
            int iA = 0;
            for (int i9 : this.f3419b) {
                iA = a.a(iA, i9);
            }
            return iA;
        }
        int[] iArr = this.f3419b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iA2 = a.a(this.f3418a.h(i8, iA2), this.f3419b[i10]);
        }
        return iA2;
    }

    int d(int i8) {
        return this.f3419b[(r0.length - 1) - i8];
    }

    int[] e() {
        return this.f3419b;
    }

    int f() {
        return this.f3419b.length - 1;
    }

    boolean g() {
        return this.f3419b[0] == 0;
    }

    b h(int i8) {
        if (i8 == 0) {
            return this.f3418a.e();
        }
        if (i8 == 1) {
            return this;
        }
        int length = this.f3419b.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = this.f3418a.h(this.f3419b[i9], i8);
        }
        return new b(this.f3418a, iArr);
    }

    b i(b bVar) {
        if (!this.f3418a.equals(bVar.f3418a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || bVar.g()) {
            return this.f3418a.e();
        }
        int[] iArr = this.f3419b;
        int length = iArr.length;
        int[] iArr2 = bVar.f3419b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr[i8];
            for (int i10 = 0; i10 < length2; i10++) {
                int i11 = i8 + i10;
                iArr3[i11] = a.a(iArr3[i11], this.f3418a.h(i9, iArr2[i10]));
            }
        }
        return new b(this.f3418a, iArr3);
    }

    b j(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.f3418a.e();
        }
        int length = this.f3419b.length;
        int[] iArr = new int[i8 + length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f3418a.h(this.f3419b[i10], i9);
        }
        return new b(this.f3418a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(f() * 8);
        for (int iF = f(); iF >= 0; iF--) {
            int iD = d(iF);
            if (iD != 0) {
                if (iD < 0) {
                    sb.append(" - ");
                    iD = -iD;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iF == 0 || iD != 1) {
                    int iG = this.f3418a.g(iD);
                    if (iG == 0) {
                        sb.append('1');
                    } else if (iG == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iG);
                    }
                }
                if (iF != 0) {
                    if (iF == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iF);
                    }
                }
            }
        }
        return sb.toString();
    }
}
