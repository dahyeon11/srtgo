package B1;

import H1.AbstractBinderC0530e0;
import H1.InterfaceC0533f0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC1965Uj;
import com.google.android.gms.internal.ads.InterfaceC2006Vj;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class g extends AbstractC5814a {
    public static final Parcelable.Creator<g> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f208a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0533f0 f209b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f210c;

    g(boolean z8, IBinder iBinder, IBinder iBinder2) {
        this.f208a = z8;
        this.f209b = iBinder != null ? AbstractBinderC0530e0.zzd(iBinder) : null;
        this.f210c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, this.f208a);
        InterfaceC0533f0 interfaceC0533f0 = this.f209b;
        AbstractC5816c.writeIBinder(parcel, 2, interfaceC0533f0 == null ? null : interfaceC0533f0.asBinder(), false);
        AbstractC5816c.writeIBinder(parcel, 3, this.f210c, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final InterfaceC0533f0 zza() {
        return this.f209b;
    }

    public final InterfaceC2006Vj zzb() {
        IBinder iBinder = this.f210c;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC1965Uj.zzb(iBinder);
    }

    public final boolean zzc() {
        return this.f208a;
    }
}
