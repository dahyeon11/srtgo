package l7;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5898d {
    public static int checkRadix(int i8) {
        if (new j7.l(2, 36).contains(i8)) {
            return i8;
        }
        throw new IllegalArgumentException("radix " + i8 + " was not in valid range " + new j7.l(2, 36));
    }

    public static final int digitOf(char c9, int i8) {
        return Character.digit((int) c9, i8);
    }

    public static final EnumC5895a getCategory(char c9) {
        return EnumC5895a.Companion.valueOf(Character.getType(c9));
    }

    public static final EnumC5896b getDirectionality(char c9) {
        return EnumC5896b.Companion.valueOf(Character.getDirectionality(c9));
    }

    public static final boolean isWhitespace(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static final String lowercase(char c9, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c9);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String titlecase(char c9, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strUppercase = uppercase(c9, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c9);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !Intrinsics.areEqual(strUppercase, upperCase) ? strUppercase : String.valueOf(Character.toTitleCase(c9));
        }
        if (c9 == 329) {
            return strUppercase;
        }
        char cCharAt = strUppercase.charAt(0);
        Intrinsics.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strUppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static final String uppercase(char c9, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c9);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
