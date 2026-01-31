package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12130a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f12131b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f12132c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f12133d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f12134e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f12135f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ int zza = 0;

    private static int a(int i8, int i9) {
        int i10;
        if (i8 < 0 || i8 >= 3 || i9 < 0 || (i10 = i9 >> 1) >= 19) {
            return -1;
        }
        int i11 = f12131b[i8];
        if (i11 == 44100) {
            int i12 = f12135f[i10] + (i9 & 1);
            return i12 + i12;
        }
        int i13 = f12134e[i10];
        return i11 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f12130a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b9 = bArr[4];
            return a((b9 & 192) >> 6, b9 & 63);
        }
        int i8 = bArr[2] & 7;
        int i9 = ((bArr[3] & 255) | (i8 << 8)) + 1;
        return i9 + i9;
    }

    public static Q5 zzc(C4099qh0 c4099qh0, String str, String str2, C3114i1 c3114i1) {
        C1755Pg0 c1755Pg0 = new C1755Pg0();
        c1755Pg0.zzi(c4099qh0);
        int i8 = f12131b[c1755Pg0.zzd(2)];
        c1755Pg0.zzm(8);
        int i9 = f12133d[c1755Pg0.zzd(3)];
        if (c1755Pg0.zzd(1) != 0) {
            i9++;
        }
        int i10 = f12134e[c1755Pg0.zzd(5)] * 1000;
        c1755Pg0.zze();
        c4099qh0.zzK(c1755Pg0.zzb());
        O4 o42 = new O4();
        o42.zzK(str);
        o42.zzX("audio/ac3");
        o42.zzy(i9);
        o42.zzY(i8);
        o42.zzE(c3114i1);
        o42.zzO(str2);
        o42.zzx(i10);
        o42.zzS(i10);
        return o42.zzad();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.Q5 zzd(com.google.android.gms.internal.ads.C4099qh0 r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.C3114i1 r10) {
        /*
            com.google.android.gms.internal.ads.Pg0 r0 = new com.google.android.gms.internal.ads.Pg0
            r0.<init>()
            r0.zzi(r7)
            r1 = 13
            int r1 = r0.zzd(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzm(r2)
            r3 = 2
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.A0.f12131b
            r3 = r4[r3]
            r4 = 10
            r0.zzm(r4)
            int[] r4 = com.google.android.gms.internal.ads.A0.f12133d
            int r5 = r0.zzd(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzd(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzm(r2)
            r2 = 4
            int r2 = r0.zzd(r2)
            r0.zzm(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzm(r2)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzm(r5)
        L4f:
            int r2 = r0.zza()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzm(r6)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zze()
            int r0 = r0.zzb()
            r7.zzK(r0)
            com.google.android.gms.internal.ads.O4 r7 = new com.google.android.gms.internal.ads.O4
            r7.<init>()
            r7.zzK(r8)
            r7.zzX(r2)
            r7.zzy(r4)
            r7.zzY(r3)
            r7.zzE(r10)
            r7.zzO(r9)
            r7.zzS(r1)
            com.google.android.gms.internal.ads.Q5 r7 = r7.zzad()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A0.zzd(com.google.android.gms.internal.ads.qh0, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.i1):com.google.android.gms.internal.ads.Q5");
    }

    public static C5048z0 zze(C1755Pg0 c1755Pg0) {
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzc = c1755Pg0.zzc();
        c1755Pg0.zzm(40);
        int iZzd = c1755Pg0.zzd(5);
        c1755Pg0.zzk(iZzc);
        int i19 = -1;
        if (iZzd > 10) {
            c1755Pg0.zzm(16);
            int iZzd2 = c1755Pg0.zzd(2);
            if (iZzd2 == 0) {
                i19 = 0;
            } else if (iZzd2 == 1) {
                i19 = 1;
            } else if (iZzd2 == 2) {
                i19 = 2;
            }
            c1755Pg0.zzm(3);
            int iZzd3 = c1755Pg0.zzd(11) + 1;
            int iZzd4 = c1755Pg0.zzd(2);
            if (iZzd4 == 3) {
                i15 = f12132c[c1755Pg0.zzd(2)];
                i16 = 6;
                i14 = 3;
            } else {
                int iZzd5 = c1755Pg0.zzd(2);
                int i20 = f12130a[iZzd5];
                i14 = iZzd5;
                i15 = f12131b[iZzd4];
                i16 = i20;
            }
            int i21 = iZzd3 + iZzd3;
            int i22 = (i21 * i15) / (i16 * 32);
            int iZzd6 = c1755Pg0.zzd(3);
            boolean zZzo = c1755Pg0.zzo();
            i8 = f12133d[iZzd6] + (zZzo ? 1 : 0);
            c1755Pg0.zzm(10);
            if (c1755Pg0.zzo()) {
                c1755Pg0.zzm(8);
            }
            if (iZzd6 == 0) {
                c1755Pg0.zzm(5);
                if (c1755Pg0.zzo()) {
                    c1755Pg0.zzm(8);
                }
                i17 = 0;
                iZzd6 = 0;
            } else {
                i17 = iZzd6;
            }
            if (i19 == 1) {
                if (c1755Pg0.zzo()) {
                    c1755Pg0.zzm(16);
                }
                i18 = 1;
            } else {
                i18 = i19;
            }
            if (c1755Pg0.zzo()) {
                if (i17 > 2) {
                    c1755Pg0.zzm(2);
                }
                if ((i17 & 1) != 0 && i17 > 2) {
                    c1755Pg0.zzm(6);
                }
                if ((i17 & 4) != 0) {
                    c1755Pg0.zzm(6);
                }
                if (zZzo && c1755Pg0.zzo()) {
                    c1755Pg0.zzm(5);
                }
                if (i18 == 0) {
                    if (c1755Pg0.zzo()) {
                        c1755Pg0.zzm(6);
                    }
                    if (i17 == 0 && c1755Pg0.zzo()) {
                        c1755Pg0.zzm(6);
                    }
                    if (c1755Pg0.zzo()) {
                        c1755Pg0.zzm(6);
                    }
                    int iZzd7 = c1755Pg0.zzd(2);
                    if (iZzd7 == 1) {
                        c1755Pg0.zzm(5);
                    } else if (iZzd7 == 2) {
                        c1755Pg0.zzm(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = c1755Pg0.zzd(5);
                        if (c1755Pg0.zzo()) {
                            c1755Pg0.zzm(5);
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(4);
                            }
                            if (c1755Pg0.zzo()) {
                                if (c1755Pg0.zzo()) {
                                    c1755Pg0.zzm(4);
                                }
                                if (c1755Pg0.zzo()) {
                                    c1755Pg0.zzm(4);
                                }
                            }
                        }
                        if (c1755Pg0.zzo()) {
                            c1755Pg0.zzm(5);
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(7);
                                if (c1755Pg0.zzo()) {
                                    c1755Pg0.zzm(8);
                                }
                            }
                        }
                        c1755Pg0.zzm((iZzd8 + 2) * 8);
                        c1755Pg0.zze();
                    }
                    if (i17 < 2) {
                        if (c1755Pg0.zzo()) {
                            c1755Pg0.zzm(14);
                        }
                        if (iZzd6 == 0 && c1755Pg0.zzo()) {
                            c1755Pg0.zzm(14);
                        }
                    }
                    if (!c1755Pg0.zzo()) {
                        i18 = 0;
                    } else if (i14 == 0) {
                        c1755Pg0.zzm(5);
                        i18 = 0;
                        i14 = 0;
                    } else {
                        for (int i23 = 0; i23 < i16; i23++) {
                            if (c1755Pg0.zzo()) {
                                c1755Pg0.zzm(5);
                            }
                        }
                        i18 = 0;
                    }
                }
            }
            if (c1755Pg0.zzo()) {
                c1755Pg0.zzm(5);
                if (i17 == 2) {
                    c1755Pg0.zzm(4);
                    i17 = 2;
                }
                if (i17 >= 6) {
                    c1755Pg0.zzm(2);
                }
                if (c1755Pg0.zzo()) {
                    c1755Pg0.zzm(8);
                }
                if (i17 == 0 && c1755Pg0.zzo()) {
                    c1755Pg0.zzm(8);
                }
                if (iZzd4 < 3) {
                    c1755Pg0.zzl();
                }
            }
            if (i18 == 0 && i14 != 3) {
                c1755Pg0.zzl();
            }
            if (i18 == 2 && (i14 == 3 || c1755Pg0.zzo())) {
                c1755Pg0.zzm(6);
            }
            str = (c1755Pg0.zzo() && c1755Pg0.zzd(6) == 1 && c1755Pg0.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i9 = i19;
            i11 = i21;
            i12 = i15;
            i13 = i16 * 256;
            i10 = i22;
        } else {
            c1755Pg0.zzm(32);
            int iZzd9 = c1755Pg0.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = c1755Pg0.zzd(6);
            int i24 = f12134e[iZzd10 / 2] * 1000;
            int iA = a(iZzd9, iZzd10);
            c1755Pg0.zzm(8);
            int iZzd11 = c1755Pg0.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                c1755Pg0.zzm(2);
            }
            if ((iZzd11 & 4) != 0) {
                c1755Pg0.zzm(2);
            }
            if (iZzd11 == 2) {
                c1755Pg0.zzm(2);
            }
            int i25 = iZzd9 < 3 ? f12131b[iZzd9] : -1;
            i8 = f12133d[iZzd11] + (c1755Pg0.zzo() ? 1 : 0);
            i9 = -1;
            str = str2;
            i10 = i24;
            i11 = iA;
            i12 = i25;
            i13 = 1536;
        }
        return new C5048z0(str, i9, i8, i12, i11, i13, i10, null);
    }
}
