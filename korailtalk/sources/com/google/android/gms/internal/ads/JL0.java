package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes2.dex */
abstract class JL0 {
    private static int a(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (FL0.a(list.get(i8)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        com.google.android.gms.internal.ads.IL0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (a(r6, com.google.android.gms.internal.ads.HL0.a(1280, 720, 60)) != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = com.google.android.gms.internal.ads.EL0.a(r2)
            r0 = 0
            if (r2 == 0) goto La2
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto La2
        Lf:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.HL0.a(r3, r4, r5)
            int r2 = a(r2, r3)
            r3 = 1
            if (r2 != r3) goto La1
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.KL0.a()
            if (r4 != 0) goto La1
            int r4 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r5 = 35
            if (r4 < r5) goto L29
        L27:
            r3 = r0
            goto L8f
        L29:
            com.google.android.gms.internal.ads.O4 r4 = new com.google.android.gms.internal.ads.O4     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            java.lang.String r5 = "video/avc"
            r4.zzX(r5)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            com.google.android.gms.internal.ads.Q5 r4 = r4.zzad()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            java.lang.String r5 = r4.zzn     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r5 == 0) goto L8f
            com.google.android.gms.internal.ads.RL0 r5 = com.google.android.gms.internal.ads.RL0.zza     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            java.util.List r4 = com.google.android.gms.internal.ads.AbstractC3157iM0.zzf(r5, r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            r5 = r0
        L42:
            int r6 = r4.size()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r5 >= r6) goto L8f
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            com.google.android.gms.internal.ads.DL0 r6 = (com.google.android.gms.internal.ads.DL0) r6     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            com.google.android.gms.internal.ads.DL0 r6 = (com.google.android.gms.internal.ads.DL0) r6     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            com.google.android.gms.internal.ads.DL0 r6 = (com.google.android.gms.internal.ads.DL0) r6     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            java.util.List r6 = com.google.android.gms.internal.ads.EL0.a(r6)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r6 == 0) goto L8c
            boolean r1 = r6.isEmpty()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r1 != 0) goto L8c
            com.google.android.gms.internal.ads.IL0.a()     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            r4 = 720(0x2d0, float:1.009E-42)
            r5 = 60
            r1 = 1280(0x500, float:1.794E-42)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = com.google.android.gms.internal.ads.HL0.a(r1, r4, r5)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            int r4 = a(r6, r4)     // Catch: com.google.android.gms.internal.ads.YL0 -> L8f
            if (r4 != r3) goto L27
            goto L8f
        L8c:
            int r5 = r5 + 1
            goto L42
        L8f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.KL0.b(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.KL0.a()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La1
            return r0
        La1:
            return r2
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JL0.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
