package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4315sc extends AbstractCallableC4657vc {

    /* renamed from: i, reason: collision with root package name */
    private final View f22670i;

    public C4315sc(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, View view) {
        super(c1294Eb, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", c3357k9, i8, 57);
        this.f22670i = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        if (this.f22670i != null) {
            Boolean bool = (Boolean) H1.C.zzc().zza(AbstractC4439th.zzds);
            Boolean bool2 = (Boolean) H1.C.zzc().zza(AbstractC4439th.zzkU);
            C1458Ib c1458Ib = new C1458Ib((String) this.f23266f.invoke(null, this.f22670i, this.f23262b.zzb().getResources().getDisplayMetrics(), bool, bool2));
            M9 m9Zza = N9.zza();
            m9Zza.zzb(c1458Ib.zza.longValue());
            m9Zza.zzd(c1458Ib.zzb.longValue());
            m9Zza.zze(c1458Ib.zzc.longValue());
            if (bool2.booleanValue()) {
                m9Zza.zzc(c1458Ib.zze.longValue());
            }
            if (bool.booleanValue()) {
                m9Zza.zza(c1458Ib.zzd.longValue());
            }
            this.f23265e.zzaf((N9) m9Zza.zzbr());
        }
    }
}
