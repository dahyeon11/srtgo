package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.Hm0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC1440Hm0 extends AbstractC5022yn0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.C f13358h;

    /* renamed from: i, reason: collision with root package name */
    Class f13359i;

    /* renamed from: j, reason: collision with root package name */
    Object f13360j;

    AbstractRunnableC1440Hm0(com.google.common.util.concurrent.C c9, Class cls, Object obj) {
        c9.getClass();
        this.f13358h = c9;
        this.f13359i = cls;
        this.f13360j = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        p(this.f13358h);
        this.f13358h = null;
        this.f13359i = null;
        this.f13360j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.C c9 = this.f13358h;
        Class cls = this.f13359i;
        Object obj = this.f13360j;
        if (((obj == null) || ((c9 == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f13358h = null;
        try {
            th = c9 instanceof AbstractC3657mo0 ? ((AbstractC3657mo0) c9).a() : null;
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(c9.getClass()) + " threw " + String.valueOf(e8.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objZzp = th == null ? AbstractC1483In0.zzp(c9) : null;
        if (th == null) {
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            q(c9);
            return;
        }
        try {
            Object objY = y(obj, th);
            this.f13359i = null;
            this.f13360j = null;
            z(objY);
        } catch (Throwable th2) {
            try {
                AbstractC2400bo0.a(th2);
                zzd(th2);
            } finally {
                this.f13359i = null;
                this.f13360j = null;
            }
        }
    }

    abstract Object y(Object obj, Throwable th);

    abstract void z(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        String str;
        com.google.common.util.concurrent.C c9 = this.f13358h;
        Class cls = this.f13359i;
        Object obj = this.f13360j;
        String strZza = super.zza();
        if (c9 != null) {
            str = "inputFuture=[" + c9.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }
}
