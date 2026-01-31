package B1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC1965Uj;
import com.google.android.gms.internal.ads.InterfaceC2006Vj;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class a extends AbstractC5814a {
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f190a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f191b;

    a(boolean z8, IBinder iBinder) {
        this.f190a = z8;
        this.f191b = iBinder;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f190a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        AbstractC5816c.writeIBinder(parcel, 2, this.f191b, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final InterfaceC2006Vj zza() {
        IBinder iBinder = this.f191b;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC1965Uj.zzb(iBinder);
    }
}
