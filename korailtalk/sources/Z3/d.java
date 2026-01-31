package Z3;

/* loaded from: classes2.dex */
final class d extends h {
    d(M3.a aVar) {
        super(aVar);
    }

    @Override // Z3.j
    public String parseInformation() throws F3.m {
        if (b().getSize() < 48) {
            throw F3.m.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        d(sb, 8);
        int iF = a().f(48, 2);
        sb.append("(393");
        sb.append(iF);
        sb.append(')');
        int iF2 = a().f(50, 10);
        if (iF2 / 100 == 0) {
            sb.append('0');
        }
        if (iF2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(iF2);
        sb.append(a().c(60, null).b());
        return sb.toString();
    }
}
