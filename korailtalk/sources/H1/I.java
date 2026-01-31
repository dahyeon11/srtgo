package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class I extends AbstractBinderC1623Mc implements J {
    public I() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                zzd();
                break;
            case 2:
                int i10 = parcel.readInt();
                AbstractC1664Nc.zzc(parcel);
                zze(i10);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
                AbstractC1664Nc.zzc(parcel);
                zzf(c0534f1);
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // H1.J
    public abstract /* synthetic */ void zzc();

    @Override // H1.J
    public abstract /* synthetic */ void zzd();

    @Override // H1.J
    public abstract /* synthetic */ void zze(int i8);

    @Override // H1.J
    public abstract /* synthetic */ void zzf(C0534f1 c0534f1);

    @Override // H1.J
    public abstract /* synthetic */ void zzg();

    @Override // H1.J
    public abstract /* synthetic */ void zzh();

    @Override // H1.J
    public abstract /* synthetic */ void zzi();

    @Override // H1.J
    public abstract /* synthetic */ void zzj();

    @Override // H1.J
    public abstract /* synthetic */ void zzk();
}
