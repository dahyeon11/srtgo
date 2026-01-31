package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2974gp extends AbstractC5814a {
    public static final Parcelable.Creator<C2974gp> CREATOR = new C3089hp();
    public final int zza;
    public final int zzb;
    public final int zzc;

    C2974gp(int i8, int i9, int i10) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = i10;
    }

    public static C2974gp zza(y1.z zVar) {
        return new C2974gp(zVar.getMajorVersion(), zVar.getMinorVersion(), zVar.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2974gp)) {
            C2974gp c2974gp = (C2974gp) obj;
            if (c2974gp.zzc == this.zzc && c2974gp.zzb == this.zzb && c2974gp.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.writeInt(parcel, 3, this.zzc);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
