package com.google.android.gms.internal.ads;

import R1.C0736o;
import R1.C0746z;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.u50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4489u50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22965a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22966b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f22967c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f22968d;

    /* renamed from: e, reason: collision with root package name */
    private final C1825Ra0 f22969e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC2302ax f22970f;

    C4489u50(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, String str, Context context, C1825Ra0 c1825Ra0, AbstractC2302ax abstractC2302ax) {
        this.f22966b = interfaceExecutorServiceC1974Un0;
        this.f22967c = scheduledExecutorService;
        this.f22965a = str;
        this.f22968d = context;
        this.f22969e = c1825Ra0;
        this.f22970f = abstractC2302ax;
    }

    public static /* synthetic */ com.google.common.util.concurrent.C zzc(C4489u50 c4489u50) {
        R1.X xZzp = c4489u50.f22970f.zzp();
        C2912gF c2912gF = new C2912gF();
        c2912gF.zze(c4489u50.f22968d);
        C1743Pa0 c1743Pa0 = new C1743Pa0();
        c1743Pa0.zzt("adUnitId");
        c1743Pa0.zzH(c4489u50.f22969e.zzd);
        c1743Pa0.zzs(new H1.d2());
        c1743Pa0.zzz(true);
        c2912gF.zzi(c1743Pa0.zzJ());
        xZzp.zza(c2912gF.zzj());
        C0736o c0736o = new C0736o();
        c0736o.zza(c4489u50.f22965a);
        xZzp.zzb(c0736o.zzb());
        new C4514uI();
        return AbstractC1483In0.zze(AbstractC1483In0.zzm((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC5136zn0.zzu(xZzp.zzc().zzb()), ((Long) H1.C.zzc().zza(AbstractC4439th.zzhp)).longValue(), TimeUnit.MILLISECONDS, c4489u50.f22967c), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.r50
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                C0746z c0746z = (C0746z) obj;
                return c0746z != null ? new C4603v50(c0746z.zza) : new C4603v50(null);
            }
        }, c4489u50.f22966b), Exception.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.s50
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                L1.n.zzh("", (Exception) obj);
                return new C4603v50(null);
            }
        }, c4489u50.f22966b);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzho)).booleanValue() || this.f22969e.zzr) ? AbstractC1483In0.zzh(new C4603v50(null)) : AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.t50
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return C4489u50.zzc(this.zza);
            }
        }, this.f22966b);
    }
}
