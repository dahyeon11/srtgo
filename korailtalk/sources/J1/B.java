package J1;

import K1.AbstractC0667v0;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class B extends u {
    public B(Activity activity) {
        super(activity);
    }

    @Override // J1.u, com.google.android.gms.internal.ads.AbstractBinderC1854Rp, com.google.android.gms.internal.ads.InterfaceC1895Sp
    public final void zzl(Bundle bundle) {
        AbstractC0667v0.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f2570v = 4;
        this.f2549a.finish();
    }
}
