package J1;

import H1.InterfaceC0517a;
import K1.K0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.DJ;

/* loaded from: classes.dex */
public final class v {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z8) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, AdActivity.CLASS_NAME);
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
            intent.putExtra("shouldCallOnOverlayOpened", z8);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!o2.n.isAtLeastLollipop()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            G1.u.zzp();
            K0.zzT(context, intent);
            return;
        }
        InterfaceC0517a interfaceC0517a = adOverlayInfoParcel.zzb;
        if (interfaceC0517a != null) {
            interfaceC0517a.onAdClicked();
        }
        DJ dj = adOverlayInfoParcel.zzu;
        if (dj != null) {
            dj.zzdG();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        j jVar = adOverlayInfoParcel.zza;
        if (jVar != null && jVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        G1.u.zzh();
        j jVar2 = adOverlayInfoParcel.zza;
        C0618a.zzb(context, jVar2, adOverlayInfoParcel.zzi, jVar2 != null ? jVar2.zzi : null);
    }
}
