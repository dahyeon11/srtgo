package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.l1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3455l1 {
    private static boolean a(C4099qh0 c4099qh0, C3911p1 c3911p1, boolean z8, C3341k1 c3341k1) {
        try {
            long jZzw = c4099qh0.zzw();
            if (!z8) {
                jZzw *= c3911p1.zzb;
            }
            c3341k1.zza = jZzw;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int zza(C4099qh0 c4099qh0, int i8) {
        switch (i8) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i8 - 2);
            case 6:
                return c4099qh0.zzm() + 1;
            case 7:
                return c4099qh0.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i8 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(InterfaceC2540d1 interfaceC2540d1, C3911p1 c3911p1) throws C1901Sv, EOFException, InterruptedIOException {
        interfaceC2540d1.zzj();
        Q0 q02 = (Q0) interfaceC2540d1;
        q02.zzl(1, false);
        byte[] bArr = new byte[1];
        q02.zzm(bArr, 0, 1, false);
        int i8 = bArr[0] & 1;
        boolean z8 = 1 == i8;
        q02.zzl(2, false);
        int i9 = 1 != i8 ? 6 : 7;
        C4099qh0 c4099qh0 = new C4099qh0(i9);
        c4099qh0.zzJ(AbstractC2884g1.zza(interfaceC2540d1, c4099qh0.zzM(), 0, i9));
        interfaceC2540d1.zzj();
        C3341k1 c3341k1 = new C3341k1();
        if (a(c4099qh0, c3911p1, z8, c3341k1)) {
            return c3341k1.zza;
        }
        throw C1901Sv.zza(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzc(com.google.android.gms.internal.ads.C4099qh0 r21, com.google.android.gms.internal.ads.C3911p1 r22, int r23, com.google.android.gms.internal.ads.C3341k1 r24) {
        /*
            r0 = r21
            r1 = r22
            int r2 = r21.zzd()
            long r3 = r21.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r23
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            long r6 = r15 & r19
            int r6 = (int) r6
            r7 = 7
            r15 = -1
            if (r6 > r7) goto L41
            int r7 = r1.zzg
            int r7 = r7 + r15
            if (r6 != r7) goto Lb0
            goto L4a
        L41:
            r7 = 10
            if (r6 > r7) goto Lb0
            int r6 = r1.zzg
            r7 = 2
            if (r6 != r7) goto Lb0
        L4a:
            r6 = 7
            long r6 = r17 & r6
            int r6 = (int) r6
            if (r6 != 0) goto L52
            goto L56
        L52:
            int r7 = r1.zzi
            if (r6 != r7) goto Lb0
        L56:
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lb0
            r3 = r24
            boolean r3 = a(r0, r1, r5, r3)
            if (r3 == 0) goto Lb0
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = zza(r0, r3)
            if (r3 == r15) goto Lb0
            int r4 = r1.zzb
            if (r3 > r4) goto Lb0
            long r3 = r13 & r19
            int r5 = r1.zze
            int r3 = (int) r3
            if (r3 != 0) goto L77
            goto L9b
        L77:
            r4 = 11
            if (r3 > r4) goto L80
            int r1 = r1.zzf
            if (r3 == r1) goto L9b
            goto Lb0
        L80:
            r1 = 12
            if (r3 != r1) goto L8d
            int r1 = r21.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto Lb0
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Lb0
            int r4 = r21.zzq()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Lb0
        L9b:
            int r1 = r21.zzm()
            int r3 = r21.zzd()
            byte[] r0 = r21.zzM()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.AbstractC2281am0.zzf(r0, r2, r3, r8)
            if (r1 != r0) goto Lb0
            r0 = 1
            return r0
        Lb0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3455l1.zzc(com.google.android.gms.internal.ads.qh0, com.google.android.gms.internal.ads.p1, int, com.google.android.gms.internal.ads.k1):boolean");
    }
}
