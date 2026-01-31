package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TH {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16431c = Integer.toString(0, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f16432d = Integer.toString(1, 36);

    @Deprecated
    public static final RG0 zza = new RG0() { // from class: com.google.android.gms.internal.ads.sH
    };

    /* renamed from: a, reason: collision with root package name */
    private final Q5[] f16433a;

    /* renamed from: b, reason: collision with root package name */
    private int f16434b;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public TH(String str, Q5... q5Arr) {
        int length = q5Arr.length;
        int i8 = 1;
        F10.zzd(length > 0);
        this.zzc = str;
        this.f16433a = q5Arr;
        this.zzb = length;
        int iZzb = AbstractC4239rv.zzb(q5Arr[0].zzn);
        this.zzd = iZzb == -1 ? AbstractC4239rv.zzb(q5Arr[0].zzm) : iZzb;
        String strA = a(q5Arr[0].zze);
        int i9 = q5Arr[0].zzg | 16384;
        while (true) {
            Q5[] q5Arr2 = this.f16433a;
            if (i8 >= q5Arr2.length) {
                return;
            }
            if (!strA.equals(a(q5Arr2[i8].zze))) {
                Q5[] q5Arr3 = this.f16433a;
                b("languages", q5Arr3[0].zze, q5Arr3[i8].zze, i8);
                return;
            } else {
                Q5[] q5Arr4 = this.f16433a;
                if (i9 != (q5Arr4[i8].zzg | 16384)) {
                    b("role flags", Integer.toBinaryString(q5Arr4[0].zzg), Integer.toBinaryString(this.f16433a[i8].zzg), i8);
                    return;
                }
                i8++;
            }
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void b(String str, String str2, String str3, int i8) {
        AbstractC2834fc0.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i8 + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TH.class == obj.getClass()) {
            TH th = (TH) obj;
            if (this.zzc.equals(th.zzc) && Arrays.equals(this.f16433a, th.f16433a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f16434b;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.f16433a);
        this.f16434b = iHashCode;
        return iHashCode;
    }

    public final int zza(Q5 q52) {
        int i8 = 0;
        while (true) {
            Q5[] q5Arr = this.f16433a;
            if (i8 >= q5Arr.length) {
                return -1;
            }
            if (q52 == q5Arr[i8]) {
                return i8;
            }
            i8++;
        }
    }

    public final Q5 zzb(int i8) {
        return this.f16433a[i8];
    }
}
