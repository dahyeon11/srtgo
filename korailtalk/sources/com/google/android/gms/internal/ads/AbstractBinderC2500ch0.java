package com.google.android.gms.internal.ads;

import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.ch0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2500ch0 extends AbstractBinderC1623Mc implements InterfaceC2615dh0 {
    public AbstractBinderC2500ch0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 2:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 8:
                InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zze(InterfaceC6172a interfaceC6172a, String str, String str2);

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zzg(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zzh(int[] iArr);

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zzi(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC2615dh0
    public abstract /* synthetic */ void zzj(byte[] bArr);
}
