package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class OY implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4654va0 f15124a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PY f15125b;

    OY(PY py, C4654va0 c4654va0) {
        this.f15124a = c4654va0;
        this.f15125b = py;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        synchronized (this.f15125b) {
            try {
                this.f15125b.f15353h.b(th, this.f15124a);
                C4654va0 c4654va0A = this.f15125b.f15353h.a();
                if (this.f15124a.zzaw) {
                    while (c4654va0A != null) {
                        this.f15125b.d(c4654va0A);
                        c4654va0A = this.f15125b.f15353h.a();
                    }
                } else if (c4654va0A != null) {
                    this.f15125b.d(c4654va0A);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC3058hZ interfaceC3058hZ = (InterfaceC3058hZ) obj;
        synchronized (this.f15125b) {
            try {
                this.f15125b.f15353h.c(interfaceC3058hZ, this.f15124a);
                C4654va0 c4654va0A = this.f15125b.f15353h.a();
                if (c4654va0A != null) {
                    this.f15125b.d(c4654va0A);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
