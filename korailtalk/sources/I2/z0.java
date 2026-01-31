package i2;

import android.os.IBinder;
import android.os.Parcel;
import r2.InterfaceC6172a;
import z2.AbstractC6618a;

/* loaded from: classes.dex */
public final class z0 extends AbstractC6618a implements InterfaceC5664X {
    z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // i2.InterfaceC5664X
    public final int zzc() {
        Parcel parcelA = a(2, b());
        int i8 = parcelA.readInt();
        parcelA.recycle();
        return i8;
    }

    @Override // i2.InterfaceC5664X
    public final InterfaceC6172a zzd() {
        Parcel parcelA = a(1, b());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcelA.readStrongBinder());
        parcelA.recycle();
        return interfaceC6172aAsInterface;
    }
}
