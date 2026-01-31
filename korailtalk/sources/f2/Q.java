package f2;

/* loaded from: classes.dex */
abstract class Q {
    static int a(int i8) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i9 = 0; i9 < 6; i9++) {
            int i10 = iArr[i9];
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            if (i11 == i8) {
                return i10;
            }
        }
        return 1;
    }
}
