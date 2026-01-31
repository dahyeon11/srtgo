package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;

/* renamed from: com.google.android.gms.internal.ads.Um, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1971Um implements InterfaceC1285Dt {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2626dn f16715a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3407kd0 f16716b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2740en f16717c;

    C1971Um(C2740en c2740en, C2626dn c2626dn, InterfaceC3407kd0 interfaceC3407kd0) {
        this.f16715a = c2626dn;
        this.f16716b = interfaceC3407kd0;
        this.f16717c = c2740en;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1285Dt
    public final void zza() {
        AbstractC0667v0.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f16717c.f18817a) {
            try {
                AbstractC0667v0.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.f16717c.f18825i = 1;
                AbstractC0667v0.zza("Failed loading new engine. Marking new engine destroyable.");
                this.f16715a.zzb();
                if (((Boolean) AbstractC3302ji.zzd.zze()).booleanValue()) {
                    C2740en c2740en = this.f16717c;
                    if (c2740en.f18821e != null) {
                        RunnableC5002yd0 runnableC5002yd0 = c2740en.f18821e;
                        InterfaceC3407kd0 interfaceC3407kd0 = this.f16716b;
                        interfaceC3407kd0.zzc("Failed loading new engine");
                        interfaceC3407kd0.zzh(false);
                        runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0667v0.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
