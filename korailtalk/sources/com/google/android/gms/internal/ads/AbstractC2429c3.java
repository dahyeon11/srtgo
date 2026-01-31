package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2429c3 {
    public static final InterfaceC2200a3 zza = new InterfaceC2200a3() { // from class: com.google.android.gms.internal.ads.Z2
    };

    private static int a(int i8) {
        return (i8 == 0 || i8 == 3) ? 1 : 2;
    }

    private static int b(byte[] bArr, int i8, int i9) {
        int iC = c(bArr, i8);
        if (i9 == 0 || i9 == 3) {
            return iC;
        }
        while (true) {
            int length = bArr.length;
            if (iC >= length - 1) {
                return length;
            }
            int i10 = iC + 1;
            if ((iC - i8) % 2 == 0 && bArr[i10] == 0) {
                return iC;
            }
            iC = c(bArr, i10);
        }
    }

    private static int c(byte[] bArr, int i8) {
        while (true) {
            int length = bArr.length;
            if (i8 >= length) {
                return length;
            }
            if (bArr[i8] == 0) {
                return i8;
            }
            i8++;
        }
    }

    private static int d(C4099qh0 c4099qh0, int i8) {
        byte[] bArrZzM = c4099qh0.zzM();
        int iZzd = c4099qh0.zzd();
        int i9 = iZzd;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= iZzd + i8) {
                return i8;
            }
            if ((bArrZzM[i9] & 255) == 255 && bArrZzM[i10] == 0) {
                System.arraycopy(bArrZzM, i9 + 2, bArrZzM, i10, (i8 - (i9 - iZzd)) - 2);
                i8--;
            }
            i9 = i10;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.AbstractC2544d3 e(int r35, com.google.android.gms.internal.ads.C4099qh0 r36, boolean r37, int r38, com.google.android.gms.internal.ads.InterfaceC2200a3 r39) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2429c3.e(int, com.google.android.gms.internal.ads.qh0, boolean, int, com.google.android.gms.internal.ads.a3):com.google.android.gms.internal.ads.d3");
    }

    private static AbstractC2394bl0 f(byte[] bArr, int i8, int i9) {
        if (i9 >= bArr.length) {
            return AbstractC2394bl0.zzn("");
        }
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        int iB = b(bArr, i9, i8);
        while (i9 < iB) {
            c2091Xk0.zzf(new String(bArr, i9, iB - i9, i(i8)));
            i9 = a(i8) + iB;
            iB = b(bArr, i9, i8);
        }
        AbstractC2394bl0 abstractC2394bl0Zzi = c2091Xk0.zzi();
        return abstractC2394bl0Zzi.isEmpty() ? AbstractC2394bl0.zzn("") : abstractC2394bl0Zzi;
    }

    private static String g(byte[] bArr, int i8, int i9, Charset charset) {
        return (i9 <= i8 || i9 > bArr.length) ? "" : new String(bArr, i8, i9 - i8, charset);
    }

    private static String h(int i8, int i9, int i10, int i11, int i12) {
        return i8 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static Charset i(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? AbstractC3647mj0.zzb : AbstractC3647mj0.zzc : AbstractC3647mj0.zzd : AbstractC3647mj0.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean j(com.google.android.gms.internal.ads.C4099qh0 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> L22
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> L22
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> L22
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.zzL(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.zzK(r2)
            return r4
        Lab:
            r1.zzK(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2429c3.j(com.google.android.gms.internal.ads.qh0, int, int, boolean):boolean");
    }

    private static byte[] k(byte[] bArr, int i8, int i9) {
        return i9 <= i8 ? AbstractC2281am0.zzf : Arrays.copyOfRange(bArr, i8, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.C1735Ot zza(byte[] r11, int r12, com.google.android.gms.internal.ads.InterfaceC2200a3 r13, com.google.android.gms.internal.ads.C2 r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2429c3.zza(byte[], int, com.google.android.gms.internal.ads.a3, com.google.android.gms.internal.ads.C2):com.google.android.gms.internal.ads.Ot");
    }
}
