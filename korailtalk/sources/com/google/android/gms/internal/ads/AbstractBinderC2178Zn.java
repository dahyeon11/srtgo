package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2178Zn extends AbstractBinderC1623Mc implements InterfaceC2284ao {
    public AbstractBinderC2178Zn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static InterfaceC2284ao zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2284ao ? (InterfaceC2284ao) iInterfaceQueryLocalInterface : new C2137Yn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aZze = zze();
            parcel2.writeNoException();
            AbstractC1664Nc.zzf(parcel2, interfaceC6172aZze);
        } else {
            if (i8 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i10 = AbstractC1664Nc.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2284ao
    public abstract /* synthetic */ InterfaceC6172a zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC2284ao
    public abstract /* synthetic */ boolean zzf();
}
