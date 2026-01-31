package com.google.android.gms.internal.ads;

import B1.e;
import H1.C0545j0;
import H1.InterfaceC0533f0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ra0 */
/* loaded from: classes2.dex */
public final class C1825Ra0 {
    public final H1.R1 zza;
    public final C3197im zzb;
    public final C3000h10 zzc;
    public final H1.Y1 zzd;
    public final H1.d2 zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final C1840Ri zzi;
    public final H1.j2 zzj;
    public final int zzk;
    public final B1.a zzl;
    public final B1.g zzm;
    public final InterfaceC0533f0 zzn;
    public final C1293Ea0 zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final C0545j0 zzt;

    /* synthetic */ C1825Ra0(C1743Pa0 c1743Pa0, AbstractC1784Qa0 abstractC1784Qa0) {
        this.zze = c1743Pa0.f15361b;
        this.zzf = c1743Pa0.f15362c;
        this.zzt = c1743Pa0.f15380u;
        int i8 = c1743Pa0.f15360a.zza;
        long j8 = c1743Pa0.f15360a.zzb;
        Bundle bundle = c1743Pa0.f15360a.zzc;
        int i9 = c1743Pa0.f15360a.zzd;
        List list = c1743Pa0.f15360a.zze;
        boolean z8 = c1743Pa0.f15360a.zzf;
        int i10 = c1743Pa0.f15360a.zzg;
        boolean z9 = true;
        if (!c1743Pa0.f15360a.zzh && !c1743Pa0.f15364e) {
            z9 = false;
        }
        this.zzd = new H1.Y1(i8, j8, bundle, i9, list, z8, i10, z9, c1743Pa0.f15360a.zzi, c1743Pa0.f15360a.zzj, c1743Pa0.f15360a.zzk, c1743Pa0.f15360a.zzl, c1743Pa0.f15360a.zzm, c1743Pa0.f15360a.zzn, c1743Pa0.f15360a.zzo, c1743Pa0.f15360a.zzp, c1743Pa0.f15360a.zzq, c1743Pa0.f15360a.zzr, c1743Pa0.f15360a.zzs, c1743Pa0.f15360a.zzt, c1743Pa0.f15360a.zzu, c1743Pa0.f15360a.zzv, K1.K0.zza(c1743Pa0.f15360a.zzw), c1743Pa0.f15360a.zzx, c1743Pa0.f15360a.zzy, c1743Pa0.f15360a.zzz);
        this.zza = c1743Pa0.f15363d != null ? c1743Pa0.f15363d : c1743Pa0.f15367h != null ? c1743Pa0.f15367h.zzf : null;
        this.zzg = c1743Pa0.f15365f;
        this.zzh = c1743Pa0.f15366g;
        this.zzi = c1743Pa0.f15365f == null ? null : c1743Pa0.f15367h == null ? new C1840Ri(new e.a().build()) : c1743Pa0.f15367h;
        this.zzj = c1743Pa0.f15368i;
        this.zzk = c1743Pa0.f15372m;
        this.zzl = c1743Pa0.f15369j;
        this.zzm = c1743Pa0.f15370k;
        this.zzn = c1743Pa0.f15371l;
        this.zzb = c1743Pa0.f15373n;
        this.zzo = new C1293Ea0(c1743Pa0.f15374o, null);
        this.zzp = c1743Pa0.f15375p;
        this.zzq = c1743Pa0.f15376q;
        this.zzc = c1743Pa0.f15377r;
        this.zzr = c1743Pa0.f15378s;
        this.zzs = c1743Pa0.f15379t;
    }

    public final InterfaceC2006Vj zza() {
        B1.g gVar = this.zzm;
        if (gVar == null && this.zzl == null) {
            return null;
        }
        return gVar != null ? gVar.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) H1.C.zzc().zza(AbstractC4439th.zzde));
    }
}
