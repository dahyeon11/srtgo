package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3538lm extends AbstractBinderC1623Mc implements InterfaceC3652mm {
    public AbstractBinderC3538lm() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC3994pm c3766nm;
        if (i8 == 3) {
            H1.V0 v0Zzb = zzb();
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, v0Zzb);
            return true;
        }
        if (i8 == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i8 == 5) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c3766nm = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c3766nm = iInterfaceQueryLocalInterface instanceof InterfaceC3994pm ? (InterfaceC3994pm) iInterfaceQueryLocalInterface : new C3766nm(strongBinder);
            }
            AbstractC1664Nc.zzc(parcel);
            zzf(interfaceC6172aAsInterface, c3766nm);
            parcel2.writeNoException();
            return true;
        }
        if (i8 == 6) {
            InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zze(interfaceC6172aAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i8 != 7) {
            return false;
        }
        InterfaceC2168Zi interfaceC2168ZiZzc = zzc();
        parcel2.writeNoException();
        AbstractC1664Nc.zzf(parcel2, interfaceC2168ZiZzc);
        return true;
    }

    public abstract /* synthetic */ H1.V0 zzb();

    public abstract /* synthetic */ InterfaceC2168Zi zzc();

    public abstract /* synthetic */ void zzd();

    public abstract /* synthetic */ void zze(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzf(InterfaceC6172a interfaceC6172a, InterfaceC3994pm interfaceC3994pm);
}
