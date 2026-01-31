package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2507cl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final C2622dl f18348a;

    public C2507cl(C2622dl c2622dl) {
        this.f18348a = c2622dl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f8 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f8 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e8) {
            L1.n.zzh("Fail to parse float", e8);
        }
        this.f18348a.zzc(zEquals);
        this.f18348a.zzb(zEquals2, f8);
        interfaceC2065Wv.zzay(zEquals);
    }
}
