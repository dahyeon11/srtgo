package c4;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C1092b f11479a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f11480b;

    c(C1092b c1092b, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f11479a = c1092b;
        int length = iArr.length;
        int i8 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f11480b = iArr;
            return;
        }
        while (i8 < length && iArr[i8] == 0) {
            i8++;
        }
        if (i8 == length) {
            this.f11480b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i8];
        this.f11480b = iArr2;
        System.arraycopy(iArr, i8, iArr2, 0, iArr2.length);
    }

    c a(c cVar) {
        if (!this.f11479a.equals(cVar.f11479a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e()) {
            return cVar;
        }
        if (cVar.e()) {
            return this;
        }
        int[] iArr = this.f11480b;
        int[] iArr2 = cVar.f11480b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i8 = length; i8 < iArr.length; i8++) {
            iArr3[i8] = this.f11479a.a(iArr2[i8 - length], iArr[i8]);
        }
        return new c(this.f11479a, iArr3);
    }

    int b(int i8) {
        if (i8 == 0) {
            return c(0);
        }
        if (i8 == 1) {
            int iA = 0;
            for (int i9 : this.f11480b) {
                iA = this.f11479a.a(iA, i9);
            }
            return iA;
        }
        int[] iArr = this.f11480b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            C1092b c1092b = this.f11479a;
            iA2 = c1092b.a(c1092b.i(i8, iA2), this.f11480b[i10]);
        }
        return iA2;
    }

    int c(int i8) {
        return this.f11480b[(r0.length - 1) - i8];
    }

    int d() {
        return this.f11480b.length - 1;
    }

    boolean e() {
        return this.f11480b[0] == 0;
    }

    c f(int i8) {
        if (i8 == 0) {
            return this.f11479a.f();
        }
        if (i8 == 1) {
            return this;
        }
        int length = this.f11480b.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = this.f11479a.i(this.f11480b[i9], i8);
        }
        return new c(this.f11479a, iArr);
    }

    c g(c cVar) {
        if (!this.f11479a.equals(cVar.f11479a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e() || cVar.e()) {
            return this.f11479a.f();
        }
        int[] iArr = this.f11480b;
        int length = iArr.length;
        int[] iArr2 = cVar.f11480b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr[i8];
            for (int i10 = 0; i10 < length2; i10++) {
                int i11 = i8 + i10;
                C1092b c1092b = this.f11479a;
                iArr3[i11] = c1092b.a(iArr3[i11], c1092b.i(i9, iArr2[i10]));
            }
        }
        return new c(this.f11479a, iArr3);
    }

    c h(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.f11479a.f();
        }
        int length = this.f11480b.length;
        int[] iArr = new int[i8 + length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f11479a.i(this.f11480b[i10], i9);
        }
        return new c(this.f11479a, iArr);
    }

    c i() {
        int length = this.f11480b.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = this.f11479a.j(0, this.f11480b[i8]);
        }
        return new c(this.f11479a, iArr);
    }

    c j(c cVar) {
        if (this.f11479a.equals(cVar.f11479a)) {
            return cVar.e() ? this : a(cVar.i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb.append(" - ");
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    sb.append(iC);
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
