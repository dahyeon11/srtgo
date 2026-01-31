package com.google.android.gms.internal.ads;

import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1593Lh extends AbstractBinderC1623Mc implements InterfaceC1633Mh {
    public AbstractBinderC1593Lh() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i8 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i8 == 3) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzd(interfaceC6172aAsInterface);
            parcel2.writeNoException();
        } else if (i8 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i8 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }

    public abstract /* synthetic */ String zzb();

    public abstract /* synthetic */ String zzc();

    public abstract /* synthetic */ void zzd(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf();
}
