package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5054z3 implements InterfaceC3894ot {
    public static final Parcelable.Creator<C5054z3> CREATOR = new C4826x3();
    public final float zza;
    public final int zzb;

    public C5054z3(float f8, int i8) {
        this.zza = f8;
        this.zzb = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5054z3.class == obj.getClass()) {
            C5054z3 c5054z3 = (C5054z3) obj;
            if (this.zza == c5054z3.zza && this.zzb == c5054z3.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3894ot
    public final /* synthetic */ void zza(C3207ir c3207ir) {
    }

    /* synthetic */ C5054z3(Parcel parcel, AbstractC4940y3 abstractC4940y3) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
