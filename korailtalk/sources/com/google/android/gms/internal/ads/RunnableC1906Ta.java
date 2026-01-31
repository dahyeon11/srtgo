package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1906Ta implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1947Ua f16497a;

    RunnableC1906Ta(C1947Ua c1947Ua) {
        this.f16497a = c1947Ua;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f16497a.f16687o) {
            if (this.f16497a.f16688p) {
                return;
            }
            this.f16497a.f16688p = true;
            try {
                C1947Ua.d(this.f16497a);
            } catch (Exception e8) {
                this.f16497a.f16678f.zzc(2023, -1L, e8);
            }
            synchronized (this.f16497a.f16687o) {
                this.f16497a.f16688p = false;
            }
        }
    }
}
