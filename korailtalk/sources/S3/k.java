package S3;

import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: g, reason: collision with root package name */
    static final k[] f4623g;

    /* renamed from: h, reason: collision with root package name */
    private static k[] f4624h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4625a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4626b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4627c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4628d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4629e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4630f;
    public final int matrixHeight;
    public final int matrixWidth;

    static {
        k[] kVarArr = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, Map.MapException.StatusCode.MAP_TOTAL_SESSION_COUNT_EXCEEDED_VALUE, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f4623g = kVarArr;
        f4624h = kVarArr;
    }

    public k(boolean z8, int i8, int i9, int i10, int i11, int i12) {
        this(z8, i8, i9, i10, i11, i12, i8, i9);
    }

    private int a() {
        int i8 = this.f4628d;
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2 && i8 != 4) {
                if (i8 == 16) {
                    return 4;
                }
                if (i8 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i9;
    }

    private int b() {
        int i8 = this.f4628d;
        if (i8 == 1 || i8 == 2) {
            return 1;
        }
        if (i8 == 4) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    private static k c(int i8, l lVar, boolean z8) {
        return lookup(i8, lVar, null, null, z8);
    }

    public static k lookup(int i8) {
        return c(i8, l.FORCE_NONE, true);
    }

    public static void overrideSymbolSet(k[] kVarArr) {
        f4624h = kVarArr;
    }

    public int getCodewordCount() {
        return this.f4626b + this.f4627c;
    }

    public final int getDataCapacity() {
        return this.f4626b;
    }

    public int getDataLengthForInterleavedBlock(int i8) {
        return this.f4629e;
    }

    public final int getErrorCodewords() {
        return this.f4627c;
    }

    public final int getErrorLengthForInterleavedBlock(int i8) {
        return this.f4630f;
    }

    public int getInterleavedBlockCount() {
        return this.f4626b / this.f4629e;
    }

    public final int getSymbolDataHeight() {
        return b() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return a() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return getSymbolDataHeight() + (b() << 1);
    }

    public final int getSymbolWidth() {
        return getSymbolDataWidth() + (a() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4625a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.matrixWidth);
        sb.append('x');
        sb.append(this.matrixHeight);
        sb.append(", symbol size ");
        sb.append(getSymbolWidth());
        sb.append('x');
        sb.append(getSymbolHeight());
        sb.append(", symbol data size ");
        sb.append(getSymbolDataWidth());
        sb.append('x');
        sb.append(getSymbolDataHeight());
        sb.append(", codewords ");
        sb.append(this.f4626b);
        sb.append('+');
        sb.append(this.f4627c);
        return sb.toString();
    }

    k(boolean z8, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f4625a = z8;
        this.f4626b = i8;
        this.f4627c = i9;
        this.matrixWidth = i10;
        this.matrixHeight = i11;
        this.f4628d = i12;
        this.f4629e = i13;
        this.f4630f = i14;
    }

    public static k lookup(int i8, l lVar) {
        return c(i8, lVar, true);
    }

    public static k lookup(int i8, boolean z8, boolean z9) {
        return c(i8, z8 ? l.FORCE_NONE : l.FORCE_SQUARE, z9);
    }

    public static k lookup(int i8, l lVar, F3.f fVar, F3.f fVar2, boolean z8) {
        for (k kVar : f4624h) {
            if (!(lVar == l.FORCE_SQUARE && kVar.f4625a) && ((lVar != l.FORCE_RECTANGLE || kVar.f4625a) && ((fVar == null || (kVar.getSymbolWidth() >= fVar.getWidth() && kVar.getSymbolHeight() >= fVar.getHeight())) && ((fVar2 == null || (kVar.getSymbolWidth() <= fVar2.getWidth() && kVar.getSymbolHeight() <= fVar2.getHeight())) && i8 <= kVar.f4626b)))) {
                return kVar;
            }
        }
        if (!z8) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i8);
    }
}
