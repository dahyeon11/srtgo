package Z3;

/* loaded from: classes2.dex */
abstract class f extends i {
    f(M3.a aVar) {
        super(aVar);
    }

    @Override // Z3.j
    public String parseInformation() throws F3.m {
        if (b().getSize() != 60) {
            throw F3.m.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        d(sb, 5);
        h(sb, 45, 15);
        return sb.toString();
    }
}
