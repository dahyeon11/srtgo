package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.s7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4264s7 {
    private static C4150r7 a(int i8, InterfaceC2540d1 interfaceC2540d1, C4099qh0 c4099qh0) throws C1901Sv, EOFException, InterruptedIOException {
        C4150r7 c4150r7Zza = C4150r7.zza(interfaceC2540d1, c4099qh0);
        while (true) {
            int i9 = c4150r7Zza.zza;
            if (i9 == i8) {
                return c4150r7Zza;
            }
            AbstractC2834fc0.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i9);
            long j8 = c4150r7Zza.zzb;
            long j9 = 8 + j8;
            if ((1 & j8) != 0) {
                j9 = j8 + 9;
            }
            if (j9 > 2147483647L) {
                throw C1901Sv.zzc("Chunk is too large (~2GB+) to skip; id: " + c4150r7Zza.zza);
            }
            ((Q0) interfaceC2540d1).zzo((int) j9, false);
            c4150r7Zza = C4150r7.zza(interfaceC2540d1, c4099qh0);
        }
    }

    public static Pair zza(InterfaceC2540d1 interfaceC2540d1) throws C1901Sv, EOFException, InterruptedIOException {
        interfaceC2540d1.zzj();
        C4150r7 c4150r7A = a(1684108385, interfaceC2540d1, new C4099qh0(8));
        ((Q0) interfaceC2540d1).zzo(8, false);
        return Pair.create(Long.valueOf(interfaceC2540d1.zzf()), Long.valueOf(c4150r7A.zzb));
    }

    public static C4037q7 zzb(InterfaceC2540d1 interfaceC2540d1) throws C1901Sv, EOFException, InterruptedIOException {
        byte[] bArr;
        C4099qh0 c4099qh0 = new C4099qh0(16);
        C4150r7 c4150r7A = a(1718449184, interfaceC2540d1, c4099qh0);
        F10.zzf(c4150r7A.zzb >= 16);
        Q0 q02 = (Q0) interfaceC2540d1;
        q02.zzm(c4099qh0.zzM(), 0, 16, false);
        c4099qh0.zzK(0);
        int iZzk = c4099qh0.zzk();
        int iZzk2 = c4099qh0.zzk();
        int iZzj = c4099qh0.zzj();
        int iZzj2 = c4099qh0.zzj();
        int iZzk3 = c4099qh0.zzk();
        int iZzk4 = c4099qh0.zzk();
        int i8 = ((int) c4150r7A.zzb) - 16;
        if (i8 > 0) {
            byte[] bArr2 = new byte[i8];
            q02.zzm(bArr2, 0, i8, false);
            bArr = bArr2;
        } else {
            bArr = AbstractC2281am0.zzf;
        }
        ((Q0) interfaceC2540d1).zzo((int) (interfaceC2540d1.zze() - interfaceC2540d1.zzf()), false);
        return new C4037q7(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr);
    }

    public static boolean zzc(InterfaceC2540d1 interfaceC2540d1) {
        C4099qh0 c4099qh0 = new C4099qh0(8);
        int i8 = C4150r7.zza(interfaceC2540d1, c4099qh0).zza;
        if (i8 != 1380533830 && i8 != 1380333108) {
            return false;
        }
        ((Q0) interfaceC2540d1).zzm(c4099qh0.zzM(), 0, 4, false);
        c4099qh0.zzK(0);
        int iZzg = c4099qh0.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        AbstractC2834fc0.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }
}
