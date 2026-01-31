package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2389bj extends AbstractBinderC1623Mc implements InterfaceC2503cj {
    public AbstractBinderC2389bj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static InterfaceC2503cj zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2503cj ? (InterfaceC2503cj) iInterfaceQueryLocalInterface : new C2274aj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aZzf = zzf();
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, interfaceC6172aZzf);
        } else if (i8 == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            AbstractC1664Nc.zze(parcel2, uriZze);
        } else if (i8 == 3) {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        } else if (i8 == 4) {
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            if (i8 != 5) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }

    public abstract /* synthetic */ double zzb();

    public abstract /* synthetic */ int zzc();

    public abstract /* synthetic */ int zzd();

    public abstract /* synthetic */ Uri zze();

    public abstract /* synthetic */ InterfaceC6172a zzf();
}
