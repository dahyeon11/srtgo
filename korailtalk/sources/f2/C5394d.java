package f2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC5681n;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5394d extends AbstractC5814a {
    public static final Parcelable.Creator<C5394d> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    private final String f30566a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30567b;

    /* renamed from: c, reason: collision with root package name */
    private final long f30568c;

    public C5394d(String str, int i8, long j8) {
        this.f30566a = str;
        this.f30567b = i8;
        this.f30568c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5394d) {
            C5394d c5394d = (C5394d) obj;
            if (((getName() != null && getName().equals(c5394d.getName())) || (getName() == null && c5394d.getName() == null)) && getVersion() == c5394d.getVersion()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f30566a;
    }

    public long getVersion() {
        long j8 = this.f30568c;
        return j8 == -1 ? this.f30567b : j8;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(getName(), Long.valueOf(getVersion()));
    }

    public final String toString() {
        AbstractC5681n.a stringHelper = AbstractC5681n.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, getName(), false);
        AbstractC5816c.writeInt(parcel, 2, this.f30567b);
        AbstractC5816c.writeLong(parcel, 3, getVersion());
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5394d(String str, long j8) {
        this.f30566a = str;
        this.f30568c = j8;
        this.f30567b = -1;
    }
}
