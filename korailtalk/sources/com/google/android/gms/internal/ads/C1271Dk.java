package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1271Dk implements InterfaceC2278al {
    C1271Dk() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        WindowManager windowManager = (WindowManager) interfaceC2065Wv.getContext().getSystemService("window");
        G1.u.zzp();
        DisplayMetrics displayMetricsZzt = K1.K0.zzt(windowManager);
        int i8 = displayMetricsZzt.widthPixels;
        int i9 = displayMetricsZzt.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) interfaceC2065Wv).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i8));
        map2.put("windowHeightInPixels", Integer.valueOf(i9));
        interfaceC2065Wv.zzd("locationReady", map2);
        L1.n.zzj("GET LOCATION COMPILED");
    }
}
