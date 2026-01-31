package Q7;

/* renamed from: Q7.n */
/* loaded from: classes3.dex */
public class C0710n {
    private static boolean a(CharSequence charSequence, CharSequence charSequence2, int i8, int i9) {
        int i10 = 1;
        for (int i11 = i8 - 1; i10 <= i11; i11--) {
            if (charSequence.charAt(i9 + i10) != charSequence2.charAt(i10) || charSequence.charAt(i9 + i11) != charSequence2.charAt(i11)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    static int b(CharSequence charSequence, int i8, int i9) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(i8, i9);
        }
        int length = charSequence.length();
        if (i9 < 0) {
            i9 = 0;
        }
        if (i8 < 65536) {
            while (i9 < length) {
                if (charSequence.charAt(i9) == i8) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        if (i8 <= 1114111) {
            char[] chars = Character.toChars(i8);
            while (i9 < length - 1) {
                char cCharAt = charSequence.charAt(i9);
                int i10 = i9 + 1;
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt == chars[0] && cCharAt2 == chars[1]) {
                    return i9;
                }
                i9 = i10;
            }
        }
        return -1;
    }

    static int c(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(charSequence2.toString(), i8) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i8) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i8) : charSequence.toString().indexOf(charSequence2.toString(), i8);
    }

    static int d(CharSequence charSequence, int i8, int i9) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(i8, i9);
        }
        int length = charSequence.length();
        if (i9 < 0) {
            return -1;
        }
        if (i9 >= length) {
            i9 = length - 1;
        }
        if (i8 < 65536) {
            while (i9 >= 0) {
                if (charSequence.charAt(i9) == i8) {
                    return i9;
                }
                i9--;
            }
            return -1;
        }
        if (i8 <= 1114111) {
            char[] chars = Character.toChars(i8);
            if (i9 == length - 1) {
                return -1;
            }
            while (i9 >= 0) {
                char cCharAt = charSequence.charAt(i9);
                char cCharAt2 = charSequence.charAt(i9 + 1);
                if (chars[0] == cCharAt && chars[1] == cCharAt2) {
                    return i9;
                }
                i9--;
            }
        }
        return -1;
    }

    static int e(CharSequence charSequence, CharSequence charSequence2, int i8) {
        if (charSequence2 != null && charSequence != null) {
            if (charSequence2 instanceof String) {
                if (charSequence instanceof String) {
                    return ((String) charSequence).lastIndexOf((String) charSequence2, i8);
                }
                if (charSequence instanceof StringBuilder) {
                    return ((StringBuilder) charSequence).lastIndexOf((String) charSequence2, i8);
                }
                if (charSequence instanceof StringBuffer) {
                    return ((StringBuffer) charSequence).lastIndexOf((String) charSequence2, i8);
                }
            }
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (i8 > length) {
                i8 = length;
            }
            if (i8 >= 0 && length2 <= length) {
                if (length2 == 0) {
                    return i8;
                }
                if (length2 <= 16) {
                    if (charSequence instanceof String) {
                        return ((String) charSequence).lastIndexOf(charSequence2.toString(), i8);
                    }
                    if (charSequence instanceof StringBuilder) {
                        return ((StringBuilder) charSequence).lastIndexOf(charSequence2.toString(), i8);
                    }
                    if (charSequence instanceof StringBuffer) {
                        return ((StringBuffer) charSequence).lastIndexOf(charSequence2.toString(), i8);
                    }
                }
                if (i8 + length2 > length) {
                    i8 = length - length2;
                }
                char cCharAt = charSequence2.charAt(0);
                while (true) {
                    if (charSequence.charAt(i8) != cCharAt) {
                        i8--;
                        if (i8 < 0) {
                            return -1;
                        }
                    } else {
                        if (a(charSequence, charSequence2, length2, i8)) {
                            return i8;
                        }
                        i8--;
                        if (i8 < 0) {
                            break;
                        }
                    }
                }
            }
        }
        return -1;
    }

    static boolean f(CharSequence charSequence, boolean z8, int i8, CharSequence charSequence2, int i9, int i10) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z8, i8, (String) charSequence2, i9, i10);
        }
        int length = charSequence.length() - i8;
        int length2 = charSequence2.length() - i9;
        if (i8 < 0 || i9 < 0 || i10 < 0 || length < i10 || length2 < i10) {
            return false;
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return true;
            }
            int i12 = i8 + 1;
            char cCharAt = charSequence.charAt(i8);
            int i13 = i9 + 1;
            char cCharAt2 = charSequence2.charAt(i9);
            if (cCharAt != cCharAt2) {
                if (!z8) {
                    return false;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                char upperCase2 = Character.toUpperCase(cCharAt2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
            i8 = i12;
            i10 = i11;
            i9 = i13;
        }
    }

    public static CharSequence subSequence(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.subSequence(i8, charSequence.length());
    }

    public static char[] toCharArray(CharSequence charSequence) {
        int length = X.length(charSequence);
        if (length == 0) {
            return C0708l.EMPTY_CHAR_ARRAY;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).toCharArray();
        }
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = charSequence.charAt(i8);
        }
        return cArr;
    }
}
