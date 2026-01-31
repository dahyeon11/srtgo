package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1525Jo extends AbstractBinderC1623Mc implements InterfaceC1566Ko {
    public AbstractBinderC1525Jo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC3087ho interfaceC3087hoZzb = AbstractBinderC2972go.zzb(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzg(interfaceC3087hoZzb);
        } else if (i8 == 2) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        } else {
            if (i8 != 3) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public abstract /* synthetic */ void zze(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public abstract /* synthetic */ void zzf(C0534f1 c0534f1);

    @Override // com.google.android.gms.internal.ads.InterfaceC1566Ko
    public abstract /* synthetic */ void zzg(InterfaceC3087ho interfaceC3087ho);
}
