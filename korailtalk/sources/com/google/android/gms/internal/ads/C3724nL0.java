package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.nL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3724nL0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f21238b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f21239c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f21240d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f21241e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f21242f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f21243g;
    public static final C3724nL0 zza;
    public static final C3724nL0 zzb;

    @Deprecated
    public static final RG0 zzc;

    /* renamed from: a, reason: collision with root package name */
    private int f21244a;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    public final int zzh;
    public final int zzi;

    static {
        C2693eK0 c2693eK0 = new C2693eK0();
        c2693eK0.zzc(1);
        c2693eK0.zzb(2);
        c2693eK0.zzd(3);
        zza = c2693eK0.zzg();
        C2693eK0 c2693eK02 = new C2693eK0();
        c2693eK02.zzc(1);
        c2693eK02.zzb(1);
        c2693eK02.zzd(2);
        zzb = c2693eK02.zzg();
        f21238b = Integer.toString(0, 36);
        f21239c = Integer.toString(1, 36);
        f21240d = Integer.toString(2, 36);
        f21241e = Integer.toString(3, 36);
        f21242f = Integer.toString(4, 36);
        f21243g = Integer.toString(5, 36);
        zzc = new RG0() { // from class: com.google.android.gms.internal.ads.TH0
        };
    }

    /* synthetic */ C3724nL0(int i8, int i9, int i10, byte[] bArr, int i11, int i12, NK0 nk0) {
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = bArr;
        this.zzh = i11;
        this.zzi = i12;
    }

    private static String a(int i8) {
        if (i8 == -1) {
            return "Unset color range";
        }
        if (i8 == 1) {
            return "Full range";
        }
        if (i8 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i8;
    }

    private static String b(int i8) {
        if (i8 == -1) {
            return "Unset color space";
        }
        if (i8 == 6) {
            return "BT2020";
        }
        if (i8 == 1) {
            return "BT709";
        }
        if (i8 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i8;
    }

    private static String c(int i8) {
        if (i8 == -1) {
            return "Unset color transfer";
        }
        if (i8 == 10) {
            return "Gamma 2.2";
        }
        if (i8 == 1) {
            return "Linear";
        }
        if (i8 == 2) {
            return "sRGB";
        }
        if (i8 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i8 == 6) {
            return "ST2084 PQ";
        }
        if (i8 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i8;
    }

    public static int zza(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 != 9) {
            return (i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i8) {
        if (i8 == 1) {
            return 3;
        }
        if (i8 == 4) {
            return 10;
        }
        if (i8 == 13) {
            return 2;
        }
        if (i8 == 16) {
            return 6;
        }
        if (i8 != 18) {
            return (i8 == 6 || i8 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(C3724nL0 c3724nL0) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (c3724nL0 == null) {
            return true;
        }
        int i12 = c3724nL0.zzd;
        return (i12 == -1 || i12 == 1 || i12 == 2) && ((i8 = c3724nL0.zze) == -1 || i8 == 2) && (((i9 = c3724nL0.zzf) == -1 || i9 == 3) && c3724nL0.zzg == null && (((i10 = c3724nL0.zzi) == -1 || i10 == 8) && ((i11 = c3724nL0.zzh) == -1 || i11 == 8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3724nL0.class == obj.getClass()) {
            C3724nL0 c3724nL0 = (C3724nL0) obj;
            if (this.zzd == c3724nL0.zzd && this.zze == c3724nL0.zze && this.zzf == c3724nL0.zzf && Arrays.equals(this.zzg, c3724nL0.zzg) && this.zzh == c3724nL0.zzh && this.zzi == c3724nL0.zzi) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f21244a;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zzf) * 31) + Arrays.hashCode(this.zzg)) * 31) + this.zzh) * 31) + this.zzi;
        this.f21244a = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i8 = this.zzh;
        int i9 = this.zzf;
        int i10 = this.zze;
        String strB = b(this.zzd);
        String strA = a(i10);
        String strC = c(i9);
        String str2 = "NA";
        if (i8 != -1) {
            str = i8 + "bit Luma";
        } else {
            str = "NA";
        }
        int i11 = this.zzi;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return "ColorInfo(" + strB + ", " + strA + ", " + strC + ", " + (this.zzg != null) + ", " + str + ", " + str2 + ")";
    }

    public final C2693eK0 zzc() {
        return new C2693eK0(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            str = String.format(Locale.US, "%s/%s/%s", b(this.zzd), a(this.zze), c(this.zzf));
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzh + "/" + this.zzi;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    public final boolean zze() {
        return (this.zzh == -1 || this.zzi == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzd == -1 || this.zze == -1 || this.zzf == -1) ? false : true;
    }
}
