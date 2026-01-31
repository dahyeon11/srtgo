package Z3;

/* loaded from: classes2.dex */
final class b extends f {
    b(M3.a aVar) {
        super(aVar);
    }

    @Override // Z3.i
    protected void f(StringBuilder sb, int i8) {
        if (i8 < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    @Override // Z3.i
    protected int g(int i8) {
        return i8 < 10000 ? i8 : i8 - 10000;
    }
}
