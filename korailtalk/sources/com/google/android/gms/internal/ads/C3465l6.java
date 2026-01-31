package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3465l6 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.k6
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3465l6()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C3579m6 f20632a = new C3579m6(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f20633b = new C4099qh0(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f20634c;

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        int iZza = interfaceC2540d1.zza(this.f20633b.zzM(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.f20633b.zzK(0);
        this.f20633b.zzJ(iZza);
        if (!this.f20634c) {
            this.f20632a.zzd(0L, 4);
            this.f20634c = true;
        }
        this.f20632a.zza(this.f20633b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f20632a.zzb(interfaceC2769f1, new C3011h7(Integer.MIN_VALUE, 0, 1));
        interfaceC2769f1.zzD();
        interfaceC2769f1.zzO(new B1(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f20634c = false;
        this.f20632a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        int i8;
        boolean z8 = true;
        C4099qh0 c4099qh0 = new C4099qh0(10);
        int i9 = 0;
        while (true) {
            Q0 q02 = (Q0) interfaceC2540d1;
            q02.zzm(c4099qh0.zzM(), 0, 10, false);
            c4099qh0.zzK(0);
            if (c4099qh0.zzo() != 4801587) {
                break;
            }
            c4099qh0.zzL(3);
            int iZzl = c4099qh0.zzl();
            i9 += iZzl + 10;
            q02.zzl(iZzl, false);
            z8 = true;
        }
        interfaceC2540d1.zzj();
        Q0 q03 = (Q0) interfaceC2540d1;
        q03.zzl(i9, false);
        int i10 = 0;
        int i11 = i9;
        while (true) {
            int i12 = 7;
            q03.zzm(c4099qh0.zzM(), 0, 7, false);
            c4099qh0.zzK(0);
            int iZzq = c4099qh0.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i10 += z8 ? 1 : 0;
                if (i10 >= 4) {
                    return z8;
                }
                byte[] bArrZzM = c4099qh0.zzM();
                int i13 = D0.zza;
                if (bArrZzM.length < 7) {
                    i8 = -1;
                } else {
                    int i14 = (bArrZzM[3] & 255) | ((bArrZzM[2] & 255) << 8);
                    if (i14 == 65535) {
                        i14 = ((bArrZzM[4] & 255) << 16) | ((bArrZzM[5] & 255) << 8) | (bArrZzM[6] & 255);
                    } else {
                        i12 = 4;
                    }
                    if (iZzq == 44097) {
                        i12 += 2;
                    }
                    i8 = i14 + i12;
                }
                if (i8 == -1) {
                    return false;
                }
                q03.zzl(i8 - 7, false);
                z8 = true;
            } else {
                interfaceC2540d1.zzj();
                i11 += z8 ? 1 : 0;
                if (i11 - i9 >= 8192) {
                    return false;
                }
                q03.zzl(i11, false);
                i10 = 0;
            }
        }
    }
}
