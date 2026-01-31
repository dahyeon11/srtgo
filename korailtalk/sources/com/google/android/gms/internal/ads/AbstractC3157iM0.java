package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.iM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3157iM0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f19908a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f19909b = new HashMap();
    public static final /* synthetic */ int zza = 0;

    /* JADX WARN: Removed duplicated region for block: B:105:0x018a A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:82:0x0137, B:88:0x014e, B:94:0x0163, B:96:0x0169, B:103:0x0182, B:105:0x018a, B:115:0x01b6, B:106:0x018f, B:108:0x019f, B:110:0x01a7, B:99:0x0177), top: B:151:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018f A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:82:0x0137, B:88:0x014e, B:94:0x0163, B:96:0x0169, B:103:0x0182, B:105:0x018a, B:115:0x01b6, B:106:0x018f, B:108:0x019f, B:110:0x01a7, B:99:0x0177), top: B:151:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0225 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0037, B:16:0x0045, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:26:0x0069, B:28:0x0073, B:30:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a3, B:44:0x00af, B:46:0x00b7, B:48:0x00bf, B:50:0x00c8, B:139:0x021d, B:142:0x0225, B:144:0x022b, B:145:0x0245, B:146:0x0266, B:53:0x00d1, B:54:0x00d4, B:56:0x00dc, B:59:0x00e7, B:61:0x00ef, B:66:0x00fd, B:68:0x0105, B:71:0x0110, B:73:0x0118, B:76:0x0123, B:78:0x012b), top: B:161:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0245 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:82:0x0137, B:88:0x014e, B:94:0x0163, B:96:0x0169, B:103:0x0182, B:105:0x018a, B:115:0x01b6, B:106:0x018f, B:108:0x019f, B:110:0x01a7, B:99:0x0177), top: B:151:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177 A[Catch: Exception -> 0x016e, TryCatch #0 {Exception -> 0x016e, blocks: (B:82:0x0137, B:88:0x014e, B:94:0x0163, B:96:0x0169, B:103:0x0182, B:105:0x018a, B:115:0x01b6, B:106:0x018f, B:108:0x019f, B:110:0x01a7, B:99:0x0177), top: B:151:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList a(com.google.android.gms.internal.ads.WL0 r23, com.google.android.gms.internal.ads.ZL0 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3157iM0.a(com.google.android.gms.internal.ads.WL0, com.google.android.gms.internal.ads.ZL0):java.util.ArrayList");
    }

    private static void b(List list, final InterfaceC2583dM0 interfaceC2583dM0) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.SL0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i8 = AbstractC3157iM0.zza;
                InterfaceC2583dM0 interfaceC2583dM02 = interfaceC2583dM0;
                return interfaceC2583dM02.zza(obj2) - interfaceC2583dM02.zza(obj);
            }
        });
    }

    private static boolean c(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC2281am0.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC4239rv.zzg(str)) {
            return true;
        }
        String strZza = AbstractC2963gj0.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.Q5 r21) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3157iM0.zza(com.google.android.gms.internal.ads.Q5):android.util.Pair");
    }

    public static DL0 zzb() {
        List listZze = zze("audio/raw", false, false);
        if (listZze.isEmpty()) {
            return null;
        }
        return (DL0) listZze.get(0);
    }

    public static String zzc(Q5 q52) {
        Pair pairZza;
        if ("audio/eac3-joc".equals(q52.zzn)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(q52.zzn) || (pairZza = zza(q52)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZza.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(RL0 rl0, Q5 q52, boolean z8, boolean z9) {
        String strZzc = zzc(q52);
        return strZzc == null ? AbstractC2394bl0.zzm() : zze(strZzc, z8, z9);
    }

    public static synchronized List zze(String str, boolean z8, boolean z9) {
        try {
            WL0 wl0 = new WL0(str, z8, z9);
            HashMap map = f19909b;
            List list = (List) map.get(wl0);
            if (list != null) {
                return list;
            }
            int i8 = AbstractC2281am0.zza;
            ArrayList arrayListA = a(wl0, new C2468cM0(z8, z9));
            if (z8 && arrayListA.isEmpty() && AbstractC2281am0.zza <= 23) {
                arrayListA = a(wl0, new C2354bM0(null));
                if (!arrayListA.isEmpty()) {
                    AbstractC2834fc0.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((DL0) arrayListA.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (AbstractC2281am0.zza < 26 && AbstractC2281am0.zzb.equals("R9") && arrayListA.size() == 1 && ((DL0) arrayListA.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListA.add(DL0.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                b(arrayListA, new InterfaceC2583dM0() { // from class: com.google.android.gms.internal.ads.TL0
                    @Override // com.google.android.gms.internal.ads.InterfaceC2583dM0
                    public final int zza(Object obj) {
                        int i9 = AbstractC3157iM0.zza;
                        String str2 = ((DL0) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (AbstractC2281am0.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (AbstractC2281am0.zza < 32 && arrayListA.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((DL0) arrayListA.get(0)).zza)) {
                arrayListA.add((DL0) arrayListA.remove(0));
            }
            AbstractC2394bl0 abstractC2394bl0Zzk = AbstractC2394bl0.zzk(arrayListA);
            map.put(wl0, abstractC2394bl0Zzk);
            return abstractC2394bl0Zzk;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zzf(RL0 rl0, Q5 q52, boolean z8, boolean z9) {
        List listZze = zze(q52.zzn, z8, z9);
        List listZzd = zzd(rl0, q52, z8, z9);
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        c2091Xk0.zzh(listZze);
        c2091Xk0.zzh(listZzd);
        return c2091Xk0.zzi();
    }

    public static List zzg(List list, final Q5 q52) {
        ArrayList arrayList = new ArrayList(list);
        b(arrayList, new InterfaceC2583dM0() { // from class: com.google.android.gms.internal.ads.VL0
            @Override // com.google.android.gms.internal.ads.InterfaceC2583dM0
            public final int zza(Object obj) {
                int i8 = AbstractC3157iM0.zza;
                return ((DL0) obj).zzd(q52) ? 1 : 0;
            }
        });
        return arrayList;
    }
}
