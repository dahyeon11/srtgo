package I1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class a extends AbstractC5814a {
    public static final Parcelable.Creator<a> CREATOR = new b();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public a(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeString(parcel, 3, this.zzc, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
