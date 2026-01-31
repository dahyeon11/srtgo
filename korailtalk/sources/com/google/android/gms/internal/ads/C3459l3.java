package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3459l3 extends AbstractC2544d3 {
    public static final Parcelable.Creator<C3459l3> CREATOR = new C3345k3();
    public final String zza;

    @Deprecated
    public final String zzb;
    public final AbstractC2394bl0 zzc;

    public C3459l3(String str, String str2, List list) {
        super(str);
        F10.zzd(!list.isEmpty());
        this.zza = str2;
        AbstractC2394bl0 abstractC2394bl0Zzk = AbstractC2394bl0.zzk(list);
        this.zzc = abstractC2394bl0Zzk;
        this.zzb = (String) abstractC2394bl0Zzk.get(0);
    }

    private static List b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3459l3.class == obj.getClass()) {
            C3459l3 c3459l3 = (C3459l3) obj;
            if (AbstractC2281am0.zzG(this.zzf, c3459l3.zzf) && AbstractC2281am0.zzG(this.zza, c3459l3.zza) && this.zzc.equals(c3459l3.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    @Override // com.google.android.gms.internal.ads.AbstractC2544d3, com.google.android.gms.internal.ads.InterfaceC3894ot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.C3207ir r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3459l3.zza(com.google.android.gms.internal.ads.ir):void");
    }
}
