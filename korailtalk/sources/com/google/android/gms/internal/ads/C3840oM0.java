package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oM0 */
/* loaded from: classes2.dex */
public final class C3840oM0 implements InterfaceC2929gN0 {

    /* renamed from: a */
    private final InterfaceC3227j1 f21476a;

    /* renamed from: b */
    private InterfaceC2425c1 f21477b;

    /* renamed from: c */
    private InterfaceC2540d1 f21478c;

    public C3840oM0(InterfaceC3227j1 interfaceC3227j1) {
        this.f21476a = interfaceC3227j1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final int zza(C5050z1 c5050z1) {
        InterfaceC2425c1 interfaceC2425c1 = this.f21477b;
        interfaceC2425c1.getClass();
        InterfaceC2540d1 interfaceC2540d1 = this.f21478c;
        interfaceC2540d1.getClass();
        return interfaceC2425c1.zzb(interfaceC2540d1, c5050z1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final long zzb() {
        InterfaceC2540d1 interfaceC2540d1 = this.f21478c;
        if (interfaceC2540d1 != null) {
            return interfaceC2540d1.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final void zzc() {
        InterfaceC2425c1 interfaceC2425c1 = this.f21477b;
        if (interfaceC2425c1 != null && (interfaceC2425c1 instanceof T3)) {
            ((T3) interfaceC2425c1).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final void zzd(UL0 ul0, Uri uri, Map map, long j8, long j9, InterfaceC2769f1 interfaceC2769f1) throws TN0 {
        Q0 q02 = new Q0(ul0, j8, j9);
        this.f21478c = q02;
        if (this.f21477b != null) {
            return;
        }
        InterfaceC2425c1[] interfaceC2425c1ArrZza = this.f21476a.zza(uri, map);
        int length = interfaceC2425c1ArrZza.length;
        C2091Xk0 c2091Xk0Zzi = AbstractC2394bl0.zzi(length);
        int i8 = 0;
        if (length == 1) {
            this.f21477b = interfaceC2425c1ArrZza[0];
        } else {
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                InterfaceC2425c1 interfaceC2425c1 = interfaceC2425c1ArrZza[i9];
                try {
                } catch (EOFException unused) {
                    if (this.f21477b != null || q02.zzf() == j8) {
                    }
                } catch (Throwable th) {
                    F10.zzf(this.f21477b != null || q02.zzf() == j8);
                    q02.zzj();
                    throw th;
                }
                if (interfaceC2425c1.zzf(q02)) {
                    this.f21477b = interfaceC2425c1;
                    F10.zzf(true);
                    q02.zzj();
                    break;
                } else {
                    c2091Xk0Zzi.zzh(interfaceC2425c1.zzc());
                    boolean z8 = this.f21477b != null || q02.zzf() == j8;
                    F10.zzf(z8);
                    q02.zzj();
                    i9++;
                }
            }
            if (this.f21477b == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = interfaceC2425c1ArrZza.length;
                    if (i8 >= length2) {
                        throw new TN0("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, c2091Xk0Zzi.zzi());
                    }
                    sb.append(interfaceC2425c1ArrZza[i8].getClass().getSimpleName());
                    if (i8 < length2 - 1) {
                        sb.append(", ");
                    }
                    i8++;
                }
            }
        }
        this.f21477b.zzd(interfaceC2769f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final void zze() {
        if (this.f21477b != null) {
            this.f21477b = null;
        }
        this.f21478c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2929gN0
    public final void zzf(long j8, long j9) {
        InterfaceC2425c1 interfaceC2425c1 = this.f21477b;
        interfaceC2425c1.getClass();
        interfaceC2425c1.zze(j8, j9);
    }
}
