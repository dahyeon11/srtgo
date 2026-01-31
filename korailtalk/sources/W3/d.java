package W3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public final class d extends s {

    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int c(CharSequence charSequence, int i8, int i9) {
        a aVar;
        a aVarD;
        a aVarD2;
        a aVarD3 = d(charSequence, i8);
        a aVar2 = a.UNCODABLE;
        if (aVarD3 != aVar2 && aVarD3 != (aVar = a.ONE_DIGIT)) {
            if (i9 == 99) {
                return i9;
            }
            if (i9 == 100) {
                a aVar3 = a.FNC_1;
                if (aVarD3 == aVar3 || (aVarD = d(charSequence, i8 + 2)) == aVar2 || aVarD == aVar) {
                    return i9;
                }
                if (aVarD == aVar3) {
                    return d(charSequence, i8 + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i10 = i8 + 4;
                while (true) {
                    aVarD2 = d(charSequence, i10);
                    if (aVarD2 != a.TWO_DIGITS) {
                        break;
                    }
                    i10 += 2;
                }
                return aVarD2 == a.ONE_DIGIT ? 100 : 99;
            }
            if (aVarD3 == a.FNC_1) {
                aVarD3 = d(charSequence, i8 + 1);
            }
            if (aVarD3 == a.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }

    private static a d(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        if (i8 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i8);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i9 = i8 + 1;
        if (i9 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i9);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.CODE_128) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) throws NumberFormatException {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iA = 0;
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt < ' ' || cCharAt > '~') {
                    switch (cCharAt) {
                        case 241:
                        case 242:
                        case 243:
                        case 244:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + cCharAt);
                    }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 1;
            while (i9 < length) {
                int iC = c(str, i9, i11);
                int iCharAt = 100;
                if (iC == i11) {
                    switch (str.charAt(i9)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            break;
                        default:
                            if (i11 != 100) {
                                iCharAt = Integer.parseInt(str.substring(i9, i9 + 2));
                                i9++;
                                break;
                            } else {
                                iCharAt = str.charAt(i9) - ' ';
                                break;
                            }
                    }
                    i9++;
                } else {
                    iCharAt = i11 == 0 ? iC == 100 ? 104 : 105 : iC;
                    i11 = iC;
                }
                arrayList.add(c.f5321a[iCharAt]);
                i10 += iCharAt * i12;
                if (i9 != 0) {
                    i12++;
                }
            }
            int i13 = i10 % Map.MapException.CALLED_INTERFACE_FIELD_NUMBER;
            int[][] iArr = c.f5321a;
            arrayList.add(iArr[i13]);
            arrayList.add(iArr[106]);
            int i14 = 0;
            for (int[] iArr2 : arrayList) {
                for (int i15 : iArr2) {
                    i14 += i15;
                }
            }
            boolean[] zArr = new boolean[i14];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iA += s.a(zArr, iA, (int[]) it.next(), true);
            }
            return zArr;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
    }
}
