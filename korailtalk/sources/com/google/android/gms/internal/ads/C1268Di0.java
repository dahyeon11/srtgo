package com.google.android.gms.internal.ads;

import I2.C0609m;
import android.os.Bundle;
import android.os.RemoteException;
import com.kakao.sdk.user.Constants;

/* renamed from: com.google.android.gms.internal.ads.Di0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1268Di0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC4898xi0 f12703b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC1596Li0 f12704c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0609m f12705d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1391Gi0 f12706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1268Di0(C1391Gi0 c1391Gi0, C0609m c0609m, AbstractC4898xi0 abstractC4898xi0, InterfaceC1596Li0 interfaceC1596Li0, C0609m c0609m2) {
        super(c0609m);
        this.f12703b = abstractC4898xi0;
        this.f12704c = interfaceC1596Li0;
        this.f12705d = c0609m2;
        this.f12706e = c1391Gi0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.gi0] */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    protected final void zza() {
        try {
            ?? Zze = this.f12706e.f13192a.zze();
            if (Zze == 0) {
                return;
            }
            AbstractC4898xi0 abstractC4898xi0 = this.f12703b;
            String str = this.f12706e.f13193b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", abstractC4898xi0.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString(Constants.APPID, abstractC4898xi0.zza());
            Zze.zze(bundle, new BinderC1350Fi0(this.f12706e, this.f12704c));
        } catch (RemoteException e8) {
            C1391Gi0.f13190c.zzb(e8, "dismiss overlay display from: %s", this.f12706e.f13193b);
            this.f12705d.trySetException(new RuntimeException(e8));
        }
    }
}
