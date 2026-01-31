package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2155Zb0 implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2490cc0 f17612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2605dc0 f17613b;

    C2155Zb0(C2605dc0 c2605dc0, InterfaceC2490cc0 interfaceC2490cc0) {
        this.f17612a = interfaceC2490cc0;
        this.f17613b = c2605dc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        synchronized (this.f17613b) {
            this.f17613b.f18646e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f17613b) {
            try {
                this.f17613b.f18646e = null;
                this.f17613b.f18645d.addFirst(this.f17612a);
                C2605dc0 c2605dc0 = this.f17613b;
                if (c2605dc0.f18647f == 1) {
                    c2605dc0.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
