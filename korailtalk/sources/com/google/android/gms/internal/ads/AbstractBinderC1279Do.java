package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Do, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1279Do extends AbstractBinderC1623Mc implements InterfaceC1320Eo {
    public AbstractBinderC1279Do() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzg(interfaceC6172aAsInterface);
        } else if (i8 == 2) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        } else if (i8 == 3) {
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(c0534f1);
        } else {
            if (i8 != 4) {
                return false;
            }
            InterfaceC2284ao interfaceC2284aoZzb = AbstractBinderC2178Zn.zzb(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzh(interfaceC2284aoZzb);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public abstract /* synthetic */ void zze(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public abstract /* synthetic */ void zzf(C0534f1 c0534f1);

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public abstract /* synthetic */ void zzg(InterfaceC6172a interfaceC6172a);

    @Override // com.google.android.gms.internal.ads.InterfaceC1320Eo
    public abstract /* synthetic */ void zzh(InterfaceC2284ao interfaceC2284ao);
}
