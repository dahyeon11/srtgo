package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.gd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2951gd0 implements InterfaceC3035hJ, RF, InterfaceC3491lJ {

    /* renamed from: a, reason: collision with root package name */
    private final RunnableC4660vd0 f19387a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3407kd0 f19388b;

    C2951gd0(Context context, RunnableC4660vd0 runnableC4660vd0) {
        this.f19387a = runnableC4660vd0;
        this.f19388b = AbstractC3293jd0.zza(context, EnumC1217Cd0.CUI_NAME_ADSHOW);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3491lJ
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3491lJ
    public final void zzb() {
        if (((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
            RunnableC4660vd0 runnableC4660vd0 = this.f19387a;
            InterfaceC3407kd0 interfaceC3407kd0 = this.f19388b;
            interfaceC3407kd0.zzh(true);
            runnableC4660vd0.zza(interfaceC3407kd0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3035hJ
    public final void zzl() {
        if (((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
            this.f19388b.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(C0534f1 c0534f1) {
        if (((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
            RunnableC4660vd0 runnableC4660vd0 = this.f19387a;
            InterfaceC3407kd0 interfaceC3407kd0 = this.f19388b;
            interfaceC3407kd0.zzc(c0534f1.zza().toString());
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0.zza(interfaceC3407kd0);
        }
    }
}
