package G2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import g2.n;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends AbstractC5814a implements n {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f1469a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1470b;

    public h(List<String> list, String str) {
        this.f1469a = list;
        this.f1470b = str;
    }

    @Override // g2.n
    public final Status getStatus() {
        return this.f1470b != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeStringList(parcel, 1, this.f1469a, false);
        AbstractC5816c.writeString(parcel, 2, this.f1470b, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
