package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ux0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4586ux0 {
    public static final C4586ux0 zza = new C4586ux0(new C4700vx0());
    public static final C4586ux0 zzb = new C4586ux0(new C5156zx0());
    public static final C4586ux0 zzc = new C4586ux0(new Bx0());
    public static final C4586ux0 zzd = new C4586ux0(new Ax0());
    public static final C4586ux0 zze = new C4586ux0(new C4814wx0());
    public static final C4586ux0 zzf = new C4586ux0(new C5042yx0());
    public static final C4586ux0 zzg = new C4586ux0(new C4928xx0());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4472tx0 f23127a;

    public C4586ux0(Cx0 cx0) {
        this.f23127a = !AbstractC2293as0.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new C3903ox0(cx0, null) : new C4131qx0(cx0, 0 == true ? 1 : 0) : new C4358sx0(cx0, 0 == true ? 1 : 0);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        return this.f23127a.zza(str);
    }
}
