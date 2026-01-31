package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes2.dex */
public final class s extends AbstractC5814a {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    private final Credential f37389a;

    public s(Credential credential) {
        this.f37389a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 1, this.f37389a, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
