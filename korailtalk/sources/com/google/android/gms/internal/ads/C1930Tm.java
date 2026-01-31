package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;

/* renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1930Tm implements InterfaceC1367Ft {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2626dn f16516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f16517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2740en f16518c;

    C1930Tm(C2740en c2740en, C2626dn c2626dn, InterfaceC3407kd0 interfaceC3407kd0) {
        this.f16516a = c2626dn;
        this.f16517b = interfaceC3407kd0;
        this.f16518c = c2740en;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1367Ft
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC0667v0.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f16518c.f18817a) {
            try {
                AbstractC0667v0.zza("loadNewJavascriptEngine (success): Lock acquired");
                this.f16518c.f18825i = 0;
                C2740en c2740en = this.f16518c;
                if (c2740en.f18824h != null && this.f16516a != c2740en.f18824h) {
                    AbstractC0667v0.zza("New JS engine is loaded, marking previous one as destroyable.");
                    this.f16518c.f18824h.zzb();
                }
                this.f16518c.f18824h = this.f16516a;
                if (((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
                    C2740en c2740en2 = this.f16518c;
                    if (c2740en2.f18821e != null) {
                        RunnableC5002yd0 runnableC5002yd0 = c2740en2.f18821e;
                        InterfaceC3407kd0 interfaceC3407kd0 = this.f16517b;
                        interfaceC3407kd0.zzh(true);
                        runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0667v0.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
