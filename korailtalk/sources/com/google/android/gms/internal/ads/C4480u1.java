package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: com.google.android.gms.internal.ads.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4480u1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f22955a = new C4099qh0(10);

    public final C1735Ot zza(InterfaceC2540d1 interfaceC2540d1, InterfaceC2200a3 interfaceC2200a3) throws EOFException, InterruptedIOException {
        C1735Ot c1735OtZza = null;
        int i8 = 0;
        while (true) {
            try {
                ((Q0) interfaceC2540d1).zzm(this.f22955a.zzM(), 0, 10, false);
                this.f22955a.zzK(0);
                if (this.f22955a.zzo() != 4801587) {
                    break;
                }
                this.f22955a.zzL(3);
                int iZzl = this.f22955a.zzl();
                int i9 = iZzl + 10;
                if (c1735OtZza == null) {
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f22955a.zzM(), 0, bArr, 0, 10);
                    ((Q0) interfaceC2540d1).zzm(bArr, 10, iZzl, false);
                    c1735OtZza = AbstractC2429c3.zza(bArr, i9, interfaceC2200a3, new C2());
                } else {
                    ((Q0) interfaceC2540d1).zzl(iZzl, false);
                }
                i8 += i9;
            } catch (EOFException unused) {
            }
        }
        interfaceC2540d1.zzj();
        ((Q0) interfaceC2540d1).zzl(i8, false);
        return c1735OtZza;
    }
}
