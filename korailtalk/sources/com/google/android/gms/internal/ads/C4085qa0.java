package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qa0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4085qa0 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC4312sa0 f21959a;

    C4085qa0(BinderC4312sa0 binderC4312sa0) {
        this.f21959a = binderC4312sa0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f21959a) {
            this.f21959a.f22665d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f21959a) {
            try {
                this.f21959a.f22665d = (MO) obj;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdy)).booleanValue()) {
                    ((MO) obj).zzd().zza = this.f21959a.f22664c;
                }
                this.f21959a.f22665d.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
