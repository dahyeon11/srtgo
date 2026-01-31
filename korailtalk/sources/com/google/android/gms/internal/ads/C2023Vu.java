package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2023Vu implements InterfaceC2278al {
    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) obj;
        BinderC1206Bw binderC1206BwZzq = interfaceC4579uu.zzq();
        if (binderC1206BwZzq == null) {
            try {
                BinderC1206Bw binderC1206Bw = new BinderC1206Bw(interfaceC4579uu, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC4579uu.zzC(binderC1206Bw);
                binderC1206BwZzq = binderC1206Bw;
            } catch (NullPointerException e8) {
                e = e8;
                L1.n.zzh("Unable to parse videoMeta message.", e);
                G1.u.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e9) {
                e = e9;
                L1.n.zzh("Unable to parse videoMeta message.", e);
                G1.u.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f8 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f9 = Float.parseFloat((String) map.get("currentTime"));
        int i8 = Integer.parseInt((String) map.get("playbackState"));
        int i9 = 0;
        if (i8 >= 0 && i8 <= 3) {
            i9 = i8;
        }
        String str = (String) map.get("aspectRatio");
        float f10 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (L1.n.zzm(3)) {
            L1.n.zze("Video Meta GMSG: currentTime : " + f9 + " , duration : " + f8 + " , isMuted : " + zEquals + " , playbackState : " + i9 + " , aspectRatio : " + str);
        }
        binderC1206BwZzq.zzc(f9, f8, i9, zEquals, f10);
    }
}
