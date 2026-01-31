package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.if0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3184if0 {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f19964a;

    public static EnumC5118ze0 zza() {
        UiModeManager uiModeManager = f19964a;
        if (uiModeManager == null) {
            return EnumC5118ze0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? EnumC5118ze0.OTHER : EnumC5118ze0.CTV : EnumC5118ze0.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            f19964a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
