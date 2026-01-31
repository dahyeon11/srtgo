package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.Ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1298Ed {
    static long a(long j8, int i8) {
        if (i8 == 1) {
            return j8;
        }
        int i9 = i8 >> 1;
        long j9 = (j8 * j8) % 1073807359;
        return ((i8 & 1) == 0 ? a(j9, i9) : j8 * (a(j9, i9) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i8, int i9) {
        int i10 = i9 + i8;
        if (strArr.length < i10) {
            L1.n.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i10 - 1;
            if (i8 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i8]);
            sb.append(' ');
            i8++;
        }
    }

    static void c(int i8, long j8, String str, int i9, PriorityQueue priorityQueue) {
        C1257Dd c1257Dd = new C1257Dd(j8, str, i9);
        if ((priorityQueue.size() != i8 || (((C1257Dd) priorityQueue.peek()).f12698c <= c1257Dd.f12698c && ((C1257Dd) priorityQueue.peek()).f12696a <= c1257Dd.f12696a)) && !priorityQueue.contains(c1257Dd)) {
            priorityQueue.add(c1257Dd);
            if (priorityQueue.size() > i8) {
                priorityQueue.poll();
            }
        }
    }

    private static long d(String[] strArr, int i8, int i9) {
        long jZza = (AbstractC1175Bd.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i10 = 1; i10 < i9; i10++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((AbstractC1175Bd.zza(strArr[i10]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jZza;
    }

    public static void zzc(String[] strArr, int i8, int i9, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            c(i8, d(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jD = d(strArr, 0, 6);
        c(i8, jD, b(strArr, 0, 6), 6, priorityQueue);
        int i10 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i10 >= length2 - 5) {
                return;
            }
            long jZza = AbstractC1175Bd.zza(strArr[i10 - 1]);
            long jZza2 = AbstractC1175Bd.zza(strArr[i10 + 5]);
            String strB = b(strArr, i10, 6);
            jD = ((((((jD + 1073807359) - ((a(16785407L, 5) * ((jZza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + 2147483647L) % 1073807359)) % 1073807359;
            c(i8, jD, strB, length2, priorityQueue);
            i10++;
        }
    }
}
