package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class PA0 extends OA0 {
    PA0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.OA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PA0.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.OA0
    final String b(byte[] bArr, int i8, int i9) throws C4021pz0 {
        int i10;
        int length = bArr.length;
        if ((((length - i8) - i9) | i8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        int i11 = i8 + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (i8 < i11) {
            byte b9 = bArr[i8];
            if (!NA0.d(b9)) {
                break;
            }
            i8++;
            cArr[i12] = (char) b9;
            i12++;
        }
        int i13 = i12;
        while (i8 < i11) {
            int i14 = i8 + 1;
            byte b10 = bArr[i8];
            if (NA0.d(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                i8 = i14;
                while (i8 < i11) {
                    byte b11 = bArr[i8];
                    if (NA0.d(b11)) {
                        i8++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else {
                if (NA0.f(b10)) {
                    if (i14 >= i11) {
                        throw C4021pz0.d();
                    }
                    i10 = i13 + 1;
                    i8 += 2;
                    NA0.c(b10, bArr[i14], cArr, i13);
                } else if (NA0.e(b10)) {
                    if (i14 >= i11 - 1) {
                        throw C4021pz0.d();
                    }
                    i10 = i13 + 1;
                    int i15 = i8 + 2;
                    i8 += 3;
                    NA0.b(b10, bArr[i14], bArr[i15], cArr, i13);
                } else {
                    if (i14 >= i11 - 2) {
                        throw C4021pz0.d();
                    }
                    byte b12 = bArr[i14];
                    int i16 = i8 + 3;
                    byte b13 = bArr[i8 + 2];
                    i8 += 4;
                    NA0.a(b10, b12, b13, bArr[i16], cArr, i13);
                    i13 += 2;
                }
                i13 = i10;
            }
        }
        return new String(cArr, 0, i13);
    }
}
