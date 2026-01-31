package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Wn */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2055Wn extends AbstractBinderC1623Mc implements InterfaceC2096Xn {
    public AbstractBinderC2055Wn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC2096Xn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2096Xn ? (InterfaceC2096Xn) iInterfaceQueryLocalInterface : new C2014Vn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i10 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zzg(i10);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof AbstractC2399bo) {
                        android.support.v4.media.session.f.a(iInterfaceQueryLocalInterface);
                    }
                }
                AbstractC1664Nc.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                AbstractBinderC4785wj.zzb(parcel.readStrongBinder());
                parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                C1242Cr c1242Cr = (C1242Cr) AbstractC1664Nc.zza(parcel, C1242Cr.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzs(c1242Cr);
                break;
            case 15:
                zzw();
                break;
            case 16:
                InterfaceC1406Gr interfaceC1406GrZzb = AbstractBinderC1365Fr.zzb(parcel.readStrongBinder());
                AbstractC1664Nc.zzc(parcel);
                zzt(interfaceC1406GrZzb);
                break;
            case 17:
                int i11 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zzj(i11);
                break;
            case 18:
                zzu();
                break;
            case 19:
                AbstractC1664Nc.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i12 = parcel.readInt();
                String string4 = parcel.readString();
                AbstractC1664Nc.zzc(parcel);
                zzi(i12, string4);
                break;
            case 23:
                C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzh(c0534f1);
                break;
            case 24:
                C0534f1 c0534f12 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzk(c0534f12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzg(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzh(C0534f1 c0534f1);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzi(int i8, String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzj(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzk(C0534f1 c0534f1);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzl(String str);

    public abstract /* synthetic */ void zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzo();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzp();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzq(String str, String str2);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzr(InterfaceC4899xj interfaceC4899xj, String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzs(C1242Cr c1242Cr);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzt(InterfaceC1406Gr interfaceC1406Gr);

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzu();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzv();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzw();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzx();

    @Override // com.google.android.gms.internal.ads.InterfaceC2096Xn
    public abstract /* synthetic */ void zzy();
}
