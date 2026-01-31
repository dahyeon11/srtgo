package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3124i6 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.h6
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3124i6()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C3237j6 f19886a = new C3237j6(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f19887b = new C4099qh0(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f19888c;

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        int iZza = interfaceC2540d1.zza(this.f19887b.zzM(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.f19887b.zzK(0);
        this.f19887b.zzJ(iZza);
        if (!this.f19888c) {
            this.f19886a.zzd(0L, 4);
            this.f19888c = true;
        }
        this.f19886a.zza(this.f19887b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f19886a.zzb(interfaceC2769f1, new C3011h7(Integer.MIN_VALUE, 0, 1));
        interfaceC2769f1.zzD();
        interfaceC2769f1.zzO(new B1(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f19888c = false;
        this.f19886a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        C4099qh0 c4099qh0 = new C4099qh0(10);
        int i8 = 0;
        while (true) {
            Q0 q02 = (Q0) interfaceC2540d1;
            q02.zzm(c4099qh0.zzM(), 0, 10, false);
            c4099qh0.zzK(0);
            if (c4099qh0.zzo() != 4801587) {
                break;
            }
            c4099qh0.zzL(3);
            int iZzl = c4099qh0.zzl();
            i8 += iZzl + 10;
            q02.zzl(iZzl, false);
        }
        interfaceC2540d1.zzj();
        Q0 q03 = (Q0) interfaceC2540d1;
        q03.zzl(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            q03.zzm(c4099qh0.zzM(), 0, 6, false);
            c4099qh0.zzK(0);
            if (c4099qh0.zzq() != 2935) {
                interfaceC2540d1.zzj();
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                q03.zzl(i10, false);
                i9 = 0;
            } else {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int iZzb = A0.zzb(c4099qh0.zzM());
                if (iZzb == -1) {
                    return false;
                }
                q03.zzl(iZzb - 6, false);
            }
        }
    }
}
