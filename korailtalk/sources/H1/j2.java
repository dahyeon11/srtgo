package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class j2 extends AbstractC5814a {
    public static final Parcelable.Creator<j2> CREATOR = new k2();
    public final int zza;

    public j2(int i8) {
        this.zza = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 2, i9);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
