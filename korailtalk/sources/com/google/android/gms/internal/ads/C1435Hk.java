package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.text.TextUtils;
import com.kakao.sdk.user.Constants;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1435Hk implements InterfaceC2278al {
    C1435Hk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(Constants.APPID))) {
            AbstractC0667v0.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        AbstractC1432Hi0 abstractC1432Hi0Zzl = AbstractC1473Ii0.zzl();
        abstractC1432Hi0Zzl.zzb((String) map.get(Constants.APPID));
        abstractC1432Hi0Zzl.zzh(interfaceC2065Wv.getWidth());
        abstractC1432Hi0Zzl.zzg(interfaceC2065Wv.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            abstractC1432Hi0Zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            abstractC1432Hi0Zzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            abstractC1432Hi0Zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            abstractC1432Hi0Zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            abstractC1432Hi0Zzl.zza((String) map.get("enifd"));
        }
        try {
            G1.u.zzj().zzj(interfaceC2065Wv, abstractC1432Hi0Zzl.zzi());
        } catch (NullPointerException e8) {
            G1.u.zzo().zzw(e8, "DefaultGmsgHandlers.ShowLMDOverlay");
            AbstractC0667v0.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
