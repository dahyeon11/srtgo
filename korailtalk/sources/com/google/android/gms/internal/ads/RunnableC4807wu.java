package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wu */
/* loaded from: classes2.dex */
final class RunnableC4807wu implements Runnable {

    /* renamed from: a */
    private final C3212iu f23556a;

    /* renamed from: b */
    private boolean f23557b = false;

    RunnableC4807wu(C3212iu c3212iu) {
        this.f23556a = c3212iu;
    }

    private final void a() {
        HandlerC1634Mh0 handlerC1634Mh0 = K1.K0.zza;
        handlerC1634Mh0.removeCallbacks(this);
        handlerC1634Mh0.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23557b) {
            return;
        }
        this.f23556a.g();
        a();
    }

    public final void zza() {
        this.f23557b = true;
        this.f23556a.g();
    }

    public final void zzb() {
        this.f23557b = false;
        a();
    }
}
