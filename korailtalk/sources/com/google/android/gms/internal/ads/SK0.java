package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class SK0 implements WJ0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TK0 f16244a;

    /* synthetic */ SK0(TK0 tk0, RK0 rk0) {
        this.f16244a = tk0;
    }

    @Override // com.google.android.gms.internal.ads.WJ0
    public final void zza(Exception exc) {
        AbstractC2834fc0.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f16244a.f16452x0.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.WJ0
    public final void zzb() {
        TK0 tk0 = this.f16244a;
        if (tk0.f16449H0 != null) {
            tk0.f16449H0.zzb();
        }
    }
}
