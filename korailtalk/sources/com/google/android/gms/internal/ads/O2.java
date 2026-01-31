package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class O2 extends AbstractC2544d3 {
    public static final Parcelable.Creator<O2> CREATOR = new N2();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    O2(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O2.class == obj.getClass()) {
            O2 o22 = (O2) obj;
            if (this.zzc == o22.zzc && AbstractC2281am0.zzG(this.zza, o22.zza) && AbstractC2281am0.zzG(this.zzb, o22.zzb) && Arrays.equals(this.zzd, o22.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i8 = this.zzc;
        String str2 = this.zzb;
        return ((((((i8 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3, com.google.android.gms.internal.ads.InterfaceC3894ot
    public final void zza(C3207ir c3207ir) {
        c3207ir.zza(this.zzd, this.zzc);
    }

    public O2(String str, String str2, int i8, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i8;
        this.zzd = bArr;
    }
}
