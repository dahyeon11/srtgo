package H1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class O1 extends AbstractC5814a {
    public static final Parcelable.Creator<O1> CREATOR = new P1();
    public final String zza;

    public O1(W1.b bVar) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 15, str, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    O1(String str) {
        this.zza = str;
    }
}
