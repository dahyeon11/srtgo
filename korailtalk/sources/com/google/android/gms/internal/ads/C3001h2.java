package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3001h2 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3911p1 f19744a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19745b;

    /* renamed from: c, reason: collision with root package name */
    private final C3341k1 f19746c = new C3341k1();

    /* synthetic */ C3001h2(C3911p1 c3911p1, int i8, AbstractC2886g2 abstractC2886g2) {
        this.f19744a = c3911p1;
        this.f19745b = i8;
    }

    private final long a(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        while (interfaceC2540d1.zze() < interfaceC2540d1.zzd() - 6) {
            C3911p1 c3911p1 = this.f19744a;
            int i8 = this.f19745b;
            C3341k1 c3341k1 = this.f19746c;
            long jZze = interfaceC2540d1.zze();
            byte[] bArr = new byte[2];
            Q0 q02 = (Q0) interfaceC2540d1;
            q02.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i8) {
                interfaceC2540d1.zzj();
                q02.zzl((int) (jZze - interfaceC2540d1.zzf()), false);
            } else {
                C4099qh0 c4099qh0 = new C4099qh0(16);
                System.arraycopy(bArr, 0, c4099qh0.zzM(), 0, 2);
                c4099qh0.zzJ(AbstractC2884g1.zza(interfaceC2540d1, c4099qh0.zzM(), 2, 14));
                interfaceC2540d1.zzj();
                q02.zzl((int) (jZze - interfaceC2540d1.zzf()), false);
                if (AbstractC3455l1.zzc(c4099qh0, c3911p1, i8, c3341k1)) {
                    break;
                }
            }
            q02.zzl(1, false);
        }
        if (interfaceC2540d1.zze() < interfaceC2540d1.zzd() - 6) {
            return this.f19746c.zza;
        }
        ((Q0) interfaceC2540d1).zzl((int) (interfaceC2540d1.zzd() - interfaceC2540d1.zze()), false);
        return this.f19744a.zzj;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 zza(InterfaceC2540d1 interfaceC2540d1, long j8) throws EOFException, InterruptedIOException {
        int i8 = this.f19744a.zzc;
        long jZzf = interfaceC2540d1.zzf();
        long jA = a(interfaceC2540d1);
        long jZze = interfaceC2540d1.zze();
        ((Q0) interfaceC2540d1).zzl(Math.max(6, i8), false);
        long jA2 = a(interfaceC2540d1);
        return (jA > j8 || jA2 <= j8) ? jA2 <= j8 ? K0.zzf(jA2, interfaceC2540d1.zze()) : K0.zzd(jA, jZzf) : K0.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final /* synthetic */ void zzb() {
    }
}
