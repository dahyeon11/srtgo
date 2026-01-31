package G2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.C5659S;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes2.dex */
public final class j extends AbstractC5814a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f1471a;

    /* renamed from: b, reason: collision with root package name */
    final C5659S f1472b;

    j(int i8, C5659S c5659s) {
        this.f1471a = i8;
        this.f1472b = c5659s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f1471a);
        AbstractC5816c.writeParcelable(parcel, 2, this.f1472b, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
