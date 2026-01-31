package Z3;

/* loaded from: classes2.dex */
abstract class i extends h {
    i(M3.a aVar) {
        super(aVar);
    }

    protected abstract void f(StringBuilder sb, int i8);

    protected abstract int g(int i8);

    final void h(StringBuilder sb, int i8, int i9) {
        int iF = a().f(i8, i9);
        f(sb, iF);
        int iG = g(iF);
        int i10 = 100000;
        for (int i11 = 0; i11 < 5; i11++) {
            if (iG / i10 == 0) {
                sb.append('0');
            }
            i10 /= 10;
        }
        sb.append(iG);
    }
}
