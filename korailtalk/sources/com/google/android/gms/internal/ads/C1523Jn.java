package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1523Jn {

    /* renamed from: b, reason: collision with root package name */
    private static C1523Jn f13693b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f13694a = new AtomicBoolean(false);

    C1523Jn() {
    }

    public static C1523Jn zza() {
        if (f13693b == null) {
            f13693b = new C1523Jn();
        }
        return f13693b;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.f13694a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.In
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                AbstractC4439th.zza(context2);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzau)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzai)).booleanValue());
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzap)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((InterfaceC2189Zw) L1.r.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new L1.p() { // from class: com.google.android.gms.internal.ads.Hn
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // L1.p
                        public final Object zza(Object obj) {
                            return AbstractBinderC2148Yw.zzb(obj);
                        }
                    })).zze(r2.b.wrap(context2), new BinderC1400Gn(D2.a.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (L1.q | RemoteException | NullPointerException e8) {
                    L1.n.zzl("#007 Could not call remote method.", e8);
                }
            }
        });
        thread.start();
        return thread;
    }
}
