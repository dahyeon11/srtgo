package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class T4 extends X4 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f16402o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f16403p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f16404n;

    T4() {
    }

    private static boolean j(C4099qh0 c4099qh0, byte[] bArr) {
        if (c4099qh0.zzb() < 8) {
            return false;
        }
        int iZzd = c4099qh0.zzd();
        byte[] bArr2 = new byte[8];
        c4099qh0.zzG(bArr2, 0, 8);
        c4099qh0.zzK(iZzd);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean zzd(C4099qh0 c4099qh0) {
        return j(c4099qh0, f16402o);
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final long a(C4099qh0 c4099qh0) {
        return f(AbstractC4936y1.zzd(c4099qh0.zzM()));
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final void b(boolean z8) {
        super.b(z8);
        if (z8) {
            this.f16404n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.X4
    protected final boolean c(C4099qh0 c4099qh0, long j8, U4 u42) {
        if (j(c4099qh0, f16402o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c4099qh0.zzM(), c4099qh0.zze());
            int i8 = bArrCopyOf[9] & 255;
            List listZze = AbstractC4936y1.zze(bArrCopyOf);
            if (u42.f16576a == null) {
                O4 o42 = new O4();
                o42.zzX("audio/opus");
                o42.zzy(i8);
                o42.zzY(48000);
                o42.zzL(listZze);
                u42.f16576a = o42.zzad();
                return true;
            }
        } else {
            if (!j(c4099qh0, f16403p)) {
                F10.zzb(u42.f16576a);
                return false;
            }
            F10.zzb(u42.f16576a);
            if (!this.f16404n) {
                this.f16404n = true;
                c4099qh0.zzL(8);
                C1735Ot c1735OtZzb = Q1.zzb(AbstractC2394bl0.zzl(Q1.zzc(c4099qh0, false, false).zzb));
                if (c1735OtZzb != null) {
                    O4 o4Zzb = u42.f16576a.zzb();
                    o4Zzb.zzQ(c1735OtZzb.zzd(u42.f16576a.zzl));
                    u42.f16576a = o4Zzb.zzad();
                }
            }
        }
        return true;
    }
}
