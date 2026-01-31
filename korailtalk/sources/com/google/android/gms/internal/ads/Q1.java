package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Q1 {
    public static int zza(int i8) {
        int i9 = 0;
        while (i8 > 0) {
            i8 >>>= 1;
            i9++;
        }
        return i9;
    }

    public static C1735Ot zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = (String) list.get(i8);
            int i9 = AbstractC2281am0.zza;
            String[] strArrSplit = str.split(SimpleComparison.EQUAL_TO_OPERATION, 2);
            if (strArrSplit.length != 2) {
                AbstractC2834fc0.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(H2.zzb(new C4099qh0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e8) {
                    AbstractC2834fc0.zzg("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new B3(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1735Ot(arrayList);
    }

    public static N1 zzc(C4099qh0 c4099qh0, boolean z8, boolean z9) throws C1901Sv {
        if (z8) {
            zzd(3, c4099qh0, false);
        }
        String strZzA = c4099qh0.zzA((int) c4099qh0.zzs(), AbstractC3647mj0.zzc);
        int length = strZzA.length();
        long jZzs = c4099qh0.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i8 = 0; i8 < jZzs; i8++) {
            String strZzA2 = c4099qh0.zzA((int) c4099qh0.zzs(), AbstractC3647mj0.zzc);
            strArr[i8] = strZzA2;
            length2 = length2 + 4 + strZzA2.length();
        }
        if (z9 && (c4099qh0.zzm() & 1) == 0) {
            throw C1901Sv.zza("framing bit expected to be set", null);
        }
        return new N1(strZzA, strArr, length2 + 1);
    }

    public static boolean zzd(int i8, C4099qh0 c4099qh0, boolean z8) throws C1901Sv {
        if (c4099qh0.zzb() < 7) {
            if (z8) {
                return false;
            }
            throw C1901Sv.zza("too short header: " + c4099qh0.zzb(), null);
        }
        if (c4099qh0.zzm() != i8) {
            if (z8) {
                return false;
            }
            throw C1901Sv.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i8))), null);
        }
        if (c4099qh0.zzm() == 118 && c4099qh0.zzm() == 111 && c4099qh0.zzm() == 114 && c4099qh0.zzm() == 98 && c4099qh0.zzm() == 105 && c4099qh0.zzm() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw C1901Sv.zza("expected characters 'vorbis'", null);
    }
}
