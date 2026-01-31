package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2963gj0 {
    private static int a(char c9) {
        return (char) ((c9 | ' ') - 97);
    }

    public static String zza(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (zze(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c9 = charArray[i8];
                    if (zze(c9)) {
                        charArray[i8] = (char) (c9 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (zzd(str.charAt(i8))) {
                char[] charArray = str.toCharArray();
                while (i8 < length) {
                    char c9 = charArray[i8];
                    if (zzd(c9)) {
                        charArray[i8] = (char) (c9 ^ ' ');
                    }
                    i8++;
                }
                return String.valueOf(charArray);
            }
            i8++;
        }
        return str;
    }

    public static boolean zzc(CharSequence charSequence, CharSequence charSequence2) {
        int iA;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = charSequence.charAt(i8);
            char cCharAt2 = charSequence2.charAt(i8);
            if (cCharAt != cCharAt2 && ((iA = a(cCharAt)) >= 26 || iA != a(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzd(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean zze(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }
}
