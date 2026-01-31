package G2;

import android.os.Parcel;
import android.os.Parcelable;
import f2.C5392b;
import i2.C5661U;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes2.dex */
public final class l extends AbstractC5814a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f1473a;

    /* renamed from: b, reason: collision with root package name */
    private final C5392b f1474b;

    /* renamed from: c, reason: collision with root package name */
    private final C5661U f1475c;

    l(int i8, C5392b c5392b, C5661U c5661u) {
        this.f1473a = i8;
        this.f1474b = c5392b;
        this.f1475c = c5661u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f1473a);
        AbstractC5816c.writeParcelable(parcel, 2, this.f1474b, i8, false);
        AbstractC5816c.writeParcelable(parcel, 3, this.f1475c, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C5392b zaa() {
        return this.f1474b;
    }

    public final C5661U zab() {
        return this.f1475c;
    }
}
