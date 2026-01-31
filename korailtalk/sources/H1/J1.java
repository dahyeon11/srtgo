package H1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1488Ir;
import com.google.android.gms.internal.ads.C1897Sr;
import com.google.android.gms.internal.ads.C2143Yr;
import com.google.android.gms.internal.ads.InterfaceC1406Gr;
import com.google.android.gms.internal.ads.InterfaceC1692Nr;
import com.google.android.gms.internal.ads.InterfaceC1856Rr;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class J1 extends AbstractBinderC1488Ir {
    private static void b(final InterfaceC1856Rr interfaceC1856Rr) {
        L1.n.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        L1.g.zza.post(new Runnable() { // from class: H1.I1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1856Rr interfaceC1856Rr2 = interfaceC1856Rr;
                if (interfaceC1856Rr2 != null) {
                    try {
                        interfaceC1856Rr2.zze(1);
                    } catch (RemoteException e8) {
                        L1.n.zzl("#007 Could not call remote method.", e8);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final S0 zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final InterfaceC1406Gr zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final String zze() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzf(Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        b(interfaceC1856Rr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzg(Y1 y12, InterfaceC1856Rr interfaceC1856Rr) {
        b(interfaceC1856Rr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzh(boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzi(I0 i02) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzj(L0 l02) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzk(InterfaceC1692Nr interfaceC1692Nr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzl(C2143Yr c2143Yr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzm(InterfaceC6172a interfaceC6172a) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzp(C1897Sr c1897Sr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1488Ir, com.google.android.gms.internal.ads.InterfaceC1570Kr
    public final void zzn(InterfaceC6172a interfaceC6172a, boolean z8) {
    }
}
