package g4;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5555a {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f31327a;

    /* renamed from: b, reason: collision with root package name */
    private j f31328b;

    /* renamed from: c, reason: collision with root package name */
    private g f31329c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31330d;

    C5555a(M3.b bVar) throws F3.h {
        int height = bVar.getHeight();
        if (height < 21 || (height & 3) != 1) {
            throw F3.h.getFormatInstance();
        }
        this.f31327a = bVar;
    }

    private int a(int i8, int i9, int i10) {
        return this.f31330d ? this.f31327a.get(i9, i8) : this.f31327a.get(i8, i9) ? (i10 << 1) | 1 : i10 << 1;
    }

    void b() {
        int i8 = 0;
        while (i8 < this.f31327a.getWidth()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < this.f31327a.getHeight(); i10++) {
                if (this.f31327a.get(i8, i10) != this.f31327a.get(i10, i8)) {
                    this.f31327a.flip(i10, i8);
                    this.f31327a.flip(i8, i10);
                }
            }
            i8 = i9;
        }
    }

    byte[] c() throws F3.h {
        g gVarD = d();
        j jVarE = e();
        c cVar = c.values()[gVarD.c()];
        int height = this.f31327a.getHeight();
        cVar.b(this.f31327a, height);
        M3.b bVarA = jVarE.a();
        byte[] bArr = new byte[jVarE.getTotalCodewords()];
        int i8 = height - 1;
        boolean z8 = true;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 > 0) {
            if (i9 == 6) {
                i9--;
            }
            for (int i13 = 0; i13 < height; i13++) {
                int i14 = z8 ? i8 - i13 : i13;
                for (int i15 = 0; i15 < 2; i15++) {
                    int i16 = i9 - i15;
                    if (!bVarA.get(i16, i14)) {
                        i11++;
                        i12 <<= 1;
                        if (this.f31327a.get(i16, i14)) {
                            i12 |= 1;
                        }
                        if (i11 == 8) {
                            bArr[i10] = (byte) i12;
                            i10++;
                            i11 = 0;
                            i12 = 0;
                        }
                    }
                }
            }
            z8 = !z8;
            i9 -= 2;
        }
        if (i10 == jVarE.getTotalCodewords()) {
            return bArr;
        }
        throw F3.h.getFormatInstance();
    }

    g d() throws F3.h {
        g gVar = this.f31329c;
        if (gVar != null) {
            return gVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i8 = 0; i8 < 6; i8++) {
            iA2 = a(i8, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i9 = 5; i9 >= 0; i9--) {
            iA3 = a(8, i9, iA3);
        }
        int height = this.f31327a.getHeight();
        int i10 = height - 7;
        for (int i11 = height - 1; i11 >= i10; i11--) {
            iA = a(8, i11, iA);
        }
        for (int i12 = height - 8; i12 < height; i12++) {
            iA = a(i12, 8, iA);
        }
        g gVarA = g.a(iA3, iA);
        this.f31329c = gVarA;
        if (gVarA != null) {
            return gVarA;
        }
        throw F3.h.getFormatInstance();
    }

    j e() throws F3.h {
        j jVar = this.f31328b;
        if (jVar != null) {
            return jVar;
        }
        int height = this.f31327a.getHeight();
        int i8 = (height - 17) / 4;
        if (i8 <= 6) {
            return j.getVersionForNumber(i8);
        }
        int i9 = height - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 5; i10 >= 0; i10--) {
            for (int i11 = height - 9; i11 >= i9; i11--) {
                iA2 = a(i11, i10, iA2);
            }
        }
        j jVarC = j.c(iA2);
        if (jVarC != null && jVarC.getDimensionForVersion() == height) {
            this.f31328b = jVarC;
            return jVarC;
        }
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = height - 9; i13 >= i9; i13--) {
                iA = a(i12, i13, iA);
            }
        }
        j jVarC2 = j.c(iA);
        if (jVarC2 == null || jVarC2.getDimensionForVersion() != height) {
            throw F3.h.getFormatInstance();
        }
        this.f31328b = jVarC2;
        return jVarC2;
    }

    void f() {
        if (this.f31329c == null) {
            return;
        }
        c.values()[this.f31329c.c()].b(this.f31327a, this.f31327a.getHeight());
    }

    void g(boolean z8) {
        this.f31328b = null;
        this.f31329c = null;
        this.f31330d = z8;
    }
}
