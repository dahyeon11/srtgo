package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1265Dh extends AbstractC1347Fh {
    C1265Dh() {
    }

    private static final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < str.length() && str.charAt(i9) == ',') {
            i9++;
        }
        while (length > 0) {
            int i10 = length - 1;
            if (str.charAt(i10) != ',') {
                break;
            }
            length = i10;
        }
        if (length < i9) {
            return null;
        }
        if (i9 != 0) {
            i8 = i9;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i8, length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1347Fh
    public final String zza(String str, String str2) {
        String strA = a(str);
        String strA2 = a(str2);
        if (TextUtils.isEmpty(strA)) {
            return strA2;
        }
        if (TextUtils.isEmpty(strA2)) {
            return strA;
        }
        return strA + "," + strA2;
    }
}
