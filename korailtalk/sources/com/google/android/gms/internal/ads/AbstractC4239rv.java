package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import maum.m2u.common.DeviceOuterClass;
import maum.m2u.map.Map;

/* renamed from: com.google.android.gms.internal.ads.rv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4239rv {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f22534a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f22535b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    public static final /* synthetic */ int zza = 0;

    static C1818Qu a(String str) {
        Matcher matcher = f22535b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C1818Qu(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String b(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            r1 = 6
            r2 = 5
            r3 = 9
            r4 = 7
            r5 = 8
            r6 = 0
            switch(r0) {
                case -2123537834: goto L84;
                case -1365340241: goto L7a;
                case -1095064472: goto L70;
                case -53558318: goto L66;
                case 187078296: goto L5c;
                case 187078297: goto L52;
                case 550520934: goto L48;
                case 1504578661: goto L3e;
                case 1504831518: goto L34;
                case 1504891608: goto L28;
                case 1505942594: goto L1d;
                case 1556697186: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L8e
        L11:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 10
            goto L8f
        L1d:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r4
            goto L8f
        L28:
            java.lang.String r0 = "audio/opus"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 11
            goto L8f
        L34:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r6
            goto L8f
        L3e:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 3
            goto L8f
        L48:
            java.lang.String r0 = "audio/vnd.dts.uhd;profile=p2"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r3
            goto L8f
        L52:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r2
            goto L8f
        L5c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 2
            goto L8f
        L66:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 1
            goto L8f
        L70:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r1
            goto L8f
        L7a:
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = r5
            goto L8f
        L84:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L8e
            r7 = 4
            goto L8f
        L8e:
            r7 = -1
        L8f:
            switch(r7) {
                case 0: goto Lb5;
                case 1: goto La6;
                case 2: goto La5;
                case 3: goto La4;
                case 4: goto La1;
                case 5: goto L9e;
                case 6: goto L9d;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L99;
                case 10: goto L96;
                case 11: goto L93;
                default: goto L92;
            }
        L92:
            return r6
        L93:
            r7 = 20
            return r7
        L96:
            r7 = 14
            return r7
        L99:
            r7 = 30
            return r7
        L9c:
            return r5
        L9d:
            return r4
        L9e:
            r7 = 17
            return r7
        La1:
            r7 = 18
            return r7
        La4:
            return r1
        La5:
            return r2
        La6:
            if (r8 != 0) goto La9
            return r6
        La9:
            com.google.android.gms.internal.ads.Qu r7 = a(r8)
            if (r7 != 0) goto Lb0
            return r6
        Lb0:
            int r7 = r7.zza()
            return r7
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4239rv.zza(java.lang.String, java.lang.String):int");
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzh(str)) {
            return 2;
        }
        if ("text".equals(b(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(b(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f22534a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        android.support.v4.media.session.f.a(arrayList.get(0));
        throw null;
    }

    public static String zzd(int i8) {
        if (i8 == 32) {
            return "video/mp4v-es";
        }
        if (i8 == 33) {
            return "video/avc";
        }
        if (i8 == 35) {
            return "video/hevc";
        }
        if (i8 == 64) {
            return "audio/mp4a-latm";
        }
        if (i8 == 163) {
            return "video/wvc1";
        }
        if (i8 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i8 == 221) {
            return "audio/vorbis";
        }
        if (i8 == 165) {
            return "audio/ac3";
        }
        if (i8 == 166) {
            return "audio/eac3";
        }
        switch (i8) {
            case 96:
            case 97:
            case DeviceOuterClass.Device.TIMESTAMP_FIELD_NUMBER /* 98 */:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case Map.MapException.CALLED_INTERFACE_FIELD_NUMBER /* 103 */:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i8) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String zze(java.lang.String r6) {
        /*
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC2963gj0.zza(r6)
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 5
            r5 = 1
            switch(r0) {
                case -1007807498: goto L47;
                case -979095690: goto L3d;
                case -586683234: goto L33;
                case -432836268: goto L29;
                case -432836267: goto L1f;
                case 187090231: goto L15;
                default: goto L14;
            }
        L14:
            goto L51
        L15:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = r5
            goto L52
        L1f:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = r4
            goto L52
        L29:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = r3
            goto L52
        L33:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = r2
            goto L52
        L3d:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = r1
            goto L52
        L47:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            r0 = 0
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L6e
            if (r0 == r5) goto L6b
            if (r0 == r2) goto L68
            if (r0 == r1) goto L65
            if (r0 == r3) goto L62
            if (r0 == r4) goto L5f
            return r6
        L5f:
            java.lang.String r6 = "audio/mpeg-L2"
            return r6
        L62:
            java.lang.String r6 = "audio/mpeg-L1"
            return r6
        L65:
            java.lang.String r6 = "application/x-mpegURL"
            return r6
        L68:
            java.lang.String r6 = "audio/wav"
            return r6
        L6b:
            java.lang.String r6 = "audio/mpeg"
            return r6
        L6e:
            java.lang.String r6 = "audio/flac"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4239rv.zze(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzf(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L76;
                case -432837260: goto L6c;
                case -432837259: goto L62;
                case -53558318: goto L57;
                case 187078296: goto L4d;
                case 187094639: goto L43;
                case 1504578661: goto L38;
                case 1504619009: goto L2e;
                case 1504831518: goto L24;
                case 1903231877: goto L19;
                case 1903589369: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L81
        Le:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 5
            goto L82
        L19:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 4
            goto L82
        L24:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r0
            goto L82
        L2e:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 6
            goto L82
        L38:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 8
            goto L82
        L43:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 3
            goto L82
        L4d:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 7
            goto L82
        L57:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 10
            goto L82
        L62:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 2
            goto L82
        L6c:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r2
            goto L82
        L76:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 9
            goto L82
        L81:
            r3 = -1
        L82:
            switch(r3) {
                case 0: goto L9c;
                case 1: goto L9c;
                case 2: goto L9c;
                case 3: goto L9c;
                case 4: goto L9c;
                case 5: goto L9c;
                case 6: goto L9c;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L9c;
                case 10: goto L86;
                default: goto L85;
            }
        L85:
            return r0
        L86:
            if (r4 != 0) goto L89
            return r0
        L89:
            com.google.android.gms.internal.ads.Qu r3 = a(r4)
            if (r3 != 0) goto L90
            return r0
        L90:
            int r3 = r3.zza()
            if (r3 == 0) goto L9b
            r4 = 16
            if (r3 == r4) goto L9b
            return r2
        L9b:
            return r0
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC4239rv.zzf(java.lang.String, java.lang.String):boolean");
    }

    public static boolean zzg(String str) {
        return "audio".equals(b(str));
    }

    public static boolean zzh(String str) {
        return "video".equals(b(str));
    }
}
