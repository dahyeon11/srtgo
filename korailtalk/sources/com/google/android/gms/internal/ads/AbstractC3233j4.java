package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3233j4 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f20180a;

    static {
        int i8 = AbstractC2281am0.zza;
        f20180a = "OpusHead".getBytes(AbstractC3647mj0.zzc);
    }

    private static int a(C4099qh0 c4099qh0) {
        int iZzm = c4099qh0.zzm();
        int i8 = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = c4099qh0.zzm();
            i8 = (i8 << 7) | (iZzm & 127);
        }
        return i8;
    }

    private static int b(C4099qh0 c4099qh0) {
        c4099qh0.zzK(16);
        return c4099qh0.zzg();
    }

    private static Pair c(C4099qh0 c4099qh0, int i8, int i9) throws C1901Sv {
        Integer num;
        E4 e42;
        Pair pairCreate;
        int i10;
        int i11;
        byte[] bArr;
        int iZzd = c4099qh0.zzd();
        while (iZzd - i8 < i9) {
            c4099qh0.zzK(iZzd);
            int iZzg = c4099qh0.zzg();
            AbstractC2884g1.zzb(iZzg > 0, "childAtomSize must be positive");
            if (c4099qh0.zzg() == 1936289382) {
                int i12 = iZzd + 8;
                int i13 = 0;
                int i14 = -1;
                String strZzA = null;
                Integer numValueOf = null;
                while (i12 - iZzd < iZzg) {
                    c4099qh0.zzK(i12);
                    int iZzg2 = c4099qh0.zzg();
                    int iZzg3 = c4099qh0.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(c4099qh0.zzg());
                    } else if (iZzg3 == 1935894637) {
                        c4099qh0.zzL(4);
                        strZzA = c4099qh0.zzA(4, AbstractC3647mj0.zzc);
                    } else if (iZzg3 == 1935894633) {
                        i14 = i12;
                        i13 = iZzg2;
                    }
                    i12 += iZzg2;
                }
                if ("cenc".equals(strZzA) || "cbc1".equals(strZzA) || "cens".equals(strZzA) || "cbcs".equals(strZzA)) {
                    AbstractC2884g1.zzb(numValueOf != null, "frma atom is mandatory");
                    AbstractC2884g1.zzb(i14 != -1, "schi atom is mandatory");
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = numValueOf;
                            e42 = null;
                            break;
                        }
                        c4099qh0.zzK(i15);
                        int iZzg4 = c4099qh0.zzg();
                        if (c4099qh0.zzg() == 1952804451) {
                            int iZze = C2317b4.zze(c4099qh0.zzg());
                            c4099qh0.zzL(1);
                            if (iZze == 0) {
                                c4099qh0.zzL(1);
                                i10 = 0;
                                i11 = 0;
                            } else {
                                int iZzm = c4099qh0.zzm();
                                int i16 = (iZzm & 240) >> 4;
                                i10 = iZzm & 15;
                                i11 = i16;
                            }
                            boolean z8 = c4099qh0.zzm() == 1;
                            int iZzm2 = c4099qh0.zzm();
                            byte[] bArr2 = new byte[16];
                            c4099qh0.zzG(bArr2, 0, 16);
                            if (z8 && iZzm2 == 0) {
                                int iZzm3 = c4099qh0.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                c4099qh0.zzG(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            e42 = new E4(z8, strZzA, iZzm2, bArr2, i11, i10, bArr);
                        } else {
                            i15 += iZzg4;
                        }
                    }
                    AbstractC2884g1.zzb(e42 != null, "tenc atom is mandatory");
                    int i17 = AbstractC2281am0.zza;
                    pairCreate = Pair.create(num, e42);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    private static C1735Ot d(C4099qh0 c4099qh0) {
        short sZzD = c4099qh0.zzD();
        c4099qh0.zzL(2);
        String strZzA = c4099qh0.zzA(sZzD, AbstractC3647mj0.zzc);
        int iMax = Math.max(strZzA.lastIndexOf(43), strZzA.lastIndexOf(45));
        try {
            return new C1735Ot(-9223372036854775807L, new Tp0(Float.parseFloat(strZzA.substring(0, iMax)), Float.parseFloat(strZzA.substring(iMax, strZzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static C2546d4 e(C4099qh0 c4099qh0, int i8) {
        c4099qh0.zzK(i8 + 12);
        c4099qh0.zzL(1);
        a(c4099qh0);
        c4099qh0.zzL(2);
        int iZzm = c4099qh0.zzm();
        if ((iZzm & 128) != 0) {
            c4099qh0.zzL(2);
        }
        if ((iZzm & 64) != 0) {
            c4099qh0.zzL(c4099qh0.zzm());
        }
        if ((iZzm & 32) != 0) {
            c4099qh0.zzL(2);
        }
        c4099qh0.zzL(1);
        a(c4099qh0);
        String strZzd = AbstractC4239rv.zzd(c4099qh0.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new C2546d4(strZzd, null, -1L, -1L);
        }
        c4099qh0.zzL(4);
        long jZzu = c4099qh0.zzu();
        long jZzu2 = c4099qh0.zzu();
        c4099qh0.zzL(1);
        int iA = a(c4099qh0);
        byte[] bArr = new byte[iA];
        c4099qh0.zzG(bArr, 0, iA);
        return new C2546d4(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026b A[ADDED_TO_REGION, LOOP:12: B:103:0x026b->B:107:0x0275, LOOP_START, PHI: r16
  0x026b: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:102:0x0269, B:107:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.G4 f(com.google.android.gms.internal.ads.D4 r36, com.google.android.gms.internal.ads.Z3 r37, com.google.android.gms.internal.ads.C4252s1 r38) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3233j4.f(com.google.android.gms.internal.ads.D4, com.google.android.gms.internal.ads.Z3, com.google.android.gms.internal.ads.s1):com.google.android.gms.internal.ads.G4");
    }

    private static ByteBuffer g() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(com.google.android.gms.internal.ads.C4099qh0 r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.C3114i1 r33, com.google.android.gms.internal.ads.C2775f4 r34, int r35) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3233j4.h(com.google.android.gms.internal.ads.qh0, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.i1, com.google.android.gms.internal.ads.f4, int):void");
    }

    public static C1735Ot zza(Z3 z32) {
        C4113qo0 c4113qo0;
        C2202a4 c2202a4Zzb = z32.zzb(1751411826);
        C2202a4 c2202a4Zzb2 = z32.zzb(1801812339);
        C2202a4 c2202a4Zzb3 = z32.zzb(1768715124);
        if (c2202a4Zzb != null && c2202a4Zzb2 != null && c2202a4Zzb3 != null && b(c2202a4Zzb.zza) == 1835299937) {
            C4099qh0 c4099qh0 = c2202a4Zzb2.zza;
            c4099qh0.zzK(12);
            int iZzg = c4099qh0.zzg();
            String[] strArr = new String[iZzg];
            for (int i8 = 0; i8 < iZzg; i8++) {
                int iZzg2 = c4099qh0.zzg();
                c4099qh0.zzL(4);
                strArr[i8] = c4099qh0.zzA(iZzg2 - 8, AbstractC3647mj0.zzc);
            }
            C4099qh0 c4099qh02 = c2202a4Zzb3.zza;
            c4099qh02.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (c4099qh02.zzb() > 8) {
                int iZzd = c4099qh02.zzd() + c4099qh02.zzg();
                int iZzg3 = c4099qh02.zzg() - 1;
                if (iZzg3 < 0 || iZzg3 >= iZzg) {
                    AbstractC2834fc0.zzf("AtomParsers", "Skipped metadata with unknown key index: " + iZzg3);
                } else {
                    String str = strArr[iZzg3];
                    int i9 = AbstractC4372t4.zzb;
                    while (true) {
                        int iZzd2 = c4099qh02.zzd();
                        if (iZzd2 >= iZzd) {
                            c4113qo0 = null;
                            break;
                        }
                        int iZzg4 = c4099qh02.zzg();
                        if (c4099qh02.zzg() == 1684108385) {
                            int iZzg5 = c4099qh02.zzg();
                            int iZzg6 = c4099qh02.zzg();
                            int i10 = iZzg4 - 16;
                            byte[] bArr = new byte[i10];
                            c4099qh02.zzG(bArr, 0, i10);
                            c4113qo0 = new C4113qo0(str, bArr, iZzg6, iZzg5);
                            break;
                        }
                        c4099qh02.zzK(iZzd2 + iZzg4);
                    }
                    if (c4113qo0 != null) {
                        arrayList.add(c4113qo0);
                    }
                }
                c4099qh02.zzK(iZzd);
            }
            if (!arrayList.isEmpty()) {
                return new C1735Ot(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C1735Ot zzb(com.google.android.gms.internal.ads.C2202a4 r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3233j4.zzb(com.google.android.gms.internal.ads.a4):com.google.android.gms.internal.ads.Ot");
    }

    public static C4688vr0 zzc(C4099qh0 c4099qh0) {
        long jZzt;
        long jZzt2;
        c4099qh0.zzK(8);
        if (C2317b4.zze(c4099qh0.zzg()) == 0) {
            jZzt = c4099qh0.zzu();
            jZzt2 = c4099qh0.zzu();
        } else {
            jZzt = c4099qh0.zzt();
            jZzt2 = c4099qh0.zzt();
        }
        return new C4688vr0(jZzt, jZzt2, c4099qh0.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0b70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.Z3 r56, com.google.android.gms.internal.ads.C4252s1 r57, long r58, com.google.android.gms.internal.ads.C3114i1 r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.InterfaceC3875oj0 r63) {
        /*
            Method dump skipped, instructions count: 2938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3233j4.zzd(com.google.android.gms.internal.ads.Z3, com.google.android.gms.internal.ads.s1, long, com.google.android.gms.internal.ads.i1, boolean, boolean, com.google.android.gms.internal.ads.oj0):java.util.List");
    }

    public static void zze(C4099qh0 c4099qh0) {
        int iZzd = c4099qh0.zzd();
        c4099qh0.zzL(4);
        if (c4099qh0.zzg() != 1751411826) {
            iZzd += 4;
        }
        c4099qh0.zzK(iZzd);
    }
}
