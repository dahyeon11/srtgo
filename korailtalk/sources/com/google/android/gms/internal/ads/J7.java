package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class J7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z7 f13588a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K7 f13589b;

    J7(K7 k72, Z7 z72) {
        this.f13588a = z72;
        this.f13589b = k72;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f13589b.f13748b.put(this.f13588a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
