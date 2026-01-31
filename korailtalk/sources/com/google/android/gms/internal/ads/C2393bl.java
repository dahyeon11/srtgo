package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import i2.AbstractC5683p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2393bl implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final C3734nS f18177a;

    public C2393bl(C3734nS c3734nS) {
        AbstractC5683p.checkNotNull(c3734nS, "The Inspector Manager must not be null");
        this.f18177a = c3734nS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f18177a.zzj((String) map.get("persistentData"));
    }
}
