package com.google.android.gms.internal.ads;

import I2.C0609m;
import android.os.Bundle;
import android.os.RemoteException;
import com.kakao.sdk.user.Constants;

/* renamed from: com.google.android.gms.internal.ads.Ei0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1309Ei0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1677Ni0 f12847b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12848c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1596Li0 f12849d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0609m f12850e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1391Gi0 f12851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1309Ei0(C1391Gi0 c1391Gi0, C0609m c0609m, AbstractC1677Ni0 abstractC1677Ni0, int i8, InterfaceC1596Li0 interfaceC1596Li0, C0609m c0609m2) {
        super(c0609m);
        this.f12847b = abstractC1677Ni0;
        this.f12848c = i8;
        this.f12849d = interfaceC1596Li0;
        this.f12850e = c0609m2;
        this.f12851f = c1391Gi0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.gi0] */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    protected final void zza() {
        try {
            ?? Zze = this.f12851f.f13192a.zze();
            if (Zze == 0) {
                return;
            }
            AbstractC1677Ni0 abstractC1677Ni0 = this.f12847b;
            String str = this.f12851f.f13193b;
            int i8 = this.f12848c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", abstractC1677Ni0.zzb());
            bundle.putInt("displayMode", i8);
            bundle.putString("callerPackage", str);
            bundle.putString(Constants.APPID, abstractC1677Ni0.zza());
            Zze.zzg(bundle, new BinderC1350Fi0(this.f12851f, this.f12849d));
        } catch (RemoteException e8) {
            C1391Gi0.f13190c.zzb(e8, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f12848c), this.f12851f.f13193b);
            this.f12850e.trySetException(new RuntimeException(e8));
        }
    }
}
