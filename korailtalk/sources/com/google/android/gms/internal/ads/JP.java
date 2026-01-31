package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class JP implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f13639a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f13640b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f13641c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f13642d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f13643e;

    public JP(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f13639a = xd0;
        this.f13640b = xd02;
        this.f13641c = xd03;
        this.f13642d = xd04;
        this.f13643e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f13639a).zza();
        final String strZzb = ((C3279jT) this.f13640b).zzb();
        L1.a aVarZza = ((C4357sx) this.f13641c).zza();
        final EnumC1382Ge enumC1382Ge = (EnumC1382Ge) this.f13642d.zzb();
        final String str = (String) this.f13643e.zzb();
        C4775we c4775we = new C4775we(new C1300Ee(contextZza));
        C4321sf c4321sfZzd = C4435tf.zzd();
        c4321sfZzd.zzg(aVarZza.buddyApkVersion);
        c4321sfZzd.zzi(aVarZza.clientJarVersion);
        c4321sfZzd.zzh(true != aVarZza.isClientJar ? 2 : 0);
        final C4435tf c4435tf = (C4435tf) c4321sfZzd.zzbr();
        c4775we.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.IP
            @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
            public final void zza(C1713Og c1713Og) {
                C1464Ie c1464Ie = (C1464Ie) c1713Og.zze().zzcZ();
                c1464Ie.zzH(enumC1382Ge);
                c1713Og.zzG(c1464Ie);
                C1304Eg c1304Eg = (C1304Eg) c1713Og.zzg().zzcZ();
                c1304Eg.zzm(strZzb);
                c1304Eg.zzw(c4435tf);
                c1713Og.zzK(c1304Eg);
                c1713Og.zzO(str);
            }
        });
        return c4775we;
    }
}
