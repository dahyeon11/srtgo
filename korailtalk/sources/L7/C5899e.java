package l7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5899e extends C5898d {
    public static final char digitToChar(int i8) {
        if (new j7.l(0, 9).contains(i8)) {
            return (char) (i8 + 48);
        }
        throw new IllegalArgumentException("Int " + i8 + " is not a decimal digit");
    }

    public static int digitToInt(char c9) {
        int iDigitOf = C5898d.digitOf(c9, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c9 + " is not a decimal digit");
    }

    public static final Integer digitToIntOrNull(char c9) {
        Integer numValueOf = Integer.valueOf(C5898d.digitOf(c9, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c9, char c10, boolean z8) {
        if (c9 == c10) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c9, char c10, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return equals(c9, c10, z8);
    }

    public static final boolean isSurrogate(char c9) {
        return new j7.c((char) 55296, (char) 57343).contains(c9);
    }

    public static final String titlecase(char c9) {
        return F.titlecaseImpl(c9);
    }

    public static final Integer digitToIntOrNull(char c9, int i8) {
        AbstractC5897c.checkRadix(i8);
        Integer numValueOf = Integer.valueOf(C5898d.digitOf(c9, i8));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final char digitToChar(int i8, int i9) {
        if (!new j7.l(2, 36).contains(i9)) {
            throw new IllegalArgumentException("Invalid radix: " + i9 + ". Valid radix values are in range 2..36");
        }
        if (i8 >= 0 && i8 < i9) {
            return (char) (i8 < 10 ? i8 + 48 : ((char) (i8 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i8 + " does not represent a valid digit in radix " + i9);
    }

    public static final int digitToInt(char c9, int i8) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c9, i8);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c9 + " is not a digit in the given radix=" + i8);
    }
}
