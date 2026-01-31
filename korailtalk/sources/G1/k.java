package G1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class k extends AbstractC5814a {
    public static final Parcelable.Creator<k> CREATOR = new l();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    k(boolean z8, boolean z9, String str, boolean z10, float f8, int i8, boolean z11, boolean z12, boolean z13) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = f8;
        this.zzf = i8;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 2, z8);
        AbstractC5816c.writeBoolean(parcel, 3, this.zzb);
        AbstractC5816c.writeString(parcel, 4, this.zzc, false);
        AbstractC5816c.writeBoolean(parcel, 5, this.zzd);
        AbstractC5816c.writeFloat(parcel, 6, this.zze);
        AbstractC5816c.writeInt(parcel, 7, this.zzf);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzg);
        AbstractC5816c.writeBoolean(parcel, 9, this.zzh);
        AbstractC5816c.writeBoolean(parcel, 10, this.zzi);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public k(boolean z8, boolean z9, boolean z10, float f8, int i8, boolean z11, boolean z12, boolean z13) {
        this(z8, z9, null, z10, f8, -1, z11, z12, z13);
    }
}
