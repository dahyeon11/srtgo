package G2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import g2.n;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes2.dex */
public final class b extends AbstractC5814a implements n {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f1466a;

    /* renamed from: b, reason: collision with root package name */
    private int f1467b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f1468c;

    public b() {
        this(2, 0, null);
    }

    @Override // g2.n
    public final Status getStatus() {
        return this.f1467b == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f1466a);
        AbstractC5816c.writeInt(parcel, 2, this.f1467b);
        AbstractC5816c.writeParcelable(parcel, 3, this.f1468c, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    b(int i8, int i9, Intent intent) {
        this.f1466a = i8;
        this.f1467b = i9;
        this.f1468c = intent;
    }
}
