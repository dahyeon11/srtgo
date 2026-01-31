package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class YN0 extends C2358bO0 {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2589dP0 f17367f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC2394bl0 f17368g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3002h20 f17369h;

    protected YN0(TH th, int[] iArr, int i8, InterfaceC2589dP0 interfaceC2589dP0, long j8, long j9, long j10, int i9, int i10, float f8, float f9, List list, InterfaceC3002h20 interfaceC3002h20) {
        super(th, iArr, 0);
        this.f17367f = interfaceC2589dP0;
        this.f17368g = AbstractC2394bl0.zzk(list);
        this.f17369h = interfaceC3002h20;
    }

    static /* bridge */ /* synthetic */ AbstractC2394bl0 a(OO0[] oo0Arr) {
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i8 = 2;
            i9 = 1;
            if (i11 >= 2) {
                break;
            }
            OO0 oo0 = oo0Arr[i11];
            if (oo0 == null || oo0.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                C2091Xk0 c2091Xk0 = new C2091Xk0();
                c2091Xk0.zzf(new WN0(0L, 0L));
                arrayList.add(c2091Xk0);
            }
            i11++;
        }
        long[][] jArr = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            OO0 oo02 = oo0Arr[i12];
            if (oo02 == null) {
                jArr[i12] = new long[0];
            } else {
                jArr[i12] = new long[oo02.zzb.length];
                int i13 = 0;
                while (true) {
                    int[] iArr = oo02.zzb;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    long j8 = oo02.zza.zzb(iArr[i13]).zzj;
                    long[] jArr2 = jArr[i12];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr2[i13] = j8;
                    i13++;
                }
                Arrays.sort(jArr[i12]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr4 = jArr[i14];
            jArr3[i14] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        b(arrayList, jArr3);
        InterfaceC3651ml0 interfaceC3651ml0Zza = AbstractC1479Il0.zzc(AbstractC1683Nl0.zzc()).zzb(2).zza();
        int i15 = 0;
        while (i15 < i8) {
            int length = jArr[i15].length;
            if (length > i9) {
                double[] dArr = new double[length];
                int i16 = i10;
                while (true) {
                    long[] jArr5 = jArr[i15];
                    double dLog = 0.0d;
                    if (i16 >= jArr5.length) {
                        break;
                    }
                    long j9 = jArr5[i16];
                    if (j9 != -1) {
                        dLog = Math.log(j9);
                    }
                    dArr[i16] = dLog;
                    i16++;
                }
                int i17 = length - 1;
                double d9 = dArr[i17] - dArr[i10];
                int i18 = i10;
                while (i18 < i17) {
                    double d10 = dArr[i18];
                    i18++;
                    interfaceC3651ml0Zza.zzq(Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i18]) * 0.5d) - dArr[i10]) / d9), Integer.valueOf(i15));
                    i10 = 0;
                }
            }
            i15++;
            i10 = 0;
            i8 = 2;
            i9 = 1;
        }
        AbstractC2394bl0 abstractC2394bl0Zzk = AbstractC2394bl0.zzk(interfaceC3651ml0Zza.zzr());
        for (int i19 = 0; i19 < abstractC2394bl0Zzk.size(); i19++) {
            int iIntValue = ((Integer) abstractC2394bl0Zzk.get(i19)).intValue();
            int i20 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i20;
            jArr3[iIntValue] = jArr[iIntValue][i20];
            b(arrayList, jArr3);
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (arrayList.get(i21) != null) {
                long j10 = jArr3[i21];
                jArr3[i21] = j10 + j10;
            }
        }
        b(arrayList, jArr3);
        C2091Xk0 c2091Xk02 = new C2091Xk0();
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            C2091Xk0 c2091Xk03 = (C2091Xk0) arrayList.get(i22);
            c2091Xk02.zzf(c2091Xk03 == null ? AbstractC2394bl0.zzm() : c2091Xk03.zzi());
        }
        return c2091Xk02.zzi();
    }

    private static void b(List list, long[] jArr) {
        long j8 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            j8 += jArr[i8];
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            C2091Xk0 c2091Xk0 = (C2091Xk0) list.get(i9);
            if (c2091Xk0 != null) {
                c2091Xk0.zzf(new WN0(j8, jArr[i9]));
            }
        }
    }
}
