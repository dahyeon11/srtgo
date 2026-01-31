package f2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class I extends AbstractC5814a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30543a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30544b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30545c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30546d;

    I(boolean z8, String str, int i8, int i9) {
        this.f30543a = z8;
        this.f30544b = str;
        this.f30545c = Q.a(i8) - 1;
        this.f30546d = v.a(i9) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, this.f30543a);
        AbstractC5816c.writeString(parcel, 2, this.f30544b, false);
        AbstractC5816c.writeInt(parcel, 3, this.f30545c);
        AbstractC5816c.writeInt(parcel, 4, this.f30546d);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f30544b;
    }

    public final boolean zzb() {
        return this.f30543a;
    }

    public final int zzc() {
        return v.a(this.f30546d);
    }

    public final int zzd() {
        return Q.a(this.f30545c);
    }
}
