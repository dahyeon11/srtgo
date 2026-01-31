package b4;

import java.util.Formatter;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f11426a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f11427b;

    g(c cVar) {
        this.f11426a = new c(cVar);
        this.f11427b = new d[(cVar.f() - cVar.h()) + 1];
    }

    final c a() {
        return this.f11426a;
    }

    final d b(int i8) {
        return this.f11427b[e(i8)];
    }

    final d c(int i8) {
        d dVar;
        d dVar2;
        d dVarB = b(i8);
        if (dVarB != null) {
            return dVarB;
        }
        for (int i9 = 1; i9 < 5; i9++) {
            int iE = e(i8) - i9;
            if (iE >= 0 && (dVar2 = this.f11427b[iE]) != null) {
                return dVar2;
            }
            int iE2 = e(i8) + i9;
            d[] dVarArr = this.f11427b;
            if (iE2 < dVarArr.length && (dVar = dVarArr[iE2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    final d[] d() {
        return this.f11427b;
    }

    final int e(int i8) {
        return i8 - this.f11426a.h();
    }

    final void f(int i8, d dVar) {
        this.f11427b[e(i8)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i8 = 0;
        for (d dVar : this.f11427b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i8));
                i8++;
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i8), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                i8++;
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
