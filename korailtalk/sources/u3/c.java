package U3;

import F3.d;
import F3.h;
import O3.e;
import e3.AbstractC5358c;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final O3.c f5031a = new O3.c(O3.a.MAXICODE_FIELD_64);

    private void a(byte[] bArr, int i8, int i9, int i10, int i11) throws d {
        int i12 = i9 + i10;
        int i13 = i11 == 0 ? 1 : 2;
        int[] iArr = new int[i12 / i13];
        for (int i14 = 0; i14 < i12; i14++) {
            if (i11 == 0 || i14 % 2 == i11 - 1) {
                iArr[i14 / i13] = bArr[i14 + i8] & 255;
            }
        }
        try {
            this.f5031a.decode(iArr, i10 / i13);
            for (int i15 = 0; i15 < i9; i15++) {
                if (i11 == 0 || i15 % 2 == i11 - 1) {
                    bArr[i15 + i8] = (byte) iArr[i15 / i13];
                }
            }
        } catch (e unused) {
            throw d.getChecksumInstance();
        }
    }

    public M3.e decode(M3.b bVar) {
        return decode(bVar, null);
    }

    public M3.e decode(M3.b bVar, Map<F3.e, ?> map) throws d, h {
        byte[] bArr;
        byte[] bArrA = new a(bVar).a();
        a(bArrA, 0, 10, 10, 0);
        int i8 = bArrA[0] & AbstractC5358c.SI;
        if (i8 == 2 || i8 == 3 || i8 == 4) {
            a(bArrA, 20, 84, 40, 1);
            a(bArrA, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i8 != 5) {
                throw h.getFormatInstance();
            }
            a(bArrA, 20, 68, 56, 1);
            a(bArrA, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArrA, 0, bArr, 0, 10);
        System.arraycopy(bArrA, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i8);
    }
}
