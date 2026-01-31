package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.y30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4941y30 implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23824a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23825b;

    public C4941y30(XD0 xd0, XD0 xd02) {
        this.f23824a = xd0;
        this.f23825b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        AbstractC2967gl0 abstractC2967gl0Zzn;
        C2774f30 c2774f30Zza = C3004h30.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23825b.zzb();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzea)).booleanValue()) {
            abstractC2967gl0Zzn = AbstractC2967gl0.zzo(new R40(c2774f30Zza, ((Integer) H1.C.zzc().zza(AbstractC4439th.zzeb)).intValue(), scheduledExecutorService));
        } else {
            abstractC2967gl0Zzn = AbstractC2967gl0.zzn();
        }
        OD0.zzb(abstractC2967gl0Zzn);
        return abstractC2967gl0Zzn;
    }
}
