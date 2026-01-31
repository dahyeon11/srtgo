package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1569Kq extends AbstractBinderC1623Mc implements InterfaceC1610Lq {
    public AbstractBinderC1569Kq() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2019Vq c1937Tq = null;
        if (i8 == 1) {
            AbstractC1664Nc.zzc(parcel);
            parcel2.writeNoException();
            AbstractC1664Nc.zze(parcel2, null);
        } else if (i8 == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof InterfaceC1650Mq) {
                }
            }
            AbstractC1664Nc.zzc(parcel);
            parcel2.writeNoException();
        } else if (i8 == 4) {
            C2519cr c2519cr = (C2519cr) AbstractC1664Nc.zza(parcel, C2519cr.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c1937Tq = iInterfaceQueryLocalInterface2 instanceof InterfaceC2019Vq ? (InterfaceC2019Vq) iInterfaceQueryLocalInterface2 : new C1937Tq(strongBinder2);
            }
            AbstractC1664Nc.zzc(parcel);
            zzg(c2519cr, c1937Tq);
            parcel2.writeNoException();
        } else if (i8 == 5) {
            C2519cr c2519cr2 = (C2519cr) AbstractC1664Nc.zza(parcel, C2519cr.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c1937Tq = iInterfaceQueryLocalInterface3 instanceof InterfaceC2019Vq ? (InterfaceC2019Vq) iInterfaceQueryLocalInterface3 : new C1937Tq(strongBinder3);
            }
            AbstractC1664Nc.zzc(parcel);
            zzf(c2519cr2, c1937Tq);
            parcel2.writeNoException();
        } else if (i8 == 6) {
            C2519cr c2519cr3 = (C2519cr) AbstractC1664Nc.zza(parcel, C2519cr.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c1937Tq = iInterfaceQueryLocalInterface4 instanceof InterfaceC2019Vq ? (InterfaceC2019Vq) iInterfaceQueryLocalInterface4 : new C1937Tq(strongBinder4);
            }
            AbstractC1664Nc.zzc(parcel);
            zze(c2519cr3, c1937Tq);
            parcel2.writeNoException();
        } else {
            if (i8 != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c1937Tq = iInterfaceQueryLocalInterface5 instanceof InterfaceC2019Vq ? (InterfaceC2019Vq) iInterfaceQueryLocalInterface5 : new C1937Tq(strongBinder5);
            }
            AbstractC1664Nc.zzc(parcel);
            zzh(string, c1937Tq);
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public abstract /* synthetic */ void zze(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq);

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public abstract /* synthetic */ void zzf(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq);

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public abstract /* synthetic */ void zzg(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq);

    @Override // com.google.android.gms.internal.ads.InterfaceC1610Lq
    public abstract /* synthetic */ void zzh(String str, InterfaceC2019Vq interfaceC2019Vq);
}
