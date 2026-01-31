package I3;

import F3.m;
import F3.s;
import M3.b;
import M3.i;
import O3.c;
import O3.e;
import com.j256.ormlite.stmt.query.SimpleComparison;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f2045g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    private final b f2046a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2047b;

    /* renamed from: c, reason: collision with root package name */
    private int f2048c;

    /* renamed from: d, reason: collision with root package name */
    private int f2049d;

    /* renamed from: e, reason: collision with root package name */
    private int f2050e;

    /* renamed from: f, reason: collision with root package name */
    private int f2051f;

    /* renamed from: I3.a$a, reason: collision with other inner class name */
    static final class C0038a {

        /* renamed from: a, reason: collision with root package name */
        private final int f2052a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2053b;

        C0038a(int i8, int i9) {
            this.f2052a = i8;
            this.f2053b = i9;
        }

        int a() {
            return this.f2052a;
        }

        int b() {
            return this.f2053b;
        }

        s c() {
            return new s(a(), b());
        }

        public String toString() {
            return SimpleComparison.LESS_THAN_OPERATION + this.f2052a + ' ' + this.f2053b + '>';
        }
    }

    public a(b bVar) {
        this.f2046a = bVar;
    }

    private static float a(s sVar, s sVar2) {
        return N3.a.distance(sVar.getX(), sVar.getY(), sVar2.getX(), sVar2.getY());
    }

    private static float b(C0038a c0038a, C0038a c0038a2) {
        return N3.a.distance(c0038a.a(), c0038a.b(), c0038a2.a(), c0038a2.b());
    }

    private static s[] c(s[] sVarArr, float f8, float f9) {
        float f10 = f9 / (f8 * 2.0f);
        float x8 = sVarArr[0].getX() - sVarArr[2].getX();
        float y8 = sVarArr[0].getY() - sVarArr[2].getY();
        float x9 = (sVarArr[0].getX() + sVarArr[2].getX()) / 2.0f;
        float y9 = (sVarArr[0].getY() + sVarArr[2].getY()) / 2.0f;
        float f11 = x8 * f10;
        float f12 = y8 * f10;
        s sVar = new s(x9 + f11, y9 + f12);
        s sVar2 = new s(x9 - f11, y9 - f12);
        float x10 = sVarArr[1].getX() - sVarArr[3].getX();
        float y10 = sVarArr[1].getY() - sVarArr[3].getY();
        float x11 = (sVarArr[1].getX() + sVarArr[3].getX()) / 2.0f;
        float y11 = (sVarArr[1].getY() + sVarArr[3].getY()) / 2.0f;
        float f13 = x10 * f10;
        float f14 = f10 * y10;
        return new s[]{sVar, new s(x11 + f13, y11 + f14), sVar2, new s(x11 - f13, y11 - f14)};
    }

    private void d(s[] sVarArr) throws m {
        long j8;
        long j9;
        if (!n(sVarArr[0]) || !n(sVarArr[1]) || !n(sVarArr[2]) || !n(sVarArr[3])) {
            throw m.getNotFoundInstance();
        }
        int i8 = this.f2050e * 2;
        int[] iArr = {q(sVarArr[0], sVarArr[1], i8), q(sVarArr[1], sVarArr[2], i8), q(sVarArr[2], sVarArr[3], i8), q(sVarArr[3], sVarArr[0], i8)};
        this.f2051f = l(iArr, i8);
        long j10 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr[(this.f2051f + i9) % 4];
            if (this.f2047b) {
                j8 = j10 << 7;
                j9 = (i10 >> 1) & 127;
            } else {
                j8 = j10 << 10;
                j9 = ((i10 >> 2) & 992) + ((i10 >> 1) & 31);
            }
            j10 = j8 + j9;
        }
        int iG = g(j10, this.f2047b);
        if (this.f2047b) {
            this.f2048c = (iG >> 6) + 1;
            this.f2049d = (iG & 63) + 1;
        } else {
            this.f2048c = (iG >> 11) + 1;
            this.f2049d = (iG & 2047) + 1;
        }
    }

    private s[] e(C0038a c0038a) throws m {
        this.f2050e = 1;
        C0038a c0038a2 = c0038a;
        C0038a c0038a3 = c0038a2;
        C0038a c0038a4 = c0038a3;
        boolean z8 = true;
        while (this.f2050e < 9) {
            C0038a c0038aI = i(c0038a, z8, 1, -1);
            C0038a c0038aI2 = i(c0038a2, z8, 1, 1);
            C0038a c0038aI3 = i(c0038a3, z8, -1, 1);
            C0038a c0038aI4 = i(c0038a4, z8, -1, -1);
            if (this.f2050e > 2) {
                double dB = (b(c0038aI4, c0038aI) * this.f2050e) / (b(c0038a4, c0038a) * (this.f2050e + 2));
                if (dB < 0.75d || dB > 1.25d || !o(c0038aI, c0038aI2, c0038aI3, c0038aI4)) {
                    break;
                }
            }
            z8 = !z8;
            this.f2050e++;
            c0038a4 = c0038aI4;
            c0038a = c0038aI;
            c0038a2 = c0038aI2;
            c0038a3 = c0038aI3;
        }
        int i8 = this.f2050e;
        if (i8 != 5 && i8 != 7) {
            throw m.getNotFoundInstance();
        }
        this.f2047b = i8 == 5;
        s[] sVarArr = {new s(c0038a.a() + 0.5f, c0038a.b() - 0.5f), new s(c0038a2.a() + 0.5f, c0038a2.b() + 0.5f), new s(c0038a3.a() - 0.5f, c0038a3.b() + 0.5f), new s(c0038a4.a() - 0.5f, c0038a4.b() - 0.5f)};
        int i9 = this.f2050e;
        return c(sVarArr, (i9 * 2) - 3, i9 * 2);
    }

    private int f(C0038a c0038a, C0038a c0038a2) {
        float fB = b(c0038a, c0038a2);
        float fA = (c0038a2.a() - c0038a.a()) / fB;
        float fB2 = (c0038a2.b() - c0038a.b()) / fB;
        float fA2 = c0038a.a();
        float fB3 = c0038a.b();
        boolean z8 = this.f2046a.get(c0038a.a(), c0038a.b());
        int iCeil = (int) Math.ceil(fB);
        int i8 = 0;
        for (int i9 = 0; i9 < iCeil; i9++) {
            fA2 += fA;
            fB3 += fB2;
            if (this.f2046a.get(N3.a.round(fA2), N3.a.round(fB3)) != z8) {
                i8++;
            }
        }
        float f8 = i8 / fB;
        if (f8 <= 0.1f || f8 >= 0.9f) {
            return (f8 <= 0.1f) == z8 ? 1 : -1;
        }
        return 0;
    }

    private static int g(long j8, boolean z8) throws m {
        int i8;
        int i9;
        if (z8) {
            i8 = 7;
            i9 = 2;
        } else {
            i8 = 10;
            i9 = 4;
        }
        int i10 = i8 - i9;
        int[] iArr = new int[i8];
        for (int i11 = i8 - 1; i11 >= 0; i11--) {
            iArr[i11] = ((int) j8) & 15;
            j8 >>= 4;
        }
        try {
            new c(O3.a.AZTEC_PARAM).decode(iArr, i10);
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                i12 = (i12 << 4) + iArr[i13];
            }
            return i12;
        } catch (e unused) {
            throw m.getNotFoundInstance();
        }
    }

    private int h() {
        if (this.f2047b) {
            return (this.f2048c * 4) + 11;
        }
        int i8 = this.f2048c;
        return i8 <= 4 ? (i8 * 4) + 15 : (i8 * 4) + ((((i8 - 4) / 8) + 1) * 2) + 15;
    }

    private C0038a i(C0038a c0038a, boolean z8, int i8, int i9) {
        int iA = c0038a.a() + i8;
        int iB = c0038a.b();
        while (true) {
            iB += i9;
            if (!m(iA, iB) || this.f2046a.get(iA, iB) != z8) {
                break;
            }
            iA += i8;
        }
        int i10 = iA - i8;
        int i11 = iB - i9;
        while (m(i10, i11) && this.f2046a.get(i10, i11) == z8) {
            i10 += i8;
        }
        int i12 = i10 - i8;
        while (m(i12, i11) && this.f2046a.get(i12, i11) == z8) {
            i11 += i9;
        }
        return new C0038a(i12, i11 - i9);
    }

    private C0038a j() {
        s sVarC;
        s sVar;
        s sVar2;
        s sVar3;
        s sVarC2;
        s sVarC3;
        s sVarC4;
        s sVarC5;
        try {
            s[] sVarArrDetect = new N3.b(this.f2046a).detect();
            sVar2 = sVarArrDetect[0];
            sVar3 = sVarArrDetect[1];
            sVar = sVarArrDetect[2];
            sVarC = sVarArrDetect[3];
        } catch (m unused) {
            int width = this.f2046a.getWidth() / 2;
            int height = this.f2046a.getHeight() / 2;
            int i8 = width + 7;
            int i9 = height - 7;
            s sVarC6 = i(new C0038a(i8, i9), false, 1, -1).c();
            int i10 = height + 7;
            s sVarC7 = i(new C0038a(i8, i10), false, 1, 1).c();
            int i11 = width - 7;
            s sVarC8 = i(new C0038a(i11, i10), false, -1, 1).c();
            sVarC = i(new C0038a(i11, i9), false, -1, -1).c();
            sVar = sVarC8;
            sVar2 = sVarC6;
            sVar3 = sVarC7;
        }
        int iRound = N3.a.round((((sVar2.getX() + sVarC.getX()) + sVar3.getX()) + sVar.getX()) / 4.0f);
        int iRound2 = N3.a.round((((sVar2.getY() + sVarC.getY()) + sVar3.getY()) + sVar.getY()) / 4.0f);
        try {
            s[] sVarArrDetect2 = new N3.b(this.f2046a, 15, iRound, iRound2).detect();
            sVarC2 = sVarArrDetect2[0];
            sVarC3 = sVarArrDetect2[1];
            sVarC4 = sVarArrDetect2[2];
            sVarC5 = sVarArrDetect2[3];
        } catch (m unused2) {
            int i12 = iRound + 7;
            int i13 = iRound2 - 7;
            sVarC2 = i(new C0038a(i12, i13), false, 1, -1).c();
            int i14 = iRound2 + 7;
            sVarC3 = i(new C0038a(i12, i14), false, 1, 1).c();
            int i15 = iRound - 7;
            sVarC4 = i(new C0038a(i15, i14), false, -1, 1).c();
            sVarC5 = i(new C0038a(i15, i13), false, -1, -1).c();
        }
        return new C0038a(N3.a.round((((sVarC2.getX() + sVarC5.getX()) + sVarC3.getX()) + sVarC4.getX()) / 4.0f), N3.a.round((((sVarC2.getY() + sVarC5.getY()) + sVarC3.getY()) + sVarC4.getY()) / 4.0f));
    }

    private s[] k(s[] sVarArr) {
        return c(sVarArr, this.f2050e * 2, h());
    }

    private static int l(int[] iArr, int i8) throws m {
        int i9 = 0;
        for (int i10 : iArr) {
            i9 = (i9 << 3) + ((i10 >> (i8 - 2)) << 1) + (i10 & 1);
        }
        int i11 = ((i9 & 1) << 11) + (i9 >> 1);
        for (int i12 = 0; i12 < 4; i12++) {
            if (Integer.bitCount(f2045g[i12] ^ i11) <= 2) {
                return i12;
            }
        }
        throw m.getNotFoundInstance();
    }

    private boolean m(int i8, int i9) {
        return i8 >= 0 && i8 < this.f2046a.getWidth() && i9 > 0 && i9 < this.f2046a.getHeight();
    }

    private boolean n(s sVar) {
        return m(N3.a.round(sVar.getX()), N3.a.round(sVar.getY()));
    }

    private boolean o(C0038a c0038a, C0038a c0038a2, C0038a c0038a3, C0038a c0038a4) {
        C0038a c0038a5 = new C0038a(c0038a.a() - 3, c0038a.b() + 3);
        C0038a c0038a6 = new C0038a(c0038a2.a() - 3, c0038a2.b() - 3);
        C0038a c0038a7 = new C0038a(c0038a3.a() + 3, c0038a3.b() - 3);
        C0038a c0038a8 = new C0038a(c0038a4.a() + 3, c0038a4.b() + 3);
        int iF = f(c0038a8, c0038a5);
        return iF != 0 && f(c0038a5, c0038a6) == iF && f(c0038a6, c0038a7) == iF && f(c0038a7, c0038a8) == iF;
    }

    private b p(b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        i iVar = i.getInstance();
        int iH = h();
        float f8 = iH / 2.0f;
        int i8 = this.f2050e;
        float f9 = f8 - i8;
        float f10 = f8 + i8;
        return iVar.sampleGrid(bVar, iH, iH, f9, f9, f10, f9, f10, f10, f9, f10, sVar.getX(), sVar.getY(), sVar2.getX(), sVar2.getY(), sVar3.getX(), sVar3.getY(), sVar4.getX(), sVar4.getY());
    }

    private int q(s sVar, s sVar2, int i8) {
        float fA = a(sVar, sVar2);
        float f8 = fA / i8;
        float x8 = sVar.getX();
        float y8 = sVar.getY();
        float x9 = ((sVar2.getX() - sVar.getX()) * f8) / fA;
        float y9 = (f8 * (sVar2.getY() - sVar.getY())) / fA;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            float f9 = i10;
            if (this.f2046a.get(N3.a.round((f9 * x9) + x8), N3.a.round((f9 * y9) + y8))) {
                i9 |= 1 << ((i8 - i10) - 1);
            }
        }
        return i9;
    }

    public G3.a detect() {
        return detect(false);
    }

    public G3.a detect(boolean z8) throws m {
        s[] sVarArrE = e(j());
        if (z8) {
            s sVar = sVarArrE[0];
            sVarArrE[0] = sVarArrE[2];
            sVarArrE[2] = sVar;
        }
        d(sVarArrE);
        b bVar = this.f2046a;
        int i8 = this.f2051f;
        return new G3.a(p(bVar, sVarArrE[i8 % 4], sVarArrE[(i8 + 1) % 4], sVarArrE[(i8 + 2) % 4], sVarArrE[(i8 + 3) % 4]), k(sVarArrE), this.f2047b, this.f2049d, this.f2048c);
    }
}
