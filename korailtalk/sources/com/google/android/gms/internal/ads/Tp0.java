package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Tp0 implements InterfaceC3894ot {
    public static final Parcelable.Creator<Tp0> CREATOR = new C1853Ro0();
    public final float zza;
    public final float zzb;

    public Tp0(float f8, float f9) {
        boolean z8 = false;
        if (f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z8 = true;
        }
        F10.zze(z8, "Invalid latitude or longitude");
        this.zza = f8;
        this.zzb = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Tp0.class == obj.getClass()) {
            Tp0 tp0 = (Tp0) obj;
            if (this.zza == tp0.zza && this.zzb == tp0.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    /* synthetic */ Tp0(Parcel parcel, AbstractC4342sp0 abstractC4342sp0) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
