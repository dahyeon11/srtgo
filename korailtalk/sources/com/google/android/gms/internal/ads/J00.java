package com.google.android.gms.internal.ads;

import H1.C0545j0;
import android.content.Context;

/* loaded from: classes2.dex */
public final class J00 extends H1.S {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13558a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2302ax f13559b;

    /* renamed from: c, reason: collision with root package name */
    final C1743Pa0 f13560c;

    /* renamed from: d, reason: collision with root package name */
    final C2467cM f13561d;

    /* renamed from: e, reason: collision with root package name */
    private H1.J f13562e;

    public J00(AbstractC2302ax abstractC2302ax, Context context, String str) {
        C1743Pa0 c1743Pa0 = new C1743Pa0();
        this.f13560c = c1743Pa0;
        this.f13561d = new C2467cM();
        this.f13559b = abstractC2302ax;
        c1743Pa0.zzt(str);
        this.f13558a = context;
    }

    @Override // H1.S, H1.T
    public final H1.P zze() {
        C2696eM c2696eMZzg = this.f13561d.zzg();
        this.f13560c.zzE(c2696eMZzg.zzi());
        this.f13560c.zzF(c2696eMZzg.zzh());
        C1743Pa0 c1743Pa0 = this.f13560c;
        if (c1743Pa0.zzh() == null) {
            c1743Pa0.zzs(H1.d2.zzc());
        }
        return new K00(this.f13558a, this.f13559b, this.f13560c, c2696eMZzg, this.f13562e);
    }

    @Override // H1.S, H1.T
    public final void zzf(InterfaceC1187Bj interfaceC1187Bj) {
        this.f13561d.zza(interfaceC1187Bj);
    }

    @Override // H1.S, H1.T
    public final void zzg(InterfaceC1310Ej interfaceC1310Ej) {
        this.f13561d.zzb(interfaceC1310Ej);
    }

    @Override // H1.S, H1.T
    public final void zzh(String str, InterfaceC1597Lj interfaceC1597Lj, InterfaceC1433Hj interfaceC1433Hj) {
        this.f13561d.zzc(str, interfaceC1597Lj, interfaceC1433Hj);
    }

    @Override // H1.S, H1.T
    public final void zzi(InterfaceC4335sm interfaceC4335sm) {
        this.f13561d.zzd(interfaceC4335sm);
    }

    @Override // H1.S, H1.T
    public final void zzj(InterfaceC1760Pj interfaceC1760Pj, H1.d2 d2Var) {
        this.f13561d.zze(interfaceC1760Pj);
        this.f13560c.zzs(d2Var);
    }

    @Override // H1.S, H1.T
    public final void zzk(InterfaceC1883Sj interfaceC1883Sj) {
        this.f13561d.zzf(interfaceC1883Sj);
    }

    @Override // H1.S, H1.T
    public final void zzl(H1.J j8) {
        this.f13562e = j8;
    }

    @Override // H1.S, H1.T
    public final void zzm(B1.a aVar) {
        this.f13560c.zzr(aVar);
    }

    @Override // H1.S, H1.T
    public final void zzn(C3197im c3197im) {
        this.f13560c.zzw(c3197im);
    }

    @Override // H1.S, H1.T
    public final void zzo(C1840Ri c1840Ri) {
        this.f13560c.zzD(c1840Ri);
    }

    @Override // H1.S, H1.T
    public final void zzp(B1.g gVar) {
        this.f13560c.zzG(gVar);
    }

    @Override // H1.S, H1.T
    public final void zzq(C0545j0 c0545j0) {
        this.f13560c.zzU(c0545j0);
    }
}
