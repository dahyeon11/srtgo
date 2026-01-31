package U3;

import M3.e;
import e3.AbstractC5358c;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f5030a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    static e a(byte[] bArr, int i8) {
        String strH;
        StringBuilder sb = new StringBuilder(144);
        if (i8 == 2 || i8 == 3) {
            if (i8 == 2) {
                strH = new DecimalFormat("0000000000".substring(0, g(bArr))).format(f(bArr));
            } else {
                strH = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(c(bArr));
            String str2 = decimalFormat.format(i(bArr));
            sb.append(e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, strH + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb.insert(0, strH + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i8 == 4) {
            sb.append(e(bArr, 1, 93));
        } else if (i8 == 5) {
            sb.append(e(bArr, 1, 77));
        }
        return new e(bArr, sb.toString(), null, String.valueOf(i8));
    }

    private static int b(int i8, byte[] bArr) {
        int i9 = i8 - 1;
        return ((1 << (5 - (i9 % 6))) & bArr[i9 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int iB = 0;
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            iB += b(bArr2[i8], bArr) << ((bArr2.length - i8) - 1);
        }
        return iB;
    }

    private static String e(byte[] bArr, int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        int i10 = i8;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i10 < i8 + i9) {
            char cCharAt = f5030a[i12].charAt(bArr[i10]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i13 = i12;
                    i12 = cCharAt - 65520;
                    i11 = 1;
                    break;
                case 65525:
                    i11 = 2;
                    i13 = i12;
                    i12 = 0;
                    break;
                case 65526:
                    i11 = 3;
                    i13 = i12;
                    i12 = 0;
                    break;
                case 65527:
                    i11 = -1;
                    i12 = 0;
                    break;
                case 65528:
                    i11 = -1;
                    i12 = 1;
                    break;
                case 65529:
                    i11 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i14 = (bArr[i10 + 1] << AbstractC5358c.CAN) + (bArr[i10 + 2] << AbstractC5358c.DC2) + (bArr[i10 + 3] << AbstractC5358c.FF) + (bArr[i10 + 4] << 6);
                    i10 += 5;
                    sb.append(new DecimalFormat("000000000").format(i14 + bArr[i10]));
                    break;
            }
            int i15 = i11 - 1;
            if (i11 == 0) {
                i12 = i13;
            }
            i10++;
            i11 = i15;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, AbstractC5358c.EM, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.FS, AbstractC5358c.GS, AbstractC5358c.RS, 19, AbstractC5358c.DC4, AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.CR, AbstractC5358c.SO, AbstractC5358c.SI, AbstractC5358c.DLE, 17, AbstractC5358c.DC2, 7, 8, 9, 10, AbstractC5358c.VT, AbstractC5358c.FF, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, AbstractC5358c.US, 32});
    }

    private static String h(byte[] bArr) {
        String[] strArr = f5030a;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, AbstractC5358c.US, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, AbstractC5358c.EM, AbstractC5358c.SUB})), strArr[0].charAt(d(bArr, new byte[]{AbstractC5358c.ESC, AbstractC5358c.FS, AbstractC5358c.GS, AbstractC5358c.RS, 19, AbstractC5358c.DC4})), strArr[0].charAt(d(bArr, new byte[]{AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.CR, AbstractC5358c.SO})), strArr[0].charAt(d(bArr, new byte[]{AbstractC5358c.SI, AbstractC5358c.DLE, 17, AbstractC5358c.DC2, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, AbstractC5358c.VT, AbstractC5358c.FF, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
