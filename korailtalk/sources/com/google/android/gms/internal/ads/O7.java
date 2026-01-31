package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class O7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Z7 f15048a;

    /* renamed from: b, reason: collision with root package name */
    private final C2554d8 f15049b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f15050c;

    public O7(Z7 z72, C2554d8 c2554d8, Runnable runnable) {
        this.f15048a = z72;
        this.f15049b = c2554d8;
        this.f15050c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15048a.zzw();
        C2554d8 c2554d8 = this.f15049b;
        if (c2554d8.zzc()) {
            this.f15048a.c(c2554d8.zza);
        } else {
            this.f15048a.zzn(c2554d8.zzc);
        }
        if (this.f15049b.zzd) {
            this.f15048a.zzm("intermediate-response");
        } else {
            this.f15048a.d("done");
        }
        Runnable runnable = this.f15050c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
