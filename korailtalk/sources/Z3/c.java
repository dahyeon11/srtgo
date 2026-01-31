package Z3;

/* loaded from: classes2.dex */
final class c extends h {
    c(M3.a aVar) {
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
        sb.append("(392");
        sb.append(iF);
        sb.append(')');
        sb.append(a().c(50, null).b());
        return sb.toString();
    }
}
