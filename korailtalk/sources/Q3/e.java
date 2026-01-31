package Q3;

import F3.h;
import ai.maum.m2u.cdk.utils.G711;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e[] f4030h = a();

    /* renamed from: a, reason: collision with root package name */
    private final int f4031a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4032b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4033c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4034d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4035e;

    /* renamed from: f, reason: collision with root package name */
    private final c f4036f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4037g;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f4038a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4039b;

        int a() {
            return this.f4038a;
        }

        int b() {
            return this.f4039b;
        }

        private b(int i8, int i9) {
            this.f4038a = i8;
            this.f4039b = i9;
        }
    }

    private e(int i8, int i9, int i10, int i11, int i12, c cVar) {
        this.f4031a = i8;
        this.f4032b = i9;
        this.f4033c = i10;
        this.f4034d = i11;
        this.f4035e = i12;
        this.f4036f = cVar;
        int iB = cVar.b();
        int iA = 0;
        for (b bVar : cVar.a()) {
            iA += bVar.a() * (bVar.b() + iB);
        }
        this.f4037g = iA;
    }

    private static e[] a() {
        int i8 = 1;
        int i9 = 5;
        e eVar = new e(1, 10, 10, 8, 8, new c(i9, new b(i8, 3)));
        e eVar2 = new e(2, 12, 12, 10, 10, new c(7, new b(i8, i9)));
        e eVar3 = new e(3, 14, 14, 12, 12, new c(10, new b(i8, 8)));
        int i10 = 12;
        e eVar4 = new e(4, 16, 16, 14, 14, new c(i10, new b(i8, i10)));
        int i11 = 18;
        e eVar5 = new e(5, 18, 18, 16, 16, new c(14, new b(i8, i11)));
        e eVar6 = new e(6, 20, 20, 18, 18, new c(i11, new b(i8, 22)));
        e eVar7 = new e(7, 22, 22, 20, 20, new c(20, new b(i8, 30)));
        int i12 = 36;
        e eVar8 = new e(8, 24, 24, 22, 22, new c(24, new b(i8, i12)));
        e eVar9 = new e(9, 26, 26, 24, 24, new c(28, new b(i8, 44)));
        e eVar10 = new e(10, 32, 32, 14, 14, new c(i12, new b(i8, 62)));
        int i13 = 42;
        int i14 = 56;
        int i15 = 2;
        int i16 = 4;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, new e(11, 36, 36, 16, 16, new c(i13, new b(i8, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(i8, 114))), new e(13, 44, 44, 20, 20, new c(i14, new b(i8, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(i8, 174))), new e(15, 52, 52, 24, 24, new c(i13, new b(i15, 102))), new e(16, 64, 64, 14, 14, new c(i14, new b(i15, 140))), new e(17, 72, 72, 16, 16, new c(36, new b(i16, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(i16, 114))), new e(19, 88, 88, 20, 20, new c(i14, new b(i16, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(i16, 174))), new e(21, 104, 104, 24, 24, new c(i14, new b(6, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new e(23, G711.BIAS, G711.BIAS, 20, 20, new c(62, new b(8, 163))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(i15, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e getVersionForDimensions(int i8, int i9) throws h {
        if ((i8 & 1) != 0 || (i9 & 1) != 0) {
            throw h.getFormatInstance();
        }
        for (e eVar : f4030h) {
            if (eVar.f4032b == i8 && eVar.f4033c == i9) {
                return eVar;
            }
        }
        throw h.getFormatInstance();
    }

    c b() {
        return this.f4036f;
    }

    public int getDataRegionSizeColumns() {
        return this.f4035e;
    }

    public int getDataRegionSizeRows() {
        return this.f4034d;
    }

    public int getSymbolSizeColumns() {
        return this.f4033c;
    }

    public int getSymbolSizeRows() {
        return this.f4032b;
    }

    public int getTotalCodewords() {
        return this.f4037g;
    }

    public int getVersionNumber() {
        return this.f4031a;
    }

    public String toString() {
        return String.valueOf(this.f4031a);
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f4040a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f4041b;

        b[] a() {
            return this.f4041b;
        }

        int b() {
            return this.f4040a;
        }

        private c(int i8, b bVar) {
            this.f4040a = i8;
            this.f4041b = new b[]{bVar};
        }

        private c(int i8, b bVar, b bVar2) {
            this.f4040a = i8;
            this.f4041b = new b[]{bVar, bVar2};
        }
    }
}
