package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.z40 */
/* loaded from: classes2.dex */
public final class C5057z40 implements M50 {
    public final C4540ua0 zza;

    public C5057z40(C4540ua0 c4540ua0) {
        this.zza = c4540ua0;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlS)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", this.zza.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
