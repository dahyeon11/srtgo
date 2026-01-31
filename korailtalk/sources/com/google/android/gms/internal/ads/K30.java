package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class K30 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3002h20 f13725a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13726b;

    public K30() {
        throw null;
    }

    public final synchronized void zza() {
        while (!this.f13726b) {
            wait();
        }
    }

    public final synchronized void zzb() {
        boolean z8 = false;
        while (!this.f13726b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z8 = true;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zzc() {
        boolean z8;
        z8 = this.f13726b;
        this.f13726b = false;
        return z8;
    }

    public final synchronized boolean zzd() {
        return this.f13726b;
    }

    public final synchronized boolean zze() {
        if (this.f13726b) {
            return false;
        }
        this.f13726b = true;
        notifyAll();
        return true;
    }

    public K30(InterfaceC3002h20 interfaceC3002h20) {
        this.f13725a = interfaceC3002h20;
    }
}
