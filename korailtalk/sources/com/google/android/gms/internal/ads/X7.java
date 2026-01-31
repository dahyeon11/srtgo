package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class X7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17131a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f17132b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z7 f17133c;

    X7(Z7 z72, String str, long j8) {
        this.f17131a = str;
        this.f17132b = j8;
        this.f17133c = z72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17133c.f17500a.zza(this.f17131a, this.f17132b);
        Z7 z72 = this.f17133c;
        z72.f17500a.zzb(z72.toString());
    }
}
