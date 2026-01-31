package K1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class U extends AbstractC1583Lc implements W {
    U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // K1.W
    public final void zze(InterfaceC6172a interfaceC6172a) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        c(2, parcelA);
    }

    @Override // K1.W
    public final boolean zzf(InterfaceC6172a interfaceC6172a, String str, String str2) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        Parcel parcelB = b(1, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // K1.W
    public final boolean zzg(InterfaceC6172a interfaceC6172a, I1.a aVar) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzd(parcelA, aVar);
        Parcel parcelB = b(3, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
