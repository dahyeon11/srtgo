package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3569m1 {
    public static C1735Ot zza(InterfaceC2540d1 interfaceC2540d1, boolean z8) throws EOFException, InterruptedIOException {
        C1735Ot c1735OtZza = new C4480u1().zza(interfaceC2540d1, z8 ? null : AbstractC2429c3.zza);
        if (c1735OtZza == null || c1735OtZza.zza() == 0) {
            return null;
        }
        return c1735OtZza;
    }

    public static C3797o1 zzb(C4099qh0 c4099qh0) {
        c4099qh0.zzL(1);
        int iZzo = c4099qh0.zzo();
        long jZzd = c4099qh0.zzd();
        long j8 = iZzo;
        int i8 = iZzo / 18;
        long[] jArrCopyOf = new long[i8];
        long[] jArrCopyOf2 = new long[i8];
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            long jZzt = c4099qh0.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
                break;
            }
            jArrCopyOf[i9] = jZzt;
            jArrCopyOf2[i9] = c4099qh0.zzt();
            c4099qh0.zzL(2);
            i9++;
        }
        c4099qh0.zzL((int) ((jZzd + j8) - c4099qh0.zzd()));
        return new C3797o1(jArrCopyOf, jArrCopyOf2);
    }
}
