package H1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: H1.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575t1 extends AbstractC5814a {
    public static final Parcelable.Creator<C0575t1> CREATOR = new C0578u1();

    /* renamed from: a, reason: collision with root package name */
    private final int f1747a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1748b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1749c;

    public C0575t1() {
        this(ModuleDescriptor.MODULE_VERSION, 241806000, "23.2.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f1747a);
        AbstractC5816c.writeInt(parcel, 2, this.f1748b);
        AbstractC5816c.writeString(parcel, 3, this.f1749c, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f1748b;
    }

    public final String zzb() {
        return this.f1749c;
    }

    public C0575t1(int i8, int i9, String str) {
        this.f1747a = i8;
        this.f1748b = i9;
        this.f1749c = str;
    }
}
