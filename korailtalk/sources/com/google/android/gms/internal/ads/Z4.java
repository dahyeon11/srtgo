package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class Z4 extends X4 {

    /* renamed from: n, reason: collision with root package name */
    private Y4 f17481n;

    /* renamed from: o, reason: collision with root package name */
    private int f17482o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17483p;

    /* renamed from: q, reason: collision with root package name */
    private P1 f17484q;

    /* renamed from: r, reason: collision with root package name */
    private N1 f17485r;

    Z4() {
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final long a(C4099qh0 c4099qh0) {
        if ((c4099qh0.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b9 = c4099qh0.zzM()[0];
        Y4 y42 = this.f17481n;
        F10.zzb(y42);
        int i8 = !y42.zzd[(b9 >> 1) & (255 >>> (8 - y42.zze))].zza ? y42.zza.zze : y42.zza.zzf;
        int i9 = this.f17483p ? (this.f17482o + i8) / 4 : 0;
        if (c4099qh0.zzc() < c4099qh0.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(c4099qh0.zzM(), c4099qh0.zze() + 4);
            c4099qh0.zzI(bArrCopyOf, bArrCopyOf.length);
        } else {
            c4099qh0.zzJ(c4099qh0.zze() + 4);
        }
        long j8 = i9;
        byte[] bArrZzM = c4099qh0.zzM();
        bArrZzM[c4099qh0.zze() - 4] = (byte) (j8 & 255);
        bArrZzM[c4099qh0.zze() - 3] = (byte) ((j8 >>> 8) & 255);
        bArrZzM[c4099qh0.zze() - 2] = (byte) ((j8 >>> 16) & 255);
        bArrZzM[c4099qh0.zze() - 1] = (byte) ((j8 >>> 24) & 255);
        this.f17483p = true;
        this.f17482o = i8;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final void b(boolean z8) {
        super.b(z8);
        if (z8) {
            this.f17481n = null;
            this.f17484q = null;
            this.f17485r = null;
        }
        this.f17482o = 0;
        this.f17483p = false;
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final boolean c(C4099qh0 c4099qh0, long j8, U4 u42) throws C1901Sv {
        Y4 y42;
        int i8;
        int iZzb;
        int i9;
        int i10;
        P1 p12;
        long jFloor;
        if (this.f17481n != null) {
            u42.f16576a.getClass();
            return false;
        }
        P1 p13 = this.f17484q;
        int i11 = 4;
        if (p13 == null) {
            Q1.zzd(1, c4099qh0, false);
            int iZzj = c4099qh0.zzj();
            int iZzm = c4099qh0.zzm();
            int iZzj2 = c4099qh0.zzj();
            int iZzi = c4099qh0.zzi();
            int i12 = iZzi <= 0 ? -1 : iZzi;
            int iZzi2 = c4099qh0.zzi();
            int i13 = iZzi2 <= 0 ? -1 : iZzi2;
            int iZzi3 = c4099qh0.zzi();
            int i14 = iZzi3 <= 0 ? -1 : iZzi3;
            int iZzm2 = c4099qh0.zzm();
            this.f17484q = new P1(iZzj, iZzm, iZzj2, i12, i13, i14, (int) Math.pow(2.0d, iZzm2 & 15), (int) Math.pow(2.0d, (iZzm2 & 240) >> 4), 1 == (c4099qh0.zzm() & 1), Arrays.copyOf(c4099qh0.zzM(), c4099qh0.zze()));
        } else {
            N1 n12 = this.f17485r;
            if (n12 == null) {
                this.f17485r = Q1.zzc(c4099qh0, true, true);
            } else {
                byte[] bArr = new byte[c4099qh0.zze()];
                System.arraycopy(c4099qh0.zzM(), 0, bArr, 0, c4099qh0.zze());
                int i15 = p13.zza;
                int i16 = 5;
                Q1.zzd(5, c4099qh0, false);
                int iZzm3 = c4099qh0.zzm() + 1;
                M1 m12 = new M1(c4099qh0.zzM());
                m12.zzc(c4099qh0.zzd() * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 >= iZzm3) {
                        P1 p14 = p13;
                        int i20 = 6;
                        int iZzb2 = m12.zzb(6) + 1;
                        for (int i21 = 0; i21 < iZzb2; i21++) {
                            if (m12.zzb(16) != 0) {
                                throw C1901Sv.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i22 = 1;
                        int iZzb3 = m12.zzb(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 < iZzb3) {
                                int iZzb4 = m12.zzb(i19);
                                if (iZzb4 == 0) {
                                    i9 = iZzb3;
                                    int i25 = 8;
                                    m12.zzc(8);
                                    m12.zzc(16);
                                    m12.zzc(16);
                                    m12.zzc(6);
                                    m12.zzc(8);
                                    int iZzb5 = m12.zzb(4) + 1;
                                    int i26 = 0;
                                    while (i26 < iZzb5) {
                                        m12.zzc(i25);
                                        i26++;
                                        i25 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i22) {
                                        throw C1901Sv.zza("floor type greater than 1 not decodable: " + iZzb4, null);
                                    }
                                    int iZzb6 = m12.zzb(i16);
                                    int[] iArr = new int[iZzb6];
                                    int i27 = -1;
                                    for (int i28 = 0; i28 < iZzb6; i28++) {
                                        int iZzb7 = m12.zzb(4);
                                        iArr[i28] = iZzb7;
                                        if (iZzb7 > i27) {
                                            i27 = iZzb7;
                                        }
                                    }
                                    int i29 = i27 + 1;
                                    int[] iArr2 = new int[i29];
                                    int i30 = 0;
                                    while (i30 < i29) {
                                        iArr2[i30] = m12.zzb(i24) + 1;
                                        int iZzb8 = m12.zzb(i18);
                                        if (iZzb8 > 0) {
                                            i10 = 8;
                                            m12.zzc(8);
                                        } else {
                                            i10 = 8;
                                        }
                                        int i31 = iZzb3;
                                        int i32 = 0;
                                        for (int i33 = 1; i32 < (i33 << iZzb8); i33 = 1) {
                                            m12.zzc(i10);
                                            i32++;
                                            i10 = 8;
                                        }
                                        i30++;
                                        iZzb3 = i31;
                                        i18 = 2;
                                        i24 = 3;
                                    }
                                    i9 = iZzb3;
                                    m12.zzc(i18);
                                    int iZzb9 = m12.zzb(4);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 0; i36 < iZzb6; i36++) {
                                        i34 += iArr2[iArr[i36]];
                                        while (i35 < i34) {
                                            m12.zzc(iZzb9);
                                            i35++;
                                        }
                                    }
                                }
                                i23++;
                                iZzb3 = i9;
                                i20 = 6;
                                i18 = 2;
                                i19 = 16;
                                i22 = 1;
                                i16 = 5;
                            } else {
                                int i37 = 1;
                                int iZzb10 = m12.zzb(i20) + 1;
                                int i38 = 0;
                                while (i38 < iZzb10) {
                                    if (m12.zzb(16) > 2) {
                                        throw C1901Sv.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    m12.zzc(24);
                                    m12.zzc(24);
                                    m12.zzc(24);
                                    int iZzb11 = m12.zzb(i20) + i37;
                                    int i39 = 8;
                                    m12.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i40 = 0; i40 < iZzb11; i40++) {
                                        iArr3[i40] = ((m12.zzd() ? m12.zzb(5) : 0) * 8) + m12.zzb(3);
                                    }
                                    int i41 = 0;
                                    while (i41 < iZzb11) {
                                        int i42 = 0;
                                        while (i42 < i39) {
                                            if ((iArr3[i41] & (1 << i42)) != 0) {
                                                m12.zzc(i39);
                                            }
                                            i42++;
                                            i39 = 8;
                                        }
                                        i41++;
                                        i39 = 8;
                                    }
                                    i38++;
                                    i20 = 6;
                                    i37 = 1;
                                }
                                int iZzb12 = m12.zzb(i20) + 1;
                                for (int i43 = 0; i43 < iZzb12; i43++) {
                                    int iZzb13 = m12.zzb(16);
                                    if (iZzb13 != 0) {
                                        AbstractC2834fc0.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb13);
                                    } else {
                                        if (m12.zzd()) {
                                            i8 = 1;
                                            iZzb = m12.zzb(4) + 1;
                                        } else {
                                            i8 = 1;
                                            iZzb = 1;
                                        }
                                        if (m12.zzd()) {
                                            int iZzb14 = m12.zzb(8) + i8;
                                            for (int i44 = 0; i44 < iZzb14; i44++) {
                                                int i45 = i15 - 1;
                                                m12.zzc(Q1.zza(i45));
                                                m12.zzc(Q1.zza(i45));
                                            }
                                        }
                                        if (m12.zzb(2) != 0) {
                                            throw C1901Sv.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i46 = 0; i46 < i15; i46++) {
                                                m12.zzc(4);
                                            }
                                        }
                                        for (int i47 = 0; i47 < iZzb; i47++) {
                                            m12.zzc(8);
                                            m12.zzc(8);
                                            m12.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = m12.zzb(6);
                                int i48 = iZzb15 + 1;
                                O1[] o1Arr = new O1[i48];
                                for (int i49 = 0; i49 < i48; i49++) {
                                    o1Arr[i49] = new O1(m12.zzd(), m12.zzb(16), m12.zzb(16), m12.zzb(8));
                                }
                                if (!m12.zzd()) {
                                    throw C1901Sv.zza("framing bit after modes not set as expected", null);
                                }
                                y42 = new Y4(p14, n12, bArr, o1Arr, Q1.zza(iZzb15));
                            }
                        }
                    } else {
                        if (m12.zzb(24) != 5653314) {
                            throw C1901Sv.zza("expected code book to start with [0x56, 0x43, 0x42] at " + m12.zza(), null);
                        }
                        int iZzb16 = m12.zzb(16);
                        int iZzb17 = m12.zzb(24);
                        if (m12.zzd()) {
                            m12.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += m12.zzb(Q1.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = m12.zzd();
                            for (int i50 = 0; i50 < iZzb17; i50++) {
                                if (!zZzd) {
                                    m12.zzc(5);
                                } else if (m12.zzd()) {
                                    m12.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = m12.zzb(i11);
                        if (iZzb19 > 2) {
                            throw C1901Sv.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                p12 = p13;
                            }
                            i17++;
                            p13 = p12;
                            i11 = 4;
                        } else {
                            i18 = iZzb19;
                        }
                        m12.zzc(32);
                        m12.zzc(32);
                        int iZzb20 = m12.zzb(i11) + 1;
                        m12.zzc(1);
                        if (i18 != 1) {
                            p12 = p13;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            p12 = p13;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            p12 = p13;
                            jFloor = 0;
                        }
                        m12.zzc((int) (jFloor * iZzb20));
                        i17++;
                        p13 = p12;
                        i11 = 4;
                    }
                }
            }
        }
        y42 = null;
        this.f17481n = y42;
        if (y42 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        P1 p15 = y42.zza;
        arrayList.add(p15.zzg);
        arrayList.add(y42.zzc);
        C1735Ot c1735OtZzb = Q1.zzb(AbstractC2394bl0.zzl(y42.zzb.zzb));
        O4 o42 = new O4();
        o42.zzX("audio/vorbis");
        o42.zzx(p15.zzd);
        o42.zzS(p15.zzc);
        o42.zzy(p15.zza);
        o42.zzY(p15.zzb);
        o42.zzL(arrayList);
        o42.zzQ(c1735OtZzb);
        u42.f16576a = o42.zzad();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final void h(long j8) {
        super.h(j8);
        this.f17483p = j8 != 0;
        P1 p12 = this.f17484q;
        this.f17482o = p12 != null ? p12.zze : 0;
    }
}
