package i2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: i2.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5665Y extends z2.m implements InterfaceC5678k {
    public AbstractBinderC5665Y() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // z2.m
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) z2.n.zza(parcel, Bundle.CREATOR);
            z2.n.zzb(parcel);
            onPostInitComplete(i10, strongBinder, bundle);
        } else if (i8 == 2) {
            int i11 = parcel.readInt();
            Bundle bundle2 = (Bundle) z2.n.zza(parcel, Bundle.CREATOR);
            z2.n.zzb(parcel);
            zzb(i11, bundle2);
        } else {
            if (i8 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            m0 m0Var = (m0) z2.n.zza(parcel, m0.CREATOR);
            z2.n.zzb(parcel);
            zzc(i12, strongBinder2, m0Var);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // i2.InterfaceC5678k
    public abstract /* synthetic */ void onPostInitComplete(int i8, IBinder iBinder, Bundle bundle);

    @Override // i2.InterfaceC5678k
    public abstract /* synthetic */ void zzb(int i8, Bundle bundle);

    @Override // i2.InterfaceC5678k
    public abstract /* synthetic */ void zzc(int i8, IBinder iBinder, m0 m0Var);
}
