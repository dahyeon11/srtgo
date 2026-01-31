package H1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1623Mc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* renamed from: H1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0551l0 extends AbstractBinderC1623Mc implements InterfaceC0554m0 {
    public AbstractBinderC0551l0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzd(c0534f1);
        } else if (i8 == 2) {
            zzf();
        } else if (i8 == 3) {
            zzc();
        } else if (i8 == 4) {
            zze();
        } else {
            if (i8 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb();

    public abstract /* synthetic */ void zzc();

    public abstract /* synthetic */ void zzd(C0534f1 c0534f1);

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf();
}
