package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ui0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1964Ui0 extends AbstractRunnableC1759Pi0 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2275aj0 f16706b;

    C1964Ui0(C2275aj0 c2275aj0) {
        this.f16706b = c2275aj0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1759Pi0
    public final void zza() {
        synchronized (this.f16706b.f18012f) {
            try {
                if (this.f16706b.f18017k.get() > 0 && this.f16706b.f18017k.decrementAndGet() > 0) {
                    this.f16706b.f18008b.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C2275aj0 c2275aj0 = this.f16706b;
                if (c2275aj0.f18019m != null) {
                    c2275aj0.f18008b.zzc("Unbind from service.", new Object[0]);
                    C2275aj0 c2275aj02 = this.f16706b;
                    c2275aj02.f18007a.unbindService(c2275aj02.f18018l);
                    this.f16706b.f18013g = false;
                    this.f16706b.f18019m = null;
                    this.f16706b.f18018l = null;
                }
                this.f16706b.r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
