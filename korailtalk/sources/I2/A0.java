package i2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public abstract class A0 extends z2.m implements InterfaceC5664X {
    public A0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static InterfaceC5664X zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5664X ? (InterfaceC5664X) iInterfaceQueryLocalInterface : new z0(iBinder);
    }

    @Override // z2.m
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aZzd = zzd();
            parcel2.writeNoException();
            z2.n.zze(parcel2, interfaceC6172aZzd);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }

    public abstract /* synthetic */ int zzc();

    public abstract /* synthetic */ InterfaceC6172a zzd();
}
