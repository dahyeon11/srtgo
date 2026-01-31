package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Yi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2127Yi extends AbstractBinderC1623Mc implements InterfaceC2168Zi {
    public AbstractBinderC2127Yi() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        C1637Mj c1637Mj;
        switch (i8) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzj(interfaceC6172aAsInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC6172a interfaceC6172aZzi = zzi();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                H1.V0 v0Zzh = zzh();
                parcel2.writeNoException();
                AbstractC1664Nc.zzf(parcel2, v0Zzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i10 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1637Mj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c1637Mj = iInterfaceQueryLocalInterface instanceof C1637Mj ? (C1637Mj) iInterfaceQueryLocalInterface : new C1637Mj(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzm(c1637Mj);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i11 = AbstractC1664Nc.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ float zze();

    public abstract /* synthetic */ float zzf();

    public abstract /* synthetic */ float zzg();

    public abstract /* synthetic */ H1.V0 zzh();

    public abstract /* synthetic */ InterfaceC6172a zzi();

    public abstract /* synthetic */ void zzj(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ boolean zzk();

    public abstract /* synthetic */ boolean zzl();

    public abstract /* synthetic */ void zzm(C1637Mj c1637Mj);
}
