package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4751wM0 implements IN0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2394bl0 f23484a;

    /* renamed from: b, reason: collision with root package name */
    private long f23485b;

    public C4751wM0(List list, List list2) {
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        F10.zzd(list.size() == list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            c2091Xk0.zzf(new C4637vM0((IN0) list.get(i8), (List) list2.get(i8)));
        }
        this.f23484a = c2091Xk0.zzi();
        this.f23485b = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.f23484a.size(); i8++) {
            C4637vM0 c4637vM0 = (C4637vM0) this.f23484a.get(i8);
            long jZzb = c4637vM0.zzb();
            if ((c4637vM0.zza().contains(1) || c4637vM0.zza().contains(2) || c4637vM0.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f23485b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.f23485b;
        return j8 != -9223372036854775807L ? j8 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (int i8 = 0; i8 < this.f23484a.size(); i8++) {
            long jZzc = ((C4637vM0) this.f23484a.get(i8)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        for (int i8 = 0; i8 < this.f23484a.size(); i8++) {
            ((C4637vM0) this.f23484a.get(i8)).zzm(j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        boolean zZzo;
        boolean z8 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            zZzo = false;
            for (int i8 = 0; i8 < this.f23484a.size(); i8++) {
                long jZzc2 = ((C4637vM0) this.f23484a.get(i8)).zzc();
                boolean z9 = jZzc2 != Long.MIN_VALUE && jZzc2 <= c2685eG0.zza;
                if (jZzc2 == jZzc || z9) {
                    zZzo |= ((C4637vM0) this.f23484a.get(i8)).zzo(c2685eG0);
                }
            }
            z8 |= zZzo;
        } while (zZzo);
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        for (int i8 = 0; i8 < this.f23484a.size(); i8++) {
            if (((C4637vM0) this.f23484a.get(i8)).zzp()) {
                return true;
            }
        }
        return false;
    }
}
