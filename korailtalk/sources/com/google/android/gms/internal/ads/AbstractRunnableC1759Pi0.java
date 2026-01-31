package com.google.android.gms.internal.ads;

import I2.C0609m;

/* renamed from: com.google.android.gms.internal.ads.Pi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1759Pi0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C0609m f15399a;

    AbstractRunnableC1759Pi0() {
        this.f15399a = null;
    }

    final C0609m a() {
        return this.f15399a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e8) {
            zzc(e8);
        }
    }

    protected abstract void zza();

    public final void zzc(Exception exc) {
        C0609m c0609m = this.f15399a;
        if (c0609m != null) {
            c0609m.trySetException(exc);
        }
    }

    public AbstractRunnableC1759Pi0(C0609m c0609m) {
        this.f15399a = c0609m;
    }
}
