package Z3;

/* loaded from: classes2.dex */
abstract class h extends j {
    h(M3.a aVar) {
        super(aVar);
    }

    private static void c(StringBuilder sb, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < 13; i10++) {
            int iCharAt = sb.charAt(i10 + i8) - '0';
            if ((i10 & 1) == 0) {
                iCharAt *= 3;
            }
            i9 += iCharAt;
        }
        int i11 = 10 - (i9 % 10);
        sb.append(i11 != 10 ? i11 : 0);
    }

    final void d(StringBuilder sb, int i8) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        e(sb, i8, length);
    }

    final void e(StringBuilder sb, int i8, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            int iF = a().f((i10 * 10) + i8, 10);
            if (iF / 100 == 0) {
                sb.append('0');
            }
            if (iF / 10 == 0) {
                sb.append('0');
            }
            sb.append(iF);
        }
        c(sb, i9);
    }
}
