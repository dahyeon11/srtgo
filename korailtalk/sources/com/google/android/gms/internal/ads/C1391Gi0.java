package com.google.android.gms.internal.ads;

import I2.C0609m;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Gi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1391Gi0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C1718Oi0 f13190c = new C1718Oi0("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f13191d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    final C2275aj0 f13192a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13193b;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.Bi0] */
    C1391Gi0(Context context) {
        if (AbstractC2619dj0.zza(context)) {
            this.f13192a = new C2275aj0(context.getApplicationContext(), f13190c, "OverlayDisplayService", f13191d, new Object() { // from class: com.google.android.gms.internal.ads.Bi0
            }, null);
        } else {
            this.f13192a = null;
        }
        this.f13193b = context.getPackageName();
    }

    final void c() {
        if (this.f13192a == null) {
            return;
        }
        f13190c.zzc("unbind LMD display overlay service", new Object[0]);
        this.f13192a.zzu();
    }

    final void d(AbstractC4898xi0 abstractC4898xi0, InterfaceC1596Li0 interfaceC1596Li0) {
        if (this.f13192a == null) {
            f13190c.zza("error: %s", "Play Store not found.");
        } else {
            C0609m c0609m = new C0609m();
            this.f13192a.zzs(new C1268Di0(this, c0609m, abstractC4898xi0, interfaceC1596Li0, c0609m), c0609m);
        }
    }

    final void e(AbstractC1473Ii0 abstractC1473Ii0, InterfaceC1596Li0 interfaceC1596Li0) {
        if (this.f13192a == null) {
            f13190c.zza("error: %s", "Play Store not found.");
            return;
        }
        if (abstractC1473Ii0.zzh() != null) {
            C0609m c0609m = new C0609m();
            this.f13192a.zzs(new C1227Ci0(this, c0609m, abstractC1473Ii0, interfaceC1596Li0, c0609m), c0609m);
        } else {
            f13190c.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            AbstractC1514Ji0 abstractC1514Ji0Zzc = AbstractC1555Ki0.zzc();
            abstractC1514Ji0Zzc.zzb(8160);
            interfaceC1596Li0.zza(abstractC1514Ji0Zzc.zzc());
        }
    }

    final void f(AbstractC1677Ni0 abstractC1677Ni0, InterfaceC1596Li0 interfaceC1596Li0, int i8) {
        if (this.f13192a == null) {
            f13190c.zza("error: %s", "Play Store not found.");
        } else {
            C0609m c0609m = new C0609m();
            this.f13192a.zzs(new C1309Ei0(this, c0609m, abstractC1677Ni0, i8, interfaceC1596Li0, c0609m), c0609m);
        }
    }
}
