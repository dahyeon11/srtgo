package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class M1 extends AbstractC5814a {
    public static final Parcelable.Creator<M1> CREATOR = new N1();
    public final int zza;
    public final int zzb;

    public M1(int i8, int i9) {
        this.zza = i8;
        this.zzb = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public M1(y1.x xVar) {
        this.zza = xVar.getTagForChildDirectedTreatment();
        this.zzb = xVar.getTagForUnderAgeOfConsent();
    }
}
