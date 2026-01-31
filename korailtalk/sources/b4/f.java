package b4;

import a4.AbstractC0834a;
import java.util.Formatter;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final C1078a f11422a;

    /* renamed from: b, reason: collision with root package name */
    private final g[] f11423b;

    /* renamed from: c, reason: collision with root package name */
    private c f11424c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11425d;

    f(C1078a c1078a, c cVar) {
        this.f11422a = c1078a;
        int iA = c1078a.a();
        this.f11425d = iA;
        this.f11424c = cVar;
        this.f11423b = new g[iA + 2];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f11422a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i8, int i9, d dVar) {
        if (dVar == null || dVar.g()) {
            return i9;
        }
        if (!dVar.h(i8)) {
            return i9 + 1;
        }
        dVar.i(i8);
        return 0;
    }

    private int d() {
        int iF = f();
        if (iF == 0) {
            return 0;
        }
        for (int i8 = 1; i8 < this.f11425d + 1; i8++) {
            d[] dVarArrD = this.f11423b[i8].d();
            for (int i9 = 0; i9 < dVarArrD.length; i9++) {
                d dVar = dVarArrD[i9];
                if (dVar != null && !dVar.g()) {
                    e(i8, i9, dVarArrD);
                }
            }
        }
        return iF;
    }

    private void e(int i8, int i9, d[] dVarArr) {
        d dVar = dVarArr[i9];
        d[] dVarArrD = this.f11423b[i8 - 1].d();
        g gVar = this.f11423b[i8 + 1];
        d[] dVarArrD2 = gVar != null ? gVar.d() : dVarArrD;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = dVarArrD[i9];
        dVarArr2[3] = dVarArrD2[i9];
        if (i9 > 0) {
            int i10 = i9 - 1;
            dVarArr2[0] = dVarArr[i10];
            dVarArr2[4] = dVarArrD[i10];
            dVarArr2[5] = dVarArrD2[i10];
        }
        if (i9 > 1) {
            int i11 = i9 - 2;
            dVarArr2[8] = dVarArr[i11];
            dVarArr2[10] = dVarArrD[i11];
            dVarArr2[11] = dVarArrD2[i11];
        }
        if (i9 < dVarArr.length - 1) {
            int i12 = i9 + 1;
            dVarArr2[1] = dVarArr[i12];
            dVarArr2[6] = dVarArrD[i12];
            dVarArr2[7] = dVarArrD2[i12];
        }
        if (i9 < dVarArr.length - 2) {
            int i13 = i9 + 2;
            dVarArr2[9] = dVarArr[i13];
            dVarArr2[12] = dVarArrD[i13];
            dVarArr2[13] = dVarArrD2[i13];
        }
        for (int i14 = 0; i14 < 14 && !b(dVar, dVarArr2[i14]); i14++) {
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f11423b;
        g gVar = gVarArr[0];
        if (gVar == null || gVarArr[this.f11425d + 1] == null) {
            return;
        }
        d[] dVarArrD = gVar.d();
        d[] dVarArrD2 = this.f11423b[this.f11425d + 1].d();
        for (int i8 = 0; i8 < dVarArrD.length; i8++) {
            d dVar = dVarArrD[i8];
            if (dVar != null && dVarArrD2[i8] != null && dVar.c() == dVarArrD2[i8].c()) {
                for (int i9 = 1; i9 <= this.f11425d; i9++) {
                    d dVar2 = this.f11423b[i9].d()[i8];
                    if (dVar2 != null) {
                        dVar2.i(dVarArrD[i8].c());
                        if (!dVar2.g()) {
                            this.f11423b[i9].d()[i8] = null;
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g gVar = this.f11423b[0];
        if (gVar == null) {
            return 0;
        }
        d[] dVarArrD = gVar.d();
        int i8 = 0;
        for (int i9 = 0; i9 < dVarArrD.length; i9++) {
            d dVar = dVarArrD[i9];
            if (dVar != null) {
                int iC = dVar.c();
                int iC2 = 0;
                for (int i10 = 1; i10 < this.f11425d + 1 && iC2 < 2; i10++) {
                    d dVar2 = this.f11423b[i10].d()[i9];
                    if (dVar2 != null) {
                        iC2 = c(iC, iC2, dVar2);
                        if (!dVar2.g()) {
                            i8++;
                        }
                    }
                }
            }
        }
        return i8;
    }

    private int i() {
        g[] gVarArr = this.f11423b;
        int i8 = this.f11425d;
        if (gVarArr[i8 + 1] == null) {
            return 0;
        }
        d[] dVarArrD = gVarArr[i8 + 1].d();
        int i9 = 0;
        for (int i10 = 0; i10 < dVarArrD.length; i10++) {
            d dVar = dVarArrD[i10];
            if (dVar != null) {
                int iC = dVar.c();
                int iC2 = 0;
                for (int i11 = this.f11425d + 1; i11 > 0 && iC2 < 2; i11--) {
                    d dVar2 = this.f11423b[i11].d()[i10];
                    if (dVar2 != null) {
                        iC2 = c(iC, iC2, dVar2);
                        if (!dVar2.g()) {
                            i9++;
                        }
                    }
                }
            }
        }
        return i9;
    }

    int j() {
        return this.f11425d;
    }

    int k() {
        return this.f11422a.b();
    }

    int l() {
        return this.f11422a.c();
    }

    c m() {
        return this.f11424c;
    }

    g n(int i8) {
        return this.f11423b[i8];
    }

    g[] o() {
        a(this.f11423b[0]);
        a(this.f11423b[this.f11425d + 1]);
        int i8 = AbstractC0834a.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int iD = d();
            if (iD <= 0 || iD >= i8) {
                break;
            }
            i8 = iD;
        }
        return this.f11423b;
    }

    void p(int i8, g gVar) {
        this.f11423b[i8] = gVar;
    }

    public void setBoundingBox(c cVar) {
        this.f11424c = cVar;
    }

    public String toString() {
        g[] gVarArr = this.f11423b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f11425d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i8 = 0; i8 < gVar.d().length; i8++) {
            formatter.format("CW %3d:", Integer.valueOf(i8));
            for (int i9 = 0; i9 < this.f11425d + 2; i9++) {
                g gVar2 = this.f11423b[i9];
                if (gVar2 == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    d dVar = gVar2.d()[i8];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
