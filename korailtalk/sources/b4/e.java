package b4;

import a4.AbstractC0834a;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f11416a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f11417b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f11418c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    private static final BigInteger[] f11419d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11420a;

        static {
            int[] iArr = new int[b.values().length];
            f11420a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11420a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11420a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11420a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11420a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11420a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f11419d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i8 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f11419d;
            if (i8 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i8] = bigIntegerArr2[i8 - 1].multiply(bigIntegerValueOf);
            i8++;
        }
    }

    private static int a(int i8, int[] iArr, Charset charset, int i9, StringBuilder sb) {
        int i10;
        int i11;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 922;
        int i14 = 923;
        int i15 = AbstractC0834a.MAX_CODEWORDS_IN_BARCODE;
        long j8 = 900;
        if (i8 == 901) {
            int[] iArr2 = new int[6];
            i10 = i9 + 1;
            int i16 = iArr[i9];
            long j9 = 0;
            boolean z8 = false;
            int i17 = 0;
            while (true) {
                i11 = iArr[0];
                if (i10 >= i11 || z8) {
                    break;
                }
                int i18 = i17 + 1;
                iArr2[i17] = i16;
                j9 = (j9 * j8) + i16;
                int i19 = i10 + 1;
                i16 = iArr[i10];
                if (i16 == 900 || i16 == 901 || i16 == 902 || i16 == 924 || i16 == 928 || i16 == i14 || i16 == i13) {
                    i17 = i18;
                    i13 = 922;
                    i14 = 923;
                    j8 = 900;
                    z8 = true;
                } else if (i18 % 5 != 0 || i18 <= 0) {
                    i10 = i19;
                    i17 = i18;
                    i13 = 922;
                    i14 = 923;
                    j8 = 900;
                } else {
                    int i20 = 0;
                    while (i20 < 6) {
                        byteArrayOutputStream.write((byte) (j9 >> ((5 - i20) * 8)));
                        i20++;
                        i13 = 922;
                        i14 = 923;
                    }
                    i10 = i19;
                    i17 = 0;
                    j8 = 900;
                    j9 = 0;
                }
            }
            if (i10 != i11 || i16 >= 900) {
                i12 = i17;
            } else {
                i12 = i17 + 1;
                iArr2[i17] = i16;
            }
            for (int i21 = 0; i21 < i12; i21++) {
                byteArrayOutputStream.write((byte) iArr2[i21]);
            }
        } else if (i8 == 924) {
            int i22 = i9;
            boolean z9 = false;
            int i23 = 0;
            long j10 = 0;
            while (i22 < iArr[0] && !z9) {
                int i24 = i22 + 1;
                int i25 = iArr[i22];
                if (i25 < 900) {
                    i23++;
                    j10 = (j10 * 900) + i25;
                    i22 = i24;
                } else {
                    if (i25 != 900 && i25 != 901 && i25 != 902 && i25 != 924 && i25 != i15) {
                        if (i25 != 923 && i25 != 922) {
                            i22 = i24;
                        }
                    }
                    z9 = true;
                }
                if (i23 % 5 == 0 && i23 > 0) {
                    for (int i26 = 0; i26 < 6; i26++) {
                        byteArrayOutputStream.write((byte) (j10 >> ((5 - i26) * 8)));
                    }
                    i23 = 0;
                    j10 = 0;
                }
                i15 = AbstractC0834a.MAX_CODEWORDS_IN_BARCODE;
            }
            i10 = i22;
        } else {
            i10 = i9;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static M3.e b(int[] r6, java.lang.String r7) throws F3.h {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = b4.e.f11418c
            r2 = r6[r2]
            a4.c r3 = new a4.c
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = g(r6, r4, r0)
            goto L60
        L28:
            int r2 = d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            M3.d r1 = M3.d.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            F3.h r6 = F3.h.getFormatInstance()
            throw r6
        L49:
            int r2 = f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            F3.h r6 = F3.h.getFormatInstance()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            M3.e r6 = new M3.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.setOther(r3)
            return r6
        L81:
            F3.h r6 = F3.h.getFormatInstance()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.b(int[], java.lang.String):M3.e");
    }

    private static String c(int[] iArr, int i8) throws F3.h {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i9 = 0; i9 < i8; i9++) {
            bigIntegerAdd = bigIntegerAdd.add(f11419d[(i8 - i9) - 1].multiply(BigInteger.valueOf(iArr[i9])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw F3.h.getFormatInstance();
    }

    private static int d(int[] iArr, int i8, a4.c cVar) throws F3.h {
        if (i8 + 2 > iArr[0]) {
            throw F3.h.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i9 = 0;
        while (i9 < 2) {
            iArr2[i9] = iArr[i8];
            i9++;
            i8++;
        }
        cVar.setSegmentIndex(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iG = g(iArr, i8, sb);
        cVar.setFileId(sb.toString());
        int i10 = iArr[iG];
        if (i10 != 923) {
            if (i10 != 922) {
                return iG;
            }
            cVar.setLastSegment(true);
            return iG + 1;
        }
        int i11 = iG + 1;
        int[] iArr3 = new int[iArr[0] - i11];
        boolean z8 = false;
        int i12 = 0;
        while (i11 < iArr[0] && !z8) {
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            if (i14 < 900) {
                iArr3[i12] = i14;
                i12++;
                i11 = i13;
            } else {
                if (i14 != 922) {
                    throw F3.h.getFormatInstance();
                }
                cVar.setLastSegment(true);
                i11 += 2;
                z8 = true;
            }
        }
        cVar.setOptionalData(Arrays.copyOf(iArr3, i12));
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i8, StringBuilder sb) {
        b bVar;
        int i9;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = iArr[i10];
            char c9 = ' ';
            switch (a.f11420a[bVar2.ordinal()]) {
                case 1:
                    if (i11 < 26) {
                        i9 = i11 + 65;
                        c9 = (char) i9;
                        break;
                    } else if (i11 != 26) {
                        if (i11 == 27) {
                            bVar2 = b.LOWER;
                        } else if (i11 == 28) {
                            bVar2 = b.MIXED;
                        } else if (i11 == 29) {
                            bVar = b.PUNCT_SHIFT;
                            c9 = 0;
                            b bVar4 = bVar;
                            bVar3 = bVar2;
                            bVar2 = bVar4;
                            break;
                        } else if (i11 == 913) {
                            sb.append((char) iArr2[i10]);
                        } else if (i11 == 900) {
                            bVar2 = b.ALPHA;
                        }
                        c9 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i11 < 26) {
                        i9 = i11 + 97;
                        c9 = (char) i9;
                        break;
                    } else if (i11 != 26) {
                        if (i11 != 27) {
                            if (i11 == 28) {
                                bVar2 = b.MIXED;
                            } else if (i11 == 29) {
                                bVar = b.PUNCT_SHIFT;
                            } else if (i11 == 913) {
                                sb.append((char) iArr2[i10]);
                            } else if (i11 == 900) {
                                bVar2 = b.ALPHA;
                            }
                            c9 = 0;
                            break;
                        } else {
                            bVar = b.ALPHA_SHIFT;
                        }
                        c9 = 0;
                        b bVar42 = bVar;
                        bVar3 = bVar2;
                        bVar2 = bVar42;
                        break;
                    }
                    break;
                case 3:
                    if (i11 < 25) {
                        c9 = f11417b[i11];
                        break;
                    } else {
                        if (i11 == 25) {
                            bVar2 = b.PUNCT;
                        } else if (i11 != 26) {
                            if (i11 == 27) {
                                bVar2 = b.LOWER;
                            } else if (i11 == 28) {
                                bVar2 = b.ALPHA;
                            } else if (i11 == 29) {
                                bVar = b.PUNCT_SHIFT;
                                c9 = 0;
                                b bVar422 = bVar;
                                bVar3 = bVar2;
                                bVar2 = bVar422;
                                break;
                            } else if (i11 == 913) {
                                sb.append((char) iArr2[i10]);
                            } else if (i11 == 900) {
                                bVar2 = b.ALPHA;
                            }
                        }
                        c9 = 0;
                        break;
                    }
                    break;
                case 4:
                    if (i11 < 29) {
                        c9 = f11416a[i11];
                        break;
                    } else {
                        if (i11 == 29) {
                            bVar2 = b.ALPHA;
                        } else if (i11 == 913) {
                            sb.append((char) iArr2[i10]);
                        } else if (i11 == 900) {
                            bVar2 = b.ALPHA;
                        }
                        c9 = 0;
                        break;
                    }
                case 5:
                    if (i11 < 26) {
                        c9 = (char) (i11 + 65);
                    } else if (i11 != 26) {
                        if (i11 == 900) {
                            bVar2 = b.ALPHA;
                            c9 = 0;
                            break;
                        }
                        c9 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i11 < 29) {
                        c9 = f11416a[i11];
                        bVar2 = bVar3;
                        break;
                    } else {
                        if (i11 == 29) {
                            bVar2 = b.ALPHA;
                        } else {
                            if (i11 == 913) {
                                sb.append((char) iArr2[i10]);
                            } else if (i11 == 900) {
                                bVar2 = b.ALPHA;
                            }
                            c9 = 0;
                            bVar2 = bVar3;
                        }
                        c9 = 0;
                        break;
                    }
                default:
                    c9 = 0;
                    break;
            }
            if (c9 != 0) {
                sb.append(c9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0007 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int f(int[] r8, int r9, java.lang.StringBuilder r10) {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L4b
            if (r2 != 0) goto L4b
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L36
        L1f:
            if (r6 == r4) goto L35
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L35
            r4 = 924(0x39c, float:1.295E-42)
            if (r6 == r4) goto L35
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L35
            r4 = 923(0x39b, float:1.293E-42)
            if (r6 == r4) goto L35
            r4 = 922(0x39a, float:1.292E-42)
            if (r6 != r4) goto L1d
        L35:
            r2 = r7
        L36:
            int r4 = r3 % 15
            if (r4 == 0) goto L40
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L40
            if (r2 == 0) goto L7
        L40:
            if (r3 <= 0) goto L7
            java.lang.String r3 = c(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L4b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.f(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    private static int g(int[] iArr, int i8, StringBuilder sb) {
        int i9 = iArr[0];
        int[] iArr2 = new int[(i9 - i8) << 1];
        int[] iArr3 = new int[(i9 - i8) << 1];
        boolean z8 = false;
        int i10 = 0;
        while (i8 < iArr[0] && !z8) {
            int i11 = i8 + 1;
            int i12 = iArr[i8];
            if (i12 < 900) {
                iArr2[i10] = i12 / 30;
                iArr2[i10 + 1] = i12 % 30;
                i10 += 2;
            } else if (i12 != 913) {
                if (i12 != 928) {
                    switch (i12) {
                        case 900:
                            iArr2[i10] = 900;
                            i10++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i12) {
                            }
                    }
                }
                z8 = true;
            } else {
                iArr2[i10] = 913;
                i8 += 2;
                iArr3[i10] = iArr[i11];
                i10++;
            }
            i8 = i11;
        }
        e(iArr2, iArr3, i10, sb);
        return i8;
    }
}
