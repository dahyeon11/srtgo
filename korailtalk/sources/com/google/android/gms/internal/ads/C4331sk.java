package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kakao.sdk.user.Constants;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4331sk implements InterfaceC2278al {
    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                L1.n.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                L1.n.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = G1.u.zzB().elapsedRealtime() + (Long.parseLong(str4) - G1.u.zzB().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC2065Wv.zzm().zzc(str2, str3, jElapsedRealtime);
                return;
            } catch (NumberFormatException e8) {
                L1.n.zzk("Malformed timestamp for CSI tick.", e8);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                L1.n.zzj("No value given for CSI experiment.");
                return;
            } else {
                interfaceC2065Wv.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if (Constants.EXTRA.equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                L1.n.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                L1.n.zzj("No name given for CSI extra.");
            } else {
                interfaceC2065Wv.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
