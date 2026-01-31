package H1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class h2 extends AbstractC5814a {
    public static final Parcelable.Creator<h2> CREATOR = new i2();
    public final String zza;
    public long zzb;
    public C0534f1 zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public h2(String str, long j8, C0534f1 c0534f1, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j8;
        this.zzc = c0534f1;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeLong(parcel, 2, this.zzb);
        AbstractC5816c.writeParcelable(parcel, 3, this.zzc, i8, false);
        AbstractC5816c.writeBundle(parcel, 4, this.zzd, false);
        AbstractC5816c.writeString(parcel, 5, this.zze, false);
        AbstractC5816c.writeString(parcel, 6, this.zzf, false);
        AbstractC5816c.writeString(parcel, 7, this.zzg, false);
        AbstractC5816c.writeString(parcel, 8, this.zzh, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
