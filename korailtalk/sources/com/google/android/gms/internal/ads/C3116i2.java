package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3116i2 extends M0 {
    public C3116i2(final C3911p1 c3911p1, int i8, long j8, long j9) {
        long j10;
        Objects.requireNonNull(c3911p1);
        J0 j02 = new J0() { // from class: com.google.android.gms.internal.ads.f2
            @Override // com.google.android.gms.internal.ads.J0
            public final long zza(long j11) {
                return c3911p1.zzb(j11);
            }
        };
        C3001h2 c3001h2 = new C3001h2(c3911p1, i8, null);
        long jZza = c3911p1.zza();
        long j11 = c3911p1.zzj;
        int i9 = c3911p1.zzd;
        if (i9 > 0) {
            j10 = ((i9 + c3911p1.zzc) / 2) + 1;
        } else {
            int i10 = c3911p1.zza;
            int i11 = c3911p1.zzb;
            long j12 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i10 == i11 && i10 > 0) {
                j12 = i10;
            }
            j10 = (((j12 * c3911p1.zzg) * c3911p1.zzh) / 8) + 64;
        }
        super(j02, c3001h2, jZza, 0L, j11, j8, j9, j10, Math.max(6, c3911p1.zzc));
    }
}
