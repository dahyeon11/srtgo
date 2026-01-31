package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2884g1 {
    public static int zza(InterfaceC2540d1 interfaceC2540d1, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int iZzb = interfaceC2540d1.zzb(bArr, i8 + i10, i9 - i10);
            if (iZzb == -1) {
                break;
            }
            i10 += iZzb;
        }
        return i10;
    }

    public static void zzb(boolean z8, String str) throws C1901Sv {
        if (!z8) {
            throw C1901Sv.zza(str, null);
        }
    }

    public static boolean zzc(InterfaceC2540d1 interfaceC2540d1, byte[] bArr, int i8, int i9, boolean z8) throws EOFException {
        try {
            return interfaceC2540d1.zzm(bArr, 0, i9, z8);
        } catch (EOFException e8) {
            if (z8) {
                return false;
            }
            throw e8;
        }
    }

    public static boolean zzd(InterfaceC2540d1 interfaceC2540d1, byte[] bArr, int i8, int i9) throws InterruptedIOException {
        try {
            ((Q0) interfaceC2540d1).zzn(bArr, i8, i9, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(InterfaceC2540d1 interfaceC2540d1, int i8) throws InterruptedIOException {
        try {
            ((Q0) interfaceC2540d1).zzo(i8, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
