package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class QR extends AbstractBinderC2174Zl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f15772a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15773b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f15774c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f15775d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1203Bt f15776e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ RR f15777f;

    QR(RR rr, Object obj, String str, long j8, InterfaceC3407kd0 interfaceC3407kd0, C1203Bt c1203Bt) {
        this.f15772a = obj;
        this.f15773b = str;
        this.f15774c = j8;
        this.f15775d = interfaceC3407kd0;
        this.f15776e = c1203Bt;
        this.f15777f = rr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2174Zl, com.google.android.gms.internal.ads.InterfaceC2280am
    public final void zze(String str) {
        synchronized (this.f15772a) {
            this.f15777f.q(this.f15773b, false, str, (int) (G1.u.zzB().elapsedRealtime() - this.f15774c));
            this.f15777f.f16111l.zzb(this.f15773b, "error");
            this.f15777f.f16114o.zzb(this.f15773b, "error");
            RunnableC5002yd0 runnableC5002yd0 = this.f15777f.f16115p;
            InterfaceC3407kd0 interfaceC3407kd0 = this.f15775d;
            interfaceC3407kd0.zzc(str);
            interfaceC3407kd0.zzh(false);
            runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
            this.f15776e.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2174Zl, com.google.android.gms.internal.ads.InterfaceC2280am
    public final void zzf() {
        synchronized (this.f15772a) {
            this.f15777f.q(this.f15773b, true, "", (int) (G1.u.zzB().elapsedRealtime() - this.f15774c));
            this.f15777f.f16111l.zzd(this.f15773b);
            this.f15777f.f16114o.zzd(this.f15773b);
            RunnableC5002yd0 runnableC5002yd0 = this.f15777f.f16115p;
            InterfaceC3407kd0 interfaceC3407kd0 = this.f15775d;
            interfaceC3407kd0.zzh(true);
            runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
            this.f15776e.zzc(Boolean.TRUE);
        }
    }
}
