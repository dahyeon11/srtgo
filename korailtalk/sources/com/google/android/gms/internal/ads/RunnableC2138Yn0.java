package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2138Yn0 extends AbstractC1849Rm0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f17421h;

    public RunnableC2138Yn0(Runnable runnable) {
        runnable.getClass();
        this.f17421h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17421h.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        return "task=[" + this.f17421h.toString() + "]";
    }
}
