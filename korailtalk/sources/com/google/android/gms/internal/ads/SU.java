package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SU extends AbstractC3963pT {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.AbstractC3963pT, com.google.android.gms.internal.ads.NS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SU.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3963pT
    public final KR zzi(KR kr2) throws C3620mS {
        int i8 = kr2.zzd;
        if (i8 != 3) {
            if (i8 == 2) {
                return KR.zza;
            }
            if (i8 != 268435456 && i8 != 21 && i8 != 1342177280 && i8 != 22 && i8 != 1610612736 && i8 != 4) {
                throw new C3620mS("Unhandled input format:", kr2);
            }
        }
        return new KR(kr2.zzb, kr2.zzc, 2);
    }
}
