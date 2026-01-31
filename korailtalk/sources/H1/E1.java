package H1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC2624dm;
import java.util.Collections;
import java.util.List;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class E1 extends AbstractBinderC0568r0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2624dm f1627a;

    final /* synthetic */ void zzb() {
        InterfaceC2624dm interfaceC2624dm = this.f1627a;
        if (interfaceC2624dm != null) {
            try {
                interfaceC2624dm.zzb(Collections.emptyList());
            } catch (RemoteException e8) {
                L1.n.zzk("Could not notify onComplete event.", e8);
            }
        }
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final float zze() {
        return 1.0f;
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final String zzf() {
        return "";
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzk() {
        L1.n.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        L1.g.zza.post(new Runnable() { // from class: H1.D1
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzs(InterfaceC2624dm interfaceC2624dm) {
        this.f1627a = interfaceC2624dm;
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final boolean zzv() {
        return false;
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzi() {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzh(String str) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzj(boolean z8) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzm(F0 f02) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzo(InterfaceC1850Rn interfaceC1850Rn) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzp(boolean z8) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzq(float f8) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzr(String str) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzt(String str) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzu(M1 m12) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzl(String str, InterfaceC6172a interfaceC6172a) {
    }

    @Override // H1.AbstractBinderC0568r0, H1.InterfaceC0571s0
    public final void zzn(InterfaceC6172a interfaceC6172a, String str) {
    }
}
