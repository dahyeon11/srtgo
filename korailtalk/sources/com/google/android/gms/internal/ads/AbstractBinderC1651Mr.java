package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1651Mr extends AbstractBinderC1623Mc implements InterfaceC1692Nr {
    public AbstractBinderC1651Mr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1406Gr c1324Er;
        switch (i8) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1324Er = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c1324Er = iInterfaceQueryLocalInterface instanceof InterfaceC1406Gr ? (InterfaceC1406Gr) iInterfaceQueryLocalInterface : new C1324Er(strongBinder);
                }
                AbstractC1664Nc.zzc(parcel);
                zzk(c1324Er);
                break;
            case 4:
                int i10 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zzh(i10);
                break;
            case 5:
                C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzi(c0534f1);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf();

    public abstract /* synthetic */ void zzg();

    public abstract /* synthetic */ void zzh(int i8);

    public abstract /* synthetic */ void zzi(C0534f1 c0534f1);

    public abstract /* synthetic */ void zzj();

    public abstract /* synthetic */ void zzk(InterfaceC1406Gr interfaceC1406Gr);
}
