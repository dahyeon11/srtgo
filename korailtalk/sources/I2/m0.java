package i2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f2.C5394d;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class m0 extends AbstractC5814a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f31830a;

    /* renamed from: b, reason: collision with root package name */
    C5394d[] f31831b;

    /* renamed from: c, reason: collision with root package name */
    int f31832c;

    /* renamed from: d, reason: collision with root package name */
    C5672e f31833d;

    m0(Bundle bundle, C5394d[] c5394dArr, int i8, C5672e c5672e) {
        this.f31830a = bundle;
        this.f31831b = c5394dArr;
        this.f31832c = i8;
        this.f31833d = c5672e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBundle(parcel, 1, this.f31830a, false);
        AbstractC5816c.writeTypedArray(parcel, 2, this.f31831b, i8, false);
        AbstractC5816c.writeInt(parcel, 3, this.f31832c);
        AbstractC5816c.writeParcelable(parcel, 4, this.f31833d, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public m0() {
    }
}
