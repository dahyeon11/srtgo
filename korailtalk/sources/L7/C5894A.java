package l7;

import S6.AbstractC0759c;
import S6.AbstractC0765i;
import S6.M;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: l7.A */
/* loaded from: classes3.dex */
public class C5894A extends z {
    public static final String capitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return capitalize(str, locale);
    }

    public static final int compareTo(String str, String other, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return z8 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return compareTo(str, str2, z8);
    }

    public static final String concatToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = cArr.length;
        }
        return concatToString(cArr, i8, i9);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? B.contentEqualsImpl(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static final String decapitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static final String decodeToString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, C5900f.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = bArr.length;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return decodeToString(bArr, i8, i9, z8);
    }

    public static final byte[] encodeToByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(C5900f.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return encodeToByteArray(str, i8, i9, z8);
    }

    public static final boolean endsWith(String str, String suffix, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z8 ? str.endsWith(suffix) : r.regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return endsWith(str, str2, z8);
    }

    public static final boolean equals(String str, String str2, boolean z8) {
        return str == null ? str2 == null : !z8 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return equals(str, str2, z8);
    }

    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static final boolean isBlank(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable indices = B.getIndices(charSequence);
            if (!(indices instanceof Collection) || !((Collection) indices).isEmpty()) {
                Iterator it = indices.iterator();
                while (it.hasNext()) {
                    if (!C5898d.isWhitespace(charSequence.charAt(((M) it).nextInt()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean regionMatches(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? r.regionMatches((String) charSequence, i8, (String) other, i9, i10, z8) : B.regionMatchesImpl(charSequence, i8, other, i9, i10, z8);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i8, CharSequence charSequence2, int i9, int i10, boolean z8, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z8 = false;
        }
        return regionMatches(charSequence, i8, charSequence2, i9, i10, z8);
    }

    public static String repeat(CharSequence charSequence, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i8 + Q7.C.PACKAGE_SEPARATOR_CHAR).toString());
        }
        if (i8 == 0) {
            return "";
        }
        if (i8 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                cArr[i9] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i8);
        M it = new j7.l(1, i8).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(charSequence);
        }
        String string = sb.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static final String replace(String str, char c9, char c10, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z8) {
            String strReplace = str.replace(c9, c10);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (C5899e.equals(cCharAt, c9, z8)) {
                cCharAt = c10;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replace$default(String str, char c9, char c10, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return replace(str, c9, c10, z8);
    }

    public static final String replaceFirst(String str, char c9, char c10, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = r.indexOf$default(str, c9, 0, z8, 2, (Object) null);
        return iIndexOf$default < 0 ? str : B.replaceRange(str, iIndexOf$default, iIndexOf$default + 1, String.valueOf(c10)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c9, char c10, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return replaceFirst(str, c9, c10, z8);
    }

    public static final List<String> split(CharSequence charSequence, Pattern regex, int i8) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        B.requireNonNegativeLimit(i8);
        if (i8 == 0) {
            i8 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i8);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return AbstractC0765i.asList(strArrSplit);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return split(charSequence, pattern, i8);
    }

    public static final boolean startsWith(String str, String prefix, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z8 ? str.startsWith(prefix) : r.regionMatches(str, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return startsWith(str, str2, z8);
    }

    public static final char[] toCharArray(String str, int i8, int i9) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractC0759c.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, str.length());
        char[] cArr = new char[i9 - i8];
        str.getChars(i8, i9, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        return toCharArray(str, i8, i9);
    }

    public static final String capitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String concatToString(char[] cArr, int i8, int i9) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractC0759c.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, cArr.length);
        return new String(cArr, i8, i9 - i8);
    }

    public static final String decapitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static final String decodeToString(byte[] bArr, int i8, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractC0759c.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, bArr.length);
        if (!z8) {
            return new String(bArr, i8, i9 - i8, C5900f.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = C5900f.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i8, i9 - i8)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte[] encodeToByteArray(String str, int i8, int i9, boolean z8) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractC0759c.Companion.checkBoundsIndexes$kotlin_stdlib(i8, i9, str.length());
        if (!z8) {
            String strSubstring = str.substring(i8, i9);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = C5900f.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = C5900f.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i8, i9));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i8, String str2, int i9, int i10, boolean z8, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z8 = false;
        }
        return r.regionMatches(str, i8, str2, i9, i10, z8);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return replace(str, str2, str3, z8);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return replaceFirst(str, str2, str3, z8);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return startsWith(str, str2, i8, z8);
    }

    public static final String replaceFirst(String str, String oldValue, String newValue, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iIndexOf$default = r.indexOf$default(str, oldValue, 0, z8, 2, (Object) null);
        return iIndexOf$default < 0 ? str : B.replaceRange(str, iIndexOf$default, oldValue.length() + iIndexOf$default, newValue).toString();
    }

    public static final boolean startsWith(String str, String prefix, int i8, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z8) {
            return str.startsWith(prefix, i8);
        }
        return r.regionMatches(str, i8, prefix, 0, prefix.length(), z8);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z8) {
        if (z8) {
            return B.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    public static boolean regionMatches(String str, int i8, String other, int i9, int i10, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!z8) {
            return str.regionMatches(i8, other, i9, i10);
        }
        return str.regionMatches(z8, i8, other, i9, i10);
    }

    public static final String replace(String str, String oldValue, String newValue, boolean z8) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i8 = 0;
        int iIndexOf = B.indexOf(str, oldValue, 0, z8);
        if (iIndexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = j7.s.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i8, iIndexOf);
                sb.append(newValue);
                i8 = iIndexOf + length;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = B.indexOf(str, oldValue, iIndexOf + iCoerceAtLeast, z8);
            } while (iIndexOf > 0);
            sb.append((CharSequence) str, i8, str.length());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }
}
