package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class M4 extends X4 {

    /* renamed from: n, reason: collision with root package name */
    private C3911p1 f14530n;

    /* renamed from: o, reason: collision with root package name */
    private L4 f14531o;

    M4() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final long a(C4099qh0 c4099qh0) {
        if (!j(c4099qh0.zzM())) {
            return -1L;
        }
        int i8 = (c4099qh0.zzM()[2] & 255) >> 4;
        if (i8 == 6) {
            c4099qh0.zzL(4);
            c4099qh0.zzw();
        } else if (i8 == 7) {
            i8 = 7;
            c4099qh0.zzL(4);
            c4099qh0.zzw();
        }
        int iZza = AbstractC3455l1.zza(c4099qh0, i8);
        c4099qh0.zzK(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final void b(boolean z8) {
        super.b(z8);
        if (z8) {
            this.f14530n = null;
            this.f14531o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final boolean c(C4099qh0 c4099qh0, long j8, U4 u42) {
        byte[] bArrZzM = c4099qh0.zzM();
        C3911p1 c3911p1 = this.f14530n;
        if (c3911p1 == null) {
            C3911p1 c3911p12 = new C3911p1(bArrZzM, 17);
            this.f14530n = c3911p12;
            u42.f16576a = c3911p12.zzc(Arrays.copyOfRange(bArrZzM, 9, c4099qh0.zze()), null);
            return true;
        }
        if ((bArrZzM[0] & 127) == 3) {
            C3797o1 c3797o1Zzb = AbstractC3569m1.zzb(c4099qh0);
            C3911p1 c3911p1Zzf = c3911p1.zzf(c3797o1Zzb);
            this.f14530n = c3911p1Zzf;
            this.f14531o = new L4(c3911p1Zzf, c3797o1Zzb);
            return true;
        }
        if (!j(bArrZzM)) {
            return true;
        }
        L4 l42 = this.f14531o;
        if (l42 != null) {
            l42.zza(j8);
            u42.f16577b = this.f14531o;
        }
        u42.f16576a.getClass();
        return false;
    }
}
