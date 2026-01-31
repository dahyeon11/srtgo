package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class WM0 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f16983a;
    public final int zza;
    public final NM0 zzb;

    private WM0(CopyOnWriteArrayList copyOnWriteArrayList, int i8, NM0 nm0) {
        this.f16983a = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = nm0;
    }

    public final WM0 zza(int i8, NM0 nm0) {
        return new WM0(this.f16983a, 0, nm0);
    }

    public final void zzb(Handler handler, XM0 xm0) {
        this.f16983a.add(new VM0(handler, xm0));
    }

    public final void zzc(final JM0 jm0) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            final XM0 xm0 = vm0.zzb;
            AbstractC2281am0.zzO(vm0.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.QM0
                @Override // java.lang.Runnable
                public final void run() {
                    xm0.zzae(0, this.zza.zzb, jm0);
                }
            });
        }
    }

    public final void zzd(final EM0 em0, final JM0 jm0) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            final XM0 xm0 = vm0.zzb;
            AbstractC2281am0.zzO(vm0.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.UM0
                @Override // java.lang.Runnable
                public final void run() {
                    xm0.zzaf(0, this.zza.zzb, em0, jm0);
                }
            });
        }
    }

    public final void zze(final EM0 em0, final JM0 jm0) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            final XM0 xm0 = vm0.zzb;
            AbstractC2281am0.zzO(vm0.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.SM0
                @Override // java.lang.Runnable
                public final void run() {
                    xm0.zzag(0, this.zza.zzb, em0, jm0);
                }
            });
        }
    }

    public final void zzf(final EM0 em0, final JM0 jm0, final IOException iOException, final boolean z8) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            final XM0 xm0 = vm0.zzb;
            AbstractC2281am0.zzO(vm0.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.TM0
                @Override // java.lang.Runnable
                public final void run() {
                    xm0.zzah(0, this.zza.zzb, em0, jm0, iOException, z8);
                }
            });
        }
    }

    public final void zzg(final EM0 em0, final JM0 jm0) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            final XM0 xm0 = vm0.zzb;
            AbstractC2281am0.zzO(vm0.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.RM0
                @Override // java.lang.Runnable
                public final void run() {
                    xm0.zzai(0, this.zza.zzb, em0, jm0);
                }
            });
        }
    }

    public final void zzh(XM0 xm0) {
        Iterator it = this.f16983a.iterator();
        while (it.hasNext()) {
            VM0 vm0 = (VM0) it.next();
            if (vm0.zzb == xm0) {
                this.f16983a.remove(vm0);
            }
        }
    }

    public WM0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
