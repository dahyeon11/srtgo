package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
final class DM0 implements Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ky0 f12659a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12660b;

    /* renamed from: c, reason: collision with root package name */
    private final CM0 f12661c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f12662d;

    /* renamed from: e, reason: collision with root package name */
    private int f12663e;

    public DM0(Ky0 ky0, int i8, CM0 cm0) {
        F10.zzd(i8 > 0);
        this.f12659a = ky0;
        this.f12660b = i8;
        this.f12661c = cm0;
        this.f12662d = new byte[1];
        this.f12663e = i8;
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        int i10 = this.f12663e;
        if (i10 == 0) {
            int i11 = 0;
            if (this.f12659a.zza(this.f12662d, 0, 1) != -1) {
                int i12 = (this.f12662d[0] & 255) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    while (i13 > 0) {
                        int iZza = this.f12659a.zza(bArr2, i11, i13);
                        if (iZza != -1) {
                            i11 += iZza;
                            i13 -= iZza;
                        }
                    }
                    while (i12 > 0) {
                        int i14 = i12 - 1;
                        if (bArr2[i14] != 0) {
                            break;
                        }
                        i12 = i14;
                    }
                    if (i12 > 0) {
                        this.f12661c.zza(new C4099qh0(bArr2, i12));
                    }
                }
                i10 = this.f12660b;
                this.f12663e = i10;
            }
            return -1;
        }
        int iZza2 = this.f12659a.zza(bArr, i8, Math.min(i10, i9));
        if (iZza2 != -1) {
            this.f12663e -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f12659a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        return this.f12659a.zze();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
        interfaceC4279sE0.getClass();
        this.f12659a.zzf(interfaceC4279sE0);
    }
}
