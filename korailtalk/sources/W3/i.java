package W3;

/* loaded from: classes2.dex */
public final class i extends y {

    /* renamed from: j */
    static final int[] f5334j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f5335i = new int[4];

    private static void n(StringBuilder sb, int i8) throws F3.m {
        for (int i9 = 0; i9 < 10; i9++) {
            if (i8 == f5334j[i9]) {
                sb.insert(0, (char) (i9 + 48));
                return;
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    @Override // W3.y
    protected int i(M3.a aVar, int[] iArr, StringBuilder sb) throws F3.m {
        int[] iArr2 = this.f5335i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = aVar.getSize();
        int i8 = iArr[1];
        int i9 = 0;
        for (int i10 = 0; i10 < 6 && i8 < size; i10++) {
            int iG = y.g(aVar, iArr2, i8, y.f5362h);
            sb.append((char) ((iG % 10) + 48));
            for (int i11 : iArr2) {
                i8 += i11;
            }
            if (iG >= 10) {
                i9 |= 1 << (5 - i10);
            }
        }
        n(sb, i9);
        int i12 = y.j(aVar, i8, true, y.f5359e)[1];
        for (int i13 = 0; i13 < 6 && i12 < size; i13++) {
            sb.append((char) (y.g(aVar, iArr2, i12, y.f5361g) + 48));
            for (int i14 : iArr2) {
                i12 += i14;
            }
        }
        return i12;
    }

    @Override // W3.y
    F3.a m() {
        return F3.a.EAN_13;
    }
}
