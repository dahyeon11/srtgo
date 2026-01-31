package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.dn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC2627dn0 extends AbstractC5022yn0 implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.C f18682h;

    /* renamed from: i, reason: collision with root package name */
    Object f18683i;

    AbstractRunnableC2627dn0(com.google.common.util.concurrent.C c9, Object obj) {
        c9.getClass();
        this.f18682h = c9;
        this.f18683i = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        p(this.f18682h);
        this.f18682h = null;
        this.f18683i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.C c9 = this.f18682h;
        Object obj = this.f18683i;
        if ((isCancelled() | (c9 == null)) || (obj == null)) {
            return;
        }
        this.f18682h = null;
        if (c9.isCancelled()) {
            q(c9);
            return;
        }
        try {
            try {
                Object objY = y(obj, AbstractC1483In0.zzp(c9));
                this.f18683i = null;
                z(objY);
            } catch (Throwable th) {
                try {
                    AbstractC2400bo0.a(th);
                    zzd(th);
                } finally {
                    this.f18683i = null;
                }
            }
        } catch (Error e8) {
            zzd(e8);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e9) {
            zzd(e9.getCause());
        } catch (Exception e10) {
            zzd(e10);
        }
    }

    abstract Object y(Object obj, Object obj2);

    abstract void z(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        String str;
        com.google.common.util.concurrent.C c9 = this.f18682h;
        Object obj = this.f18683i;
        String strZza = super.zza();
        if (c9 != null) {
            str = "inputFuture=[" + c9.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }
}
