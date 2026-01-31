package B2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: B2.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0460t extends AbstractC5814a {
    public static final Parcelable.Creator<C0460t> CREATOR = new C0461u();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public C0460t(long j8, long j9, boolean z8, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j8;
        this.zzb = j9;
        this.zzc = z8;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeLong(parcel, 1, this.zza);
        AbstractC5816c.writeLong(parcel, 2, this.zzb);
        AbstractC5816c.writeBoolean(parcel, 3, this.zzc);
        AbstractC5816c.writeString(parcel, 4, this.zzd, false);
        AbstractC5816c.writeString(parcel, 5, this.zze, false);
        AbstractC5816c.writeString(parcel, 6, this.zzf, false);
        AbstractC5816c.writeBundle(parcel, 7, this.zzg, false);
        AbstractC5816c.writeString(parcel, 8, this.zzh, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
