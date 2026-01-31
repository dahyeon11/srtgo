package J1;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class j extends AbstractC5814a {
    public static final Parcelable.Creator<j> CREATOR = new i();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final F zzi;
    public final boolean zzj;

    public j(Intent intent, F f8) {
        this(null, null, null, null, null, null, null, intent, r2.b.wrap(f8).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, str, false);
        AbstractC5816c.writeString(parcel, 3, this.zzb, false);
        AbstractC5816c.writeString(parcel, 4, this.zzc, false);
        AbstractC5816c.writeString(parcel, 5, this.zzd, false);
        AbstractC5816c.writeString(parcel, 6, this.zze, false);
        AbstractC5816c.writeString(parcel, 7, this.zzf, false);
        AbstractC5816c.writeString(parcel, 8, this.zzg, false);
        AbstractC5816c.writeParcelable(parcel, 9, this.zzh, i8, false);
        AbstractC5816c.writeIBinder(parcel, 10, r2.b.wrap(this.zzi).asBinder(), false);
        AbstractC5816c.writeBoolean(parcel, 11, this.zzj);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (F) r2.b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder));
        this.zzj = z8;
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, F f8) {
        this(str, str2, str3, str4, str5, str6, str7, null, r2.b.wrap(f8).asBinder(), false);
    }
}
