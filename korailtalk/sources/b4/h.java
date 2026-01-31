package b4;

import F3.s;

/* loaded from: classes2.dex */
final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11428c;

    h(c cVar, boolean z8) {
        super(cVar);
        this.f11428c = z8;
    }

    private void h(C1078a c1078a) {
        c cVarA = a();
        s sVarI = this.f11428c ? cVarA.i() : cVarA.j();
        s sVarC = this.f11428c ? cVarA.c() : cVarA.d();
        int iE = e((int) sVarC.getY());
        d[] dVarArrD = d();
        int iC = -1;
        int i8 = 0;
        int iMax = 1;
        for (int iE2 = e((int) sVarI.getY()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i8++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i8);
                        iC = dVar.c();
                    } else if (dVar.c() >= c1078a.c()) {
                        dVarArrD[iE2] = null;
                    } else {
                        iC = dVar.c();
                    }
                    i8 = 1;
                }
            }
        }
    }

    private void l(d[] dVarArr, C1078a c1078a) {
        for (int i8 = 0; i8 < dVarArr.length; i8++) {
            d dVar = dVarArr[i8];
            if (dVar != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > c1078a.c()) {
                    dVarArr[i8] = null;
                } else {
                    if (!this.f11428c) {
                        iC += 2;
                    }
                    int i9 = iC % 3;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2 && iE + 1 != c1078a.a()) {
                                dVarArr[i8] = null;
                            }
                        } else if (iE / 3 != c1078a.b() || iE % 3 != c1078a.d()) {
                            dVarArr[i8] = null;
                        }
                    } else if ((iE * 3) + 1 != c1078a.e()) {
                        dVarArr[i8] = null;
                    }
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    void g(C1078a c1078a) {
        d[] dVarArrD = d();
        m();
        l(dVarArrD, c1078a);
        c cVarA = a();
        s sVarI = this.f11428c ? cVarA.i() : cVarA.j();
        s sVarC = this.f11428c ? cVarA.c() : cVarA.d();
        int iE = e((int) sVarI.getY());
        int iE2 = e((int) sVarC.getY());
        int iC = -1;
        int i8 = 0;
        int iMax = 1;
        while (iE < iE2) {
            d dVar = dVarArrD[iE];
            if (dVar != null) {
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i8++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i8);
                        iC = dVar.c();
                    } else if (iC2 < 0 || dVar.c() >= c1078a.c() || iC2 > iE) {
                        dVarArrD[iE] = null;
                    } else {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        boolean z8 = iC2 >= iE;
                        for (int i9 = 1; i9 <= iC2 && !z8; i9++) {
                            z8 = dVarArrD[iE - i9] != null;
                        }
                        if (z8) {
                            dVarArrD[iE] = null;
                        } else {
                            iC = dVar.c();
                        }
                    }
                    i8 = 1;
                }
            }
            iE++;
        }
    }

    C1078a i() {
        d[] dVarArrD = d();
        C1079b c1079b = new C1079b();
        C1079b c1079b2 = new C1079b();
        C1079b c1079b3 = new C1079b();
        C1079b c1079b4 = new C1079b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.f11428c) {
                    iC += 2;
                }
                int i8 = iC % 3;
                if (i8 == 0) {
                    c1079b2.b((iE * 3) + 1);
                } else if (i8 == 1) {
                    c1079b4.b(iE / 3);
                    c1079b3.b(iE % 3);
                } else if (i8 == 2) {
                    c1079b.b(iE + 1);
                }
            }
        }
        if (c1079b.a().length == 0 || c1079b2.a().length == 0 || c1079b3.a().length == 0 || c1079b4.a().length == 0 || c1079b.a()[0] <= 0 || c1079b2.a()[0] + c1079b3.a()[0] < 3 || c1079b2.a()[0] + c1079b3.a()[0] > 90) {
            return null;
        }
        C1078a c1078a = new C1078a(c1079b.a()[0], c1079b2.a()[0], c1079b3.a()[0], c1079b4.a()[0]);
        l(dVarArrD, c1078a);
        return c1078a;
    }

    int[] j() {
        int iC;
        C1078a c1078aI = i();
        if (c1078aI == null) {
            return null;
        }
        h(c1078aI);
        int iC2 = c1078aI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    boolean k() {
        return this.f11428c;
    }

    @Override // b4.g
    public String toString() {
        return "IsLeft: " + this.f11428c + '\n' + super.toString();
    }
}
