package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3801o3 extends AbstractC2544d3 {
    public static final Parcelable.Creator<C3801o3> CREATOR = new C3687n3();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    C3801o3(Parcel parcel) {
        String string = parcel.readString();
        int i8 = AbstractC2281am0.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3801o3.class == obj.getClass()) {
            C3801o3 c3801o3 = (C3801o3) obj;
            if (this.zzf.equals(c3801o3.zzf) && AbstractC2281am0.zzG(this.zza, c3801o3.zza) && AbstractC2281am0.zzG(this.zzb, c3801o3.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i8 = iHashCode * 31;
        String str2 = this.zzb;
        return ((i8 + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public C3801o3(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
