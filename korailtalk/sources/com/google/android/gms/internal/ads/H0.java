package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class H0 implements Parcelable {
    public static final Parcelable.Creator<H0> CREATOR = new C2882g0();

    /* renamed from: a, reason: collision with root package name */
    private int f13225a;
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    H0(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        H0 h02 = (H0) obj;
        return AbstractC2281am0.zzG(this.zzb, h02.zzb) && AbstractC2281am0.zzG(this.zzc, h02.zzc) && AbstractC2281am0.zzG(this.zza, h02.zza) && Arrays.equals(this.zzd, h02.zzd);
    }

    public final int hashCode() {
        int i8 = this.f13225a;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
        this.f13225a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public H0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = AbstractC4239rv.zze(str2);
        this.zzd = bArr;
    }
}
