package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class M2 implements InterfaceC3894ot {
    public static final Parcelable.Creator<M2> CREATOR = new K2();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public M2(int i8, String str, String str2, String str3, boolean z8, int i9) {
        boolean z9 = true;
        if (i9 != -1 && i9 <= 0) {
            z9 = false;
        }
        F10.zzd(z9);
        this.zza = i8;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z8;
        this.zzf = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M2.class == obj.getClass()) {
            M2 m22 = (M2) obj;
            if (this.zza == m22.zza && AbstractC2281am0.zzG(this.zzb, m22.zzb) && AbstractC2281am0.zzG(this.zzc, m22.zzc) && AbstractC2281am0.zzG(this.zzd, m22.zzd) && this.zze == m22.zze && this.zzf == m22.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i8 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i9 = ((i8 + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i9 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i9 = AbstractC2281am0.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final void zza(C3207ir c3207ir) {
        String str = this.zzc;
        if (str != null) {
            c3207ir.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            c3207ir.zzi(str2);
        }
    }

    M2(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
