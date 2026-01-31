package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
abstract class N5 {
    public static O5 zza(O5 o52, String[] strArr, Map map) {
        int length;
        int i8 = 0;
        if (o52 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (O5) map.get(strArr[0]);
            }
            if (length2 > 1) {
                O5 o53 = new O5();
                while (i8 < length2) {
                    o53.zzl((O5) map.get(strArr[i8]));
                    i8++;
                }
                return o53;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                o52.zzl((O5) map.get(strArr[0]));
                return o52;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i8 < length) {
                    o52.zzl((O5) map.get(strArr[i8]));
                    i8++;
                }
            }
        }
        return o52;
    }
}
