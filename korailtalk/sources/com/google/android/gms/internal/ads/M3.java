package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
final class M3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f14526a = new C4099qh0(8);

    /* renamed from: b, reason: collision with root package name */
    private int f14527b;

    private final long a(InterfaceC2540d1 interfaceC2540d1) {
        int i8;
        Q0 q02 = (Q0) interfaceC2540d1;
        int i9 = 0;
        q02.zzm(this.f14526a.zzM(), 0, 1, false);
        int i10 = this.f14526a.zzM()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while (true) {
            i8 = i12 + 1;
            if ((i10 & i11) != 0) {
                break;
            }
            i11 >>= 1;
            i12 = i8;
        }
        int i13 = i10 & (~i11);
        q02.zzm(this.f14526a.zzM(), 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (this.f14526a.zzM()[i9] & 255) + (i13 << 8);
        }
        this.f14527b += i8;
        return i13;
    }

    public final boolean zza(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        long jZzd = interfaceC2540d1.zzd();
        long j8 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (jZzd != -1 && jZzd <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j8 = jZzd;
        }
        Q0 q02 = (Q0) interfaceC2540d1;
        q02.zzm(this.f14526a.zzM(), 0, 4, false);
        long jZzu = this.f14526a.zzu();
        this.f14527b = 4;
        while (jZzu != 440786851) {
            int i8 = (int) j8;
            int i9 = this.f14527b + 1;
            this.f14527b = i9;
            if (i9 == i8) {
                return false;
            }
            q02.zzm(this.f14526a.zzM(), 0, 1, false);
            jZzu = ((jZzu << 8) & (-256)) | (this.f14526a.zzM()[0] & 255);
        }
        long jA = a(interfaceC2540d1);
        long j9 = this.f14527b;
        if (jA != Long.MIN_VALUE) {
            long j10 = j9 + jA;
            if (jZzd == -1 || j10 < jZzd) {
                while (true) {
                    long j11 = this.f14527b;
                    if (j11 < j10) {
                        if (a(interfaceC2540d1) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jA2 = a(interfaceC2540d1);
                        if (jA2 < 0) {
                            return false;
                        }
                        if (jA2 != 0) {
                            int i10 = (int) jA2;
                            q02.zzl(i10, false);
                            this.f14527b += i10;
                        }
                    } else if (j11 == j10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
