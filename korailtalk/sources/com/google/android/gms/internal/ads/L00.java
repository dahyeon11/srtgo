package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class L00 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M00 f14133a;

    L00(M00 m00) {
        this.f14133a = m00;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f14133a) {
            this.f14133a.f14520i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        MB mb = (MB) obj;
        synchronized (this.f14133a) {
            try {
                M00 m00 = this.f14133a;
                if (m00.f14520i != null) {
                    m00.f14520i.zzb();
                }
                this.f14133a.f14520i = mb;
                this.f14133a.f14520i.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
