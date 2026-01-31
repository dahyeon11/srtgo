package W3;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class A extends y {

    /* renamed from: j, reason: collision with root package name */
    static final int[] f5307j = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5308k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[][] f5309l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i, reason: collision with root package name */
    private final int[] f5310i = new int[4];

    public static String convertUPCEtoUPCA(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c9 = cArr[5];
        switch (c9) {
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
            case ConstraintLayout.b.a.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c9);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case ConstraintLayout.b.a.LAYOUT_CONSTRAINT_TAG /* 51 */:
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c9);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    private static void n(StringBuilder sb, int i8) throws F3.m {
        for (int i9 = 0; i9 <= 1; i9++) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (i8 == f5309l[i9][i10]) {
                    sb.insert(0, (char) (i9 + 48));
                    sb.append((char) (i10 + 48));
                    return;
                }
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    @Override // W3.y
    protected boolean e(String str) {
        return super.e(convertUPCEtoUPCA(str));
    }

    @Override // W3.y
    protected int[] h(M3.a aVar, int i8) {
        return y.j(aVar, i8, true, f5308k);
    }

    @Override // W3.y
    protected int i(M3.a aVar, int[] iArr, StringBuilder sb) throws F3.m {
        int[] iArr2 = this.f5310i;
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
        return i8;
    }

    @Override // W3.y
    F3.a m() {
        return F3.a.UPC_E;
    }
}
