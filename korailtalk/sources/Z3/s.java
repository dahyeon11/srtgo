package Z3;

import Q7.C;
import s7.x;

/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final M3.a f5740a;

    /* renamed from: b, reason: collision with root package name */
    private final m f5741b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f5742c = new StringBuilder();

    s(M3.a aVar) {
        this.f5740a = aVar;
    }

    private n b(int i8) {
        char c9;
        int iF = f(i8, 5);
        if (iF == 15) {
            return new n(i8 + 5, C.INNER_CLASS_SEPARATOR_CHAR);
        }
        if (iF >= 5 && iF < 15) {
            return new n(i8 + 5, (char) (iF + 43));
        }
        int iF2 = f(i8, 6);
        if (iF2 >= 32 && iF2 < 58) {
            return new n(i8 + 6, (char) (iF2 + 33));
        }
        switch (iF2) {
            case 58:
                c9 = '*';
                break;
            case 59:
                c9 = ',';
                break;
            case x.FROZEN_SHIFT /* 60 */:
                c9 = '-';
                break;
            case x.CLOSED_SHIFT /* 61 */:
                c9 = C.PACKAGE_SEPARATOR_CHAR;
                break;
            case 62:
                c9 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + iF2);
        }
        return new n(i8 + 6, c9);
    }

    private n d(int i8) throws F3.h {
        int iF = f(i8, 5);
        if (iF == 15) {
            return new n(i8 + 5, C.INNER_CLASS_SEPARATOR_CHAR);
        }
        char c9 = '+';
        if (iF >= 5 && iF < 15) {
            return new n(i8 + 5, (char) (iF + 43));
        }
        int iF2 = f(i8, 7);
        if (iF2 >= 64 && iF2 < 90) {
            return new n(i8 + 7, (char) (iF2 + 1));
        }
        if (iF2 >= 90 && iF2 < 116) {
            return new n(i8 + 7, (char) (iF2 + 7));
        }
        switch (f(i8, 8)) {
            case 232:
                c9 = '!';
                break;
            case 233:
                c9 = '\"';
                break;
            case 234:
                c9 = '%';
                break;
            case 235:
                c9 = '&';
                break;
            case 236:
                c9 = '\'';
                break;
            case 237:
                c9 = '(';
                break;
            case 238:
                c9 = ')';
                break;
            case 239:
                c9 = '*';
                break;
            case 240:
                break;
            case 241:
                c9 = ',';
                break;
            case 242:
                c9 = '-';
                break;
            case 243:
                c9 = C.PACKAGE_SEPARATOR_CHAR;
                break;
            case 244:
                c9 = '/';
                break;
            case 245:
                c9 = ':';
                break;
            case 246:
                c9 = ';';
                break;
            case 247:
                c9 = '<';
                break;
            case 248:
                c9 = '=';
                break;
            case 249:
                c9 = '>';
                break;
            case 250:
                c9 = '?';
                break;
            case 251:
                c9 = '_';
                break;
            case 252:
                c9 = ' ';
                break;
            default:
                throw F3.h.getFormatInstance();
        }
        return new n(i8 + 8, c9);
    }

    private p e(int i8) {
        int i9 = i8 + 7;
        if (i9 > this.f5740a.getSize()) {
            int iF = f(i8, 4);
            return iF == 0 ? new p(this.f5740a.getSize(), 10, 10) : new p(this.f5740a.getSize(), iF - 1, 10);
        }
        int iF2 = f(i8, 7) - 8;
        return new p(i9, iF2 / 11, iF2 % 11);
    }

    static int g(M3.a aVar, int i8, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (aVar.get(i8 + i11)) {
                i10 |= 1 << ((i9 - i11) - 1);
            }
        }
        return i10;
    }

    private boolean h(int i8) {
        int i9 = i8 + 3;
        if (i9 > this.f5740a.getSize()) {
            return false;
        }
        while (i8 < i9) {
            if (this.f5740a.get(i8)) {
                return false;
            }
            i8++;
        }
        return true;
    }

    private boolean i(int i8) {
        int i9;
        if (i8 + 1 > this.f5740a.getSize()) {
            return false;
        }
        for (int i10 = 0; i10 < 5 && (i9 = i10 + i8) < this.f5740a.getSize(); i10++) {
            if (i10 == 2) {
                if (!this.f5740a.get(i8 + 2)) {
                    return false;
                }
            } else if (this.f5740a.get(i9)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i8) {
        int i9;
        if (i8 + 1 > this.f5740a.getSize()) {
            return false;
        }
        for (int i10 = 0; i10 < 4 && (i9 = i10 + i8) < this.f5740a.getSize(); i10++) {
            if (this.f5740a.get(i9)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i8) {
        int iF;
        if (i8 + 5 > this.f5740a.getSize()) {
            return false;
        }
        int iF2 = f(i8, 5);
        if (iF2 < 5 || iF2 >= 16) {
            return i8 + 6 <= this.f5740a.getSize() && (iF = f(i8, 6)) >= 16 && iF < 63;
        }
        return true;
    }

    private boolean l(int i8) {
        int iF;
        if (i8 + 5 > this.f5740a.getSize()) {
            return false;
        }
        int iF2 = f(i8, 5);
        if (iF2 >= 5 && iF2 < 16) {
            return true;
        }
        if (i8 + 7 > this.f5740a.getSize()) {
            return false;
        }
        int iF3 = f(i8, 7);
        if (iF3 < 64 || iF3 >= 116) {
            return i8 + 8 <= this.f5740a.getSize() && (iF = f(i8, 8)) >= 232 && iF < 253;
        }
        return true;
    }

    private boolean m(int i8) {
        if (i8 + 7 > this.f5740a.getSize()) {
            return i8 + 4 <= this.f5740a.getSize();
        }
        int i9 = i8;
        while (true) {
            int i10 = i8 + 3;
            if (i9 >= i10) {
                return this.f5740a.get(i10);
            }
            if (this.f5740a.get(i9)) {
                return true;
            }
            i9++;
        }
    }

    private l n() {
        while (k(this.f5741b.a())) {
            n nVarB = b(this.f5741b.a());
            this.f5741b.h(nVarB.a());
            if (nVarB.c()) {
                return new l(new o(this.f5741b.a(), this.f5742c.toString()), true);
            }
            this.f5742c.append(nVarB.b());
        }
        if (h(this.f5741b.a())) {
            this.f5741b.b(3);
            this.f5741b.g();
        } else if (i(this.f5741b.a())) {
            if (this.f5741b.a() + 5 < this.f5740a.getSize()) {
                this.f5741b.b(5);
            } else {
                this.f5741b.h(this.f5740a.getSize());
            }
            this.f5741b.f();
        }
        return new l(false);
    }

    private o o() throws F3.h {
        l lVarQ;
        boolean zB;
        do {
            int iA = this.f5741b.a();
            if (this.f5741b.c()) {
                lVarQ = n();
                zB = lVarQ.b();
            } else if (this.f5741b.d()) {
                lVarQ = p();
                zB = lVarQ.b();
            } else {
                lVarQ = q();
                zB = lVarQ.b();
            }
            if (iA == this.f5741b.a() && !zB) {
                break;
            }
        } while (!zB);
        return lVarQ.a();
    }

    private l p() throws F3.h {
        while (l(this.f5741b.a())) {
            n nVarD = d(this.f5741b.a());
            this.f5741b.h(nVarD.a());
            if (nVarD.c()) {
                return new l(new o(this.f5741b.a(), this.f5742c.toString()), true);
            }
            this.f5742c.append(nVarD.b());
        }
        if (h(this.f5741b.a())) {
            this.f5741b.b(3);
            this.f5741b.g();
        } else if (i(this.f5741b.a())) {
            if (this.f5741b.a() + 5 < this.f5740a.getSize()) {
                this.f5741b.b(5);
            } else {
                this.f5741b.h(this.f5740a.getSize());
            }
            this.f5741b.e();
        }
        return new l(false);
    }

    private l q() {
        while (m(this.f5741b.a())) {
            p pVarE = e(this.f5741b.a());
            this.f5741b.h(pVarE.a());
            if (pVarE.d()) {
                return new l(pVarE.e() ? new o(this.f5741b.a(), this.f5742c.toString()) : new o(this.f5741b.a(), this.f5742c.toString(), pVarE.c()), true);
            }
            this.f5742c.append(pVarE.b());
            if (pVarE.e()) {
                return new l(new o(this.f5741b.a(), this.f5742c.toString()), true);
            }
            this.f5742c.append(pVarE.c());
        }
        if (j(this.f5741b.a())) {
            this.f5741b.e();
            this.f5741b.b(4);
        }
        return new l(false);
    }

    String a(StringBuilder sb, int i8) throws F3.h, F3.m {
        String str = null;
        while (true) {
            o oVarC = c(i8, str);
            String strA = r.a(oVarC.b());
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = oVarC.d() ? String.valueOf(oVarC.c()) : null;
            if (i8 == oVarC.a()) {
                return sb.toString();
            }
            i8 = oVarC.a();
            str = strValueOf;
        }
    }

    o c(int i8, String str) throws F3.h {
        this.f5742c.setLength(0);
        if (str != null) {
            this.f5742c.append(str);
        }
        this.f5741b.h(i8);
        o oVarO = o();
        return (oVarO == null || !oVarO.d()) ? new o(this.f5741b.a(), this.f5742c.toString()) : new o(this.f5741b.a(), this.f5742c.toString(), oVarO.c());
    }

    int f(int i8, int i9) {
        return g(this.f5740a, i8, i9);
    }
}
