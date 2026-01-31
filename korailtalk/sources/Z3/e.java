package Z3;

/* loaded from: classes2.dex */
final class e extends i {

    /* renamed from: c */
    private final String f5719c;

    /* renamed from: d */
    private final String f5720d;

    e(M3.a aVar, String str, String str2) {
        super(aVar);
        this.f5719c = str2;
        this.f5720d = str;
    }

    private void i(StringBuilder sb, int i8) {
        int iF = a().f(i8, 16);
        if (iF == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f5719c);
        sb.append(')');
        int i9 = iF % 32;
        int i10 = iF / 32;
        int i11 = (i10 % 12) + 1;
        int i12 = i10 / 12;
        if (i12 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i12);
        if (i11 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i11);
        if (i9 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i9);
    }

    @Override // Z3.i
    protected void f(StringBuilder sb, int i8) {
        sb.append('(');
        sb.append(this.f5720d);
        sb.append(i8 / 100000);
        sb.append(')');
    }

    @Override // Z3.i
    protected int g(int i8) {
        return i8 % 100000;
    }

    @Override // Z3.j
    public String parseInformation() throws F3.m {
        if (b().getSize() != 84) {
            throw F3.m.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        d(sb, 8);
        h(sb, 48, 20);
        i(sb, 68);
        return sb.toString();
    }
}
