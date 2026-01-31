package X1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class d extends AbstractC5814a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    private final String f5417a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5418b;

    public d(String str, String str2) {
        this.f5417a = str;
        this.f5418b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, this.f5417a, false);
        AbstractC5816c.writeString(parcel, 2, this.f5418b, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
