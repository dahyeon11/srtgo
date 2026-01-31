package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uG0 */
/* loaded from: classes2.dex */
final class C4511uG0 implements InterfaceC3372kG0 {
    public final IM0 zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public C4511uG0(PM0 pm0, boolean z8) {
        this.zza = new IM0(pm0, z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3372kG0
    public final RG zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3372kG0
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i8) {
        this.zzd = i8;
        this.zze = false;
        this.zzc.clear();
    }
}
