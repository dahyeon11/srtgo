package W3;

/* loaded from: classes2.dex */
public final class k extends y {

    /* renamed from: i, reason: collision with root package name */
    private final int[] f5336i = new int[4];

    @Override // W3.y
    protected int i(M3.a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f5336i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = aVar.getSize();
        int i8 = iArr[1];
        for (int i9 = 0; i9 < 4 && i8 < size; i9++) {
            sb.append((char) (y.g(aVar, iArr2, i8, y.f5361g) + 48));
            for (int i10 : iArr2) {
                i8 += i10;
            }
        }
        int i11 = y.j(aVar, i8, true, y.f5359e)[1];
        for (int i12 = 0; i12 < 4 && i11 < size; i12++) {
            sb.append((char) (y.g(aVar, iArr2, i11, y.f5361g) + 48));
            for (int i13 : iArr2) {
                i11 += i13;
            }
        }
        return i11;
    }

    @Override // W3.y
    F3.a m() {
        return F3.a.EAN_8;
    }
}
