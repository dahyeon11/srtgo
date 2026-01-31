package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3101hv implements InterfaceC2278al {
    private static final Integer a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            L1.n.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        AbstractC2986gv c3328jv;
        C2146Yu c2146YuA;
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) obj;
        if (L1.n.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            L1.n.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C2187Zu c2187ZuZzy = G1.u.zzy();
        if (map.containsKey("abort")) {
            if (c2187ZuZzy.zzd(interfaceC4579uu)) {
                return;
            }
            L1.n.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numA = a(map, "periodicReportIntervalMs");
        Integer numA2 = a(map, "exoPlayerRenderingIntervalMs");
        Integer numA3 = a(map, "exoPlayerIdleIntervalMs");
        C4465tu c4465tu = new C4465tu((String) map.get("flags"));
        boolean z8 = c4465tu.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        strArr2[i8] = jSONArray.getString(i8);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    L1.n.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z8) {
                Iterator it = c2187ZuZzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c2146YuA = null;
                        break;
                    }
                    C2146Yu c2146Yu = (C2146Yu) it.next();
                    if (c2146Yu.f17458c == interfaceC4579uu && str.equals(c2146Yu.zze())) {
                        c2146YuA = c2146Yu;
                        break;
                    }
                }
            } else {
                c2146YuA = c2187ZuZzy.a(interfaceC4579uu);
            }
            if (c2146YuA != null) {
                L1.n.zzj("Precache task is already running.");
                return;
            }
            if (interfaceC4579uu.zzj() == null) {
                L1.n.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numA4 = a(map, "player");
            if (numA4 == null) {
                numA4 = 0;
            }
            if (numA != null) {
                interfaceC4579uu.zzA(numA.intValue());
            }
            if (numA2 != null) {
                interfaceC4579uu.zzy(numA2.intValue());
            }
            if (numA3 != null) {
                interfaceC4579uu.zzx(numA3.intValue());
            }
            int iIntValue = numA4.intValue();
            C1900Su c1900Su = interfaceC4579uu.zzj().zzb;
            if (iIntValue > 0) {
                int i9 = c4465tu.zzh;
                int iZzu = AbstractC3554lu.zzu();
                c3328jv = iZzu < i9 ? new C4012pv(interfaceC4579uu, c4465tu) : iZzu < c4465tu.zzb ? new C3670mv(interfaceC4579uu, c4465tu) : new C3442kv(interfaceC4579uu);
            } else {
                c3328jv = new C3328jv(interfaceC4579uu);
            }
            new C2146Yu(interfaceC4579uu, c3328jv, str, strArr).zzb();
        } else {
            C2146Yu c2146YuA2 = c2187ZuZzy.a(interfaceC4579uu);
            if (c2146YuA2 == null) {
                L1.n.zzj("Precache must specify a source.");
                return;
            }
            c3328jv = c2146YuA2.f17459d;
        }
        Integer numA5 = a(map, "minBufferMs");
        if (numA5 != null) {
            c3328jv.zzs(numA5.intValue());
        }
        Integer numA6 = a(map, "maxBufferMs");
        if (numA6 != null) {
            c3328jv.zzr(numA6.intValue());
        }
        Integer numA7 = a(map, "bufferForPlaybackMs");
        if (numA7 != null) {
            c3328jv.zzp(numA7.intValue());
        }
        Integer numA8 = a(map, "bufferForPlaybackAfterRebufferMs");
        if (numA8 != null) {
            c3328jv.zzq(numA8.intValue());
        }
    }
}
