package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class Z5 {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private Z5(String str, int i8, String str2, Set set) {
        this.zzb = i8;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static Z5 zza(String str, int i8) {
        String str2;
        String strTrim = str.trim();
        F10.zzd(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(Q7.X.SPACE);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i9 = AbstractC2281am0.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            hashSet.add(strArrSplit[i10]);
        }
        return new Z5(str3, i8, str2, hashSet);
    }

    public static Z5 zzb() {
        return new Z5("", 0, "", Collections.emptySet());
    }
}
