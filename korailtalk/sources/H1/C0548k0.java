package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;

/* renamed from: H1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548k0 extends AbstractC1583Lc implements InterfaceC0554m0 {
    C0548k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // H1.InterfaceC0554m0
    public final void zzb() {
        c(5, a());
    }

    @Override // H1.InterfaceC0554m0
    public final void zzc() {
        c(3, a());
    }

    @Override // H1.InterfaceC0554m0
    public final void zzd(C0534f1 c0534f1) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c0534f1);
        c(1, parcelA);
    }

    @Override // H1.InterfaceC0554m0
    public final void zze() {
        c(4, a());
    }

    @Override // H1.InterfaceC0554m0
    public final void zzf() {
        c(2, a());
    }
}
