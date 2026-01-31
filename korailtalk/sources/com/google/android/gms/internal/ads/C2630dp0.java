package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.dp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2630dp0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3325jt0 f18688a;

    /* renamed from: b, reason: collision with root package name */
    private final Nu0 f18689b;

    /* renamed from: c, reason: collision with root package name */
    private final Nu0 f18690c;

    /* synthetic */ C2630dp0(C3325jt0 c3325jt0, AbstractC2516cp0 abstractC2516cp0) {
        Nu0 nu0Zza;
        this.f18688a = c3325jt0;
        if (c3325jt0.zzg()) {
            Ou0 ou0Zzb = Es0.zza().zzb();
            Tu0 tu0Zza = AbstractC4690vs0.zza(c3325jt0);
            this.f18689b = ou0Zzb.zza(tu0Zza, "aead", "encrypt");
            nu0Zza = ou0Zzb.zza(tu0Zza, "aead", "decrypt");
        } else {
            nu0Zza = AbstractC4690vs0.zza;
            this.f18689b = nu0Zza;
        }
        this.f18690c = nu0Zza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (C3098ht0 c3098ht0 : this.f18688a.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((InterfaceC3885oo0) c3098ht0.zze()).zza(bArr, bArr2);
                    c3098ht0.zza();
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (C3098ht0 c3098ht02 : this.f18688a.zzf(AbstractC4568uo0.zza)) {
            try {
                byte[] bArrZza2 = ((InterfaceC3885oo0) c3098ht02.zze()).zza(bArr, bArr2);
                c3098ht02.zza();
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
