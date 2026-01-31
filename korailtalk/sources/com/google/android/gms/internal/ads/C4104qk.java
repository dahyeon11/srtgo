package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4104qk implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4217rk f21983a;

    public C4104qk(InterfaceC4217rk interfaceC4217rk) {
        this.f21983a = interfaceC4217rk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            L1.n.zzj("App event with no name parameter.");
        } else {
            this.f21983a.zzb(str, (String) map.get("info"));
        }
    }
}
