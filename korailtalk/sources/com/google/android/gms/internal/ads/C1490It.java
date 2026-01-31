package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.It, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1490It {

    /* renamed from: a, reason: collision with root package name */
    private final C1203Bt f13507a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13508b;

    public C1490It() {
        C1203Bt c1203Bt = new C1203Bt();
        this.f13507a = c1203Bt;
        this.f13508b = new AtomicInteger(0);
        AbstractC1483In0.zzr(c1203Bt, new C1408Gt(this), AbstractC4805wt.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.f13508b.get();
    }

    @Deprecated
    public final void zzg() {
        this.f13507a.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.f13507a.zzd(th);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhO)).booleanValue()) {
            G1.u.zzo().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.f13507a.zzc(obj);
    }

    @Deprecated
    public final void zzj(InterfaceC1367Ft interfaceC1367Ft, InterfaceC1285Dt interfaceC1285Dt) {
        AbstractC1483In0.zzr(this.f13507a, new C1449Ht(this, interfaceC1367Ft, interfaceC1285Dt), AbstractC4805wt.zzf);
    }
}
