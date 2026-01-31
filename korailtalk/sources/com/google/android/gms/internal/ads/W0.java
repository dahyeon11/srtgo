package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class W0 {
    public final String zza;

    private W0(int i8, int i9, String str) {
        this.zza = str;
    }

    public static W0 zza(C4099qh0 c4099qh0) {
        String str;
        c4099qh0.zzL(2);
        int iZzm = c4099qh0.zzm();
        int i8 = iZzm >> 1;
        int i9 = iZzm & 1;
        int iZzm2 = c4099qh0.zzm() >> 3;
        if (i8 == 4 || i8 == 5 || i8 == 7) {
            str = "dvhe";
        } else if (i8 == 8) {
            str = "hev1";
        } else {
            if (i8 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i10 = iZzm2 | (i9 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i8);
        sb.append(i10 >= 10 ? "." : ".0");
        sb.append(i10);
        return new W0(i8, i10, sb.toString());
    }
}
