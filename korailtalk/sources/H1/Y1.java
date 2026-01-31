package H1;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC5681n;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Y1 extends AbstractC5814a {
    public static final Parcelable.Creator<Y1> CREATOR = new a2();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final O1 zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;
    public final C0527d0 zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public Y1(int i8, long j8, Bundle bundle, int i9, List list, boolean z8, int i10, boolean z9, String str, O1 o12, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z10, C0527d0 c0527d0, int i11, String str5, List list3, int i12, String str6, int i13, long j9) {
        this.zza = i8;
        this.zzb = j8;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i9;
        this.zze = list;
        this.zzf = z8;
        this.zzg = i10;
        this.zzh = z9;
        this.zzi = str;
        this.zzj = o12;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z10;
        this.zzs = c0527d0;
        this.zzt = i11;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i12;
        this.zzx = str6;
        this.zzy = i13;
        this.zzz = j9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return this.zza == y12.zza && this.zzb == y12.zzb && L1.o.zza(this.zzc, y12.zzc) && this.zzd == y12.zzd && AbstractC5681n.equal(this.zze, y12.zze) && this.zzf == y12.zzf && this.zzg == y12.zzg && this.zzh == y12.zzh && AbstractC5681n.equal(this.zzi, y12.zzi) && AbstractC5681n.equal(this.zzj, y12.zzj) && AbstractC5681n.equal(this.zzk, y12.zzk) && AbstractC5681n.equal(this.zzl, y12.zzl) && L1.o.zza(this.zzm, y12.zzm) && L1.o.zza(this.zzn, y12.zzn) && AbstractC5681n.equal(this.zzo, y12.zzo) && AbstractC5681n.equal(this.zzp, y12.zzp) && AbstractC5681n.equal(this.zzq, y12.zzq) && this.zzr == y12.zzr && this.zzt == y12.zzt && AbstractC5681n.equal(this.zzu, y12.zzu) && AbstractC5681n.equal(this.zzv, y12.zzv) && this.zzw == y12.zzw && AbstractC5681n.equal(this.zzx, y12.zzx) && this.zzy == y12.zzy && this.zzz == y12.zzz;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeLong(parcel, 2, this.zzb);
        AbstractC5816c.writeBundle(parcel, 3, this.zzc, false);
        AbstractC5816c.writeInt(parcel, 4, this.zzd);
        AbstractC5816c.writeStringList(parcel, 5, this.zze, false);
        AbstractC5816c.writeBoolean(parcel, 6, this.zzf);
        AbstractC5816c.writeInt(parcel, 7, this.zzg);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzh);
        AbstractC5816c.writeString(parcel, 9, this.zzi, false);
        AbstractC5816c.writeParcelable(parcel, 10, this.zzj, i8, false);
        AbstractC5816c.writeParcelable(parcel, 11, this.zzk, i8, false);
        AbstractC5816c.writeString(parcel, 12, this.zzl, false);
        AbstractC5816c.writeBundle(parcel, 13, this.zzm, false);
        AbstractC5816c.writeBundle(parcel, 14, this.zzn, false);
        AbstractC5816c.writeStringList(parcel, 15, this.zzo, false);
        AbstractC5816c.writeString(parcel, 16, this.zzp, false);
        AbstractC5816c.writeString(parcel, 17, this.zzq, false);
        AbstractC5816c.writeBoolean(parcel, 18, this.zzr);
        AbstractC5816c.writeParcelable(parcel, 19, this.zzs, i8, false);
        AbstractC5816c.writeInt(parcel, 20, this.zzt);
        AbstractC5816c.writeString(parcel, 21, this.zzu, false);
        AbstractC5816c.writeStringList(parcel, 22, this.zzv, false);
        AbstractC5816c.writeInt(parcel, 23, this.zzw);
        AbstractC5816c.writeString(parcel, 24, this.zzx, false);
        AbstractC5816c.writeInt(parcel, 25, this.zzy);
        AbstractC5816c.writeLong(parcel, 26, this.zzz);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
