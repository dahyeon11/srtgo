package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4723w80 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC4837x80 f23421a;

    C4723w80(BinderC4837x80 binderC4837x80) {
        this.f23421a = binderC4837x80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f23421a) {
            this.f23421a.f23657k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        FB fb = (FB) obj;
        synchronized (this.f23421a) {
            try {
                FB fb2 = this.f23421a.f23657k;
                if (fb2 != null) {
                    fb2.zzb();
                }
                BinderC4837x80 binderC4837x80 = this.f23421a;
                binderC4837x80.f23657k = fb;
                fb.zzc(binderC4837x80);
                BinderC4837x80 binderC4837x802 = this.f23421a;
                binderC4837x802.f23652f.zzk(new HB(fb, binderC4837x802, binderC4837x802.f23652f, binderC4837x802.f23654h));
                fb.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
