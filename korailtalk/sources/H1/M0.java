package H1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1583Lc;
import com.google.android.gms.internal.ads.AbstractC1664Nc;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class M0 extends AbstractC1583Lc implements O0 {
    M0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // H1.O0
    public final void zze(String str, InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a);
        AbstractC1664Nc.zzf(parcelA, interfaceC6172a2);
        c(1, parcelA);
    }
}
