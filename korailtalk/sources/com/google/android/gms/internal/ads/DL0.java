package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class DL0 {

    /* renamed from: a */
    private final boolean f12658a;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;

    DL0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z8;
        this.zze = z11;
        this.zzf = z13;
        this.f12658a = AbstractC4239rv.zzh(str2);
    }

    private static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i10 = AbstractC2281am0.zza;
        return new Point((((i8 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i9 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void b(String str) {
        AbstractC2834fc0.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + AbstractC2281am0.zze + "]");
    }

    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d9) {
        Point pointA = a(videoCapabilities, i8, i9);
        int i10 = pointA.x;
        int i11 = pointA.y;
        return (d9 == -1.0d || d9 < 1.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, Math.floor(d9));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean d(com.google.android.gms.internal.ads.Q5 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DL0.d(com.google.android.gms.internal.ads.Q5, boolean):boolean");
    }

    private final boolean e(Q5 q52) {
        return this.zzb.equals(q52.zzn) || this.zzb.equals(AbstractC3157iM0.zzc(q52));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.DL0 zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.DL0 r11 = new com.google.android.gms.internal.ads.DL0
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r5 = 22
            if (r3 > r5) goto L29
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2b
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r8 = r0
            goto L3c
        L2b:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L29
        L3b:
            r8 = r2
        L3c:
            if (r4 == 0) goto L4a
            int r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4a
            r9 = r0
            goto L4b
        L4a:
            r9 = r2
        L4b:
            if (r20 != 0) goto L59
            if (r4 == 0) goto L5b
            int r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L5b
        L59:
            r10 = r0
            goto L5c
        L5b:
            r10 = r2
        L5c:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DL0.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.DL0");
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i8, int i9) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i8, i9);
    }

    public final ME0 zzb(Q5 q52, Q5 q53) {
        int i8 = true != AbstractC2281am0.zzG(q52.zzn, q53.zzn) ? 8 : 0;
        if (this.f12658a) {
            if (q52.zzv != q53.zzv) {
                i8 |= 1024;
            }
            if (!this.zze && (q52.zzs != q53.zzs || q52.zzt != q53.zzt)) {
                i8 |= 512;
            }
            if ((!C3724nL0.zzg(q52.zzz) || !C3724nL0.zzg(q53.zzz)) && !AbstractC2281am0.zzG(q52.zzz, q53.zzz)) {
                i8 |= 2048;
            }
            String str = this.zza;
            if (AbstractC2281am0.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !q52.zzd(q53)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new ME0(this.zza, q52, q53, true != q52.zzd(q53) ? 2 : 3, 0);
            }
        } else {
            if (q52.zzA != q53.zzA) {
                i8 |= 4096;
            }
            if (q52.zzB != q53.zzB) {
                i8 |= 8192;
            }
            if (q52.zzC != q53.zzC) {
                i8 |= 16384;
            }
            if (i8 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair pairZza = AbstractC3157iM0.zza(q52);
                Pair pairZza2 = AbstractC3157iM0.zza(q53);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ME0(this.zza, q52, q53, 3, 0);
                    }
                }
            }
            if (!q52.zzd(q53)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new ME0(this.zza, q52, q53, 1, 0);
            }
        }
        return new ME0(this.zza, q52, q53, 0, i8);
    }

    public final boolean zzd(Q5 q52) {
        return e(q52) && d(q52, false);
    }

    public final boolean zze(Q5 q52) {
        int i8;
        if (!e(q52) || !d(q52, true)) {
            return false;
        }
        if (this.f12658a) {
            int i9 = q52.zzs;
            if (i9 <= 0 || (i8 = q52.zzt) <= 0) {
                return true;
            }
            int i10 = AbstractC2281am0.zza;
            return zzg(i9, i8, q52.zzu);
        }
        int i11 = AbstractC2281am0.zza;
        int i12 = q52.zzB;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                b("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                b("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i12)) {
                b("sampleRate.support, " + i12);
                return false;
            }
        }
        int i13 = q52.zzA;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                b("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    b("channelCount.aCaps");
                } else {
                    String str = this.zza;
                    String str2 = this.zzb;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((AbstractC2281am0.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i14 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        AbstractC2834fc0.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i14 + "]");
                        maxInputChannelCount = i14;
                    }
                    if (maxInputChannelCount < i13) {
                        b("channelCount.support, " + i13);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzf(Q5 q52) {
        if (this.f12658a) {
            return this.zze;
        }
        Pair pairZza = AbstractC3157iM0.zza(q52);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzg(int r8, int r9, double r10) {
        /*
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.zzd
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
            r7.b(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.b(r8)
            return r1
        L17:
            int r2 = com.google.android.gms.internal.ads.AbstractC2281am0.zza
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L4f
            int r2 = com.google.android.gms.internal.ads.KL0.zza(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L2b
            goto Le8
        L2b:
            if (r2 == r4) goto L2e
            goto L4f
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.b(r8)
            return r1
        L4f:
            boolean r2 = c(r0, r8, r9, r10)
            if (r2 != 0) goto Le8
            if (r8 >= r9) goto Lc7
            java.lang.String r2 = r7.zza
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L6b
            java.lang.String r2 = "mcv5a"
            java.lang.String r3 = com.google.android.gms.internal.ads.AbstractC2281am0.zzb
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc7
        L6b:
            boolean r0 = c(r0, r9, r8, r10)
            if (r0 != 0) goto L72
            goto Lc7
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.zza
            java.lang.String r10 = r7.zzb
            java.lang.String r11 = com.google.android.gms.internal.ads.AbstractC2281am0.zze
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedSupport ["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "] ["
            r0.append(r8)
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r8 = "]"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.AbstractC2834fc0.zzb(r9, r8)
            goto Le8
        Lc7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            r0.append(r2)
            r0.append(r8)
            r0.append(r6)
            r0.append(r9)
            r0.append(r5)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7.b(r8)
            return r1
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DL0.zzg(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
