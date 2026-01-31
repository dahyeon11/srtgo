package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* loaded from: classes.dex */
public abstract class X0 extends AbstractBinderC1623Mc implements Y0 {
    public X0() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzi();
        } else if (i8 == 2) {
            zzh();
        } else if (i8 == 3) {
            zzg();
        } else if (i8 == 4) {
            zze();
        } else {
            if (i8 != 5) {
                return false;
            }
            boolean zZzg = AbstractC1664Nc.zzg(parcel);
            AbstractC1664Nc.zzc(parcel);
            zzf(zZzg);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf(boolean z8);

    public abstract /* synthetic */ void zzg();

    public abstract /* synthetic */ void zzh();

    public abstract /* synthetic */ void zzi();
}
