package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.la0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3515la0 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC3629ma0 f20682a;

    C3515la0(BinderC3629ma0 binderC3629ma0) {
        this.f20682a = binderC3629ma0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f20682a) {
            this.f20682a.f20943i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f20682a) {
            try {
                this.f20682a.f20943i = (MO) obj;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdy)).booleanValue()) {
                    ((MO) obj).zzd().zza = this.f20682a.f20938d;
                }
                this.f20682a.f20943i.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
