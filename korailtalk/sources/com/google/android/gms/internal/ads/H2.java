package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class H2 implements InterfaceC3894ot {
    public static final Parcelable.Creator<H2> CREATOR = new G2();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public H2(int i8, String str, String str2, int i9, int i10, int i11, int i12, byte[] bArr) {
        this.zza = i8;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = bArr;
    }

    public static H2 zzb(C4099qh0 c4099qh0) {
        int iZzg = c4099qh0.zzg();
        String strZze = AbstractC4239rv.zze(c4099qh0.zzA(c4099qh0.zzg(), AbstractC3647mj0.zza));
        String strZzA = c4099qh0.zzA(c4099qh0.zzg(), AbstractC3647mj0.zzc);
        int iZzg2 = c4099qh0.zzg();
        int iZzg3 = c4099qh0.zzg();
        int iZzg4 = c4099qh0.zzg();
        int iZzg5 = c4099qh0.zzg();
        int iZzg6 = c4099qh0.zzg();
        byte[] bArr = new byte[iZzg6];
        c4099qh0.zzG(bArr, 0, iZzg6);
        return new H2(iZzg, strZze, strZzA, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H2.class == obj.getClass()) {
            H2 h22 = (H2) obj;
            if (this.zza == h22.zza && this.zzb.equals(h22.zzb) && this.zzc.equals(h22.zzc) && this.zzd == h22.zzd && this.zze == h22.zze && this.zzf == h22.zzf && this.zzg == h22.zzg && Arrays.equals(this.zzh, h22.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final void zza(C3207ir c3207ir) {
        c3207ir.zza(this.zzh, this.zza);
    }

    H2(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
