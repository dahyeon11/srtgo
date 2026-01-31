package com.google.android.gms.internal.ads;

import I2.C0609m;
import android.os.Bundle;
import android.os.RemoteException;
import com.kakao.sdk.user.Constants;

/* renamed from: com.google.android.gms.internal.ads.Ci0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1227Ci0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1473Ii0 f12568b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1596Li0 f12569c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0609m f12570d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1391Gi0 f12571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1227Ci0(C1391Gi0 c1391Gi0, C0609m c0609m, AbstractC1473Ii0 abstractC1473Ii0, InterfaceC1596Li0 interfaceC1596Li0, C0609m c0609m2) {
        super(c0609m);
        this.f12568b = abstractC1473Ii0;
        this.f12569c = interfaceC1596Li0;
        this.f12570d = c0609m2;
        this.f12571e = c1391Gi0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.gi0] */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    protected final void zza() {
        try {
            ?? Zze = this.f12571e.f13192a.zze();
            if (Zze == 0) {
                return;
            }
            C1391Gi0 c1391Gi0 = this.f12571e;
            String str = c1391Gi0.f13193b;
            AbstractC1473Ii0 abstractC1473Ii0 = this.f12568b;
            String str2 = c1391Gi0.f13193b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", abstractC1473Ii0.zzf());
            bundle.putString("adFieldEnifd", abstractC1473Ii0.zzg());
            bundle.putInt("layoutGravity", abstractC1473Ii0.zzc());
            bundle.putFloat("layoutVerticalMargin", abstractC1473Ii0.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC1473Ii0.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", true);
            bundle.putString("callerPackage", str2);
            if (abstractC1473Ii0.zzh() != null) {
                bundle.putString(Constants.APPID, abstractC1473Ii0.zzh());
            }
            Zze.zzf(str, bundle, new BinderC1350Fi0(this.f12571e, this.f12569c));
        } catch (RemoteException e8) {
            C1391Gi0.f13190c.zzb(e8, "show overlay display from: %s", this.f12571e.f13193b);
            this.f12570d.trySetException(new RuntimeException(e8));
        }
    }
}
