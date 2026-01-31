package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* loaded from: classes2.dex */
final class E5 {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private E5(String str, int i8, Integer num, Integer num2, float f8, boolean z8, boolean z9, boolean z10, boolean z11, int i9) {
        this.zza = str;
        this.zzb = i8;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f8;
        this.zzf = z8;
        this.zzg = z9;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str) throws NumberFormatException {
        int i8;
        try {
            i8 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i8) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i8;
            default:
                AbstractC2834fc0.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean c(String str) throws NumberFormatException {
        try {
            int i8 = Integer.parseInt(str);
            return i8 == 1 || i8 == -1;
        } catch (NumberFormatException e8) {
            AbstractC2834fc0.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        if (r4 != 3) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.E5 zzb(java.lang.String r19, com.google.android.gms.internal.ads.C5 r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E5.zzb(java.lang.String, com.google.android.gms.internal.ads.C5):com.google.android.gms.internal.ads.E5");
    }

    public static Integer zzc(String str) {
        try {
            long j8 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            F10.zzd(j8 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1235Cm0.zzb(((j8 >> 24) & 255) ^ 255), AbstractC1235Cm0.zzb(j8 & 255), AbstractC1235Cm0.zzb((j8 >> 8) & 255), AbstractC1235Cm0.zzb((j8 >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            AbstractC2834fc0.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }
}
