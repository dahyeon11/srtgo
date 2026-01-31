package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class SO0 extends VO0 {

    /* renamed from: c */
    private RO0 f16281c;

    protected abstract Pair c(RO0 ro0, int[][][] iArr, int[] iArr2, NM0 nm0, RG rg);

    @Override // com.google.android.gms.internal.ads.VO0
    public final WO0 zzp(GG0[] gg0Arr, SN0 sn0, NM0 nm0, RG rg) {
        boolean z8;
        int[] iArr;
        int[] iArr2 = new int[3];
        TH[][] thArr = new TH[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = sn0.zzc;
            thArr[i8] = new TH[i9];
            iArr3[i8] = new int[i9][];
        }
        int i10 = 2;
        int[] iArr4 = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr4[i11] = gg0Arr[i11].zze();
        }
        int i12 = 0;
        while (i12 < sn0.zzc) {
            TH thZzb = sn0.zzb(i12);
            int i13 = thZzb.zzd;
            int i14 = i10;
            int i15 = 0;
            int i16 = 0;
            boolean z9 = true;
            while (i15 < i10) {
                GG0 gg0 = gg0Arr[i15];
                int iMax = 0;
                for (int i17 = 0; i17 < thZzb.zzb; i17++) {
                    iMax = Math.max(iMax, gg0.zzY(thZzb.zzb(i17)) & 7);
                }
                boolean z10 = iArr2[i15] == 0;
                if (iMax > i16) {
                    z9 = z10;
                    i14 = i15;
                    i16 = iMax;
                } else if (iMax == i16 && i13 == 5 && !z9 && z10) {
                    i14 = i15;
                    i16 = iMax;
                    z9 = true;
                }
                i15++;
                i10 = 2;
            }
            if (i14 == i10) {
                iArr = new int[thZzb.zzb];
            } else {
                GG0 gg02 = gg0Arr[i14];
                int[] iArr5 = new int[thZzb.zzb];
                for (int i18 = 0; i18 < thZzb.zzb; i18++) {
                    iArr5[i18] = gg02.zzY(thZzb.zzb(i18));
                }
                iArr = iArr5;
            }
            int i19 = iArr2[i14];
            thArr[i14][i19] = thZzb;
            iArr3[i14][i19] = iArr;
            iArr2[i14] = i19 + 1;
            i12++;
            i10 = 2;
        }
        int i20 = i10;
        boolean z11 = true;
        SN0[] sn0Arr = new SN0[i20];
        String[] strArr = new String[i20];
        int[] iArr6 = new int[i20];
        int i21 = 0;
        while (i21 < i20) {
            int i22 = iArr2[i21];
            sn0Arr[i21] = new SN0((TH[]) AbstractC2281am0.zzP(thArr[i21], i22));
            iArr3[i21] = (int[][]) AbstractC2281am0.zzP(iArr3[i21], i22);
            strArr[i21] = gg0Arr[i21].zzU();
            iArr6[i21] = gg0Arr[i21].zzb();
            i21++;
            i20 = 2;
        }
        int i23 = i20;
        RO0 ro0 = new RO0(strArr, iArr6, sn0Arr, iArr4, iArr3, new SN0((TH[]) AbstractC2281am0.zzP(thArr[i23], iArr2[i23])));
        Pair pairC = c(ro0, iArr3, iArr4, nm0, rg);
        TO0[] to0Arr = (TO0[]) pairC.second;
        List[] listArr = new List[to0Arr.length];
        for (int i24 = 0; i24 < to0Arr.length; i24++) {
            TO0 to0 = to0Arr[i24];
            listArr[i24] = to0 != null ? AbstractC2394bl0.zzn(to0) : AbstractC2394bl0.zzm();
        }
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        int i25 = 0;
        for (int i26 = 2; i25 < i26; i26 = 2) {
            SN0 sn0Zzd = ro0.zzd(i25);
            List list = listArr[i25];
            int i27 = 0;
            while (i27 < sn0Zzd.zzc) {
                TH thZzb2 = sn0Zzd.zzb(i27);
                boolean z12 = ro0.zza(i25, i27, false) != 0 ? z11 : false;
                int i28 = thZzb2.zzb;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < thZzb2.zzb; i29++) {
                    iArr7[i29] = ro0.zzb(i25, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z8 = false;
                            break;
                        }
                        TO0 to02 = (TO0) list.get(i30);
                        if (to02.zze().equals(thZzb2) && to02.zzb(i29) != -1) {
                            z8 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z8;
                }
                c2091Xk0.zzf(new C2355bN(thZzb2, z12, iArr7, zArr));
                i27++;
                z11 = true;
            }
            i25++;
            z11 = true;
        }
        SN0 sn0Zze = ro0.zze();
        for (int i31 = 0; i31 < sn0Zze.zzc; i31++) {
            TH thZzb3 = sn0Zze.zzb(i31);
            int[] iArr8 = new int[thZzb3.zzb];
            Arrays.fill(iArr8, 0);
            c2091Xk0.zzf(new C2355bN(thZzb3, false, iArr8, new boolean[thZzb3.zzb]));
        }
        return new WO0((HG0[]) pairC.first, (PO0[]) pairC.second, new CN(c2091Xk0.zzi()), ro0);
    }

    @Override // com.google.android.gms.internal.ads.VO0
    public final void zzq(Object obj) {
        this.f16281c = (RO0) obj;
    }
}
