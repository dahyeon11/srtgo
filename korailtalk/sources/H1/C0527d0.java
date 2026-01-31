package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: H1.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527d0 extends AbstractC5814a {
    public static final Parcelable.Creator<C0527d0> CREATOR = new E0();
    public final String zza;
    public final String zzb;

    public C0527d0(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
