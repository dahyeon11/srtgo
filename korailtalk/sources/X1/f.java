package X1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class f extends AbstractC5814a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    private final String f5419a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5420b;

    public f(String str, int i8) {
        this.f5419a = str;
        this.f5420b = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, this.f5419a, false);
        AbstractC5816c.writeInt(parcel, 2, this.f5420b);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f5420b;
    }

    public final String zzb() {
        return this.f5419a;
    }
}
