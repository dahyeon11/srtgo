package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3003h3 extends AbstractC2544d3 {
    public static final Parcelable.Creator<C3003h3> CREATOR = new C2888g3();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public C3003h3(int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i8;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2544d3, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3003h3.class == obj.getClass()) {
            C3003h3 c3003h3 = (C3003h3) obj;
            if (this.zza == c3003h3.zza && this.zzb == c3003h3.zzb && this.zzc == c3003h3.zzc && Arrays.equals(this.zzd, c3003h3.zzd) && Arrays.equals(this.zze, c3003h3.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    C3003h3(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i8 = AbstractC2281am0.zza;
        this.zzd = iArrCreateIntArray;
        this.zze = parcel.createIntArray();
    }
}
