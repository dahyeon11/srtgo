package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0661s0;
import K1.AbstractC0667v0;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Uu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1982Uu implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16728a;

    private static int a(Context context, Map map, String str, int i8) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C0591z.zzb();
                i8 = L1.g.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                L1.n.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (AbstractC0667v0.zzc()) {
            AbstractC0667v0.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i8 + ".");
        }
        return i8;
    }

    private static void b(C3212iu c3212iu, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                c3212iu.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                L1.n.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            c3212iu.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            c3212iu.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            c3212iu.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            c3212iu.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        int iMin;
        int iMin2;
        InterfaceC4579uu interfaceC4579uu = (InterfaceC4579uu) obj;
        String str = (String) map.get("action");
        if (str == null) {
            L1.n.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = interfaceC4579uu.zzo() != null ? interfaceC4579uu.zzo().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            L1.n.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZzb));
            return;
        }
        if (L1.n.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            L1.n.zze("Video GMSG: " + str + Q7.X.SPACE + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                L1.n.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC4579uu.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                L1.n.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                L1.n.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC4579uu.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                L1.n.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i8 = 0;
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                L1.n.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(androidx.core.app.r.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                interfaceC4579uu.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i8 < length) {
                String str5 = strArrSplit[i8];
                map3.put(str5, AbstractC0661s0.zza(str5.trim()));
                i8++;
            }
            HashMap map4 = new HashMap();
            map4.put(androidx.core.app.r.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC4579uu.zzd("onVideoEvent", map4);
            return;
        }
        C3326ju c3326juZzo = interfaceC4579uu.zzo();
        if (c3326juZzo == null) {
            L1.n.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = interfaceC4579uu.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zzdR;
            if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                iMin = iA3 == -1 ? interfaceC4579uu.zzh() : Math.min(iA3, interfaceC4579uu.zzh());
            } else {
                if (AbstractC0667v0.zzc()) {
                    AbstractC0667v0.zza("Calculate width with original width " + iA3 + ", videoHost.getVideoBoundingWidth() " + interfaceC4579uu.zzh() + ", x " + iA + ".");
                }
                iMin = Math.min(iA3, interfaceC4579uu.zzh() - iA);
            }
            int i9 = iMin;
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue()) {
                iMin2 = iA4 == -1 ? interfaceC4579uu.zzg() : Math.min(iA4, interfaceC4579uu.zzg());
            } else {
                if (AbstractC0667v0.zzc()) {
                    AbstractC0667v0.zza("Calculate height with original height " + iA4 + ", videoHost.getVideoBoundingHeight() " + interfaceC4579uu.zzg() + ", y " + iA2 + ".");
                }
                iMin2 = Math.min(iA4, interfaceC4579uu.zzg() - iA2);
            }
            int i10 = iMin2;
            try {
                i8 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i11 = i8;
            boolean z8 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || c3326juZzo.zza() != null) {
                c3326juZzo.zzc(iA, iA2, i9, i10);
                return;
            }
            c3326juZzo.zzd(iA, iA2, i9, i10, i11, z8, new C4465tu((String) map.get("flags")));
            C3212iu c3212iuZza = c3326juZzo.zza();
            if (c3212iuZza != null) {
                b(c3212iuZza, map);
                return;
            }
            return;
        }
        BinderC1206Bw binderC1206BwZzq = interfaceC4579uu.zzq();
        if (binderC1206BwZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    L1.n.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    binderC1206BwZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    L1.n.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                binderC1206BwZzq.zzu();
                return;
            }
        }
        C3212iu c3212iuZza2 = c3326juZzo.zza();
        if (c3212iuZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put(androidx.core.app.r.CATEGORY_EVENT, "no_video_view");
            interfaceC4579uu.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC4579uu.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            c3212iuZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                L1.n.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                c3212iuZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                L1.n.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c3212iuZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c3212iuZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            c3212iuZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            b(c3212iuZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                c3212iuZza2.zzs();
                return;
            } else {
                c3212iuZza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            c3212iuZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            c3212iuZza2.zzv();
            return;
        }
        if (str.equals("show")) {
            c3212iuZza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    L1.n.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        strArr2[i12] = jSONArray.getString(i12);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    L1.n.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                interfaceC4579uu.zzA(numValueOf.intValue());
            }
            c3212iuZza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC4579uu.getContext();
            c3212iuZza2.zzH(a(context3, map, "dx", 0), a(context3, map, "dy", 0));
            if (this.f16728a) {
                return;
            }
            interfaceC4579uu.zzu();
            this.f16728a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                c3212iuZza2.zzn();
                return;
            } else {
                L1.n.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            L1.n.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            c3212iuZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            L1.n.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
